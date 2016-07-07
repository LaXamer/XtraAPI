/**
 * This file is part of XtraAPI, licensed under the MIT License (MIT).
 *
 * Copyright (c) 2016 - 2016 XtraStudio <https://github.com/XtraStudio>
 * Copyright (c) Contributors
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package com.xtra.api.text;

import java.util.Collection;

import javax.annotation.Nullable;

import org.spongepowered.api.service.pagination.PaginationList;
import org.spongepowered.api.text.Text;
import org.spongepowered.api.text.channel.MessageReceiver;
import org.spongepowered.api.text.format.TextColor;

import com.xtra.api.command.Command;
import com.xtra.api.plugin.XtraCorePluginContainer;

/**
 * The help pagination manager for a {@link XtraCorePluginContainer}. The help
 * pagination handler automatically fetches all registered {@link Command}s
 * within a plugin and brings them together to produce a proper help list.
 * 
 * <p>An example of an entry to the help list would be similar to this:</p>
 * 
 * <code>/my-command [usage] - My command description</code>
 */
public interface HelpPaginationHandler {

    /**
     * Gets the built pagination list associated with this handler.
     * 
     * @return The pagination list
     */
    default PaginationList getList() {
        return this.getPaginationBuilder().build();
    }

    /**
     * Sends the pagination list to a message receiver.
     * 
     * @param receiver The receiver of the list
     */
    default void sendList(MessageReceiver receiver) {
        this.getPaginationBuilder().sendTo(receiver);
    }

    /**
     * Gets the command color for this handler.
     * 
     * @return The command color
     */
    TextColor getCommandColor();

    /**
     * Gets the description color for this handler.
     * 
     * @return The description color
     */
    TextColor getDescriptionColor();

    /**
     * Gets the {@link Command}s that were used in the pagination list.
     * 
     * @return The commands used in the pagination list
     */
    Collection<Command> getCommands();

    /**
     * Gets the {@link Command}s that were ignored from the pagination list.
     * 
     * @return The ignored commands from the pagination list
     */
    Collection<Class<? extends Command>> getIgnoredCommands();

    /**
     * Gets the {@link Text} contents of the pagination list.
     * 
     * @return The text contents of the pagination list
     */
    Collection<Text> getContents();

    /**
     * Gets the pagination list builder for this handler if further
     * customization is necessary.
     * 
     * @return The pagination list builder
     */
    PaginationList.Builder getPaginationBuilder();

    public interface Builder {

        /**
         * Sets the command color for this pagination list.
         * 
         * @param color The command color
         * @return The builder
         */
        Builder commandColor(TextColor color);

        /**
         * Sets the description color for this pagination list.
         * 
         * @param color The description color
         * @return The builder
         */
        Builder descriptionColor(TextColor color);

        /**
         * Sets any {@link Command}s to be ignored by this pagination list. Any
         * commands specified here will not be in the final pagination list.
         * 
         * @param commands The commands to ignore
         * @return The builder
         */
        @SuppressWarnings("unchecked")
        Builder ignoreCommands(Class<? extends Command>... commands);

        /**
         * Sets the {@link ChildBehavior} of the pagination list.
         * 
         * @param behavior The child behavior
         * @return The builder
         */
        Builder childBehavior(@Nullable ChildBehavior behavior);

        /**
         * Sets the {@link CommandOrdering} of the pagination list.
         * 
         * @param ordering The command ordering
         * @return The builder
         */
        Builder commandOrdering(@Nullable CommandOrdering ordering);

        /**
         * Builds the help pagination list.
         * 
         * @return The help pagination handler
         */
        HelpPaginationHandler build();
    }

    /**
     * How the pagination list should treat child commands when registering
     * commands to the help list.
     */
    public enum ChildBehavior {

        /** If child commands should be ignored in the help list. */
        IGNORE_CHILD,

        /** If parent commands should be ignored in the help list. */
        IGNORE_PARENT,

        /** If both should exist in the help list. */
        BOTH;
    }

    /**
     * How commands should be ordered in the help list.
     */
    public enum CommandOrdering {

        /** Commands will be ordered alphabetically (a-z) in the help list. */
        A_Z,

        /**
         * Commands will be ordered alphabetically backwards (z-a) in the help
         * list.
         */
        Z_A,

        /**
         * Commands will be ordered with parent commands coming first and then
         * ordered alphabetically (a-z) in the help list.
         */
        PARENT_COMMANDS_FIRST_A_Z,

        /**
         * Commands will be ordered with parent commands coming first and then
         * ordered alphabetically backwards (z-a) in the help list.
         */
        PARENT_COMMANDS_FIRST_Z_A,

        /**
         * Commands will be ordered with child commands coming first and then
         * ordered alphabetically (a-z) in the help list.
         */
        CHILD_COMMANDS_FIRST_A_Z,

        /**
         * Commands will be ordered with child commands coming first and then
         * ordered alphabetically backwards (z-a) in the help list.
         */
        CHILD_COMMANDS_FIRST_Z_A,

        /**
         * The parent and their child commands will be grouped together first,
         * followed by other parent commands and their children. At the end is
         * an alphabetically sorted (a-z) list of non-parent and non-child
         * commands.
         */
        PARENT_AND_CHILD_FIRST_NON_LAST_A_Z,

        /**
         * The parent and their child commands will be grouped together first,
         * followed by other parent commands and their children. At the end is
         * an alphabetically backwards sorted (z-a) list of non-parent and
         * non-child commands.
         */
        PARENT_AND_CHILD_FIRST_NON_LAST_Z_A,

        /**
         * Commands will be ordered by how the reflection scanner reads them.
         * Note that this ordering might not be the same every time the commands
         * are read.
         */
        DEFAULT;
    }
}

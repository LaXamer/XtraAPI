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

package com.xtra.api.command;

import java.util.Collection;
import java.util.Optional;

import com.xtra.api.Core;
import com.xtra.api.command.runnable.CommandRunnableHandler;
import com.xtra.api.command.state.CommandStateHandler;
import com.xtra.api.plugin.XtraCorePluginContainer;

/**
 * A 'handler' for commands. Each {@link XtraCorePluginContainer} is assigned a
 * CommandHandler upon calling {@link Core#createCommandHandler(Class)}.
 */
public interface CommandHandler {

    /**
     * Gets the command object for the specified class.
     * 
     * @param clazz The command class
     * @return The command object, or {@link Optional#empty()} if the command
     *         could not be found
     */
    Optional<Command> getCommand(Class<? extends Command> clazz);

    /**
     * Gets a collection of all commands for this particular command handler.
     * 
     * @return All of the commands for this command handler
     */
    Collection<Command> getCommands();

    /**
     * Gets the associated {@link CommandRunnableHandler}.
     * 
     * @return The command runnable handler
     */
    CommandRunnableHandler getCommandRunnableHandler();

    /**
     * Gets the associated {@link CommandStateHandler}.
     * 
     * @return The command state handler
     */
    CommandStateHandler getCommandStateHandler();
}

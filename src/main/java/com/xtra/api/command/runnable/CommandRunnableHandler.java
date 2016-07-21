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

package com.xtra.api.command.runnable;

import com.xtra.api.command.Command;
import com.xtra.api.command.CommandHandler;
import com.xtra.api.plugin.XtraCorePluginContainer;

/**
 * A handler for {@link CommandRunnable}s. This may be used for adding or
 * removing any {@link CommandRunnable}s. Note that this handler is created
 * along with a {@link CommandHandler}, and thusly any
 * {@link XtraCorePluginContainer} that has a {@link CommandHandler}, also has a
 * corresponding runnable handler.
 */
public interface CommandRunnableHandler {

    /**
     * Adds the specified {@link CommandRunnable} to be ran with the specified
     * classes.
     * 
     * @param runnable The runnable to run with the specified classes
     * @param classes The classes to run the command runnable on
     */
    @SuppressWarnings("unchecked")
    void add(CommandRunnable runnable, Class<? extends Command>... classes);

    /**
     * Adds this specified {@link CommandRunnable} to be ran for all commands of
     * a {@link CommandHandler}.
     * 
     * @param runnable The runnable to run for all commands of the command
     *        handler
     */
    void addForAllCommands(CommandRunnable runnable);

    /**
     * Adds the {@link CommandRunnable} to be ran for all commands of a
     * {@link CommandHandler} except for the specified classes.
     * 
     * @param runnable The runnable to run
     * @param classes The classes to not run this runnable on
     */
    @SuppressWarnings("unchecked")
    void addForAllCommandsExcept(CommandRunnable runnable, Class<? extends Command>... classes);

    /**
     * Checks if the specified command class has any corresponding
     * {@link CommandRunnable}s.
     * 
     * @param clazz The class to check
     * @return If the class has any corresponding command runnables
     */
    boolean doesCommandHaveRunnable(Class<? extends Command> clazz);

    /**
     * Removes all {@link CommandRunnable}s from the specified class.
     * 
     * @param clazz The class to remove runnables from
     */
    void removeRunnables(Class<? extends Command> clazz);
}

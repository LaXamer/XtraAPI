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

package com.xtra.api.command.annotation;

import java.util.Optional;

import com.xtra.api.command.Command;

/**
 * A helper class that gets information from any command annotations.
 */
public interface CommandAnnotationHelper {

    /**
     * Returns if the command is an async command.
     * 
     * @param clazz The command class to check
     * @return If the command is async
     */
    boolean isAsync(Class<? extends Command> clazz);

    /**
     * Returns if this command has a parent command.
     * 
     * @param clazz The command class to check
     * @return If the command has a parent command
     */
    boolean hasParent(Class<? extends Command> clazz);

    /**
     * Gets the parent command of the specified command.
     * 
     * @param clazz The command class to check
     * @return The parent command or {@link Optional#empty()} if the specified
     *         command does not have a parent command
     */
    Optional<Class<? extends Command>> getParent(Class<? extends Command> clazz);

    /**
     * Gets the parent command object of the specified command.
     * 
     * @param clazz The command class to check
     * @return The parent command object or {@link Optional#empty()} if the
     *         specified command does not have a parent command, or if the
     *         parent command could not be found.
     */
    Optional<Command> getParentObject(Class<? extends Command> clazz);
}

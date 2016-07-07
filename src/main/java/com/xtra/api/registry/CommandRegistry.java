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

package com.xtra.api.registry;

import java.util.Collection;
import java.util.Map;
import java.util.Optional;

import com.xtra.api.command.Command;
import com.xtra.api.plugin.XtraCorePluginContainer;

/**
 * The global registry for {@link Command}s. All {@link Command}s are registered
 * through here.
 */
public interface CommandRegistry {

    /**
     * Gets the specified {@link Command} from the global command registry.
     * 
     * @param clazz The class of the command to get
     * @return The command object, or {@link Optional#empty()} if the command
     *         could not be found
     */
    Optional<Command> getCommand(Class<? extends Command> clazz);

    /**
     * Gets a mapping entry of the specified {@link Command} object and its
     * corresponding {@link XtraCorePluginContainer}.
     * 
     * @param clazz The class of the command to get
     * @return The command and container mapping entry, or
     *         {@link Optional#empty()} if the command could not be found
     */
    Optional<Map.Entry<Command, XtraCorePluginContainer>> getEntry(Class<? extends Command> clazz);

    /**
     * Gets a collection of all of the registered commands.
     * 
     * @return A collection of the commands
     */
    Collection<Command> getAllCommands();

    /**
     * Gets a mapping of all of the registered commands and their
     * {@link XtraCorePluginContainer}s.
     * 
     * @return A mapping of all of the commands and their containers
     */
    Map<Command, XtraCorePluginContainer> getAllCommandMappings();
}

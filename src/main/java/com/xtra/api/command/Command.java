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

import javax.annotation.Nullable;

import org.spongepowered.api.command.args.CommandElement;
import org.spongepowered.api.command.spec.CommandExecutor;

/**
 * Specifies a 'Command' within XtraAPI. A command in XtraAPI contains one or
 * more aliases, a permission, a description, arguments, and the usage of those
 * arguments. Note that the return type for several of these methods may be
 * 'null'. If 'null' is specified, then that function will not be used.
 * 
 * <p>Please read each of the individual method's JavaDocs for more
 * information.</p>
 */
public interface Command extends CommandExecutor {

    /**
     * The aliases for the command. The first alias specified becomes the
     * primary alias, and is used for other various things, such as in the help
     * list.
     * 
     * <p>The aliases need to be passed in as an array. This can be as simple
     * as:</p>
     * 
     * <code>new String[] {"my-command", "mycommand"}</code>
     * 
     * @return The command aliases
     */
    String[] aliases();

    /**
     * The permission to execute the command.
     * 
     * <p>Specify null if your command does not have a permission.</p>
     * 
     * @return The permission for the command
     */
    @Nullable String permission();

    /**
     * The description of the command. Text formatting for the description is
     * handled automatically.
     * 
     * <p>Specify null if your command does not have a description.</p>
     * 
     * @return The command description
     */
    @Nullable String description();

    /**
     * The arguments for the command.
     * 
     * <p>The arguments need to be passed in as a array. An example would be
     * this:</p>
     * 
     * <code>new CommandElement[] {GenericArguments...}</code>
     * 
     * <p>Specify null or an empty array if your command does not have any
     * arguments.</p>
     * 
     * @return The command arguments
     */
    @Nullable CommandElement[] args();

    /**
     * The usage for the command. The 'usage' for a command is simply a text
     * format of the specified arguments for your command. For example, if your
     * command takes in a String 'name' argument, you may specify <code>return
     * "&lt;name&gt;";</code> for this method. In the help list, this will show
     * as:
     * 
     * <p><code>/my-command &lt;name&gt; - My description</code></p>
     * 
     * <p>If the argument is optional, it is recommended to use brackets
     * instead:</p>
     * 
     * <p><code>/my-command [name] - My description</code></p>
     * 
     * @return The command usage
     */
    @Nullable String usage();
}

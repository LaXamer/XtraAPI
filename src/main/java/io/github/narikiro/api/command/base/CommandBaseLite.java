/**
 * This file is part of XtraAPI, licensed under the MIT License (MIT).
 *
 * Copyright (c) 2016 - 2018 LaXamer <https://github.com/LaXamer>
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

package io.github.narikiro.api.command.base;

import io.github.narikiro.api.command.Command;
import io.github.narikiro.api.util.command.CommandBaseLiteExecutor;
import org.spongepowered.api.command.CommandException;
import org.spongepowered.api.command.CommandResult;
import org.spongepowered.api.command.CommandSource;
import org.spongepowered.api.command.args.CommandContext;

/**
 * A 'lite' version of {@link CommandBase}, without all of the extra logic. It
 * is recommended to use {@link CommandBase} over this, as many extra features
 * provided through XtraCore are unavailable here.
 * 
 * <p>Note that child commands and asynchronous commands will still function
 * correctly with this.</p>
 */
public abstract class CommandBaseLite implements Command {

    // NOTE: this is overridden by the implementation
    private static CommandBaseLiteExecutor BASE = null;

    // We need this method so we can add a 'throws Exception'. Also to stay
    // consistent with CommandBase.
    public abstract CommandResult executeCommand(CommandSource src, CommandContext args) throws Exception;

    public CommandResult execute(CommandSource src, CommandContext args) throws CommandException {
        return BASE.execute(this, src, args);
    }
}

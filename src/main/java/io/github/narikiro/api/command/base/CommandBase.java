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
import io.github.narikiro.api.util.command.CommandBaseExecutor;
import org.spongepowered.api.command.CommandException;
import org.spongepowered.api.command.CommandResult;
import org.spongepowered.api.command.CommandSource;
import org.spongepowered.api.command.args.CommandContext;

import java.lang.reflect.ParameterizedType;

/**
 * Provides a base for commands. Support for many XtraCore command features are
 * provided through this default implementation. It is recommended to use this
 * base class, over implementing your own {@link Command} or using
 * {@link CommandBaseLite}.
 * 
 * @param <T> The {@link CommandSource} required to execute this command. If a
 *        {@link CommandSource} not of the same type as the one specified in
 *        this generic attempts to execute this command, they will receive an
 *        error message. Note that if you wish for any {@link CommandSource} to
 *        execute this command, specify <code>CommandSource</code> in the
 *        generic.
 */
public abstract class CommandBase<T extends CommandSource> implements Command {

    // NOTE: this is overridden by the implementation
    private static CommandBaseExecutor BASE = null;

    public abstract CommandResult executeCommand(T src, CommandContext args) throws Exception;

    public CommandResult execute(CommandSource src, CommandContext args) throws CommandException {
        // Get the generic type
        @SuppressWarnings("rawtypes")
        Class<?> o = ((Class) ((ParameterizedType) getClass()
                .getGenericSuperclass()).getActualTypeArguments()[0]);
        // Let the implementation handle the rest of the logic
        return BASE.execute(this, o, src, args);
    }
}

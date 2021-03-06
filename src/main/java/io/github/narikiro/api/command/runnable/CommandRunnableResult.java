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

package io.github.narikiro.api.command.runnable;

import io.github.narikiro.api.command.Command;
import org.spongepowered.api.command.CommandResult;

/**
 * The result of running a {@link CommandRunnable}. There are two main return
 * types, {@link CommandRunnableResult#keepRunning()} and
 * {@link CommandRunnableResult#stop()}. See the JavaDocs of those methods for
 * more information.
 */
public class CommandRunnableResult {

    private CommandResult result;

    private CommandRunnableResult() {
    }

    private CommandRunnableResult(CommandResult result) {
        this.result = result;
    }

    /**
     * Indicates the the {@link Command} should keep running after the
     * {@link CommandRunnable} has finished execution.
     * 
     * @return The command runnable result
     */
    public static CommandRunnableResult keepRunning() {
        return new CommandRunnableResult();
    }

    /**
     * Indicates that the {@link Command} should be stopped and should no longer
     * continue execution. The {@link CommandResult} defaults to
     * {@link CommandResult#empty()}.
     * 
     * @return The command runnable result
     */
    public static CommandRunnableResult stop() {
        return new CommandRunnableResult(CommandResult.empty());
    }

    /**
     * Indicates that the {@link Command} should be stopped and should no longer
     * continue execution.
     * 
     * @param result The command result to return for the command
     * @return The command runnable result
     */
    public static CommandRunnableResult stop(CommandResult result) {
        return new CommandRunnableResult(result);
    }

    public CommandResult getResult() {
        return result;
    }
}

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

package com.xtra.api.logger;

public interface Logger {

    /**
     * Logs a message at {@link Level#INFO}.
     * 
     * @param message The message to log
     */
    default void log(String message) {
        log(Level.INFO, message);
    }

    /**
     * Throws an error at {@link Level#ERROR}.
     * 
     * @param cause The error
     */
    default void log(Throwable cause) {
        log(Level.ERROR, cause);
    }

    /**
     * Logs a message at the specified {@link Level}.
     * 
     * @param level The level to log at
     * @param message The message to log
     */
    void log(Level level, String message);

    /**
     * Throws an error at the specified {@link Level}.
     * 
     * @param level The level to log at
     * @param cause The error to log
     */
    void log(Level level, Throwable cause);

    public enum Level {
        INFO, WARNING, ERROR;
    }
}

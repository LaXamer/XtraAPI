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

package io.github.narikiro.api.logger;

import java.util.Optional;

import io.github.narikiro.api.plugin.XtraCorePluginContainer;
import org.slf4j.Logger;

/**
 * XtraCore automatically creates plugin-unique Log4j2-backed slf4j loggers.
 * Each logger follows a XtraCore-PLUGINNAME format. So for a plugin with the
 * name 'MyPlugin', it will own a logger by the name of 'XtraCore-MyPlugin'.
 * 
 * <p>All {@link XtraCorePluginContainer}s have corresponding loggers. This
 * interface is simply provided to serve as a convenience for fetching these
 * loggers.</p>
 */
public interface LoggerHandler {

    /**
     * Gets a {@link Logger} for the specified class.
     * 
     * @param clazz The class to get the logger for
     * @return The logger
     */
    Optional<Logger> getLogger(Class<?> clazz);
}

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

package io.github.narikiro.api;

import io.github.narikiro.api.command.CommandHandler;
import io.github.narikiro.api.command.annotation.CommandAnnotationHelper;
import io.github.narikiro.api.config.ConfigHandler;
import io.github.narikiro.api.config.annotation.ConfigAnnotationHelper;
import io.github.narikiro.api.listener.ListenerHandler;
import io.github.narikiro.api.logger.LoggerHandler;
import io.github.narikiro.api.plugin.XtraCorePluginHandler;
import io.github.narikiro.api.registry.CommandRegistry;
import io.github.narikiro.api.registry.ConfigRegistry;
import io.github.narikiro.api.text.HelpPaginationHandler;

import java.util.Optional;

/**
 * @see Core
 */
public interface ICore {

    Optional<CommandHandler> getCommandHandler(Class<?> clazz);

    Optional<ConfigHandler> getConfigHandler(Class<?> clazz);

    Optional<ListenerHandler> getListenerHandler(Class<?> clazz);

    HelpPaginationHandler.Builder createHelpPaginationBuilder(Class<?> clazz);

    Optional<HelpPaginationHandler> getHelpPaginationHandler(Class<?> clazz);

    CommandAnnotationHelper getCommandAnnotationHelper();

    ConfigAnnotationHelper getConfigAnnotationHelper();

    XtraCorePluginHandler getPluginHandler();

    CommandRegistry getCommandRegistry();

    ConfigRegistry getConfigRegistry();

    LoggerHandler getLoggerHandler();

    String getVersion();
}

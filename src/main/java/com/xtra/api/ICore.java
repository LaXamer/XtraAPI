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

package com.xtra.api;

import java.util.Optional;

import com.xtra.api.ban.BanHandler;
import com.xtra.api.command.CommandHandler;
import com.xtra.api.command.annotation.CommandAnnotationHelper;
import com.xtra.api.config.ConfigHandler;
import com.xtra.api.entity.EntityHandler;
import com.xtra.api.listener.ListenerHandler;
import com.xtra.api.logger.LogHandler;
import com.xtra.api.plugin.XtraCorePluginContainer;
import com.xtra.api.plugin.XtraCorePluginHandler;
import com.xtra.api.registry.CommandRegistry;
import com.xtra.api.registry.ConfigRegistry;
import com.xtra.api.text.HelpPaginationHandler;
import com.xtra.api.world.direction.DirectionHandler;

/**
 * @see Core
 */
public interface ICore {

    XtraCorePluginContainer initialize(Object plugin);

    CommandHandler createCommandHandler(Class<?> clazz);

    Optional<CommandHandler> getCommandHandler(Class<?> clazz);

    ConfigHandler createConfigHandler(Class<?> clazz);

    Optional<ConfigHandler> getConfigHandler(Class<?> clazz);

    ListenerHandler createListenerHandler(Class<?> clazz);

    Optional<ListenerHandler> getListenerHandler(Class<?> clazz);

    HelpPaginationHandler.Builder createHelpPaginationBuilder(Object plugin);

    Optional<HelpPaginationHandler> getHelpPaginationHandler(Class<?> clazz);

    BanHandler getBanHandler();

    CommandAnnotationHelper getCommandAnnotationHelper();

    EntityHandler getEntityHandler();

    LogHandler getLogHandler();

    XtraCorePluginHandler getPluginHandler();

    CommandRegistry getCommandRegistry();

    ConfigRegistry getConfigRegistry();

    DirectionHandler getDirectionHandler();
}

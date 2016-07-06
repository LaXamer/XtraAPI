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
import com.xtra.api.plugin.XtraCorePluginHandler;
import com.xtra.api.registry.CommandRegistry;
import com.xtra.api.registry.ConfigRegistry;
import com.xtra.api.text.HelpPaginationHandler;
import com.xtra.api.world.direction.DirectionHandler;

/**
 * A core class for accessing various parts of the API.
 */
@SuppressWarnings("static-access")
public class Core {

    // Set by the implementation
    private static final Core CORE = null;

    /**
     * Gets the {@link CommandHandler} for the specified plugin object. If a
     * command handler does not exist for the specified pluin object, one will
     * be created.
     * 
     * @param plugin The plugin object
     * @return The command handler for the plugin
     */
    public static CommandHandler provideCommandHandler(Object plugin) {
        return CORE.provideCommandHandler(plugin);
    }

    /**
     * Gets the {@link CommandHandler} for the specified plugin class.
     * 
     * @param clazz The plugin class
     * @return {@link Optional#empty()} if the plugin class could not be found,
     *         or if a command handler does not exist for the provided class
     */
    public static Optional<CommandHandler> provideCommandHandler(Class<?> clazz) {
        return CORE.provideCommandHandler(clazz);
    }

    /**
     * Gets the {@link ConfigHandler} for the specified plugin object. If one
     * does not exist, one will be created.
     * 
     * @param plugin The plugin object
     * @return The config handler for the plugin
     */
    public static ConfigHandler provideConfigHandler(Object plugin) {
        return CORE.provideConfigHandler(plugin);
    }

    /**
     * Gets the {@link ConfigHandler} for the specified plugin class.
     * 
     * @param clazz The plugin class
     * @return {@link Optional#empty()} if the plugin class could not be found,
     *         or if a config handler does not exist for the provided class
     */
    public static Optional<ConfigHandler> provideConfigHandler(Class<?> clazz) {
        return CORE.provideConfigHandler(clazz);
    }

    /**
     * Gets the {@link ListenerHandler} for the specified plugin object. If one
     * does not exist, one will be created.
     * 
     * @param plugin The plugin object
     * @return The listener handler for the plugin
     */
    public static ListenerHandler provideListenerHandler(Object plugin) {
        return CORE.provideListenerHandler(plugin);
    }

    /**
     * Gets the {@link ListenerHandler} for the specified plugin class.
     * 
     * @param clazz The plugin class
     * @return {@link Optional#empty()} if the plugin class could not be found,
     *         or if a listener handler does not exist for the provided class
     */
    public static Optional<ListenerHandler> provideListenerHandler(Class<?> clazz) {
        return CORE.provideListenerHandler(clazz);
    }

    /**
     * Creates a {@link HelpPaginationHandler.Builder} for creating help
     * pagination lists.
     * 
     * @param plugin The plugin object
     * @return The help pagination builder
     */
    public static HelpPaginationHandler.Builder createHelpPaginationBuilder(Object plugin) {
        return CORE.createHelpPaginationBuilder(plugin);
    }

    /**
     * Gets the {@link HelpPaginationHandler} for the specified plugin class.
     * 
     * @param clazz The plugin class
     * @return {@link Optional#empty()} if the plugin class could not be found,
     *         or if a help pagination handler does not exist for the provided
     *         class
     */
    public static Optional<HelpPaginationHandler> getHelpPaginationHandler(Class<?> clazz) {
        return CORE.getHelpPaginationHandler(clazz);
    }

    /**
     * Gets the {@link BanHandler}.
     * 
     * @return The ban handler
     */
    public static BanHandler getBanHandler() {
        return CORE.getBanHandler();
    }

    /**
     * Gets the {@link CommandAnnotationHelper}.
     * 
     * @return The command annotation helper
     */
    public static CommandAnnotationHelper getCommandAnnotationHelper() {
        return CORE.getCommandAnnotationHelper();
    }

    /**
     * Gets the {@link EntityHandler}.
     * 
     * @return The entity handler
     */
    public static EntityHandler getEntityHandler() {
        return CORE.getEntityHandler();
    }

    /**
     * Gets the {@link XtraCorePluginHandler}.
     * 
     * @return The plugin handler
     */
    public static XtraCorePluginHandler getPluginHandler() {
        return CORE.getPluginHandler();
    }

    /**
     * Gets the {@link CommandRegistry}.
     * 
     * @return The command registry
     */
    public static CommandRegistry getCommandRegistry() {
        return CORE.getCommandRegistry();
    }

    /**
     * Gets the {@link ConfigRegistry}.
     * 
     * @return The config registry
     */
    public static ConfigRegistry getConfigRegistry() {
        return CORE.getConfigRegistry();
    }

    /**
     * Gets the {@link DirectionHandler}.
     * 
     * @return The direction handler
     */
    public static DirectionHandler getDirectionHandler() {
        return CORE.getDirectionHandler();
    }
}

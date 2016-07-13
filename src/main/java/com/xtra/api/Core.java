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
 * A core class for accessing various parts of the API.
 */
public class Core {

    // Set by the implementation
    private static ICore CORE = null;

    /**
     * Initializes a plugin for use by XtraCore. This method needs to be called
     * before any others.
     * 
     * @param plugin The plugin object
     * @return The new xtracore plugin container
     */
    public static XtraCorePluginContainer initialize(Object plugin) {
        return CORE.initialize(plugin);
    }

    /**
     * Creates a {@link CommandHandler} for the specified plugin class. Note
     * that if a {@link CommandHandler} already exists for the specified plugin
     * class, the pre-existing {@link CommandHandler} will be returned instead.
     * 
     * @param clazz The plugin class
     * @return The command handler for the plugin
     */
    public static CommandHandler createCommandHandler(Class<?> clazz) {
        return CORE.createCommandHandler(clazz);
    }

    /**
     * Gets the {@link CommandHandler} for the specified plugin class.
     * 
     * @param clazz The plugin class
     * @return {@link Optional#empty()} if the plugin class could not be found,
     *         or if a command handler does not exist for the provided class
     */
    public static Optional<CommandHandler> getCommandHandler(Class<?> clazz) {
        return CORE.getCommandHandler(clazz);
    }

    /**
     * Creates a {@link ConfigHandler} for the specified plugin class. Note that
     * if a {@link ConfigHandler} already exists for the specified plugin class,
     * the pre-existing {@link ConfigHandler} will be returned instead.
     * 
     * @param clazz The plugin class
     * @return The config handler for the plugin
     */
    public static ConfigHandler createConfigHandler(Class<?> clazz) {
        return CORE.createConfigHandler(clazz);
    }

    /**
     * Gets the {@link ConfigHandler} for the specified plugin class.
     * 
     * @param clazz The plugin class
     * @return {@link Optional#empty()} if the plugin class could not be found,
     *         or if a config handler does not exist for the provided class
     */
    public static Optional<ConfigHandler> getConfigHandler(Class<?> clazz) {
        return CORE.getConfigHandler(clazz);
    }

    /**
     * Creates a {@link ListenerHandler} for the specified plugin class. Note
     * that if a {@link ListenerHandler} already exists for the specified plugin
     * class, the pre-existing {@link ListenerHandler} will be returned instead.
     * 
     * @param clazz The plugin class
     * @return The listener handler for the plugin
     */
    public static ListenerHandler createListenerHandler(Class<?> clazz) {
        return CORE.createListenerHandler(clazz);
    }

    /**
     * Gets the {@link ListenerHandler} for the specified plugin class.
     * 
     * @param clazz The plugin class
     * @return {@link Optional#empty()} if the plugin class could not be found,
     *         or if a listener handler does not exist for the provided class
     */
    public static Optional<ListenerHandler> getListenerHandler(Class<?> clazz) {
        return CORE.getListenerHandler(clazz);
    }

    /**
     * Creates a {@link HelpPaginationHandler.Builder} for creating help
     * pagination lists.
     * 
     * @param clazz The plugin class
     * @return The help pagination builder
     */
    public static HelpPaginationHandler.Builder createHelpPaginationBuilder(Class<?> clazz) {
        return CORE.createHelpPaginationBuilder(clazz);
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
     * Gets the {@link LogHandler}.
     * 
     * @return The log handler
     */
    public static LogHandler getLogHandler() {
        return CORE.getLogHandler();
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

    /**
     * Gets the current XtraAPI version.
     * 
     * @return The version
     */
    public static String getVersion() {
        return CORE.getVersion();
    }
}

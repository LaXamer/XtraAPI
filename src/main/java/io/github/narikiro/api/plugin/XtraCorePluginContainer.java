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

package io.github.narikiro.api.plugin;

import java.util.Optional;

import org.slf4j.Logger;
import org.spongepowered.api.plugin.PluginContainer;
import io.github.narikiro.api.command.CommandHandler;
import io.github.narikiro.api.config.ConfigHandler;
import io.github.narikiro.api.listener.ListenerHandler;
import io.github.narikiro.api.text.HelpPaginationHandler;

/**
 * A container that holds various things that correspond to a single plugin
 * utilizing XtraCore.
 */
public interface XtraCorePluginContainer {

    /**
     * Gets the plugin's object.
     * 
     * @return The plugin object
     */
    Object getPlugin();

    /**
     * Gets the plugin's {@link PluginContainer}.
     * 
     * @return The plugin's plugin container
     */
    PluginContainer getPluginContainer();

    /**
     * Gets this plugin's {@link Logger}.
     * 
     * @return The plugin's logger
     */
    Logger getLogger();

    /**
     * Gets the plugin's {@link CommandHandler}.
     * 
     * @return The plugin's command handler, or {@link Optional#empty()} if the
     *         plugin does not have one
     */
    Optional<CommandHandler> getCommandHandler();

    /**
     * Gets the plugin's {@link ConfigHandler}.
     * 
     * @return The plugin's config handler, or {@link Optional#empty()} if the
     *         plugin does not have one
     */
    Optional<ConfigHandler> getConfigHandler();

    /**
     * Gets the plugin's {@link ListenerHandler}.
     * 
     * @return The plugin's listener handler, or {@link Optional#empty()} if the
     *         plugin does not have one
     */
    Optional<ListenerHandler> getListenerHandler();

    /**
     * Gets the plugin's {@link HelpPaginationHandler}.
     * 
     * @return The plugin's help pagnation handler, or {@link Optional#empty()}
     *         if the plugin does not have one
     */
    Optional<HelpPaginationHandler> getHelpPaginationHandler();
}

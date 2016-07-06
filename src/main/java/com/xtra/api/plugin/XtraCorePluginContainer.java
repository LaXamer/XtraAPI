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

package com.xtra.api.plugin;

import org.spongepowered.api.plugin.PluginContainer;

import com.xtra.api.command.CommandHandler;
import com.xtra.api.config.ConfigHandler;
import com.xtra.api.logger.Logger;
import com.xtra.api.text.HelpPaginationHandler;

public interface XtraCorePluginContainer {

    /**
     * Gets the plugin's object.
     * 
     * @return The plugin object
     */
    Object getPlugin();

    /**
     * Gets the plugin's container.
     * 
     * @return The plugin's container
     */
    PluginContainer getPluginContainer();

    /**
     * Gets this plugin's logger.
     * 
     * @return The plugin's logger
     */
    Logger getLogger();

    /**
     * Gets the plugin's command handler.
     * 
     * @return The plugin's command handler
     */
    CommandHandler getCommandHandler();

    /**
     * Gets the plugin's config handler.
     * 
     * @return The plugin's config handler
     */
    ConfigHandler getConfigHandler();

    /**
     * Gets the plugin's help pagination handler.
     * 
     * @return The plugin's help pagnation handler
     */
    HelpPaginationHandler getHelpPaginationHandler();
}

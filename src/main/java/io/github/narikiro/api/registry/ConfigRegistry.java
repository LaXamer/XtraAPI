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

package io.github.narikiro.api.registry;

import java.util.Collection;
import java.util.Map;
import java.util.Optional;

import io.github.narikiro.api.config.Config;
import io.github.narikiro.api.config.ConfigHandler;
import io.github.narikiro.api.plugin.XtraCorePluginContainer;

/**
 * The global registry for {@link Config}s. All {@link Config}s are registered
 * through here.
 */
public interface ConfigRegistry {

    /**
     * Gets the specified config from the global config registry.
     * 
     * @param clazz The class of the config to get
     * @return The config object, or {@link Optional#empty()} if the config
     *         could not be found
     */
    Optional<Config> getConfig(Class<? extends Config> clazz);

    /**
     * Gets the config for the specified config name from the global config
     * registry.
     * 
     * @param configName The name of the config to get
     * @return The config object, or {@link Optional#empty()} if the config
     *         could not be found
     * @see ConfigHandler#getConfig(String)
     */
    Optional<Config> getConfig(String configName);

    /**
     * Gets a mapping entry of the specified config and its
     * {@link XtraCorePluginContainer}.
     * 
     * @param clazz The class of the config to get
     * @return The config and container mapping entry, or
     *         {@link Optional#empty()} if the config could not be found
     */
    Optional<Map.Entry<Config, XtraCorePluginContainer>> getEntry(Class<? extends Config> clazz);

    /**
     * Gets a mapping entry of the specified config and its
     * {@link XtraCorePluginContainer} for the specified config name from the
     * global config registry.
     * 
     * @param configName The name of the config to get
     * @return The config object, or {@link Optional#empty()} if the config
     *         could not be found
     * @see ConfigHandler#getConfig(String)
     */
    Optional<Map.Entry<Config, XtraCorePluginContainer>> getEntry(String configName);

    /**
     * Gets a collection of all of the registered configs.
     * 
     * @return A collection of the configs
     */
    Collection<Config> getAllConfigs();

    /**
     * Gets a mapping of all of the registered configs and their
     * {@link XtraCorePluginContainer}s.
     * 
     * @return A mapping of all of the configs and their containers
     */
    Map<Config, XtraCorePluginContainer> getAllConfigMappings();
}

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

package com.xtra.api.config;

import java.util.Collection;
import java.util.Optional;

import com.xtra.api.plugin.XtraCorePluginContainer;

/**
 * A handler that manages {@link Config}s. A config handler is created on a
 * per-plugin basis, and as such the methods provided here will only ever be
 * able to manage the configs of its corresponding
 * {@link XtraCorePluginContainer}.
 */
public interface ConfigHandler {

    /**
     * Gets the config object for the specified config class.
     * 
     * @param clazz The class of the config to get
     * @return The config object, or {@link Optional#empty()} if the specified
     *         config could not be found
     */
    Optional<Config> getConfig(Class<? extends Config> clazz);

    /**
     * Gets a collection of all of the configs for this config handler.
     * 
     * @return All of the configs for this handler
     */
    Collection<Config> getConfigs();
}

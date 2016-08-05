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

package com.xtra.api.config.base;

import com.xtra.api.config.Config;
import com.xtra.api.util.config.ConfigExecutor;
import com.xtra.api.util.config.ConfigStore;

import ninja.leaping.configurate.ConfigurationOptions;
import ninja.leaping.configurate.commented.CommentedConfigurationNode;
import ninja.leaping.configurate.loader.ConfigurationLoader;

/**
 * A base class for a config implementation. This handles much of the logic of
 * creating a configuration file for you.
 */
public abstract class ConfigBase implements Config {

    // NOTE: this is overridden by the implementation
    private static ConfigExecutor BASE = null;
    private ConfigStore store = null;

    /**
     * A {@link ConfigBase} specific method, this allows you to modify any
     * {@link ConfigurationOptions} before the configuration loader is built.
     * 
     * <p>Note that implementation of this method is completely optional. It
     * will default to {@link ConfigurationOptions#defaults()}.</p>
     * 
     * @return The configuration options
     */
    public ConfigurationOptions setOptions() {
        return ConfigurationOptions.defaults();
    }

    public void init() {
        BASE.init(this);
    }

    public void load() {
        BASE.load(store);
    }

    public void save() {
        BASE.save(store);
    }

    public ConfigurationLoader<CommentedConfigurationNode> loader() {
        return BASE.loader(store);
    }

    public CommentedConfigurationNode rootNode() {
        return BASE.rootNode(store);
    }
}

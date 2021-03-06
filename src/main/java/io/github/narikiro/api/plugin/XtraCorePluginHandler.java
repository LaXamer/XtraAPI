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

import java.util.Collection;
import java.util.Optional;

/**
 * A handler for managing {@link XtraCorePluginContainer}s.
 */
public interface XtraCorePluginHandler {

    /**
     * Gets the {@link XtraCorePluginContainer} for the specified plugin class.
     * 
     * @param clazz The plugin class
     * @return The xtracore plugin container or {@link Optional#empty()} if the
     *         specified plugin object does not have an xtracore plugin
     *         container
     */
    Optional<XtraCorePluginContainer> getContainer(Class<?> clazz);

    /**
     * Gets the {@link XtraCorePluginContainer} for the specified plugin class.
     * Errors if the specified plugin's container could not be found.
     * 
     * @param clazz The plugin class
     * @return The xtracore plugin container
     */
    XtraCorePluginContainer getContainerUnchecked(Class<?> clazz);

    /**
     * Gets all registered {@link XtraCorePluginContainer}s.
     * 
     * @return A collection of the containers
     */
    Collection<XtraCorePluginContainer> getContainers();
}

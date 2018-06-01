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

package io.github.narikiro.api.config.annotation;

import java.util.Optional;

import io.github.narikiro.api.config.Config;
import org.spongepowered.api.event.game.GameReloadEvent;

/**
 * A helper class that gets information from config annotations.
 */
public interface ConfigAnnotationHelper {

    /**
     * Gets if the specified {@link Config} is at the shared config root
     * directory.
     * 
     * @param clazz The class to check
     * @return If the config is at the shared config root directory, or false if
     *         the register config annotation was not found
     */
    boolean isSharedRoot(Class<? extends Config> clazz);

    /**
     * Gets the config name of the specified {@link Config}.
     * 
     * @param clazz The class to check
     * @return The config name, or {@link Optional#empty()} if the register
     *         config annotation was not found
     */
    Optional<String> getName(Class<? extends Config> clazz);

    /**
     * Gets if the specified {@link Config} will reload during the
     * {@link GameReloadEvent}.
     * 
     * @param clazz The class to check
     * @return If the config reloads during the reload event, or false if the
     *         register config annotation was not found
     */
    boolean doesReload(Class<? extends Config> clazz);
}

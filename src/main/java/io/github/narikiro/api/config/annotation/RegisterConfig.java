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

import io.github.narikiro.api.config.Config;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Signifies that this {@link Config} should be registered by XtraCore. If a
 * {@link Config} does not hold this annotation, the config will not be
 * registered.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface RegisterConfig {

    /**
     * If this config should use the shared config root directory. Even if this
     * is true, this will still use {@link RegisterConfig#configName()} instead
     * of using the plugin's id, unlike Sponge's default configuration.
     * 
     * @return If the config should use the shared root directory
     */
    boolean sharedRoot() default false;

    /**
     * The name of the config file. Ex. specifying "my-config" will result in a
     * "my-config.conf" file being generated in plugin's configuration folder.
     * Do NOT suffix '.conf' to the end of the string.
     * 
     * @return The config file name
     */
    String configName();
}

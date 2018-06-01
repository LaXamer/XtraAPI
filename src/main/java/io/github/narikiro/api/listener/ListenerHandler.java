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

package io.github.narikiro.api.listener;

import java.lang.reflect.Method;
import java.util.Collection;

import io.github.narikiro.api.plugin.XtraCorePluginContainer;
import org.spongepowered.api.event.Listener;

/**
 * A handler used for automatically registering plugin listeners. Like a few
 * others, this handler is on a per-plugin basis, and can be used for retrieving
 * only the listeners of a specific {@link XtraCorePluginContainer}.
 * 
 * <p>Note that the handler will not register listeners in the main plugin
 * class, as those are registered automatically by Sponge. The methods here will
 * reflect this behavior.</p>
 */
public interface ListenerHandler {

    /**
     * Gets a collection of the objects that were registered.
     * 
     * @return A collection of the listener objects
     */
    Collection<Object> getListenerObjects();

    /**
     * Gets the methods that were detected with the {@link Listener} annotation.
     * 
     * @return A collection of the listener methods
     */
    Collection<Method> getListenerMethods();
}

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

package io.github.narikiro.api.command.annotation;

import io.github.narikiro.api.command.runnable.CommandPhase;
import io.github.narikiro.api.command.runnable.CommandRunnable;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * An annotation that may be attached to any {@link CommandRunnable}s if they
 * wish to specify when their {@link CommandRunnable} will be ran and in what
 * order they will be ran to other {@link CommandRunnable}s.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface RunAt {

    /**
     * The phase at which a {@link CommandRunnable} will execute.
     * 
     * @return The phase at which this will run
     * @see CommandPhase
     */
    CommandPhase phase() default CommandPhase.START;

    /**
     * The priority at which a {@link CommandRunnable} should be executed
     * compared to other {@link CommandRunnable}s. The lower this value, the
     * higher priority it gets.
     * 
     * <p>The default priority is 1000.</p>
     * 
     * @return The priority at which the runnable should be ran
     */
    int priority() default 1000;
}

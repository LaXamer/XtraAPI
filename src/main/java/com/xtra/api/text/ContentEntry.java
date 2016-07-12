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

package com.xtra.api.text;

import java.util.Optional;

import org.spongepowered.api.text.Text;

import com.xtra.api.command.Command;

/**
 * Specifies an 'entry' to the {@link HelpPaginationHandler}.
 */
public interface ContentEntry {

    /**
     * Gets the original command used to generate this {@link ContentEntry}.
     * 
     * @return The command used to generate this entry
     */
    Command getCommand();

    /**
     * Gets the complete {@link Text} of this entry.
     * 
     * @return The complete text
     */
    Text getCompleteText();

    /**
     * Gets only the command portion of the complete {@link Text}.
     * 
     * @return The command portion of the text
     */
    Text getCommandText();

    /**
     * Gets only the description portion of the complete {@link Text}.
     * 
     * @return The command description portion of the text, otherwise
     *         {@link Optional#empty()} if this entry does not have one
     */
    Optional<Text> getDescriptionText();
}

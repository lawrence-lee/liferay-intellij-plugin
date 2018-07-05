/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.ide.idea.language.tag;

import com.intellij.codeInsight.completion.CompletionParameters;
import com.intellij.codeInsight.completion.CompletionProvider;
import com.intellij.codeInsight.completion.CompletionResultSet;
import com.intellij.util.ProcessingContext;

import org.jetbrains.annotations.NotNull;

/**
 * @author Terry Jia
 */
public class StringCompletionProvider extends CompletionProvider<CompletionParameters> {

	public StringCompletionProvider(String[] strings) {
		_strings = strings;
	}

	@Override
	protected void addCompletions(
		@NotNull CompletionParameters parameters, ProcessingContext context, @NotNull CompletionResultSet result) {

		for (String s : _strings) {
			result.addElement(LiferayLookupElementBuilder.create(s, "String"));
		}

		result.stopHere();
	}

	private final String[] _strings;

}
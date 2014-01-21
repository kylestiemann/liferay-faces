/**
 * Copyright (c) 2000-2014 Liferay, Inc. All rights reserved.
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
package com.liferay.faces.alloy.component.freemarker;

import java.io.IOException;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

import javax.faces.application.ResourceDependency;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.context.ResponseWriter;

import com.liferay.faces.alloy.component.base.RendererBase;
import com.liferay.faces.util.lang.StringPool;

/**
 * @author Bruno Basto
 * @author Kyle Stiemann
 * @generated
 */
@ResourceDependency(library = "aui", name = "aui.js")
public abstract class FreemarkerRendererBase extends RendererBase {

	// Private Constants
	private static final String AUI_MODULE_NAME = "aui-ace-autocomplete-freemarker";

	protected void encodeJavaScriptMain(FacesContext facesContext, UIComponent uiComponent) throws IOException {

		Freemarker freemarker = (Freemarker) uiComponent;

		ResponseWriter responseWriter = facesContext.getResponseWriter();

		responseWriter.write("var freemarker = new A.Freemarker");
		responseWriter.write(StringPool.OPEN_PARENTHESIS);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedAttributes = new ArrayList<String>();

		if (freemarker.getDirectives() != null) {
			renderDirectives(renderedAttributes, freemarker);
		}

		if (freemarker.getDirectivesMatcher() != null) {
			renderDirectivesMatcher(renderedAttributes, freemarker);
		}

		if (freemarker.getHost() != null) {
			renderHost(renderedAttributes, freemarker);
		}

		if (freemarker.getVariables() != null) {
			renderVariables(renderedAttributes, freemarker);
		}

		if (freemarker.getVariablesMatcher() != null) {
			renderVariablesMatcher(renderedAttributes, freemarker);
		}


		for (String renderedAttribute : renderedAttributes) {
			responseWriter.write(renderedAttribute);
			responseWriter.write(StringPool.COMMA);
		}

		responseWriter.write("after");
		responseWriter.write(StringPool.COLON);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedAfterEvents = new ArrayList<String>();

		if (freemarker.getAfterDirectivesChange() != null) {
			renderAfterDirectivesChange(renderedAfterEvents, freemarker);
		}

		if (freemarker.getAfterDirectivesMatcherChange() != null) {
			renderAfterDirectivesMatcherChange(renderedAfterEvents, freemarker);
		}

		if (freemarker.getAfterHostChange() != null) {
			renderAfterHostChange(renderedAfterEvents, freemarker);
		}

		if (freemarker.getAfterVariablesChange() != null) {
			renderAfterVariablesChange(renderedAfterEvents, freemarker);
		}

		if (freemarker.getAfterVariablesMatcherChange() != null) {
			renderAfterVariablesMatcherChange(renderedAfterEvents, freemarker);
		}


		Iterator<String> afterEventsIterator = renderedAfterEvents.iterator();

		while (afterEventsIterator.hasNext()) {
			responseWriter.write(afterEventsIterator.next());

			if (afterEventsIterator.hasNext()) {
				responseWriter.write(StringPool.COMMA);
			}
		}

		responseWriter.write(StringPool.CLOSE_CURLY_BRACE);
		responseWriter.write(StringPool.COMMA);

		responseWriter.write("on");
		responseWriter.write(StringPool.COLON);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedOnEvents = new ArrayList<String>();

		if (freemarker.getOnDirectivesChange() != null) {
			renderOnDirectivesChange(renderedOnEvents, freemarker);
		}

		if (freemarker.getOnDirectivesMatcherChange() != null) {
			renderOnDirectivesMatcherChange(renderedOnEvents, freemarker);
		}

		if (freemarker.getOnHostChange() != null) {
			renderOnHostChange(renderedOnEvents, freemarker);
		}

		if (freemarker.getOnVariablesChange() != null) {
			renderOnVariablesChange(renderedOnEvents, freemarker);
		}

		if (freemarker.getOnVariablesMatcherChange() != null) {
			renderOnVariablesMatcherChange(renderedOnEvents, freemarker);
		}


		Iterator<String> onEventsIterator = renderedOnEvents.iterator();

		while (onEventsIterator.hasNext()) {
			responseWriter.write(onEventsIterator.next());

			if (onEventsIterator.hasNext()) {
				responseWriter.write(StringPool.COMMA);
			}
		}

		responseWriter.write(StringPool.CLOSE_CURLY_BRACE);
		responseWriter.write(StringPool.CLOSE_CURLY_BRACE);
		responseWriter.write(StringPool.CLOSE_PARENTHESIS);
		responseWriter.write(".render()");
		responseWriter.write(StringPool.SEMICOLON);
	}

	protected String getModule() {
		return AUI_MODULE_NAME;
	}

	protected void renderDirectives(List<String> renderedAttributes, Freemarker freemarker) throws IOException {
		java.lang.Object directives = freemarker.getDirectives();
		renderedAttributes.add(renderArray(Freemarker.DIRECTIVES, directives));
	}

	protected void renderDirectivesMatcher(List<String> renderedAttributes, Freemarker freemarker) throws IOException {
		java.lang.String directivesMatcher = freemarker.getDirectivesMatcher();
		renderedAttributes.add(renderString(Freemarker.DIRECTIVES_MATCHER, directivesMatcher));
	}

	protected void renderHost(List<String> renderedAttributes, Freemarker freemarker) throws IOException {
		java.lang.Object host = freemarker.getHost();
		renderedAttributes.add(renderObject(Freemarker.HOST, host));
	}

	protected void renderVariables(List<String> renderedAttributes, Freemarker freemarker) throws IOException {
		java.lang.Object variables = freemarker.getVariables();
		renderedAttributes.add(renderObject(Freemarker.VARIABLES, variables));
	}

	protected void renderVariablesMatcher(List<String> renderedAttributes, Freemarker freemarker) throws IOException {
		java.lang.String variablesMatcher = freemarker.getVariablesMatcher();
		renderedAttributes.add(renderString(Freemarker.VARIABLES_MATCHER, variablesMatcher));
	}

	protected void renderAfterDirectivesChange(List<String> renderedAttributes, Freemarker freemarker) throws IOException {
		java.lang.String afterDirectivesChange = freemarker.getAfterDirectivesChange();
		renderedAttributes.add(renderString(Freemarker.AFTER_DIRECTIVES_CHANGE, afterDirectivesChange));
	}

	protected void renderAfterDirectivesMatcherChange(List<String> renderedAttributes, Freemarker freemarker) throws IOException {
		java.lang.String afterDirectivesMatcherChange = freemarker.getAfterDirectivesMatcherChange();
		renderedAttributes.add(renderString(Freemarker.AFTER_DIRECTIVES_MATCHER_CHANGE, afterDirectivesMatcherChange));
	}

	protected void renderAfterHostChange(List<String> renderedAttributes, Freemarker freemarker) throws IOException {
		java.lang.String afterHostChange = freemarker.getAfterHostChange();
		renderedAttributes.add(renderString(Freemarker.AFTER_HOST_CHANGE, afterHostChange));
	}

	protected void renderAfterVariablesChange(List<String> renderedAttributes, Freemarker freemarker) throws IOException {
		java.lang.String afterVariablesChange = freemarker.getAfterVariablesChange();
		renderedAttributes.add(renderString(Freemarker.AFTER_VARIABLES_CHANGE, afterVariablesChange));
	}

	protected void renderAfterVariablesMatcherChange(List<String> renderedAttributes, Freemarker freemarker) throws IOException {
		java.lang.String afterVariablesMatcherChange = freemarker.getAfterVariablesMatcherChange();
		renderedAttributes.add(renderString(Freemarker.AFTER_VARIABLES_MATCHER_CHANGE, afterVariablesMatcherChange));
	}

	protected void renderOnDirectivesChange(List<String> renderedAttributes, Freemarker freemarker) throws IOException {
		java.lang.String onDirectivesChange = freemarker.getOnDirectivesChange();
		renderedAttributes.add(renderString(Freemarker.ON_DIRECTIVES_CHANGE, onDirectivesChange));
	}

	protected void renderOnDirectivesMatcherChange(List<String> renderedAttributes, Freemarker freemarker) throws IOException {
		java.lang.String onDirectivesMatcherChange = freemarker.getOnDirectivesMatcherChange();
		renderedAttributes.add(renderString(Freemarker.ON_DIRECTIVES_MATCHER_CHANGE, onDirectivesMatcherChange));
	}

	protected void renderOnHostChange(List<String> renderedAttributes, Freemarker freemarker) throws IOException {
		java.lang.String onHostChange = freemarker.getOnHostChange();
		renderedAttributes.add(renderString(Freemarker.ON_HOST_CHANGE, onHostChange));
	}

	protected void renderOnVariablesChange(List<String> renderedAttributes, Freemarker freemarker) throws IOException {
		java.lang.String onVariablesChange = freemarker.getOnVariablesChange();
		renderedAttributes.add(renderString(Freemarker.ON_VARIABLES_CHANGE, onVariablesChange));
	}

	protected void renderOnVariablesMatcherChange(List<String> renderedAttributes, Freemarker freemarker) throws IOException {
		java.lang.String onVariablesMatcherChange = freemarker.getOnVariablesMatcherChange();
		renderedAttributes.add(renderString(Freemarker.ON_VARIABLES_MATCHER_CHANGE, onVariablesMatcherChange));
	}

}
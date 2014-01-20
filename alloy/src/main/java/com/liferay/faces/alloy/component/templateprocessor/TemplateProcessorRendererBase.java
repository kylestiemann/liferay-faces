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
package com.liferay.faces.alloy.component.templateprocessor;

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
public abstract class TemplateProcessorRendererBase extends RendererBase {

	// Private Constants
	private static final String AUI_MODULE_NAME = "aui-ace-autocomplete-templateprocessor";

	protected void encodeJavaScriptMain(FacesContext facesContext, UIComponent uiComponent) throws IOException {

		TemplateProcessor templateProcessor = (TemplateProcessor) uiComponent;

		ResponseWriter responseWriter = facesContext.getResponseWriter();

		responseWriter.write("var templateProcessor = new A.TemplateProcessor");
		responseWriter.write(StringPool.OPEN_PARENTHESIS);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedAttributes = new ArrayList<String>();

		renderDestroyed(renderedAttributes, templateProcessor);
		renderDirectives(renderedAttributes, templateProcessor);
		renderHost(renderedAttributes, templateProcessor);
		renderInitialized(renderedAttributes, templateProcessor);
		renderVariables(renderedAttributes, templateProcessor);

		for (String renderedAttribute : renderedAttributes) {
			responseWriter.write(renderedAttribute);
			responseWriter.write(StringPool.COMMA);
		}

		responseWriter.write("after");
		responseWriter.write(StringPool.COLON);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedAfterEvents = new ArrayList<String>();

		renderAfterDestroyedChange(renderedAfterEvents, templateProcessor);
		renderAfterDirectivesChange(renderedAfterEvents, templateProcessor);
		renderAfterHostChange(renderedAfterEvents, templateProcessor);
		renderAfterInitializedChange(renderedAfterEvents, templateProcessor);
		renderAfterVariablesChange(renderedAfterEvents, templateProcessor);

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

		renderOnDestroyedChange(renderedOnEvents, templateProcessor);
		renderOnDirectivesChange(renderedOnEvents, templateProcessor);
		renderOnHostChange(renderedOnEvents, templateProcessor);
		renderOnInitializedChange(renderedOnEvents, templateProcessor);
		renderOnVariablesChange(renderedOnEvents, templateProcessor);

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

	protected void renderDestroyed(List<String> renderedAttributes, TemplateProcessor templateProcessor) throws IOException {
		java.lang.Boolean destroyed = templateProcessor.getDestroyed();

		if (destroyed != null) {
			renderedAttributes.add(renderBoolean(TemplateProcessor.DESTROYED, destroyed));
		}
	}

	protected void renderDirectives(List<String> renderedAttributes, TemplateProcessor templateProcessor) throws IOException {
		java.lang.Object directives = templateProcessor.getDirectives();

		if (directives != null) {
			renderedAttributes.add(renderArray(TemplateProcessor.DIRECTIVES, directives));
		}
	}

	protected void renderHost(List<String> renderedAttributes, TemplateProcessor templateProcessor) throws IOException {
		java.lang.Object host = templateProcessor.getHost();

		if (host != null) {
			renderedAttributes.add(renderObject(TemplateProcessor.HOST, host));
		}
	}

	protected void renderInitialized(List<String> renderedAttributes, TemplateProcessor templateProcessor) throws IOException {
		java.lang.Boolean initialized = templateProcessor.getInitialized();

		if (initialized != null) {
			renderedAttributes.add(renderBoolean(TemplateProcessor.INITIALIZED, initialized));
		}
	}

	protected void renderVariables(List<String> renderedAttributes, TemplateProcessor templateProcessor) throws IOException {
		java.lang.Object variables = templateProcessor.getVariables();

		if (variables != null) {
			renderedAttributes.add(renderObject(TemplateProcessor.VARIABLES, variables));
		}
	}

	protected void renderAfterDestroyedChange(List<String> renderedAttributes, TemplateProcessor templateProcessor) throws IOException {
		java.lang.String afterDestroyedChange = templateProcessor.getAfterDestroyedChange();

		if (afterDestroyedChange != null) {
			renderedAttributes.add(renderString(TemplateProcessor.AFTER_DESTROYED_CHANGE, afterDestroyedChange));
		}
	}

	protected void renderAfterDirectivesChange(List<String> renderedAttributes, TemplateProcessor templateProcessor) throws IOException {
		java.lang.String afterDirectivesChange = templateProcessor.getAfterDirectivesChange();

		if (afterDirectivesChange != null) {
			renderedAttributes.add(renderString(TemplateProcessor.AFTER_DIRECTIVES_CHANGE, afterDirectivesChange));
		}
	}

	protected void renderAfterHostChange(List<String> renderedAttributes, TemplateProcessor templateProcessor) throws IOException {
		java.lang.String afterHostChange = templateProcessor.getAfterHostChange();

		if (afterHostChange != null) {
			renderedAttributes.add(renderString(TemplateProcessor.AFTER_HOST_CHANGE, afterHostChange));
		}
	}

	protected void renderAfterInitializedChange(List<String> renderedAttributes, TemplateProcessor templateProcessor) throws IOException {
		java.lang.String afterInitializedChange = templateProcessor.getAfterInitializedChange();

		if (afterInitializedChange != null) {
			renderedAttributes.add(renderString(TemplateProcessor.AFTER_INITIALIZED_CHANGE, afterInitializedChange));
		}
	}

	protected void renderAfterVariablesChange(List<String> renderedAttributes, TemplateProcessor templateProcessor) throws IOException {
		java.lang.String afterVariablesChange = templateProcessor.getAfterVariablesChange();

		if (afterVariablesChange != null) {
			renderedAttributes.add(renderString(TemplateProcessor.AFTER_VARIABLES_CHANGE, afterVariablesChange));
		}
	}

	protected void renderOnDestroyedChange(List<String> renderedAttributes, TemplateProcessor templateProcessor) throws IOException {
		java.lang.String onDestroyedChange = templateProcessor.getOnDestroyedChange();

		if (onDestroyedChange != null) {
			renderedAttributes.add(renderString(TemplateProcessor.ON_DESTROYED_CHANGE, onDestroyedChange));
		}
	}

	protected void renderOnDirectivesChange(List<String> renderedAttributes, TemplateProcessor templateProcessor) throws IOException {
		java.lang.String onDirectivesChange = templateProcessor.getOnDirectivesChange();

		if (onDirectivesChange != null) {
			renderedAttributes.add(renderString(TemplateProcessor.ON_DIRECTIVES_CHANGE, onDirectivesChange));
		}
	}

	protected void renderOnHostChange(List<String> renderedAttributes, TemplateProcessor templateProcessor) throws IOException {
		java.lang.String onHostChange = templateProcessor.getOnHostChange();

		if (onHostChange != null) {
			renderedAttributes.add(renderString(TemplateProcessor.ON_HOST_CHANGE, onHostChange));
		}
	}

	protected void renderOnInitializedChange(List<String> renderedAttributes, TemplateProcessor templateProcessor) throws IOException {
		java.lang.String onInitializedChange = templateProcessor.getOnInitializedChange();

		if (onInitializedChange != null) {
			renderedAttributes.add(renderString(TemplateProcessor.ON_INITIALIZED_CHANGE, onInitializedChange));
		}
	}

	protected void renderOnVariablesChange(List<String> renderedAttributes, TemplateProcessor templateProcessor) throws IOException {
		java.lang.String onVariablesChange = templateProcessor.getOnVariablesChange();

		if (onVariablesChange != null) {
			renderedAttributes.add(renderString(TemplateProcessor.ON_VARIABLES_CHANGE, onVariablesChange));
		}
	}

}
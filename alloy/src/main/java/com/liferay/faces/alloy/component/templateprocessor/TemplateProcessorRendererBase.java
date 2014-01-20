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

		if (templateProcessor.getDestroyed() != null) {
			renderDestroyed(renderedAttributes, templateProcessor);
		}
		
		if (templateProcessor.getDirectives() != null) {
			renderDirectives(renderedAttributes, templateProcessor);
		}
		
		if (templateProcessor.getHost() != null) {
			renderHost(renderedAttributes, templateProcessor);
		}
		
		if (templateProcessor.getInitialized() != null) {
			renderInitialized(renderedAttributes, templateProcessor);
		}
		
		if (templateProcessor.getVariables() != null) {
			renderVariables(renderedAttributes, templateProcessor);
		}
		

		for (String renderedAttribute : renderedAttributes) {
			responseWriter.write(renderedAttribute);
			responseWriter.write(StringPool.COMMA);
		}

		responseWriter.write("after");
		responseWriter.write(StringPool.COLON);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedAfterEvents = new ArrayList<String>();

		if (templateProcessor.getAfterDestroyedChange() != null) {
			renderAfterDestroyedChange(renderedAfterEvents, templateProcessor);
		}
		
		if (templateProcessor.getAfterDirectivesChange() != null) {
			renderAfterDirectivesChange(renderedAfterEvents, templateProcessor);
		}
		
		if (templateProcessor.getAfterHostChange() != null) {
			renderAfterHostChange(renderedAfterEvents, templateProcessor);
		}
		
		if (templateProcessor.getAfterInitializedChange() != null) {
			renderAfterInitializedChange(renderedAfterEvents, templateProcessor);
		}
		
		if (templateProcessor.getAfterVariablesChange() != null) {
			renderAfterVariablesChange(renderedAfterEvents, templateProcessor);
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

		if (templateProcessor.getOnDestroyedChange() != null) {
			renderOnDestroyedChange(renderedOnEvents, templateProcessor);
		}
		
		if (templateProcessor.getOnDirectivesChange() != null) {
			renderOnDirectivesChange(renderedOnEvents, templateProcessor);
		}
		
		if (templateProcessor.getOnHostChange() != null) {
			renderOnHostChange(renderedOnEvents, templateProcessor);
		}
		
		if (templateProcessor.getOnInitializedChange() != null) {
			renderOnInitializedChange(renderedOnEvents, templateProcessor);
		}
		
		if (templateProcessor.getOnVariablesChange() != null) {
			renderOnVariablesChange(renderedOnEvents, templateProcessor);
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

	protected void renderDestroyed(List<String> renderedAttributes, TemplateProcessor templateProcessor) throws IOException {
		java.lang.Boolean destroyed = templateProcessor.getDestroyed();
		renderedAttributes.add(renderBoolean(TemplateProcessor.DESTROYED, destroyed));
	}

	protected void renderDirectives(List<String> renderedAttributes, TemplateProcessor templateProcessor) throws IOException {
		java.lang.Object directives = templateProcessor.getDirectives();
		renderedAttributes.add(renderArray(TemplateProcessor.DIRECTIVES, directives));
	}

	protected void renderHost(List<String> renderedAttributes, TemplateProcessor templateProcessor) throws IOException {
		java.lang.Object host = templateProcessor.getHost();
		renderedAttributes.add(renderObject(TemplateProcessor.HOST, host));
	}

	protected void renderInitialized(List<String> renderedAttributes, TemplateProcessor templateProcessor) throws IOException {
		java.lang.Boolean initialized = templateProcessor.getInitialized();
		renderedAttributes.add(renderBoolean(TemplateProcessor.INITIALIZED, initialized));
	}

	protected void renderVariables(List<String> renderedAttributes, TemplateProcessor templateProcessor) throws IOException {
		java.lang.Object variables = templateProcessor.getVariables();
		renderedAttributes.add(renderObject(TemplateProcessor.VARIABLES, variables));
	}

	protected void renderAfterDestroyedChange(List<String> renderedAttributes, TemplateProcessor templateProcessor) throws IOException {
		java.lang.String afterDestroyedChange = templateProcessor.getAfterDestroyedChange();
		renderedAttributes.add(renderString(TemplateProcessor.AFTER_DESTROYED_CHANGE, afterDestroyedChange));
	}

	protected void renderAfterDirectivesChange(List<String> renderedAttributes, TemplateProcessor templateProcessor) throws IOException {
		java.lang.String afterDirectivesChange = templateProcessor.getAfterDirectivesChange();
		renderedAttributes.add(renderString(TemplateProcessor.AFTER_DIRECTIVES_CHANGE, afterDirectivesChange));
	}

	protected void renderAfterHostChange(List<String> renderedAttributes, TemplateProcessor templateProcessor) throws IOException {
		java.lang.String afterHostChange = templateProcessor.getAfterHostChange();
		renderedAttributes.add(renderString(TemplateProcessor.AFTER_HOST_CHANGE, afterHostChange));
	}

	protected void renderAfterInitializedChange(List<String> renderedAttributes, TemplateProcessor templateProcessor) throws IOException {
		java.lang.String afterInitializedChange = templateProcessor.getAfterInitializedChange();
		renderedAttributes.add(renderString(TemplateProcessor.AFTER_INITIALIZED_CHANGE, afterInitializedChange));
	}

	protected void renderAfterVariablesChange(List<String> renderedAttributes, TemplateProcessor templateProcessor) throws IOException {
		java.lang.String afterVariablesChange = templateProcessor.getAfterVariablesChange();
		renderedAttributes.add(renderString(TemplateProcessor.AFTER_VARIABLES_CHANGE, afterVariablesChange));
	}

	protected void renderOnDestroyedChange(List<String> renderedAttributes, TemplateProcessor templateProcessor) throws IOException {
		java.lang.String onDestroyedChange = templateProcessor.getOnDestroyedChange();
		renderedAttributes.add(renderString(TemplateProcessor.ON_DESTROYED_CHANGE, onDestroyedChange));
	}

	protected void renderOnDirectivesChange(List<String> renderedAttributes, TemplateProcessor templateProcessor) throws IOException {
		java.lang.String onDirectivesChange = templateProcessor.getOnDirectivesChange();
		renderedAttributes.add(renderString(TemplateProcessor.ON_DIRECTIVES_CHANGE, onDirectivesChange));
	}

	protected void renderOnHostChange(List<String> renderedAttributes, TemplateProcessor templateProcessor) throws IOException {
		java.lang.String onHostChange = templateProcessor.getOnHostChange();
		renderedAttributes.add(renderString(TemplateProcessor.ON_HOST_CHANGE, onHostChange));
	}

	protected void renderOnInitializedChange(List<String> renderedAttributes, TemplateProcessor templateProcessor) throws IOException {
		java.lang.String onInitializedChange = templateProcessor.getOnInitializedChange();
		renderedAttributes.add(renderString(TemplateProcessor.ON_INITIALIZED_CHANGE, onInitializedChange));
	}

	protected void renderOnVariablesChange(List<String> renderedAttributes, TemplateProcessor templateProcessor) throws IOException {
		java.lang.String onVariablesChange = templateProcessor.getOnVariablesChange();
		renderedAttributes.add(renderString(TemplateProcessor.ON_VARIABLES_CHANGE, onVariablesChange));
	}

}
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
package com.liferay.faces.alloy.component.velocity;

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
public abstract class VelocityRendererBase extends RendererBase {

	// Private Constants
	private static final String AUI_MODULE_NAME = "aui-ace-autocomplete-velocity";

	protected void encodeJavaScriptMain(FacesContext facesContext, UIComponent uiComponent) throws IOException {

		Velocity velocity = (Velocity) uiComponent;

		ResponseWriter responseWriter = facesContext.getResponseWriter();

		responseWriter.write("var velocity = new A.Velocity");
		responseWriter.write(StringPool.OPEN_PARENTHESIS);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedAttributes = new ArrayList<String>();

		if (velocity.getDirectives() != null) {
			renderDirectives(renderedAttributes, velocity);
		}

		if (velocity.getDirectivesMatcher() != null) {
			renderDirectivesMatcher(renderedAttributes, velocity);
		}

		if (velocity.getHost() != null) {
			renderHost(renderedAttributes, velocity);
		}

		if (velocity.getVariables() != null) {
			renderVariables(renderedAttributes, velocity);
		}

		if (velocity.getVariablesMatcher() != null) {
			renderVariablesMatcher(renderedAttributes, velocity);
		}


		for (String renderedAttribute : renderedAttributes) {
			responseWriter.write(renderedAttribute);
			responseWriter.write(StringPool.COMMA);
		}

		responseWriter.write("after");
		responseWriter.write(StringPool.COLON);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedAfterEvents = new ArrayList<String>();

		if (velocity.getAfterDirectivesChange() != null) {
			renderAfterDirectivesChange(renderedAfterEvents, velocity);
		}

		if (velocity.getAfterDirectivesMatcherChange() != null) {
			renderAfterDirectivesMatcherChange(renderedAfterEvents, velocity);
		}

		if (velocity.getAfterHostChange() != null) {
			renderAfterHostChange(renderedAfterEvents, velocity);
		}

		if (velocity.getAfterVariablesChange() != null) {
			renderAfterVariablesChange(renderedAfterEvents, velocity);
		}

		if (velocity.getAfterVariablesMatcherChange() != null) {
			renderAfterVariablesMatcherChange(renderedAfterEvents, velocity);
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

		if (velocity.getOnDirectivesChange() != null) {
			renderOnDirectivesChange(renderedOnEvents, velocity);
		}

		if (velocity.getOnDirectivesMatcherChange() != null) {
			renderOnDirectivesMatcherChange(renderedOnEvents, velocity);
		}

		if (velocity.getOnHostChange() != null) {
			renderOnHostChange(renderedOnEvents, velocity);
		}

		if (velocity.getOnVariablesChange() != null) {
			renderOnVariablesChange(renderedOnEvents, velocity);
		}

		if (velocity.getOnVariablesMatcherChange() != null) {
			renderOnVariablesMatcherChange(renderedOnEvents, velocity);
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

	protected void renderDirectives(List<String> renderedAttributes, Velocity velocity) throws IOException {
		java.lang.Object directives = velocity.getDirectives();
		renderedAttributes.add(renderArray(Velocity.DIRECTIVES, directives));
	}

	protected void renderDirectivesMatcher(List<String> renderedAttributes, Velocity velocity) throws IOException {
		java.lang.String directivesMatcher = velocity.getDirectivesMatcher();
		renderedAttributes.add(renderString(Velocity.DIRECTIVES_MATCHER, directivesMatcher));
	}

	protected void renderHost(List<String> renderedAttributes, Velocity velocity) throws IOException {
		java.lang.Object host = velocity.getHost();
		renderedAttributes.add(renderObject(Velocity.HOST, host));
	}

	protected void renderVariables(List<String> renderedAttributes, Velocity velocity) throws IOException {
		java.lang.Object variables = velocity.getVariables();
		renderedAttributes.add(renderObject(Velocity.VARIABLES, variables));
	}

	protected void renderVariablesMatcher(List<String> renderedAttributes, Velocity velocity) throws IOException {
		java.lang.String variablesMatcher = velocity.getVariablesMatcher();
		renderedAttributes.add(renderString(Velocity.VARIABLES_MATCHER, variablesMatcher));
	}

	protected void renderAfterDirectivesChange(List<String> renderedAttributes, Velocity velocity) throws IOException {
		java.lang.String afterDirectivesChange = velocity.getAfterDirectivesChange();
		renderedAttributes.add(renderString(Velocity.AFTER_DIRECTIVES_CHANGE, afterDirectivesChange));
	}

	protected void renderAfterDirectivesMatcherChange(List<String> renderedAttributes, Velocity velocity) throws IOException {
		java.lang.String afterDirectivesMatcherChange = velocity.getAfterDirectivesMatcherChange();
		renderedAttributes.add(renderString(Velocity.AFTER_DIRECTIVES_MATCHER_CHANGE, afterDirectivesMatcherChange));
	}

	protected void renderAfterHostChange(List<String> renderedAttributes, Velocity velocity) throws IOException {
		java.lang.String afterHostChange = velocity.getAfterHostChange();
		renderedAttributes.add(renderString(Velocity.AFTER_HOST_CHANGE, afterHostChange));
	}

	protected void renderAfterVariablesChange(List<String> renderedAttributes, Velocity velocity) throws IOException {
		java.lang.String afterVariablesChange = velocity.getAfterVariablesChange();
		renderedAttributes.add(renderString(Velocity.AFTER_VARIABLES_CHANGE, afterVariablesChange));
	}

	protected void renderAfterVariablesMatcherChange(List<String> renderedAttributes, Velocity velocity) throws IOException {
		java.lang.String afterVariablesMatcherChange = velocity.getAfterVariablesMatcherChange();
		renderedAttributes.add(renderString(Velocity.AFTER_VARIABLES_MATCHER_CHANGE, afterVariablesMatcherChange));
	}

	protected void renderOnDirectivesChange(List<String> renderedAttributes, Velocity velocity) throws IOException {
		java.lang.String onDirectivesChange = velocity.getOnDirectivesChange();
		renderedAttributes.add(renderString(Velocity.ON_DIRECTIVES_CHANGE, onDirectivesChange));
	}

	protected void renderOnDirectivesMatcherChange(List<String> renderedAttributes, Velocity velocity) throws IOException {
		java.lang.String onDirectivesMatcherChange = velocity.getOnDirectivesMatcherChange();
		renderedAttributes.add(renderString(Velocity.ON_DIRECTIVES_MATCHER_CHANGE, onDirectivesMatcherChange));
	}

	protected void renderOnHostChange(List<String> renderedAttributes, Velocity velocity) throws IOException {
		java.lang.String onHostChange = velocity.getOnHostChange();
		renderedAttributes.add(renderString(Velocity.ON_HOST_CHANGE, onHostChange));
	}

	protected void renderOnVariablesChange(List<String> renderedAttributes, Velocity velocity) throws IOException {
		java.lang.String onVariablesChange = velocity.getOnVariablesChange();
		renderedAttributes.add(renderString(Velocity.ON_VARIABLES_CHANGE, onVariablesChange));
	}

	protected void renderOnVariablesMatcherChange(List<String> renderedAttributes, Velocity velocity) throws IOException {
		java.lang.String onVariablesMatcherChange = velocity.getOnVariablesMatcherChange();
		renderedAttributes.add(renderString(Velocity.ON_VARIABLES_MATCHER_CHANGE, onVariablesMatcherChange));
	}

}
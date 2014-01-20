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
package com.liferay.faces.alloy.component.fieldsupport;

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
public abstract class FieldSupportRendererBase extends RendererBase {

	// Private Constants
	private static final String AUI_MODULE_NAME = "aui-diagram-builder-base";

	protected void encodeJavaScriptMain(FacesContext facesContext, UIComponent uiComponent) throws IOException {

		FieldSupport fieldSupport = (FieldSupport) uiComponent;

		ResponseWriter responseWriter = facesContext.getResponseWriter();

		responseWriter.write("var fieldSupport = new A.FieldSupport");
		responseWriter.write(StringPool.OPEN_PARENTHESIS);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedAttributes = new ArrayList<String>();

		if (fieldSupport.getFields() != null) {
			renderFields(renderedAttributes, fieldSupport);
		}
		
		if (fieldSupport.getMaxFields() != null) {
			renderMaxFields(renderedAttributes, fieldSupport);
		}
		

		for (String renderedAttribute : renderedAttributes) {
			responseWriter.write(renderedAttribute);
			responseWriter.write(StringPool.COMMA);
		}

		responseWriter.write("after");
		responseWriter.write(StringPool.COLON);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedAfterEvents = new ArrayList<String>();

		if (fieldSupport.getAfterFieldsChange() != null) {
			renderAfterFieldsChange(renderedAfterEvents, fieldSupport);
		}
		
		if (fieldSupport.getAfterMaxFieldsChange() != null) {
			renderAfterMaxFieldsChange(renderedAfterEvents, fieldSupport);
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

		if (fieldSupport.getOnFieldsChange() != null) {
			renderOnFieldsChange(renderedOnEvents, fieldSupport);
		}
		
		if (fieldSupport.getOnMaxFieldsChange() != null) {
			renderOnMaxFieldsChange(renderedOnEvents, fieldSupport);
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

	protected void renderFields(List<String> renderedAttributes, FieldSupport fieldSupport) throws IOException {
		java.lang.Object fields = fieldSupport.getFields();
		renderedAttributes.add(renderArray(FieldSupport.FIELDS, fields));
	}

	protected void renderMaxFields(List<String> renderedAttributes, FieldSupport fieldSupport) throws IOException {
		java.lang.Object maxFields = fieldSupport.getMaxFields();
		renderedAttributes.add(renderNumber(FieldSupport.MAX_FIELDS, maxFields));
	}

	protected void renderAfterFieldsChange(List<String> renderedAttributes, FieldSupport fieldSupport) throws IOException {
		java.lang.String afterFieldsChange = fieldSupport.getAfterFieldsChange();
		renderedAttributes.add(renderString(FieldSupport.AFTER_FIELDS_CHANGE, afterFieldsChange));
	}

	protected void renderAfterMaxFieldsChange(List<String> renderedAttributes, FieldSupport fieldSupport) throws IOException {
		java.lang.String afterMaxFieldsChange = fieldSupport.getAfterMaxFieldsChange();
		renderedAttributes.add(renderString(FieldSupport.AFTER_MAX_FIELDS_CHANGE, afterMaxFieldsChange));
	}

	protected void renderOnFieldsChange(List<String> renderedAttributes, FieldSupport fieldSupport) throws IOException {
		java.lang.String onFieldsChange = fieldSupport.getOnFieldsChange();
		renderedAttributes.add(renderString(FieldSupport.ON_FIELDS_CHANGE, onFieldsChange));
	}

	protected void renderOnMaxFieldsChange(List<String> renderedAttributes, FieldSupport fieldSupport) throws IOException {
		java.lang.String onMaxFieldsChange = fieldSupport.getOnMaxFieldsChange();
		renderedAttributes.add(renderString(FieldSupport.ON_MAX_FIELDS_CHANGE, onMaxFieldsChange));
	}

}
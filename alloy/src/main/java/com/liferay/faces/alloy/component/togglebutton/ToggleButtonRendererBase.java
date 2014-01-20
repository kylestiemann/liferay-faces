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
package com.liferay.faces.alloy.component.togglebutton;

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
public abstract class ToggleButtonRendererBase extends RendererBase {

	// Private Constants
	private static final String AUI_MODULE_NAME = "aui-button";

	protected void encodeJavaScriptMain(FacesContext facesContext, UIComponent uiComponent) throws IOException {

		ToggleButton toggleButton = (ToggleButton) uiComponent;

		ResponseWriter responseWriter = facesContext.getResponseWriter();

		responseWriter.write("var toggleButton = new A.ToggleButton");
		responseWriter.write(StringPool.OPEN_PARENTHESIS);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedAttributes = new ArrayList<String>();

		if (toggleButton.getCssClass() != null) {
			renderCssClass(renderedAttributes, toggleButton);
		}
		
		if (toggleButton.getIcon() != null) {
			renderIcon(renderedAttributes, toggleButton);
		}
		
		if (toggleButton.getIconAlign() != null) {
			renderIconAlign(renderedAttributes, toggleButton);
		}
		
		if (toggleButton.getIconElement() != null) {
			renderIconElement(renderedAttributes, toggleButton);
		}
		
		if (toggleButton.getPrimary() != null) {
			renderPrimary(renderedAttributes, toggleButton);
		}
		
		if (toggleButton.getType() != null) {
			renderType(renderedAttributes, toggleButton);
		}
		

		for (String renderedAttribute : renderedAttributes) {
			responseWriter.write(renderedAttribute);
			responseWriter.write(StringPool.COMMA);
		}

		responseWriter.write("after");
		responseWriter.write(StringPool.COLON);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedAfterEvents = new ArrayList<String>();

		if (toggleButton.getAfterCssClassChange() != null) {
			renderAfterCssClassChange(renderedAfterEvents, toggleButton);
		}
		
		if (toggleButton.getAfterIconChange() != null) {
			renderAfterIconChange(renderedAfterEvents, toggleButton);
		}
		
		if (toggleButton.getAfterIconAlignChange() != null) {
			renderAfterIconAlignChange(renderedAfterEvents, toggleButton);
		}
		
		if (toggleButton.getAfterIconElementChange() != null) {
			renderAfterIconElementChange(renderedAfterEvents, toggleButton);
		}
		
		if (toggleButton.getAfterPrimaryChange() != null) {
			renderAfterPrimaryChange(renderedAfterEvents, toggleButton);
		}
		
		if (toggleButton.getAfterTypeChange() != null) {
			renderAfterTypeChange(renderedAfterEvents, toggleButton);
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

		if (toggleButton.getOnCssClassChange() != null) {
			renderOnCssClassChange(renderedOnEvents, toggleButton);
		}
		
		if (toggleButton.getOnIconChange() != null) {
			renderOnIconChange(renderedOnEvents, toggleButton);
		}
		
		if (toggleButton.getOnIconAlignChange() != null) {
			renderOnIconAlignChange(renderedOnEvents, toggleButton);
		}
		
		if (toggleButton.getOnIconElementChange() != null) {
			renderOnIconElementChange(renderedOnEvents, toggleButton);
		}
		
		if (toggleButton.getOnPrimaryChange() != null) {
			renderOnPrimaryChange(renderedOnEvents, toggleButton);
		}
		
		if (toggleButton.getOnTypeChange() != null) {
			renderOnTypeChange(renderedOnEvents, toggleButton);
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

	protected void renderCssClass(List<String> renderedAttributes, ToggleButton toggleButton) throws IOException {
		java.lang.String cssClass = toggleButton.getCssClass();
		renderedAttributes.add(renderString(ToggleButton.CSS_CLASS, cssClass));
	}

	protected void renderIcon(List<String> renderedAttributes, ToggleButton toggleButton) throws IOException {
		java.lang.String icon = toggleButton.getIcon();
		renderedAttributes.add(renderString(ToggleButton.ICON, icon));
	}

	protected void renderIconAlign(List<String> renderedAttributes, ToggleButton toggleButton) throws IOException {
		java.lang.String iconAlign = toggleButton.getIconAlign();
		renderedAttributes.add(renderString(ToggleButton.ICON_ALIGN, iconAlign));
	}

	protected void renderIconElement(List<String> renderedAttributes, ToggleButton toggleButton) throws IOException {
		java.lang.String iconElement = toggleButton.getIconElement();
		renderedAttributes.add(renderString(ToggleButton.ICON_ELEMENT, iconElement));
	}

	protected void renderPrimary(List<String> renderedAttributes, ToggleButton toggleButton) throws IOException {
		java.lang.Boolean primary = toggleButton.getPrimary();
		renderedAttributes.add(renderBoolean(ToggleButton.PRIMARY, primary));
	}

	protected void renderType(List<String> renderedAttributes, ToggleButton toggleButton) throws IOException {
		java.lang.String type = toggleButton.getType();
		renderedAttributes.add(renderString(ToggleButton.TYPE, type));
	}

	protected void renderAfterCssClassChange(List<String> renderedAttributes, ToggleButton toggleButton) throws IOException {
		java.lang.String afterCssClassChange = toggleButton.getAfterCssClassChange();
		renderedAttributes.add(renderString(ToggleButton.AFTER_CSS_CLASS_CHANGE, afterCssClassChange));
	}

	protected void renderAfterIconChange(List<String> renderedAttributes, ToggleButton toggleButton) throws IOException {
		java.lang.String afterIconChange = toggleButton.getAfterIconChange();
		renderedAttributes.add(renderString(ToggleButton.AFTER_ICON_CHANGE, afterIconChange));
	}

	protected void renderAfterIconAlignChange(List<String> renderedAttributes, ToggleButton toggleButton) throws IOException {
		java.lang.String afterIconAlignChange = toggleButton.getAfterIconAlignChange();
		renderedAttributes.add(renderString(ToggleButton.AFTER_ICON_ALIGN_CHANGE, afterIconAlignChange));
	}

	protected void renderAfterIconElementChange(List<String> renderedAttributes, ToggleButton toggleButton) throws IOException {
		java.lang.String afterIconElementChange = toggleButton.getAfterIconElementChange();
		renderedAttributes.add(renderString(ToggleButton.AFTER_ICON_ELEMENT_CHANGE, afterIconElementChange));
	}

	protected void renderAfterPrimaryChange(List<String> renderedAttributes, ToggleButton toggleButton) throws IOException {
		java.lang.String afterPrimaryChange = toggleButton.getAfterPrimaryChange();
		renderedAttributes.add(renderString(ToggleButton.AFTER_PRIMARY_CHANGE, afterPrimaryChange));
	}

	protected void renderAfterTypeChange(List<String> renderedAttributes, ToggleButton toggleButton) throws IOException {
		java.lang.String afterTypeChange = toggleButton.getAfterTypeChange();
		renderedAttributes.add(renderString(ToggleButton.AFTER_TYPE_CHANGE, afterTypeChange));
	}

	protected void renderOnCssClassChange(List<String> renderedAttributes, ToggleButton toggleButton) throws IOException {
		java.lang.String onCssClassChange = toggleButton.getOnCssClassChange();
		renderedAttributes.add(renderString(ToggleButton.ON_CSS_CLASS_CHANGE, onCssClassChange));
	}

	protected void renderOnIconChange(List<String> renderedAttributes, ToggleButton toggleButton) throws IOException {
		java.lang.String onIconChange = toggleButton.getOnIconChange();
		renderedAttributes.add(renderString(ToggleButton.ON_ICON_CHANGE, onIconChange));
	}

	protected void renderOnIconAlignChange(List<String> renderedAttributes, ToggleButton toggleButton) throws IOException {
		java.lang.String onIconAlignChange = toggleButton.getOnIconAlignChange();
		renderedAttributes.add(renderString(ToggleButton.ON_ICON_ALIGN_CHANGE, onIconAlignChange));
	}

	protected void renderOnIconElementChange(List<String> renderedAttributes, ToggleButton toggleButton) throws IOException {
		java.lang.String onIconElementChange = toggleButton.getOnIconElementChange();
		renderedAttributes.add(renderString(ToggleButton.ON_ICON_ELEMENT_CHANGE, onIconElementChange));
	}

	protected void renderOnPrimaryChange(List<String> renderedAttributes, ToggleButton toggleButton) throws IOException {
		java.lang.String onPrimaryChange = toggleButton.getOnPrimaryChange();
		renderedAttributes.add(renderString(ToggleButton.ON_PRIMARY_CHANGE, onPrimaryChange));
	}

	protected void renderOnTypeChange(List<String> renderedAttributes, ToggleButton toggleButton) throws IOException {
		java.lang.String onTypeChange = toggleButton.getOnTypeChange();
		renderedAttributes.add(renderString(ToggleButton.ON_TYPE_CHANGE, onTypeChange));
	}

}
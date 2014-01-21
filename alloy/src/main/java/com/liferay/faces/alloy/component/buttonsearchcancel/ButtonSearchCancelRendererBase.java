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
package com.liferay.faces.alloy.component.buttonsearchcancel;

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
public abstract class ButtonSearchCancelRendererBase extends RendererBase {

	// Private Constants
	private static final String AUI_MODULE_NAME = "aui-button";

	protected void encodeJavaScriptMain(FacesContext facesContext, UIComponent uiComponent) throws IOException {

		ButtonSearchCancel buttonSearchCancel = (ButtonSearchCancel) uiComponent;

		ResponseWriter responseWriter = facesContext.getResponseWriter();

		responseWriter.write("var buttonSearchCancel = new A.ButtonSearchCancel");
		responseWriter.write(StringPool.OPEN_PARENTHESIS);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedAttributes = new ArrayList<String>();

		if (buttonSearchCancel.getContainer() != null) {
			renderContainer(renderedAttributes, buttonSearchCancel);
		}

		if (buttonSearchCancel.getDestroyed() != null) {
			renderDestroyed(renderedAttributes, buttonSearchCancel);
		}

		if (buttonSearchCancel.getGutter() != null) {
			renderGutter(renderedAttributes, buttonSearchCancel);
		}

		if (buttonSearchCancel.getIconClass() != null) {
			renderIconClass(renderedAttributes, buttonSearchCancel);
		}

		if (buttonSearchCancel.getInitialized() != null) {
			renderInitialized(renderedAttributes, buttonSearchCancel);
		}

		if (buttonSearchCancel.getTrigger() != null) {
			renderTrigger(renderedAttributes, buttonSearchCancel);
		}

		if (buttonSearchCancel.getZIndex() != null) {
			renderZIndex(renderedAttributes, buttonSearchCancel);
		}


		for (String renderedAttribute : renderedAttributes) {
			responseWriter.write(renderedAttribute);
			responseWriter.write(StringPool.COMMA);
		}

		responseWriter.write("after");
		responseWriter.write(StringPool.COLON);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedAfterEvents = new ArrayList<String>();

		if (buttonSearchCancel.getAfterContainerChange() != null) {
			renderAfterContainerChange(renderedAfterEvents, buttonSearchCancel);
		}

		if (buttonSearchCancel.getAfterDestroyedChange() != null) {
			renderAfterDestroyedChange(renderedAfterEvents, buttonSearchCancel);
		}

		if (buttonSearchCancel.getAfterGutterChange() != null) {
			renderAfterGutterChange(renderedAfterEvents, buttonSearchCancel);
		}

		if (buttonSearchCancel.getAfterIconClassChange() != null) {
			renderAfterIconClassChange(renderedAfterEvents, buttonSearchCancel);
		}

		if (buttonSearchCancel.getAfterInitializedChange() != null) {
			renderAfterInitializedChange(renderedAfterEvents, buttonSearchCancel);
		}

		if (buttonSearchCancel.getAfterTriggerChange() != null) {
			renderAfterTriggerChange(renderedAfterEvents, buttonSearchCancel);
		}

		if (buttonSearchCancel.getAfterZIndexChange() != null) {
			renderAfterZIndexChange(renderedAfterEvents, buttonSearchCancel);
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

		if (buttonSearchCancel.getOnContainerChange() != null) {
			renderOnContainerChange(renderedOnEvents, buttonSearchCancel);
		}

		if (buttonSearchCancel.getOnDestroyedChange() != null) {
			renderOnDestroyedChange(renderedOnEvents, buttonSearchCancel);
		}

		if (buttonSearchCancel.getOnGutterChange() != null) {
			renderOnGutterChange(renderedOnEvents, buttonSearchCancel);
		}

		if (buttonSearchCancel.getOnIconClassChange() != null) {
			renderOnIconClassChange(renderedOnEvents, buttonSearchCancel);
		}

		if (buttonSearchCancel.getOnInitializedChange() != null) {
			renderOnInitializedChange(renderedOnEvents, buttonSearchCancel);
		}

		if (buttonSearchCancel.getOnTriggerChange() != null) {
			renderOnTriggerChange(renderedOnEvents, buttonSearchCancel);
		}

		if (buttonSearchCancel.getOnZIndexChange() != null) {
			renderOnZIndexChange(renderedOnEvents, buttonSearchCancel);
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

	protected void renderContainer(List<String> renderedAttributes, ButtonSearchCancel buttonSearchCancel) throws IOException {
		java.lang.String container = buttonSearchCancel.getContainer();
		renderedAttributes.add(renderString(ButtonSearchCancel.CONTAINER, container));
	}

	protected void renderDestroyed(List<String> renderedAttributes, ButtonSearchCancel buttonSearchCancel) throws IOException {
		java.lang.Boolean destroyed = buttonSearchCancel.getDestroyed();
		renderedAttributes.add(renderBoolean(ButtonSearchCancel.DESTROYED, destroyed));
	}

	protected void renderGutter(List<String> renderedAttributes, ButtonSearchCancel buttonSearchCancel) throws IOException {
		java.lang.Object gutter = buttonSearchCancel.getGutter();
		renderedAttributes.add(renderArray(ButtonSearchCancel.GUTTER, gutter));
	}

	protected void renderIconClass(List<String> renderedAttributes, ButtonSearchCancel buttonSearchCancel) throws IOException {
		java.lang.String iconClass = buttonSearchCancel.getIconClass();
		renderedAttributes.add(renderString(ButtonSearchCancel.ICON_CLASS, iconClass));
	}

	protected void renderInitialized(List<String> renderedAttributes, ButtonSearchCancel buttonSearchCancel) throws IOException {
		java.lang.Boolean initialized = buttonSearchCancel.getInitialized();
		renderedAttributes.add(renderBoolean(ButtonSearchCancel.INITIALIZED, initialized));
	}

	protected void renderTrigger(List<String> renderedAttributes, ButtonSearchCancel buttonSearchCancel) throws IOException {
		java.lang.String trigger = buttonSearchCancel.getTrigger();
		renderedAttributes.add(renderString(ButtonSearchCancel.TRIGGER, trigger));
	}

	protected void renderZIndex(List<String> renderedAttributes, ButtonSearchCancel buttonSearchCancel) throws IOException {
		java.lang.Object zIndex = buttonSearchCancel.getZIndex();
		renderedAttributes.add(renderNumber(ButtonSearchCancel.Z_INDEX, zIndex));
	}

	protected void renderAfterContainerChange(List<String> renderedAttributes, ButtonSearchCancel buttonSearchCancel) throws IOException {
		java.lang.String afterContainerChange = buttonSearchCancel.getAfterContainerChange();
		renderedAttributes.add(renderString(ButtonSearchCancel.AFTER_CONTAINER_CHANGE, afterContainerChange));
	}

	protected void renderAfterDestroyedChange(List<String> renderedAttributes, ButtonSearchCancel buttonSearchCancel) throws IOException {
		java.lang.String afterDestroyedChange = buttonSearchCancel.getAfterDestroyedChange();
		renderedAttributes.add(renderString(ButtonSearchCancel.AFTER_DESTROYED_CHANGE, afterDestroyedChange));
	}

	protected void renderAfterGutterChange(List<String> renderedAttributes, ButtonSearchCancel buttonSearchCancel) throws IOException {
		java.lang.String afterGutterChange = buttonSearchCancel.getAfterGutterChange();
		renderedAttributes.add(renderString(ButtonSearchCancel.AFTER_GUTTER_CHANGE, afterGutterChange));
	}

	protected void renderAfterIconClassChange(List<String> renderedAttributes, ButtonSearchCancel buttonSearchCancel) throws IOException {
		java.lang.String afterIconClassChange = buttonSearchCancel.getAfterIconClassChange();
		renderedAttributes.add(renderString(ButtonSearchCancel.AFTER_ICON_CLASS_CHANGE, afterIconClassChange));
	}

	protected void renderAfterInitializedChange(List<String> renderedAttributes, ButtonSearchCancel buttonSearchCancel) throws IOException {
		java.lang.String afterInitializedChange = buttonSearchCancel.getAfterInitializedChange();
		renderedAttributes.add(renderString(ButtonSearchCancel.AFTER_INITIALIZED_CHANGE, afterInitializedChange));
	}

	protected void renderAfterTriggerChange(List<String> renderedAttributes, ButtonSearchCancel buttonSearchCancel) throws IOException {
		java.lang.String afterTriggerChange = buttonSearchCancel.getAfterTriggerChange();
		renderedAttributes.add(renderString(ButtonSearchCancel.AFTER_TRIGGER_CHANGE, afterTriggerChange));
	}

	protected void renderAfterZIndexChange(List<String> renderedAttributes, ButtonSearchCancel buttonSearchCancel) throws IOException {
		java.lang.String afterZIndexChange = buttonSearchCancel.getAfterZIndexChange();
		renderedAttributes.add(renderString(ButtonSearchCancel.AFTER_ZINDEX_CHANGE, afterZIndexChange));
	}

	protected void renderOnContainerChange(List<String> renderedAttributes, ButtonSearchCancel buttonSearchCancel) throws IOException {
		java.lang.String onContainerChange = buttonSearchCancel.getOnContainerChange();
		renderedAttributes.add(renderString(ButtonSearchCancel.ON_CONTAINER_CHANGE, onContainerChange));
	}

	protected void renderOnDestroyedChange(List<String> renderedAttributes, ButtonSearchCancel buttonSearchCancel) throws IOException {
		java.lang.String onDestroyedChange = buttonSearchCancel.getOnDestroyedChange();
		renderedAttributes.add(renderString(ButtonSearchCancel.ON_DESTROYED_CHANGE, onDestroyedChange));
	}

	protected void renderOnGutterChange(List<String> renderedAttributes, ButtonSearchCancel buttonSearchCancel) throws IOException {
		java.lang.String onGutterChange = buttonSearchCancel.getOnGutterChange();
		renderedAttributes.add(renderString(ButtonSearchCancel.ON_GUTTER_CHANGE, onGutterChange));
	}

	protected void renderOnIconClassChange(List<String> renderedAttributes, ButtonSearchCancel buttonSearchCancel) throws IOException {
		java.lang.String onIconClassChange = buttonSearchCancel.getOnIconClassChange();
		renderedAttributes.add(renderString(ButtonSearchCancel.ON_ICON_CLASS_CHANGE, onIconClassChange));
	}

	protected void renderOnInitializedChange(List<String> renderedAttributes, ButtonSearchCancel buttonSearchCancel) throws IOException {
		java.lang.String onInitializedChange = buttonSearchCancel.getOnInitializedChange();
		renderedAttributes.add(renderString(ButtonSearchCancel.ON_INITIALIZED_CHANGE, onInitializedChange));
	}

	protected void renderOnTriggerChange(List<String> renderedAttributes, ButtonSearchCancel buttonSearchCancel) throws IOException {
		java.lang.String onTriggerChange = buttonSearchCancel.getOnTriggerChange();
		renderedAttributes.add(renderString(ButtonSearchCancel.ON_TRIGGER_CHANGE, onTriggerChange));
	}

	protected void renderOnZIndexChange(List<String> renderedAttributes, ButtonSearchCancel buttonSearchCancel) throws IOException {
		java.lang.String onZIndexChange = buttonSearchCancel.getOnZIndexChange();
		renderedAttributes.add(renderString(ButtonSearchCancel.ON_ZINDEX_CHANGE, onZIndexChange));
	}

}
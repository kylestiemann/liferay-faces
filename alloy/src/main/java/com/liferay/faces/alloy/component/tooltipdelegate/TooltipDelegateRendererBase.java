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
package com.liferay.faces.alloy.component.tooltipdelegate;

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
public abstract class TooltipDelegateRendererBase extends RendererBase {

	// Private Constants
	private static final String AUI_MODULE_NAME = "aui-tooltip";

	protected void encodeJavaScriptMain(FacesContext facesContext, UIComponent uiComponent) throws IOException {

		TooltipDelegate tooltipDelegate = (TooltipDelegate) uiComponent;

		ResponseWriter responseWriter = facesContext.getResponseWriter();

		responseWriter.write("var tooltipDelegate = new A.TooltipDelegate");
		responseWriter.write(StringPool.OPEN_PARENTHESIS);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedAttributes = new ArrayList<String>();

		if (tooltipDelegate.getAlign() != null) {
			renderAlign(renderedAttributes, tooltipDelegate);
		}

		if (tooltipDelegate.getContainer() != null) {
			renderContainer(renderedAttributes, tooltipDelegate);
		}

		if (tooltipDelegate.getDestroyed() != null) {
			renderDestroyed(renderedAttributes, tooltipDelegate);
		}

		if (tooltipDelegate.getDuration() != null) {
			renderDuration(renderedAttributes, tooltipDelegate);
		}

		if (tooltipDelegate.getInitialized() != null) {
			renderInitialized(renderedAttributes, tooltipDelegate);
		}

		if (tooltipDelegate.getOpacity() != null) {
			renderOpacity(renderedAttributes, tooltipDelegate);
		}

		if (tooltipDelegate.getTriggerHideEvent() != null) {
			renderTriggerHideEvent(renderedAttributes, tooltipDelegate);
		}

		if (tooltipDelegate.getTriggerShowEvent() != null) {
			renderTriggerShowEvent(renderedAttributes, tooltipDelegate);
		}

		if (tooltipDelegate.getZIndex() != null) {
			renderZIndex(renderedAttributes, tooltipDelegate);
		}


		for (String renderedAttribute : renderedAttributes) {
			responseWriter.write(renderedAttribute);
			responseWriter.write(StringPool.COMMA);
		}

		responseWriter.write("after");
		responseWriter.write(StringPool.COLON);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedAfterEvents = new ArrayList<String>();

		if (tooltipDelegate.getAfterAlignChange() != null) {
			renderAfterAlignChange(renderedAfterEvents, tooltipDelegate);
		}

		if (tooltipDelegate.getAfterContainerChange() != null) {
			renderAfterContainerChange(renderedAfterEvents, tooltipDelegate);
		}

		if (tooltipDelegate.getAfterDestroyedChange() != null) {
			renderAfterDestroyedChange(renderedAfterEvents, tooltipDelegate);
		}

		if (tooltipDelegate.getAfterDurationChange() != null) {
			renderAfterDurationChange(renderedAfterEvents, tooltipDelegate);
		}

		if (tooltipDelegate.getAfterInitializedChange() != null) {
			renderAfterInitializedChange(renderedAfterEvents, tooltipDelegate);
		}

		if (tooltipDelegate.getAfterOpacityChange() != null) {
			renderAfterOpacityChange(renderedAfterEvents, tooltipDelegate);
		}

		if (tooltipDelegate.getAfterTriggerHideEventChange() != null) {
			renderAfterTriggerHideEventChange(renderedAfterEvents, tooltipDelegate);
		}

		if (tooltipDelegate.getAfterTriggerShowEventChange() != null) {
			renderAfterTriggerShowEventChange(renderedAfterEvents, tooltipDelegate);
		}

		if (tooltipDelegate.getAfterZIndexChange() != null) {
			renderAfterZIndexChange(renderedAfterEvents, tooltipDelegate);
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

		if (tooltipDelegate.getOnAlignChange() != null) {
			renderOnAlignChange(renderedOnEvents, tooltipDelegate);
		}

		if (tooltipDelegate.getOnContainerChange() != null) {
			renderOnContainerChange(renderedOnEvents, tooltipDelegate);
		}

		if (tooltipDelegate.getOnDestroyedChange() != null) {
			renderOnDestroyedChange(renderedOnEvents, tooltipDelegate);
		}

		if (tooltipDelegate.getOnDurationChange() != null) {
			renderOnDurationChange(renderedOnEvents, tooltipDelegate);
		}

		if (tooltipDelegate.getOnInitializedChange() != null) {
			renderOnInitializedChange(renderedOnEvents, tooltipDelegate);
		}

		if (tooltipDelegate.getOnOpacityChange() != null) {
			renderOnOpacityChange(renderedOnEvents, tooltipDelegate);
		}

		if (tooltipDelegate.getOnTriggerHideEventChange() != null) {
			renderOnTriggerHideEventChange(renderedOnEvents, tooltipDelegate);
		}

		if (tooltipDelegate.getOnTriggerShowEventChange() != null) {
			renderOnTriggerShowEventChange(renderedOnEvents, tooltipDelegate);
		}

		if (tooltipDelegate.getOnZIndexChange() != null) {
			renderOnZIndexChange(renderedOnEvents, tooltipDelegate);
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

	protected void renderAlign(List<String> renderedAttributes, TooltipDelegate tooltipDelegate) throws IOException {
		java.lang.Object align = tooltipDelegate.getAlign();
		renderedAttributes.add(renderObject(TooltipDelegate.ALIGN, align));
	}

	protected void renderContainer(List<String> renderedAttributes, TooltipDelegate tooltipDelegate) throws IOException {
		java.lang.String container = tooltipDelegate.getContainer();
		renderedAttributes.add(renderString(TooltipDelegate.CONTAINER, container));
	}

	protected void renderDestroyed(List<String> renderedAttributes, TooltipDelegate tooltipDelegate) throws IOException {
		java.lang.Boolean destroyed = tooltipDelegate.getDestroyed();
		renderedAttributes.add(renderBoolean(TooltipDelegate.DESTROYED, destroyed));
	}

	protected void renderDuration(List<String> renderedAttributes, TooltipDelegate tooltipDelegate) throws IOException {
		java.lang.Object duration = tooltipDelegate.getDuration();
		renderedAttributes.add(renderString(TooltipDelegate.DURATION, duration));
	}

	protected void renderInitialized(List<String> renderedAttributes, TooltipDelegate tooltipDelegate) throws IOException {
		java.lang.Boolean initialized = tooltipDelegate.getInitialized();
		renderedAttributes.add(renderBoolean(TooltipDelegate.INITIALIZED, initialized));
	}

	protected void renderOpacity(List<String> renderedAttributes, TooltipDelegate tooltipDelegate) throws IOException {
		java.lang.Object opacity = tooltipDelegate.getOpacity();
		renderedAttributes.add(renderString(TooltipDelegate.OPACITY, opacity));
	}

	protected void renderTriggerHideEvent(List<String> renderedAttributes, TooltipDelegate tooltipDelegate) throws IOException {
		java.lang.String triggerHideEvent = tooltipDelegate.getTriggerHideEvent();
		renderedAttributes.add(renderString(TooltipDelegate.TRIGGER_HIDE_EVENT, triggerHideEvent));
	}

	protected void renderTriggerShowEvent(List<String> renderedAttributes, TooltipDelegate tooltipDelegate) throws IOException {
		java.lang.String triggerShowEvent = tooltipDelegate.getTriggerShowEvent();
		renderedAttributes.add(renderString(TooltipDelegate.TRIGGER_SHOW_EVENT, triggerShowEvent));
	}

	protected void renderZIndex(List<String> renderedAttributes, TooltipDelegate tooltipDelegate) throws IOException {
		java.lang.Object zIndex = tooltipDelegate.getZIndex();
		renderedAttributes.add(renderString(TooltipDelegate.Z_INDEX, zIndex));
	}

	protected void renderAfterAlignChange(List<String> renderedAttributes, TooltipDelegate tooltipDelegate) throws IOException {
		java.lang.String afterAlignChange = tooltipDelegate.getAfterAlignChange();
		renderedAttributes.add(renderString(TooltipDelegate.AFTER_ALIGN_CHANGE, afterAlignChange));
	}

	protected void renderAfterContainerChange(List<String> renderedAttributes, TooltipDelegate tooltipDelegate) throws IOException {
		java.lang.String afterContainerChange = tooltipDelegate.getAfterContainerChange();
		renderedAttributes.add(renderString(TooltipDelegate.AFTER_CONTAINER_CHANGE, afterContainerChange));
	}

	protected void renderAfterDestroyedChange(List<String> renderedAttributes, TooltipDelegate tooltipDelegate) throws IOException {
		java.lang.String afterDestroyedChange = tooltipDelegate.getAfterDestroyedChange();
		renderedAttributes.add(renderString(TooltipDelegate.AFTER_DESTROYED_CHANGE, afterDestroyedChange));
	}

	protected void renderAfterDurationChange(List<String> renderedAttributes, TooltipDelegate tooltipDelegate) throws IOException {
		java.lang.String afterDurationChange = tooltipDelegate.getAfterDurationChange();
		renderedAttributes.add(renderString(TooltipDelegate.AFTER_DURATION_CHANGE, afterDurationChange));
	}

	protected void renderAfterInitializedChange(List<String> renderedAttributes, TooltipDelegate tooltipDelegate) throws IOException {
		java.lang.String afterInitializedChange = tooltipDelegate.getAfterInitializedChange();
		renderedAttributes.add(renderString(TooltipDelegate.AFTER_INITIALIZED_CHANGE, afterInitializedChange));
	}

	protected void renderAfterOpacityChange(List<String> renderedAttributes, TooltipDelegate tooltipDelegate) throws IOException {
		java.lang.String afterOpacityChange = tooltipDelegate.getAfterOpacityChange();
		renderedAttributes.add(renderString(TooltipDelegate.AFTER_OPACITY_CHANGE, afterOpacityChange));
	}

	protected void renderAfterTriggerHideEventChange(List<String> renderedAttributes, TooltipDelegate tooltipDelegate) throws IOException {
		java.lang.String afterTriggerHideEventChange = tooltipDelegate.getAfterTriggerHideEventChange();
		renderedAttributes.add(renderString(TooltipDelegate.AFTER_TRIGGER_HIDE_EVENT_CHANGE, afterTriggerHideEventChange));
	}

	protected void renderAfterTriggerShowEventChange(List<String> renderedAttributes, TooltipDelegate tooltipDelegate) throws IOException {
		java.lang.String afterTriggerShowEventChange = tooltipDelegate.getAfterTriggerShowEventChange();
		renderedAttributes.add(renderString(TooltipDelegate.AFTER_TRIGGER_SHOW_EVENT_CHANGE, afterTriggerShowEventChange));
	}

	protected void renderAfterZIndexChange(List<String> renderedAttributes, TooltipDelegate tooltipDelegate) throws IOException {
		java.lang.String afterZIndexChange = tooltipDelegate.getAfterZIndexChange();
		renderedAttributes.add(renderString(TooltipDelegate.AFTER_ZINDEX_CHANGE, afterZIndexChange));
	}

	protected void renderOnAlignChange(List<String> renderedAttributes, TooltipDelegate tooltipDelegate) throws IOException {
		java.lang.String onAlignChange = tooltipDelegate.getOnAlignChange();
		renderedAttributes.add(renderString(TooltipDelegate.ON_ALIGN_CHANGE, onAlignChange));
	}

	protected void renderOnContainerChange(List<String> renderedAttributes, TooltipDelegate tooltipDelegate) throws IOException {
		java.lang.String onContainerChange = tooltipDelegate.getOnContainerChange();
		renderedAttributes.add(renderString(TooltipDelegate.ON_CONTAINER_CHANGE, onContainerChange));
	}

	protected void renderOnDestroyedChange(List<String> renderedAttributes, TooltipDelegate tooltipDelegate) throws IOException {
		java.lang.String onDestroyedChange = tooltipDelegate.getOnDestroyedChange();
		renderedAttributes.add(renderString(TooltipDelegate.ON_DESTROYED_CHANGE, onDestroyedChange));
	}

	protected void renderOnDurationChange(List<String> renderedAttributes, TooltipDelegate tooltipDelegate) throws IOException {
		java.lang.String onDurationChange = tooltipDelegate.getOnDurationChange();
		renderedAttributes.add(renderString(TooltipDelegate.ON_DURATION_CHANGE, onDurationChange));
	}

	protected void renderOnInitializedChange(List<String> renderedAttributes, TooltipDelegate tooltipDelegate) throws IOException {
		java.lang.String onInitializedChange = tooltipDelegate.getOnInitializedChange();
		renderedAttributes.add(renderString(TooltipDelegate.ON_INITIALIZED_CHANGE, onInitializedChange));
	}

	protected void renderOnOpacityChange(List<String> renderedAttributes, TooltipDelegate tooltipDelegate) throws IOException {
		java.lang.String onOpacityChange = tooltipDelegate.getOnOpacityChange();
		renderedAttributes.add(renderString(TooltipDelegate.ON_OPACITY_CHANGE, onOpacityChange));
	}

	protected void renderOnTriggerHideEventChange(List<String> renderedAttributes, TooltipDelegate tooltipDelegate) throws IOException {
		java.lang.String onTriggerHideEventChange = tooltipDelegate.getOnTriggerHideEventChange();
		renderedAttributes.add(renderString(TooltipDelegate.ON_TRIGGER_HIDE_EVENT_CHANGE, onTriggerHideEventChange));
	}

	protected void renderOnTriggerShowEventChange(List<String> renderedAttributes, TooltipDelegate tooltipDelegate) throws IOException {
		java.lang.String onTriggerShowEventChange = tooltipDelegate.getOnTriggerShowEventChange();
		renderedAttributes.add(renderString(TooltipDelegate.ON_TRIGGER_SHOW_EVENT_CHANGE, onTriggerShowEventChange));
	}

	protected void renderOnZIndexChange(List<String> renderedAttributes, TooltipDelegate tooltipDelegate) throws IOException {
		java.lang.String onZIndexChange = tooltipDelegate.getOnZIndexChange();
		renderedAttributes.add(renderString(TooltipDelegate.ON_ZINDEX_CHANGE, onZIndexChange));
	}

}
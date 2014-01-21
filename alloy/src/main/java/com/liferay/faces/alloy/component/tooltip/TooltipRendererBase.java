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
package com.liferay.faces.alloy.component.tooltip;

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
public abstract class TooltipRendererBase extends RendererBase {

	// Private Constants
	private static final String AUI_MODULE_NAME = "aui-tooltip";

	protected void encodeJavaScriptMain(FacesContext facesContext, UIComponent uiComponent) throws IOException {

		Tooltip tooltip = (Tooltip) uiComponent;

		ResponseWriter responseWriter = facesContext.getResponseWriter();

		responseWriter.write("var tooltip = new A.Tooltip");
		responseWriter.write(StringPool.OPEN_PARENTHESIS);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedAttributes = new ArrayList<String>();

		if (tooltip.getAlign() != null) {
			renderAlign(renderedAttributes, tooltip);
		}

		if (tooltip.getAlignOn() != null) {
			renderAlignOn(renderedAttributes, tooltip);
		}

		if (tooltip.getTooltipBodyContent() != null) {
			renderTooltipBodyContent(renderedAttributes, tooltip);
		}

		if (tooltip.getBoundingBox() != null) {
			renderBoundingBox(renderedAttributes, tooltip);
		}

		if (tooltip.getCentered() != null) {
			renderCentered(renderedAttributes, tooltip);
		}

		if (tooltip.getConstrain() != null) {
			renderConstrain(renderedAttributes, tooltip);
		}

		if (tooltip.getContentBox() != null) {
			renderContentBox(renderedAttributes, tooltip);
		}

		if (tooltip.getDestroyed() != null) {
			renderDestroyed(renderedAttributes, tooltip);
		}

		if (tooltip.getDisabled() != null) {
			renderDisabled(renderedAttributes, tooltip);
		}

		if (tooltip.getDuration() != null) {
			renderDuration(renderedAttributes, tooltip);
		}

		if (tooltip.getFillHeight() != null) {
			renderFillHeight(renderedAttributes, tooltip);
		}

		if (tooltip.getFocused() != null) {
			renderFocused(renderedAttributes, tooltip);
		}

		if (tooltip.getFooterContent() != null) {
			renderFooterContent(renderedAttributes, tooltip);
		}

		if (tooltip.getFormatter() != null) {
			renderFormatter(renderedAttributes, tooltip);
		}

		if (tooltip.getHeaderContent() != null) {
			renderHeaderContent(renderedAttributes, tooltip);
		}

		if (tooltip.getHeight() != null) {
			renderHeight(renderedAttributes, tooltip);
		}

		if (tooltip.getHideOn() != null) {
			renderHideOn(renderedAttributes, tooltip);
		}

		if (tooltip.getTooltipId() != null) {
			renderTooltipId(renderedAttributes, tooltip);
		}

		if (tooltip.getInitialized() != null) {
			renderInitialized(renderedAttributes, tooltip);
		}

		if (tooltip.getTooltipLocale() != null) {
			renderTooltipLocale(renderedAttributes, tooltip);
		}

		if (tooltip.getOpacity() != null) {
			renderOpacity(renderedAttributes, tooltip);
		}

		if (tooltip.getPreventOverlap() != null) {
			renderPreventOverlap(renderedAttributes, tooltip);
		}

		if (tooltip.getRender() != null) {
			renderRender(renderedAttributes, tooltip);
		}

		if (tooltip.getRendered() != null) {
			renderRendered(renderedAttributes, tooltip);
		}

		if (tooltip.getShim() != null) {
			renderShim(renderedAttributes, tooltip);
		}

		if (tooltip.getSrcNode() != null) {
			renderSrcNode(renderedAttributes, tooltip);
		}

		if (tooltip.getStrings() != null) {
			renderStrings(renderedAttributes, tooltip);
		}

		if (tooltip.getTabIndex() != null) {
			renderTabIndex(renderedAttributes, tooltip);
		}

		if (tooltip.getToolbarPosition() != null) {
			renderToolbarPosition(renderedAttributes, tooltip);
		}

		if (tooltip.getToolbars() != null) {
			renderToolbars(renderedAttributes, tooltip);
		}

		if (tooltip.getTriggerHideEvent() != null) {
			renderTriggerHideEvent(renderedAttributes, tooltip);
		}

		if (tooltip.getTriggerShowEvent() != null) {
			renderTriggerShowEvent(renderedAttributes, tooltip);
		}

		if (tooltip.getVisible() != null) {
			renderVisible(renderedAttributes, tooltip);
		}

		if (tooltip.getWidth() != null) {
			renderWidth(renderedAttributes, tooltip);
		}

		if (tooltip.getX() != null) {
			renderX(renderedAttributes, tooltip);
		}

		if (tooltip.getXy() != null) {
			renderXy(renderedAttributes, tooltip);
		}

		if (tooltip.getY() != null) {
			renderY(renderedAttributes, tooltip);
		}

		if (tooltip.getZIndex() != null) {
			renderZIndex(renderedAttributes, tooltip);
		}


		for (String renderedAttribute : renderedAttributes) {
			responseWriter.write(renderedAttribute);
			responseWriter.write(StringPool.COMMA);
		}

		responseWriter.write("after");
		responseWriter.write(StringPool.COLON);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedAfterEvents = new ArrayList<String>();

		if (tooltip.getAfterAlignChange() != null) {
			renderAfterAlignChange(renderedAfterEvents, tooltip);
		}

		if (tooltip.getAfterAlignOnChange() != null) {
			renderAfterAlignOnChange(renderedAfterEvents, tooltip);
		}

		if (tooltip.getAfterBodyContentChange() != null) {
			renderAfterBodyContentChange(renderedAfterEvents, tooltip);
		}

		if (tooltip.getAfterBoundingBoxChange() != null) {
			renderAfterBoundingBoxChange(renderedAfterEvents, tooltip);
		}

		if (tooltip.getAfterCenteredChange() != null) {
			renderAfterCenteredChange(renderedAfterEvents, tooltip);
		}

		if (tooltip.getAfterConstrainChange() != null) {
			renderAfterConstrainChange(renderedAfterEvents, tooltip);
		}

		if (tooltip.getAfterContentBoxChange() != null) {
			renderAfterContentBoxChange(renderedAfterEvents, tooltip);
		}

		if (tooltip.getAfterDestroyedChange() != null) {
			renderAfterDestroyedChange(renderedAfterEvents, tooltip);
		}

		if (tooltip.getAfterDisabledChange() != null) {
			renderAfterDisabledChange(renderedAfterEvents, tooltip);
		}

		if (tooltip.getAfterDurationChange() != null) {
			renderAfterDurationChange(renderedAfterEvents, tooltip);
		}

		if (tooltip.getAfterFillHeightChange() != null) {
			renderAfterFillHeightChange(renderedAfterEvents, tooltip);
		}

		if (tooltip.getAfterFocusedChange() != null) {
			renderAfterFocusedChange(renderedAfterEvents, tooltip);
		}

		if (tooltip.getAfterFooterContentChange() != null) {
			renderAfterFooterContentChange(renderedAfterEvents, tooltip);
		}

		if (tooltip.getAfterFormatterChange() != null) {
			renderAfterFormatterChange(renderedAfterEvents, tooltip);
		}

		if (tooltip.getAfterHeaderContentChange() != null) {
			renderAfterHeaderContentChange(renderedAfterEvents, tooltip);
		}

		if (tooltip.getAfterHeightChange() != null) {
			renderAfterHeightChange(renderedAfterEvents, tooltip);
		}

		if (tooltip.getAfterHideOnChange() != null) {
			renderAfterHideOnChange(renderedAfterEvents, tooltip);
		}

		if (tooltip.getAfterIdChange() != null) {
			renderAfterIdChange(renderedAfterEvents, tooltip);
		}

		if (tooltip.getAfterInitializedChange() != null) {
			renderAfterInitializedChange(renderedAfterEvents, tooltip);
		}

		if (tooltip.getAfterLocaleChange() != null) {
			renderAfterLocaleChange(renderedAfterEvents, tooltip);
		}

		if (tooltip.getAfterOpacityChange() != null) {
			renderAfterOpacityChange(renderedAfterEvents, tooltip);
		}

		if (tooltip.getAfterPreventOverlapChange() != null) {
			renderAfterPreventOverlapChange(renderedAfterEvents, tooltip);
		}

		if (tooltip.getAfterRenderChange() != null) {
			renderAfterRenderChange(renderedAfterEvents, tooltip);
		}

		if (tooltip.getAfterRenderedChange() != null) {
			renderAfterRenderedChange(renderedAfterEvents, tooltip);
		}

		if (tooltip.getAfterShimChange() != null) {
			renderAfterShimChange(renderedAfterEvents, tooltip);
		}

		if (tooltip.getAfterSrcNodeChange() != null) {
			renderAfterSrcNodeChange(renderedAfterEvents, tooltip);
		}

		if (tooltip.getAfterStringsChange() != null) {
			renderAfterStringsChange(renderedAfterEvents, tooltip);
		}

		if (tooltip.getAfterTabIndexChange() != null) {
			renderAfterTabIndexChange(renderedAfterEvents, tooltip);
		}

		if (tooltip.getAfterToolbarPositionChange() != null) {
			renderAfterToolbarPositionChange(renderedAfterEvents, tooltip);
		}

		if (tooltip.getAfterToolbarsChange() != null) {
			renderAfterToolbarsChange(renderedAfterEvents, tooltip);
		}

		if (tooltip.getAfterTriggerHideEventChange() != null) {
			renderAfterTriggerHideEventChange(renderedAfterEvents, tooltip);
		}

		if (tooltip.getAfterTriggerShowEventChange() != null) {
			renderAfterTriggerShowEventChange(renderedAfterEvents, tooltip);
		}

		if (tooltip.getAfterVisibleChange() != null) {
			renderAfterVisibleChange(renderedAfterEvents, tooltip);
		}

		if (tooltip.getAfterWidthChange() != null) {
			renderAfterWidthChange(renderedAfterEvents, tooltip);
		}

		if (tooltip.getAfterXChange() != null) {
			renderAfterXChange(renderedAfterEvents, tooltip);
		}

		if (tooltip.getAfterXyChange() != null) {
			renderAfterXyChange(renderedAfterEvents, tooltip);
		}

		if (tooltip.getAfterYChange() != null) {
			renderAfterYChange(renderedAfterEvents, tooltip);
		}

		if (tooltip.getAfterZIndexChange() != null) {
			renderAfterZIndexChange(renderedAfterEvents, tooltip);
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

		if (tooltip.getOnAlignChange() != null) {
			renderOnAlignChange(renderedOnEvents, tooltip);
		}

		if (tooltip.getOnAlignOnChange() != null) {
			renderOnAlignOnChange(renderedOnEvents, tooltip);
		}

		if (tooltip.getOnBodyContentChange() != null) {
			renderOnBodyContentChange(renderedOnEvents, tooltip);
		}

		if (tooltip.getOnBoundingBoxChange() != null) {
			renderOnBoundingBoxChange(renderedOnEvents, tooltip);
		}

		if (tooltip.getOnCenteredChange() != null) {
			renderOnCenteredChange(renderedOnEvents, tooltip);
		}

		if (tooltip.getOnConstrainChange() != null) {
			renderOnConstrainChange(renderedOnEvents, tooltip);
		}

		if (tooltip.getOnContentBoxChange() != null) {
			renderOnContentBoxChange(renderedOnEvents, tooltip);
		}

		if (tooltip.getOnDestroyedChange() != null) {
			renderOnDestroyedChange(renderedOnEvents, tooltip);
		}

		if (tooltip.getOnDisabledChange() != null) {
			renderOnDisabledChange(renderedOnEvents, tooltip);
		}

		if (tooltip.getOnDurationChange() != null) {
			renderOnDurationChange(renderedOnEvents, tooltip);
		}

		if (tooltip.getOnFillHeightChange() != null) {
			renderOnFillHeightChange(renderedOnEvents, tooltip);
		}

		if (tooltip.getOnFocusedChange() != null) {
			renderOnFocusedChange(renderedOnEvents, tooltip);
		}

		if (tooltip.getOnFooterContentChange() != null) {
			renderOnFooterContentChange(renderedOnEvents, tooltip);
		}

		if (tooltip.getOnFormatterChange() != null) {
			renderOnFormatterChange(renderedOnEvents, tooltip);
		}

		if (tooltip.getOnHeaderContentChange() != null) {
			renderOnHeaderContentChange(renderedOnEvents, tooltip);
		}

		if (tooltip.getOnHeightChange() != null) {
			renderOnHeightChange(renderedOnEvents, tooltip);
		}

		if (tooltip.getOnHideOnChange() != null) {
			renderOnHideOnChange(renderedOnEvents, tooltip);
		}

		if (tooltip.getOnIdChange() != null) {
			renderOnIdChange(renderedOnEvents, tooltip);
		}

		if (tooltip.getOnInitializedChange() != null) {
			renderOnInitializedChange(renderedOnEvents, tooltip);
		}

		if (tooltip.getOnLocaleChange() != null) {
			renderOnLocaleChange(renderedOnEvents, tooltip);
		}

		if (tooltip.getOnOpacityChange() != null) {
			renderOnOpacityChange(renderedOnEvents, tooltip);
		}

		if (tooltip.getOnPreventOverlapChange() != null) {
			renderOnPreventOverlapChange(renderedOnEvents, tooltip);
		}

		if (tooltip.getOnRenderChange() != null) {
			renderOnRenderChange(renderedOnEvents, tooltip);
		}

		if (tooltip.getOnRenderedChange() != null) {
			renderOnRenderedChange(renderedOnEvents, tooltip);
		}

		if (tooltip.getOnShimChange() != null) {
			renderOnShimChange(renderedOnEvents, tooltip);
		}

		if (tooltip.getOnSrcNodeChange() != null) {
			renderOnSrcNodeChange(renderedOnEvents, tooltip);
		}

		if (tooltip.getOnStringsChange() != null) {
			renderOnStringsChange(renderedOnEvents, tooltip);
		}

		if (tooltip.getOnTabIndexChange() != null) {
			renderOnTabIndexChange(renderedOnEvents, tooltip);
		}

		if (tooltip.getOnToolbarPositionChange() != null) {
			renderOnToolbarPositionChange(renderedOnEvents, tooltip);
		}

		if (tooltip.getOnToolbarsChange() != null) {
			renderOnToolbarsChange(renderedOnEvents, tooltip);
		}

		if (tooltip.getOnTriggerHideEventChange() != null) {
			renderOnTriggerHideEventChange(renderedOnEvents, tooltip);
		}

		if (tooltip.getOnTriggerShowEventChange() != null) {
			renderOnTriggerShowEventChange(renderedOnEvents, tooltip);
		}

		if (tooltip.getOnVisibleChange() != null) {
			renderOnVisibleChange(renderedOnEvents, tooltip);
		}

		if (tooltip.getOnWidthChange() != null) {
			renderOnWidthChange(renderedOnEvents, tooltip);
		}

		if (tooltip.getOnXChange() != null) {
			renderOnXChange(renderedOnEvents, tooltip);
		}

		if (tooltip.getOnXyChange() != null) {
			renderOnXyChange(renderedOnEvents, tooltip);
		}

		if (tooltip.getOnYChange() != null) {
			renderOnYChange(renderedOnEvents, tooltip);
		}

		if (tooltip.getOnZIndexChange() != null) {
			renderOnZIndexChange(renderedOnEvents, tooltip);
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

	protected void renderAlign(List<String> renderedAttributes, Tooltip tooltip) throws IOException {
		java.lang.Object align = tooltip.getAlign();
		renderedAttributes.add(renderObject(Tooltip.ALIGN, align));
	}

	protected void renderAlignOn(List<String> renderedAttributes, Tooltip tooltip) throws IOException {
		java.lang.Object alignOn = tooltip.getAlignOn();
		renderedAttributes.add(renderArray(Tooltip.ALIGN_ON, alignOn));
	}

	protected void renderTooltipBodyContent(List<String> renderedAttributes, Tooltip tooltip) throws IOException {
		java.lang.Object tooltipBodyContent = tooltip.getTooltipBodyContent();
		renderedAttributes.add(renderString(Tooltip.TOOLTIP_BODY_CONTENT, tooltipBodyContent));
	}

	protected void renderBoundingBox(List<String> renderedAttributes, Tooltip tooltip) throws IOException {
		java.lang.String boundingBox = tooltip.getBoundingBox();
		renderedAttributes.add(renderString(Tooltip.BOUNDING_BOX, boundingBox));
	}

	protected void renderCentered(List<String> renderedAttributes, Tooltip tooltip) throws IOException {
		java.lang.Object centered = tooltip.getCentered();
		renderedAttributes.add(renderString(Tooltip.CENTERED, centered));
	}

	protected void renderConstrain(List<String> renderedAttributes, Tooltip tooltip) throws IOException {
		java.lang.Object constrain = tooltip.getConstrain();
		renderedAttributes.add(renderString(Tooltip.CONSTRAIN, constrain));
	}

	protected void renderContentBox(List<String> renderedAttributes, Tooltip tooltip) throws IOException {
		java.lang.String contentBox = tooltip.getContentBox();
		renderedAttributes.add(renderString(Tooltip.CONTENT_BOX, contentBox));
	}

	protected void renderDestroyed(List<String> renderedAttributes, Tooltip tooltip) throws IOException {
		java.lang.Boolean destroyed = tooltip.getDestroyed();
		renderedAttributes.add(renderBoolean(Tooltip.DESTROYED, destroyed));
	}

	protected void renderDisabled(List<String> renderedAttributes, Tooltip tooltip) throws IOException {
		java.lang.Boolean disabled = tooltip.getDisabled();
		renderedAttributes.add(renderBoolean(Tooltip.DISABLED, disabled));
	}

	protected void renderDuration(List<String> renderedAttributes, Tooltip tooltip) throws IOException {
		java.lang.Object duration = tooltip.getDuration();
		renderedAttributes.add(renderString(Tooltip.DURATION, duration));
	}

	protected void renderFillHeight(List<String> renderedAttributes, Tooltip tooltip) throws IOException {
		java.lang.Object fillHeight = tooltip.getFillHeight();
		renderedAttributes.add(renderString(Tooltip.FILL_HEIGHT, fillHeight));
	}

	protected void renderFocused(List<String> renderedAttributes, Tooltip tooltip) throws IOException {
		java.lang.Boolean focused = tooltip.getFocused();
		renderedAttributes.add(renderBoolean(Tooltip.FOCUSED, focused));
	}

	protected void renderFooterContent(List<String> renderedAttributes, Tooltip tooltip) throws IOException {
		java.lang.Object footerContent = tooltip.getFooterContent();
		renderedAttributes.add(renderString(Tooltip.FOOTER_CONTENT, footerContent));
	}

	protected void renderFormatter(List<String> renderedAttributes, Tooltip tooltip) throws IOException {
		java.lang.Object formatter = tooltip.getFormatter();
		renderedAttributes.add(renderString(Tooltip.FORMATTER, formatter));
	}

	protected void renderHeaderContent(List<String> renderedAttributes, Tooltip tooltip) throws IOException {
		java.lang.Object headerContent = tooltip.getHeaderContent();
		renderedAttributes.add(renderString(Tooltip.HEADER_CONTENT, headerContent));
	}

	protected void renderHeight(List<String> renderedAttributes, Tooltip tooltip) throws IOException {
		java.lang.Object height = tooltip.getHeight();
		renderedAttributes.add(renderString(Tooltip.HEIGHT, height));
	}

	protected void renderHideOn(List<String> renderedAttributes, Tooltip tooltip) throws IOException {
		java.lang.Object hideOn = tooltip.getHideOn();
		renderedAttributes.add(renderArray(Tooltip.HIDE_ON, hideOn));
	}

	protected void renderTooltipId(List<String> renderedAttributes, Tooltip tooltip) throws IOException {
		java.lang.String tooltipId = tooltip.getTooltipId();
		renderedAttributes.add(renderString(Tooltip.TOOLTIP_ID, tooltipId));
	}

	protected void renderInitialized(List<String> renderedAttributes, Tooltip tooltip) throws IOException {
		java.lang.Boolean initialized = tooltip.getInitialized();
		renderedAttributes.add(renderBoolean(Tooltip.INITIALIZED, initialized));
	}

	protected void renderTooltipLocale(List<String> renderedAttributes, Tooltip tooltip) throws IOException {
		java.lang.String tooltipLocale = tooltip.getTooltipLocale();
		renderedAttributes.add(renderString(Tooltip.TOOLTIP_LOCALE, tooltipLocale));
	}

	protected void renderOpacity(List<String> renderedAttributes, Tooltip tooltip) throws IOException {
		java.lang.Object opacity = tooltip.getOpacity();
		renderedAttributes.add(renderString(Tooltip.OPACITY, opacity));
	}

	protected void renderPreventOverlap(List<String> renderedAttributes, Tooltip tooltip) throws IOException {
		java.lang.Boolean preventOverlap = tooltip.getPreventOverlap();
		renderedAttributes.add(renderBoolean(Tooltip.PREVENT_OVERLAP, preventOverlap));
	}

	protected void renderRender(List<String> renderedAttributes, Tooltip tooltip) throws IOException {
		java.lang.Object render = tooltip.getRender();
		renderedAttributes.add(renderString(Tooltip.RENDER, render));
	}

	protected void renderRendered(List<String> renderedAttributes, Tooltip tooltip) throws IOException {
		java.lang.Boolean rendered = tooltip.getRendered();
		renderedAttributes.add(renderBoolean(Tooltip.RENDERED, rendered));
	}

	protected void renderShim(List<String> renderedAttributes, Tooltip tooltip) throws IOException {
		java.lang.Boolean shim = tooltip.getShim();
		renderedAttributes.add(renderBoolean(Tooltip.SHIM, shim));
	}

	protected void renderSrcNode(List<String> renderedAttributes, Tooltip tooltip) throws IOException {
		java.lang.String srcNode = tooltip.getSrcNode();
		renderedAttributes.add(renderString(Tooltip.SRC_NODE, srcNode));
	}

	protected void renderStrings(List<String> renderedAttributes, Tooltip tooltip) throws IOException {
		java.lang.Object strings = tooltip.getStrings();
		renderedAttributes.add(renderObject(Tooltip.STRINGS, strings));
	}

	protected void renderTabIndex(List<String> renderedAttributes, Tooltip tooltip) throws IOException {
		java.lang.Object tabIndex = tooltip.getTabIndex();
		renderedAttributes.add(renderNumber(Tooltip.TAB_INDEX, tabIndex));
	}

	protected void renderToolbarPosition(List<String> renderedAttributes, Tooltip tooltip) throws IOException {
		java.lang.Object toolbarPosition = tooltip.getToolbarPosition();
		renderedAttributes.add(renderObject(Tooltip.TOOLBAR_POSITION, toolbarPosition));
	}

	protected void renderToolbars(List<String> renderedAttributes, Tooltip tooltip) throws IOException {
		java.lang.String toolbars = tooltip.getToolbars();
		renderedAttributes.add(renderString(Tooltip.TOOLBARS, toolbars));
	}

	protected void renderTriggerHideEvent(List<String> renderedAttributes, Tooltip tooltip) throws IOException {
		java.lang.String triggerHideEvent = tooltip.getTriggerHideEvent();
		renderedAttributes.add(renderString(Tooltip.TRIGGER_HIDE_EVENT, triggerHideEvent));
	}

	protected void renderTriggerShowEvent(List<String> renderedAttributes, Tooltip tooltip) throws IOException {
		java.lang.String triggerShowEvent = tooltip.getTriggerShowEvent();
		renderedAttributes.add(renderString(Tooltip.TRIGGER_SHOW_EVENT, triggerShowEvent));
	}

	protected void renderVisible(List<String> renderedAttributes, Tooltip tooltip) throws IOException {
		java.lang.Boolean visible = tooltip.getVisible();
		renderedAttributes.add(renderBoolean(Tooltip.VISIBLE, visible));
	}

	protected void renderWidth(List<String> renderedAttributes, Tooltip tooltip) throws IOException {
		java.lang.Object width = tooltip.getWidth();
		renderedAttributes.add(renderString(Tooltip.WIDTH, width));
	}

	protected void renderX(List<String> renderedAttributes, Tooltip tooltip) throws IOException {
		java.lang.Object x = tooltip.getX();
		renderedAttributes.add(renderNumber(Tooltip.X, x));
	}

	protected void renderXy(List<String> renderedAttributes, Tooltip tooltip) throws IOException {
		java.lang.Object xy = tooltip.getXy();
		renderedAttributes.add(renderArray(Tooltip.XY, xy));
	}

	protected void renderY(List<String> renderedAttributes, Tooltip tooltip) throws IOException {
		java.lang.Object y = tooltip.getY();
		renderedAttributes.add(renderNumber(Tooltip.Y, y));
	}

	protected void renderZIndex(List<String> renderedAttributes, Tooltip tooltip) throws IOException {
		java.lang.Object zIndex = tooltip.getZIndex();
		renderedAttributes.add(renderNumber(Tooltip.Z_INDEX, zIndex));
	}

	protected void renderAfterAlignChange(List<String> renderedAttributes, Tooltip tooltip) throws IOException {
		java.lang.String afterAlignChange = tooltip.getAfterAlignChange();
		renderedAttributes.add(renderString(Tooltip.AFTER_ALIGN_CHANGE, afterAlignChange));
	}

	protected void renderAfterAlignOnChange(List<String> renderedAttributes, Tooltip tooltip) throws IOException {
		java.lang.String afterAlignOnChange = tooltip.getAfterAlignOnChange();
		renderedAttributes.add(renderString(Tooltip.AFTER_ALIGN_ON_CHANGE, afterAlignOnChange));
	}

	protected void renderAfterBodyContentChange(List<String> renderedAttributes, Tooltip tooltip) throws IOException {
		java.lang.String afterBodyContentChange = tooltip.getAfterBodyContentChange();
		renderedAttributes.add(renderString(Tooltip.AFTER_BODY_CONTENT_CHANGE, afterBodyContentChange));
	}

	protected void renderAfterBoundingBoxChange(List<String> renderedAttributes, Tooltip tooltip) throws IOException {
		java.lang.String afterBoundingBoxChange = tooltip.getAfterBoundingBoxChange();
		renderedAttributes.add(renderString(Tooltip.AFTER_BOUNDING_BOX_CHANGE, afterBoundingBoxChange));
	}

	protected void renderAfterCenteredChange(List<String> renderedAttributes, Tooltip tooltip) throws IOException {
		java.lang.String afterCenteredChange = tooltip.getAfterCenteredChange();
		renderedAttributes.add(renderString(Tooltip.AFTER_CENTERED_CHANGE, afterCenteredChange));
	}

	protected void renderAfterConstrainChange(List<String> renderedAttributes, Tooltip tooltip) throws IOException {
		java.lang.String afterConstrainChange = tooltip.getAfterConstrainChange();
		renderedAttributes.add(renderString(Tooltip.AFTER_CONSTRAIN_CHANGE, afterConstrainChange));
	}

	protected void renderAfterContentBoxChange(List<String> renderedAttributes, Tooltip tooltip) throws IOException {
		java.lang.String afterContentBoxChange = tooltip.getAfterContentBoxChange();
		renderedAttributes.add(renderString(Tooltip.AFTER_CONTENT_BOX_CHANGE, afterContentBoxChange));
	}

	protected void renderAfterDestroyedChange(List<String> renderedAttributes, Tooltip tooltip) throws IOException {
		java.lang.String afterDestroyedChange = tooltip.getAfterDestroyedChange();
		renderedAttributes.add(renderString(Tooltip.AFTER_DESTROYED_CHANGE, afterDestroyedChange));
	}

	protected void renderAfterDisabledChange(List<String> renderedAttributes, Tooltip tooltip) throws IOException {
		java.lang.String afterDisabledChange = tooltip.getAfterDisabledChange();
		renderedAttributes.add(renderString(Tooltip.AFTER_DISABLED_CHANGE, afterDisabledChange));
	}

	protected void renderAfterDurationChange(List<String> renderedAttributes, Tooltip tooltip) throws IOException {
		java.lang.String afterDurationChange = tooltip.getAfterDurationChange();
		renderedAttributes.add(renderString(Tooltip.AFTER_DURATION_CHANGE, afterDurationChange));
	}

	protected void renderAfterFillHeightChange(List<String> renderedAttributes, Tooltip tooltip) throws IOException {
		java.lang.String afterFillHeightChange = tooltip.getAfterFillHeightChange();
		renderedAttributes.add(renderString(Tooltip.AFTER_FILL_HEIGHT_CHANGE, afterFillHeightChange));
	}

	protected void renderAfterFocusedChange(List<String> renderedAttributes, Tooltip tooltip) throws IOException {
		java.lang.String afterFocusedChange = tooltip.getAfterFocusedChange();
		renderedAttributes.add(renderString(Tooltip.AFTER_FOCUSED_CHANGE, afterFocusedChange));
	}

	protected void renderAfterFooterContentChange(List<String> renderedAttributes, Tooltip tooltip) throws IOException {
		java.lang.String afterFooterContentChange = tooltip.getAfterFooterContentChange();
		renderedAttributes.add(renderString(Tooltip.AFTER_FOOTER_CONTENT_CHANGE, afterFooterContentChange));
	}

	protected void renderAfterFormatterChange(List<String> renderedAttributes, Tooltip tooltip) throws IOException {
		java.lang.String afterFormatterChange = tooltip.getAfterFormatterChange();
		renderedAttributes.add(renderString(Tooltip.AFTER_FORMATTER_CHANGE, afterFormatterChange));
	}

	protected void renderAfterHeaderContentChange(List<String> renderedAttributes, Tooltip tooltip) throws IOException {
		java.lang.String afterHeaderContentChange = tooltip.getAfterHeaderContentChange();
		renderedAttributes.add(renderString(Tooltip.AFTER_HEADER_CONTENT_CHANGE, afterHeaderContentChange));
	}

	protected void renderAfterHeightChange(List<String> renderedAttributes, Tooltip tooltip) throws IOException {
		java.lang.String afterHeightChange = tooltip.getAfterHeightChange();
		renderedAttributes.add(renderString(Tooltip.AFTER_HEIGHT_CHANGE, afterHeightChange));
	}

	protected void renderAfterHideOnChange(List<String> renderedAttributes, Tooltip tooltip) throws IOException {
		java.lang.String afterHideOnChange = tooltip.getAfterHideOnChange();
		renderedAttributes.add(renderString(Tooltip.AFTER_HIDE_ON_CHANGE, afterHideOnChange));
	}

	protected void renderAfterIdChange(List<String> renderedAttributes, Tooltip tooltip) throws IOException {
		java.lang.String afterIdChange = tooltip.getAfterIdChange();
		renderedAttributes.add(renderString(Tooltip.AFTER_ID_CHANGE, afterIdChange));
	}

	protected void renderAfterInitializedChange(List<String> renderedAttributes, Tooltip tooltip) throws IOException {
		java.lang.String afterInitializedChange = tooltip.getAfterInitializedChange();
		renderedAttributes.add(renderString(Tooltip.AFTER_INITIALIZED_CHANGE, afterInitializedChange));
	}

	protected void renderAfterLocaleChange(List<String> renderedAttributes, Tooltip tooltip) throws IOException {
		java.lang.String afterLocaleChange = tooltip.getAfterLocaleChange();
		renderedAttributes.add(renderString(Tooltip.AFTER_LOCALE_CHANGE, afterLocaleChange));
	}

	protected void renderAfterOpacityChange(List<String> renderedAttributes, Tooltip tooltip) throws IOException {
		java.lang.String afterOpacityChange = tooltip.getAfterOpacityChange();
		renderedAttributes.add(renderString(Tooltip.AFTER_OPACITY_CHANGE, afterOpacityChange));
	}

	protected void renderAfterPreventOverlapChange(List<String> renderedAttributes, Tooltip tooltip) throws IOException {
		java.lang.String afterPreventOverlapChange = tooltip.getAfterPreventOverlapChange();
		renderedAttributes.add(renderString(Tooltip.AFTER_PREVENT_OVERLAP_CHANGE, afterPreventOverlapChange));
	}

	protected void renderAfterRenderChange(List<String> renderedAttributes, Tooltip tooltip) throws IOException {
		java.lang.String afterRenderChange = tooltip.getAfterRenderChange();
		renderedAttributes.add(renderString(Tooltip.AFTER_RENDER_CHANGE, afterRenderChange));
	}

	protected void renderAfterRenderedChange(List<String> renderedAttributes, Tooltip tooltip) throws IOException {
		java.lang.String afterRenderedChange = tooltip.getAfterRenderedChange();
		renderedAttributes.add(renderString(Tooltip.AFTER_RENDERED_CHANGE, afterRenderedChange));
	}

	protected void renderAfterShimChange(List<String> renderedAttributes, Tooltip tooltip) throws IOException {
		java.lang.String afterShimChange = tooltip.getAfterShimChange();
		renderedAttributes.add(renderString(Tooltip.AFTER_SHIM_CHANGE, afterShimChange));
	}

	protected void renderAfterSrcNodeChange(List<String> renderedAttributes, Tooltip tooltip) throws IOException {
		java.lang.String afterSrcNodeChange = tooltip.getAfterSrcNodeChange();
		renderedAttributes.add(renderString(Tooltip.AFTER_SRC_NODE_CHANGE, afterSrcNodeChange));
	}

	protected void renderAfterStringsChange(List<String> renderedAttributes, Tooltip tooltip) throws IOException {
		java.lang.String afterStringsChange = tooltip.getAfterStringsChange();
		renderedAttributes.add(renderString(Tooltip.AFTER_STRINGS_CHANGE, afterStringsChange));
	}

	protected void renderAfterTabIndexChange(List<String> renderedAttributes, Tooltip tooltip) throws IOException {
		java.lang.String afterTabIndexChange = tooltip.getAfterTabIndexChange();
		renderedAttributes.add(renderString(Tooltip.AFTER_TAB_INDEX_CHANGE, afterTabIndexChange));
	}

	protected void renderAfterToolbarPositionChange(List<String> renderedAttributes, Tooltip tooltip) throws IOException {
		java.lang.String afterToolbarPositionChange = tooltip.getAfterToolbarPositionChange();
		renderedAttributes.add(renderString(Tooltip.AFTER_TOOLBAR_POSITION_CHANGE, afterToolbarPositionChange));
	}

	protected void renderAfterToolbarsChange(List<String> renderedAttributes, Tooltip tooltip) throws IOException {
		java.lang.String afterToolbarsChange = tooltip.getAfterToolbarsChange();
		renderedAttributes.add(renderString(Tooltip.AFTER_TOOLBARS_CHANGE, afterToolbarsChange));
	}

	protected void renderAfterTriggerHideEventChange(List<String> renderedAttributes, Tooltip tooltip) throws IOException {
		java.lang.String afterTriggerHideEventChange = tooltip.getAfterTriggerHideEventChange();
		renderedAttributes.add(renderString(Tooltip.AFTER_TRIGGER_HIDE_EVENT_CHANGE, afterTriggerHideEventChange));
	}

	protected void renderAfterTriggerShowEventChange(List<String> renderedAttributes, Tooltip tooltip) throws IOException {
		java.lang.String afterTriggerShowEventChange = tooltip.getAfterTriggerShowEventChange();
		renderedAttributes.add(renderString(Tooltip.AFTER_TRIGGER_SHOW_EVENT_CHANGE, afterTriggerShowEventChange));
	}

	protected void renderAfterVisibleChange(List<String> renderedAttributes, Tooltip tooltip) throws IOException {
		java.lang.String afterVisibleChange = tooltip.getAfterVisibleChange();
		renderedAttributes.add(renderString(Tooltip.AFTER_VISIBLE_CHANGE, afterVisibleChange));
	}

	protected void renderAfterWidthChange(List<String> renderedAttributes, Tooltip tooltip) throws IOException {
		java.lang.String afterWidthChange = tooltip.getAfterWidthChange();
		renderedAttributes.add(renderString(Tooltip.AFTER_WIDTH_CHANGE, afterWidthChange));
	}

	protected void renderAfterXChange(List<String> renderedAttributes, Tooltip tooltip) throws IOException {
		java.lang.String afterXChange = tooltip.getAfterXChange();
		renderedAttributes.add(renderString(Tooltip.AFTER_XCHANGE, afterXChange));
	}

	protected void renderAfterXyChange(List<String> renderedAttributes, Tooltip tooltip) throws IOException {
		java.lang.String afterXyChange = tooltip.getAfterXyChange();
		renderedAttributes.add(renderString(Tooltip.AFTER_XY_CHANGE, afterXyChange));
	}

	protected void renderAfterYChange(List<String> renderedAttributes, Tooltip tooltip) throws IOException {
		java.lang.String afterYChange = tooltip.getAfterYChange();
		renderedAttributes.add(renderString(Tooltip.AFTER_YCHANGE, afterYChange));
	}

	protected void renderAfterZIndexChange(List<String> renderedAttributes, Tooltip tooltip) throws IOException {
		java.lang.String afterZIndexChange = tooltip.getAfterZIndexChange();
		renderedAttributes.add(renderString(Tooltip.AFTER_ZINDEX_CHANGE, afterZIndexChange));
	}

	protected void renderOnAlignChange(List<String> renderedAttributes, Tooltip tooltip) throws IOException {
		java.lang.String onAlignChange = tooltip.getOnAlignChange();
		renderedAttributes.add(renderString(Tooltip.ON_ALIGN_CHANGE, onAlignChange));
	}

	protected void renderOnAlignOnChange(List<String> renderedAttributes, Tooltip tooltip) throws IOException {
		java.lang.String onAlignOnChange = tooltip.getOnAlignOnChange();
		renderedAttributes.add(renderString(Tooltip.ON_ALIGN_ON_CHANGE, onAlignOnChange));
	}

	protected void renderOnBodyContentChange(List<String> renderedAttributes, Tooltip tooltip) throws IOException {
		java.lang.String onBodyContentChange = tooltip.getOnBodyContentChange();
		renderedAttributes.add(renderString(Tooltip.ON_BODY_CONTENT_CHANGE, onBodyContentChange));
	}

	protected void renderOnBoundingBoxChange(List<String> renderedAttributes, Tooltip tooltip) throws IOException {
		java.lang.String onBoundingBoxChange = tooltip.getOnBoundingBoxChange();
		renderedAttributes.add(renderString(Tooltip.ON_BOUNDING_BOX_CHANGE, onBoundingBoxChange));
	}

	protected void renderOnCenteredChange(List<String> renderedAttributes, Tooltip tooltip) throws IOException {
		java.lang.String onCenteredChange = tooltip.getOnCenteredChange();
		renderedAttributes.add(renderString(Tooltip.ON_CENTERED_CHANGE, onCenteredChange));
	}

	protected void renderOnConstrainChange(List<String> renderedAttributes, Tooltip tooltip) throws IOException {
		java.lang.String onConstrainChange = tooltip.getOnConstrainChange();
		renderedAttributes.add(renderString(Tooltip.ON_CONSTRAIN_CHANGE, onConstrainChange));
	}

	protected void renderOnContentBoxChange(List<String> renderedAttributes, Tooltip tooltip) throws IOException {
		java.lang.String onContentBoxChange = tooltip.getOnContentBoxChange();
		renderedAttributes.add(renderString(Tooltip.ON_CONTENT_BOX_CHANGE, onContentBoxChange));
	}

	protected void renderOnDestroyedChange(List<String> renderedAttributes, Tooltip tooltip) throws IOException {
		java.lang.String onDestroyedChange = tooltip.getOnDestroyedChange();
		renderedAttributes.add(renderString(Tooltip.ON_DESTROYED_CHANGE, onDestroyedChange));
	}

	protected void renderOnDisabledChange(List<String> renderedAttributes, Tooltip tooltip) throws IOException {
		java.lang.String onDisabledChange = tooltip.getOnDisabledChange();
		renderedAttributes.add(renderString(Tooltip.ON_DISABLED_CHANGE, onDisabledChange));
	}

	protected void renderOnDurationChange(List<String> renderedAttributes, Tooltip tooltip) throws IOException {
		java.lang.String onDurationChange = tooltip.getOnDurationChange();
		renderedAttributes.add(renderString(Tooltip.ON_DURATION_CHANGE, onDurationChange));
	}

	protected void renderOnFillHeightChange(List<String> renderedAttributes, Tooltip tooltip) throws IOException {
		java.lang.String onFillHeightChange = tooltip.getOnFillHeightChange();
		renderedAttributes.add(renderString(Tooltip.ON_FILL_HEIGHT_CHANGE, onFillHeightChange));
	}

	protected void renderOnFocusedChange(List<String> renderedAttributes, Tooltip tooltip) throws IOException {
		java.lang.String onFocusedChange = tooltip.getOnFocusedChange();
		renderedAttributes.add(renderString(Tooltip.ON_FOCUSED_CHANGE, onFocusedChange));
	}

	protected void renderOnFooterContentChange(List<String> renderedAttributes, Tooltip tooltip) throws IOException {
		java.lang.String onFooterContentChange = tooltip.getOnFooterContentChange();
		renderedAttributes.add(renderString(Tooltip.ON_FOOTER_CONTENT_CHANGE, onFooterContentChange));
	}

	protected void renderOnFormatterChange(List<String> renderedAttributes, Tooltip tooltip) throws IOException {
		java.lang.String onFormatterChange = tooltip.getOnFormatterChange();
		renderedAttributes.add(renderString(Tooltip.ON_FORMATTER_CHANGE, onFormatterChange));
	}

	protected void renderOnHeaderContentChange(List<String> renderedAttributes, Tooltip tooltip) throws IOException {
		java.lang.String onHeaderContentChange = tooltip.getOnHeaderContentChange();
		renderedAttributes.add(renderString(Tooltip.ON_HEADER_CONTENT_CHANGE, onHeaderContentChange));
	}

	protected void renderOnHeightChange(List<String> renderedAttributes, Tooltip tooltip) throws IOException {
		java.lang.String onHeightChange = tooltip.getOnHeightChange();
		renderedAttributes.add(renderString(Tooltip.ON_HEIGHT_CHANGE, onHeightChange));
	}

	protected void renderOnHideOnChange(List<String> renderedAttributes, Tooltip tooltip) throws IOException {
		java.lang.String onHideOnChange = tooltip.getOnHideOnChange();
		renderedAttributes.add(renderString(Tooltip.ON_HIDE_ON_CHANGE, onHideOnChange));
	}

	protected void renderOnIdChange(List<String> renderedAttributes, Tooltip tooltip) throws IOException {
		java.lang.String onIdChange = tooltip.getOnIdChange();
		renderedAttributes.add(renderString(Tooltip.ON_ID_CHANGE, onIdChange));
	}

	protected void renderOnInitializedChange(List<String> renderedAttributes, Tooltip tooltip) throws IOException {
		java.lang.String onInitializedChange = tooltip.getOnInitializedChange();
		renderedAttributes.add(renderString(Tooltip.ON_INITIALIZED_CHANGE, onInitializedChange));
	}

	protected void renderOnLocaleChange(List<String> renderedAttributes, Tooltip tooltip) throws IOException {
		java.lang.String onLocaleChange = tooltip.getOnLocaleChange();
		renderedAttributes.add(renderString(Tooltip.ON_LOCALE_CHANGE, onLocaleChange));
	}

	protected void renderOnOpacityChange(List<String> renderedAttributes, Tooltip tooltip) throws IOException {
		java.lang.String onOpacityChange = tooltip.getOnOpacityChange();
		renderedAttributes.add(renderString(Tooltip.ON_OPACITY_CHANGE, onOpacityChange));
	}

	protected void renderOnPreventOverlapChange(List<String> renderedAttributes, Tooltip tooltip) throws IOException {
		java.lang.String onPreventOverlapChange = tooltip.getOnPreventOverlapChange();
		renderedAttributes.add(renderString(Tooltip.ON_PREVENT_OVERLAP_CHANGE, onPreventOverlapChange));
	}

	protected void renderOnRenderChange(List<String> renderedAttributes, Tooltip tooltip) throws IOException {
		java.lang.String onRenderChange = tooltip.getOnRenderChange();
		renderedAttributes.add(renderString(Tooltip.ON_RENDER_CHANGE, onRenderChange));
	}

	protected void renderOnRenderedChange(List<String> renderedAttributes, Tooltip tooltip) throws IOException {
		java.lang.String onRenderedChange = tooltip.getOnRenderedChange();
		renderedAttributes.add(renderString(Tooltip.ON_RENDERED_CHANGE, onRenderedChange));
	}

	protected void renderOnShimChange(List<String> renderedAttributes, Tooltip tooltip) throws IOException {
		java.lang.String onShimChange = tooltip.getOnShimChange();
		renderedAttributes.add(renderString(Tooltip.ON_SHIM_CHANGE, onShimChange));
	}

	protected void renderOnSrcNodeChange(List<String> renderedAttributes, Tooltip tooltip) throws IOException {
		java.lang.String onSrcNodeChange = tooltip.getOnSrcNodeChange();
		renderedAttributes.add(renderString(Tooltip.ON_SRC_NODE_CHANGE, onSrcNodeChange));
	}

	protected void renderOnStringsChange(List<String> renderedAttributes, Tooltip tooltip) throws IOException {
		java.lang.String onStringsChange = tooltip.getOnStringsChange();
		renderedAttributes.add(renderString(Tooltip.ON_STRINGS_CHANGE, onStringsChange));
	}

	protected void renderOnTabIndexChange(List<String> renderedAttributes, Tooltip tooltip) throws IOException {
		java.lang.String onTabIndexChange = tooltip.getOnTabIndexChange();
		renderedAttributes.add(renderString(Tooltip.ON_TAB_INDEX_CHANGE, onTabIndexChange));
	}

	protected void renderOnToolbarPositionChange(List<String> renderedAttributes, Tooltip tooltip) throws IOException {
		java.lang.String onToolbarPositionChange = tooltip.getOnToolbarPositionChange();
		renderedAttributes.add(renderString(Tooltip.ON_TOOLBAR_POSITION_CHANGE, onToolbarPositionChange));
	}

	protected void renderOnToolbarsChange(List<String> renderedAttributes, Tooltip tooltip) throws IOException {
		java.lang.String onToolbarsChange = tooltip.getOnToolbarsChange();
		renderedAttributes.add(renderString(Tooltip.ON_TOOLBARS_CHANGE, onToolbarsChange));
	}

	protected void renderOnTriggerHideEventChange(List<String> renderedAttributes, Tooltip tooltip) throws IOException {
		java.lang.String onTriggerHideEventChange = tooltip.getOnTriggerHideEventChange();
		renderedAttributes.add(renderString(Tooltip.ON_TRIGGER_HIDE_EVENT_CHANGE, onTriggerHideEventChange));
	}

	protected void renderOnTriggerShowEventChange(List<String> renderedAttributes, Tooltip tooltip) throws IOException {
		java.lang.String onTriggerShowEventChange = tooltip.getOnTriggerShowEventChange();
		renderedAttributes.add(renderString(Tooltip.ON_TRIGGER_SHOW_EVENT_CHANGE, onTriggerShowEventChange));
	}

	protected void renderOnVisibleChange(List<String> renderedAttributes, Tooltip tooltip) throws IOException {
		java.lang.String onVisibleChange = tooltip.getOnVisibleChange();
		renderedAttributes.add(renderString(Tooltip.ON_VISIBLE_CHANGE, onVisibleChange));
	}

	protected void renderOnWidthChange(List<String> renderedAttributes, Tooltip tooltip) throws IOException {
		java.lang.String onWidthChange = tooltip.getOnWidthChange();
		renderedAttributes.add(renderString(Tooltip.ON_WIDTH_CHANGE, onWidthChange));
	}

	protected void renderOnXChange(List<String> renderedAttributes, Tooltip tooltip) throws IOException {
		java.lang.String onXChange = tooltip.getOnXChange();
		renderedAttributes.add(renderString(Tooltip.ON_XCHANGE, onXChange));
	}

	protected void renderOnXyChange(List<String> renderedAttributes, Tooltip tooltip) throws IOException {
		java.lang.String onXyChange = tooltip.getOnXyChange();
		renderedAttributes.add(renderString(Tooltip.ON_XY_CHANGE, onXyChange));
	}

	protected void renderOnYChange(List<String> renderedAttributes, Tooltip tooltip) throws IOException {
		java.lang.String onYChange = tooltip.getOnYChange();
		renderedAttributes.add(renderString(Tooltip.ON_YCHANGE, onYChange));
	}

	protected void renderOnZIndexChange(List<String> renderedAttributes, Tooltip tooltip) throws IOException {
		java.lang.String onZIndexChange = tooltip.getOnZIndexChange();
		renderedAttributes.add(renderString(Tooltip.ON_ZINDEX_CHANGE, onZIndexChange));
	}

}
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

		renderAlign(renderedAttributes, tooltip);
		renderAlignOn(renderedAttributes, tooltip);
		renderTooltipBodyContent(renderedAttributes, tooltip);
		renderBoundingBox(renderedAttributes, tooltip);
		renderCentered(renderedAttributes, tooltip);
		renderConstrain(renderedAttributes, tooltip);
		renderContentBox(renderedAttributes, tooltip);
		renderDestroyed(renderedAttributes, tooltip);
		renderDisabled(renderedAttributes, tooltip);
		renderDuration(renderedAttributes, tooltip);
		renderFillHeight(renderedAttributes, tooltip);
		renderFocused(renderedAttributes, tooltip);
		renderFooterContent(renderedAttributes, tooltip);
		renderFormatter(renderedAttributes, tooltip);
		renderHeaderContent(renderedAttributes, tooltip);
		renderHeight(renderedAttributes, tooltip);
		renderHideOn(renderedAttributes, tooltip);
		renderTooltipId(renderedAttributes, tooltip);
		renderInitialized(renderedAttributes, tooltip);
		renderTooltipLocale(renderedAttributes, tooltip);
		renderOpacity(renderedAttributes, tooltip);
		renderPreventOverlap(renderedAttributes, tooltip);
		renderRender(renderedAttributes, tooltip);
		renderRendered(renderedAttributes, tooltip);
		renderShim(renderedAttributes, tooltip);
		renderSrcNode(renderedAttributes, tooltip);
		renderStrings(renderedAttributes, tooltip);
		renderTabIndex(renderedAttributes, tooltip);
		renderToolbarPosition(renderedAttributes, tooltip);
		renderToolbars(renderedAttributes, tooltip);
		renderTriggerHideEvent(renderedAttributes, tooltip);
		renderTriggerShowEvent(renderedAttributes, tooltip);
		renderVisible(renderedAttributes, tooltip);
		renderWidth(renderedAttributes, tooltip);
		renderX(renderedAttributes, tooltip);
		renderXy(renderedAttributes, tooltip);
		renderY(renderedAttributes, tooltip);
		renderZIndex(renderedAttributes, tooltip);

		for (String renderedAttribute : renderedAttributes) {
			responseWriter.write(renderedAttribute);
			responseWriter.write(StringPool.COMMA);
		}

		responseWriter.write("after");
		responseWriter.write(StringPool.COLON);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedAfterEvents = new ArrayList<String>();

		renderAfterAlignChange(renderedAfterEvents, tooltip);
		renderAfterAlignOnChange(renderedAfterEvents, tooltip);
		renderAfterBodyContentChange(renderedAfterEvents, tooltip);
		renderAfterBoundingBoxChange(renderedAfterEvents, tooltip);
		renderAfterCenteredChange(renderedAfterEvents, tooltip);
		renderAfterConstrainChange(renderedAfterEvents, tooltip);
		renderAfterContentBoxChange(renderedAfterEvents, tooltip);
		renderAfterDestroyedChange(renderedAfterEvents, tooltip);
		renderAfterDisabledChange(renderedAfterEvents, tooltip);
		renderAfterDurationChange(renderedAfterEvents, tooltip);
		renderAfterFillHeightChange(renderedAfterEvents, tooltip);
		renderAfterFocusedChange(renderedAfterEvents, tooltip);
		renderAfterFooterContentChange(renderedAfterEvents, tooltip);
		renderAfterFormatterChange(renderedAfterEvents, tooltip);
		renderAfterHeaderContentChange(renderedAfterEvents, tooltip);
		renderAfterHeightChange(renderedAfterEvents, tooltip);
		renderAfterHideOnChange(renderedAfterEvents, tooltip);
		renderAfterIdChange(renderedAfterEvents, tooltip);
		renderAfterInitializedChange(renderedAfterEvents, tooltip);
		renderAfterLocaleChange(renderedAfterEvents, tooltip);
		renderAfterOpacityChange(renderedAfterEvents, tooltip);
		renderAfterPreventOverlapChange(renderedAfterEvents, tooltip);
		renderAfterRenderChange(renderedAfterEvents, tooltip);
		renderAfterRenderedChange(renderedAfterEvents, tooltip);
		renderAfterShimChange(renderedAfterEvents, tooltip);
		renderAfterSrcNodeChange(renderedAfterEvents, tooltip);
		renderAfterStringsChange(renderedAfterEvents, tooltip);
		renderAfterTabIndexChange(renderedAfterEvents, tooltip);
		renderAfterToolbarPositionChange(renderedAfterEvents, tooltip);
		renderAfterToolbarsChange(renderedAfterEvents, tooltip);
		renderAfterTriggerHideEventChange(renderedAfterEvents, tooltip);
		renderAfterTriggerShowEventChange(renderedAfterEvents, tooltip);
		renderAfterVisibleChange(renderedAfterEvents, tooltip);
		renderAfterWidthChange(renderedAfterEvents, tooltip);
		renderAfterXChange(renderedAfterEvents, tooltip);
		renderAfterXyChange(renderedAfterEvents, tooltip);
		renderAfterYChange(renderedAfterEvents, tooltip);
		renderAfterZIndexChange(renderedAfterEvents, tooltip);

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

		renderOnAlignChange(renderedOnEvents, tooltip);
		renderOnAlignOnChange(renderedOnEvents, tooltip);
		renderOnBodyContentChange(renderedOnEvents, tooltip);
		renderOnBoundingBoxChange(renderedOnEvents, tooltip);
		renderOnCenteredChange(renderedOnEvents, tooltip);
		renderOnConstrainChange(renderedOnEvents, tooltip);
		renderOnContentBoxChange(renderedOnEvents, tooltip);
		renderOnDestroyedChange(renderedOnEvents, tooltip);
		renderOnDisabledChange(renderedOnEvents, tooltip);
		renderOnDurationChange(renderedOnEvents, tooltip);
		renderOnFillHeightChange(renderedOnEvents, tooltip);
		renderOnFocusedChange(renderedOnEvents, tooltip);
		renderOnFooterContentChange(renderedOnEvents, tooltip);
		renderOnFormatterChange(renderedOnEvents, tooltip);
		renderOnHeaderContentChange(renderedOnEvents, tooltip);
		renderOnHeightChange(renderedOnEvents, tooltip);
		renderOnHideOnChange(renderedOnEvents, tooltip);
		renderOnIdChange(renderedOnEvents, tooltip);
		renderOnInitializedChange(renderedOnEvents, tooltip);
		renderOnLocaleChange(renderedOnEvents, tooltip);
		renderOnOpacityChange(renderedOnEvents, tooltip);
		renderOnPreventOverlapChange(renderedOnEvents, tooltip);
		renderOnRenderChange(renderedOnEvents, tooltip);
		renderOnRenderedChange(renderedOnEvents, tooltip);
		renderOnShimChange(renderedOnEvents, tooltip);
		renderOnSrcNodeChange(renderedOnEvents, tooltip);
		renderOnStringsChange(renderedOnEvents, tooltip);
		renderOnTabIndexChange(renderedOnEvents, tooltip);
		renderOnToolbarPositionChange(renderedOnEvents, tooltip);
		renderOnToolbarsChange(renderedOnEvents, tooltip);
		renderOnTriggerHideEventChange(renderedOnEvents, tooltip);
		renderOnTriggerShowEventChange(renderedOnEvents, tooltip);
		renderOnVisibleChange(renderedOnEvents, tooltip);
		renderOnWidthChange(renderedOnEvents, tooltip);
		renderOnXChange(renderedOnEvents, tooltip);
		renderOnXyChange(renderedOnEvents, tooltip);
		renderOnYChange(renderedOnEvents, tooltip);
		renderOnZIndexChange(renderedOnEvents, tooltip);

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

		if (align != null) {
			renderedAttributes.add(renderObject(Tooltip.ALIGN, align));
		}
	}

	protected void renderAlignOn(List<String> renderedAttributes, Tooltip tooltip) throws IOException {
		java.lang.Object alignOn = tooltip.getAlignOn();

		if (alignOn != null) {
			renderedAttributes.add(renderArray(Tooltip.ALIGN_ON, alignOn));
		}
	}

	protected void renderTooltipBodyContent(List<String> renderedAttributes, Tooltip tooltip) throws IOException {
		java.lang.Object tooltipBodyContent = tooltip.getTooltipBodyContent();

		if (tooltipBodyContent != null) {
			renderedAttributes.add(renderString(Tooltip.TOOLTIP_BODY_CONTENT, tooltipBodyContent));
		}
	}

	protected void renderBoundingBox(List<String> renderedAttributes, Tooltip tooltip) throws IOException {
		java.lang.String boundingBox = tooltip.getBoundingBox();

		if (boundingBox != null) {
			renderedAttributes.add(renderString(Tooltip.BOUNDING_BOX, boundingBox));
		}
	}

	protected void renderCentered(List<String> renderedAttributes, Tooltip tooltip) throws IOException {
		java.lang.Object centered = tooltip.getCentered();

		if (centered != null) {
			renderedAttributes.add(renderString(Tooltip.CENTERED, centered));
		}
	}

	protected void renderConstrain(List<String> renderedAttributes, Tooltip tooltip) throws IOException {
		java.lang.Object constrain = tooltip.getConstrain();

		if (constrain != null) {
			renderedAttributes.add(renderString(Tooltip.CONSTRAIN, constrain));
		}
	}

	protected void renderContentBox(List<String> renderedAttributes, Tooltip tooltip) throws IOException {
		java.lang.String contentBox = tooltip.getContentBox();

		if (contentBox != null) {
			renderedAttributes.add(renderString(Tooltip.CONTENT_BOX, contentBox));
		}
	}

	protected void renderDestroyed(List<String> renderedAttributes, Tooltip tooltip) throws IOException {
		java.lang.Boolean destroyed = tooltip.getDestroyed();

		if (destroyed != null) {
			renderedAttributes.add(renderBoolean(Tooltip.DESTROYED, destroyed));
		}
	}

	protected void renderDisabled(List<String> renderedAttributes, Tooltip tooltip) throws IOException {
		java.lang.Boolean disabled = tooltip.getDisabled();

		if (disabled != null) {
			renderedAttributes.add(renderBoolean(Tooltip.DISABLED, disabled));
		}
	}

	protected void renderDuration(List<String> renderedAttributes, Tooltip tooltip) throws IOException {
		java.lang.Object duration = tooltip.getDuration();

		if (duration != null) {
			renderedAttributes.add(renderString(Tooltip.DURATION, duration));
		}
	}

	protected void renderFillHeight(List<String> renderedAttributes, Tooltip tooltip) throws IOException {
		java.lang.Object fillHeight = tooltip.getFillHeight();

		if (fillHeight != null) {
			renderedAttributes.add(renderString(Tooltip.FILL_HEIGHT, fillHeight));
		}
	}

	protected void renderFocused(List<String> renderedAttributes, Tooltip tooltip) throws IOException {
		java.lang.Boolean focused = tooltip.getFocused();

		if (focused != null) {
			renderedAttributes.add(renderBoolean(Tooltip.FOCUSED, focused));
		}
	}

	protected void renderFooterContent(List<String> renderedAttributes, Tooltip tooltip) throws IOException {
		java.lang.Object footerContent = tooltip.getFooterContent();

		if (footerContent != null) {
			renderedAttributes.add(renderString(Tooltip.FOOTER_CONTENT, footerContent));
		}
	}

	protected void renderFormatter(List<String> renderedAttributes, Tooltip tooltip) throws IOException {
		java.lang.Object formatter = tooltip.getFormatter();

		if (formatter != null) {
			renderedAttributes.add(renderString(Tooltip.FORMATTER, formatter));
		}
	}

	protected void renderHeaderContent(List<String> renderedAttributes, Tooltip tooltip) throws IOException {
		java.lang.Object headerContent = tooltip.getHeaderContent();

		if (headerContent != null) {
			renderedAttributes.add(renderString(Tooltip.HEADER_CONTENT, headerContent));
		}
	}

	protected void renderHeight(List<String> renderedAttributes, Tooltip tooltip) throws IOException {
		java.lang.Object height = tooltip.getHeight();

		if (height != null) {
			renderedAttributes.add(renderString(Tooltip.HEIGHT, height));
		}
	}

	protected void renderHideOn(List<String> renderedAttributes, Tooltip tooltip) throws IOException {
		java.lang.Object hideOn = tooltip.getHideOn();

		if (hideOn != null) {
			renderedAttributes.add(renderArray(Tooltip.HIDE_ON, hideOn));
		}
	}

	protected void renderTooltipId(List<String> renderedAttributes, Tooltip tooltip) throws IOException {
		java.lang.String tooltipId = tooltip.getTooltipId();

		if (tooltipId != null) {
			renderedAttributes.add(renderString(Tooltip.TOOLTIP_ID, tooltipId));
		}
	}

	protected void renderInitialized(List<String> renderedAttributes, Tooltip tooltip) throws IOException {
		java.lang.Boolean initialized = tooltip.getInitialized();

		if (initialized != null) {
			renderedAttributes.add(renderBoolean(Tooltip.INITIALIZED, initialized));
		}
	}

	protected void renderTooltipLocale(List<String> renderedAttributes, Tooltip tooltip) throws IOException {
		java.lang.String tooltipLocale = tooltip.getTooltipLocale();

		if (tooltipLocale != null) {
			renderedAttributes.add(renderString(Tooltip.TOOLTIP_LOCALE, tooltipLocale));
		}
	}

	protected void renderOpacity(List<String> renderedAttributes, Tooltip tooltip) throws IOException {
		java.lang.Object opacity = tooltip.getOpacity();

		if (opacity != null) {
			renderedAttributes.add(renderString(Tooltip.OPACITY, opacity));
		}
	}

	protected void renderPreventOverlap(List<String> renderedAttributes, Tooltip tooltip) throws IOException {
		java.lang.Boolean preventOverlap = tooltip.getPreventOverlap();

		if (preventOverlap != null) {
			renderedAttributes.add(renderBoolean(Tooltip.PREVENT_OVERLAP, preventOverlap));
		}
	}

	protected void renderRender(List<String> renderedAttributes, Tooltip tooltip) throws IOException {
		java.lang.Object render = tooltip.getRender();

		if (render != null) {
			renderedAttributes.add(renderString(Tooltip.RENDER, render));
		}
	}

	protected void renderRendered(List<String> renderedAttributes, Tooltip tooltip) throws IOException {
		java.lang.Boolean rendered = tooltip.getRendered();

		if (rendered != null) {
			renderedAttributes.add(renderBoolean(Tooltip.RENDERED, rendered));
		}
	}

	protected void renderShim(List<String> renderedAttributes, Tooltip tooltip) throws IOException {
		java.lang.Boolean shim = tooltip.getShim();

		if (shim != null) {
			renderedAttributes.add(renderBoolean(Tooltip.SHIM, shim));
		}
	}

	protected void renderSrcNode(List<String> renderedAttributes, Tooltip tooltip) throws IOException {
		java.lang.String srcNode = tooltip.getSrcNode();

		if (srcNode != null) {
			renderedAttributes.add(renderString(Tooltip.SRC_NODE, srcNode));
		}
	}

	protected void renderStrings(List<String> renderedAttributes, Tooltip tooltip) throws IOException {
		java.lang.Object strings = tooltip.getStrings();

		if (strings != null) {
			renderedAttributes.add(renderObject(Tooltip.STRINGS, strings));
		}
	}

	protected void renderTabIndex(List<String> renderedAttributes, Tooltip tooltip) throws IOException {
		java.lang.Object tabIndex = tooltip.getTabIndex();

		if (tabIndex != null) {
			renderedAttributes.add(renderNumber(Tooltip.TAB_INDEX, tabIndex));
		}
	}

	protected void renderToolbarPosition(List<String> renderedAttributes, Tooltip tooltip) throws IOException {
		java.lang.Object toolbarPosition = tooltip.getToolbarPosition();

		if (toolbarPosition != null) {
			renderedAttributes.add(renderObject(Tooltip.TOOLBAR_POSITION, toolbarPosition));
		}
	}

	protected void renderToolbars(List<String> renderedAttributes, Tooltip tooltip) throws IOException {
		java.lang.String toolbars = tooltip.getToolbars();

		if (toolbars != null) {
			renderedAttributes.add(renderString(Tooltip.TOOLBARS, toolbars));
		}
	}

	protected void renderTriggerHideEvent(List<String> renderedAttributes, Tooltip tooltip) throws IOException {
		java.lang.String triggerHideEvent = tooltip.getTriggerHideEvent();

		if (triggerHideEvent != null) {
			renderedAttributes.add(renderString(Tooltip.TRIGGER_HIDE_EVENT, triggerHideEvent));
		}
	}

	protected void renderTriggerShowEvent(List<String> renderedAttributes, Tooltip tooltip) throws IOException {
		java.lang.String triggerShowEvent = tooltip.getTriggerShowEvent();

		if (triggerShowEvent != null) {
			renderedAttributes.add(renderString(Tooltip.TRIGGER_SHOW_EVENT, triggerShowEvent));
		}
	}

	protected void renderVisible(List<String> renderedAttributes, Tooltip tooltip) throws IOException {
		java.lang.Boolean visible = tooltip.getVisible();

		if (visible != null) {
			renderedAttributes.add(renderBoolean(Tooltip.VISIBLE, visible));
		}
	}

	protected void renderWidth(List<String> renderedAttributes, Tooltip tooltip) throws IOException {
		java.lang.Object width = tooltip.getWidth();

		if (width != null) {
			renderedAttributes.add(renderString(Tooltip.WIDTH, width));
		}
	}

	protected void renderX(List<String> renderedAttributes, Tooltip tooltip) throws IOException {
		java.lang.Object x = tooltip.getX();

		if (x != null) {
			renderedAttributes.add(renderNumber(Tooltip.X, x));
		}
	}

	protected void renderXy(List<String> renderedAttributes, Tooltip tooltip) throws IOException {
		java.lang.Object xy = tooltip.getXy();

		if (xy != null) {
			renderedAttributes.add(renderArray(Tooltip.XY, xy));
		}
	}

	protected void renderY(List<String> renderedAttributes, Tooltip tooltip) throws IOException {
		java.lang.Object y = tooltip.getY();

		if (y != null) {
			renderedAttributes.add(renderNumber(Tooltip.Y, y));
		}
	}

	protected void renderZIndex(List<String> renderedAttributes, Tooltip tooltip) throws IOException {
		java.lang.Object zIndex = tooltip.getZIndex();

		if (zIndex != null) {
			renderedAttributes.add(renderNumber(Tooltip.Z_INDEX, zIndex));
		}
	}

	protected void renderAfterAlignChange(List<String> renderedAttributes, Tooltip tooltip) throws IOException {
		java.lang.String afterAlignChange = tooltip.getAfterAlignChange();

		if (afterAlignChange != null) {
			renderedAttributes.add(renderString(Tooltip.AFTER_ALIGN_CHANGE, afterAlignChange));
		}
	}

	protected void renderAfterAlignOnChange(List<String> renderedAttributes, Tooltip tooltip) throws IOException {
		java.lang.String afterAlignOnChange = tooltip.getAfterAlignOnChange();

		if (afterAlignOnChange != null) {
			renderedAttributes.add(renderString(Tooltip.AFTER_ALIGN_ON_CHANGE, afterAlignOnChange));
		}
	}

	protected void renderAfterBodyContentChange(List<String> renderedAttributes, Tooltip tooltip) throws IOException {
		java.lang.String afterBodyContentChange = tooltip.getAfterBodyContentChange();

		if (afterBodyContentChange != null) {
			renderedAttributes.add(renderString(Tooltip.AFTER_BODY_CONTENT_CHANGE, afterBodyContentChange));
		}
	}

	protected void renderAfterBoundingBoxChange(List<String> renderedAttributes, Tooltip tooltip) throws IOException {
		java.lang.String afterBoundingBoxChange = tooltip.getAfterBoundingBoxChange();

		if (afterBoundingBoxChange != null) {
			renderedAttributes.add(renderString(Tooltip.AFTER_BOUNDING_BOX_CHANGE, afterBoundingBoxChange));
		}
	}

	protected void renderAfterCenteredChange(List<String> renderedAttributes, Tooltip tooltip) throws IOException {
		java.lang.String afterCenteredChange = tooltip.getAfterCenteredChange();

		if (afterCenteredChange != null) {
			renderedAttributes.add(renderString(Tooltip.AFTER_CENTERED_CHANGE, afterCenteredChange));
		}
	}

	protected void renderAfterConstrainChange(List<String> renderedAttributes, Tooltip tooltip) throws IOException {
		java.lang.String afterConstrainChange = tooltip.getAfterConstrainChange();

		if (afterConstrainChange != null) {
			renderedAttributes.add(renderString(Tooltip.AFTER_CONSTRAIN_CHANGE, afterConstrainChange));
		}
	}

	protected void renderAfterContentBoxChange(List<String> renderedAttributes, Tooltip tooltip) throws IOException {
		java.lang.String afterContentBoxChange = tooltip.getAfterContentBoxChange();

		if (afterContentBoxChange != null) {
			renderedAttributes.add(renderString(Tooltip.AFTER_CONTENT_BOX_CHANGE, afterContentBoxChange));
		}
	}

	protected void renderAfterDestroyedChange(List<String> renderedAttributes, Tooltip tooltip) throws IOException {
		java.lang.String afterDestroyedChange = tooltip.getAfterDestroyedChange();

		if (afterDestroyedChange != null) {
			renderedAttributes.add(renderString(Tooltip.AFTER_DESTROYED_CHANGE, afterDestroyedChange));
		}
	}

	protected void renderAfterDisabledChange(List<String> renderedAttributes, Tooltip tooltip) throws IOException {
		java.lang.String afterDisabledChange = tooltip.getAfterDisabledChange();

		if (afterDisabledChange != null) {
			renderedAttributes.add(renderString(Tooltip.AFTER_DISABLED_CHANGE, afterDisabledChange));
		}
	}

	protected void renderAfterDurationChange(List<String> renderedAttributes, Tooltip tooltip) throws IOException {
		java.lang.String afterDurationChange = tooltip.getAfterDurationChange();

		if (afterDurationChange != null) {
			renderedAttributes.add(renderString(Tooltip.AFTER_DURATION_CHANGE, afterDurationChange));
		}
	}

	protected void renderAfterFillHeightChange(List<String> renderedAttributes, Tooltip tooltip) throws IOException {
		java.lang.String afterFillHeightChange = tooltip.getAfterFillHeightChange();

		if (afterFillHeightChange != null) {
			renderedAttributes.add(renderString(Tooltip.AFTER_FILL_HEIGHT_CHANGE, afterFillHeightChange));
		}
	}

	protected void renderAfterFocusedChange(List<String> renderedAttributes, Tooltip tooltip) throws IOException {
		java.lang.String afterFocusedChange = tooltip.getAfterFocusedChange();

		if (afterFocusedChange != null) {
			renderedAttributes.add(renderString(Tooltip.AFTER_FOCUSED_CHANGE, afterFocusedChange));
		}
	}

	protected void renderAfterFooterContentChange(List<String> renderedAttributes, Tooltip tooltip) throws IOException {
		java.lang.String afterFooterContentChange = tooltip.getAfterFooterContentChange();

		if (afterFooterContentChange != null) {
			renderedAttributes.add(renderString(Tooltip.AFTER_FOOTER_CONTENT_CHANGE, afterFooterContentChange));
		}
	}

	protected void renderAfterFormatterChange(List<String> renderedAttributes, Tooltip tooltip) throws IOException {
		java.lang.String afterFormatterChange = tooltip.getAfterFormatterChange();

		if (afterFormatterChange != null) {
			renderedAttributes.add(renderString(Tooltip.AFTER_FORMATTER_CHANGE, afterFormatterChange));
		}
	}

	protected void renderAfterHeaderContentChange(List<String> renderedAttributes, Tooltip tooltip) throws IOException {
		java.lang.String afterHeaderContentChange = tooltip.getAfterHeaderContentChange();

		if (afterHeaderContentChange != null) {
			renderedAttributes.add(renderString(Tooltip.AFTER_HEADER_CONTENT_CHANGE, afterHeaderContentChange));
		}
	}

	protected void renderAfterHeightChange(List<String> renderedAttributes, Tooltip tooltip) throws IOException {
		java.lang.String afterHeightChange = tooltip.getAfterHeightChange();

		if (afterHeightChange != null) {
			renderedAttributes.add(renderString(Tooltip.AFTER_HEIGHT_CHANGE, afterHeightChange));
		}
	}

	protected void renderAfterHideOnChange(List<String> renderedAttributes, Tooltip tooltip) throws IOException {
		java.lang.String afterHideOnChange = tooltip.getAfterHideOnChange();

		if (afterHideOnChange != null) {
			renderedAttributes.add(renderString(Tooltip.AFTER_HIDE_ON_CHANGE, afterHideOnChange));
		}
	}

	protected void renderAfterIdChange(List<String> renderedAttributes, Tooltip tooltip) throws IOException {
		java.lang.String afterIdChange = tooltip.getAfterIdChange();

		if (afterIdChange != null) {
			renderedAttributes.add(renderString(Tooltip.AFTER_ID_CHANGE, afterIdChange));
		}
	}

	protected void renderAfterInitializedChange(List<String> renderedAttributes, Tooltip tooltip) throws IOException {
		java.lang.String afterInitializedChange = tooltip.getAfterInitializedChange();

		if (afterInitializedChange != null) {
			renderedAttributes.add(renderString(Tooltip.AFTER_INITIALIZED_CHANGE, afterInitializedChange));
		}
	}

	protected void renderAfterLocaleChange(List<String> renderedAttributes, Tooltip tooltip) throws IOException {
		java.lang.String afterLocaleChange = tooltip.getAfterLocaleChange();

		if (afterLocaleChange != null) {
			renderedAttributes.add(renderString(Tooltip.AFTER_LOCALE_CHANGE, afterLocaleChange));
		}
	}

	protected void renderAfterOpacityChange(List<String> renderedAttributes, Tooltip tooltip) throws IOException {
		java.lang.String afterOpacityChange = tooltip.getAfterOpacityChange();

		if (afterOpacityChange != null) {
			renderedAttributes.add(renderString(Tooltip.AFTER_OPACITY_CHANGE, afterOpacityChange));
		}
	}

	protected void renderAfterPreventOverlapChange(List<String> renderedAttributes, Tooltip tooltip) throws IOException {
		java.lang.String afterPreventOverlapChange = tooltip.getAfterPreventOverlapChange();

		if (afterPreventOverlapChange != null) {
			renderedAttributes.add(renderString(Tooltip.AFTER_PREVENT_OVERLAP_CHANGE, afterPreventOverlapChange));
		}
	}

	protected void renderAfterRenderChange(List<String> renderedAttributes, Tooltip tooltip) throws IOException {
		java.lang.String afterRenderChange = tooltip.getAfterRenderChange();

		if (afterRenderChange != null) {
			renderedAttributes.add(renderString(Tooltip.AFTER_RENDER_CHANGE, afterRenderChange));
		}
	}

	protected void renderAfterRenderedChange(List<String> renderedAttributes, Tooltip tooltip) throws IOException {
		java.lang.String afterRenderedChange = tooltip.getAfterRenderedChange();

		if (afterRenderedChange != null) {
			renderedAttributes.add(renderString(Tooltip.AFTER_RENDERED_CHANGE, afterRenderedChange));
		}
	}

	protected void renderAfterShimChange(List<String> renderedAttributes, Tooltip tooltip) throws IOException {
		java.lang.String afterShimChange = tooltip.getAfterShimChange();

		if (afterShimChange != null) {
			renderedAttributes.add(renderString(Tooltip.AFTER_SHIM_CHANGE, afterShimChange));
		}
	}

	protected void renderAfterSrcNodeChange(List<String> renderedAttributes, Tooltip tooltip) throws IOException {
		java.lang.String afterSrcNodeChange = tooltip.getAfterSrcNodeChange();

		if (afterSrcNodeChange != null) {
			renderedAttributes.add(renderString(Tooltip.AFTER_SRC_NODE_CHANGE, afterSrcNodeChange));
		}
	}

	protected void renderAfterStringsChange(List<String> renderedAttributes, Tooltip tooltip) throws IOException {
		java.lang.String afterStringsChange = tooltip.getAfterStringsChange();

		if (afterStringsChange != null) {
			renderedAttributes.add(renderString(Tooltip.AFTER_STRINGS_CHANGE, afterStringsChange));
		}
	}

	protected void renderAfterTabIndexChange(List<String> renderedAttributes, Tooltip tooltip) throws IOException {
		java.lang.String afterTabIndexChange = tooltip.getAfterTabIndexChange();

		if (afterTabIndexChange != null) {
			renderedAttributes.add(renderString(Tooltip.AFTER_TAB_INDEX_CHANGE, afterTabIndexChange));
		}
	}

	protected void renderAfterToolbarPositionChange(List<String> renderedAttributes, Tooltip tooltip) throws IOException {
		java.lang.String afterToolbarPositionChange = tooltip.getAfterToolbarPositionChange();

		if (afterToolbarPositionChange != null) {
			renderedAttributes.add(renderString(Tooltip.AFTER_TOOLBAR_POSITION_CHANGE, afterToolbarPositionChange));
		}
	}

	protected void renderAfterToolbarsChange(List<String> renderedAttributes, Tooltip tooltip) throws IOException {
		java.lang.String afterToolbarsChange = tooltip.getAfterToolbarsChange();

		if (afterToolbarsChange != null) {
			renderedAttributes.add(renderString(Tooltip.AFTER_TOOLBARS_CHANGE, afterToolbarsChange));
		}
	}

	protected void renderAfterTriggerHideEventChange(List<String> renderedAttributes, Tooltip tooltip) throws IOException {
		java.lang.String afterTriggerHideEventChange = tooltip.getAfterTriggerHideEventChange();

		if (afterTriggerHideEventChange != null) {
			renderedAttributes.add(renderString(Tooltip.AFTER_TRIGGER_HIDE_EVENT_CHANGE, afterTriggerHideEventChange));
		}
	}

	protected void renderAfterTriggerShowEventChange(List<String> renderedAttributes, Tooltip tooltip) throws IOException {
		java.lang.String afterTriggerShowEventChange = tooltip.getAfterTriggerShowEventChange();

		if (afterTriggerShowEventChange != null) {
			renderedAttributes.add(renderString(Tooltip.AFTER_TRIGGER_SHOW_EVENT_CHANGE, afterTriggerShowEventChange));
		}
	}

	protected void renderAfterVisibleChange(List<String> renderedAttributes, Tooltip tooltip) throws IOException {
		java.lang.String afterVisibleChange = tooltip.getAfterVisibleChange();

		if (afterVisibleChange != null) {
			renderedAttributes.add(renderString(Tooltip.AFTER_VISIBLE_CHANGE, afterVisibleChange));
		}
	}

	protected void renderAfterWidthChange(List<String> renderedAttributes, Tooltip tooltip) throws IOException {
		java.lang.String afterWidthChange = tooltip.getAfterWidthChange();

		if (afterWidthChange != null) {
			renderedAttributes.add(renderString(Tooltip.AFTER_WIDTH_CHANGE, afterWidthChange));
		}
	}

	protected void renderAfterXChange(List<String> renderedAttributes, Tooltip tooltip) throws IOException {
		java.lang.String afterXChange = tooltip.getAfterXChange();

		if (afterXChange != null) {
			renderedAttributes.add(renderString(Tooltip.AFTER_XCHANGE, afterXChange));
		}
	}

	protected void renderAfterXyChange(List<String> renderedAttributes, Tooltip tooltip) throws IOException {
		java.lang.String afterXyChange = tooltip.getAfterXyChange();

		if (afterXyChange != null) {
			renderedAttributes.add(renderString(Tooltip.AFTER_XY_CHANGE, afterXyChange));
		}
	}

	protected void renderAfterYChange(List<String> renderedAttributes, Tooltip tooltip) throws IOException {
		java.lang.String afterYChange = tooltip.getAfterYChange();

		if (afterYChange != null) {
			renderedAttributes.add(renderString(Tooltip.AFTER_YCHANGE, afterYChange));
		}
	}

	protected void renderAfterZIndexChange(List<String> renderedAttributes, Tooltip tooltip) throws IOException {
		java.lang.String afterZIndexChange = tooltip.getAfterZIndexChange();

		if (afterZIndexChange != null) {
			renderedAttributes.add(renderString(Tooltip.AFTER_ZINDEX_CHANGE, afterZIndexChange));
		}
	}

	protected void renderOnAlignChange(List<String> renderedAttributes, Tooltip tooltip) throws IOException {
		java.lang.String onAlignChange = tooltip.getOnAlignChange();

		if (onAlignChange != null) {
			renderedAttributes.add(renderString(Tooltip.ON_ALIGN_CHANGE, onAlignChange));
		}
	}

	protected void renderOnAlignOnChange(List<String> renderedAttributes, Tooltip tooltip) throws IOException {
		java.lang.String onAlignOnChange = tooltip.getOnAlignOnChange();

		if (onAlignOnChange != null) {
			renderedAttributes.add(renderString(Tooltip.ON_ALIGN_ON_CHANGE, onAlignOnChange));
		}
	}

	protected void renderOnBodyContentChange(List<String> renderedAttributes, Tooltip tooltip) throws IOException {
		java.lang.String onBodyContentChange = tooltip.getOnBodyContentChange();

		if (onBodyContentChange != null) {
			renderedAttributes.add(renderString(Tooltip.ON_BODY_CONTENT_CHANGE, onBodyContentChange));
		}
	}

	protected void renderOnBoundingBoxChange(List<String> renderedAttributes, Tooltip tooltip) throws IOException {
		java.lang.String onBoundingBoxChange = tooltip.getOnBoundingBoxChange();

		if (onBoundingBoxChange != null) {
			renderedAttributes.add(renderString(Tooltip.ON_BOUNDING_BOX_CHANGE, onBoundingBoxChange));
		}
	}

	protected void renderOnCenteredChange(List<String> renderedAttributes, Tooltip tooltip) throws IOException {
		java.lang.String onCenteredChange = tooltip.getOnCenteredChange();

		if (onCenteredChange != null) {
			renderedAttributes.add(renderString(Tooltip.ON_CENTERED_CHANGE, onCenteredChange));
		}
	}

	protected void renderOnConstrainChange(List<String> renderedAttributes, Tooltip tooltip) throws IOException {
		java.lang.String onConstrainChange = tooltip.getOnConstrainChange();

		if (onConstrainChange != null) {
			renderedAttributes.add(renderString(Tooltip.ON_CONSTRAIN_CHANGE, onConstrainChange));
		}
	}

	protected void renderOnContentBoxChange(List<String> renderedAttributes, Tooltip tooltip) throws IOException {
		java.lang.String onContentBoxChange = tooltip.getOnContentBoxChange();

		if (onContentBoxChange != null) {
			renderedAttributes.add(renderString(Tooltip.ON_CONTENT_BOX_CHANGE, onContentBoxChange));
		}
	}

	protected void renderOnDestroyedChange(List<String> renderedAttributes, Tooltip tooltip) throws IOException {
		java.lang.String onDestroyedChange = tooltip.getOnDestroyedChange();

		if (onDestroyedChange != null) {
			renderedAttributes.add(renderString(Tooltip.ON_DESTROYED_CHANGE, onDestroyedChange));
		}
	}

	protected void renderOnDisabledChange(List<String> renderedAttributes, Tooltip tooltip) throws IOException {
		java.lang.String onDisabledChange = tooltip.getOnDisabledChange();

		if (onDisabledChange != null) {
			renderedAttributes.add(renderString(Tooltip.ON_DISABLED_CHANGE, onDisabledChange));
		}
	}

	protected void renderOnDurationChange(List<String> renderedAttributes, Tooltip tooltip) throws IOException {
		java.lang.String onDurationChange = tooltip.getOnDurationChange();

		if (onDurationChange != null) {
			renderedAttributes.add(renderString(Tooltip.ON_DURATION_CHANGE, onDurationChange));
		}
	}

	protected void renderOnFillHeightChange(List<String> renderedAttributes, Tooltip tooltip) throws IOException {
		java.lang.String onFillHeightChange = tooltip.getOnFillHeightChange();

		if (onFillHeightChange != null) {
			renderedAttributes.add(renderString(Tooltip.ON_FILL_HEIGHT_CHANGE, onFillHeightChange));
		}
	}

	protected void renderOnFocusedChange(List<String> renderedAttributes, Tooltip tooltip) throws IOException {
		java.lang.String onFocusedChange = tooltip.getOnFocusedChange();

		if (onFocusedChange != null) {
			renderedAttributes.add(renderString(Tooltip.ON_FOCUSED_CHANGE, onFocusedChange));
		}
	}

	protected void renderOnFooterContentChange(List<String> renderedAttributes, Tooltip tooltip) throws IOException {
		java.lang.String onFooterContentChange = tooltip.getOnFooterContentChange();

		if (onFooterContentChange != null) {
			renderedAttributes.add(renderString(Tooltip.ON_FOOTER_CONTENT_CHANGE, onFooterContentChange));
		}
	}

	protected void renderOnFormatterChange(List<String> renderedAttributes, Tooltip tooltip) throws IOException {
		java.lang.String onFormatterChange = tooltip.getOnFormatterChange();

		if (onFormatterChange != null) {
			renderedAttributes.add(renderString(Tooltip.ON_FORMATTER_CHANGE, onFormatterChange));
		}
	}

	protected void renderOnHeaderContentChange(List<String> renderedAttributes, Tooltip tooltip) throws IOException {
		java.lang.String onHeaderContentChange = tooltip.getOnHeaderContentChange();

		if (onHeaderContentChange != null) {
			renderedAttributes.add(renderString(Tooltip.ON_HEADER_CONTENT_CHANGE, onHeaderContentChange));
		}
	}

	protected void renderOnHeightChange(List<String> renderedAttributes, Tooltip tooltip) throws IOException {
		java.lang.String onHeightChange = tooltip.getOnHeightChange();

		if (onHeightChange != null) {
			renderedAttributes.add(renderString(Tooltip.ON_HEIGHT_CHANGE, onHeightChange));
		}
	}

	protected void renderOnHideOnChange(List<String> renderedAttributes, Tooltip tooltip) throws IOException {
		java.lang.String onHideOnChange = tooltip.getOnHideOnChange();

		if (onHideOnChange != null) {
			renderedAttributes.add(renderString(Tooltip.ON_HIDE_ON_CHANGE, onHideOnChange));
		}
	}

	protected void renderOnIdChange(List<String> renderedAttributes, Tooltip tooltip) throws IOException {
		java.lang.String onIdChange = tooltip.getOnIdChange();

		if (onIdChange != null) {
			renderedAttributes.add(renderString(Tooltip.ON_ID_CHANGE, onIdChange));
		}
	}

	protected void renderOnInitializedChange(List<String> renderedAttributes, Tooltip tooltip) throws IOException {
		java.lang.String onInitializedChange = tooltip.getOnInitializedChange();

		if (onInitializedChange != null) {
			renderedAttributes.add(renderString(Tooltip.ON_INITIALIZED_CHANGE, onInitializedChange));
		}
	}

	protected void renderOnLocaleChange(List<String> renderedAttributes, Tooltip tooltip) throws IOException {
		java.lang.String onLocaleChange = tooltip.getOnLocaleChange();

		if (onLocaleChange != null) {
			renderedAttributes.add(renderString(Tooltip.ON_LOCALE_CHANGE, onLocaleChange));
		}
	}

	protected void renderOnOpacityChange(List<String> renderedAttributes, Tooltip tooltip) throws IOException {
		java.lang.String onOpacityChange = tooltip.getOnOpacityChange();

		if (onOpacityChange != null) {
			renderedAttributes.add(renderString(Tooltip.ON_OPACITY_CHANGE, onOpacityChange));
		}
	}

	protected void renderOnPreventOverlapChange(List<String> renderedAttributes, Tooltip tooltip) throws IOException {
		java.lang.String onPreventOverlapChange = tooltip.getOnPreventOverlapChange();

		if (onPreventOverlapChange != null) {
			renderedAttributes.add(renderString(Tooltip.ON_PREVENT_OVERLAP_CHANGE, onPreventOverlapChange));
		}
	}

	protected void renderOnRenderChange(List<String> renderedAttributes, Tooltip tooltip) throws IOException {
		java.lang.String onRenderChange = tooltip.getOnRenderChange();

		if (onRenderChange != null) {
			renderedAttributes.add(renderString(Tooltip.ON_RENDER_CHANGE, onRenderChange));
		}
	}

	protected void renderOnRenderedChange(List<String> renderedAttributes, Tooltip tooltip) throws IOException {
		java.lang.String onRenderedChange = tooltip.getOnRenderedChange();

		if (onRenderedChange != null) {
			renderedAttributes.add(renderString(Tooltip.ON_RENDERED_CHANGE, onRenderedChange));
		}
	}

	protected void renderOnShimChange(List<String> renderedAttributes, Tooltip tooltip) throws IOException {
		java.lang.String onShimChange = tooltip.getOnShimChange();

		if (onShimChange != null) {
			renderedAttributes.add(renderString(Tooltip.ON_SHIM_CHANGE, onShimChange));
		}
	}

	protected void renderOnSrcNodeChange(List<String> renderedAttributes, Tooltip tooltip) throws IOException {
		java.lang.String onSrcNodeChange = tooltip.getOnSrcNodeChange();

		if (onSrcNodeChange != null) {
			renderedAttributes.add(renderString(Tooltip.ON_SRC_NODE_CHANGE, onSrcNodeChange));
		}
	}

	protected void renderOnStringsChange(List<String> renderedAttributes, Tooltip tooltip) throws IOException {
		java.lang.String onStringsChange = tooltip.getOnStringsChange();

		if (onStringsChange != null) {
			renderedAttributes.add(renderString(Tooltip.ON_STRINGS_CHANGE, onStringsChange));
		}
	}

	protected void renderOnTabIndexChange(List<String> renderedAttributes, Tooltip tooltip) throws IOException {
		java.lang.String onTabIndexChange = tooltip.getOnTabIndexChange();

		if (onTabIndexChange != null) {
			renderedAttributes.add(renderString(Tooltip.ON_TAB_INDEX_CHANGE, onTabIndexChange));
		}
	}

	protected void renderOnToolbarPositionChange(List<String> renderedAttributes, Tooltip tooltip) throws IOException {
		java.lang.String onToolbarPositionChange = tooltip.getOnToolbarPositionChange();

		if (onToolbarPositionChange != null) {
			renderedAttributes.add(renderString(Tooltip.ON_TOOLBAR_POSITION_CHANGE, onToolbarPositionChange));
		}
	}

	protected void renderOnToolbarsChange(List<String> renderedAttributes, Tooltip tooltip) throws IOException {
		java.lang.String onToolbarsChange = tooltip.getOnToolbarsChange();

		if (onToolbarsChange != null) {
			renderedAttributes.add(renderString(Tooltip.ON_TOOLBARS_CHANGE, onToolbarsChange));
		}
	}

	protected void renderOnTriggerHideEventChange(List<String> renderedAttributes, Tooltip tooltip) throws IOException {
		java.lang.String onTriggerHideEventChange = tooltip.getOnTriggerHideEventChange();

		if (onTriggerHideEventChange != null) {
			renderedAttributes.add(renderString(Tooltip.ON_TRIGGER_HIDE_EVENT_CHANGE, onTriggerHideEventChange));
		}
	}

	protected void renderOnTriggerShowEventChange(List<String> renderedAttributes, Tooltip tooltip) throws IOException {
		java.lang.String onTriggerShowEventChange = tooltip.getOnTriggerShowEventChange();

		if (onTriggerShowEventChange != null) {
			renderedAttributes.add(renderString(Tooltip.ON_TRIGGER_SHOW_EVENT_CHANGE, onTriggerShowEventChange));
		}
	}

	protected void renderOnVisibleChange(List<String> renderedAttributes, Tooltip tooltip) throws IOException {
		java.lang.String onVisibleChange = tooltip.getOnVisibleChange();

		if (onVisibleChange != null) {
			renderedAttributes.add(renderString(Tooltip.ON_VISIBLE_CHANGE, onVisibleChange));
		}
	}

	protected void renderOnWidthChange(List<String> renderedAttributes, Tooltip tooltip) throws IOException {
		java.lang.String onWidthChange = tooltip.getOnWidthChange();

		if (onWidthChange != null) {
			renderedAttributes.add(renderString(Tooltip.ON_WIDTH_CHANGE, onWidthChange));
		}
	}

	protected void renderOnXChange(List<String> renderedAttributes, Tooltip tooltip) throws IOException {
		java.lang.String onXChange = tooltip.getOnXChange();

		if (onXChange != null) {
			renderedAttributes.add(renderString(Tooltip.ON_XCHANGE, onXChange));
		}
	}

	protected void renderOnXyChange(List<String> renderedAttributes, Tooltip tooltip) throws IOException {
		java.lang.String onXyChange = tooltip.getOnXyChange();

		if (onXyChange != null) {
			renderedAttributes.add(renderString(Tooltip.ON_XY_CHANGE, onXyChange));
		}
	}

	protected void renderOnYChange(List<String> renderedAttributes, Tooltip tooltip) throws IOException {
		java.lang.String onYChange = tooltip.getOnYChange();

		if (onYChange != null) {
			renderedAttributes.add(renderString(Tooltip.ON_YCHANGE, onYChange));
		}
	}

	protected void renderOnZIndexChange(List<String> renderedAttributes, Tooltip tooltip) throws IOException {
		java.lang.String onZIndexChange = tooltip.getOnZIndexChange();

		if (onZIndexChange != null) {
			renderedAttributes.add(renderString(Tooltip.ON_ZINDEX_CHANGE, onZIndexChange));
		}
	}

}
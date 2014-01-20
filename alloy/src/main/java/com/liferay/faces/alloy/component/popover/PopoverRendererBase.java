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
package com.liferay.faces.alloy.component.popover;

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
public abstract class PopoverRendererBase extends RendererBase {

	// Private Constants
	private static final String AUI_MODULE_NAME = "aui-popover";

	protected void encodeJavaScriptMain(FacesContext facesContext, UIComponent uiComponent) throws IOException {

		Popover popover = (Popover) uiComponent;

		ResponseWriter responseWriter = facesContext.getResponseWriter();

		responseWriter.write("var popover = new A.Popover");
		responseWriter.write(StringPool.OPEN_PARENTHESIS);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedAttributes = new ArrayList<String>();

		renderAlign(renderedAttributes, popover);
		renderAlignOn(renderedAttributes, popover);
		renderPopoverBodyContent(renderedAttributes, popover);
		renderBoundingBox(renderedAttributes, popover);
		renderCentered(renderedAttributes, popover);
		renderConstrain(renderedAttributes, popover);
		renderContentBox(renderedAttributes, popover);
		renderDestroyed(renderedAttributes, popover);
		renderDisabled(renderedAttributes, popover);
		renderFillHeight(renderedAttributes, popover);
		renderFocusOn(renderedAttributes, popover);
		renderFocused(renderedAttributes, popover);
		renderFooterContent(renderedAttributes, popover);
		renderHeaderContent(renderedAttributes, popover);
		renderHeight(renderedAttributes, popover);
		renderHideOn(renderedAttributes, popover);
		renderPopoverId(renderedAttributes, popover);
		renderInitialized(renderedAttributes, popover);
		renderPopoverLocale(renderedAttributes, popover);
		renderMaskNode(renderedAttributes, popover);
		renderModal(renderedAttributes, popover);
		renderPreventOverlap(renderedAttributes, popover);
		renderRender(renderedAttributes, popover);
		renderRendered(renderedAttributes, popover);
		renderShim(renderedAttributes, popover);
		renderSrcNode(renderedAttributes, popover);
		renderStrings(renderedAttributes, popover);
		renderTabIndex(renderedAttributes, popover);
		renderToolbarPosition(renderedAttributes, popover);
		renderToolbars(renderedAttributes, popover);
		renderTriggerToggleEvent(renderedAttributes, popover);
		renderVisible(renderedAttributes, popover);
		renderWidth(renderedAttributes, popover);
		renderX(renderedAttributes, popover);
		renderXy(renderedAttributes, popover);
		renderY(renderedAttributes, popover);
		renderZIndex(renderedAttributes, popover);
		renderFor(renderedAttributes, popover);

		for (String renderedAttribute : renderedAttributes) {
			responseWriter.write(renderedAttribute);
			responseWriter.write(StringPool.COMMA);
		}

		responseWriter.write("after");
		responseWriter.write(StringPool.COLON);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedAfterEvents = new ArrayList<String>();

		renderAfterAlignChange(renderedAfterEvents, popover);
		renderAfterAlignOnChange(renderedAfterEvents, popover);
		renderAfterBodyContentChange(renderedAfterEvents, popover);
		renderAfterBoundingBoxChange(renderedAfterEvents, popover);
		renderAfterCenteredChange(renderedAfterEvents, popover);
		renderAfterConstrainChange(renderedAfterEvents, popover);
		renderAfterContentBoxChange(renderedAfterEvents, popover);
		renderAfterDestroyedChange(renderedAfterEvents, popover);
		renderAfterDisabledChange(renderedAfterEvents, popover);
		renderAfterFillHeightChange(renderedAfterEvents, popover);
		renderAfterFocusOnChange(renderedAfterEvents, popover);
		renderAfterFocusedChange(renderedAfterEvents, popover);
		renderAfterFooterContentChange(renderedAfterEvents, popover);
		renderAfterHeaderContentChange(renderedAfterEvents, popover);
		renderAfterHeightChange(renderedAfterEvents, popover);
		renderAfterHideOnChange(renderedAfterEvents, popover);
		renderAfterIdChange(renderedAfterEvents, popover);
		renderAfterInitializedChange(renderedAfterEvents, popover);
		renderAfterLocaleChange(renderedAfterEvents, popover);
		renderAfterMaskNodeChange(renderedAfterEvents, popover);
		renderAfterModalChange(renderedAfterEvents, popover);
		renderAfterPreventOverlapChange(renderedAfterEvents, popover);
		renderAfterRenderChange(renderedAfterEvents, popover);
		renderAfterRenderedChange(renderedAfterEvents, popover);
		renderAfterShimChange(renderedAfterEvents, popover);
		renderAfterSrcNodeChange(renderedAfterEvents, popover);
		renderAfterStringsChange(renderedAfterEvents, popover);
		renderAfterTabIndexChange(renderedAfterEvents, popover);
		renderAfterToolbarPositionChange(renderedAfterEvents, popover);
		renderAfterToolbarsChange(renderedAfterEvents, popover);
		renderAfterTriggerToggleEventChange(renderedAfterEvents, popover);
		renderAfterVisibleChange(renderedAfterEvents, popover);
		renderAfterWidthChange(renderedAfterEvents, popover);
		renderAfterXChange(renderedAfterEvents, popover);
		renderAfterXyChange(renderedAfterEvents, popover);
		renderAfterYChange(renderedAfterEvents, popover);
		renderAfterZIndexChange(renderedAfterEvents, popover);

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

		renderOnAlignChange(renderedOnEvents, popover);
		renderOnAlignOnChange(renderedOnEvents, popover);
		renderOnBodyContentChange(renderedOnEvents, popover);
		renderOnBoundingBoxChange(renderedOnEvents, popover);
		renderOnCenteredChange(renderedOnEvents, popover);
		renderOnConstrainChange(renderedOnEvents, popover);
		renderOnContentBoxChange(renderedOnEvents, popover);
		renderOnDestroyedChange(renderedOnEvents, popover);
		renderOnDisabledChange(renderedOnEvents, popover);
		renderOnFillHeightChange(renderedOnEvents, popover);
		renderOnFocusOnChange(renderedOnEvents, popover);
		renderOnFocusedChange(renderedOnEvents, popover);
		renderOnFooterContentChange(renderedOnEvents, popover);
		renderOnHeaderContentChange(renderedOnEvents, popover);
		renderOnHeightChange(renderedOnEvents, popover);
		renderOnHideOnChange(renderedOnEvents, popover);
		renderOnIdChange(renderedOnEvents, popover);
		renderOnInitializedChange(renderedOnEvents, popover);
		renderOnLocaleChange(renderedOnEvents, popover);
		renderOnMaskNodeChange(renderedOnEvents, popover);
		renderOnModalChange(renderedOnEvents, popover);
		renderOnPreventOverlapChange(renderedOnEvents, popover);
		renderOnRenderChange(renderedOnEvents, popover);
		renderOnRenderedChange(renderedOnEvents, popover);
		renderOnShimChange(renderedOnEvents, popover);
		renderOnSrcNodeChange(renderedOnEvents, popover);
		renderOnStringsChange(renderedOnEvents, popover);
		renderOnTabIndexChange(renderedOnEvents, popover);
		renderOnToolbarPositionChange(renderedOnEvents, popover);
		renderOnToolbarsChange(renderedOnEvents, popover);
		renderOnTriggerToggleEventChange(renderedOnEvents, popover);
		renderOnVisibleChange(renderedOnEvents, popover);
		renderOnWidthChange(renderedOnEvents, popover);
		renderOnXChange(renderedOnEvents, popover);
		renderOnXyChange(renderedOnEvents, popover);
		renderOnYChange(renderedOnEvents, popover);
		renderOnZIndexChange(renderedOnEvents, popover);

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

	protected void renderAlign(List<String> renderedAttributes, Popover popover) throws IOException {
		java.lang.Object align = popover.getAlign();

		if (align != null) {
			renderedAttributes.add(renderObject(Popover.ALIGN, align));
		}
	}

	protected void renderAlignOn(List<String> renderedAttributes, Popover popover) throws IOException {
		java.lang.Object alignOn = popover.getAlignOn();

		if (alignOn != null) {
			renderedAttributes.add(renderArray(Popover.ALIGN_ON, alignOn));
		}
	}

	protected void renderPopoverBodyContent(List<String> renderedAttributes, Popover popover) throws IOException {
		java.lang.Object popoverBodyContent = popover.getPopoverBodyContent();

		if (popoverBodyContent != null) {
			renderedAttributes.add(renderString(Popover.POPOVER_BODY_CONTENT, popoverBodyContent));
		}
	}

	protected void renderBoundingBox(List<String> renderedAttributes, Popover popover) throws IOException {
		java.lang.String boundingBox = popover.getBoundingBox();

		if (boundingBox != null) {
			renderedAttributes.add(renderString(Popover.BOUNDING_BOX, boundingBox));
		}
	}

	protected void renderCentered(List<String> renderedAttributes, Popover popover) throws IOException {
		java.lang.Object centered = popover.getCentered();

		if (centered != null) {
			renderedAttributes.add(renderString(Popover.CENTERED, centered));
		}
	}

	protected void renderConstrain(List<String> renderedAttributes, Popover popover) throws IOException {
		java.lang.Object constrain = popover.getConstrain();

		if (constrain != null) {
			renderedAttributes.add(renderString(Popover.CONSTRAIN, constrain));
		}
	}

	protected void renderContentBox(List<String> renderedAttributes, Popover popover) throws IOException {
		java.lang.String contentBox = popover.getContentBox();

		if (contentBox != null) {
			renderedAttributes.add(renderString(Popover.CONTENT_BOX, contentBox));
		}
	}

	protected void renderDestroyed(List<String> renderedAttributes, Popover popover) throws IOException {
		java.lang.Boolean destroyed = popover.getDestroyed();

		if (destroyed != null) {
			renderedAttributes.add(renderBoolean(Popover.DESTROYED, destroyed));
		}
	}

	protected void renderDisabled(List<String> renderedAttributes, Popover popover) throws IOException {
		java.lang.Boolean disabled = popover.getDisabled();

		if (disabled != null) {
			renderedAttributes.add(renderBoolean(Popover.DISABLED, disabled));
		}
	}

	protected void renderFillHeight(List<String> renderedAttributes, Popover popover) throws IOException {
		java.lang.Object fillHeight = popover.getFillHeight();

		if (fillHeight != null) {
			renderedAttributes.add(renderString(Popover.FILL_HEIGHT, fillHeight));
		}
	}

	protected void renderFocusOn(List<String> renderedAttributes, Popover popover) throws IOException {
		java.lang.Object focusOn = popover.getFocusOn();

		if (focusOn != null) {
			renderedAttributes.add(renderArray(Popover.FOCUS_ON, focusOn));
		}
	}

	protected void renderFocused(List<String> renderedAttributes, Popover popover) throws IOException {
		java.lang.Boolean focused = popover.getFocused();

		if (focused != null) {
			renderedAttributes.add(renderBoolean(Popover.FOCUSED, focused));
		}
	}

	protected void renderFooterContent(List<String> renderedAttributes, Popover popover) throws IOException {
		java.lang.Object footerContent = popover.getFooterContent();

		if (footerContent != null) {
			renderedAttributes.add(renderString(Popover.FOOTER_CONTENT, footerContent));
		}
	}

	protected void renderHeaderContent(List<String> renderedAttributes, Popover popover) throws IOException {
		java.lang.Object headerContent = popover.getHeaderContent();

		if (headerContent != null) {
			renderedAttributes.add(renderString(Popover.HEADER_CONTENT, headerContent));
		}
	}

	protected void renderHeight(List<String> renderedAttributes, Popover popover) throws IOException {
		java.lang.Object height = popover.getHeight();

		if (height != null) {
			renderedAttributes.add(renderString(Popover.HEIGHT, height));
		}
	}

	protected void renderHideOn(List<String> renderedAttributes, Popover popover) throws IOException {
		java.lang.Object hideOn = popover.getHideOn();

		if (hideOn != null) {
			renderedAttributes.add(renderArray(Popover.HIDE_ON, hideOn));
		}
	}

	protected void renderPopoverId(List<String> renderedAttributes, Popover popover) throws IOException {
		java.lang.String popoverId = popover.getPopoverId();

		if (popoverId != null) {
			renderedAttributes.add(renderString(Popover.POPOVER_ID, popoverId));
		}
	}

	protected void renderInitialized(List<String> renderedAttributes, Popover popover) throws IOException {
		java.lang.Boolean initialized = popover.getInitialized();

		if (initialized != null) {
			renderedAttributes.add(renderBoolean(Popover.INITIALIZED, initialized));
		}
	}

	protected void renderPopoverLocale(List<String> renderedAttributes, Popover popover) throws IOException {
		java.lang.String popoverLocale = popover.getPopoverLocale();

		if (popoverLocale != null) {
			renderedAttributes.add(renderString(Popover.POPOVER_LOCALE, popoverLocale));
		}
	}

	protected void renderMaskNode(List<String> renderedAttributes, Popover popover) throws IOException {
		java.lang.Object maskNode = popover.getMaskNode();

		if (maskNode != null) {
			renderedAttributes.add(renderString(Popover.MASK_NODE, maskNode));
		}
	}

	protected void renderModal(List<String> renderedAttributes, Popover popover) throws IOException {
		java.lang.Boolean modal = popover.getModal();

		if (modal != null) {
			renderedAttributes.add(renderBoolean(Popover.MODAL, modal));
		}
	}

	protected void renderPreventOverlap(List<String> renderedAttributes, Popover popover) throws IOException {
		java.lang.Boolean preventOverlap = popover.getPreventOverlap();

		if (preventOverlap != null) {
			renderedAttributes.add(renderBoolean(Popover.PREVENT_OVERLAP, preventOverlap));
		}
	}

	protected void renderRender(List<String> renderedAttributes, Popover popover) throws IOException {
		java.lang.Object render = popover.getRender();

		if (render != null) {
			renderedAttributes.add(renderString(Popover.RENDER, render));
		}
	}

	protected void renderRendered(List<String> renderedAttributes, Popover popover) throws IOException {
		java.lang.Boolean rendered = popover.getRendered();

		if (rendered != null) {
			renderedAttributes.add(renderBoolean(Popover.RENDERED, rendered));
		}
	}

	protected void renderShim(List<String> renderedAttributes, Popover popover) throws IOException {
		java.lang.Boolean shim = popover.getShim();

		if (shim != null) {
			renderedAttributes.add(renderBoolean(Popover.SHIM, shim));
		}
	}

	protected void renderSrcNode(List<String> renderedAttributes, Popover popover) throws IOException {
		java.lang.String srcNode = popover.getSrcNode();

		if (srcNode != null) {
			renderedAttributes.add(renderString(Popover.SRC_NODE, srcNode));
		}
	}

	protected void renderStrings(List<String> renderedAttributes, Popover popover) throws IOException {
		java.lang.Object strings = popover.getStrings();

		if (strings != null) {
			renderedAttributes.add(renderObject(Popover.STRINGS, strings));
		}
	}

	protected void renderTabIndex(List<String> renderedAttributes, Popover popover) throws IOException {
		java.lang.Object tabIndex = popover.getTabIndex();

		if (tabIndex != null) {
			renderedAttributes.add(renderNumber(Popover.TAB_INDEX, tabIndex));
		}
	}

	protected void renderToolbarPosition(List<String> renderedAttributes, Popover popover) throws IOException {
		java.lang.Object toolbarPosition = popover.getToolbarPosition();

		if (toolbarPosition != null) {
			renderedAttributes.add(renderObject(Popover.TOOLBAR_POSITION, toolbarPosition));
		}
	}

	protected void renderToolbars(List<String> renderedAttributes, Popover popover) throws IOException {
		java.lang.String toolbars = popover.getToolbars();

		if (toolbars != null) {
			renderedAttributes.add(renderString(Popover.TOOLBARS, toolbars));
		}
	}

	protected void renderTriggerToggleEvent(List<String> renderedAttributes, Popover popover) throws IOException {
		java.lang.String triggerToggleEvent = popover.getTriggerToggleEvent();

		if (triggerToggleEvent != null) {
			renderedAttributes.add(renderString(Popover.TRIGGER_TOGGLE_EVENT, triggerToggleEvent));
		}
	}

	protected void renderVisible(List<String> renderedAttributes, Popover popover) throws IOException {
		java.lang.Boolean visible = popover.getVisible();

		if (visible != null) {
			renderedAttributes.add(renderBoolean(Popover.VISIBLE, visible));
		}
	}

	protected void renderWidth(List<String> renderedAttributes, Popover popover) throws IOException {
		java.lang.Object width = popover.getWidth();

		if (width != null) {
			renderedAttributes.add(renderString(Popover.WIDTH, width));
		}
	}

	protected void renderX(List<String> renderedAttributes, Popover popover) throws IOException {
		java.lang.Object x = popover.getX();

		if (x != null) {
			renderedAttributes.add(renderNumber(Popover.X, x));
		}
	}

	protected void renderXy(List<String> renderedAttributes, Popover popover) throws IOException {
		java.lang.Object xy = popover.getXy();

		if (xy != null) {
			renderedAttributes.add(renderArray(Popover.XY, xy));
		}
	}

	protected void renderY(List<String> renderedAttributes, Popover popover) throws IOException {
		java.lang.Object y = popover.getY();

		if (y != null) {
			renderedAttributes.add(renderNumber(Popover.Y, y));
		}
	}

	protected void renderZIndex(List<String> renderedAttributes, Popover popover) throws IOException {
		java.lang.Object zIndex = popover.getZIndex();

		if (zIndex != null) {
			renderedAttributes.add(renderNumber(Popover.Z_INDEX, zIndex));
		}
	}

	protected void renderFor(List<String> renderedAttributes, Popover popover) throws IOException {
		java.lang.String for_ = popover.getFor();

		if (for_ != null) {
			renderedAttributes.add(renderString(Popover.FOR, for_));
		}
	}

	protected void renderAfterAlignChange(List<String> renderedAttributes, Popover popover) throws IOException {
		java.lang.String afterAlignChange = popover.getAfterAlignChange();

		if (afterAlignChange != null) {
			renderedAttributes.add(renderString(Popover.AFTER_ALIGN_CHANGE, afterAlignChange));
		}
	}

	protected void renderAfterAlignOnChange(List<String> renderedAttributes, Popover popover) throws IOException {
		java.lang.String afterAlignOnChange = popover.getAfterAlignOnChange();

		if (afterAlignOnChange != null) {
			renderedAttributes.add(renderString(Popover.AFTER_ALIGN_ON_CHANGE, afterAlignOnChange));
		}
	}

	protected void renderAfterBodyContentChange(List<String> renderedAttributes, Popover popover) throws IOException {
		java.lang.String afterBodyContentChange = popover.getAfterBodyContentChange();

		if (afterBodyContentChange != null) {
			renderedAttributes.add(renderString(Popover.AFTER_BODY_CONTENT_CHANGE, afterBodyContentChange));
		}
	}

	protected void renderAfterBoundingBoxChange(List<String> renderedAttributes, Popover popover) throws IOException {
		java.lang.String afterBoundingBoxChange = popover.getAfterBoundingBoxChange();

		if (afterBoundingBoxChange != null) {
			renderedAttributes.add(renderString(Popover.AFTER_BOUNDING_BOX_CHANGE, afterBoundingBoxChange));
		}
	}

	protected void renderAfterCenteredChange(List<String> renderedAttributes, Popover popover) throws IOException {
		java.lang.String afterCenteredChange = popover.getAfterCenteredChange();

		if (afterCenteredChange != null) {
			renderedAttributes.add(renderString(Popover.AFTER_CENTERED_CHANGE, afterCenteredChange));
		}
	}

	protected void renderAfterConstrainChange(List<String> renderedAttributes, Popover popover) throws IOException {
		java.lang.String afterConstrainChange = popover.getAfterConstrainChange();

		if (afterConstrainChange != null) {
			renderedAttributes.add(renderString(Popover.AFTER_CONSTRAIN_CHANGE, afterConstrainChange));
		}
	}

	protected void renderAfterContentBoxChange(List<String> renderedAttributes, Popover popover) throws IOException {
		java.lang.String afterContentBoxChange = popover.getAfterContentBoxChange();

		if (afterContentBoxChange != null) {
			renderedAttributes.add(renderString(Popover.AFTER_CONTENT_BOX_CHANGE, afterContentBoxChange));
		}
	}

	protected void renderAfterDestroyedChange(List<String> renderedAttributes, Popover popover) throws IOException {
		java.lang.String afterDestroyedChange = popover.getAfterDestroyedChange();

		if (afterDestroyedChange != null) {
			renderedAttributes.add(renderString(Popover.AFTER_DESTROYED_CHANGE, afterDestroyedChange));
		}
	}

	protected void renderAfterDisabledChange(List<String> renderedAttributes, Popover popover) throws IOException {
		java.lang.String afterDisabledChange = popover.getAfterDisabledChange();

		if (afterDisabledChange != null) {
			renderedAttributes.add(renderString(Popover.AFTER_DISABLED_CHANGE, afterDisabledChange));
		}
	}

	protected void renderAfterFillHeightChange(List<String> renderedAttributes, Popover popover) throws IOException {
		java.lang.String afterFillHeightChange = popover.getAfterFillHeightChange();

		if (afterFillHeightChange != null) {
			renderedAttributes.add(renderString(Popover.AFTER_FILL_HEIGHT_CHANGE, afterFillHeightChange));
		}
	}

	protected void renderAfterFocusOnChange(List<String> renderedAttributes, Popover popover) throws IOException {
		java.lang.String afterFocusOnChange = popover.getAfterFocusOnChange();

		if (afterFocusOnChange != null) {
			renderedAttributes.add(renderString(Popover.AFTER_FOCUS_ON_CHANGE, afterFocusOnChange));
		}
	}

	protected void renderAfterFocusedChange(List<String> renderedAttributes, Popover popover) throws IOException {
		java.lang.String afterFocusedChange = popover.getAfterFocusedChange();

		if (afterFocusedChange != null) {
			renderedAttributes.add(renderString(Popover.AFTER_FOCUSED_CHANGE, afterFocusedChange));
		}
	}

	protected void renderAfterFooterContentChange(List<String> renderedAttributes, Popover popover) throws IOException {
		java.lang.String afterFooterContentChange = popover.getAfterFooterContentChange();

		if (afterFooterContentChange != null) {
			renderedAttributes.add(renderString(Popover.AFTER_FOOTER_CONTENT_CHANGE, afterFooterContentChange));
		}
	}

	protected void renderAfterHeaderContentChange(List<String> renderedAttributes, Popover popover) throws IOException {
		java.lang.String afterHeaderContentChange = popover.getAfterHeaderContentChange();

		if (afterHeaderContentChange != null) {
			renderedAttributes.add(renderString(Popover.AFTER_HEADER_CONTENT_CHANGE, afterHeaderContentChange));
		}
	}

	protected void renderAfterHeightChange(List<String> renderedAttributes, Popover popover) throws IOException {
		java.lang.String afterHeightChange = popover.getAfterHeightChange();

		if (afterHeightChange != null) {
			renderedAttributes.add(renderString(Popover.AFTER_HEIGHT_CHANGE, afterHeightChange));
		}
	}

	protected void renderAfterHideOnChange(List<String> renderedAttributes, Popover popover) throws IOException {
		java.lang.String afterHideOnChange = popover.getAfterHideOnChange();

		if (afterHideOnChange != null) {
			renderedAttributes.add(renderString(Popover.AFTER_HIDE_ON_CHANGE, afterHideOnChange));
		}
	}

	protected void renderAfterIdChange(List<String> renderedAttributes, Popover popover) throws IOException {
		java.lang.String afterIdChange = popover.getAfterIdChange();

		if (afterIdChange != null) {
			renderedAttributes.add(renderString(Popover.AFTER_ID_CHANGE, afterIdChange));
		}
	}

	protected void renderAfterInitializedChange(List<String> renderedAttributes, Popover popover) throws IOException {
		java.lang.String afterInitializedChange = popover.getAfterInitializedChange();

		if (afterInitializedChange != null) {
			renderedAttributes.add(renderString(Popover.AFTER_INITIALIZED_CHANGE, afterInitializedChange));
		}
	}

	protected void renderAfterLocaleChange(List<String> renderedAttributes, Popover popover) throws IOException {
		java.lang.String afterLocaleChange = popover.getAfterLocaleChange();

		if (afterLocaleChange != null) {
			renderedAttributes.add(renderString(Popover.AFTER_LOCALE_CHANGE, afterLocaleChange));
		}
	}

	protected void renderAfterMaskNodeChange(List<String> renderedAttributes, Popover popover) throws IOException {
		java.lang.String afterMaskNodeChange = popover.getAfterMaskNodeChange();

		if (afterMaskNodeChange != null) {
			renderedAttributes.add(renderString(Popover.AFTER_MASK_NODE_CHANGE, afterMaskNodeChange));
		}
	}

	protected void renderAfterModalChange(List<String> renderedAttributes, Popover popover) throws IOException {
		java.lang.String afterModalChange = popover.getAfterModalChange();

		if (afterModalChange != null) {
			renderedAttributes.add(renderString(Popover.AFTER_MODAL_CHANGE, afterModalChange));
		}
	}

	protected void renderAfterPreventOverlapChange(List<String> renderedAttributes, Popover popover) throws IOException {
		java.lang.String afterPreventOverlapChange = popover.getAfterPreventOverlapChange();

		if (afterPreventOverlapChange != null) {
			renderedAttributes.add(renderString(Popover.AFTER_PREVENT_OVERLAP_CHANGE, afterPreventOverlapChange));
		}
	}

	protected void renderAfterRenderChange(List<String> renderedAttributes, Popover popover) throws IOException {
		java.lang.String afterRenderChange = popover.getAfterRenderChange();

		if (afterRenderChange != null) {
			renderedAttributes.add(renderString(Popover.AFTER_RENDER_CHANGE, afterRenderChange));
		}
	}

	protected void renderAfterRenderedChange(List<String> renderedAttributes, Popover popover) throws IOException {
		java.lang.String afterRenderedChange = popover.getAfterRenderedChange();

		if (afterRenderedChange != null) {
			renderedAttributes.add(renderString(Popover.AFTER_RENDERED_CHANGE, afterRenderedChange));
		}
	}

	protected void renderAfterShimChange(List<String> renderedAttributes, Popover popover) throws IOException {
		java.lang.String afterShimChange = popover.getAfterShimChange();

		if (afterShimChange != null) {
			renderedAttributes.add(renderString(Popover.AFTER_SHIM_CHANGE, afterShimChange));
		}
	}

	protected void renderAfterSrcNodeChange(List<String> renderedAttributes, Popover popover) throws IOException {
		java.lang.String afterSrcNodeChange = popover.getAfterSrcNodeChange();

		if (afterSrcNodeChange != null) {
			renderedAttributes.add(renderString(Popover.AFTER_SRC_NODE_CHANGE, afterSrcNodeChange));
		}
	}

	protected void renderAfterStringsChange(List<String> renderedAttributes, Popover popover) throws IOException {
		java.lang.String afterStringsChange = popover.getAfterStringsChange();

		if (afterStringsChange != null) {
			renderedAttributes.add(renderString(Popover.AFTER_STRINGS_CHANGE, afterStringsChange));
		}
	}

	protected void renderAfterTabIndexChange(List<String> renderedAttributes, Popover popover) throws IOException {
		java.lang.String afterTabIndexChange = popover.getAfterTabIndexChange();

		if (afterTabIndexChange != null) {
			renderedAttributes.add(renderString(Popover.AFTER_TAB_INDEX_CHANGE, afterTabIndexChange));
		}
	}

	protected void renderAfterToolbarPositionChange(List<String> renderedAttributes, Popover popover) throws IOException {
		java.lang.String afterToolbarPositionChange = popover.getAfterToolbarPositionChange();

		if (afterToolbarPositionChange != null) {
			renderedAttributes.add(renderString(Popover.AFTER_TOOLBAR_POSITION_CHANGE, afterToolbarPositionChange));
		}
	}

	protected void renderAfterToolbarsChange(List<String> renderedAttributes, Popover popover) throws IOException {
		java.lang.String afterToolbarsChange = popover.getAfterToolbarsChange();

		if (afterToolbarsChange != null) {
			renderedAttributes.add(renderString(Popover.AFTER_TOOLBARS_CHANGE, afterToolbarsChange));
		}
	}

	protected void renderAfterTriggerToggleEventChange(List<String> renderedAttributes, Popover popover) throws IOException {
		java.lang.String afterTriggerToggleEventChange = popover.getAfterTriggerToggleEventChange();

		if (afterTriggerToggleEventChange != null) {
			renderedAttributes.add(renderString(Popover.AFTER_TRIGGER_TOGGLE_EVENT_CHANGE, afterTriggerToggleEventChange));
		}
	}

	protected void renderAfterVisibleChange(List<String> renderedAttributes, Popover popover) throws IOException {
		java.lang.String afterVisibleChange = popover.getAfterVisibleChange();

		if (afterVisibleChange != null) {
			renderedAttributes.add(renderString(Popover.AFTER_VISIBLE_CHANGE, afterVisibleChange));
		}
	}

	protected void renderAfterWidthChange(List<String> renderedAttributes, Popover popover) throws IOException {
		java.lang.String afterWidthChange = popover.getAfterWidthChange();

		if (afterWidthChange != null) {
			renderedAttributes.add(renderString(Popover.AFTER_WIDTH_CHANGE, afterWidthChange));
		}
	}

	protected void renderAfterXChange(List<String> renderedAttributes, Popover popover) throws IOException {
		java.lang.String afterXChange = popover.getAfterXChange();

		if (afterXChange != null) {
			renderedAttributes.add(renderString(Popover.AFTER_XCHANGE, afterXChange));
		}
	}

	protected void renderAfterXyChange(List<String> renderedAttributes, Popover popover) throws IOException {
		java.lang.String afterXyChange = popover.getAfterXyChange();

		if (afterXyChange != null) {
			renderedAttributes.add(renderString(Popover.AFTER_XY_CHANGE, afterXyChange));
		}
	}

	protected void renderAfterYChange(List<String> renderedAttributes, Popover popover) throws IOException {
		java.lang.String afterYChange = popover.getAfterYChange();

		if (afterYChange != null) {
			renderedAttributes.add(renderString(Popover.AFTER_YCHANGE, afterYChange));
		}
	}

	protected void renderAfterZIndexChange(List<String> renderedAttributes, Popover popover) throws IOException {
		java.lang.String afterZIndexChange = popover.getAfterZIndexChange();

		if (afterZIndexChange != null) {
			renderedAttributes.add(renderString(Popover.AFTER_ZINDEX_CHANGE, afterZIndexChange));
		}
	}

	protected void renderOnAlignChange(List<String> renderedAttributes, Popover popover) throws IOException {
		java.lang.String onAlignChange = popover.getOnAlignChange();

		if (onAlignChange != null) {
			renderedAttributes.add(renderString(Popover.ON_ALIGN_CHANGE, onAlignChange));
		}
	}

	protected void renderOnAlignOnChange(List<String> renderedAttributes, Popover popover) throws IOException {
		java.lang.String onAlignOnChange = popover.getOnAlignOnChange();

		if (onAlignOnChange != null) {
			renderedAttributes.add(renderString(Popover.ON_ALIGN_ON_CHANGE, onAlignOnChange));
		}
	}

	protected void renderOnBodyContentChange(List<String> renderedAttributes, Popover popover) throws IOException {
		java.lang.String onBodyContentChange = popover.getOnBodyContentChange();

		if (onBodyContentChange != null) {
			renderedAttributes.add(renderString(Popover.ON_BODY_CONTENT_CHANGE, onBodyContentChange));
		}
	}

	protected void renderOnBoundingBoxChange(List<String> renderedAttributes, Popover popover) throws IOException {
		java.lang.String onBoundingBoxChange = popover.getOnBoundingBoxChange();

		if (onBoundingBoxChange != null) {
			renderedAttributes.add(renderString(Popover.ON_BOUNDING_BOX_CHANGE, onBoundingBoxChange));
		}
	}

	protected void renderOnCenteredChange(List<String> renderedAttributes, Popover popover) throws IOException {
		java.lang.String onCenteredChange = popover.getOnCenteredChange();

		if (onCenteredChange != null) {
			renderedAttributes.add(renderString(Popover.ON_CENTERED_CHANGE, onCenteredChange));
		}
	}

	protected void renderOnConstrainChange(List<String> renderedAttributes, Popover popover) throws IOException {
		java.lang.String onConstrainChange = popover.getOnConstrainChange();

		if (onConstrainChange != null) {
			renderedAttributes.add(renderString(Popover.ON_CONSTRAIN_CHANGE, onConstrainChange));
		}
	}

	protected void renderOnContentBoxChange(List<String> renderedAttributes, Popover popover) throws IOException {
		java.lang.String onContentBoxChange = popover.getOnContentBoxChange();

		if (onContentBoxChange != null) {
			renderedAttributes.add(renderString(Popover.ON_CONTENT_BOX_CHANGE, onContentBoxChange));
		}
	}

	protected void renderOnDestroyedChange(List<String> renderedAttributes, Popover popover) throws IOException {
		java.lang.String onDestroyedChange = popover.getOnDestroyedChange();

		if (onDestroyedChange != null) {
			renderedAttributes.add(renderString(Popover.ON_DESTROYED_CHANGE, onDestroyedChange));
		}
	}

	protected void renderOnDisabledChange(List<String> renderedAttributes, Popover popover) throws IOException {
		java.lang.String onDisabledChange = popover.getOnDisabledChange();

		if (onDisabledChange != null) {
			renderedAttributes.add(renderString(Popover.ON_DISABLED_CHANGE, onDisabledChange));
		}
	}

	protected void renderOnFillHeightChange(List<String> renderedAttributes, Popover popover) throws IOException {
		java.lang.String onFillHeightChange = popover.getOnFillHeightChange();

		if (onFillHeightChange != null) {
			renderedAttributes.add(renderString(Popover.ON_FILL_HEIGHT_CHANGE, onFillHeightChange));
		}
	}

	protected void renderOnFocusOnChange(List<String> renderedAttributes, Popover popover) throws IOException {
		java.lang.String onFocusOnChange = popover.getOnFocusOnChange();

		if (onFocusOnChange != null) {
			renderedAttributes.add(renderString(Popover.ON_FOCUS_ON_CHANGE, onFocusOnChange));
		}
	}

	protected void renderOnFocusedChange(List<String> renderedAttributes, Popover popover) throws IOException {
		java.lang.String onFocusedChange = popover.getOnFocusedChange();

		if (onFocusedChange != null) {
			renderedAttributes.add(renderString(Popover.ON_FOCUSED_CHANGE, onFocusedChange));
		}
	}

	protected void renderOnFooterContentChange(List<String> renderedAttributes, Popover popover) throws IOException {
		java.lang.String onFooterContentChange = popover.getOnFooterContentChange();

		if (onFooterContentChange != null) {
			renderedAttributes.add(renderString(Popover.ON_FOOTER_CONTENT_CHANGE, onFooterContentChange));
		}
	}

	protected void renderOnHeaderContentChange(List<String> renderedAttributes, Popover popover) throws IOException {
		java.lang.String onHeaderContentChange = popover.getOnHeaderContentChange();

		if (onHeaderContentChange != null) {
			renderedAttributes.add(renderString(Popover.ON_HEADER_CONTENT_CHANGE, onHeaderContentChange));
		}
	}

	protected void renderOnHeightChange(List<String> renderedAttributes, Popover popover) throws IOException {
		java.lang.String onHeightChange = popover.getOnHeightChange();

		if (onHeightChange != null) {
			renderedAttributes.add(renderString(Popover.ON_HEIGHT_CHANGE, onHeightChange));
		}
	}

	protected void renderOnHideOnChange(List<String> renderedAttributes, Popover popover) throws IOException {
		java.lang.String onHideOnChange = popover.getOnHideOnChange();

		if (onHideOnChange != null) {
			renderedAttributes.add(renderString(Popover.ON_HIDE_ON_CHANGE, onHideOnChange));
		}
	}

	protected void renderOnIdChange(List<String> renderedAttributes, Popover popover) throws IOException {
		java.lang.String onIdChange = popover.getOnIdChange();

		if (onIdChange != null) {
			renderedAttributes.add(renderString(Popover.ON_ID_CHANGE, onIdChange));
		}
	}

	protected void renderOnInitializedChange(List<String> renderedAttributes, Popover popover) throws IOException {
		java.lang.String onInitializedChange = popover.getOnInitializedChange();

		if (onInitializedChange != null) {
			renderedAttributes.add(renderString(Popover.ON_INITIALIZED_CHANGE, onInitializedChange));
		}
	}

	protected void renderOnLocaleChange(List<String> renderedAttributes, Popover popover) throws IOException {
		java.lang.String onLocaleChange = popover.getOnLocaleChange();

		if (onLocaleChange != null) {
			renderedAttributes.add(renderString(Popover.ON_LOCALE_CHANGE, onLocaleChange));
		}
	}

	protected void renderOnMaskNodeChange(List<String> renderedAttributes, Popover popover) throws IOException {
		java.lang.String onMaskNodeChange = popover.getOnMaskNodeChange();

		if (onMaskNodeChange != null) {
			renderedAttributes.add(renderString(Popover.ON_MASK_NODE_CHANGE, onMaskNodeChange));
		}
	}

	protected void renderOnModalChange(List<String> renderedAttributes, Popover popover) throws IOException {
		java.lang.String onModalChange = popover.getOnModalChange();

		if (onModalChange != null) {
			renderedAttributes.add(renderString(Popover.ON_MODAL_CHANGE, onModalChange));
		}
	}

	protected void renderOnPreventOverlapChange(List<String> renderedAttributes, Popover popover) throws IOException {
		java.lang.String onPreventOverlapChange = popover.getOnPreventOverlapChange();

		if (onPreventOverlapChange != null) {
			renderedAttributes.add(renderString(Popover.ON_PREVENT_OVERLAP_CHANGE, onPreventOverlapChange));
		}
	}

	protected void renderOnRenderChange(List<String> renderedAttributes, Popover popover) throws IOException {
		java.lang.String onRenderChange = popover.getOnRenderChange();

		if (onRenderChange != null) {
			renderedAttributes.add(renderString(Popover.ON_RENDER_CHANGE, onRenderChange));
		}
	}

	protected void renderOnRenderedChange(List<String> renderedAttributes, Popover popover) throws IOException {
		java.lang.String onRenderedChange = popover.getOnRenderedChange();

		if (onRenderedChange != null) {
			renderedAttributes.add(renderString(Popover.ON_RENDERED_CHANGE, onRenderedChange));
		}
	}

	protected void renderOnShimChange(List<String> renderedAttributes, Popover popover) throws IOException {
		java.lang.String onShimChange = popover.getOnShimChange();

		if (onShimChange != null) {
			renderedAttributes.add(renderString(Popover.ON_SHIM_CHANGE, onShimChange));
		}
	}

	protected void renderOnSrcNodeChange(List<String> renderedAttributes, Popover popover) throws IOException {
		java.lang.String onSrcNodeChange = popover.getOnSrcNodeChange();

		if (onSrcNodeChange != null) {
			renderedAttributes.add(renderString(Popover.ON_SRC_NODE_CHANGE, onSrcNodeChange));
		}
	}

	protected void renderOnStringsChange(List<String> renderedAttributes, Popover popover) throws IOException {
		java.lang.String onStringsChange = popover.getOnStringsChange();

		if (onStringsChange != null) {
			renderedAttributes.add(renderString(Popover.ON_STRINGS_CHANGE, onStringsChange));
		}
	}

	protected void renderOnTabIndexChange(List<String> renderedAttributes, Popover popover) throws IOException {
		java.lang.String onTabIndexChange = popover.getOnTabIndexChange();

		if (onTabIndexChange != null) {
			renderedAttributes.add(renderString(Popover.ON_TAB_INDEX_CHANGE, onTabIndexChange));
		}
	}

	protected void renderOnToolbarPositionChange(List<String> renderedAttributes, Popover popover) throws IOException {
		java.lang.String onToolbarPositionChange = popover.getOnToolbarPositionChange();

		if (onToolbarPositionChange != null) {
			renderedAttributes.add(renderString(Popover.ON_TOOLBAR_POSITION_CHANGE, onToolbarPositionChange));
		}
	}

	protected void renderOnToolbarsChange(List<String> renderedAttributes, Popover popover) throws IOException {
		java.lang.String onToolbarsChange = popover.getOnToolbarsChange();

		if (onToolbarsChange != null) {
			renderedAttributes.add(renderString(Popover.ON_TOOLBARS_CHANGE, onToolbarsChange));
		}
	}

	protected void renderOnTriggerToggleEventChange(List<String> renderedAttributes, Popover popover) throws IOException {
		java.lang.String onTriggerToggleEventChange = popover.getOnTriggerToggleEventChange();

		if (onTriggerToggleEventChange != null) {
			renderedAttributes.add(renderString(Popover.ON_TRIGGER_TOGGLE_EVENT_CHANGE, onTriggerToggleEventChange));
		}
	}

	protected void renderOnVisibleChange(List<String> renderedAttributes, Popover popover) throws IOException {
		java.lang.String onVisibleChange = popover.getOnVisibleChange();

		if (onVisibleChange != null) {
			renderedAttributes.add(renderString(Popover.ON_VISIBLE_CHANGE, onVisibleChange));
		}
	}

	protected void renderOnWidthChange(List<String> renderedAttributes, Popover popover) throws IOException {
		java.lang.String onWidthChange = popover.getOnWidthChange();

		if (onWidthChange != null) {
			renderedAttributes.add(renderString(Popover.ON_WIDTH_CHANGE, onWidthChange));
		}
	}

	protected void renderOnXChange(List<String> renderedAttributes, Popover popover) throws IOException {
		java.lang.String onXChange = popover.getOnXChange();

		if (onXChange != null) {
			renderedAttributes.add(renderString(Popover.ON_XCHANGE, onXChange));
		}
	}

	protected void renderOnXyChange(List<String> renderedAttributes, Popover popover) throws IOException {
		java.lang.String onXyChange = popover.getOnXyChange();

		if (onXyChange != null) {
			renderedAttributes.add(renderString(Popover.ON_XY_CHANGE, onXyChange));
		}
	}

	protected void renderOnYChange(List<String> renderedAttributes, Popover popover) throws IOException {
		java.lang.String onYChange = popover.getOnYChange();

		if (onYChange != null) {
			renderedAttributes.add(renderString(Popover.ON_YCHANGE, onYChange));
		}
	}

	protected void renderOnZIndexChange(List<String> renderedAttributes, Popover popover) throws IOException {
		java.lang.String onZIndexChange = popover.getOnZIndexChange();

		if (onZIndexChange != null) {
			renderedAttributes.add(renderString(Popover.ON_ZINDEX_CHANGE, onZIndexChange));
		}
	}

}
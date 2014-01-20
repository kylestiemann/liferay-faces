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

		if (popover.getAlign() != null) {
			renderAlign(renderedAttributes, popover);
		}
		
		if (popover.getAlignOn() != null) {
			renderAlignOn(renderedAttributes, popover);
		}
		
		if (popover.getPopoverBodyContent() != null) {
			renderPopoverBodyContent(renderedAttributes, popover);
		}
		
		if (popover.getBoundingBox() != null) {
			renderBoundingBox(renderedAttributes, popover);
		}
		
		if (popover.getCentered() != null) {
			renderCentered(renderedAttributes, popover);
		}
		
		if (popover.getConstrain() != null) {
			renderConstrain(renderedAttributes, popover);
		}
		
		if (popover.getContentBox() != null) {
			renderContentBox(renderedAttributes, popover);
		}
		
		if (popover.getDestroyed() != null) {
			renderDestroyed(renderedAttributes, popover);
		}
		
		if (popover.getDisabled() != null) {
			renderDisabled(renderedAttributes, popover);
		}
		
		if (popover.getFillHeight() != null) {
			renderFillHeight(renderedAttributes, popover);
		}
		
		if (popover.getFocusOn() != null) {
			renderFocusOn(renderedAttributes, popover);
		}
		
		if (popover.getFocused() != null) {
			renderFocused(renderedAttributes, popover);
		}
		
		if (popover.getFooterContent() != null) {
			renderFooterContent(renderedAttributes, popover);
		}
		
		if (popover.getHeaderContent() != null) {
			renderHeaderContent(renderedAttributes, popover);
		}
		
		if (popover.getHeight() != null) {
			renderHeight(renderedAttributes, popover);
		}
		
		if (popover.getHideOn() != null) {
			renderHideOn(renderedAttributes, popover);
		}
		
		if (popover.getPopoverId() != null) {
			renderPopoverId(renderedAttributes, popover);
		}
		
		if (popover.getInitialized() != null) {
			renderInitialized(renderedAttributes, popover);
		}
		
		if (popover.getPopoverLocale() != null) {
			renderPopoverLocale(renderedAttributes, popover);
		}
		
		if (popover.getMaskNode() != null) {
			renderMaskNode(renderedAttributes, popover);
		}
		
		if (popover.getModal() != null) {
			renderModal(renderedAttributes, popover);
		}
		
		if (popover.getPreventOverlap() != null) {
			renderPreventOverlap(renderedAttributes, popover);
		}
		
		if (popover.getRender() != null) {
			renderRender(renderedAttributes, popover);
		}
		
		if (popover.getRendered() != null) {
			renderRendered(renderedAttributes, popover);
		}
		
		if (popover.getShim() != null) {
			renderShim(renderedAttributes, popover);
		}
		
		if (popover.getSrcNode() != null) {
			renderSrcNode(renderedAttributes, popover);
		}
		
		if (popover.getStrings() != null) {
			renderStrings(renderedAttributes, popover);
		}
		
		if (popover.getTabIndex() != null) {
			renderTabIndex(renderedAttributes, popover);
		}
		
		if (popover.getToolbarPosition() != null) {
			renderToolbarPosition(renderedAttributes, popover);
		}
		
		if (popover.getToolbars() != null) {
			renderToolbars(renderedAttributes, popover);
		}
		
		if (popover.getTriggerToggleEvent() != null) {
			renderTriggerToggleEvent(renderedAttributes, popover);
		}
		
		if (popover.getVisible() != null) {
			renderVisible(renderedAttributes, popover);
		}
		
		if (popover.getWidth() != null) {
			renderWidth(renderedAttributes, popover);
		}
		
		if (popover.getX() != null) {
			renderX(renderedAttributes, popover);
		}
		
		if (popover.getXy() != null) {
			renderXy(renderedAttributes, popover);
		}
		
		if (popover.getY() != null) {
			renderY(renderedAttributes, popover);
		}
		
		if (popover.getZIndex() != null) {
			renderZIndex(renderedAttributes, popover);
		}
		
		if (popover.getFor() != null) {
			renderFor(renderedAttributes, popover);
		}
		

		for (String renderedAttribute : renderedAttributes) {
			responseWriter.write(renderedAttribute);
			responseWriter.write(StringPool.COMMA);
		}

		responseWriter.write("after");
		responseWriter.write(StringPool.COLON);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedAfterEvents = new ArrayList<String>();

		if (popover.getAfterAlignChange() != null) {
			renderAfterAlignChange(renderedAfterEvents, popover);
		}
		
		if (popover.getAfterAlignOnChange() != null) {
			renderAfterAlignOnChange(renderedAfterEvents, popover);
		}
		
		if (popover.getAfterBodyContentChange() != null) {
			renderAfterBodyContentChange(renderedAfterEvents, popover);
		}
		
		if (popover.getAfterBoundingBoxChange() != null) {
			renderAfterBoundingBoxChange(renderedAfterEvents, popover);
		}
		
		if (popover.getAfterCenteredChange() != null) {
			renderAfterCenteredChange(renderedAfterEvents, popover);
		}
		
		if (popover.getAfterConstrainChange() != null) {
			renderAfterConstrainChange(renderedAfterEvents, popover);
		}
		
		if (popover.getAfterContentBoxChange() != null) {
			renderAfterContentBoxChange(renderedAfterEvents, popover);
		}
		
		if (popover.getAfterDestroyedChange() != null) {
			renderAfterDestroyedChange(renderedAfterEvents, popover);
		}
		
		if (popover.getAfterDisabledChange() != null) {
			renderAfterDisabledChange(renderedAfterEvents, popover);
		}
		
		if (popover.getAfterFillHeightChange() != null) {
			renderAfterFillHeightChange(renderedAfterEvents, popover);
		}
		
		if (popover.getAfterFocusOnChange() != null) {
			renderAfterFocusOnChange(renderedAfterEvents, popover);
		}
		
		if (popover.getAfterFocusedChange() != null) {
			renderAfterFocusedChange(renderedAfterEvents, popover);
		}
		
		if (popover.getAfterFooterContentChange() != null) {
			renderAfterFooterContentChange(renderedAfterEvents, popover);
		}
		
		if (popover.getAfterHeaderContentChange() != null) {
			renderAfterHeaderContentChange(renderedAfterEvents, popover);
		}
		
		if (popover.getAfterHeightChange() != null) {
			renderAfterHeightChange(renderedAfterEvents, popover);
		}
		
		if (popover.getAfterHideOnChange() != null) {
			renderAfterHideOnChange(renderedAfterEvents, popover);
		}
		
		if (popover.getAfterIdChange() != null) {
			renderAfterIdChange(renderedAfterEvents, popover);
		}
		
		if (popover.getAfterInitializedChange() != null) {
			renderAfterInitializedChange(renderedAfterEvents, popover);
		}
		
		if (popover.getAfterLocaleChange() != null) {
			renderAfterLocaleChange(renderedAfterEvents, popover);
		}
		
		if (popover.getAfterMaskNodeChange() != null) {
			renderAfterMaskNodeChange(renderedAfterEvents, popover);
		}
		
		if (popover.getAfterModalChange() != null) {
			renderAfterModalChange(renderedAfterEvents, popover);
		}
		
		if (popover.getAfterPreventOverlapChange() != null) {
			renderAfterPreventOverlapChange(renderedAfterEvents, popover);
		}
		
		if (popover.getAfterRenderChange() != null) {
			renderAfterRenderChange(renderedAfterEvents, popover);
		}
		
		if (popover.getAfterRenderedChange() != null) {
			renderAfterRenderedChange(renderedAfterEvents, popover);
		}
		
		if (popover.getAfterShimChange() != null) {
			renderAfterShimChange(renderedAfterEvents, popover);
		}
		
		if (popover.getAfterSrcNodeChange() != null) {
			renderAfterSrcNodeChange(renderedAfterEvents, popover);
		}
		
		if (popover.getAfterStringsChange() != null) {
			renderAfterStringsChange(renderedAfterEvents, popover);
		}
		
		if (popover.getAfterTabIndexChange() != null) {
			renderAfterTabIndexChange(renderedAfterEvents, popover);
		}
		
		if (popover.getAfterToolbarPositionChange() != null) {
			renderAfterToolbarPositionChange(renderedAfterEvents, popover);
		}
		
		if (popover.getAfterToolbarsChange() != null) {
			renderAfterToolbarsChange(renderedAfterEvents, popover);
		}
		
		if (popover.getAfterTriggerToggleEventChange() != null) {
			renderAfterTriggerToggleEventChange(renderedAfterEvents, popover);
		}
		
		if (popover.getAfterVisibleChange() != null) {
			renderAfterVisibleChange(renderedAfterEvents, popover);
		}
		
		if (popover.getAfterWidthChange() != null) {
			renderAfterWidthChange(renderedAfterEvents, popover);
		}
		
		if (popover.getAfterXChange() != null) {
			renderAfterXChange(renderedAfterEvents, popover);
		}
		
		if (popover.getAfterXyChange() != null) {
			renderAfterXyChange(renderedAfterEvents, popover);
		}
		
		if (popover.getAfterYChange() != null) {
			renderAfterYChange(renderedAfterEvents, popover);
		}
		
		if (popover.getAfterZIndexChange() != null) {
			renderAfterZIndexChange(renderedAfterEvents, popover);
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

		if (popover.getOnAlignChange() != null) {
			renderOnAlignChange(renderedOnEvents, popover);
		}
		
		if (popover.getOnAlignOnChange() != null) {
			renderOnAlignOnChange(renderedOnEvents, popover);
		}
		
		if (popover.getOnBodyContentChange() != null) {
			renderOnBodyContentChange(renderedOnEvents, popover);
		}
		
		if (popover.getOnBoundingBoxChange() != null) {
			renderOnBoundingBoxChange(renderedOnEvents, popover);
		}
		
		if (popover.getOnCenteredChange() != null) {
			renderOnCenteredChange(renderedOnEvents, popover);
		}
		
		if (popover.getOnConstrainChange() != null) {
			renderOnConstrainChange(renderedOnEvents, popover);
		}
		
		if (popover.getOnContentBoxChange() != null) {
			renderOnContentBoxChange(renderedOnEvents, popover);
		}
		
		if (popover.getOnDestroyedChange() != null) {
			renderOnDestroyedChange(renderedOnEvents, popover);
		}
		
		if (popover.getOnDisabledChange() != null) {
			renderOnDisabledChange(renderedOnEvents, popover);
		}
		
		if (popover.getOnFillHeightChange() != null) {
			renderOnFillHeightChange(renderedOnEvents, popover);
		}
		
		if (popover.getOnFocusOnChange() != null) {
			renderOnFocusOnChange(renderedOnEvents, popover);
		}
		
		if (popover.getOnFocusedChange() != null) {
			renderOnFocusedChange(renderedOnEvents, popover);
		}
		
		if (popover.getOnFooterContentChange() != null) {
			renderOnFooterContentChange(renderedOnEvents, popover);
		}
		
		if (popover.getOnHeaderContentChange() != null) {
			renderOnHeaderContentChange(renderedOnEvents, popover);
		}
		
		if (popover.getOnHeightChange() != null) {
			renderOnHeightChange(renderedOnEvents, popover);
		}
		
		if (popover.getOnHideOnChange() != null) {
			renderOnHideOnChange(renderedOnEvents, popover);
		}
		
		if (popover.getOnIdChange() != null) {
			renderOnIdChange(renderedOnEvents, popover);
		}
		
		if (popover.getOnInitializedChange() != null) {
			renderOnInitializedChange(renderedOnEvents, popover);
		}
		
		if (popover.getOnLocaleChange() != null) {
			renderOnLocaleChange(renderedOnEvents, popover);
		}
		
		if (popover.getOnMaskNodeChange() != null) {
			renderOnMaskNodeChange(renderedOnEvents, popover);
		}
		
		if (popover.getOnModalChange() != null) {
			renderOnModalChange(renderedOnEvents, popover);
		}
		
		if (popover.getOnPreventOverlapChange() != null) {
			renderOnPreventOverlapChange(renderedOnEvents, popover);
		}
		
		if (popover.getOnRenderChange() != null) {
			renderOnRenderChange(renderedOnEvents, popover);
		}
		
		if (popover.getOnRenderedChange() != null) {
			renderOnRenderedChange(renderedOnEvents, popover);
		}
		
		if (popover.getOnShimChange() != null) {
			renderOnShimChange(renderedOnEvents, popover);
		}
		
		if (popover.getOnSrcNodeChange() != null) {
			renderOnSrcNodeChange(renderedOnEvents, popover);
		}
		
		if (popover.getOnStringsChange() != null) {
			renderOnStringsChange(renderedOnEvents, popover);
		}
		
		if (popover.getOnTabIndexChange() != null) {
			renderOnTabIndexChange(renderedOnEvents, popover);
		}
		
		if (popover.getOnToolbarPositionChange() != null) {
			renderOnToolbarPositionChange(renderedOnEvents, popover);
		}
		
		if (popover.getOnToolbarsChange() != null) {
			renderOnToolbarsChange(renderedOnEvents, popover);
		}
		
		if (popover.getOnTriggerToggleEventChange() != null) {
			renderOnTriggerToggleEventChange(renderedOnEvents, popover);
		}
		
		if (popover.getOnVisibleChange() != null) {
			renderOnVisibleChange(renderedOnEvents, popover);
		}
		
		if (popover.getOnWidthChange() != null) {
			renderOnWidthChange(renderedOnEvents, popover);
		}
		
		if (popover.getOnXChange() != null) {
			renderOnXChange(renderedOnEvents, popover);
		}
		
		if (popover.getOnXyChange() != null) {
			renderOnXyChange(renderedOnEvents, popover);
		}
		
		if (popover.getOnYChange() != null) {
			renderOnYChange(renderedOnEvents, popover);
		}
		
		if (popover.getOnZIndexChange() != null) {
			renderOnZIndexChange(renderedOnEvents, popover);
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

	protected void renderAlign(List<String> renderedAttributes, Popover popover) throws IOException {
		java.lang.Object align = popover.getAlign();
		renderedAttributes.add(renderObject(Popover.ALIGN, align));
	}

	protected void renderAlignOn(List<String> renderedAttributes, Popover popover) throws IOException {
		java.lang.Object alignOn = popover.getAlignOn();
		renderedAttributes.add(renderArray(Popover.ALIGN_ON, alignOn));
	}

	protected void renderPopoverBodyContent(List<String> renderedAttributes, Popover popover) throws IOException {
		java.lang.Object popoverBodyContent = popover.getPopoverBodyContent();
		renderedAttributes.add(renderString(Popover.POPOVER_BODY_CONTENT, popoverBodyContent));
	}

	protected void renderBoundingBox(List<String> renderedAttributes, Popover popover) throws IOException {
		java.lang.String boundingBox = popover.getBoundingBox();
		renderedAttributes.add(renderString(Popover.BOUNDING_BOX, boundingBox));
	}

	protected void renderCentered(List<String> renderedAttributes, Popover popover) throws IOException {
		java.lang.Object centered = popover.getCentered();
		renderedAttributes.add(renderString(Popover.CENTERED, centered));
	}

	protected void renderConstrain(List<String> renderedAttributes, Popover popover) throws IOException {
		java.lang.Object constrain = popover.getConstrain();
		renderedAttributes.add(renderString(Popover.CONSTRAIN, constrain));
	}

	protected void renderContentBox(List<String> renderedAttributes, Popover popover) throws IOException {
		java.lang.String contentBox = popover.getContentBox();
		renderedAttributes.add(renderString(Popover.CONTENT_BOX, contentBox));
	}

	protected void renderDestroyed(List<String> renderedAttributes, Popover popover) throws IOException {
		java.lang.Boolean destroyed = popover.getDestroyed();
		renderedAttributes.add(renderBoolean(Popover.DESTROYED, destroyed));
	}

	protected void renderDisabled(List<String> renderedAttributes, Popover popover) throws IOException {
		java.lang.Boolean disabled = popover.getDisabled();
		renderedAttributes.add(renderBoolean(Popover.DISABLED, disabled));
	}

	protected void renderFillHeight(List<String> renderedAttributes, Popover popover) throws IOException {
		java.lang.Object fillHeight = popover.getFillHeight();
		renderedAttributes.add(renderString(Popover.FILL_HEIGHT, fillHeight));
	}

	protected void renderFocusOn(List<String> renderedAttributes, Popover popover) throws IOException {
		java.lang.Object focusOn = popover.getFocusOn();
		renderedAttributes.add(renderArray(Popover.FOCUS_ON, focusOn));
	}

	protected void renderFocused(List<String> renderedAttributes, Popover popover) throws IOException {
		java.lang.Boolean focused = popover.getFocused();
		renderedAttributes.add(renderBoolean(Popover.FOCUSED, focused));
	}

	protected void renderFooterContent(List<String> renderedAttributes, Popover popover) throws IOException {
		java.lang.Object footerContent = popover.getFooterContent();
		renderedAttributes.add(renderString(Popover.FOOTER_CONTENT, footerContent));
	}

	protected void renderHeaderContent(List<String> renderedAttributes, Popover popover) throws IOException {
		java.lang.Object headerContent = popover.getHeaderContent();
		renderedAttributes.add(renderString(Popover.HEADER_CONTENT, headerContent));
	}

	protected void renderHeight(List<String> renderedAttributes, Popover popover) throws IOException {
		java.lang.Object height = popover.getHeight();
		renderedAttributes.add(renderString(Popover.HEIGHT, height));
	}

	protected void renderHideOn(List<String> renderedAttributes, Popover popover) throws IOException {
		java.lang.Object hideOn = popover.getHideOn();
		renderedAttributes.add(renderArray(Popover.HIDE_ON, hideOn));
	}

	protected void renderPopoverId(List<String> renderedAttributes, Popover popover) throws IOException {
		java.lang.String popoverId = popover.getPopoverId();
		renderedAttributes.add(renderString(Popover.POPOVER_ID, popoverId));
	}

	protected void renderInitialized(List<String> renderedAttributes, Popover popover) throws IOException {
		java.lang.Boolean initialized = popover.getInitialized();
		renderedAttributes.add(renderBoolean(Popover.INITIALIZED, initialized));
	}

	protected void renderPopoverLocale(List<String> renderedAttributes, Popover popover) throws IOException {
		java.lang.String popoverLocale = popover.getPopoverLocale();
		renderedAttributes.add(renderString(Popover.POPOVER_LOCALE, popoverLocale));
	}

	protected void renderMaskNode(List<String> renderedAttributes, Popover popover) throws IOException {
		java.lang.Object maskNode = popover.getMaskNode();
		renderedAttributes.add(renderString(Popover.MASK_NODE, maskNode));
	}

	protected void renderModal(List<String> renderedAttributes, Popover popover) throws IOException {
		java.lang.Boolean modal = popover.getModal();
		renderedAttributes.add(renderBoolean(Popover.MODAL, modal));
	}

	protected void renderPreventOverlap(List<String> renderedAttributes, Popover popover) throws IOException {
		java.lang.Boolean preventOverlap = popover.getPreventOverlap();
		renderedAttributes.add(renderBoolean(Popover.PREVENT_OVERLAP, preventOverlap));
	}

	protected void renderRender(List<String> renderedAttributes, Popover popover) throws IOException {
		java.lang.Object render = popover.getRender();
		renderedAttributes.add(renderString(Popover.RENDER, render));
	}

	protected void renderRendered(List<String> renderedAttributes, Popover popover) throws IOException {
		java.lang.Boolean rendered = popover.getRendered();
		renderedAttributes.add(renderBoolean(Popover.RENDERED, rendered));
	}

	protected void renderShim(List<String> renderedAttributes, Popover popover) throws IOException {
		java.lang.Boolean shim = popover.getShim();
		renderedAttributes.add(renderBoolean(Popover.SHIM, shim));
	}

	protected void renderSrcNode(List<String> renderedAttributes, Popover popover) throws IOException {
		java.lang.String srcNode = popover.getSrcNode();
		renderedAttributes.add(renderString(Popover.SRC_NODE, srcNode));
	}

	protected void renderStrings(List<String> renderedAttributes, Popover popover) throws IOException {
		java.lang.Object strings = popover.getStrings();
		renderedAttributes.add(renderObject(Popover.STRINGS, strings));
	}

	protected void renderTabIndex(List<String> renderedAttributes, Popover popover) throws IOException {
		java.lang.Object tabIndex = popover.getTabIndex();
		renderedAttributes.add(renderNumber(Popover.TAB_INDEX, tabIndex));
	}

	protected void renderToolbarPosition(List<String> renderedAttributes, Popover popover) throws IOException {
		java.lang.Object toolbarPosition = popover.getToolbarPosition();
		renderedAttributes.add(renderObject(Popover.TOOLBAR_POSITION, toolbarPosition));
	}

	protected void renderToolbars(List<String> renderedAttributes, Popover popover) throws IOException {
		java.lang.String toolbars = popover.getToolbars();
		renderedAttributes.add(renderString(Popover.TOOLBARS, toolbars));
	}

	protected void renderTriggerToggleEvent(List<String> renderedAttributes, Popover popover) throws IOException {
		java.lang.String triggerToggleEvent = popover.getTriggerToggleEvent();
		renderedAttributes.add(renderString(Popover.TRIGGER_TOGGLE_EVENT, triggerToggleEvent));
	}

	protected void renderVisible(List<String> renderedAttributes, Popover popover) throws IOException {
		java.lang.Boolean visible = popover.getVisible();
		renderedAttributes.add(renderBoolean(Popover.VISIBLE, visible));
	}

	protected void renderWidth(List<String> renderedAttributes, Popover popover) throws IOException {
		java.lang.Object width = popover.getWidth();
		renderedAttributes.add(renderString(Popover.WIDTH, width));
	}

	protected void renderX(List<String> renderedAttributes, Popover popover) throws IOException {
		java.lang.Object x = popover.getX();
		renderedAttributes.add(renderNumber(Popover.X, x));
	}

	protected void renderXy(List<String> renderedAttributes, Popover popover) throws IOException {
		java.lang.Object xy = popover.getXy();
		renderedAttributes.add(renderArray(Popover.XY, xy));
	}

	protected void renderY(List<String> renderedAttributes, Popover popover) throws IOException {
		java.lang.Object y = popover.getY();
		renderedAttributes.add(renderNumber(Popover.Y, y));
	}

	protected void renderZIndex(List<String> renderedAttributes, Popover popover) throws IOException {
		java.lang.Object zIndex = popover.getZIndex();
		renderedAttributes.add(renderNumber(Popover.Z_INDEX, zIndex));
	}

	protected void renderFor(List<String> renderedAttributes, Popover popover) throws IOException {
		java.lang.String for_ = popover.getFor();
		renderedAttributes.add(renderString(Popover.FOR, for_));
	}

	protected void renderAfterAlignChange(List<String> renderedAttributes, Popover popover) throws IOException {
		java.lang.String afterAlignChange = popover.getAfterAlignChange();
		renderedAttributes.add(renderString(Popover.AFTER_ALIGN_CHANGE, afterAlignChange));
	}

	protected void renderAfterAlignOnChange(List<String> renderedAttributes, Popover popover) throws IOException {
		java.lang.String afterAlignOnChange = popover.getAfterAlignOnChange();
		renderedAttributes.add(renderString(Popover.AFTER_ALIGN_ON_CHANGE, afterAlignOnChange));
	}

	protected void renderAfterBodyContentChange(List<String> renderedAttributes, Popover popover) throws IOException {
		java.lang.String afterBodyContentChange = popover.getAfterBodyContentChange();
		renderedAttributes.add(renderString(Popover.AFTER_BODY_CONTENT_CHANGE, afterBodyContentChange));
	}

	protected void renderAfterBoundingBoxChange(List<String> renderedAttributes, Popover popover) throws IOException {
		java.lang.String afterBoundingBoxChange = popover.getAfterBoundingBoxChange();
		renderedAttributes.add(renderString(Popover.AFTER_BOUNDING_BOX_CHANGE, afterBoundingBoxChange));
	}

	protected void renderAfterCenteredChange(List<String> renderedAttributes, Popover popover) throws IOException {
		java.lang.String afterCenteredChange = popover.getAfterCenteredChange();
		renderedAttributes.add(renderString(Popover.AFTER_CENTERED_CHANGE, afterCenteredChange));
	}

	protected void renderAfterConstrainChange(List<String> renderedAttributes, Popover popover) throws IOException {
		java.lang.String afterConstrainChange = popover.getAfterConstrainChange();
		renderedAttributes.add(renderString(Popover.AFTER_CONSTRAIN_CHANGE, afterConstrainChange));
	}

	protected void renderAfterContentBoxChange(List<String> renderedAttributes, Popover popover) throws IOException {
		java.lang.String afterContentBoxChange = popover.getAfterContentBoxChange();
		renderedAttributes.add(renderString(Popover.AFTER_CONTENT_BOX_CHANGE, afterContentBoxChange));
	}

	protected void renderAfterDestroyedChange(List<String> renderedAttributes, Popover popover) throws IOException {
		java.lang.String afterDestroyedChange = popover.getAfterDestroyedChange();
		renderedAttributes.add(renderString(Popover.AFTER_DESTROYED_CHANGE, afterDestroyedChange));
	}

	protected void renderAfterDisabledChange(List<String> renderedAttributes, Popover popover) throws IOException {
		java.lang.String afterDisabledChange = popover.getAfterDisabledChange();
		renderedAttributes.add(renderString(Popover.AFTER_DISABLED_CHANGE, afterDisabledChange));
	}

	protected void renderAfterFillHeightChange(List<String> renderedAttributes, Popover popover) throws IOException {
		java.lang.String afterFillHeightChange = popover.getAfterFillHeightChange();
		renderedAttributes.add(renderString(Popover.AFTER_FILL_HEIGHT_CHANGE, afterFillHeightChange));
	}

	protected void renderAfterFocusOnChange(List<String> renderedAttributes, Popover popover) throws IOException {
		java.lang.String afterFocusOnChange = popover.getAfterFocusOnChange();
		renderedAttributes.add(renderString(Popover.AFTER_FOCUS_ON_CHANGE, afterFocusOnChange));
	}

	protected void renderAfterFocusedChange(List<String> renderedAttributes, Popover popover) throws IOException {
		java.lang.String afterFocusedChange = popover.getAfterFocusedChange();
		renderedAttributes.add(renderString(Popover.AFTER_FOCUSED_CHANGE, afterFocusedChange));
	}

	protected void renderAfterFooterContentChange(List<String> renderedAttributes, Popover popover) throws IOException {
		java.lang.String afterFooterContentChange = popover.getAfterFooterContentChange();
		renderedAttributes.add(renderString(Popover.AFTER_FOOTER_CONTENT_CHANGE, afterFooterContentChange));
	}

	protected void renderAfterHeaderContentChange(List<String> renderedAttributes, Popover popover) throws IOException {
		java.lang.String afterHeaderContentChange = popover.getAfterHeaderContentChange();
		renderedAttributes.add(renderString(Popover.AFTER_HEADER_CONTENT_CHANGE, afterHeaderContentChange));
	}

	protected void renderAfterHeightChange(List<String> renderedAttributes, Popover popover) throws IOException {
		java.lang.String afterHeightChange = popover.getAfterHeightChange();
		renderedAttributes.add(renderString(Popover.AFTER_HEIGHT_CHANGE, afterHeightChange));
	}

	protected void renderAfterHideOnChange(List<String> renderedAttributes, Popover popover) throws IOException {
		java.lang.String afterHideOnChange = popover.getAfterHideOnChange();
		renderedAttributes.add(renderString(Popover.AFTER_HIDE_ON_CHANGE, afterHideOnChange));
	}

	protected void renderAfterIdChange(List<String> renderedAttributes, Popover popover) throws IOException {
		java.lang.String afterIdChange = popover.getAfterIdChange();
		renderedAttributes.add(renderString(Popover.AFTER_ID_CHANGE, afterIdChange));
	}

	protected void renderAfterInitializedChange(List<String> renderedAttributes, Popover popover) throws IOException {
		java.lang.String afterInitializedChange = popover.getAfterInitializedChange();
		renderedAttributes.add(renderString(Popover.AFTER_INITIALIZED_CHANGE, afterInitializedChange));
	}

	protected void renderAfterLocaleChange(List<String> renderedAttributes, Popover popover) throws IOException {
		java.lang.String afterLocaleChange = popover.getAfterLocaleChange();
		renderedAttributes.add(renderString(Popover.AFTER_LOCALE_CHANGE, afterLocaleChange));
	}

	protected void renderAfterMaskNodeChange(List<String> renderedAttributes, Popover popover) throws IOException {
		java.lang.String afterMaskNodeChange = popover.getAfterMaskNodeChange();
		renderedAttributes.add(renderString(Popover.AFTER_MASK_NODE_CHANGE, afterMaskNodeChange));
	}

	protected void renderAfterModalChange(List<String> renderedAttributes, Popover popover) throws IOException {
		java.lang.String afterModalChange = popover.getAfterModalChange();
		renderedAttributes.add(renderString(Popover.AFTER_MODAL_CHANGE, afterModalChange));
	}

	protected void renderAfterPreventOverlapChange(List<String> renderedAttributes, Popover popover) throws IOException {
		java.lang.String afterPreventOverlapChange = popover.getAfterPreventOverlapChange();
		renderedAttributes.add(renderString(Popover.AFTER_PREVENT_OVERLAP_CHANGE, afterPreventOverlapChange));
	}

	protected void renderAfterRenderChange(List<String> renderedAttributes, Popover popover) throws IOException {
		java.lang.String afterRenderChange = popover.getAfterRenderChange();
		renderedAttributes.add(renderString(Popover.AFTER_RENDER_CHANGE, afterRenderChange));
	}

	protected void renderAfterRenderedChange(List<String> renderedAttributes, Popover popover) throws IOException {
		java.lang.String afterRenderedChange = popover.getAfterRenderedChange();
		renderedAttributes.add(renderString(Popover.AFTER_RENDERED_CHANGE, afterRenderedChange));
	}

	protected void renderAfterShimChange(List<String> renderedAttributes, Popover popover) throws IOException {
		java.lang.String afterShimChange = popover.getAfterShimChange();
		renderedAttributes.add(renderString(Popover.AFTER_SHIM_CHANGE, afterShimChange));
	}

	protected void renderAfterSrcNodeChange(List<String> renderedAttributes, Popover popover) throws IOException {
		java.lang.String afterSrcNodeChange = popover.getAfterSrcNodeChange();
		renderedAttributes.add(renderString(Popover.AFTER_SRC_NODE_CHANGE, afterSrcNodeChange));
	}

	protected void renderAfterStringsChange(List<String> renderedAttributes, Popover popover) throws IOException {
		java.lang.String afterStringsChange = popover.getAfterStringsChange();
		renderedAttributes.add(renderString(Popover.AFTER_STRINGS_CHANGE, afterStringsChange));
	}

	protected void renderAfterTabIndexChange(List<String> renderedAttributes, Popover popover) throws IOException {
		java.lang.String afterTabIndexChange = popover.getAfterTabIndexChange();
		renderedAttributes.add(renderString(Popover.AFTER_TAB_INDEX_CHANGE, afterTabIndexChange));
	}

	protected void renderAfterToolbarPositionChange(List<String> renderedAttributes, Popover popover) throws IOException {
		java.lang.String afterToolbarPositionChange = popover.getAfterToolbarPositionChange();
		renderedAttributes.add(renderString(Popover.AFTER_TOOLBAR_POSITION_CHANGE, afterToolbarPositionChange));
	}

	protected void renderAfterToolbarsChange(List<String> renderedAttributes, Popover popover) throws IOException {
		java.lang.String afterToolbarsChange = popover.getAfterToolbarsChange();
		renderedAttributes.add(renderString(Popover.AFTER_TOOLBARS_CHANGE, afterToolbarsChange));
	}

	protected void renderAfterTriggerToggleEventChange(List<String> renderedAttributes, Popover popover) throws IOException {
		java.lang.String afterTriggerToggleEventChange = popover.getAfterTriggerToggleEventChange();
		renderedAttributes.add(renderString(Popover.AFTER_TRIGGER_TOGGLE_EVENT_CHANGE, afterTriggerToggleEventChange));
	}

	protected void renderAfterVisibleChange(List<String> renderedAttributes, Popover popover) throws IOException {
		java.lang.String afterVisibleChange = popover.getAfterVisibleChange();
		renderedAttributes.add(renderString(Popover.AFTER_VISIBLE_CHANGE, afterVisibleChange));
	}

	protected void renderAfterWidthChange(List<String> renderedAttributes, Popover popover) throws IOException {
		java.lang.String afterWidthChange = popover.getAfterWidthChange();
		renderedAttributes.add(renderString(Popover.AFTER_WIDTH_CHANGE, afterWidthChange));
	}

	protected void renderAfterXChange(List<String> renderedAttributes, Popover popover) throws IOException {
		java.lang.String afterXChange = popover.getAfterXChange();
		renderedAttributes.add(renderString(Popover.AFTER_XCHANGE, afterXChange));
	}

	protected void renderAfterXyChange(List<String> renderedAttributes, Popover popover) throws IOException {
		java.lang.String afterXyChange = popover.getAfterXyChange();
		renderedAttributes.add(renderString(Popover.AFTER_XY_CHANGE, afterXyChange));
	}

	protected void renderAfterYChange(List<String> renderedAttributes, Popover popover) throws IOException {
		java.lang.String afterYChange = popover.getAfterYChange();
		renderedAttributes.add(renderString(Popover.AFTER_YCHANGE, afterYChange));
	}

	protected void renderAfterZIndexChange(List<String> renderedAttributes, Popover popover) throws IOException {
		java.lang.String afterZIndexChange = popover.getAfterZIndexChange();
		renderedAttributes.add(renderString(Popover.AFTER_ZINDEX_CHANGE, afterZIndexChange));
	}

	protected void renderOnAlignChange(List<String> renderedAttributes, Popover popover) throws IOException {
		java.lang.String onAlignChange = popover.getOnAlignChange();
		renderedAttributes.add(renderString(Popover.ON_ALIGN_CHANGE, onAlignChange));
	}

	protected void renderOnAlignOnChange(List<String> renderedAttributes, Popover popover) throws IOException {
		java.lang.String onAlignOnChange = popover.getOnAlignOnChange();
		renderedAttributes.add(renderString(Popover.ON_ALIGN_ON_CHANGE, onAlignOnChange));
	}

	protected void renderOnBodyContentChange(List<String> renderedAttributes, Popover popover) throws IOException {
		java.lang.String onBodyContentChange = popover.getOnBodyContentChange();
		renderedAttributes.add(renderString(Popover.ON_BODY_CONTENT_CHANGE, onBodyContentChange));
	}

	protected void renderOnBoundingBoxChange(List<String> renderedAttributes, Popover popover) throws IOException {
		java.lang.String onBoundingBoxChange = popover.getOnBoundingBoxChange();
		renderedAttributes.add(renderString(Popover.ON_BOUNDING_BOX_CHANGE, onBoundingBoxChange));
	}

	protected void renderOnCenteredChange(List<String> renderedAttributes, Popover popover) throws IOException {
		java.lang.String onCenteredChange = popover.getOnCenteredChange();
		renderedAttributes.add(renderString(Popover.ON_CENTERED_CHANGE, onCenteredChange));
	}

	protected void renderOnConstrainChange(List<String> renderedAttributes, Popover popover) throws IOException {
		java.lang.String onConstrainChange = popover.getOnConstrainChange();
		renderedAttributes.add(renderString(Popover.ON_CONSTRAIN_CHANGE, onConstrainChange));
	}

	protected void renderOnContentBoxChange(List<String> renderedAttributes, Popover popover) throws IOException {
		java.lang.String onContentBoxChange = popover.getOnContentBoxChange();
		renderedAttributes.add(renderString(Popover.ON_CONTENT_BOX_CHANGE, onContentBoxChange));
	}

	protected void renderOnDestroyedChange(List<String> renderedAttributes, Popover popover) throws IOException {
		java.lang.String onDestroyedChange = popover.getOnDestroyedChange();
		renderedAttributes.add(renderString(Popover.ON_DESTROYED_CHANGE, onDestroyedChange));
	}

	protected void renderOnDisabledChange(List<String> renderedAttributes, Popover popover) throws IOException {
		java.lang.String onDisabledChange = popover.getOnDisabledChange();
		renderedAttributes.add(renderString(Popover.ON_DISABLED_CHANGE, onDisabledChange));
	}

	protected void renderOnFillHeightChange(List<String> renderedAttributes, Popover popover) throws IOException {
		java.lang.String onFillHeightChange = popover.getOnFillHeightChange();
		renderedAttributes.add(renderString(Popover.ON_FILL_HEIGHT_CHANGE, onFillHeightChange));
	}

	protected void renderOnFocusOnChange(List<String> renderedAttributes, Popover popover) throws IOException {
		java.lang.String onFocusOnChange = popover.getOnFocusOnChange();
		renderedAttributes.add(renderString(Popover.ON_FOCUS_ON_CHANGE, onFocusOnChange));
	}

	protected void renderOnFocusedChange(List<String> renderedAttributes, Popover popover) throws IOException {
		java.lang.String onFocusedChange = popover.getOnFocusedChange();
		renderedAttributes.add(renderString(Popover.ON_FOCUSED_CHANGE, onFocusedChange));
	}

	protected void renderOnFooterContentChange(List<String> renderedAttributes, Popover popover) throws IOException {
		java.lang.String onFooterContentChange = popover.getOnFooterContentChange();
		renderedAttributes.add(renderString(Popover.ON_FOOTER_CONTENT_CHANGE, onFooterContentChange));
	}

	protected void renderOnHeaderContentChange(List<String> renderedAttributes, Popover popover) throws IOException {
		java.lang.String onHeaderContentChange = popover.getOnHeaderContentChange();
		renderedAttributes.add(renderString(Popover.ON_HEADER_CONTENT_CHANGE, onHeaderContentChange));
	}

	protected void renderOnHeightChange(List<String> renderedAttributes, Popover popover) throws IOException {
		java.lang.String onHeightChange = popover.getOnHeightChange();
		renderedAttributes.add(renderString(Popover.ON_HEIGHT_CHANGE, onHeightChange));
	}

	protected void renderOnHideOnChange(List<String> renderedAttributes, Popover popover) throws IOException {
		java.lang.String onHideOnChange = popover.getOnHideOnChange();
		renderedAttributes.add(renderString(Popover.ON_HIDE_ON_CHANGE, onHideOnChange));
	}

	protected void renderOnIdChange(List<String> renderedAttributes, Popover popover) throws IOException {
		java.lang.String onIdChange = popover.getOnIdChange();
		renderedAttributes.add(renderString(Popover.ON_ID_CHANGE, onIdChange));
	}

	protected void renderOnInitializedChange(List<String> renderedAttributes, Popover popover) throws IOException {
		java.lang.String onInitializedChange = popover.getOnInitializedChange();
		renderedAttributes.add(renderString(Popover.ON_INITIALIZED_CHANGE, onInitializedChange));
	}

	protected void renderOnLocaleChange(List<String> renderedAttributes, Popover popover) throws IOException {
		java.lang.String onLocaleChange = popover.getOnLocaleChange();
		renderedAttributes.add(renderString(Popover.ON_LOCALE_CHANGE, onLocaleChange));
	}

	protected void renderOnMaskNodeChange(List<String> renderedAttributes, Popover popover) throws IOException {
		java.lang.String onMaskNodeChange = popover.getOnMaskNodeChange();
		renderedAttributes.add(renderString(Popover.ON_MASK_NODE_CHANGE, onMaskNodeChange));
	}

	protected void renderOnModalChange(List<String> renderedAttributes, Popover popover) throws IOException {
		java.lang.String onModalChange = popover.getOnModalChange();
		renderedAttributes.add(renderString(Popover.ON_MODAL_CHANGE, onModalChange));
	}

	protected void renderOnPreventOverlapChange(List<String> renderedAttributes, Popover popover) throws IOException {
		java.lang.String onPreventOverlapChange = popover.getOnPreventOverlapChange();
		renderedAttributes.add(renderString(Popover.ON_PREVENT_OVERLAP_CHANGE, onPreventOverlapChange));
	}

	protected void renderOnRenderChange(List<String> renderedAttributes, Popover popover) throws IOException {
		java.lang.String onRenderChange = popover.getOnRenderChange();
		renderedAttributes.add(renderString(Popover.ON_RENDER_CHANGE, onRenderChange));
	}

	protected void renderOnRenderedChange(List<String> renderedAttributes, Popover popover) throws IOException {
		java.lang.String onRenderedChange = popover.getOnRenderedChange();
		renderedAttributes.add(renderString(Popover.ON_RENDERED_CHANGE, onRenderedChange));
	}

	protected void renderOnShimChange(List<String> renderedAttributes, Popover popover) throws IOException {
		java.lang.String onShimChange = popover.getOnShimChange();
		renderedAttributes.add(renderString(Popover.ON_SHIM_CHANGE, onShimChange));
	}

	protected void renderOnSrcNodeChange(List<String> renderedAttributes, Popover popover) throws IOException {
		java.lang.String onSrcNodeChange = popover.getOnSrcNodeChange();
		renderedAttributes.add(renderString(Popover.ON_SRC_NODE_CHANGE, onSrcNodeChange));
	}

	protected void renderOnStringsChange(List<String> renderedAttributes, Popover popover) throws IOException {
		java.lang.String onStringsChange = popover.getOnStringsChange();
		renderedAttributes.add(renderString(Popover.ON_STRINGS_CHANGE, onStringsChange));
	}

	protected void renderOnTabIndexChange(List<String> renderedAttributes, Popover popover) throws IOException {
		java.lang.String onTabIndexChange = popover.getOnTabIndexChange();
		renderedAttributes.add(renderString(Popover.ON_TAB_INDEX_CHANGE, onTabIndexChange));
	}

	protected void renderOnToolbarPositionChange(List<String> renderedAttributes, Popover popover) throws IOException {
		java.lang.String onToolbarPositionChange = popover.getOnToolbarPositionChange();
		renderedAttributes.add(renderString(Popover.ON_TOOLBAR_POSITION_CHANGE, onToolbarPositionChange));
	}

	protected void renderOnToolbarsChange(List<String> renderedAttributes, Popover popover) throws IOException {
		java.lang.String onToolbarsChange = popover.getOnToolbarsChange();
		renderedAttributes.add(renderString(Popover.ON_TOOLBARS_CHANGE, onToolbarsChange));
	}

	protected void renderOnTriggerToggleEventChange(List<String> renderedAttributes, Popover popover) throws IOException {
		java.lang.String onTriggerToggleEventChange = popover.getOnTriggerToggleEventChange();
		renderedAttributes.add(renderString(Popover.ON_TRIGGER_TOGGLE_EVENT_CHANGE, onTriggerToggleEventChange));
	}

	protected void renderOnVisibleChange(List<String> renderedAttributes, Popover popover) throws IOException {
		java.lang.String onVisibleChange = popover.getOnVisibleChange();
		renderedAttributes.add(renderString(Popover.ON_VISIBLE_CHANGE, onVisibleChange));
	}

	protected void renderOnWidthChange(List<String> renderedAttributes, Popover popover) throws IOException {
		java.lang.String onWidthChange = popover.getOnWidthChange();
		renderedAttributes.add(renderString(Popover.ON_WIDTH_CHANGE, onWidthChange));
	}

	protected void renderOnXChange(List<String> renderedAttributes, Popover popover) throws IOException {
		java.lang.String onXChange = popover.getOnXChange();
		renderedAttributes.add(renderString(Popover.ON_XCHANGE, onXChange));
	}

	protected void renderOnXyChange(List<String> renderedAttributes, Popover popover) throws IOException {
		java.lang.String onXyChange = popover.getOnXyChange();
		renderedAttributes.add(renderString(Popover.ON_XY_CHANGE, onXyChange));
	}

	protected void renderOnYChange(List<String> renderedAttributes, Popover popover) throws IOException {
		java.lang.String onYChange = popover.getOnYChange();
		renderedAttributes.add(renderString(Popover.ON_YCHANGE, onYChange));
	}

	protected void renderOnZIndexChange(List<String> renderedAttributes, Popover popover) throws IOException {
		java.lang.String onZIndexChange = popover.getOnZIndexChange();
		renderedAttributes.add(renderString(Popover.ON_ZINDEX_CHANGE, onZIndexChange));
	}

}
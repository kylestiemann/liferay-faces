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
package com.liferay.faces.alloy.component.modal;

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
public abstract class ModalRendererBase extends RendererBase {

	// Private Constants
	private static final String AUI_MODULE_NAME = "aui-modal";

	protected void encodeJavaScriptMain(FacesContext facesContext, UIComponent uiComponent) throws IOException {

		Modal modal = (Modal) uiComponent;

		ResponseWriter responseWriter = facesContext.getResponseWriter();

		responseWriter.write("var modal = new A.Modal");
		responseWriter.write(StringPool.OPEN_PARENTHESIS);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedAttributes = new ArrayList<String>();

		renderAlign(renderedAttributes, modal);
		renderAlignOn(renderedAttributes, modal);
		renderModalBodyContent(renderedAttributes, modal);
		renderBoundingBox(renderedAttributes, modal);
		renderCentered(renderedAttributes, modal);
		renderConstrain(renderedAttributes, modal);
		renderContentBox(renderedAttributes, modal);
		renderDestroyOnHide(renderedAttributes, modal);
		renderDestroyed(renderedAttributes, modal);
		renderDisabled(renderedAttributes, modal);
		renderDraggable(renderedAttributes, modal);
		renderFillHeight(renderedAttributes, modal);
		renderFocusOn(renderedAttributes, modal);
		renderFocused(renderedAttributes, modal);
		renderFooterContent(renderedAttributes, modal);
		renderHeaderContent(renderedAttributes, modal);
		renderHeight(renderedAttributes, modal);
		renderHideOn(renderedAttributes, modal);
		renderModalId(renderedAttributes, modal);
		renderInitialized(renderedAttributes, modal);
		renderModalLocale(renderedAttributes, modal);
		renderMaskNode(renderedAttributes, modal);
		renderModal(renderedAttributes, modal);
		renderPreventOverlap(renderedAttributes, modal);
		renderRender(renderedAttributes, modal);
		renderRendered(renderedAttributes, modal);
		renderResizable(renderedAttributes, modal);
		renderShim(renderedAttributes, modal);
		renderSrcNode(renderedAttributes, modal);
		renderStrings(renderedAttributes, modal);
		renderTabIndex(renderedAttributes, modal);
		renderToolbarPosition(renderedAttributes, modal);
		renderToolbars(renderedAttributes, modal);
		renderVisible(renderedAttributes, modal);
		renderWidth(renderedAttributes, modal);
		renderX(renderedAttributes, modal);
		renderXy(renderedAttributes, modal);
		renderY(renderedAttributes, modal);
		renderZIndex(renderedAttributes, modal);

		for (String renderedAttribute : renderedAttributes) {
			responseWriter.write(renderedAttribute);
			responseWriter.write(StringPool.COMMA);
		}

		responseWriter.write("after");
		responseWriter.write(StringPool.COLON);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedAfterEvents = new ArrayList<String>();

		renderAfterAlignChange(renderedAfterEvents, modal);
		renderAfterAlignOnChange(renderedAfterEvents, modal);
		renderAfterBodyContentChange(renderedAfterEvents, modal);
		renderAfterBoundingBoxChange(renderedAfterEvents, modal);
		renderAfterCenteredChange(renderedAfterEvents, modal);
		renderAfterConstrainChange(renderedAfterEvents, modal);
		renderAfterContentBoxChange(renderedAfterEvents, modal);
		renderAfterDestroyOnHideChange(renderedAfterEvents, modal);
		renderAfterDestroyedChange(renderedAfterEvents, modal);
		renderAfterDisabledChange(renderedAfterEvents, modal);
		renderAfterDraggableChange(renderedAfterEvents, modal);
		renderAfterFillHeightChange(renderedAfterEvents, modal);
		renderAfterFocusOnChange(renderedAfterEvents, modal);
		renderAfterFocusedChange(renderedAfterEvents, modal);
		renderAfterFooterContentChange(renderedAfterEvents, modal);
		renderAfterHeaderContentChange(renderedAfterEvents, modal);
		renderAfterHeightChange(renderedAfterEvents, modal);
		renderAfterHideOnChange(renderedAfterEvents, modal);
		renderAfterIdChange(renderedAfterEvents, modal);
		renderAfterInitializedChange(renderedAfterEvents, modal);
		renderAfterLocaleChange(renderedAfterEvents, modal);
		renderAfterMaskNodeChange(renderedAfterEvents, modal);
		renderAfterModalChange(renderedAfterEvents, modal);
		renderAfterPreventOverlapChange(renderedAfterEvents, modal);
		renderAfterRenderChange(renderedAfterEvents, modal);
		renderAfterRenderedChange(renderedAfterEvents, modal);
		renderAfterResizableChange(renderedAfterEvents, modal);
		renderAfterShimChange(renderedAfterEvents, modal);
		renderAfterSrcNodeChange(renderedAfterEvents, modal);
		renderAfterStringsChange(renderedAfterEvents, modal);
		renderAfterTabIndexChange(renderedAfterEvents, modal);
		renderAfterToolbarPositionChange(renderedAfterEvents, modal);
		renderAfterToolbarsChange(renderedAfterEvents, modal);
		renderAfterVisibleChange(renderedAfterEvents, modal);
		renderAfterWidthChange(renderedAfterEvents, modal);
		renderAfterXChange(renderedAfterEvents, modal);
		renderAfterXyChange(renderedAfterEvents, modal);
		renderAfterYChange(renderedAfterEvents, modal);
		renderAfterZIndexChange(renderedAfterEvents, modal);

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

		renderOnAlignChange(renderedOnEvents, modal);
		renderOnAlignOnChange(renderedOnEvents, modal);
		renderOnBodyContentChange(renderedOnEvents, modal);
		renderOnBoundingBoxChange(renderedOnEvents, modal);
		renderOnCenteredChange(renderedOnEvents, modal);
		renderOnConstrainChange(renderedOnEvents, modal);
		renderOnContentBoxChange(renderedOnEvents, modal);
		renderOnDestroyOnHideChange(renderedOnEvents, modal);
		renderOnDestroyedChange(renderedOnEvents, modal);
		renderOnDisabledChange(renderedOnEvents, modal);
		renderOnDraggableChange(renderedOnEvents, modal);
		renderOnFillHeightChange(renderedOnEvents, modal);
		renderOnFocusOnChange(renderedOnEvents, modal);
		renderOnFocusedChange(renderedOnEvents, modal);
		renderOnFooterContentChange(renderedOnEvents, modal);
		renderOnHeaderContentChange(renderedOnEvents, modal);
		renderOnHeightChange(renderedOnEvents, modal);
		renderOnHideOnChange(renderedOnEvents, modal);
		renderOnIdChange(renderedOnEvents, modal);
		renderOnInitializedChange(renderedOnEvents, modal);
		renderOnLocaleChange(renderedOnEvents, modal);
		renderOnMaskNodeChange(renderedOnEvents, modal);
		renderOnModalChange(renderedOnEvents, modal);
		renderOnPreventOverlapChange(renderedOnEvents, modal);
		renderOnRenderChange(renderedOnEvents, modal);
		renderOnRenderedChange(renderedOnEvents, modal);
		renderOnResizableChange(renderedOnEvents, modal);
		renderOnShimChange(renderedOnEvents, modal);
		renderOnSrcNodeChange(renderedOnEvents, modal);
		renderOnStringsChange(renderedOnEvents, modal);
		renderOnTabIndexChange(renderedOnEvents, modal);
		renderOnToolbarPositionChange(renderedOnEvents, modal);
		renderOnToolbarsChange(renderedOnEvents, modal);
		renderOnVisibleChange(renderedOnEvents, modal);
		renderOnWidthChange(renderedOnEvents, modal);
		renderOnXChange(renderedOnEvents, modal);
		renderOnXyChange(renderedOnEvents, modal);
		renderOnYChange(renderedOnEvents, modal);
		renderOnZIndexChange(renderedOnEvents, modal);

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

	protected void renderAlign(List<String> renderedAttributes, Modal modal) throws IOException {
		java.lang.Object align = modal.getAlign();

		if (align != null) {
			renderedAttributes.add(renderObject(Modal.ALIGN, align));
		}
	}

	protected void renderAlignOn(List<String> renderedAttributes, Modal modal) throws IOException {
		java.lang.Object alignOn = modal.getAlignOn();

		if (alignOn != null) {
			renderedAttributes.add(renderArray(Modal.ALIGN_ON, alignOn));
		}
	}

	protected void renderModalBodyContent(List<String> renderedAttributes, Modal modal) throws IOException {
		java.lang.String modalBodyContent = modal.getModalBodyContent();

		if (modalBodyContent != null) {
			renderedAttributes.add(renderString(Modal.MODAL_BODY_CONTENT, modalBodyContent));
		}
	}

	protected void renderBoundingBox(List<String> renderedAttributes, Modal modal) throws IOException {
		java.lang.String boundingBox = modal.getBoundingBox();

		if (boundingBox != null) {
			renderedAttributes.add(renderString(Modal.BOUNDING_BOX, boundingBox));
		}
	}

	protected void renderCentered(List<String> renderedAttributes, Modal modal) throws IOException {
		java.lang.Object centered = modal.getCentered();

		if (centered != null) {
			renderedAttributes.add(renderString(Modal.CENTERED, centered));
		}
	}

	protected void renderConstrain(List<String> renderedAttributes, Modal modal) throws IOException {
		java.lang.Object constrain = modal.getConstrain();

		if (constrain != null) {
			renderedAttributes.add(renderString(Modal.CONSTRAIN, constrain));
		}
	}

	protected void renderContentBox(List<String> renderedAttributes, Modal modal) throws IOException {
		java.lang.String contentBox = modal.getContentBox();

		if (contentBox != null) {
			renderedAttributes.add(renderString(Modal.CONTENT_BOX, contentBox));
		}
	}

	protected void renderDestroyOnHide(List<String> renderedAttributes, Modal modal) throws IOException {
		java.lang.Boolean destroyOnHide = modal.getDestroyOnHide();

		if (destroyOnHide != null) {
			renderedAttributes.add(renderBoolean(Modal.DESTROY_ON_HIDE, destroyOnHide));
		}
	}

	protected void renderDestroyed(List<String> renderedAttributes, Modal modal) throws IOException {
		java.lang.Boolean destroyed = modal.getDestroyed();

		if (destroyed != null) {
			renderedAttributes.add(renderBoolean(Modal.DESTROYED, destroyed));
		}
	}

	protected void renderDisabled(List<String> renderedAttributes, Modal modal) throws IOException {
		java.lang.Boolean disabled = modal.getDisabled();

		if (disabled != null) {
			renderedAttributes.add(renderBoolean(Modal.DISABLED, disabled));
		}
	}

	protected void renderDraggable(List<String> renderedAttributes, Modal modal) throws IOException {
		java.lang.Object draggable = modal.getDraggable();

		if (draggable != null) {
			renderedAttributes.add(renderObject(Modal.DRAGGABLE, draggable));
		}
	}

	protected void renderFillHeight(List<String> renderedAttributes, Modal modal) throws IOException {
		java.lang.Object fillHeight = modal.getFillHeight();

		if (fillHeight != null) {
			renderedAttributes.add(renderString(Modal.FILL_HEIGHT, fillHeight));
		}
	}

	protected void renderFocusOn(List<String> renderedAttributes, Modal modal) throws IOException {
		java.lang.Object focusOn = modal.getFocusOn();

		if (focusOn != null) {
			renderedAttributes.add(renderArray(Modal.FOCUS_ON, focusOn));
		}
	}

	protected void renderFocused(List<String> renderedAttributes, Modal modal) throws IOException {
		java.lang.Boolean focused = modal.getFocused();

		if (focused != null) {
			renderedAttributes.add(renderBoolean(Modal.FOCUSED, focused));
		}
	}

	protected void renderFooterContent(List<String> renderedAttributes, Modal modal) throws IOException {
		java.lang.Object footerContent = modal.getFooterContent();

		if (footerContent != null) {
			renderedAttributes.add(renderString(Modal.FOOTER_CONTENT, footerContent));
		}
	}

	protected void renderHeaderContent(List<String> renderedAttributes, Modal modal) throws IOException {
		java.lang.Object headerContent = modal.getHeaderContent();

		if (headerContent != null) {
			renderedAttributes.add(renderString(Modal.HEADER_CONTENT, headerContent));
		}
	}

	protected void renderHeight(List<String> renderedAttributes, Modal modal) throws IOException {
		java.lang.Object height = modal.getHeight();

		if (height != null) {
			renderedAttributes.add(renderString(Modal.HEIGHT, height));
		}
	}

	protected void renderHideOn(List<String> renderedAttributes, Modal modal) throws IOException {
		java.lang.Object hideOn = modal.getHideOn();

		if (hideOn != null) {
			renderedAttributes.add(renderArray(Modal.HIDE_ON, hideOn));
		}
	}

	protected void renderModalId(List<String> renderedAttributes, Modal modal) throws IOException {
		java.lang.String modalId = modal.getModalId();

		if (modalId != null) {
			renderedAttributes.add(renderString(Modal.MODAL_ID, modalId));
		}
	}

	protected void renderInitialized(List<String> renderedAttributes, Modal modal) throws IOException {
		java.lang.Boolean initialized = modal.getInitialized();

		if (initialized != null) {
			renderedAttributes.add(renderBoolean(Modal.INITIALIZED, initialized));
		}
	}

	protected void renderModalLocale(List<String> renderedAttributes, Modal modal) throws IOException {
		java.lang.String modalLocale = modal.getModalLocale();

		if (modalLocale != null) {
			renderedAttributes.add(renderString(Modal.MODAL_LOCALE, modalLocale));
		}
	}

	protected void renderMaskNode(List<String> renderedAttributes, Modal modal) throws IOException {
		java.lang.Object maskNode = modal.getMaskNode();

		if (maskNode != null) {
			renderedAttributes.add(renderString(Modal.MASK_NODE, maskNode));
		}
	}

	protected void renderModal(List<String> renderedAttributes, Modal modal) throws IOException {
		java.lang.Boolean modal_ = modal.getModal();

		if (modal_ != null) {
			renderedAttributes.add(renderBoolean(Modal.MODAL, modal_));
		}
	}

	protected void renderPreventOverlap(List<String> renderedAttributes, Modal modal) throws IOException {
		java.lang.Boolean preventOverlap = modal.getPreventOverlap();

		if (preventOverlap != null) {
			renderedAttributes.add(renderBoolean(Modal.PREVENT_OVERLAP, preventOverlap));
		}
	}

	protected void renderRender(List<String> renderedAttributes, Modal modal) throws IOException {
		java.lang.Object render = modal.getRender();

		if (render != null) {
			renderedAttributes.add(renderString(Modal.RENDER, render));
		}
	}

	protected void renderRendered(List<String> renderedAttributes, Modal modal) throws IOException {
		java.lang.Boolean rendered = modal.getRendered();

		if (rendered != null) {
			renderedAttributes.add(renderBoolean(Modal.RENDERED, rendered));
		}
	}

	protected void renderResizable(List<String> renderedAttributes, Modal modal) throws IOException {
		java.lang.Object resizable = modal.getResizable();

		if (resizable != null) {
			renderedAttributes.add(renderObject(Modal.RESIZABLE, resizable));
		}
	}

	protected void renderShim(List<String> renderedAttributes, Modal modal) throws IOException {
		java.lang.Boolean shim = modal.getShim();

		if (shim != null) {
			renderedAttributes.add(renderBoolean(Modal.SHIM, shim));
		}
	}

	protected void renderSrcNode(List<String> renderedAttributes, Modal modal) throws IOException {
		java.lang.String srcNode = modal.getSrcNode();

		if (srcNode != null) {
			renderedAttributes.add(renderString(Modal.SRC_NODE, srcNode));
		}
	}

	protected void renderStrings(List<String> renderedAttributes, Modal modal) throws IOException {
		java.lang.Object strings = modal.getStrings();

		if (strings != null) {
			renderedAttributes.add(renderObject(Modal.STRINGS, strings));
		}
	}

	protected void renderTabIndex(List<String> renderedAttributes, Modal modal) throws IOException {
		java.lang.Object tabIndex = modal.getTabIndex();

		if (tabIndex != null) {
			renderedAttributes.add(renderNumber(Modal.TAB_INDEX, tabIndex));
		}
	}

	protected void renderToolbarPosition(List<String> renderedAttributes, Modal modal) throws IOException {
		java.lang.Object toolbarPosition = modal.getToolbarPosition();

		if (toolbarPosition != null) {
			renderedAttributes.add(renderObject(Modal.TOOLBAR_POSITION, toolbarPosition));
		}
	}

	protected void renderToolbars(List<String> renderedAttributes, Modal modal) throws IOException {
		java.lang.Object toolbars = modal.getToolbars();

		if (toolbars != null) {
			renderedAttributes.add(renderString(Modal.TOOLBARS, toolbars));
		}
	}

	protected void renderVisible(List<String> renderedAttributes, Modal modal) throws IOException {
		java.lang.Boolean visible = modal.getVisible();

		if (visible != null) {
			renderedAttributes.add(renderBoolean(Modal.VISIBLE, visible));
		}
	}

	protected void renderWidth(List<String> renderedAttributes, Modal modal) throws IOException {
		java.lang.Object width = modal.getWidth();

		if (width != null) {
			renderedAttributes.add(renderString(Modal.WIDTH, width));
		}
	}

	protected void renderX(List<String> renderedAttributes, Modal modal) throws IOException {
		java.lang.Object x = modal.getX();

		if (x != null) {
			renderedAttributes.add(renderNumber(Modal.X, x));
		}
	}

	protected void renderXy(List<String> renderedAttributes, Modal modal) throws IOException {
		java.lang.Object xy = modal.getXy();

		if (xy != null) {
			renderedAttributes.add(renderArray(Modal.XY, xy));
		}
	}

	protected void renderY(List<String> renderedAttributes, Modal modal) throws IOException {
		java.lang.Object y = modal.getY();

		if (y != null) {
			renderedAttributes.add(renderNumber(Modal.Y, y));
		}
	}

	protected void renderZIndex(List<String> renderedAttributes, Modal modal) throws IOException {
		java.lang.Object zIndex = modal.getZIndex();

		if (zIndex != null) {
			renderedAttributes.add(renderNumber(Modal.Z_INDEX, zIndex));
		}
	}

	protected void renderAfterAlignChange(List<String> renderedAttributes, Modal modal) throws IOException {
		java.lang.String afterAlignChange = modal.getAfterAlignChange();

		if (afterAlignChange != null) {
			renderedAttributes.add(renderString(Modal.AFTER_ALIGN_CHANGE, afterAlignChange));
		}
	}

	protected void renderAfterAlignOnChange(List<String> renderedAttributes, Modal modal) throws IOException {
		java.lang.String afterAlignOnChange = modal.getAfterAlignOnChange();

		if (afterAlignOnChange != null) {
			renderedAttributes.add(renderString(Modal.AFTER_ALIGN_ON_CHANGE, afterAlignOnChange));
		}
	}

	protected void renderAfterBodyContentChange(List<String> renderedAttributes, Modal modal) throws IOException {
		java.lang.String afterBodyContentChange = modal.getAfterBodyContentChange();

		if (afterBodyContentChange != null) {
			renderedAttributes.add(renderString(Modal.AFTER_BODY_CONTENT_CHANGE, afterBodyContentChange));
		}
	}

	protected void renderAfterBoundingBoxChange(List<String> renderedAttributes, Modal modal) throws IOException {
		java.lang.String afterBoundingBoxChange = modal.getAfterBoundingBoxChange();

		if (afterBoundingBoxChange != null) {
			renderedAttributes.add(renderString(Modal.AFTER_BOUNDING_BOX_CHANGE, afterBoundingBoxChange));
		}
	}

	protected void renderAfterCenteredChange(List<String> renderedAttributes, Modal modal) throws IOException {
		java.lang.String afterCenteredChange = modal.getAfterCenteredChange();

		if (afterCenteredChange != null) {
			renderedAttributes.add(renderString(Modal.AFTER_CENTERED_CHANGE, afterCenteredChange));
		}
	}

	protected void renderAfterConstrainChange(List<String> renderedAttributes, Modal modal) throws IOException {
		java.lang.String afterConstrainChange = modal.getAfterConstrainChange();

		if (afterConstrainChange != null) {
			renderedAttributes.add(renderString(Modal.AFTER_CONSTRAIN_CHANGE, afterConstrainChange));
		}
	}

	protected void renderAfterContentBoxChange(List<String> renderedAttributes, Modal modal) throws IOException {
		java.lang.String afterContentBoxChange = modal.getAfterContentBoxChange();

		if (afterContentBoxChange != null) {
			renderedAttributes.add(renderString(Modal.AFTER_CONTENT_BOX_CHANGE, afterContentBoxChange));
		}
	}

	protected void renderAfterDestroyOnHideChange(List<String> renderedAttributes, Modal modal) throws IOException {
		java.lang.String afterDestroyOnHideChange = modal.getAfterDestroyOnHideChange();

		if (afterDestroyOnHideChange != null) {
			renderedAttributes.add(renderString(Modal.AFTER_DESTROY_ON_HIDE_CHANGE, afterDestroyOnHideChange));
		}
	}

	protected void renderAfterDestroyedChange(List<String> renderedAttributes, Modal modal) throws IOException {
		java.lang.String afterDestroyedChange = modal.getAfterDestroyedChange();

		if (afterDestroyedChange != null) {
			renderedAttributes.add(renderString(Modal.AFTER_DESTROYED_CHANGE, afterDestroyedChange));
		}
	}

	protected void renderAfterDisabledChange(List<String> renderedAttributes, Modal modal) throws IOException {
		java.lang.String afterDisabledChange = modal.getAfterDisabledChange();

		if (afterDisabledChange != null) {
			renderedAttributes.add(renderString(Modal.AFTER_DISABLED_CHANGE, afterDisabledChange));
		}
	}

	protected void renderAfterDraggableChange(List<String> renderedAttributes, Modal modal) throws IOException {
		java.lang.String afterDraggableChange = modal.getAfterDraggableChange();

		if (afterDraggableChange != null) {
			renderedAttributes.add(renderString(Modal.AFTER_DRAGGABLE_CHANGE, afterDraggableChange));
		}
	}

	protected void renderAfterFillHeightChange(List<String> renderedAttributes, Modal modal) throws IOException {
		java.lang.String afterFillHeightChange = modal.getAfterFillHeightChange();

		if (afterFillHeightChange != null) {
			renderedAttributes.add(renderString(Modal.AFTER_FILL_HEIGHT_CHANGE, afterFillHeightChange));
		}
	}

	protected void renderAfterFocusOnChange(List<String> renderedAttributes, Modal modal) throws IOException {
		java.lang.String afterFocusOnChange = modal.getAfterFocusOnChange();

		if (afterFocusOnChange != null) {
			renderedAttributes.add(renderString(Modal.AFTER_FOCUS_ON_CHANGE, afterFocusOnChange));
		}
	}

	protected void renderAfterFocusedChange(List<String> renderedAttributes, Modal modal) throws IOException {
		java.lang.String afterFocusedChange = modal.getAfterFocusedChange();

		if (afterFocusedChange != null) {
			renderedAttributes.add(renderString(Modal.AFTER_FOCUSED_CHANGE, afterFocusedChange));
		}
	}

	protected void renderAfterFooterContentChange(List<String> renderedAttributes, Modal modal) throws IOException {
		java.lang.String afterFooterContentChange = modal.getAfterFooterContentChange();

		if (afterFooterContentChange != null) {
			renderedAttributes.add(renderString(Modal.AFTER_FOOTER_CONTENT_CHANGE, afterFooterContentChange));
		}
	}

	protected void renderAfterHeaderContentChange(List<String> renderedAttributes, Modal modal) throws IOException {
		java.lang.String afterHeaderContentChange = modal.getAfterHeaderContentChange();

		if (afterHeaderContentChange != null) {
			renderedAttributes.add(renderString(Modal.AFTER_HEADER_CONTENT_CHANGE, afterHeaderContentChange));
		}
	}

	protected void renderAfterHeightChange(List<String> renderedAttributes, Modal modal) throws IOException {
		java.lang.String afterHeightChange = modal.getAfterHeightChange();

		if (afterHeightChange != null) {
			renderedAttributes.add(renderString(Modal.AFTER_HEIGHT_CHANGE, afterHeightChange));
		}
	}

	protected void renderAfterHideOnChange(List<String> renderedAttributes, Modal modal) throws IOException {
		java.lang.String afterHideOnChange = modal.getAfterHideOnChange();

		if (afterHideOnChange != null) {
			renderedAttributes.add(renderString(Modal.AFTER_HIDE_ON_CHANGE, afterHideOnChange));
		}
	}

	protected void renderAfterIdChange(List<String> renderedAttributes, Modal modal) throws IOException {
		java.lang.String afterIdChange = modal.getAfterIdChange();

		if (afterIdChange != null) {
			renderedAttributes.add(renderString(Modal.AFTER_ID_CHANGE, afterIdChange));
		}
	}

	protected void renderAfterInitializedChange(List<String> renderedAttributes, Modal modal) throws IOException {
		java.lang.String afterInitializedChange = modal.getAfterInitializedChange();

		if (afterInitializedChange != null) {
			renderedAttributes.add(renderString(Modal.AFTER_INITIALIZED_CHANGE, afterInitializedChange));
		}
	}

	protected void renderAfterLocaleChange(List<String> renderedAttributes, Modal modal) throws IOException {
		java.lang.String afterLocaleChange = modal.getAfterLocaleChange();

		if (afterLocaleChange != null) {
			renderedAttributes.add(renderString(Modal.AFTER_LOCALE_CHANGE, afterLocaleChange));
		}
	}

	protected void renderAfterMaskNodeChange(List<String> renderedAttributes, Modal modal) throws IOException {
		java.lang.String afterMaskNodeChange = modal.getAfterMaskNodeChange();

		if (afterMaskNodeChange != null) {
			renderedAttributes.add(renderString(Modal.AFTER_MASK_NODE_CHANGE, afterMaskNodeChange));
		}
	}

	protected void renderAfterModalChange(List<String> renderedAttributes, Modal modal) throws IOException {
		java.lang.String afterModalChange = modal.getAfterModalChange();

		if (afterModalChange != null) {
			renderedAttributes.add(renderString(Modal.AFTER_MODAL_CHANGE, afterModalChange));
		}
	}

	protected void renderAfterPreventOverlapChange(List<String> renderedAttributes, Modal modal) throws IOException {
		java.lang.String afterPreventOverlapChange = modal.getAfterPreventOverlapChange();

		if (afterPreventOverlapChange != null) {
			renderedAttributes.add(renderString(Modal.AFTER_PREVENT_OVERLAP_CHANGE, afterPreventOverlapChange));
		}
	}

	protected void renderAfterRenderChange(List<String> renderedAttributes, Modal modal) throws IOException {
		java.lang.String afterRenderChange = modal.getAfterRenderChange();

		if (afterRenderChange != null) {
			renderedAttributes.add(renderString(Modal.AFTER_RENDER_CHANGE, afterRenderChange));
		}
	}

	protected void renderAfterRenderedChange(List<String> renderedAttributes, Modal modal) throws IOException {
		java.lang.String afterRenderedChange = modal.getAfterRenderedChange();

		if (afterRenderedChange != null) {
			renderedAttributes.add(renderString(Modal.AFTER_RENDERED_CHANGE, afterRenderedChange));
		}
	}

	protected void renderAfterResizableChange(List<String> renderedAttributes, Modal modal) throws IOException {
		java.lang.String afterResizableChange = modal.getAfterResizableChange();

		if (afterResizableChange != null) {
			renderedAttributes.add(renderString(Modal.AFTER_RESIZABLE_CHANGE, afterResizableChange));
		}
	}

	protected void renderAfterShimChange(List<String> renderedAttributes, Modal modal) throws IOException {
		java.lang.String afterShimChange = modal.getAfterShimChange();

		if (afterShimChange != null) {
			renderedAttributes.add(renderString(Modal.AFTER_SHIM_CHANGE, afterShimChange));
		}
	}

	protected void renderAfterSrcNodeChange(List<String> renderedAttributes, Modal modal) throws IOException {
		java.lang.String afterSrcNodeChange = modal.getAfterSrcNodeChange();

		if (afterSrcNodeChange != null) {
			renderedAttributes.add(renderString(Modal.AFTER_SRC_NODE_CHANGE, afterSrcNodeChange));
		}
	}

	protected void renderAfterStringsChange(List<String> renderedAttributes, Modal modal) throws IOException {
		java.lang.String afterStringsChange = modal.getAfterStringsChange();

		if (afterStringsChange != null) {
			renderedAttributes.add(renderString(Modal.AFTER_STRINGS_CHANGE, afterStringsChange));
		}
	}

	protected void renderAfterTabIndexChange(List<String> renderedAttributes, Modal modal) throws IOException {
		java.lang.String afterTabIndexChange = modal.getAfterTabIndexChange();

		if (afterTabIndexChange != null) {
			renderedAttributes.add(renderString(Modal.AFTER_TAB_INDEX_CHANGE, afterTabIndexChange));
		}
	}

	protected void renderAfterToolbarPositionChange(List<String> renderedAttributes, Modal modal) throws IOException {
		java.lang.String afterToolbarPositionChange = modal.getAfterToolbarPositionChange();

		if (afterToolbarPositionChange != null) {
			renderedAttributes.add(renderString(Modal.AFTER_TOOLBAR_POSITION_CHANGE, afterToolbarPositionChange));
		}
	}

	protected void renderAfterToolbarsChange(List<String> renderedAttributes, Modal modal) throws IOException {
		java.lang.String afterToolbarsChange = modal.getAfterToolbarsChange();

		if (afterToolbarsChange != null) {
			renderedAttributes.add(renderString(Modal.AFTER_TOOLBARS_CHANGE, afterToolbarsChange));
		}
	}

	protected void renderAfterVisibleChange(List<String> renderedAttributes, Modal modal) throws IOException {
		java.lang.String afterVisibleChange = modal.getAfterVisibleChange();

		if (afterVisibleChange != null) {
			renderedAttributes.add(renderString(Modal.AFTER_VISIBLE_CHANGE, afterVisibleChange));
		}
	}

	protected void renderAfterWidthChange(List<String> renderedAttributes, Modal modal) throws IOException {
		java.lang.String afterWidthChange = modal.getAfterWidthChange();

		if (afterWidthChange != null) {
			renderedAttributes.add(renderString(Modal.AFTER_WIDTH_CHANGE, afterWidthChange));
		}
	}

	protected void renderAfterXChange(List<String> renderedAttributes, Modal modal) throws IOException {
		java.lang.String afterXChange = modal.getAfterXChange();

		if (afterXChange != null) {
			renderedAttributes.add(renderString(Modal.AFTER_XCHANGE, afterXChange));
		}
	}

	protected void renderAfterXyChange(List<String> renderedAttributes, Modal modal) throws IOException {
		java.lang.String afterXyChange = modal.getAfterXyChange();

		if (afterXyChange != null) {
			renderedAttributes.add(renderString(Modal.AFTER_XY_CHANGE, afterXyChange));
		}
	}

	protected void renderAfterYChange(List<String> renderedAttributes, Modal modal) throws IOException {
		java.lang.String afterYChange = modal.getAfterYChange();

		if (afterYChange != null) {
			renderedAttributes.add(renderString(Modal.AFTER_YCHANGE, afterYChange));
		}
	}

	protected void renderAfterZIndexChange(List<String> renderedAttributes, Modal modal) throws IOException {
		java.lang.String afterZIndexChange = modal.getAfterZIndexChange();

		if (afterZIndexChange != null) {
			renderedAttributes.add(renderString(Modal.AFTER_ZINDEX_CHANGE, afterZIndexChange));
		}
	}

	protected void renderOnAlignChange(List<String> renderedAttributes, Modal modal) throws IOException {
		java.lang.String onAlignChange = modal.getOnAlignChange();

		if (onAlignChange != null) {
			renderedAttributes.add(renderString(Modal.ON_ALIGN_CHANGE, onAlignChange));
		}
	}

	protected void renderOnAlignOnChange(List<String> renderedAttributes, Modal modal) throws IOException {
		java.lang.String onAlignOnChange = modal.getOnAlignOnChange();

		if (onAlignOnChange != null) {
			renderedAttributes.add(renderString(Modal.ON_ALIGN_ON_CHANGE, onAlignOnChange));
		}
	}

	protected void renderOnBodyContentChange(List<String> renderedAttributes, Modal modal) throws IOException {
		java.lang.String onBodyContentChange = modal.getOnBodyContentChange();

		if (onBodyContentChange != null) {
			renderedAttributes.add(renderString(Modal.ON_BODY_CONTENT_CHANGE, onBodyContentChange));
		}
	}

	protected void renderOnBoundingBoxChange(List<String> renderedAttributes, Modal modal) throws IOException {
		java.lang.String onBoundingBoxChange = modal.getOnBoundingBoxChange();

		if (onBoundingBoxChange != null) {
			renderedAttributes.add(renderString(Modal.ON_BOUNDING_BOX_CHANGE, onBoundingBoxChange));
		}
	}

	protected void renderOnCenteredChange(List<String> renderedAttributes, Modal modal) throws IOException {
		java.lang.String onCenteredChange = modal.getOnCenteredChange();

		if (onCenteredChange != null) {
			renderedAttributes.add(renderString(Modal.ON_CENTERED_CHANGE, onCenteredChange));
		}
	}

	protected void renderOnConstrainChange(List<String> renderedAttributes, Modal modal) throws IOException {
		java.lang.String onConstrainChange = modal.getOnConstrainChange();

		if (onConstrainChange != null) {
			renderedAttributes.add(renderString(Modal.ON_CONSTRAIN_CHANGE, onConstrainChange));
		}
	}

	protected void renderOnContentBoxChange(List<String> renderedAttributes, Modal modal) throws IOException {
		java.lang.String onContentBoxChange = modal.getOnContentBoxChange();

		if (onContentBoxChange != null) {
			renderedAttributes.add(renderString(Modal.ON_CONTENT_BOX_CHANGE, onContentBoxChange));
		}
	}

	protected void renderOnDestroyOnHideChange(List<String> renderedAttributes, Modal modal) throws IOException {
		java.lang.String onDestroyOnHideChange = modal.getOnDestroyOnHideChange();

		if (onDestroyOnHideChange != null) {
			renderedAttributes.add(renderString(Modal.ON_DESTROY_ON_HIDE_CHANGE, onDestroyOnHideChange));
		}
	}

	protected void renderOnDestroyedChange(List<String> renderedAttributes, Modal modal) throws IOException {
		java.lang.String onDestroyedChange = modal.getOnDestroyedChange();

		if (onDestroyedChange != null) {
			renderedAttributes.add(renderString(Modal.ON_DESTROYED_CHANGE, onDestroyedChange));
		}
	}

	protected void renderOnDisabledChange(List<String> renderedAttributes, Modal modal) throws IOException {
		java.lang.String onDisabledChange = modal.getOnDisabledChange();

		if (onDisabledChange != null) {
			renderedAttributes.add(renderString(Modal.ON_DISABLED_CHANGE, onDisabledChange));
		}
	}

	protected void renderOnDraggableChange(List<String> renderedAttributes, Modal modal) throws IOException {
		java.lang.String onDraggableChange = modal.getOnDraggableChange();

		if (onDraggableChange != null) {
			renderedAttributes.add(renderString(Modal.ON_DRAGGABLE_CHANGE, onDraggableChange));
		}
	}

	protected void renderOnFillHeightChange(List<String> renderedAttributes, Modal modal) throws IOException {
		java.lang.String onFillHeightChange = modal.getOnFillHeightChange();

		if (onFillHeightChange != null) {
			renderedAttributes.add(renderString(Modal.ON_FILL_HEIGHT_CHANGE, onFillHeightChange));
		}
	}

	protected void renderOnFocusOnChange(List<String> renderedAttributes, Modal modal) throws IOException {
		java.lang.String onFocusOnChange = modal.getOnFocusOnChange();

		if (onFocusOnChange != null) {
			renderedAttributes.add(renderString(Modal.ON_FOCUS_ON_CHANGE, onFocusOnChange));
		}
	}

	protected void renderOnFocusedChange(List<String> renderedAttributes, Modal modal) throws IOException {
		java.lang.String onFocusedChange = modal.getOnFocusedChange();

		if (onFocusedChange != null) {
			renderedAttributes.add(renderString(Modal.ON_FOCUSED_CHANGE, onFocusedChange));
		}
	}

	protected void renderOnFooterContentChange(List<String> renderedAttributes, Modal modal) throws IOException {
		java.lang.String onFooterContentChange = modal.getOnFooterContentChange();

		if (onFooterContentChange != null) {
			renderedAttributes.add(renderString(Modal.ON_FOOTER_CONTENT_CHANGE, onFooterContentChange));
		}
	}

	protected void renderOnHeaderContentChange(List<String> renderedAttributes, Modal modal) throws IOException {
		java.lang.String onHeaderContentChange = modal.getOnHeaderContentChange();

		if (onHeaderContentChange != null) {
			renderedAttributes.add(renderString(Modal.ON_HEADER_CONTENT_CHANGE, onHeaderContentChange));
		}
	}

	protected void renderOnHeightChange(List<String> renderedAttributes, Modal modal) throws IOException {
		java.lang.String onHeightChange = modal.getOnHeightChange();

		if (onHeightChange != null) {
			renderedAttributes.add(renderString(Modal.ON_HEIGHT_CHANGE, onHeightChange));
		}
	}

	protected void renderOnHideOnChange(List<String> renderedAttributes, Modal modal) throws IOException {
		java.lang.String onHideOnChange = modal.getOnHideOnChange();

		if (onHideOnChange != null) {
			renderedAttributes.add(renderString(Modal.ON_HIDE_ON_CHANGE, onHideOnChange));
		}
	}

	protected void renderOnIdChange(List<String> renderedAttributes, Modal modal) throws IOException {
		java.lang.String onIdChange = modal.getOnIdChange();

		if (onIdChange != null) {
			renderedAttributes.add(renderString(Modal.ON_ID_CHANGE, onIdChange));
		}
	}

	protected void renderOnInitializedChange(List<String> renderedAttributes, Modal modal) throws IOException {
		java.lang.String onInitializedChange = modal.getOnInitializedChange();

		if (onInitializedChange != null) {
			renderedAttributes.add(renderString(Modal.ON_INITIALIZED_CHANGE, onInitializedChange));
		}
	}

	protected void renderOnLocaleChange(List<String> renderedAttributes, Modal modal) throws IOException {
		java.lang.String onLocaleChange = modal.getOnLocaleChange();

		if (onLocaleChange != null) {
			renderedAttributes.add(renderString(Modal.ON_LOCALE_CHANGE, onLocaleChange));
		}
	}

	protected void renderOnMaskNodeChange(List<String> renderedAttributes, Modal modal) throws IOException {
		java.lang.String onMaskNodeChange = modal.getOnMaskNodeChange();

		if (onMaskNodeChange != null) {
			renderedAttributes.add(renderString(Modal.ON_MASK_NODE_CHANGE, onMaskNodeChange));
		}
	}

	protected void renderOnModalChange(List<String> renderedAttributes, Modal modal) throws IOException {
		java.lang.String onModalChange = modal.getOnModalChange();

		if (onModalChange != null) {
			renderedAttributes.add(renderString(Modal.ON_MODAL_CHANGE, onModalChange));
		}
	}

	protected void renderOnPreventOverlapChange(List<String> renderedAttributes, Modal modal) throws IOException {
		java.lang.String onPreventOverlapChange = modal.getOnPreventOverlapChange();

		if (onPreventOverlapChange != null) {
			renderedAttributes.add(renderString(Modal.ON_PREVENT_OVERLAP_CHANGE, onPreventOverlapChange));
		}
	}

	protected void renderOnRenderChange(List<String> renderedAttributes, Modal modal) throws IOException {
		java.lang.String onRenderChange = modal.getOnRenderChange();

		if (onRenderChange != null) {
			renderedAttributes.add(renderString(Modal.ON_RENDER_CHANGE, onRenderChange));
		}
	}

	protected void renderOnRenderedChange(List<String> renderedAttributes, Modal modal) throws IOException {
		java.lang.String onRenderedChange = modal.getOnRenderedChange();

		if (onRenderedChange != null) {
			renderedAttributes.add(renderString(Modal.ON_RENDERED_CHANGE, onRenderedChange));
		}
	}

	protected void renderOnResizableChange(List<String> renderedAttributes, Modal modal) throws IOException {
		java.lang.String onResizableChange = modal.getOnResizableChange();

		if (onResizableChange != null) {
			renderedAttributes.add(renderString(Modal.ON_RESIZABLE_CHANGE, onResizableChange));
		}
	}

	protected void renderOnShimChange(List<String> renderedAttributes, Modal modal) throws IOException {
		java.lang.String onShimChange = modal.getOnShimChange();

		if (onShimChange != null) {
			renderedAttributes.add(renderString(Modal.ON_SHIM_CHANGE, onShimChange));
		}
	}

	protected void renderOnSrcNodeChange(List<String> renderedAttributes, Modal modal) throws IOException {
		java.lang.String onSrcNodeChange = modal.getOnSrcNodeChange();

		if (onSrcNodeChange != null) {
			renderedAttributes.add(renderString(Modal.ON_SRC_NODE_CHANGE, onSrcNodeChange));
		}
	}

	protected void renderOnStringsChange(List<String> renderedAttributes, Modal modal) throws IOException {
		java.lang.String onStringsChange = modal.getOnStringsChange();

		if (onStringsChange != null) {
			renderedAttributes.add(renderString(Modal.ON_STRINGS_CHANGE, onStringsChange));
		}
	}

	protected void renderOnTabIndexChange(List<String> renderedAttributes, Modal modal) throws IOException {
		java.lang.String onTabIndexChange = modal.getOnTabIndexChange();

		if (onTabIndexChange != null) {
			renderedAttributes.add(renderString(Modal.ON_TAB_INDEX_CHANGE, onTabIndexChange));
		}
	}

	protected void renderOnToolbarPositionChange(List<String> renderedAttributes, Modal modal) throws IOException {
		java.lang.String onToolbarPositionChange = modal.getOnToolbarPositionChange();

		if (onToolbarPositionChange != null) {
			renderedAttributes.add(renderString(Modal.ON_TOOLBAR_POSITION_CHANGE, onToolbarPositionChange));
		}
	}

	protected void renderOnToolbarsChange(List<String> renderedAttributes, Modal modal) throws IOException {
		java.lang.String onToolbarsChange = modal.getOnToolbarsChange();

		if (onToolbarsChange != null) {
			renderedAttributes.add(renderString(Modal.ON_TOOLBARS_CHANGE, onToolbarsChange));
		}
	}

	protected void renderOnVisibleChange(List<String> renderedAttributes, Modal modal) throws IOException {
		java.lang.String onVisibleChange = modal.getOnVisibleChange();

		if (onVisibleChange != null) {
			renderedAttributes.add(renderString(Modal.ON_VISIBLE_CHANGE, onVisibleChange));
		}
	}

	protected void renderOnWidthChange(List<String> renderedAttributes, Modal modal) throws IOException {
		java.lang.String onWidthChange = modal.getOnWidthChange();

		if (onWidthChange != null) {
			renderedAttributes.add(renderString(Modal.ON_WIDTH_CHANGE, onWidthChange));
		}
	}

	protected void renderOnXChange(List<String> renderedAttributes, Modal modal) throws IOException {
		java.lang.String onXChange = modal.getOnXChange();

		if (onXChange != null) {
			renderedAttributes.add(renderString(Modal.ON_XCHANGE, onXChange));
		}
	}

	protected void renderOnXyChange(List<String> renderedAttributes, Modal modal) throws IOException {
		java.lang.String onXyChange = modal.getOnXyChange();

		if (onXyChange != null) {
			renderedAttributes.add(renderString(Modal.ON_XY_CHANGE, onXyChange));
		}
	}

	protected void renderOnYChange(List<String> renderedAttributes, Modal modal) throws IOException {
		java.lang.String onYChange = modal.getOnYChange();

		if (onYChange != null) {
			renderedAttributes.add(renderString(Modal.ON_YCHANGE, onYChange));
		}
	}

	protected void renderOnZIndexChange(List<String> renderedAttributes, Modal modal) throws IOException {
		java.lang.String onZIndexChange = modal.getOnZIndexChange();

		if (onZIndexChange != null) {
			renderedAttributes.add(renderString(Modal.ON_ZINDEX_CHANGE, onZIndexChange));
		}
	}

}
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

		if (modal.getAlign() != null) {
			renderAlign(renderedAttributes, modal);
		}
		
		if (modal.getAlignOn() != null) {
			renderAlignOn(renderedAttributes, modal);
		}
		
		if (modal.getModalBodyContent() != null) {
			renderModalBodyContent(renderedAttributes, modal);
		}
		
		if (modal.getBoundingBox() != null) {
			renderBoundingBox(renderedAttributes, modal);
		}
		
		if (modal.getCentered() != null) {
			renderCentered(renderedAttributes, modal);
		}
		
		if (modal.getConstrain() != null) {
			renderConstrain(renderedAttributes, modal);
		}
		
		if (modal.getContentBox() != null) {
			renderContentBox(renderedAttributes, modal);
		}
		
		if (modal.getDestroyOnHide() != null) {
			renderDestroyOnHide(renderedAttributes, modal);
		}
		
		if (modal.getDestroyed() != null) {
			renderDestroyed(renderedAttributes, modal);
		}
		
		if (modal.getDisabled() != null) {
			renderDisabled(renderedAttributes, modal);
		}
		
		if (modal.getDraggable() != null) {
			renderDraggable(renderedAttributes, modal);
		}
		
		if (modal.getFillHeight() != null) {
			renderFillHeight(renderedAttributes, modal);
		}
		
		if (modal.getFocusOn() != null) {
			renderFocusOn(renderedAttributes, modal);
		}
		
		if (modal.getFocused() != null) {
			renderFocused(renderedAttributes, modal);
		}
		
		if (modal.getFooterContent() != null) {
			renderFooterContent(renderedAttributes, modal);
		}
		
		if (modal.getHeaderContent() != null) {
			renderHeaderContent(renderedAttributes, modal);
		}
		
		if (modal.getHeight() != null) {
			renderHeight(renderedAttributes, modal);
		}
		
		if (modal.getHideOn() != null) {
			renderHideOn(renderedAttributes, modal);
		}
		
		if (modal.getModalId() != null) {
			renderModalId(renderedAttributes, modal);
		}
		
		if (modal.getInitialized() != null) {
			renderInitialized(renderedAttributes, modal);
		}
		
		if (modal.getModalLocale() != null) {
			renderModalLocale(renderedAttributes, modal);
		}
		
		if (modal.getMaskNode() != null) {
			renderMaskNode(renderedAttributes, modal);
		}
		
		if (modal.getModal() != null) {
			renderModal(renderedAttributes, modal);
		}
		
		if (modal.getPreventOverlap() != null) {
			renderPreventOverlap(renderedAttributes, modal);
		}
		
		if (modal.getRender() != null) {
			renderRender(renderedAttributes, modal);
		}
		
		if (modal.getRendered() != null) {
			renderRendered(renderedAttributes, modal);
		}
		
		if (modal.getResizable() != null) {
			renderResizable(renderedAttributes, modal);
		}
		
		if (modal.getShim() != null) {
			renderShim(renderedAttributes, modal);
		}
		
		if (modal.getSrcNode() != null) {
			renderSrcNode(renderedAttributes, modal);
		}
		
		if (modal.getStrings() != null) {
			renderStrings(renderedAttributes, modal);
		}
		
		if (modal.getTabIndex() != null) {
			renderTabIndex(renderedAttributes, modal);
		}
		
		if (modal.getToolbarPosition() != null) {
			renderToolbarPosition(renderedAttributes, modal);
		}
		
		if (modal.getToolbars() != null) {
			renderToolbars(renderedAttributes, modal);
		}
		
		if (modal.getVisible() != null) {
			renderVisible(renderedAttributes, modal);
		}
		
		if (modal.getWidth() != null) {
			renderWidth(renderedAttributes, modal);
		}
		
		if (modal.getX() != null) {
			renderX(renderedAttributes, modal);
		}
		
		if (modal.getXy() != null) {
			renderXy(renderedAttributes, modal);
		}
		
		if (modal.getY() != null) {
			renderY(renderedAttributes, modal);
		}
		
		if (modal.getZIndex() != null) {
			renderZIndex(renderedAttributes, modal);
		}
		

		for (String renderedAttribute : renderedAttributes) {
			responseWriter.write(renderedAttribute);
			responseWriter.write(StringPool.COMMA);
		}

		responseWriter.write("after");
		responseWriter.write(StringPool.COLON);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedAfterEvents = new ArrayList<String>();

		if (modal.getAfterAlignChange() != null) {
			renderAfterAlignChange(renderedAfterEvents, modal);
		}
		
		if (modal.getAfterAlignOnChange() != null) {
			renderAfterAlignOnChange(renderedAfterEvents, modal);
		}
		
		if (modal.getAfterBodyContentChange() != null) {
			renderAfterBodyContentChange(renderedAfterEvents, modal);
		}
		
		if (modal.getAfterBoundingBoxChange() != null) {
			renderAfterBoundingBoxChange(renderedAfterEvents, modal);
		}
		
		if (modal.getAfterCenteredChange() != null) {
			renderAfterCenteredChange(renderedAfterEvents, modal);
		}
		
		if (modal.getAfterConstrainChange() != null) {
			renderAfterConstrainChange(renderedAfterEvents, modal);
		}
		
		if (modal.getAfterContentBoxChange() != null) {
			renderAfterContentBoxChange(renderedAfterEvents, modal);
		}
		
		if (modal.getAfterDestroyOnHideChange() != null) {
			renderAfterDestroyOnHideChange(renderedAfterEvents, modal);
		}
		
		if (modal.getAfterDestroyedChange() != null) {
			renderAfterDestroyedChange(renderedAfterEvents, modal);
		}
		
		if (modal.getAfterDisabledChange() != null) {
			renderAfterDisabledChange(renderedAfterEvents, modal);
		}
		
		if (modal.getAfterDraggableChange() != null) {
			renderAfterDraggableChange(renderedAfterEvents, modal);
		}
		
		if (modal.getAfterFillHeightChange() != null) {
			renderAfterFillHeightChange(renderedAfterEvents, modal);
		}
		
		if (modal.getAfterFocusOnChange() != null) {
			renderAfterFocusOnChange(renderedAfterEvents, modal);
		}
		
		if (modal.getAfterFocusedChange() != null) {
			renderAfterFocusedChange(renderedAfterEvents, modal);
		}
		
		if (modal.getAfterFooterContentChange() != null) {
			renderAfterFooterContentChange(renderedAfterEvents, modal);
		}
		
		if (modal.getAfterHeaderContentChange() != null) {
			renderAfterHeaderContentChange(renderedAfterEvents, modal);
		}
		
		if (modal.getAfterHeightChange() != null) {
			renderAfterHeightChange(renderedAfterEvents, modal);
		}
		
		if (modal.getAfterHideOnChange() != null) {
			renderAfterHideOnChange(renderedAfterEvents, modal);
		}
		
		if (modal.getAfterIdChange() != null) {
			renderAfterIdChange(renderedAfterEvents, modal);
		}
		
		if (modal.getAfterInitializedChange() != null) {
			renderAfterInitializedChange(renderedAfterEvents, modal);
		}
		
		if (modal.getAfterLocaleChange() != null) {
			renderAfterLocaleChange(renderedAfterEvents, modal);
		}
		
		if (modal.getAfterMaskNodeChange() != null) {
			renderAfterMaskNodeChange(renderedAfterEvents, modal);
		}
		
		if (modal.getAfterModalChange() != null) {
			renderAfterModalChange(renderedAfterEvents, modal);
		}
		
		if (modal.getAfterPreventOverlapChange() != null) {
			renderAfterPreventOverlapChange(renderedAfterEvents, modal);
		}
		
		if (modal.getAfterRenderChange() != null) {
			renderAfterRenderChange(renderedAfterEvents, modal);
		}
		
		if (modal.getAfterRenderedChange() != null) {
			renderAfterRenderedChange(renderedAfterEvents, modal);
		}
		
		if (modal.getAfterResizableChange() != null) {
			renderAfterResizableChange(renderedAfterEvents, modal);
		}
		
		if (modal.getAfterShimChange() != null) {
			renderAfterShimChange(renderedAfterEvents, modal);
		}
		
		if (modal.getAfterSrcNodeChange() != null) {
			renderAfterSrcNodeChange(renderedAfterEvents, modal);
		}
		
		if (modal.getAfterStringsChange() != null) {
			renderAfterStringsChange(renderedAfterEvents, modal);
		}
		
		if (modal.getAfterTabIndexChange() != null) {
			renderAfterTabIndexChange(renderedAfterEvents, modal);
		}
		
		if (modal.getAfterToolbarPositionChange() != null) {
			renderAfterToolbarPositionChange(renderedAfterEvents, modal);
		}
		
		if (modal.getAfterToolbarsChange() != null) {
			renderAfterToolbarsChange(renderedAfterEvents, modal);
		}
		
		if (modal.getAfterVisibleChange() != null) {
			renderAfterVisibleChange(renderedAfterEvents, modal);
		}
		
		if (modal.getAfterWidthChange() != null) {
			renderAfterWidthChange(renderedAfterEvents, modal);
		}
		
		if (modal.getAfterXChange() != null) {
			renderAfterXChange(renderedAfterEvents, modal);
		}
		
		if (modal.getAfterXyChange() != null) {
			renderAfterXyChange(renderedAfterEvents, modal);
		}
		
		if (modal.getAfterYChange() != null) {
			renderAfterYChange(renderedAfterEvents, modal);
		}
		
		if (modal.getAfterZIndexChange() != null) {
			renderAfterZIndexChange(renderedAfterEvents, modal);
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

		if (modal.getOnAlignChange() != null) {
			renderOnAlignChange(renderedOnEvents, modal);
		}
		
		if (modal.getOnAlignOnChange() != null) {
			renderOnAlignOnChange(renderedOnEvents, modal);
		}
		
		if (modal.getOnBodyContentChange() != null) {
			renderOnBodyContentChange(renderedOnEvents, modal);
		}
		
		if (modal.getOnBoundingBoxChange() != null) {
			renderOnBoundingBoxChange(renderedOnEvents, modal);
		}
		
		if (modal.getOnCenteredChange() != null) {
			renderOnCenteredChange(renderedOnEvents, modal);
		}
		
		if (modal.getOnConstrainChange() != null) {
			renderOnConstrainChange(renderedOnEvents, modal);
		}
		
		if (modal.getOnContentBoxChange() != null) {
			renderOnContentBoxChange(renderedOnEvents, modal);
		}
		
		if (modal.getOnDestroyOnHideChange() != null) {
			renderOnDestroyOnHideChange(renderedOnEvents, modal);
		}
		
		if (modal.getOnDestroyedChange() != null) {
			renderOnDestroyedChange(renderedOnEvents, modal);
		}
		
		if (modal.getOnDisabledChange() != null) {
			renderOnDisabledChange(renderedOnEvents, modal);
		}
		
		if (modal.getOnDraggableChange() != null) {
			renderOnDraggableChange(renderedOnEvents, modal);
		}
		
		if (modal.getOnFillHeightChange() != null) {
			renderOnFillHeightChange(renderedOnEvents, modal);
		}
		
		if (modal.getOnFocusOnChange() != null) {
			renderOnFocusOnChange(renderedOnEvents, modal);
		}
		
		if (modal.getOnFocusedChange() != null) {
			renderOnFocusedChange(renderedOnEvents, modal);
		}
		
		if (modal.getOnFooterContentChange() != null) {
			renderOnFooterContentChange(renderedOnEvents, modal);
		}
		
		if (modal.getOnHeaderContentChange() != null) {
			renderOnHeaderContentChange(renderedOnEvents, modal);
		}
		
		if (modal.getOnHeightChange() != null) {
			renderOnHeightChange(renderedOnEvents, modal);
		}
		
		if (modal.getOnHideOnChange() != null) {
			renderOnHideOnChange(renderedOnEvents, modal);
		}
		
		if (modal.getOnIdChange() != null) {
			renderOnIdChange(renderedOnEvents, modal);
		}
		
		if (modal.getOnInitializedChange() != null) {
			renderOnInitializedChange(renderedOnEvents, modal);
		}
		
		if (modal.getOnLocaleChange() != null) {
			renderOnLocaleChange(renderedOnEvents, modal);
		}
		
		if (modal.getOnMaskNodeChange() != null) {
			renderOnMaskNodeChange(renderedOnEvents, modal);
		}
		
		if (modal.getOnModalChange() != null) {
			renderOnModalChange(renderedOnEvents, modal);
		}
		
		if (modal.getOnPreventOverlapChange() != null) {
			renderOnPreventOverlapChange(renderedOnEvents, modal);
		}
		
		if (modal.getOnRenderChange() != null) {
			renderOnRenderChange(renderedOnEvents, modal);
		}
		
		if (modal.getOnRenderedChange() != null) {
			renderOnRenderedChange(renderedOnEvents, modal);
		}
		
		if (modal.getOnResizableChange() != null) {
			renderOnResizableChange(renderedOnEvents, modal);
		}
		
		if (modal.getOnShimChange() != null) {
			renderOnShimChange(renderedOnEvents, modal);
		}
		
		if (modal.getOnSrcNodeChange() != null) {
			renderOnSrcNodeChange(renderedOnEvents, modal);
		}
		
		if (modal.getOnStringsChange() != null) {
			renderOnStringsChange(renderedOnEvents, modal);
		}
		
		if (modal.getOnTabIndexChange() != null) {
			renderOnTabIndexChange(renderedOnEvents, modal);
		}
		
		if (modal.getOnToolbarPositionChange() != null) {
			renderOnToolbarPositionChange(renderedOnEvents, modal);
		}
		
		if (modal.getOnToolbarsChange() != null) {
			renderOnToolbarsChange(renderedOnEvents, modal);
		}
		
		if (modal.getOnVisibleChange() != null) {
			renderOnVisibleChange(renderedOnEvents, modal);
		}
		
		if (modal.getOnWidthChange() != null) {
			renderOnWidthChange(renderedOnEvents, modal);
		}
		
		if (modal.getOnXChange() != null) {
			renderOnXChange(renderedOnEvents, modal);
		}
		
		if (modal.getOnXyChange() != null) {
			renderOnXyChange(renderedOnEvents, modal);
		}
		
		if (modal.getOnYChange() != null) {
			renderOnYChange(renderedOnEvents, modal);
		}
		
		if (modal.getOnZIndexChange() != null) {
			renderOnZIndexChange(renderedOnEvents, modal);
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

	protected void renderAlign(List<String> renderedAttributes, Modal modal) throws IOException {
		java.lang.Object align = modal.getAlign();
		renderedAttributes.add(renderObject(Modal.ALIGN, align));
	}

	protected void renderAlignOn(List<String> renderedAttributes, Modal modal) throws IOException {
		java.lang.Object alignOn = modal.getAlignOn();
		renderedAttributes.add(renderArray(Modal.ALIGN_ON, alignOn));
	}

	protected void renderModalBodyContent(List<String> renderedAttributes, Modal modal) throws IOException {
		java.lang.String modalBodyContent = modal.getModalBodyContent();
		renderedAttributes.add(renderString(Modal.MODAL_BODY_CONTENT, modalBodyContent));
	}

	protected void renderBoundingBox(List<String> renderedAttributes, Modal modal) throws IOException {
		java.lang.String boundingBox = modal.getBoundingBox();
		renderedAttributes.add(renderString(Modal.BOUNDING_BOX, boundingBox));
	}

	protected void renderCentered(List<String> renderedAttributes, Modal modal) throws IOException {
		java.lang.Object centered = modal.getCentered();
		renderedAttributes.add(renderString(Modal.CENTERED, centered));
	}

	protected void renderConstrain(List<String> renderedAttributes, Modal modal) throws IOException {
		java.lang.Object constrain = modal.getConstrain();
		renderedAttributes.add(renderString(Modal.CONSTRAIN, constrain));
	}

	protected void renderContentBox(List<String> renderedAttributes, Modal modal) throws IOException {
		java.lang.String contentBox = modal.getContentBox();
		renderedAttributes.add(renderString(Modal.CONTENT_BOX, contentBox));
	}

	protected void renderDestroyOnHide(List<String> renderedAttributes, Modal modal) throws IOException {
		java.lang.Boolean destroyOnHide = modal.getDestroyOnHide();
		renderedAttributes.add(renderBoolean(Modal.DESTROY_ON_HIDE, destroyOnHide));
	}

	protected void renderDestroyed(List<String> renderedAttributes, Modal modal) throws IOException {
		java.lang.Boolean destroyed = modal.getDestroyed();
		renderedAttributes.add(renderBoolean(Modal.DESTROYED, destroyed));
	}

	protected void renderDisabled(List<String> renderedAttributes, Modal modal) throws IOException {
		java.lang.Boolean disabled = modal.getDisabled();
		renderedAttributes.add(renderBoolean(Modal.DISABLED, disabled));
	}

	protected void renderDraggable(List<String> renderedAttributes, Modal modal) throws IOException {
		java.lang.Object draggable = modal.getDraggable();
		renderedAttributes.add(renderObject(Modal.DRAGGABLE, draggable));
	}

	protected void renderFillHeight(List<String> renderedAttributes, Modal modal) throws IOException {
		java.lang.Object fillHeight = modal.getFillHeight();
		renderedAttributes.add(renderString(Modal.FILL_HEIGHT, fillHeight));
	}

	protected void renderFocusOn(List<String> renderedAttributes, Modal modal) throws IOException {
		java.lang.Object focusOn = modal.getFocusOn();
		renderedAttributes.add(renderArray(Modal.FOCUS_ON, focusOn));
	}

	protected void renderFocused(List<String> renderedAttributes, Modal modal) throws IOException {
		java.lang.Boolean focused = modal.getFocused();
		renderedAttributes.add(renderBoolean(Modal.FOCUSED, focused));
	}

	protected void renderFooterContent(List<String> renderedAttributes, Modal modal) throws IOException {
		java.lang.Object footerContent = modal.getFooterContent();
		renderedAttributes.add(renderString(Modal.FOOTER_CONTENT, footerContent));
	}

	protected void renderHeaderContent(List<String> renderedAttributes, Modal modal) throws IOException {
		java.lang.Object headerContent = modal.getHeaderContent();
		renderedAttributes.add(renderString(Modal.HEADER_CONTENT, headerContent));
	}

	protected void renderHeight(List<String> renderedAttributes, Modal modal) throws IOException {
		java.lang.Object height = modal.getHeight();
		renderedAttributes.add(renderString(Modal.HEIGHT, height));
	}

	protected void renderHideOn(List<String> renderedAttributes, Modal modal) throws IOException {
		java.lang.Object hideOn = modal.getHideOn();
		renderedAttributes.add(renderArray(Modal.HIDE_ON, hideOn));
	}

	protected void renderModalId(List<String> renderedAttributes, Modal modal) throws IOException {
		java.lang.String modalId = modal.getModalId();
		renderedAttributes.add(renderString(Modal.MODAL_ID, modalId));
	}

	protected void renderInitialized(List<String> renderedAttributes, Modal modal) throws IOException {
		java.lang.Boolean initialized = modal.getInitialized();
		renderedAttributes.add(renderBoolean(Modal.INITIALIZED, initialized));
	}

	protected void renderModalLocale(List<String> renderedAttributes, Modal modal) throws IOException {
		java.lang.String modalLocale = modal.getModalLocale();
		renderedAttributes.add(renderString(Modal.MODAL_LOCALE, modalLocale));
	}

	protected void renderMaskNode(List<String> renderedAttributes, Modal modal) throws IOException {
		java.lang.Object maskNode = modal.getMaskNode();
		renderedAttributes.add(renderString(Modal.MASK_NODE, maskNode));
	}

	protected void renderModal(List<String> renderedAttributes, Modal modal) throws IOException {
		java.lang.Boolean modal_ = modal.getModal();
		renderedAttributes.add(renderBoolean(Modal.MODAL, modal_));
	}

	protected void renderPreventOverlap(List<String> renderedAttributes, Modal modal) throws IOException {
		java.lang.Boolean preventOverlap = modal.getPreventOverlap();
		renderedAttributes.add(renderBoolean(Modal.PREVENT_OVERLAP, preventOverlap));
	}

	protected void renderRender(List<String> renderedAttributes, Modal modal) throws IOException {
		java.lang.Object render = modal.getRender();
		renderedAttributes.add(renderString(Modal.RENDER, render));
	}

	protected void renderRendered(List<String> renderedAttributes, Modal modal) throws IOException {
		java.lang.Boolean rendered = modal.getRendered();
		renderedAttributes.add(renderBoolean(Modal.RENDERED, rendered));
	}

	protected void renderResizable(List<String> renderedAttributes, Modal modal) throws IOException {
		java.lang.Object resizable = modal.getResizable();
		renderedAttributes.add(renderObject(Modal.RESIZABLE, resizable));
	}

	protected void renderShim(List<String> renderedAttributes, Modal modal) throws IOException {
		java.lang.Boolean shim = modal.getShim();
		renderedAttributes.add(renderBoolean(Modal.SHIM, shim));
	}

	protected void renderSrcNode(List<String> renderedAttributes, Modal modal) throws IOException {
		java.lang.String srcNode = modal.getSrcNode();
		renderedAttributes.add(renderString(Modal.SRC_NODE, srcNode));
	}

	protected void renderStrings(List<String> renderedAttributes, Modal modal) throws IOException {
		java.lang.Object strings = modal.getStrings();
		renderedAttributes.add(renderObject(Modal.STRINGS, strings));
	}

	protected void renderTabIndex(List<String> renderedAttributes, Modal modal) throws IOException {
		java.lang.Object tabIndex = modal.getTabIndex();
		renderedAttributes.add(renderNumber(Modal.TAB_INDEX, tabIndex));
	}

	protected void renderToolbarPosition(List<String> renderedAttributes, Modal modal) throws IOException {
		java.lang.Object toolbarPosition = modal.getToolbarPosition();
		renderedAttributes.add(renderObject(Modal.TOOLBAR_POSITION, toolbarPosition));
	}

	protected void renderToolbars(List<String> renderedAttributes, Modal modal) throws IOException {
		java.lang.Object toolbars = modal.getToolbars();
		renderedAttributes.add(renderString(Modal.TOOLBARS, toolbars));
	}

	protected void renderVisible(List<String> renderedAttributes, Modal modal) throws IOException {
		java.lang.Boolean visible = modal.getVisible();
		renderedAttributes.add(renderBoolean(Modal.VISIBLE, visible));
	}

	protected void renderWidth(List<String> renderedAttributes, Modal modal) throws IOException {
		java.lang.Object width = modal.getWidth();
		renderedAttributes.add(renderString(Modal.WIDTH, width));
	}

	protected void renderX(List<String> renderedAttributes, Modal modal) throws IOException {
		java.lang.Object x = modal.getX();
		renderedAttributes.add(renderNumber(Modal.X, x));
	}

	protected void renderXy(List<String> renderedAttributes, Modal modal) throws IOException {
		java.lang.Object xy = modal.getXy();
		renderedAttributes.add(renderArray(Modal.XY, xy));
	}

	protected void renderY(List<String> renderedAttributes, Modal modal) throws IOException {
		java.lang.Object y = modal.getY();
		renderedAttributes.add(renderNumber(Modal.Y, y));
	}

	protected void renderZIndex(List<String> renderedAttributes, Modal modal) throws IOException {
		java.lang.Object zIndex = modal.getZIndex();
		renderedAttributes.add(renderNumber(Modal.Z_INDEX, zIndex));
	}

	protected void renderAfterAlignChange(List<String> renderedAttributes, Modal modal) throws IOException {
		java.lang.String afterAlignChange = modal.getAfterAlignChange();
		renderedAttributes.add(renderString(Modal.AFTER_ALIGN_CHANGE, afterAlignChange));
	}

	protected void renderAfterAlignOnChange(List<String> renderedAttributes, Modal modal) throws IOException {
		java.lang.String afterAlignOnChange = modal.getAfterAlignOnChange();
		renderedAttributes.add(renderString(Modal.AFTER_ALIGN_ON_CHANGE, afterAlignOnChange));
	}

	protected void renderAfterBodyContentChange(List<String> renderedAttributes, Modal modal) throws IOException {
		java.lang.String afterBodyContentChange = modal.getAfterBodyContentChange();
		renderedAttributes.add(renderString(Modal.AFTER_BODY_CONTENT_CHANGE, afterBodyContentChange));
	}

	protected void renderAfterBoundingBoxChange(List<String> renderedAttributes, Modal modal) throws IOException {
		java.lang.String afterBoundingBoxChange = modal.getAfterBoundingBoxChange();
		renderedAttributes.add(renderString(Modal.AFTER_BOUNDING_BOX_CHANGE, afterBoundingBoxChange));
	}

	protected void renderAfterCenteredChange(List<String> renderedAttributes, Modal modal) throws IOException {
		java.lang.String afterCenteredChange = modal.getAfterCenteredChange();
		renderedAttributes.add(renderString(Modal.AFTER_CENTERED_CHANGE, afterCenteredChange));
	}

	protected void renderAfterConstrainChange(List<String> renderedAttributes, Modal modal) throws IOException {
		java.lang.String afterConstrainChange = modal.getAfterConstrainChange();
		renderedAttributes.add(renderString(Modal.AFTER_CONSTRAIN_CHANGE, afterConstrainChange));
	}

	protected void renderAfterContentBoxChange(List<String> renderedAttributes, Modal modal) throws IOException {
		java.lang.String afterContentBoxChange = modal.getAfterContentBoxChange();
		renderedAttributes.add(renderString(Modal.AFTER_CONTENT_BOX_CHANGE, afterContentBoxChange));
	}

	protected void renderAfterDestroyOnHideChange(List<String> renderedAttributes, Modal modal) throws IOException {
		java.lang.String afterDestroyOnHideChange = modal.getAfterDestroyOnHideChange();
		renderedAttributes.add(renderString(Modal.AFTER_DESTROY_ON_HIDE_CHANGE, afterDestroyOnHideChange));
	}

	protected void renderAfterDestroyedChange(List<String> renderedAttributes, Modal modal) throws IOException {
		java.lang.String afterDestroyedChange = modal.getAfterDestroyedChange();
		renderedAttributes.add(renderString(Modal.AFTER_DESTROYED_CHANGE, afterDestroyedChange));
	}

	protected void renderAfterDisabledChange(List<String> renderedAttributes, Modal modal) throws IOException {
		java.lang.String afterDisabledChange = modal.getAfterDisabledChange();
		renderedAttributes.add(renderString(Modal.AFTER_DISABLED_CHANGE, afterDisabledChange));
	}

	protected void renderAfterDraggableChange(List<String> renderedAttributes, Modal modal) throws IOException {
		java.lang.String afterDraggableChange = modal.getAfterDraggableChange();
		renderedAttributes.add(renderString(Modal.AFTER_DRAGGABLE_CHANGE, afterDraggableChange));
	}

	protected void renderAfterFillHeightChange(List<String> renderedAttributes, Modal modal) throws IOException {
		java.lang.String afterFillHeightChange = modal.getAfterFillHeightChange();
		renderedAttributes.add(renderString(Modal.AFTER_FILL_HEIGHT_CHANGE, afterFillHeightChange));
	}

	protected void renderAfterFocusOnChange(List<String> renderedAttributes, Modal modal) throws IOException {
		java.lang.String afterFocusOnChange = modal.getAfterFocusOnChange();
		renderedAttributes.add(renderString(Modal.AFTER_FOCUS_ON_CHANGE, afterFocusOnChange));
	}

	protected void renderAfterFocusedChange(List<String> renderedAttributes, Modal modal) throws IOException {
		java.lang.String afterFocusedChange = modal.getAfterFocusedChange();
		renderedAttributes.add(renderString(Modal.AFTER_FOCUSED_CHANGE, afterFocusedChange));
	}

	protected void renderAfterFooterContentChange(List<String> renderedAttributes, Modal modal) throws IOException {
		java.lang.String afterFooterContentChange = modal.getAfterFooterContentChange();
		renderedAttributes.add(renderString(Modal.AFTER_FOOTER_CONTENT_CHANGE, afterFooterContentChange));
	}

	protected void renderAfterHeaderContentChange(List<String> renderedAttributes, Modal modal) throws IOException {
		java.lang.String afterHeaderContentChange = modal.getAfterHeaderContentChange();
		renderedAttributes.add(renderString(Modal.AFTER_HEADER_CONTENT_CHANGE, afterHeaderContentChange));
	}

	protected void renderAfterHeightChange(List<String> renderedAttributes, Modal modal) throws IOException {
		java.lang.String afterHeightChange = modal.getAfterHeightChange();
		renderedAttributes.add(renderString(Modal.AFTER_HEIGHT_CHANGE, afterHeightChange));
	}

	protected void renderAfterHideOnChange(List<String> renderedAttributes, Modal modal) throws IOException {
		java.lang.String afterHideOnChange = modal.getAfterHideOnChange();
		renderedAttributes.add(renderString(Modal.AFTER_HIDE_ON_CHANGE, afterHideOnChange));
	}

	protected void renderAfterIdChange(List<String> renderedAttributes, Modal modal) throws IOException {
		java.lang.String afterIdChange = modal.getAfterIdChange();
		renderedAttributes.add(renderString(Modal.AFTER_ID_CHANGE, afterIdChange));
	}

	protected void renderAfterInitializedChange(List<String> renderedAttributes, Modal modal) throws IOException {
		java.lang.String afterInitializedChange = modal.getAfterInitializedChange();
		renderedAttributes.add(renderString(Modal.AFTER_INITIALIZED_CHANGE, afterInitializedChange));
	}

	protected void renderAfterLocaleChange(List<String> renderedAttributes, Modal modal) throws IOException {
		java.lang.String afterLocaleChange = modal.getAfterLocaleChange();
		renderedAttributes.add(renderString(Modal.AFTER_LOCALE_CHANGE, afterLocaleChange));
	}

	protected void renderAfterMaskNodeChange(List<String> renderedAttributes, Modal modal) throws IOException {
		java.lang.String afterMaskNodeChange = modal.getAfterMaskNodeChange();
		renderedAttributes.add(renderString(Modal.AFTER_MASK_NODE_CHANGE, afterMaskNodeChange));
	}

	protected void renderAfterModalChange(List<String> renderedAttributes, Modal modal) throws IOException {
		java.lang.String afterModalChange = modal.getAfterModalChange();
		renderedAttributes.add(renderString(Modal.AFTER_MODAL_CHANGE, afterModalChange));
	}

	protected void renderAfterPreventOverlapChange(List<String> renderedAttributes, Modal modal) throws IOException {
		java.lang.String afterPreventOverlapChange = modal.getAfterPreventOverlapChange();
		renderedAttributes.add(renderString(Modal.AFTER_PREVENT_OVERLAP_CHANGE, afterPreventOverlapChange));
	}

	protected void renderAfterRenderChange(List<String> renderedAttributes, Modal modal) throws IOException {
		java.lang.String afterRenderChange = modal.getAfterRenderChange();
		renderedAttributes.add(renderString(Modal.AFTER_RENDER_CHANGE, afterRenderChange));
	}

	protected void renderAfterRenderedChange(List<String> renderedAttributes, Modal modal) throws IOException {
		java.lang.String afterRenderedChange = modal.getAfterRenderedChange();
		renderedAttributes.add(renderString(Modal.AFTER_RENDERED_CHANGE, afterRenderedChange));
	}

	protected void renderAfterResizableChange(List<String> renderedAttributes, Modal modal) throws IOException {
		java.lang.String afterResizableChange = modal.getAfterResizableChange();
		renderedAttributes.add(renderString(Modal.AFTER_RESIZABLE_CHANGE, afterResizableChange));
	}

	protected void renderAfterShimChange(List<String> renderedAttributes, Modal modal) throws IOException {
		java.lang.String afterShimChange = modal.getAfterShimChange();
		renderedAttributes.add(renderString(Modal.AFTER_SHIM_CHANGE, afterShimChange));
	}

	protected void renderAfterSrcNodeChange(List<String> renderedAttributes, Modal modal) throws IOException {
		java.lang.String afterSrcNodeChange = modal.getAfterSrcNodeChange();
		renderedAttributes.add(renderString(Modal.AFTER_SRC_NODE_CHANGE, afterSrcNodeChange));
	}

	protected void renderAfterStringsChange(List<String> renderedAttributes, Modal modal) throws IOException {
		java.lang.String afterStringsChange = modal.getAfterStringsChange();
		renderedAttributes.add(renderString(Modal.AFTER_STRINGS_CHANGE, afterStringsChange));
	}

	protected void renderAfterTabIndexChange(List<String> renderedAttributes, Modal modal) throws IOException {
		java.lang.String afterTabIndexChange = modal.getAfterTabIndexChange();
		renderedAttributes.add(renderString(Modal.AFTER_TAB_INDEX_CHANGE, afterTabIndexChange));
	}

	protected void renderAfterToolbarPositionChange(List<String> renderedAttributes, Modal modal) throws IOException {
		java.lang.String afterToolbarPositionChange = modal.getAfterToolbarPositionChange();
		renderedAttributes.add(renderString(Modal.AFTER_TOOLBAR_POSITION_CHANGE, afterToolbarPositionChange));
	}

	protected void renderAfterToolbarsChange(List<String> renderedAttributes, Modal modal) throws IOException {
		java.lang.String afterToolbarsChange = modal.getAfterToolbarsChange();
		renderedAttributes.add(renderString(Modal.AFTER_TOOLBARS_CHANGE, afterToolbarsChange));
	}

	protected void renderAfterVisibleChange(List<String> renderedAttributes, Modal modal) throws IOException {
		java.lang.String afterVisibleChange = modal.getAfterVisibleChange();
		renderedAttributes.add(renderString(Modal.AFTER_VISIBLE_CHANGE, afterVisibleChange));
	}

	protected void renderAfterWidthChange(List<String> renderedAttributes, Modal modal) throws IOException {
		java.lang.String afterWidthChange = modal.getAfterWidthChange();
		renderedAttributes.add(renderString(Modal.AFTER_WIDTH_CHANGE, afterWidthChange));
	}

	protected void renderAfterXChange(List<String> renderedAttributes, Modal modal) throws IOException {
		java.lang.String afterXChange = modal.getAfterXChange();
		renderedAttributes.add(renderString(Modal.AFTER_XCHANGE, afterXChange));
	}

	protected void renderAfterXyChange(List<String> renderedAttributes, Modal modal) throws IOException {
		java.lang.String afterXyChange = modal.getAfterXyChange();
		renderedAttributes.add(renderString(Modal.AFTER_XY_CHANGE, afterXyChange));
	}

	protected void renderAfterYChange(List<String> renderedAttributes, Modal modal) throws IOException {
		java.lang.String afterYChange = modal.getAfterYChange();
		renderedAttributes.add(renderString(Modal.AFTER_YCHANGE, afterYChange));
	}

	protected void renderAfterZIndexChange(List<String> renderedAttributes, Modal modal) throws IOException {
		java.lang.String afterZIndexChange = modal.getAfterZIndexChange();
		renderedAttributes.add(renderString(Modal.AFTER_ZINDEX_CHANGE, afterZIndexChange));
	}

	protected void renderOnAlignChange(List<String> renderedAttributes, Modal modal) throws IOException {
		java.lang.String onAlignChange = modal.getOnAlignChange();
		renderedAttributes.add(renderString(Modal.ON_ALIGN_CHANGE, onAlignChange));
	}

	protected void renderOnAlignOnChange(List<String> renderedAttributes, Modal modal) throws IOException {
		java.lang.String onAlignOnChange = modal.getOnAlignOnChange();
		renderedAttributes.add(renderString(Modal.ON_ALIGN_ON_CHANGE, onAlignOnChange));
	}

	protected void renderOnBodyContentChange(List<String> renderedAttributes, Modal modal) throws IOException {
		java.lang.String onBodyContentChange = modal.getOnBodyContentChange();
		renderedAttributes.add(renderString(Modal.ON_BODY_CONTENT_CHANGE, onBodyContentChange));
	}

	protected void renderOnBoundingBoxChange(List<String> renderedAttributes, Modal modal) throws IOException {
		java.lang.String onBoundingBoxChange = modal.getOnBoundingBoxChange();
		renderedAttributes.add(renderString(Modal.ON_BOUNDING_BOX_CHANGE, onBoundingBoxChange));
	}

	protected void renderOnCenteredChange(List<String> renderedAttributes, Modal modal) throws IOException {
		java.lang.String onCenteredChange = modal.getOnCenteredChange();
		renderedAttributes.add(renderString(Modal.ON_CENTERED_CHANGE, onCenteredChange));
	}

	protected void renderOnConstrainChange(List<String> renderedAttributes, Modal modal) throws IOException {
		java.lang.String onConstrainChange = modal.getOnConstrainChange();
		renderedAttributes.add(renderString(Modal.ON_CONSTRAIN_CHANGE, onConstrainChange));
	}

	protected void renderOnContentBoxChange(List<String> renderedAttributes, Modal modal) throws IOException {
		java.lang.String onContentBoxChange = modal.getOnContentBoxChange();
		renderedAttributes.add(renderString(Modal.ON_CONTENT_BOX_CHANGE, onContentBoxChange));
	}

	protected void renderOnDestroyOnHideChange(List<String> renderedAttributes, Modal modal) throws IOException {
		java.lang.String onDestroyOnHideChange = modal.getOnDestroyOnHideChange();
		renderedAttributes.add(renderString(Modal.ON_DESTROY_ON_HIDE_CHANGE, onDestroyOnHideChange));
	}

	protected void renderOnDestroyedChange(List<String> renderedAttributes, Modal modal) throws IOException {
		java.lang.String onDestroyedChange = modal.getOnDestroyedChange();
		renderedAttributes.add(renderString(Modal.ON_DESTROYED_CHANGE, onDestroyedChange));
	}

	protected void renderOnDisabledChange(List<String> renderedAttributes, Modal modal) throws IOException {
		java.lang.String onDisabledChange = modal.getOnDisabledChange();
		renderedAttributes.add(renderString(Modal.ON_DISABLED_CHANGE, onDisabledChange));
	}

	protected void renderOnDraggableChange(List<String> renderedAttributes, Modal modal) throws IOException {
		java.lang.String onDraggableChange = modal.getOnDraggableChange();
		renderedAttributes.add(renderString(Modal.ON_DRAGGABLE_CHANGE, onDraggableChange));
	}

	protected void renderOnFillHeightChange(List<String> renderedAttributes, Modal modal) throws IOException {
		java.lang.String onFillHeightChange = modal.getOnFillHeightChange();
		renderedAttributes.add(renderString(Modal.ON_FILL_HEIGHT_CHANGE, onFillHeightChange));
	}

	protected void renderOnFocusOnChange(List<String> renderedAttributes, Modal modal) throws IOException {
		java.lang.String onFocusOnChange = modal.getOnFocusOnChange();
		renderedAttributes.add(renderString(Modal.ON_FOCUS_ON_CHANGE, onFocusOnChange));
	}

	protected void renderOnFocusedChange(List<String> renderedAttributes, Modal modal) throws IOException {
		java.lang.String onFocusedChange = modal.getOnFocusedChange();
		renderedAttributes.add(renderString(Modal.ON_FOCUSED_CHANGE, onFocusedChange));
	}

	protected void renderOnFooterContentChange(List<String> renderedAttributes, Modal modal) throws IOException {
		java.lang.String onFooterContentChange = modal.getOnFooterContentChange();
		renderedAttributes.add(renderString(Modal.ON_FOOTER_CONTENT_CHANGE, onFooterContentChange));
	}

	protected void renderOnHeaderContentChange(List<String> renderedAttributes, Modal modal) throws IOException {
		java.lang.String onHeaderContentChange = modal.getOnHeaderContentChange();
		renderedAttributes.add(renderString(Modal.ON_HEADER_CONTENT_CHANGE, onHeaderContentChange));
	}

	protected void renderOnHeightChange(List<String> renderedAttributes, Modal modal) throws IOException {
		java.lang.String onHeightChange = modal.getOnHeightChange();
		renderedAttributes.add(renderString(Modal.ON_HEIGHT_CHANGE, onHeightChange));
	}

	protected void renderOnHideOnChange(List<String> renderedAttributes, Modal modal) throws IOException {
		java.lang.String onHideOnChange = modal.getOnHideOnChange();
		renderedAttributes.add(renderString(Modal.ON_HIDE_ON_CHANGE, onHideOnChange));
	}

	protected void renderOnIdChange(List<String> renderedAttributes, Modal modal) throws IOException {
		java.lang.String onIdChange = modal.getOnIdChange();
		renderedAttributes.add(renderString(Modal.ON_ID_CHANGE, onIdChange));
	}

	protected void renderOnInitializedChange(List<String> renderedAttributes, Modal modal) throws IOException {
		java.lang.String onInitializedChange = modal.getOnInitializedChange();
		renderedAttributes.add(renderString(Modal.ON_INITIALIZED_CHANGE, onInitializedChange));
	}

	protected void renderOnLocaleChange(List<String> renderedAttributes, Modal modal) throws IOException {
		java.lang.String onLocaleChange = modal.getOnLocaleChange();
		renderedAttributes.add(renderString(Modal.ON_LOCALE_CHANGE, onLocaleChange));
	}

	protected void renderOnMaskNodeChange(List<String> renderedAttributes, Modal modal) throws IOException {
		java.lang.String onMaskNodeChange = modal.getOnMaskNodeChange();
		renderedAttributes.add(renderString(Modal.ON_MASK_NODE_CHANGE, onMaskNodeChange));
	}

	protected void renderOnModalChange(List<String> renderedAttributes, Modal modal) throws IOException {
		java.lang.String onModalChange = modal.getOnModalChange();
		renderedAttributes.add(renderString(Modal.ON_MODAL_CHANGE, onModalChange));
	}

	protected void renderOnPreventOverlapChange(List<String> renderedAttributes, Modal modal) throws IOException {
		java.lang.String onPreventOverlapChange = modal.getOnPreventOverlapChange();
		renderedAttributes.add(renderString(Modal.ON_PREVENT_OVERLAP_CHANGE, onPreventOverlapChange));
	}

	protected void renderOnRenderChange(List<String> renderedAttributes, Modal modal) throws IOException {
		java.lang.String onRenderChange = modal.getOnRenderChange();
		renderedAttributes.add(renderString(Modal.ON_RENDER_CHANGE, onRenderChange));
	}

	protected void renderOnRenderedChange(List<String> renderedAttributes, Modal modal) throws IOException {
		java.lang.String onRenderedChange = modal.getOnRenderedChange();
		renderedAttributes.add(renderString(Modal.ON_RENDERED_CHANGE, onRenderedChange));
	}

	protected void renderOnResizableChange(List<String> renderedAttributes, Modal modal) throws IOException {
		java.lang.String onResizableChange = modal.getOnResizableChange();
		renderedAttributes.add(renderString(Modal.ON_RESIZABLE_CHANGE, onResizableChange));
	}

	protected void renderOnShimChange(List<String> renderedAttributes, Modal modal) throws IOException {
		java.lang.String onShimChange = modal.getOnShimChange();
		renderedAttributes.add(renderString(Modal.ON_SHIM_CHANGE, onShimChange));
	}

	protected void renderOnSrcNodeChange(List<String> renderedAttributes, Modal modal) throws IOException {
		java.lang.String onSrcNodeChange = modal.getOnSrcNodeChange();
		renderedAttributes.add(renderString(Modal.ON_SRC_NODE_CHANGE, onSrcNodeChange));
	}

	protected void renderOnStringsChange(List<String> renderedAttributes, Modal modal) throws IOException {
		java.lang.String onStringsChange = modal.getOnStringsChange();
		renderedAttributes.add(renderString(Modal.ON_STRINGS_CHANGE, onStringsChange));
	}

	protected void renderOnTabIndexChange(List<String> renderedAttributes, Modal modal) throws IOException {
		java.lang.String onTabIndexChange = modal.getOnTabIndexChange();
		renderedAttributes.add(renderString(Modal.ON_TAB_INDEX_CHANGE, onTabIndexChange));
	}

	protected void renderOnToolbarPositionChange(List<String> renderedAttributes, Modal modal) throws IOException {
		java.lang.String onToolbarPositionChange = modal.getOnToolbarPositionChange();
		renderedAttributes.add(renderString(Modal.ON_TOOLBAR_POSITION_CHANGE, onToolbarPositionChange));
	}

	protected void renderOnToolbarsChange(List<String> renderedAttributes, Modal modal) throws IOException {
		java.lang.String onToolbarsChange = modal.getOnToolbarsChange();
		renderedAttributes.add(renderString(Modal.ON_TOOLBARS_CHANGE, onToolbarsChange));
	}

	protected void renderOnVisibleChange(List<String> renderedAttributes, Modal modal) throws IOException {
		java.lang.String onVisibleChange = modal.getOnVisibleChange();
		renderedAttributes.add(renderString(Modal.ON_VISIBLE_CHANGE, onVisibleChange));
	}

	protected void renderOnWidthChange(List<String> renderedAttributes, Modal modal) throws IOException {
		java.lang.String onWidthChange = modal.getOnWidthChange();
		renderedAttributes.add(renderString(Modal.ON_WIDTH_CHANGE, onWidthChange));
	}

	protected void renderOnXChange(List<String> renderedAttributes, Modal modal) throws IOException {
		java.lang.String onXChange = modal.getOnXChange();
		renderedAttributes.add(renderString(Modal.ON_XCHANGE, onXChange));
	}

	protected void renderOnXyChange(List<String> renderedAttributes, Modal modal) throws IOException {
		java.lang.String onXyChange = modal.getOnXyChange();
		renderedAttributes.add(renderString(Modal.ON_XY_CHANGE, onXyChange));
	}

	protected void renderOnYChange(List<String> renderedAttributes, Modal modal) throws IOException {
		java.lang.String onYChange = modal.getOnYChange();
		renderedAttributes.add(renderString(Modal.ON_YCHANGE, onYChange));
	}

	protected void renderOnZIndexChange(List<String> renderedAttributes, Modal modal) throws IOException {
		java.lang.String onZIndexChange = modal.getOnZIndexChange();
		renderedAttributes.add(renderString(Modal.ON_ZINDEX_CHANGE, onZIndexChange));
	}

}
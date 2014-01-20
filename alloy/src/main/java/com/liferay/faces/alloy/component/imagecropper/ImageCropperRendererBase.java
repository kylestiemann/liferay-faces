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
package com.liferay.faces.alloy.component.imagecropper;

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
public abstract class ImageCropperRendererBase extends RendererBase {

	// Private Constants
	private static final String AUI_MODULE_NAME = "aui-image-cropper";

	protected void encodeJavaScriptMain(FacesContext facesContext, UIComponent uiComponent) throws IOException {

		ImageCropper imageCropper = (ImageCropper) uiComponent;

		ResponseWriter responseWriter = facesContext.getResponseWriter();

		responseWriter.write("var imageCropper = new A.ImageCropper");
		responseWriter.write(StringPool.OPEN_PARENTHESIS);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedAttributes = new ArrayList<String>();

		renderBoundingBox(renderedAttributes, imageCropper);
		renderContentBox(renderedAttributes, imageCropper);
		renderCropHeight(renderedAttributes, imageCropper);
		renderCropWidth(renderedAttributes, imageCropper);
		renderCssClass(renderedAttributes, imageCropper);
		renderDestroyed(renderedAttributes, imageCropper);
		renderDisabled(renderedAttributes, imageCropper);
		renderFocused(renderedAttributes, imageCropper);
		renderHeight(renderedAttributes, imageCropper);
		renderHideClass(renderedAttributes, imageCropper);
		renderImageCropperId(renderedAttributes, imageCropper);
		renderInitialized(renderedAttributes, imageCropper);
		renderImageCropperLocale(renderedAttributes, imageCropper);
		renderMinHeight(renderedAttributes, imageCropper);
		renderMinWidth(renderedAttributes, imageCropper);
		renderMovable(renderedAttributes, imageCropper);
		renderPreserveRatio(renderedAttributes, imageCropper);
		renderRegion(renderedAttributes, imageCropper);
		renderRender(renderedAttributes, imageCropper);
		renderRendered(renderedAttributes, imageCropper);
		renderResizable(renderedAttributes, imageCropper);
		renderSrcNode(renderedAttributes, imageCropper);
		renderStrings(renderedAttributes, imageCropper);
		renderTabIndex(renderedAttributes, imageCropper);
		renderUseARIA(renderedAttributes, imageCropper);
		renderVisible(renderedAttributes, imageCropper);
		renderWidth(renderedAttributes, imageCropper);
		renderX(renderedAttributes, imageCropper);
		renderY(renderedAttributes, imageCropper);

		for (String renderedAttribute : renderedAttributes) {
			responseWriter.write(renderedAttribute);
			responseWriter.write(StringPool.COMMA);
		}

		responseWriter.write("after");
		responseWriter.write(StringPool.COLON);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedAfterEvents = new ArrayList<String>();

		renderAfterBoundingBoxChange(renderedAfterEvents, imageCropper);
		renderAfterContentBoxChange(renderedAfterEvents, imageCropper);
		renderAfterCropHeightChange(renderedAfterEvents, imageCropper);
		renderAfterCropWidthChange(renderedAfterEvents, imageCropper);
		renderAfterCssClassChange(renderedAfterEvents, imageCropper);
		renderAfterDestroyedChange(renderedAfterEvents, imageCropper);
		renderAfterDisabledChange(renderedAfterEvents, imageCropper);
		renderAfterFocusedChange(renderedAfterEvents, imageCropper);
		renderAfterHeightChange(renderedAfterEvents, imageCropper);
		renderAfterHideClassChange(renderedAfterEvents, imageCropper);
		renderAfterIdChange(renderedAfterEvents, imageCropper);
		renderAfterInitializedChange(renderedAfterEvents, imageCropper);
		renderAfterLocaleChange(renderedAfterEvents, imageCropper);
		renderAfterMinHeightChange(renderedAfterEvents, imageCropper);
		renderAfterMinWidthChange(renderedAfterEvents, imageCropper);
		renderAfterMovableChange(renderedAfterEvents, imageCropper);
		renderAfterPreserveRatioChange(renderedAfterEvents, imageCropper);
		renderAfterRegionChange(renderedAfterEvents, imageCropper);
		renderAfterRenderChange(renderedAfterEvents, imageCropper);
		renderAfterRenderedChange(renderedAfterEvents, imageCropper);
		renderAfterResizableChange(renderedAfterEvents, imageCropper);
		renderAfterSrcNodeChange(renderedAfterEvents, imageCropper);
		renderAfterStringsChange(renderedAfterEvents, imageCropper);
		renderAfterTabIndexChange(renderedAfterEvents, imageCropper);
		renderAfterUseARIAChange(renderedAfterEvents, imageCropper);
		renderAfterVisibleChange(renderedAfterEvents, imageCropper);
		renderAfterWidthChange(renderedAfterEvents, imageCropper);
		renderAfterXChange(renderedAfterEvents, imageCropper);
		renderAfterYChange(renderedAfterEvents, imageCropper);

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

		renderOnBoundingBoxChange(renderedOnEvents, imageCropper);
		renderOnContentBoxChange(renderedOnEvents, imageCropper);
		renderOnCropHeightChange(renderedOnEvents, imageCropper);
		renderOnCropWidthChange(renderedOnEvents, imageCropper);
		renderOnCssClassChange(renderedOnEvents, imageCropper);
		renderOnDestroyedChange(renderedOnEvents, imageCropper);
		renderOnDisabledChange(renderedOnEvents, imageCropper);
		renderOnFocusedChange(renderedOnEvents, imageCropper);
		renderOnHeightChange(renderedOnEvents, imageCropper);
		renderOnHideClassChange(renderedOnEvents, imageCropper);
		renderOnIdChange(renderedOnEvents, imageCropper);
		renderOnInitializedChange(renderedOnEvents, imageCropper);
		renderOnLocaleChange(renderedOnEvents, imageCropper);
		renderOnMinHeightChange(renderedOnEvents, imageCropper);
		renderOnMinWidthChange(renderedOnEvents, imageCropper);
		renderOnMovableChange(renderedOnEvents, imageCropper);
		renderOnPreserveRatioChange(renderedOnEvents, imageCropper);
		renderOnRegionChange(renderedOnEvents, imageCropper);
		renderOnRenderChange(renderedOnEvents, imageCropper);
		renderOnRenderedChange(renderedOnEvents, imageCropper);
		renderOnResizableChange(renderedOnEvents, imageCropper);
		renderOnSrcNodeChange(renderedOnEvents, imageCropper);
		renderOnStringsChange(renderedOnEvents, imageCropper);
		renderOnTabIndexChange(renderedOnEvents, imageCropper);
		renderOnUseARIAChange(renderedOnEvents, imageCropper);
		renderOnVisibleChange(renderedOnEvents, imageCropper);
		renderOnWidthChange(renderedOnEvents, imageCropper);
		renderOnXChange(renderedOnEvents, imageCropper);
		renderOnYChange(renderedOnEvents, imageCropper);

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

	protected void renderBoundingBox(List<String> renderedAttributes, ImageCropper imageCropper) throws IOException {
		java.lang.String boundingBox = imageCropper.getBoundingBox();

		if (boundingBox != null) {
			renderedAttributes.add(renderString(ImageCropper.BOUNDING_BOX, boundingBox));
		}
	}

	protected void renderContentBox(List<String> renderedAttributes, ImageCropper imageCropper) throws IOException {
		java.lang.String contentBox = imageCropper.getContentBox();

		if (contentBox != null) {
			renderedAttributes.add(renderString(ImageCropper.CONTENT_BOX, contentBox));
		}
	}

	protected void renderCropHeight(List<String> renderedAttributes, ImageCropper imageCropper) throws IOException {
		java.lang.Object cropHeight = imageCropper.getCropHeight();

		if (cropHeight != null) {
			renderedAttributes.add(renderNumber(ImageCropper.CROP_HEIGHT, cropHeight));
		}
	}

	protected void renderCropWidth(List<String> renderedAttributes, ImageCropper imageCropper) throws IOException {
		java.lang.Object cropWidth = imageCropper.getCropWidth();

		if (cropWidth != null) {
			renderedAttributes.add(renderNumber(ImageCropper.CROP_WIDTH, cropWidth));
		}
	}

	protected void renderCssClass(List<String> renderedAttributes, ImageCropper imageCropper) throws IOException {
		java.lang.String cssClass = imageCropper.getCssClass();

		if (cssClass != null) {
			renderedAttributes.add(renderString(ImageCropper.CSS_CLASS, cssClass));
		}
	}

	protected void renderDestroyed(List<String> renderedAttributes, ImageCropper imageCropper) throws IOException {
		java.lang.Boolean destroyed = imageCropper.getDestroyed();

		if (destroyed != null) {
			renderedAttributes.add(renderBoolean(ImageCropper.DESTROYED, destroyed));
		}
	}

	protected void renderDisabled(List<String> renderedAttributes, ImageCropper imageCropper) throws IOException {
		java.lang.Boolean disabled = imageCropper.getDisabled();

		if (disabled != null) {
			renderedAttributes.add(renderBoolean(ImageCropper.DISABLED, disabled));
		}
	}

	protected void renderFocused(List<String> renderedAttributes, ImageCropper imageCropper) throws IOException {
		java.lang.Boolean focused = imageCropper.getFocused();

		if (focused != null) {
			renderedAttributes.add(renderBoolean(ImageCropper.FOCUSED, focused));
		}
	}

	protected void renderHeight(List<String> renderedAttributes, ImageCropper imageCropper) throws IOException {
		java.lang.Object height = imageCropper.getHeight();

		if (height != null) {
			renderedAttributes.add(renderString(ImageCropper.HEIGHT, height));
		}
	}

	protected void renderHideClass(List<String> renderedAttributes, ImageCropper imageCropper) throws IOException {
		java.lang.String hideClass = imageCropper.getHideClass();

		if (hideClass != null) {
			renderedAttributes.add(renderString(ImageCropper.HIDE_CLASS, hideClass));
		}
	}

	protected void renderImageCropperId(List<String> renderedAttributes, ImageCropper imageCropper) throws IOException {
		java.lang.String imageCropperId = imageCropper.getImageCropperId();

		if (imageCropperId != null) {
			renderedAttributes.add(renderString(ImageCropper.IMAGE_CROPPER_ID, imageCropperId));
		}
	}

	protected void renderInitialized(List<String> renderedAttributes, ImageCropper imageCropper) throws IOException {
		java.lang.Boolean initialized = imageCropper.getInitialized();

		if (initialized != null) {
			renderedAttributes.add(renderBoolean(ImageCropper.INITIALIZED, initialized));
		}
	}

	protected void renderImageCropperLocale(List<String> renderedAttributes, ImageCropper imageCropper) throws IOException {
		java.lang.String imageCropperLocale = imageCropper.getImageCropperLocale();

		if (imageCropperLocale != null) {
			renderedAttributes.add(renderString(ImageCropper.IMAGE_CROPPER_LOCALE, imageCropperLocale));
		}
	}

	protected void renderMinHeight(List<String> renderedAttributes, ImageCropper imageCropper) throws IOException {
		java.lang.Object minHeight = imageCropper.getMinHeight();

		if (minHeight != null) {
			renderedAttributes.add(renderNumber(ImageCropper.MIN_HEIGHT, minHeight));
		}
	}

	protected void renderMinWidth(List<String> renderedAttributes, ImageCropper imageCropper) throws IOException {
		java.lang.Object minWidth = imageCropper.getMinWidth();

		if (minWidth != null) {
			renderedAttributes.add(renderNumber(ImageCropper.MIN_WIDTH, minWidth));
		}
	}

	protected void renderMovable(List<String> renderedAttributes, ImageCropper imageCropper) throws IOException {
		java.lang.Boolean movable = imageCropper.getMovable();

		if (movable != null) {
			renderedAttributes.add(renderBoolean(ImageCropper.MOVABLE, movable));
		}
	}

	protected void renderPreserveRatio(List<String> renderedAttributes, ImageCropper imageCropper) throws IOException {
		java.lang.Boolean preserveRatio = imageCropper.getPreserveRatio();

		if (preserveRatio != null) {
			renderedAttributes.add(renderBoolean(ImageCropper.PRESERVE_RATIO, preserveRatio));
		}
	}

	protected void renderRegion(List<String> renderedAttributes, ImageCropper imageCropper) throws IOException {
		java.lang.Object region = imageCropper.getRegion();

		if (region != null) {
			renderedAttributes.add(renderObject(ImageCropper.REGION, region));
		}
	}

	protected void renderRender(List<String> renderedAttributes, ImageCropper imageCropper) throws IOException {
		java.lang.Object render = imageCropper.getRender();

		if (render != null) {
			renderedAttributes.add(renderString(ImageCropper.RENDER, render));
		}
	}

	protected void renderRendered(List<String> renderedAttributes, ImageCropper imageCropper) throws IOException {
		java.lang.Boolean rendered = imageCropper.getRendered();

		if (rendered != null) {
			renderedAttributes.add(renderBoolean(ImageCropper.RENDERED, rendered));
		}
	}

	protected void renderResizable(List<String> renderedAttributes, ImageCropper imageCropper) throws IOException {
		java.lang.Boolean resizable = imageCropper.getResizable();

		if (resizable != null) {
			renderedAttributes.add(renderBoolean(ImageCropper.RESIZABLE, resizable));
		}
	}

	protected void renderSrcNode(List<String> renderedAttributes, ImageCropper imageCropper) throws IOException {
		java.lang.String srcNode = imageCropper.getSrcNode();

		if (srcNode != null) {
			renderedAttributes.add(renderString(ImageCropper.SRC_NODE, srcNode));
		}
	}

	protected void renderStrings(List<String> renderedAttributes, ImageCropper imageCropper) throws IOException {
		java.lang.Object strings = imageCropper.getStrings();

		if (strings != null) {
			renderedAttributes.add(renderObject(ImageCropper.STRINGS, strings));
		}
	}

	protected void renderTabIndex(List<String> renderedAttributes, ImageCropper imageCropper) throws IOException {
		java.lang.Object tabIndex = imageCropper.getTabIndex();

		if (tabIndex != null) {
			renderedAttributes.add(renderNumber(ImageCropper.TAB_INDEX, tabIndex));
		}
	}

	protected void renderUseARIA(List<String> renderedAttributes, ImageCropper imageCropper) throws IOException {
		java.lang.Boolean useARIA = imageCropper.getUseARIA();

		if (useARIA != null) {
			renderedAttributes.add(renderBoolean(ImageCropper.USE_ARIA, useARIA));
		}
	}

	protected void renderVisible(List<String> renderedAttributes, ImageCropper imageCropper) throws IOException {
		java.lang.Boolean visible = imageCropper.getVisible();

		if (visible != null) {
			renderedAttributes.add(renderBoolean(ImageCropper.VISIBLE, visible));
		}
	}

	protected void renderWidth(List<String> renderedAttributes, ImageCropper imageCropper) throws IOException {
		java.lang.Object width = imageCropper.getWidth();

		if (width != null) {
			renderedAttributes.add(renderString(ImageCropper.WIDTH, width));
		}
	}

	protected void renderX(List<String> renderedAttributes, ImageCropper imageCropper) throws IOException {
		java.lang.Object x = imageCropper.getX();

		if (x != null) {
			renderedAttributes.add(renderNumber(ImageCropper.X, x));
		}
	}

	protected void renderY(List<String> renderedAttributes, ImageCropper imageCropper) throws IOException {
		java.lang.Object y = imageCropper.getY();

		if (y != null) {
			renderedAttributes.add(renderNumber(ImageCropper.Y, y));
		}
	}

	protected void renderAfterBoundingBoxChange(List<String> renderedAttributes, ImageCropper imageCropper) throws IOException {
		java.lang.String afterBoundingBoxChange = imageCropper.getAfterBoundingBoxChange();

		if (afterBoundingBoxChange != null) {
			renderedAttributes.add(renderString(ImageCropper.AFTER_BOUNDING_BOX_CHANGE, afterBoundingBoxChange));
		}
	}

	protected void renderAfterContentBoxChange(List<String> renderedAttributes, ImageCropper imageCropper) throws IOException {
		java.lang.String afterContentBoxChange = imageCropper.getAfterContentBoxChange();

		if (afterContentBoxChange != null) {
			renderedAttributes.add(renderString(ImageCropper.AFTER_CONTENT_BOX_CHANGE, afterContentBoxChange));
		}
	}

	protected void renderAfterCropHeightChange(List<String> renderedAttributes, ImageCropper imageCropper) throws IOException {
		java.lang.String afterCropHeightChange = imageCropper.getAfterCropHeightChange();

		if (afterCropHeightChange != null) {
			renderedAttributes.add(renderString(ImageCropper.AFTER_CROP_HEIGHT_CHANGE, afterCropHeightChange));
		}
	}

	protected void renderAfterCropWidthChange(List<String> renderedAttributes, ImageCropper imageCropper) throws IOException {
		java.lang.String afterCropWidthChange = imageCropper.getAfterCropWidthChange();

		if (afterCropWidthChange != null) {
			renderedAttributes.add(renderString(ImageCropper.AFTER_CROP_WIDTH_CHANGE, afterCropWidthChange));
		}
	}

	protected void renderAfterCssClassChange(List<String> renderedAttributes, ImageCropper imageCropper) throws IOException {
		java.lang.String afterCssClassChange = imageCropper.getAfterCssClassChange();

		if (afterCssClassChange != null) {
			renderedAttributes.add(renderString(ImageCropper.AFTER_CSS_CLASS_CHANGE, afterCssClassChange));
		}
	}

	protected void renderAfterDestroyedChange(List<String> renderedAttributes, ImageCropper imageCropper) throws IOException {
		java.lang.String afterDestroyedChange = imageCropper.getAfterDestroyedChange();

		if (afterDestroyedChange != null) {
			renderedAttributes.add(renderString(ImageCropper.AFTER_DESTROYED_CHANGE, afterDestroyedChange));
		}
	}

	protected void renderAfterDisabledChange(List<String> renderedAttributes, ImageCropper imageCropper) throws IOException {
		java.lang.String afterDisabledChange = imageCropper.getAfterDisabledChange();

		if (afterDisabledChange != null) {
			renderedAttributes.add(renderString(ImageCropper.AFTER_DISABLED_CHANGE, afterDisabledChange));
		}
	}

	protected void renderAfterFocusedChange(List<String> renderedAttributes, ImageCropper imageCropper) throws IOException {
		java.lang.String afterFocusedChange = imageCropper.getAfterFocusedChange();

		if (afterFocusedChange != null) {
			renderedAttributes.add(renderString(ImageCropper.AFTER_FOCUSED_CHANGE, afterFocusedChange));
		}
	}

	protected void renderAfterHeightChange(List<String> renderedAttributes, ImageCropper imageCropper) throws IOException {
		java.lang.String afterHeightChange = imageCropper.getAfterHeightChange();

		if (afterHeightChange != null) {
			renderedAttributes.add(renderString(ImageCropper.AFTER_HEIGHT_CHANGE, afterHeightChange));
		}
	}

	protected void renderAfterHideClassChange(List<String> renderedAttributes, ImageCropper imageCropper) throws IOException {
		java.lang.String afterHideClassChange = imageCropper.getAfterHideClassChange();

		if (afterHideClassChange != null) {
			renderedAttributes.add(renderString(ImageCropper.AFTER_HIDE_CLASS_CHANGE, afterHideClassChange));
		}
	}

	protected void renderAfterIdChange(List<String> renderedAttributes, ImageCropper imageCropper) throws IOException {
		java.lang.String afterIdChange = imageCropper.getAfterIdChange();

		if (afterIdChange != null) {
			renderedAttributes.add(renderString(ImageCropper.AFTER_ID_CHANGE, afterIdChange));
		}
	}

	protected void renderAfterInitializedChange(List<String> renderedAttributes, ImageCropper imageCropper) throws IOException {
		java.lang.String afterInitializedChange = imageCropper.getAfterInitializedChange();

		if (afterInitializedChange != null) {
			renderedAttributes.add(renderString(ImageCropper.AFTER_INITIALIZED_CHANGE, afterInitializedChange));
		}
	}

	protected void renderAfterLocaleChange(List<String> renderedAttributes, ImageCropper imageCropper) throws IOException {
		java.lang.String afterLocaleChange = imageCropper.getAfterLocaleChange();

		if (afterLocaleChange != null) {
			renderedAttributes.add(renderString(ImageCropper.AFTER_LOCALE_CHANGE, afterLocaleChange));
		}
	}

	protected void renderAfterMinHeightChange(List<String> renderedAttributes, ImageCropper imageCropper) throws IOException {
		java.lang.String afterMinHeightChange = imageCropper.getAfterMinHeightChange();

		if (afterMinHeightChange != null) {
			renderedAttributes.add(renderString(ImageCropper.AFTER_MIN_HEIGHT_CHANGE, afterMinHeightChange));
		}
	}

	protected void renderAfterMinWidthChange(List<String> renderedAttributes, ImageCropper imageCropper) throws IOException {
		java.lang.String afterMinWidthChange = imageCropper.getAfterMinWidthChange();

		if (afterMinWidthChange != null) {
			renderedAttributes.add(renderString(ImageCropper.AFTER_MIN_WIDTH_CHANGE, afterMinWidthChange));
		}
	}

	protected void renderAfterMovableChange(List<String> renderedAttributes, ImageCropper imageCropper) throws IOException {
		java.lang.String afterMovableChange = imageCropper.getAfterMovableChange();

		if (afterMovableChange != null) {
			renderedAttributes.add(renderString(ImageCropper.AFTER_MOVABLE_CHANGE, afterMovableChange));
		}
	}

	protected void renderAfterPreserveRatioChange(List<String> renderedAttributes, ImageCropper imageCropper) throws IOException {
		java.lang.String afterPreserveRatioChange = imageCropper.getAfterPreserveRatioChange();

		if (afterPreserveRatioChange != null) {
			renderedAttributes.add(renderString(ImageCropper.AFTER_PRESERVE_RATIO_CHANGE, afterPreserveRatioChange));
		}
	}

	protected void renderAfterRegionChange(List<String> renderedAttributes, ImageCropper imageCropper) throws IOException {
		java.lang.String afterRegionChange = imageCropper.getAfterRegionChange();

		if (afterRegionChange != null) {
			renderedAttributes.add(renderString(ImageCropper.AFTER_REGION_CHANGE, afterRegionChange));
		}
	}

	protected void renderAfterRenderChange(List<String> renderedAttributes, ImageCropper imageCropper) throws IOException {
		java.lang.String afterRenderChange = imageCropper.getAfterRenderChange();

		if (afterRenderChange != null) {
			renderedAttributes.add(renderString(ImageCropper.AFTER_RENDER_CHANGE, afterRenderChange));
		}
	}

	protected void renderAfterRenderedChange(List<String> renderedAttributes, ImageCropper imageCropper) throws IOException {
		java.lang.String afterRenderedChange = imageCropper.getAfterRenderedChange();

		if (afterRenderedChange != null) {
			renderedAttributes.add(renderString(ImageCropper.AFTER_RENDERED_CHANGE, afterRenderedChange));
		}
	}

	protected void renderAfterResizableChange(List<String> renderedAttributes, ImageCropper imageCropper) throws IOException {
		java.lang.String afterResizableChange = imageCropper.getAfterResizableChange();

		if (afterResizableChange != null) {
			renderedAttributes.add(renderString(ImageCropper.AFTER_RESIZABLE_CHANGE, afterResizableChange));
		}
	}

	protected void renderAfterSrcNodeChange(List<String> renderedAttributes, ImageCropper imageCropper) throws IOException {
		java.lang.String afterSrcNodeChange = imageCropper.getAfterSrcNodeChange();

		if (afterSrcNodeChange != null) {
			renderedAttributes.add(renderString(ImageCropper.AFTER_SRC_NODE_CHANGE, afterSrcNodeChange));
		}
	}

	protected void renderAfterStringsChange(List<String> renderedAttributes, ImageCropper imageCropper) throws IOException {
		java.lang.String afterStringsChange = imageCropper.getAfterStringsChange();

		if (afterStringsChange != null) {
			renderedAttributes.add(renderString(ImageCropper.AFTER_STRINGS_CHANGE, afterStringsChange));
		}
	}

	protected void renderAfterTabIndexChange(List<String> renderedAttributes, ImageCropper imageCropper) throws IOException {
		java.lang.String afterTabIndexChange = imageCropper.getAfterTabIndexChange();

		if (afterTabIndexChange != null) {
			renderedAttributes.add(renderString(ImageCropper.AFTER_TAB_INDEX_CHANGE, afterTabIndexChange));
		}
	}

	protected void renderAfterUseARIAChange(List<String> renderedAttributes, ImageCropper imageCropper) throws IOException {
		java.lang.String afterUseARIAChange = imageCropper.getAfterUseARIAChange();

		if (afterUseARIAChange != null) {
			renderedAttributes.add(renderString(ImageCropper.AFTER_USE_ARIACHANGE, afterUseARIAChange));
		}
	}

	protected void renderAfterVisibleChange(List<String> renderedAttributes, ImageCropper imageCropper) throws IOException {
		java.lang.String afterVisibleChange = imageCropper.getAfterVisibleChange();

		if (afterVisibleChange != null) {
			renderedAttributes.add(renderString(ImageCropper.AFTER_VISIBLE_CHANGE, afterVisibleChange));
		}
	}

	protected void renderAfterWidthChange(List<String> renderedAttributes, ImageCropper imageCropper) throws IOException {
		java.lang.String afterWidthChange = imageCropper.getAfterWidthChange();

		if (afterWidthChange != null) {
			renderedAttributes.add(renderString(ImageCropper.AFTER_WIDTH_CHANGE, afterWidthChange));
		}
	}

	protected void renderAfterXChange(List<String> renderedAttributes, ImageCropper imageCropper) throws IOException {
		java.lang.String afterXChange = imageCropper.getAfterXChange();

		if (afterXChange != null) {
			renderedAttributes.add(renderString(ImageCropper.AFTER_XCHANGE, afterXChange));
		}
	}

	protected void renderAfterYChange(List<String> renderedAttributes, ImageCropper imageCropper) throws IOException {
		java.lang.String afterYChange = imageCropper.getAfterYChange();

		if (afterYChange != null) {
			renderedAttributes.add(renderString(ImageCropper.AFTER_YCHANGE, afterYChange));
		}
	}

	protected void renderOnBoundingBoxChange(List<String> renderedAttributes, ImageCropper imageCropper) throws IOException {
		java.lang.String onBoundingBoxChange = imageCropper.getOnBoundingBoxChange();

		if (onBoundingBoxChange != null) {
			renderedAttributes.add(renderString(ImageCropper.ON_BOUNDING_BOX_CHANGE, onBoundingBoxChange));
		}
	}

	protected void renderOnContentBoxChange(List<String> renderedAttributes, ImageCropper imageCropper) throws IOException {
		java.lang.String onContentBoxChange = imageCropper.getOnContentBoxChange();

		if (onContentBoxChange != null) {
			renderedAttributes.add(renderString(ImageCropper.ON_CONTENT_BOX_CHANGE, onContentBoxChange));
		}
	}

	protected void renderOnCropHeightChange(List<String> renderedAttributes, ImageCropper imageCropper) throws IOException {
		java.lang.String onCropHeightChange = imageCropper.getOnCropHeightChange();

		if (onCropHeightChange != null) {
			renderedAttributes.add(renderString(ImageCropper.ON_CROP_HEIGHT_CHANGE, onCropHeightChange));
		}
	}

	protected void renderOnCropWidthChange(List<String> renderedAttributes, ImageCropper imageCropper) throws IOException {
		java.lang.String onCropWidthChange = imageCropper.getOnCropWidthChange();

		if (onCropWidthChange != null) {
			renderedAttributes.add(renderString(ImageCropper.ON_CROP_WIDTH_CHANGE, onCropWidthChange));
		}
	}

	protected void renderOnCssClassChange(List<String> renderedAttributes, ImageCropper imageCropper) throws IOException {
		java.lang.String onCssClassChange = imageCropper.getOnCssClassChange();

		if (onCssClassChange != null) {
			renderedAttributes.add(renderString(ImageCropper.ON_CSS_CLASS_CHANGE, onCssClassChange));
		}
	}

	protected void renderOnDestroyedChange(List<String> renderedAttributes, ImageCropper imageCropper) throws IOException {
		java.lang.String onDestroyedChange = imageCropper.getOnDestroyedChange();

		if (onDestroyedChange != null) {
			renderedAttributes.add(renderString(ImageCropper.ON_DESTROYED_CHANGE, onDestroyedChange));
		}
	}

	protected void renderOnDisabledChange(List<String> renderedAttributes, ImageCropper imageCropper) throws IOException {
		java.lang.String onDisabledChange = imageCropper.getOnDisabledChange();

		if (onDisabledChange != null) {
			renderedAttributes.add(renderString(ImageCropper.ON_DISABLED_CHANGE, onDisabledChange));
		}
	}

	protected void renderOnFocusedChange(List<String> renderedAttributes, ImageCropper imageCropper) throws IOException {
		java.lang.String onFocusedChange = imageCropper.getOnFocusedChange();

		if (onFocusedChange != null) {
			renderedAttributes.add(renderString(ImageCropper.ON_FOCUSED_CHANGE, onFocusedChange));
		}
	}

	protected void renderOnHeightChange(List<String> renderedAttributes, ImageCropper imageCropper) throws IOException {
		java.lang.String onHeightChange = imageCropper.getOnHeightChange();

		if (onHeightChange != null) {
			renderedAttributes.add(renderString(ImageCropper.ON_HEIGHT_CHANGE, onHeightChange));
		}
	}

	protected void renderOnHideClassChange(List<String> renderedAttributes, ImageCropper imageCropper) throws IOException {
		java.lang.String onHideClassChange = imageCropper.getOnHideClassChange();

		if (onHideClassChange != null) {
			renderedAttributes.add(renderString(ImageCropper.ON_HIDE_CLASS_CHANGE, onHideClassChange));
		}
	}

	protected void renderOnIdChange(List<String> renderedAttributes, ImageCropper imageCropper) throws IOException {
		java.lang.String onIdChange = imageCropper.getOnIdChange();

		if (onIdChange != null) {
			renderedAttributes.add(renderString(ImageCropper.ON_ID_CHANGE, onIdChange));
		}
	}

	protected void renderOnInitializedChange(List<String> renderedAttributes, ImageCropper imageCropper) throws IOException {
		java.lang.String onInitializedChange = imageCropper.getOnInitializedChange();

		if (onInitializedChange != null) {
			renderedAttributes.add(renderString(ImageCropper.ON_INITIALIZED_CHANGE, onInitializedChange));
		}
	}

	protected void renderOnLocaleChange(List<String> renderedAttributes, ImageCropper imageCropper) throws IOException {
		java.lang.String onLocaleChange = imageCropper.getOnLocaleChange();

		if (onLocaleChange != null) {
			renderedAttributes.add(renderString(ImageCropper.ON_LOCALE_CHANGE, onLocaleChange));
		}
	}

	protected void renderOnMinHeightChange(List<String> renderedAttributes, ImageCropper imageCropper) throws IOException {
		java.lang.String onMinHeightChange = imageCropper.getOnMinHeightChange();

		if (onMinHeightChange != null) {
			renderedAttributes.add(renderString(ImageCropper.ON_MIN_HEIGHT_CHANGE, onMinHeightChange));
		}
	}

	protected void renderOnMinWidthChange(List<String> renderedAttributes, ImageCropper imageCropper) throws IOException {
		java.lang.String onMinWidthChange = imageCropper.getOnMinWidthChange();

		if (onMinWidthChange != null) {
			renderedAttributes.add(renderString(ImageCropper.ON_MIN_WIDTH_CHANGE, onMinWidthChange));
		}
	}

	protected void renderOnMovableChange(List<String> renderedAttributes, ImageCropper imageCropper) throws IOException {
		java.lang.String onMovableChange = imageCropper.getOnMovableChange();

		if (onMovableChange != null) {
			renderedAttributes.add(renderString(ImageCropper.ON_MOVABLE_CHANGE, onMovableChange));
		}
	}

	protected void renderOnPreserveRatioChange(List<String> renderedAttributes, ImageCropper imageCropper) throws IOException {
		java.lang.String onPreserveRatioChange = imageCropper.getOnPreserveRatioChange();

		if (onPreserveRatioChange != null) {
			renderedAttributes.add(renderString(ImageCropper.ON_PRESERVE_RATIO_CHANGE, onPreserveRatioChange));
		}
	}

	protected void renderOnRegionChange(List<String> renderedAttributes, ImageCropper imageCropper) throws IOException {
		java.lang.String onRegionChange = imageCropper.getOnRegionChange();

		if (onRegionChange != null) {
			renderedAttributes.add(renderString(ImageCropper.ON_REGION_CHANGE, onRegionChange));
		}
	}

	protected void renderOnRenderChange(List<String> renderedAttributes, ImageCropper imageCropper) throws IOException {
		java.lang.String onRenderChange = imageCropper.getOnRenderChange();

		if (onRenderChange != null) {
			renderedAttributes.add(renderString(ImageCropper.ON_RENDER_CHANGE, onRenderChange));
		}
	}

	protected void renderOnRenderedChange(List<String> renderedAttributes, ImageCropper imageCropper) throws IOException {
		java.lang.String onRenderedChange = imageCropper.getOnRenderedChange();

		if (onRenderedChange != null) {
			renderedAttributes.add(renderString(ImageCropper.ON_RENDERED_CHANGE, onRenderedChange));
		}
	}

	protected void renderOnResizableChange(List<String> renderedAttributes, ImageCropper imageCropper) throws IOException {
		java.lang.String onResizableChange = imageCropper.getOnResizableChange();

		if (onResizableChange != null) {
			renderedAttributes.add(renderString(ImageCropper.ON_RESIZABLE_CHANGE, onResizableChange));
		}
	}

	protected void renderOnSrcNodeChange(List<String> renderedAttributes, ImageCropper imageCropper) throws IOException {
		java.lang.String onSrcNodeChange = imageCropper.getOnSrcNodeChange();

		if (onSrcNodeChange != null) {
			renderedAttributes.add(renderString(ImageCropper.ON_SRC_NODE_CHANGE, onSrcNodeChange));
		}
	}

	protected void renderOnStringsChange(List<String> renderedAttributes, ImageCropper imageCropper) throws IOException {
		java.lang.String onStringsChange = imageCropper.getOnStringsChange();

		if (onStringsChange != null) {
			renderedAttributes.add(renderString(ImageCropper.ON_STRINGS_CHANGE, onStringsChange));
		}
	}

	protected void renderOnTabIndexChange(List<String> renderedAttributes, ImageCropper imageCropper) throws IOException {
		java.lang.String onTabIndexChange = imageCropper.getOnTabIndexChange();

		if (onTabIndexChange != null) {
			renderedAttributes.add(renderString(ImageCropper.ON_TAB_INDEX_CHANGE, onTabIndexChange));
		}
	}

	protected void renderOnUseARIAChange(List<String> renderedAttributes, ImageCropper imageCropper) throws IOException {
		java.lang.String onUseARIAChange = imageCropper.getOnUseARIAChange();

		if (onUseARIAChange != null) {
			renderedAttributes.add(renderString(ImageCropper.ON_USE_ARIACHANGE, onUseARIAChange));
		}
	}

	protected void renderOnVisibleChange(List<String> renderedAttributes, ImageCropper imageCropper) throws IOException {
		java.lang.String onVisibleChange = imageCropper.getOnVisibleChange();

		if (onVisibleChange != null) {
			renderedAttributes.add(renderString(ImageCropper.ON_VISIBLE_CHANGE, onVisibleChange));
		}
	}

	protected void renderOnWidthChange(List<String> renderedAttributes, ImageCropper imageCropper) throws IOException {
		java.lang.String onWidthChange = imageCropper.getOnWidthChange();

		if (onWidthChange != null) {
			renderedAttributes.add(renderString(ImageCropper.ON_WIDTH_CHANGE, onWidthChange));
		}
	}

	protected void renderOnXChange(List<String> renderedAttributes, ImageCropper imageCropper) throws IOException {
		java.lang.String onXChange = imageCropper.getOnXChange();

		if (onXChange != null) {
			renderedAttributes.add(renderString(ImageCropper.ON_XCHANGE, onXChange));
		}
	}

	protected void renderOnYChange(List<String> renderedAttributes, ImageCropper imageCropper) throws IOException {
		java.lang.String onYChange = imageCropper.getOnYChange();

		if (onYChange != null) {
			renderedAttributes.add(renderString(ImageCropper.ON_YCHANGE, onYChange));
		}
	}

}
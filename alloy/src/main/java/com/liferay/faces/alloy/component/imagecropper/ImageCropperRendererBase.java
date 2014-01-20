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

		if (imageCropper.getBoundingBox() != null) {
			renderBoundingBox(renderedAttributes, imageCropper);
		}
		
		if (imageCropper.getContentBox() != null) {
			renderContentBox(renderedAttributes, imageCropper);
		}
		
		if (imageCropper.getCropHeight() != null) {
			renderCropHeight(renderedAttributes, imageCropper);
		}
		
		if (imageCropper.getCropWidth() != null) {
			renderCropWidth(renderedAttributes, imageCropper);
		}
		
		if (imageCropper.getCssClass() != null) {
			renderCssClass(renderedAttributes, imageCropper);
		}
		
		if (imageCropper.getDestroyed() != null) {
			renderDestroyed(renderedAttributes, imageCropper);
		}
		
		if (imageCropper.getDisabled() != null) {
			renderDisabled(renderedAttributes, imageCropper);
		}
		
		if (imageCropper.getFocused() != null) {
			renderFocused(renderedAttributes, imageCropper);
		}
		
		if (imageCropper.getHeight() != null) {
			renderHeight(renderedAttributes, imageCropper);
		}
		
		if (imageCropper.getHideClass() != null) {
			renderHideClass(renderedAttributes, imageCropper);
		}
		
		if (imageCropper.getImageCropperId() != null) {
			renderImageCropperId(renderedAttributes, imageCropper);
		}
		
		if (imageCropper.getInitialized() != null) {
			renderInitialized(renderedAttributes, imageCropper);
		}
		
		if (imageCropper.getImageCropperLocale() != null) {
			renderImageCropperLocale(renderedAttributes, imageCropper);
		}
		
		if (imageCropper.getMinHeight() != null) {
			renderMinHeight(renderedAttributes, imageCropper);
		}
		
		if (imageCropper.getMinWidth() != null) {
			renderMinWidth(renderedAttributes, imageCropper);
		}
		
		if (imageCropper.getMovable() != null) {
			renderMovable(renderedAttributes, imageCropper);
		}
		
		if (imageCropper.getPreserveRatio() != null) {
			renderPreserveRatio(renderedAttributes, imageCropper);
		}
		
		if (imageCropper.getRegion() != null) {
			renderRegion(renderedAttributes, imageCropper);
		}
		
		if (imageCropper.getRender() != null) {
			renderRender(renderedAttributes, imageCropper);
		}
		
		if (imageCropper.getRendered() != null) {
			renderRendered(renderedAttributes, imageCropper);
		}
		
		if (imageCropper.getResizable() != null) {
			renderResizable(renderedAttributes, imageCropper);
		}
		
		if (imageCropper.getSrcNode() != null) {
			renderSrcNode(renderedAttributes, imageCropper);
		}
		
		if (imageCropper.getStrings() != null) {
			renderStrings(renderedAttributes, imageCropper);
		}
		
		if (imageCropper.getTabIndex() != null) {
			renderTabIndex(renderedAttributes, imageCropper);
		}
		
		if (imageCropper.getUseARIA() != null) {
			renderUseARIA(renderedAttributes, imageCropper);
		}
		
		if (imageCropper.getVisible() != null) {
			renderVisible(renderedAttributes, imageCropper);
		}
		
		if (imageCropper.getWidth() != null) {
			renderWidth(renderedAttributes, imageCropper);
		}
		
		if (imageCropper.getX() != null) {
			renderX(renderedAttributes, imageCropper);
		}
		
		if (imageCropper.getY() != null) {
			renderY(renderedAttributes, imageCropper);
		}
		

		for (String renderedAttribute : renderedAttributes) {
			responseWriter.write(renderedAttribute);
			responseWriter.write(StringPool.COMMA);
		}

		responseWriter.write("after");
		responseWriter.write(StringPool.COLON);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedAfterEvents = new ArrayList<String>();

		if (imageCropper.getAfterBoundingBoxChange() != null) {
			renderAfterBoundingBoxChange(renderedAfterEvents, imageCropper);
		}
		
		if (imageCropper.getAfterContentBoxChange() != null) {
			renderAfterContentBoxChange(renderedAfterEvents, imageCropper);
		}
		
		if (imageCropper.getAfterCropHeightChange() != null) {
			renderAfterCropHeightChange(renderedAfterEvents, imageCropper);
		}
		
		if (imageCropper.getAfterCropWidthChange() != null) {
			renderAfterCropWidthChange(renderedAfterEvents, imageCropper);
		}
		
		if (imageCropper.getAfterCssClassChange() != null) {
			renderAfterCssClassChange(renderedAfterEvents, imageCropper);
		}
		
		if (imageCropper.getAfterDestroyedChange() != null) {
			renderAfterDestroyedChange(renderedAfterEvents, imageCropper);
		}
		
		if (imageCropper.getAfterDisabledChange() != null) {
			renderAfterDisabledChange(renderedAfterEvents, imageCropper);
		}
		
		if (imageCropper.getAfterFocusedChange() != null) {
			renderAfterFocusedChange(renderedAfterEvents, imageCropper);
		}
		
		if (imageCropper.getAfterHeightChange() != null) {
			renderAfterHeightChange(renderedAfterEvents, imageCropper);
		}
		
		if (imageCropper.getAfterHideClassChange() != null) {
			renderAfterHideClassChange(renderedAfterEvents, imageCropper);
		}
		
		if (imageCropper.getAfterIdChange() != null) {
			renderAfterIdChange(renderedAfterEvents, imageCropper);
		}
		
		if (imageCropper.getAfterInitializedChange() != null) {
			renderAfterInitializedChange(renderedAfterEvents, imageCropper);
		}
		
		if (imageCropper.getAfterLocaleChange() != null) {
			renderAfterLocaleChange(renderedAfterEvents, imageCropper);
		}
		
		if (imageCropper.getAfterMinHeightChange() != null) {
			renderAfterMinHeightChange(renderedAfterEvents, imageCropper);
		}
		
		if (imageCropper.getAfterMinWidthChange() != null) {
			renderAfterMinWidthChange(renderedAfterEvents, imageCropper);
		}
		
		if (imageCropper.getAfterMovableChange() != null) {
			renderAfterMovableChange(renderedAfterEvents, imageCropper);
		}
		
		if (imageCropper.getAfterPreserveRatioChange() != null) {
			renderAfterPreserveRatioChange(renderedAfterEvents, imageCropper);
		}
		
		if (imageCropper.getAfterRegionChange() != null) {
			renderAfterRegionChange(renderedAfterEvents, imageCropper);
		}
		
		if (imageCropper.getAfterRenderChange() != null) {
			renderAfterRenderChange(renderedAfterEvents, imageCropper);
		}
		
		if (imageCropper.getAfterRenderedChange() != null) {
			renderAfterRenderedChange(renderedAfterEvents, imageCropper);
		}
		
		if (imageCropper.getAfterResizableChange() != null) {
			renderAfterResizableChange(renderedAfterEvents, imageCropper);
		}
		
		if (imageCropper.getAfterSrcNodeChange() != null) {
			renderAfterSrcNodeChange(renderedAfterEvents, imageCropper);
		}
		
		if (imageCropper.getAfterStringsChange() != null) {
			renderAfterStringsChange(renderedAfterEvents, imageCropper);
		}
		
		if (imageCropper.getAfterTabIndexChange() != null) {
			renderAfterTabIndexChange(renderedAfterEvents, imageCropper);
		}
		
		if (imageCropper.getAfterUseARIAChange() != null) {
			renderAfterUseARIAChange(renderedAfterEvents, imageCropper);
		}
		
		if (imageCropper.getAfterVisibleChange() != null) {
			renderAfterVisibleChange(renderedAfterEvents, imageCropper);
		}
		
		if (imageCropper.getAfterWidthChange() != null) {
			renderAfterWidthChange(renderedAfterEvents, imageCropper);
		}
		
		if (imageCropper.getAfterXChange() != null) {
			renderAfterXChange(renderedAfterEvents, imageCropper);
		}
		
		if (imageCropper.getAfterYChange() != null) {
			renderAfterYChange(renderedAfterEvents, imageCropper);
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

		if (imageCropper.getOnBoundingBoxChange() != null) {
			renderOnBoundingBoxChange(renderedOnEvents, imageCropper);
		}
		
		if (imageCropper.getOnContentBoxChange() != null) {
			renderOnContentBoxChange(renderedOnEvents, imageCropper);
		}
		
		if (imageCropper.getOnCropHeightChange() != null) {
			renderOnCropHeightChange(renderedOnEvents, imageCropper);
		}
		
		if (imageCropper.getOnCropWidthChange() != null) {
			renderOnCropWidthChange(renderedOnEvents, imageCropper);
		}
		
		if (imageCropper.getOnCssClassChange() != null) {
			renderOnCssClassChange(renderedOnEvents, imageCropper);
		}
		
		if (imageCropper.getOnDestroyedChange() != null) {
			renderOnDestroyedChange(renderedOnEvents, imageCropper);
		}
		
		if (imageCropper.getOnDisabledChange() != null) {
			renderOnDisabledChange(renderedOnEvents, imageCropper);
		}
		
		if (imageCropper.getOnFocusedChange() != null) {
			renderOnFocusedChange(renderedOnEvents, imageCropper);
		}
		
		if (imageCropper.getOnHeightChange() != null) {
			renderOnHeightChange(renderedOnEvents, imageCropper);
		}
		
		if (imageCropper.getOnHideClassChange() != null) {
			renderOnHideClassChange(renderedOnEvents, imageCropper);
		}
		
		if (imageCropper.getOnIdChange() != null) {
			renderOnIdChange(renderedOnEvents, imageCropper);
		}
		
		if (imageCropper.getOnInitializedChange() != null) {
			renderOnInitializedChange(renderedOnEvents, imageCropper);
		}
		
		if (imageCropper.getOnLocaleChange() != null) {
			renderOnLocaleChange(renderedOnEvents, imageCropper);
		}
		
		if (imageCropper.getOnMinHeightChange() != null) {
			renderOnMinHeightChange(renderedOnEvents, imageCropper);
		}
		
		if (imageCropper.getOnMinWidthChange() != null) {
			renderOnMinWidthChange(renderedOnEvents, imageCropper);
		}
		
		if (imageCropper.getOnMovableChange() != null) {
			renderOnMovableChange(renderedOnEvents, imageCropper);
		}
		
		if (imageCropper.getOnPreserveRatioChange() != null) {
			renderOnPreserveRatioChange(renderedOnEvents, imageCropper);
		}
		
		if (imageCropper.getOnRegionChange() != null) {
			renderOnRegionChange(renderedOnEvents, imageCropper);
		}
		
		if (imageCropper.getOnRenderChange() != null) {
			renderOnRenderChange(renderedOnEvents, imageCropper);
		}
		
		if (imageCropper.getOnRenderedChange() != null) {
			renderOnRenderedChange(renderedOnEvents, imageCropper);
		}
		
		if (imageCropper.getOnResizableChange() != null) {
			renderOnResizableChange(renderedOnEvents, imageCropper);
		}
		
		if (imageCropper.getOnSrcNodeChange() != null) {
			renderOnSrcNodeChange(renderedOnEvents, imageCropper);
		}
		
		if (imageCropper.getOnStringsChange() != null) {
			renderOnStringsChange(renderedOnEvents, imageCropper);
		}
		
		if (imageCropper.getOnTabIndexChange() != null) {
			renderOnTabIndexChange(renderedOnEvents, imageCropper);
		}
		
		if (imageCropper.getOnUseARIAChange() != null) {
			renderOnUseARIAChange(renderedOnEvents, imageCropper);
		}
		
		if (imageCropper.getOnVisibleChange() != null) {
			renderOnVisibleChange(renderedOnEvents, imageCropper);
		}
		
		if (imageCropper.getOnWidthChange() != null) {
			renderOnWidthChange(renderedOnEvents, imageCropper);
		}
		
		if (imageCropper.getOnXChange() != null) {
			renderOnXChange(renderedOnEvents, imageCropper);
		}
		
		if (imageCropper.getOnYChange() != null) {
			renderOnYChange(renderedOnEvents, imageCropper);
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

	protected void renderBoundingBox(List<String> renderedAttributes, ImageCropper imageCropper) throws IOException {
		java.lang.String boundingBox = imageCropper.getBoundingBox();
		renderedAttributes.add(renderString(ImageCropper.BOUNDING_BOX, boundingBox));
	}

	protected void renderContentBox(List<String> renderedAttributes, ImageCropper imageCropper) throws IOException {
		java.lang.String contentBox = imageCropper.getContentBox();
		renderedAttributes.add(renderString(ImageCropper.CONTENT_BOX, contentBox));
	}

	protected void renderCropHeight(List<String> renderedAttributes, ImageCropper imageCropper) throws IOException {
		java.lang.Object cropHeight = imageCropper.getCropHeight();
		renderedAttributes.add(renderNumber(ImageCropper.CROP_HEIGHT, cropHeight));
	}

	protected void renderCropWidth(List<String> renderedAttributes, ImageCropper imageCropper) throws IOException {
		java.lang.Object cropWidth = imageCropper.getCropWidth();
		renderedAttributes.add(renderNumber(ImageCropper.CROP_WIDTH, cropWidth));
	}

	protected void renderCssClass(List<String> renderedAttributes, ImageCropper imageCropper) throws IOException {
		java.lang.String cssClass = imageCropper.getCssClass();
		renderedAttributes.add(renderString(ImageCropper.CSS_CLASS, cssClass));
	}

	protected void renderDestroyed(List<String> renderedAttributes, ImageCropper imageCropper) throws IOException {
		java.lang.Boolean destroyed = imageCropper.getDestroyed();
		renderedAttributes.add(renderBoolean(ImageCropper.DESTROYED, destroyed));
	}

	protected void renderDisabled(List<String> renderedAttributes, ImageCropper imageCropper) throws IOException {
		java.lang.Boolean disabled = imageCropper.getDisabled();
		renderedAttributes.add(renderBoolean(ImageCropper.DISABLED, disabled));
	}

	protected void renderFocused(List<String> renderedAttributes, ImageCropper imageCropper) throws IOException {
		java.lang.Boolean focused = imageCropper.getFocused();
		renderedAttributes.add(renderBoolean(ImageCropper.FOCUSED, focused));
	}

	protected void renderHeight(List<String> renderedAttributes, ImageCropper imageCropper) throws IOException {
		java.lang.Object height = imageCropper.getHeight();
		renderedAttributes.add(renderString(ImageCropper.HEIGHT, height));
	}

	protected void renderHideClass(List<String> renderedAttributes, ImageCropper imageCropper) throws IOException {
		java.lang.String hideClass = imageCropper.getHideClass();
		renderedAttributes.add(renderString(ImageCropper.HIDE_CLASS, hideClass));
	}

	protected void renderImageCropperId(List<String> renderedAttributes, ImageCropper imageCropper) throws IOException {
		java.lang.String imageCropperId = imageCropper.getImageCropperId();
		renderedAttributes.add(renderString(ImageCropper.IMAGE_CROPPER_ID, imageCropperId));
	}

	protected void renderInitialized(List<String> renderedAttributes, ImageCropper imageCropper) throws IOException {
		java.lang.Boolean initialized = imageCropper.getInitialized();
		renderedAttributes.add(renderBoolean(ImageCropper.INITIALIZED, initialized));
	}

	protected void renderImageCropperLocale(List<String> renderedAttributes, ImageCropper imageCropper) throws IOException {
		java.lang.String imageCropperLocale = imageCropper.getImageCropperLocale();
		renderedAttributes.add(renderString(ImageCropper.IMAGE_CROPPER_LOCALE, imageCropperLocale));
	}

	protected void renderMinHeight(List<String> renderedAttributes, ImageCropper imageCropper) throws IOException {
		java.lang.Object minHeight = imageCropper.getMinHeight();
		renderedAttributes.add(renderNumber(ImageCropper.MIN_HEIGHT, minHeight));
	}

	protected void renderMinWidth(List<String> renderedAttributes, ImageCropper imageCropper) throws IOException {
		java.lang.Object minWidth = imageCropper.getMinWidth();
		renderedAttributes.add(renderNumber(ImageCropper.MIN_WIDTH, minWidth));
	}

	protected void renderMovable(List<String> renderedAttributes, ImageCropper imageCropper) throws IOException {
		java.lang.Boolean movable = imageCropper.getMovable();
		renderedAttributes.add(renderBoolean(ImageCropper.MOVABLE, movable));
	}

	protected void renderPreserveRatio(List<String> renderedAttributes, ImageCropper imageCropper) throws IOException {
		java.lang.Boolean preserveRatio = imageCropper.getPreserveRatio();
		renderedAttributes.add(renderBoolean(ImageCropper.PRESERVE_RATIO, preserveRatio));
	}

	protected void renderRegion(List<String> renderedAttributes, ImageCropper imageCropper) throws IOException {
		java.lang.Object region = imageCropper.getRegion();
		renderedAttributes.add(renderObject(ImageCropper.REGION, region));
	}

	protected void renderRender(List<String> renderedAttributes, ImageCropper imageCropper) throws IOException {
		java.lang.Object render = imageCropper.getRender();
		renderedAttributes.add(renderString(ImageCropper.RENDER, render));
	}

	protected void renderRendered(List<String> renderedAttributes, ImageCropper imageCropper) throws IOException {
		java.lang.Boolean rendered = imageCropper.getRendered();
		renderedAttributes.add(renderBoolean(ImageCropper.RENDERED, rendered));
	}

	protected void renderResizable(List<String> renderedAttributes, ImageCropper imageCropper) throws IOException {
		java.lang.Boolean resizable = imageCropper.getResizable();
		renderedAttributes.add(renderBoolean(ImageCropper.RESIZABLE, resizable));
	}

	protected void renderSrcNode(List<String> renderedAttributes, ImageCropper imageCropper) throws IOException {
		java.lang.String srcNode = imageCropper.getSrcNode();
		renderedAttributes.add(renderString(ImageCropper.SRC_NODE, srcNode));
	}

	protected void renderStrings(List<String> renderedAttributes, ImageCropper imageCropper) throws IOException {
		java.lang.Object strings = imageCropper.getStrings();
		renderedAttributes.add(renderObject(ImageCropper.STRINGS, strings));
	}

	protected void renderTabIndex(List<String> renderedAttributes, ImageCropper imageCropper) throws IOException {
		java.lang.Object tabIndex = imageCropper.getTabIndex();
		renderedAttributes.add(renderNumber(ImageCropper.TAB_INDEX, tabIndex));
	}

	protected void renderUseARIA(List<String> renderedAttributes, ImageCropper imageCropper) throws IOException {
		java.lang.Boolean useARIA = imageCropper.getUseARIA();
		renderedAttributes.add(renderBoolean(ImageCropper.USE_ARIA, useARIA));
	}

	protected void renderVisible(List<String> renderedAttributes, ImageCropper imageCropper) throws IOException {
		java.lang.Boolean visible = imageCropper.getVisible();
		renderedAttributes.add(renderBoolean(ImageCropper.VISIBLE, visible));
	}

	protected void renderWidth(List<String> renderedAttributes, ImageCropper imageCropper) throws IOException {
		java.lang.Object width = imageCropper.getWidth();
		renderedAttributes.add(renderString(ImageCropper.WIDTH, width));
	}

	protected void renderX(List<String> renderedAttributes, ImageCropper imageCropper) throws IOException {
		java.lang.Object x = imageCropper.getX();
		renderedAttributes.add(renderNumber(ImageCropper.X, x));
	}

	protected void renderY(List<String> renderedAttributes, ImageCropper imageCropper) throws IOException {
		java.lang.Object y = imageCropper.getY();
		renderedAttributes.add(renderNumber(ImageCropper.Y, y));
	}

	protected void renderAfterBoundingBoxChange(List<String> renderedAttributes, ImageCropper imageCropper) throws IOException {
		java.lang.String afterBoundingBoxChange = imageCropper.getAfterBoundingBoxChange();
		renderedAttributes.add(renderString(ImageCropper.AFTER_BOUNDING_BOX_CHANGE, afterBoundingBoxChange));
	}

	protected void renderAfterContentBoxChange(List<String> renderedAttributes, ImageCropper imageCropper) throws IOException {
		java.lang.String afterContentBoxChange = imageCropper.getAfterContentBoxChange();
		renderedAttributes.add(renderString(ImageCropper.AFTER_CONTENT_BOX_CHANGE, afterContentBoxChange));
	}

	protected void renderAfterCropHeightChange(List<String> renderedAttributes, ImageCropper imageCropper) throws IOException {
		java.lang.String afterCropHeightChange = imageCropper.getAfterCropHeightChange();
		renderedAttributes.add(renderString(ImageCropper.AFTER_CROP_HEIGHT_CHANGE, afterCropHeightChange));
	}

	protected void renderAfterCropWidthChange(List<String> renderedAttributes, ImageCropper imageCropper) throws IOException {
		java.lang.String afterCropWidthChange = imageCropper.getAfterCropWidthChange();
		renderedAttributes.add(renderString(ImageCropper.AFTER_CROP_WIDTH_CHANGE, afterCropWidthChange));
	}

	protected void renderAfterCssClassChange(List<String> renderedAttributes, ImageCropper imageCropper) throws IOException {
		java.lang.String afterCssClassChange = imageCropper.getAfterCssClassChange();
		renderedAttributes.add(renderString(ImageCropper.AFTER_CSS_CLASS_CHANGE, afterCssClassChange));
	}

	protected void renderAfterDestroyedChange(List<String> renderedAttributes, ImageCropper imageCropper) throws IOException {
		java.lang.String afterDestroyedChange = imageCropper.getAfterDestroyedChange();
		renderedAttributes.add(renderString(ImageCropper.AFTER_DESTROYED_CHANGE, afterDestroyedChange));
	}

	protected void renderAfterDisabledChange(List<String> renderedAttributes, ImageCropper imageCropper) throws IOException {
		java.lang.String afterDisabledChange = imageCropper.getAfterDisabledChange();
		renderedAttributes.add(renderString(ImageCropper.AFTER_DISABLED_CHANGE, afterDisabledChange));
	}

	protected void renderAfterFocusedChange(List<String> renderedAttributes, ImageCropper imageCropper) throws IOException {
		java.lang.String afterFocusedChange = imageCropper.getAfterFocusedChange();
		renderedAttributes.add(renderString(ImageCropper.AFTER_FOCUSED_CHANGE, afterFocusedChange));
	}

	protected void renderAfterHeightChange(List<String> renderedAttributes, ImageCropper imageCropper) throws IOException {
		java.lang.String afterHeightChange = imageCropper.getAfterHeightChange();
		renderedAttributes.add(renderString(ImageCropper.AFTER_HEIGHT_CHANGE, afterHeightChange));
	}

	protected void renderAfterHideClassChange(List<String> renderedAttributes, ImageCropper imageCropper) throws IOException {
		java.lang.String afterHideClassChange = imageCropper.getAfterHideClassChange();
		renderedAttributes.add(renderString(ImageCropper.AFTER_HIDE_CLASS_CHANGE, afterHideClassChange));
	}

	protected void renderAfterIdChange(List<String> renderedAttributes, ImageCropper imageCropper) throws IOException {
		java.lang.String afterIdChange = imageCropper.getAfterIdChange();
		renderedAttributes.add(renderString(ImageCropper.AFTER_ID_CHANGE, afterIdChange));
	}

	protected void renderAfterInitializedChange(List<String> renderedAttributes, ImageCropper imageCropper) throws IOException {
		java.lang.String afterInitializedChange = imageCropper.getAfterInitializedChange();
		renderedAttributes.add(renderString(ImageCropper.AFTER_INITIALIZED_CHANGE, afterInitializedChange));
	}

	protected void renderAfterLocaleChange(List<String> renderedAttributes, ImageCropper imageCropper) throws IOException {
		java.lang.String afterLocaleChange = imageCropper.getAfterLocaleChange();
		renderedAttributes.add(renderString(ImageCropper.AFTER_LOCALE_CHANGE, afterLocaleChange));
	}

	protected void renderAfterMinHeightChange(List<String> renderedAttributes, ImageCropper imageCropper) throws IOException {
		java.lang.String afterMinHeightChange = imageCropper.getAfterMinHeightChange();
		renderedAttributes.add(renderString(ImageCropper.AFTER_MIN_HEIGHT_CHANGE, afterMinHeightChange));
	}

	protected void renderAfterMinWidthChange(List<String> renderedAttributes, ImageCropper imageCropper) throws IOException {
		java.lang.String afterMinWidthChange = imageCropper.getAfterMinWidthChange();
		renderedAttributes.add(renderString(ImageCropper.AFTER_MIN_WIDTH_CHANGE, afterMinWidthChange));
	}

	protected void renderAfterMovableChange(List<String> renderedAttributes, ImageCropper imageCropper) throws IOException {
		java.lang.String afterMovableChange = imageCropper.getAfterMovableChange();
		renderedAttributes.add(renderString(ImageCropper.AFTER_MOVABLE_CHANGE, afterMovableChange));
	}

	protected void renderAfterPreserveRatioChange(List<String> renderedAttributes, ImageCropper imageCropper) throws IOException {
		java.lang.String afterPreserveRatioChange = imageCropper.getAfterPreserveRatioChange();
		renderedAttributes.add(renderString(ImageCropper.AFTER_PRESERVE_RATIO_CHANGE, afterPreserveRatioChange));
	}

	protected void renderAfterRegionChange(List<String> renderedAttributes, ImageCropper imageCropper) throws IOException {
		java.lang.String afterRegionChange = imageCropper.getAfterRegionChange();
		renderedAttributes.add(renderString(ImageCropper.AFTER_REGION_CHANGE, afterRegionChange));
	}

	protected void renderAfterRenderChange(List<String> renderedAttributes, ImageCropper imageCropper) throws IOException {
		java.lang.String afterRenderChange = imageCropper.getAfterRenderChange();
		renderedAttributes.add(renderString(ImageCropper.AFTER_RENDER_CHANGE, afterRenderChange));
	}

	protected void renderAfterRenderedChange(List<String> renderedAttributes, ImageCropper imageCropper) throws IOException {
		java.lang.String afterRenderedChange = imageCropper.getAfterRenderedChange();
		renderedAttributes.add(renderString(ImageCropper.AFTER_RENDERED_CHANGE, afterRenderedChange));
	}

	protected void renderAfterResizableChange(List<String> renderedAttributes, ImageCropper imageCropper) throws IOException {
		java.lang.String afterResizableChange = imageCropper.getAfterResizableChange();
		renderedAttributes.add(renderString(ImageCropper.AFTER_RESIZABLE_CHANGE, afterResizableChange));
	}

	protected void renderAfterSrcNodeChange(List<String> renderedAttributes, ImageCropper imageCropper) throws IOException {
		java.lang.String afterSrcNodeChange = imageCropper.getAfterSrcNodeChange();
		renderedAttributes.add(renderString(ImageCropper.AFTER_SRC_NODE_CHANGE, afterSrcNodeChange));
	}

	protected void renderAfterStringsChange(List<String> renderedAttributes, ImageCropper imageCropper) throws IOException {
		java.lang.String afterStringsChange = imageCropper.getAfterStringsChange();
		renderedAttributes.add(renderString(ImageCropper.AFTER_STRINGS_CHANGE, afterStringsChange));
	}

	protected void renderAfterTabIndexChange(List<String> renderedAttributes, ImageCropper imageCropper) throws IOException {
		java.lang.String afterTabIndexChange = imageCropper.getAfterTabIndexChange();
		renderedAttributes.add(renderString(ImageCropper.AFTER_TAB_INDEX_CHANGE, afterTabIndexChange));
	}

	protected void renderAfterUseARIAChange(List<String> renderedAttributes, ImageCropper imageCropper) throws IOException {
		java.lang.String afterUseARIAChange = imageCropper.getAfterUseARIAChange();
		renderedAttributes.add(renderString(ImageCropper.AFTER_USE_ARIACHANGE, afterUseARIAChange));
	}

	protected void renderAfterVisibleChange(List<String> renderedAttributes, ImageCropper imageCropper) throws IOException {
		java.lang.String afterVisibleChange = imageCropper.getAfterVisibleChange();
		renderedAttributes.add(renderString(ImageCropper.AFTER_VISIBLE_CHANGE, afterVisibleChange));
	}

	protected void renderAfterWidthChange(List<String> renderedAttributes, ImageCropper imageCropper) throws IOException {
		java.lang.String afterWidthChange = imageCropper.getAfterWidthChange();
		renderedAttributes.add(renderString(ImageCropper.AFTER_WIDTH_CHANGE, afterWidthChange));
	}

	protected void renderAfterXChange(List<String> renderedAttributes, ImageCropper imageCropper) throws IOException {
		java.lang.String afterXChange = imageCropper.getAfterXChange();
		renderedAttributes.add(renderString(ImageCropper.AFTER_XCHANGE, afterXChange));
	}

	protected void renderAfterYChange(List<String> renderedAttributes, ImageCropper imageCropper) throws IOException {
		java.lang.String afterYChange = imageCropper.getAfterYChange();
		renderedAttributes.add(renderString(ImageCropper.AFTER_YCHANGE, afterYChange));
	}

	protected void renderOnBoundingBoxChange(List<String> renderedAttributes, ImageCropper imageCropper) throws IOException {
		java.lang.String onBoundingBoxChange = imageCropper.getOnBoundingBoxChange();
		renderedAttributes.add(renderString(ImageCropper.ON_BOUNDING_BOX_CHANGE, onBoundingBoxChange));
	}

	protected void renderOnContentBoxChange(List<String> renderedAttributes, ImageCropper imageCropper) throws IOException {
		java.lang.String onContentBoxChange = imageCropper.getOnContentBoxChange();
		renderedAttributes.add(renderString(ImageCropper.ON_CONTENT_BOX_CHANGE, onContentBoxChange));
	}

	protected void renderOnCropHeightChange(List<String> renderedAttributes, ImageCropper imageCropper) throws IOException {
		java.lang.String onCropHeightChange = imageCropper.getOnCropHeightChange();
		renderedAttributes.add(renderString(ImageCropper.ON_CROP_HEIGHT_CHANGE, onCropHeightChange));
	}

	protected void renderOnCropWidthChange(List<String> renderedAttributes, ImageCropper imageCropper) throws IOException {
		java.lang.String onCropWidthChange = imageCropper.getOnCropWidthChange();
		renderedAttributes.add(renderString(ImageCropper.ON_CROP_WIDTH_CHANGE, onCropWidthChange));
	}

	protected void renderOnCssClassChange(List<String> renderedAttributes, ImageCropper imageCropper) throws IOException {
		java.lang.String onCssClassChange = imageCropper.getOnCssClassChange();
		renderedAttributes.add(renderString(ImageCropper.ON_CSS_CLASS_CHANGE, onCssClassChange));
	}

	protected void renderOnDestroyedChange(List<String> renderedAttributes, ImageCropper imageCropper) throws IOException {
		java.lang.String onDestroyedChange = imageCropper.getOnDestroyedChange();
		renderedAttributes.add(renderString(ImageCropper.ON_DESTROYED_CHANGE, onDestroyedChange));
	}

	protected void renderOnDisabledChange(List<String> renderedAttributes, ImageCropper imageCropper) throws IOException {
		java.lang.String onDisabledChange = imageCropper.getOnDisabledChange();
		renderedAttributes.add(renderString(ImageCropper.ON_DISABLED_CHANGE, onDisabledChange));
	}

	protected void renderOnFocusedChange(List<String> renderedAttributes, ImageCropper imageCropper) throws IOException {
		java.lang.String onFocusedChange = imageCropper.getOnFocusedChange();
		renderedAttributes.add(renderString(ImageCropper.ON_FOCUSED_CHANGE, onFocusedChange));
	}

	protected void renderOnHeightChange(List<String> renderedAttributes, ImageCropper imageCropper) throws IOException {
		java.lang.String onHeightChange = imageCropper.getOnHeightChange();
		renderedAttributes.add(renderString(ImageCropper.ON_HEIGHT_CHANGE, onHeightChange));
	}

	protected void renderOnHideClassChange(List<String> renderedAttributes, ImageCropper imageCropper) throws IOException {
		java.lang.String onHideClassChange = imageCropper.getOnHideClassChange();
		renderedAttributes.add(renderString(ImageCropper.ON_HIDE_CLASS_CHANGE, onHideClassChange));
	}

	protected void renderOnIdChange(List<String> renderedAttributes, ImageCropper imageCropper) throws IOException {
		java.lang.String onIdChange = imageCropper.getOnIdChange();
		renderedAttributes.add(renderString(ImageCropper.ON_ID_CHANGE, onIdChange));
	}

	protected void renderOnInitializedChange(List<String> renderedAttributes, ImageCropper imageCropper) throws IOException {
		java.lang.String onInitializedChange = imageCropper.getOnInitializedChange();
		renderedAttributes.add(renderString(ImageCropper.ON_INITIALIZED_CHANGE, onInitializedChange));
	}

	protected void renderOnLocaleChange(List<String> renderedAttributes, ImageCropper imageCropper) throws IOException {
		java.lang.String onLocaleChange = imageCropper.getOnLocaleChange();
		renderedAttributes.add(renderString(ImageCropper.ON_LOCALE_CHANGE, onLocaleChange));
	}

	protected void renderOnMinHeightChange(List<String> renderedAttributes, ImageCropper imageCropper) throws IOException {
		java.lang.String onMinHeightChange = imageCropper.getOnMinHeightChange();
		renderedAttributes.add(renderString(ImageCropper.ON_MIN_HEIGHT_CHANGE, onMinHeightChange));
	}

	protected void renderOnMinWidthChange(List<String> renderedAttributes, ImageCropper imageCropper) throws IOException {
		java.lang.String onMinWidthChange = imageCropper.getOnMinWidthChange();
		renderedAttributes.add(renderString(ImageCropper.ON_MIN_WIDTH_CHANGE, onMinWidthChange));
	}

	protected void renderOnMovableChange(List<String> renderedAttributes, ImageCropper imageCropper) throws IOException {
		java.lang.String onMovableChange = imageCropper.getOnMovableChange();
		renderedAttributes.add(renderString(ImageCropper.ON_MOVABLE_CHANGE, onMovableChange));
	}

	protected void renderOnPreserveRatioChange(List<String> renderedAttributes, ImageCropper imageCropper) throws IOException {
		java.lang.String onPreserveRatioChange = imageCropper.getOnPreserveRatioChange();
		renderedAttributes.add(renderString(ImageCropper.ON_PRESERVE_RATIO_CHANGE, onPreserveRatioChange));
	}

	protected void renderOnRegionChange(List<String> renderedAttributes, ImageCropper imageCropper) throws IOException {
		java.lang.String onRegionChange = imageCropper.getOnRegionChange();
		renderedAttributes.add(renderString(ImageCropper.ON_REGION_CHANGE, onRegionChange));
	}

	protected void renderOnRenderChange(List<String> renderedAttributes, ImageCropper imageCropper) throws IOException {
		java.lang.String onRenderChange = imageCropper.getOnRenderChange();
		renderedAttributes.add(renderString(ImageCropper.ON_RENDER_CHANGE, onRenderChange));
	}

	protected void renderOnRenderedChange(List<String> renderedAttributes, ImageCropper imageCropper) throws IOException {
		java.lang.String onRenderedChange = imageCropper.getOnRenderedChange();
		renderedAttributes.add(renderString(ImageCropper.ON_RENDERED_CHANGE, onRenderedChange));
	}

	protected void renderOnResizableChange(List<String> renderedAttributes, ImageCropper imageCropper) throws IOException {
		java.lang.String onResizableChange = imageCropper.getOnResizableChange();
		renderedAttributes.add(renderString(ImageCropper.ON_RESIZABLE_CHANGE, onResizableChange));
	}

	protected void renderOnSrcNodeChange(List<String> renderedAttributes, ImageCropper imageCropper) throws IOException {
		java.lang.String onSrcNodeChange = imageCropper.getOnSrcNodeChange();
		renderedAttributes.add(renderString(ImageCropper.ON_SRC_NODE_CHANGE, onSrcNodeChange));
	}

	protected void renderOnStringsChange(List<String> renderedAttributes, ImageCropper imageCropper) throws IOException {
		java.lang.String onStringsChange = imageCropper.getOnStringsChange();
		renderedAttributes.add(renderString(ImageCropper.ON_STRINGS_CHANGE, onStringsChange));
	}

	protected void renderOnTabIndexChange(List<String> renderedAttributes, ImageCropper imageCropper) throws IOException {
		java.lang.String onTabIndexChange = imageCropper.getOnTabIndexChange();
		renderedAttributes.add(renderString(ImageCropper.ON_TAB_INDEX_CHANGE, onTabIndexChange));
	}

	protected void renderOnUseARIAChange(List<String> renderedAttributes, ImageCropper imageCropper) throws IOException {
		java.lang.String onUseARIAChange = imageCropper.getOnUseARIAChange();
		renderedAttributes.add(renderString(ImageCropper.ON_USE_ARIACHANGE, onUseARIAChange));
	}

	protected void renderOnVisibleChange(List<String> renderedAttributes, ImageCropper imageCropper) throws IOException {
		java.lang.String onVisibleChange = imageCropper.getOnVisibleChange();
		renderedAttributes.add(renderString(ImageCropper.ON_VISIBLE_CHANGE, onVisibleChange));
	}

	protected void renderOnWidthChange(List<String> renderedAttributes, ImageCropper imageCropper) throws IOException {
		java.lang.String onWidthChange = imageCropper.getOnWidthChange();
		renderedAttributes.add(renderString(ImageCropper.ON_WIDTH_CHANGE, onWidthChange));
	}

	protected void renderOnXChange(List<String> renderedAttributes, ImageCropper imageCropper) throws IOException {
		java.lang.String onXChange = imageCropper.getOnXChange();
		renderedAttributes.add(renderString(ImageCropper.ON_XCHANGE, onXChange));
	}

	protected void renderOnYChange(List<String> renderedAttributes, ImageCropper imageCropper) throws IOException {
		java.lang.String onYChange = imageCropper.getOnYChange();
		renderedAttributes.add(renderString(ImageCropper.ON_YCHANGE, onYChange));
	}

}
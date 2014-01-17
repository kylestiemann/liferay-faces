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

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.context.ResponseWriter;

import com.liferay.faces.alloy.component.base.RendererBase;
import com.liferay.faces.util.lang.StringPool;


/**
 * @author Eduardo Lundgren
 * @author Bruno Basto
 * @author Nathan Cavanaugh
 * @generated
 */
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
		renderImagecropperId(renderedAttributes, imageCropper);
		renderInitialized(renderedAttributes, imageCropper);
		renderImagecropperLocale(renderedAttributes, imageCropper);
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

		Iterator<String> it = renderedAttributes.iterator();

		while (it.hasNext()) {
			responseWriter.write(it.next());

			if (it.hasNext()) {
				responseWriter.write(StringPool.COMMA);
			}
		}

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

	protected void renderImagecropperId(List<String> renderedAttributes, ImageCropper imageCropper) throws IOException {
		java.lang.String imagecropperId = imageCropper.getImagecropperId();

		if (imagecropperId != null) {
			renderedAttributes.add(renderString(ImageCropper.IMAGECROPPER_ID, imagecropperId));
		}
	}

	protected void renderInitialized(List<String> renderedAttributes, ImageCropper imageCropper) throws IOException {
		java.lang.Boolean initialized = imageCropper.getInitialized();

		if (initialized != null) {
			renderedAttributes.add(renderBoolean(ImageCropper.INITIALIZED, initialized));
		}
	}

	protected void renderImagecropperLocale(List<String> renderedAttributes, ImageCropper imageCropper) throws IOException {
		java.lang.String imagecropperLocale = imageCropper.getImagecropperLocale();

		if (imagecropperLocale != null) {
			renderedAttributes.add(renderString(ImageCropper.IMAGECROPPER_LOCALE, imagecropperLocale));
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

}
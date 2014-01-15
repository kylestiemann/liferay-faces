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
import java.util.ArrayList;
import java.util.Iterator;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.context.ResponseWriter;

import com.liferay.faces.alloy.component.base.AUIRenderer;
import com.liferay.faces.alloy.renderkit.BufferedResponseWriter;
import com.liferay.faces.util.lang.StringPool;


/**
 * @author Eduardo Lundgren
 * @author Bruno Basto
 * @author Nathan Cavanaugh
 */
public abstract class ImageCropperRendererBase extends AUIRenderer {

	// Private Constants
	private static final String AUI_MODULE_NAME = "aui-image-cropper";

	protected void encodeJavaScriptMain(FacesContext facesContext, UIComponent component) throws IOException {
	
		ImageCropper imageCropper = (ImageCropper) component; 

		BufferedResponseWriter bufferedResponseWriter = (BufferedResponseWriter) facesContext.getResponseWriter();

		bufferedResponseWriter.write("var imageCropper = new A.ImageCropper");
		bufferedResponseWriter.write(StringPool.OPEN_PARENTHESIS);
		bufferedResponseWriter.write(StringPool.OPEN_CURLY_BRACE);

		ArrayList<String> renrederedAttributes = new ArrayList<String>();

		renderBoundingBox(renrederedAttributes, imageCropper);
		renderContentBox(renrederedAttributes, imageCropper);
		renderCropHeight(renrederedAttributes, imageCropper);
		renderCropWidth(renrederedAttributes, imageCropper);
		renderCssClass(renrederedAttributes, imageCropper);
		renderDestroyed(renrederedAttributes, imageCropper);
		renderDisabled(renrederedAttributes, imageCropper);
		renderFocused(renrederedAttributes, imageCropper);
		renderHeight(renrederedAttributes, imageCropper);
		renderHideClass(renrederedAttributes, imageCropper);
		renderImagecropperId(renrederedAttributes, imageCropper);
		renderInitialized(renrederedAttributes, imageCropper);
		renderImagecropperLocale(renrederedAttributes, imageCropper);
		renderMinHeight(renrederedAttributes, imageCropper);
		renderMinWidth(renrederedAttributes, imageCropper);
		renderMovable(renrederedAttributes, imageCropper);
		renderPreserveRatio(renrederedAttributes, imageCropper);
		renderRegion(renrederedAttributes, imageCropper);
		renderRender(renrederedAttributes, imageCropper);
		renderRendered(renrederedAttributes, imageCropper);
		renderResizable(renrederedAttributes, imageCropper);
		renderSrcNode(renrederedAttributes, imageCropper);
		renderStrings(renrederedAttributes, imageCropper);
		renderTabIndex(renrederedAttributes, imageCropper);
		renderUseARIA(renrederedAttributes, imageCropper);
		renderVisible(renrederedAttributes, imageCropper);
		renderWidth(renrederedAttributes, imageCropper);
		renderX(renrederedAttributes, imageCropper);
		renderY(renrederedAttributes, imageCropper);

		Iterator<String> it = renrederedAttributes.iterator();

		while (it.hasNext()) {
			bufferedResponseWriter.write(it.next());

			if (it.hasNext()) {
				bufferedResponseWriter.write(StringPool.COMMA);
			}
		}

		bufferedResponseWriter.write(StringPool.CLOSE_CURLY_BRACE);
		bufferedResponseWriter.write(StringPool.CLOSE_PARENTHESIS);
		bufferedResponseWriter.write(".render()");
		bufferedResponseWriter.write(StringPool.SEMICOLON);
	}

	protected String getModule() {
		return AUI_MODULE_NAME;
	}

	protected void renderBoundingBox(ArrayList<String> renrederedAttributes, ImageCropper imageCropper) throws IOException {
		if (imageCropper.getBoundingBox() != null) {
			renrederedAttributes.add(renderString("boundingBox", imageCropper.getBoundingBox()));
		}
	}

	protected void renderContentBox(ArrayList<String> renrederedAttributes, ImageCropper imageCropper) throws IOException {
		if (imageCropper.getContentBox() != null) {
			renrederedAttributes.add(renderString("contentBox", imageCropper.getContentBox()));
		}
	}

	protected void renderCropHeight(ArrayList<String> renrederedAttributes, ImageCropper imageCropper) throws IOException {
		if (imageCropper.getCropHeight() != null) {
			renrederedAttributes.add(renderNumber("cropHeight", imageCropper.getCropHeight()));
		}
	}

	protected void renderCropWidth(ArrayList<String> renrederedAttributes, ImageCropper imageCropper) throws IOException {
		if (imageCropper.getCropWidth() != null) {
			renrederedAttributes.add(renderNumber("cropWidth", imageCropper.getCropWidth()));
		}
	}

	protected void renderCssClass(ArrayList<String> renrederedAttributes, ImageCropper imageCropper) throws IOException {
		if (imageCropper.getCssClass() != null) {
			renrederedAttributes.add(renderString("cssClass", imageCropper.getCssClass()));
		}
	}

	protected void renderDestroyed(ArrayList<String> renrederedAttributes, ImageCropper imageCropper) throws IOException {
		if (imageCropper.getDestroyed() != null) {
			renrederedAttributes.add(renderBoolean("destroyed", imageCropper.getDestroyed()));
		}
	}

	protected void renderDisabled(ArrayList<String> renrederedAttributes, ImageCropper imageCropper) throws IOException {
		if (imageCropper.getDisabled() != null) {
			renrederedAttributes.add(renderBoolean("disabled", imageCropper.getDisabled()));
		}
	}

	protected void renderFocused(ArrayList<String> renrederedAttributes, ImageCropper imageCropper) throws IOException {
		if (imageCropper.getFocused() != null) {
			renrederedAttributes.add(renderBoolean("focused", imageCropper.getFocused()));
		}
	}

	protected void renderHeight(ArrayList<String> renrederedAttributes, ImageCropper imageCropper) throws IOException {
		if (imageCropper.getHeight() != null) {
			renrederedAttributes.add(renderString("height", imageCropper.getHeight()));
		}
	}

	protected void renderHideClass(ArrayList<String> renrederedAttributes, ImageCropper imageCropper) throws IOException {
		if (imageCropper.getHideClass() != null) {
			renrederedAttributes.add(renderString("hideClass", imageCropper.getHideClass()));
		}
	}

	protected void renderImagecropperId(ArrayList<String> renrederedAttributes, ImageCropper imageCropper) throws IOException {
		if (imageCropper.getImagecropperId() != null) {
			renrederedAttributes.add(renderString("imagecropperId", imageCropper.getImagecropperId()));
		}
	}

	protected void renderInitialized(ArrayList<String> renrederedAttributes, ImageCropper imageCropper) throws IOException {
		if (imageCropper.getInitialized() != null) {
			renrederedAttributes.add(renderBoolean("initialized", imageCropper.getInitialized()));
		}
	}

	protected void renderImagecropperLocale(ArrayList<String> renrederedAttributes, ImageCropper imageCropper) throws IOException {
		if (imageCropper.getImagecropperLocale() != null) {
			renrederedAttributes.add(renderString("imagecropperLocale", imageCropper.getImagecropperLocale()));
		}
	}

	protected void renderMinHeight(ArrayList<String> renrederedAttributes, ImageCropper imageCropper) throws IOException {
		if (imageCropper.getMinHeight() != null) {
			renrederedAttributes.add(renderNumber("minHeight", imageCropper.getMinHeight()));
		}
	}

	protected void renderMinWidth(ArrayList<String> renrederedAttributes, ImageCropper imageCropper) throws IOException {
		if (imageCropper.getMinWidth() != null) {
			renrederedAttributes.add(renderNumber("minWidth", imageCropper.getMinWidth()));
		}
	}

	protected void renderMovable(ArrayList<String> renrederedAttributes, ImageCropper imageCropper) throws IOException {
		if (imageCropper.getMovable() != null) {
			renrederedAttributes.add(renderBoolean("movable", imageCropper.getMovable()));
		}
	}

	protected void renderPreserveRatio(ArrayList<String> renrederedAttributes, ImageCropper imageCropper) throws IOException {
		if (imageCropper.getPreserveRatio() != null) {
			renrederedAttributes.add(renderBoolean("preserveRatio", imageCropper.getPreserveRatio()));
		}
	}

	protected void renderRegion(ArrayList<String> renrederedAttributes, ImageCropper imageCropper) throws IOException {
		if (imageCropper.getRegion() != null) {
			renrederedAttributes.add(renderObject("region", imageCropper.getRegion()));
		}
	}

	protected void renderRender(ArrayList<String> renrederedAttributes, ImageCropper imageCropper) throws IOException {
		if (imageCropper.getRender() != null) {
			renrederedAttributes.add(renderString("render", imageCropper.getRender()));
		}
	}

	protected void renderRendered(ArrayList<String> renrederedAttributes, ImageCropper imageCropper) throws IOException {
		if (imageCropper.getRendered() != null) {
			renrederedAttributes.add(renderBoolean("rendered", imageCropper.getRendered()));
		}
	}

	protected void renderResizable(ArrayList<String> renrederedAttributes, ImageCropper imageCropper) throws IOException {
		if (imageCropper.getResizable() != null) {
			renrederedAttributes.add(renderBoolean("resizable", imageCropper.getResizable()));
		}
	}

	protected void renderSrcNode(ArrayList<String> renrederedAttributes, ImageCropper imageCropper) throws IOException {
		if (imageCropper.getSrcNode() != null) {
			renrederedAttributes.add(renderString("srcNode", imageCropper.getSrcNode()));
		}
	}

	protected void renderStrings(ArrayList<String> renrederedAttributes, ImageCropper imageCropper) throws IOException {
		if (imageCropper.getStrings() != null) {
			renrederedAttributes.add(renderObject("strings", imageCropper.getStrings()));
		}
	}

	protected void renderTabIndex(ArrayList<String> renrederedAttributes, ImageCropper imageCropper) throws IOException {
		if (imageCropper.getTabIndex() != null) {
			renrederedAttributes.add(renderNumber("tabIndex", imageCropper.getTabIndex()));
		}
	}

	protected void renderUseARIA(ArrayList<String> renrederedAttributes, ImageCropper imageCropper) throws IOException {
		if (imageCropper.getUseARIA() != null) {
			renrederedAttributes.add(renderBoolean("useARIA", imageCropper.getUseARIA()));
		}
	}

	protected void renderVisible(ArrayList<String> renrederedAttributes, ImageCropper imageCropper) throws IOException {
		if (imageCropper.getVisible() != null) {
			renrederedAttributes.add(renderBoolean("visible", imageCropper.getVisible()));
		}
	}

	protected void renderWidth(ArrayList<String> renrederedAttributes, ImageCropper imageCropper) throws IOException {
		if (imageCropper.getWidth() != null) {
			renrederedAttributes.add(renderString("width", imageCropper.getWidth()));
		}
	}

	protected void renderX(ArrayList<String> renrederedAttributes, ImageCropper imageCropper) throws IOException {
		if (imageCropper.getX() != null) {
			renrederedAttributes.add(renderNumber("x", imageCropper.getX()));
		}
	}

	protected void renderY(ArrayList<String> renrederedAttributes, ImageCropper imageCropper) throws IOException {
		if (imageCropper.getY() != null) {
			renrederedAttributes.add(renderNumber("y", imageCropper.getY()));
		}
	}

}
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
package com.liferay.faces.alloy.component.thumbrating;

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
public abstract class ThumbRatingRendererBase extends AUIRenderer {

	// Private Constants
	private static final String AUI_MODULE_NAME = "aui-rating";

	@Override
	public void encodeBegin(FacesContext facesContext, UIComponent uiComponent) throws IOException {

		super.encodeBegin(facesContext, uiComponent);

		ThumbRating thumbRating = (ThumbRating) uiComponent;
		encodeHTML(facesContext, thumbRating);
		encodeJavaScript(facesContext, thumbRating);
	}

	protected abstract void encodeHTML(FacesContext facesContext, ThumbRating thumbRating) throws IOException;

	protected void encodeJavaScript(FacesContext facesContext, ThumbRating thumbRating) throws IOException {

		ResponseWriter backupResponseWriter = facesContext.getResponseWriter();

		BufferedResponseWriter bufferedResponseWriter = new BufferedResponseWriter();
		facesContext.setResponseWriter(bufferedResponseWriter);

		beginJavaScript(facesContext, thumbRating);

		bufferedResponseWriter.write("var thumbRating = new A.ThumbRating");
		bufferedResponseWriter.write(StringPool.OPEN_PARENTHESIS);
		bufferedResponseWriter.write(StringPool.OPEN_CURLY_BRACE);

		ArrayList<String> renrederedAttributes = new ArrayList<String>();

		renderBoundingBox(renrederedAttributes, thumbRating);
		renderCanReset(renrederedAttributes, thumbRating);
		renderContentBox(renrederedAttributes, thumbRating);
		renderCssClass(renrederedAttributes, thumbRating);
		renderCssClasses(renrederedAttributes, thumbRating);
		renderDefaultSelected(renrederedAttributes, thumbRating);
		renderDestroyed(renrederedAttributes, thumbRating);
		renderDisabled(renrederedAttributes, thumbRating);
		renderElements(renrederedAttributes, thumbRating);
		renderFocused(renrederedAttributes, thumbRating);
		renderHeight(renrederedAttributes, thumbRating);
		renderHiddenInput(renrederedAttributes, thumbRating);
		renderHideClass(renrederedAttributes, thumbRating);
		renderThumbratingId(renrederedAttributes, thumbRating);
		renderInitialized(renrederedAttributes, thumbRating);
		renderInputName(renrederedAttributes, thumbRating);
		renderLabel(renrederedAttributes, thumbRating);
		renderLabelNode(renrederedAttributes, thumbRating);
		renderThumbratingLocale(renrederedAttributes, thumbRating);
		renderRender(renrederedAttributes, thumbRating);
		renderRendered(renrederedAttributes, thumbRating);
		renderSelectedIndex(renrederedAttributes, thumbRating);
		renderShowTitle(renrederedAttributes, thumbRating);
		renderSize(renrederedAttributes, thumbRating);
		renderSrcNode(renrederedAttributes, thumbRating);
		renderStrings(renrederedAttributes, thumbRating);
		renderTabIndex(renrederedAttributes, thumbRating);
		renderTitle(renrederedAttributes, thumbRating);
		renderUseARIA(renrederedAttributes, thumbRating);
		renderThumbratingValue(renrederedAttributes, thumbRating);
		renderVisible(renrederedAttributes, thumbRating);
		renderWidth(renrederedAttributes, thumbRating);

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

		endJavaScript(facesContext);

		handleBuffer(facesContext, thumbRating);

		facesContext.setResponseWriter(backupResponseWriter);
	}

	protected String getModule() {
		return AUI_MODULE_NAME;
	}

	protected void renderBoundingBox(ArrayList<String> renrederedAttributes, ThumbRating thumbRating) throws IOException {
		if (thumbRating.getBoundingBox() != null) {
			renrederedAttributes.add(renderString("boundingBox", thumbRating.getBoundingBox()));
		}
	}

	protected void renderCanReset(ArrayList<String> renrederedAttributes, ThumbRating thumbRating) throws IOException {
		if (thumbRating.getCanReset() != null) {
			renrederedAttributes.add(renderBoolean("canReset", thumbRating.getCanReset()));
		}
	}

	protected void renderContentBox(ArrayList<String> renrederedAttributes, ThumbRating thumbRating) throws IOException {
		if (thumbRating.getContentBox() != null) {
			renrederedAttributes.add(renderString("contentBox", thumbRating.getContentBox()));
		}
	}

	protected void renderCssClass(ArrayList<String> renrederedAttributes, ThumbRating thumbRating) throws IOException {
		if (thumbRating.getCssClass() != null) {
			renrederedAttributes.add(renderString("cssClass", thumbRating.getCssClass()));
		}
	}

	protected void renderCssClasses(ArrayList<String> renrederedAttributes, ThumbRating thumbRating) throws IOException {
		if (thumbRating.getCssClasses() != null) {
			renrederedAttributes.add(renderObject("cssClasses", thumbRating.getCssClasses()));
		}
	}

	protected void renderDefaultSelected(ArrayList<String> renrederedAttributes, ThumbRating thumbRating) throws IOException {
		if (thumbRating.getDefaultSelected() != null) {
			renrederedAttributes.add(renderNumber("defaultSelected", thumbRating.getDefaultSelected()));
		}
	}

	protected void renderDestroyed(ArrayList<String> renrederedAttributes, ThumbRating thumbRating) throws IOException {
		if (thumbRating.getDestroyed() != null) {
			renrederedAttributes.add(renderBoolean("destroyed", thumbRating.getDestroyed()));
		}
	}

	protected void renderDisabled(ArrayList<String> renrederedAttributes, ThumbRating thumbRating) throws IOException {
		if (thumbRating.getDisabled() != null) {
			renrederedAttributes.add(renderBoolean("disabled", thumbRating.getDisabled()));
		}
	}

	protected void renderElements(ArrayList<String> renrederedAttributes, ThumbRating thumbRating) throws IOException {
		if (thumbRating.getElements() != null) {
			renrederedAttributes.add(renderString("elements", thumbRating.getElements()));
		}
	}

	protected void renderFocused(ArrayList<String> renrederedAttributes, ThumbRating thumbRating) throws IOException {
		if (thumbRating.getFocused() != null) {
			renrederedAttributes.add(renderBoolean("focused", thumbRating.getFocused()));
		}
	}

	protected void renderHeight(ArrayList<String> renrederedAttributes, ThumbRating thumbRating) throws IOException {
		if (thumbRating.getHeight() != null) {
			renrederedAttributes.add(renderString("height", thumbRating.getHeight()));
		}
	}

	protected void renderHiddenInput(ArrayList<String> renrederedAttributes, ThumbRating thumbRating) throws IOException {
		if (thumbRating.getHiddenInput() != null) {
			renrederedAttributes.add(renderString("hiddenInput", thumbRating.getHiddenInput()));
		}
	}

	protected void renderHideClass(ArrayList<String> renrederedAttributes, ThumbRating thumbRating) throws IOException {
		if (thumbRating.getHideClass() != null) {
			renrederedAttributes.add(renderString("hideClass", thumbRating.getHideClass()));
		}
	}

	protected void renderThumbratingId(ArrayList<String> renrederedAttributes, ThumbRating thumbRating) throws IOException {
		if (thumbRating.getThumbratingId() != null) {
			renrederedAttributes.add(renderString("thumbratingId", thumbRating.getThumbratingId()));
		}
	}

	protected void renderInitialized(ArrayList<String> renrederedAttributes, ThumbRating thumbRating) throws IOException {
		if (thumbRating.getInitialized() != null) {
			renrederedAttributes.add(renderBoolean("initialized", thumbRating.getInitialized()));
		}
	}

	protected void renderInputName(ArrayList<String> renrederedAttributes, ThumbRating thumbRating) throws IOException {
		if (thumbRating.getInputName() != null) {
			renrederedAttributes.add(renderString("inputName", thumbRating.getInputName()));
		}
	}

	protected void renderLabel(ArrayList<String> renrederedAttributes, ThumbRating thumbRating) throws IOException {
		if (thumbRating.getLabel() != null) {
			renrederedAttributes.add(renderString("label", thumbRating.getLabel()));
		}
	}

	protected void renderLabelNode(ArrayList<String> renrederedAttributes, ThumbRating thumbRating) throws IOException {
		if (thumbRating.getLabelNode() != null) {
			renrederedAttributes.add(renderString("labelNode", thumbRating.getLabelNode()));
		}
	}

	protected void renderThumbratingLocale(ArrayList<String> renrederedAttributes, ThumbRating thumbRating) throws IOException {
		if (thumbRating.getThumbratingLocale() != null) {
			renrederedAttributes.add(renderString("thumbratingLocale", thumbRating.getThumbratingLocale()));
		}
	}

	protected void renderRender(ArrayList<String> renrederedAttributes, ThumbRating thumbRating) throws IOException {
		if (thumbRating.getRender() != null) {
			renrederedAttributes.add(renderString("render", thumbRating.getRender()));
		}
	}

	protected void renderRendered(ArrayList<String> renrederedAttributes, ThumbRating thumbRating) throws IOException {
		if (thumbRating.getRendered() != null) {
			renrederedAttributes.add(renderBoolean("rendered", thumbRating.getRendered()));
		}
	}

	protected void renderSelectedIndex(ArrayList<String> renrederedAttributes, ThumbRating thumbRating) throws IOException {
		if (thumbRating.getSelectedIndex() != null) {
			renrederedAttributes.add(renderNumber("selectedIndex", thumbRating.getSelectedIndex()));
		}
	}

	protected void renderShowTitle(ArrayList<String> renrederedAttributes, ThumbRating thumbRating) throws IOException {
		if (thumbRating.getShowTitle() != null) {
			renrederedAttributes.add(renderBoolean("showTitle", thumbRating.getShowTitle()));
		}
	}

	protected void renderSize(ArrayList<String> renrederedAttributes, ThumbRating thumbRating) throws IOException {
		if (thumbRating.getSize() != null) {
			renrederedAttributes.add(renderNumber("size", thumbRating.getSize()));
		}
	}

	protected void renderSrcNode(ArrayList<String> renrederedAttributes, ThumbRating thumbRating) throws IOException {
		if (thumbRating.getSrcNode() != null) {
			renrederedAttributes.add(renderString("srcNode", thumbRating.getSrcNode()));
		}
	}

	protected void renderStrings(ArrayList<String> renrederedAttributes, ThumbRating thumbRating) throws IOException {
		if (thumbRating.getStrings() != null) {
			renrederedAttributes.add(renderObject("strings", thumbRating.getStrings()));
		}
	}

	protected void renderTabIndex(ArrayList<String> renrederedAttributes, ThumbRating thumbRating) throws IOException {
		if (thumbRating.getTabIndex() != null) {
			renrederedAttributes.add(renderNumber("tabIndex", thumbRating.getTabIndex()));
		}
	}

	protected void renderTitle(ArrayList<String> renrederedAttributes, ThumbRating thumbRating) throws IOException {
		if (thumbRating.getTitle() != null) {
			renrederedAttributes.add(renderString("title", thumbRating.getTitle()));
		}
	}

	protected void renderUseARIA(ArrayList<String> renrederedAttributes, ThumbRating thumbRating) throws IOException {
		if (thumbRating.getUseARIA() != null) {
			renrederedAttributes.add(renderBoolean("useARIA", thumbRating.getUseARIA()));
		}
	}

	protected void renderThumbratingValue(ArrayList<String> renrederedAttributes, ThumbRating thumbRating) throws IOException {
		if (thumbRating.getThumbratingValue() != null) {
			renrederedAttributes.add(renderString("thumbratingValue", thumbRating.getThumbratingValue()));
		}
	}

	protected void renderVisible(ArrayList<String> renrederedAttributes, ThumbRating thumbRating) throws IOException {
		if (thumbRating.getVisible() != null) {
			renrederedAttributes.add(renderBoolean("visible", thumbRating.getVisible()));
		}
	}

	protected void renderWidth(ArrayList<String> renrederedAttributes, ThumbRating thumbRating) throws IOException {
		if (thumbRating.getWidth() != null) {
			renrederedAttributes.add(renderString("width", thumbRating.getWidth()));
		}
	}

}
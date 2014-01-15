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
package com.liferay.faces.alloy.component.rating;

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
public abstract class RatingRendererBase extends AUIRenderer {

	// Private Constants
	private static final String AUI_MODULE_NAME = "aui-rating";

	@Override
	public void encodeBegin(FacesContext facesContext, UIComponent uiComponent) throws IOException {

		super.encodeBegin(facesContext, uiComponent);

		Rating rating = (Rating) uiComponent;
		encodeHTML(facesContext, rating);
		encodeJavaScript(facesContext, rating);
	}

	protected abstract void encodeHTML(FacesContext facesContext, Rating rating) throws IOException;

	protected void encodeJavaScript(FacesContext facesContext, Rating rating) throws IOException {

		ResponseWriter backupResponseWriter = facesContext.getResponseWriter();

		BufferedResponseWriter bufferedResponseWriter = new BufferedResponseWriter();
		facesContext.setResponseWriter(bufferedResponseWriter);

		beginJavaScript(facesContext, rating);

		bufferedResponseWriter.write("var rating = new A.Rating");
		bufferedResponseWriter.write(StringPool.OPEN_PARENTHESIS);
		bufferedResponseWriter.write(StringPool.OPEN_CURLY_BRACE);

		ArrayList<String> renrederedAttributes = new ArrayList<String>();

		renderBoundingBox(renrederedAttributes, rating);
		renderCanReset(renrederedAttributes, rating);
		renderContentBox(renrederedAttributes, rating);
		renderCssClass(renrederedAttributes, rating);
		renderCssClasses(renrederedAttributes, rating);
		renderDefaultSelected(renrederedAttributes, rating);
		renderDestroyed(renrederedAttributes, rating);
		renderDisabled(renrederedAttributes, rating);
		renderElements(renrederedAttributes, rating);
		renderFocused(renrederedAttributes, rating);
		renderHeight(renrederedAttributes, rating);
		renderHiddenInput(renrederedAttributes, rating);
		renderHideClass(renrederedAttributes, rating);
		renderRatingId(renrederedAttributes, rating);
		renderInitialized(renrederedAttributes, rating);
		renderInputName(renrederedAttributes, rating);
		renderLabel(renrederedAttributes, rating);
		renderLabelNode(renrederedAttributes, rating);
		renderRatingLocale(renrederedAttributes, rating);
		renderRender(renrederedAttributes, rating);
		renderRendered(renrederedAttributes, rating);
		renderSelectedIndex(renrederedAttributes, rating);
		renderShowTitle(renrederedAttributes, rating);
		renderSize(renrederedAttributes, rating);
		renderSrcNode(renrederedAttributes, rating);
		renderStrings(renrederedAttributes, rating);
		renderTabIndex(renrederedAttributes, rating);
		renderTitle(renrederedAttributes, rating);
		renderUseARIA(renrederedAttributes, rating);
		renderRatingValue(renrederedAttributes, rating);
		renderVisible(renrederedAttributes, rating);
		renderWidth(renrederedAttributes, rating);

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

		handleBuffer(facesContext, rating);

		facesContext.setResponseWriter(backupResponseWriter);
	}

	protected String getModule() {
		return AUI_MODULE_NAME;
	}

	protected void renderBoundingBox(ArrayList<String> renrederedAttributes, Rating rating) throws IOException {
		if (rating.getBoundingBox() != null) {
			renrederedAttributes.add(renderString("boundingBox", rating.getBoundingBox()));
		}
	}

	protected void renderCanReset(ArrayList<String> renrederedAttributes, Rating rating) throws IOException {
		if (rating.getCanReset() != null) {
			renrederedAttributes.add(renderBoolean("canReset", rating.getCanReset()));
		}
	}

	protected void renderContentBox(ArrayList<String> renrederedAttributes, Rating rating) throws IOException {
		if (rating.getContentBox() != null) {
			renrederedAttributes.add(renderString("contentBox", rating.getContentBox()));
		}
	}

	protected void renderCssClass(ArrayList<String> renrederedAttributes, Rating rating) throws IOException {
		if (rating.getCssClass() != null) {
			renrederedAttributes.add(renderString("cssClass", rating.getCssClass()));
		}
	}

	protected void renderCssClasses(ArrayList<String> renrederedAttributes, Rating rating) throws IOException {
		if (rating.getCssClasses() != null) {
			renrederedAttributes.add(renderObject("cssClasses", rating.getCssClasses()));
		}
	}

	protected void renderDefaultSelected(ArrayList<String> renrederedAttributes, Rating rating) throws IOException {
		if (rating.getDefaultSelected() != null) {
			renrederedAttributes.add(renderNumber("defaultSelected", rating.getDefaultSelected()));
		}
	}

	protected void renderDestroyed(ArrayList<String> renrederedAttributes, Rating rating) throws IOException {
		if (rating.getDestroyed() != null) {
			renrederedAttributes.add(renderBoolean("destroyed", rating.getDestroyed()));
		}
	}

	protected void renderDisabled(ArrayList<String> renrederedAttributes, Rating rating) throws IOException {
		if (rating.getDisabled() != null) {
			renrederedAttributes.add(renderBoolean("disabled", rating.getDisabled()));
		}
	}

	protected void renderElements(ArrayList<String> renrederedAttributes, Rating rating) throws IOException {
		if (rating.getElements() != null) {
			renrederedAttributes.add(renderString("elements", rating.getElements()));
		}
	}

	protected void renderFocused(ArrayList<String> renrederedAttributes, Rating rating) throws IOException {
		if (rating.getFocused() != null) {
			renrederedAttributes.add(renderBoolean("focused", rating.getFocused()));
		}
	}

	protected void renderHeight(ArrayList<String> renrederedAttributes, Rating rating) throws IOException {
		if (rating.getHeight() != null) {
			renrederedAttributes.add(renderString("height", rating.getHeight()));
		}
	}

	protected void renderHiddenInput(ArrayList<String> renrederedAttributes, Rating rating) throws IOException {
		if (rating.getHiddenInput() != null) {
			renrederedAttributes.add(renderString("hiddenInput", rating.getHiddenInput()));
		}
	}

	protected void renderHideClass(ArrayList<String> renrederedAttributes, Rating rating) throws IOException {
		if (rating.getHideClass() != null) {
			renrederedAttributes.add(renderString("hideClass", rating.getHideClass()));
		}
	}

	protected void renderRatingId(ArrayList<String> renrederedAttributes, Rating rating) throws IOException {
		if (rating.getRatingId() != null) {
			renrederedAttributes.add(renderString("ratingId", rating.getRatingId()));
		}
	}

	protected void renderInitialized(ArrayList<String> renrederedAttributes, Rating rating) throws IOException {
		if (rating.getInitialized() != null) {
			renrederedAttributes.add(renderBoolean("initialized", rating.getInitialized()));
		}
	}

	protected void renderInputName(ArrayList<String> renrederedAttributes, Rating rating) throws IOException {
		if (rating.getInputName() != null) {
			renrederedAttributes.add(renderString("inputName", rating.getInputName()));
		}
	}

	protected void renderLabel(ArrayList<String> renrederedAttributes, Rating rating) throws IOException {
		if (rating.getLabel() != null) {
			renrederedAttributes.add(renderString("label", rating.getLabel()));
		}
	}

	protected void renderLabelNode(ArrayList<String> renrederedAttributes, Rating rating) throws IOException {
		if (rating.getLabelNode() != null) {
			renrederedAttributes.add(renderString("labelNode", rating.getLabelNode()));
		}
	}

	protected void renderRatingLocale(ArrayList<String> renrederedAttributes, Rating rating) throws IOException {
		if (rating.getRatingLocale() != null) {
			renrederedAttributes.add(renderString("ratingLocale", rating.getRatingLocale()));
		}
	}

	protected void renderRender(ArrayList<String> renrederedAttributes, Rating rating) throws IOException {
		if (rating.getRender() != null) {
			renrederedAttributes.add(renderString("render", rating.getRender()));
		}
	}

	protected void renderRendered(ArrayList<String> renrederedAttributes, Rating rating) throws IOException {
		if (rating.getRendered() != null) {
			renrederedAttributes.add(renderBoolean("rendered", rating.getRendered()));
		}
	}

	protected void renderSelectedIndex(ArrayList<String> renrederedAttributes, Rating rating) throws IOException {
		if (rating.getSelectedIndex() != null) {
			renrederedAttributes.add(renderNumber("selectedIndex", rating.getSelectedIndex()));
		}
	}

	protected void renderShowTitle(ArrayList<String> renrederedAttributes, Rating rating) throws IOException {
		if (rating.getShowTitle() != null) {
			renrederedAttributes.add(renderBoolean("showTitle", rating.getShowTitle()));
		}
	}

	protected void renderSize(ArrayList<String> renrederedAttributes, Rating rating) throws IOException {
		if (rating.getSize() != null) {
			renrederedAttributes.add(renderNumber("size", rating.getSize()));
		}
	}

	protected void renderSrcNode(ArrayList<String> renrederedAttributes, Rating rating) throws IOException {
		if (rating.getSrcNode() != null) {
			renrederedAttributes.add(renderString("srcNode", rating.getSrcNode()));
		}
	}

	protected void renderStrings(ArrayList<String> renrederedAttributes, Rating rating) throws IOException {
		if (rating.getStrings() != null) {
			renrederedAttributes.add(renderObject("strings", rating.getStrings()));
		}
	}

	protected void renderTabIndex(ArrayList<String> renrederedAttributes, Rating rating) throws IOException {
		if (rating.getTabIndex() != null) {
			renrederedAttributes.add(renderNumber("tabIndex", rating.getTabIndex()));
		}
	}

	protected void renderTitle(ArrayList<String> renrederedAttributes, Rating rating) throws IOException {
		if (rating.getTitle() != null) {
			renrederedAttributes.add(renderString("title", rating.getTitle()));
		}
	}

	protected void renderUseARIA(ArrayList<String> renrederedAttributes, Rating rating) throws IOException {
		if (rating.getUseARIA() != null) {
			renrederedAttributes.add(renderBoolean("useARIA", rating.getUseARIA()));
		}
	}

	protected void renderRatingValue(ArrayList<String> renrederedAttributes, Rating rating) throws IOException {
		if (rating.getRatingValue() != null) {
			renrederedAttributes.add(renderString("ratingValue", rating.getRatingValue()));
		}
	}

	protected void renderVisible(ArrayList<String> renrederedAttributes, Rating rating) throws IOException {
		if (rating.getVisible() != null) {
			renrederedAttributes.add(renderBoolean("visible", rating.getVisible()));
		}
	}

	protected void renderWidth(ArrayList<String> renrederedAttributes, Rating rating) throws IOException {
		if (rating.getWidth() != null) {
			renrederedAttributes.add(renderString("width", rating.getWidth()));
		}
	}

}
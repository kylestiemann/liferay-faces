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
package com.liferay.faces.alloy.component.progressbar;

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
public abstract class ProgressBarRendererBase extends AUIRenderer {

	// Private Constants
	private static final String AUI_MODULE_NAME = "aui-progressbar";

	protected void encodeJavaScriptMain(FacesContext facesContext, UIComponent component) throws IOException {
	
		ProgressBar progressBar = (ProgressBar) component; 

		BufferedResponseWriter bufferedResponseWriter = (BufferedResponseWriter) facesContext.getResponseWriter();

		bufferedResponseWriter.write("var progressBar = new A.ProgressBar");
		bufferedResponseWriter.write(StringPool.OPEN_PARENTHESIS);
		bufferedResponseWriter.write(StringPool.OPEN_CURLY_BRACE);

		ArrayList<String> renrederedAttributes = new ArrayList<String>();

		renderBoundingBox(renrederedAttributes, progressBar);
		renderContentBox(renrederedAttributes, progressBar);
		renderCssClass(renrederedAttributes, progressBar);
		renderDestroyed(renrederedAttributes, progressBar);
		renderDisabled(renrederedAttributes, progressBar);
		renderFocused(renrederedAttributes, progressBar);
		renderHeight(renrederedAttributes, progressBar);
		renderHideClass(renrederedAttributes, progressBar);
		renderProgressbarId(renrederedAttributes, progressBar);
		renderInitialized(renrederedAttributes, progressBar);
		renderLabel(renrederedAttributes, progressBar);
		renderProgressbarLocale(renrederedAttributes, progressBar);
		renderMax(renrederedAttributes, progressBar);
		renderMin(renrederedAttributes, progressBar);
		renderOrientation(renrederedAttributes, progressBar);
		renderRatio(renrederedAttributes, progressBar);
		renderRender(renrederedAttributes, progressBar);
		renderRendered(renrederedAttributes, progressBar);
		renderSrcNode(renrederedAttributes, progressBar);
		renderStep(renrederedAttributes, progressBar);
		renderStrings(renrederedAttributes, progressBar);
		renderTabIndex(renrederedAttributes, progressBar);
		renderTextNode(renrederedAttributes, progressBar);
		renderUseARIA(renrederedAttributes, progressBar);
		renderProgressbarValue(renrederedAttributes, progressBar);
		renderVisible(renrederedAttributes, progressBar);
		renderWidth(renrederedAttributes, progressBar);

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

	protected void renderBoundingBox(ArrayList<String> renrederedAttributes, ProgressBar progressBar) throws IOException {
		if (progressBar.getBoundingBox() != null) {
			renrederedAttributes.add(renderString("boundingBox", progressBar.getBoundingBox()));
		}
	}

	protected void renderContentBox(ArrayList<String> renrederedAttributes, ProgressBar progressBar) throws IOException {
		if (progressBar.getContentBox() != null) {
			renrederedAttributes.add(renderString("contentBox", progressBar.getContentBox()));
		}
	}

	protected void renderCssClass(ArrayList<String> renrederedAttributes, ProgressBar progressBar) throws IOException {
		if (progressBar.getCssClass() != null) {
			renrederedAttributes.add(renderString("cssClass", progressBar.getCssClass()));
		}
	}

	protected void renderDestroyed(ArrayList<String> renrederedAttributes, ProgressBar progressBar) throws IOException {
		if (progressBar.getDestroyed() != null) {
			renrederedAttributes.add(renderBoolean("destroyed", progressBar.getDestroyed()));
		}
	}

	protected void renderDisabled(ArrayList<String> renrederedAttributes, ProgressBar progressBar) throws IOException {
		if (progressBar.getDisabled() != null) {
			renrederedAttributes.add(renderBoolean("disabled", progressBar.getDisabled()));
		}
	}

	protected void renderFocused(ArrayList<String> renrederedAttributes, ProgressBar progressBar) throws IOException {
		if (progressBar.getFocused() != null) {
			renrederedAttributes.add(renderBoolean("focused", progressBar.getFocused()));
		}
	}

	protected void renderHeight(ArrayList<String> renrederedAttributes, ProgressBar progressBar) throws IOException {
		if (progressBar.getHeight() != null) {
			renrederedAttributes.add(renderNumber("height", progressBar.getHeight()));
		}
	}

	protected void renderHideClass(ArrayList<String> renrederedAttributes, ProgressBar progressBar) throws IOException {
		if (progressBar.getHideClass() != null) {
			renrederedAttributes.add(renderString("hideClass", progressBar.getHideClass()));
		}
	}

	protected void renderProgressbarId(ArrayList<String> renrederedAttributes, ProgressBar progressBar) throws IOException {
		if (progressBar.getProgressbarId() != null) {
			renrederedAttributes.add(renderString("progressbarId", progressBar.getProgressbarId()));
		}
	}

	protected void renderInitialized(ArrayList<String> renrederedAttributes, ProgressBar progressBar) throws IOException {
		if (progressBar.getInitialized() != null) {
			renrederedAttributes.add(renderBoolean("initialized", progressBar.getInitialized()));
		}
	}

	protected void renderLabel(ArrayList<String> renrederedAttributes, ProgressBar progressBar) throws IOException {
		if (progressBar.getLabel() != null) {
			renrederedAttributes.add(renderString("label", progressBar.getLabel()));
		}
	}

	protected void renderProgressbarLocale(ArrayList<String> renrederedAttributes, ProgressBar progressBar) throws IOException {
		if (progressBar.getProgressbarLocale() != null) {
			renrederedAttributes.add(renderString("progressbarLocale", progressBar.getProgressbarLocale()));
		}
	}

	protected void renderMax(ArrayList<String> renrederedAttributes, ProgressBar progressBar) throws IOException {
		if (progressBar.getMax() != null) {
			renrederedAttributes.add(renderNumber("max", progressBar.getMax()));
		}
	}

	protected void renderMin(ArrayList<String> renrederedAttributes, ProgressBar progressBar) throws IOException {
		if (progressBar.getMin() != null) {
			renrederedAttributes.add(renderNumber("min", progressBar.getMin()));
		}
	}

	protected void renderOrientation(ArrayList<String> renrederedAttributes, ProgressBar progressBar) throws IOException {
		if (progressBar.getOrientation() != null) {
			renrederedAttributes.add(renderString("orientation", progressBar.getOrientation()));
		}
	}

	protected void renderRatio(ArrayList<String> renrederedAttributes, ProgressBar progressBar) throws IOException {
		if (progressBar.getRatio() != null) {
			renrederedAttributes.add(renderNumber("ratio", progressBar.getRatio()));
		}
	}

	protected void renderRender(ArrayList<String> renrederedAttributes, ProgressBar progressBar) throws IOException {
		if (progressBar.getRender() != null) {
			renrederedAttributes.add(renderString("render", progressBar.getRender()));
		}
	}

	protected void renderRendered(ArrayList<String> renrederedAttributes, ProgressBar progressBar) throws IOException {
		if (progressBar.getRendered() != null) {
			renrederedAttributes.add(renderBoolean("rendered", progressBar.getRendered()));
		}
	}

	protected void renderSrcNode(ArrayList<String> renrederedAttributes, ProgressBar progressBar) throws IOException {
		if (progressBar.getSrcNode() != null) {
			renrederedAttributes.add(renderString("srcNode", progressBar.getSrcNode()));
		}
	}

	protected void renderStep(ArrayList<String> renrederedAttributes, ProgressBar progressBar) throws IOException {
		if (progressBar.getStep() != null) {
			renrederedAttributes.add(renderNumber("step", progressBar.getStep()));
		}
	}

	protected void renderStrings(ArrayList<String> renrederedAttributes, ProgressBar progressBar) throws IOException {
		if (progressBar.getStrings() != null) {
			renrederedAttributes.add(renderObject("strings", progressBar.getStrings()));
		}
	}

	protected void renderTabIndex(ArrayList<String> renrederedAttributes, ProgressBar progressBar) throws IOException {
		if (progressBar.getTabIndex() != null) {
			renrederedAttributes.add(renderNumber("tabIndex", progressBar.getTabIndex()));
		}
	}

	protected void renderTextNode(ArrayList<String> renrederedAttributes, ProgressBar progressBar) throws IOException {
		if (progressBar.getTextNode() != null) {
			renrederedAttributes.add(renderString("textNode", progressBar.getTextNode()));
		}
	}

	protected void renderUseARIA(ArrayList<String> renrederedAttributes, ProgressBar progressBar) throws IOException {
		if (progressBar.getUseARIA() != null) {
			renrederedAttributes.add(renderBoolean("useARIA", progressBar.getUseARIA()));
		}
	}

	protected void renderProgressbarValue(ArrayList<String> renrederedAttributes, ProgressBar progressBar) throws IOException {
		if (progressBar.getProgressbarValue() != null) {
			renrederedAttributes.add(renderString("progressbarValue", progressBar.getProgressbarValue()));
		}
	}

	protected void renderVisible(ArrayList<String> renrederedAttributes, ProgressBar progressBar) throws IOException {
		if (progressBar.getVisible() != null) {
			renrederedAttributes.add(renderBoolean("visible", progressBar.getVisible()));
		}
	}

	protected void renderWidth(ArrayList<String> renrederedAttributes, ProgressBar progressBar) throws IOException {
		if (progressBar.getWidth() != null) {
			renrederedAttributes.add(renderString("width", progressBar.getWidth()));
		}
	}

}
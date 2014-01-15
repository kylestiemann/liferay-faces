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
package com.liferay.faces.alloy.component.textcelleditor;

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
public abstract class TextCellEditorRendererBase extends AUIRenderer {

	// Private Constants
	private static final String AUI_MODULE_NAME = "aui-datatable-edit";

	protected void encodeJavaScriptMain(FacesContext facesContext, UIComponent component) throws IOException {
	
		TextCellEditor textCellEditor = (TextCellEditor) component; 

		BufferedResponseWriter bufferedResponseWriter = (BufferedResponseWriter) facesContext.getResponseWriter();

		bufferedResponseWriter.write("var textCellEditor = new A.TextCellEditor");
		bufferedResponseWriter.write(StringPool.OPEN_PARENTHESIS);
		bufferedResponseWriter.write(StringPool.OPEN_CURLY_BRACE);

		ArrayList<String> renrederedAttributes = new ArrayList<String>();

		renderAlign(renrederedAttributes, textCellEditor);
		renderAlignOn(renrederedAttributes, textCellEditor);
		renderTextcelleditorBodyContent(renrederedAttributes, textCellEditor);
		renderBoundingBox(renrederedAttributes, textCellEditor);
		renderCentered(renrederedAttributes, textCellEditor);
		renderConstrain(renrederedAttributes, textCellEditor);
		renderContentBox(renrederedAttributes, textCellEditor);
		renderDestroyed(renrederedAttributes, textCellEditor);
		renderDisabled(renrederedAttributes, textCellEditor);
		renderEditable(renrederedAttributes, textCellEditor);
		renderElementName(renrederedAttributes, textCellEditor);
		renderFillHeight(renrederedAttributes, textCellEditor);
		renderFocused(renrederedAttributes, textCellEditor);
		renderFooterContent(renrederedAttributes, textCellEditor);
		renderHeaderContent(renrederedAttributes, textCellEditor);
		renderHeight(renrederedAttributes, textCellEditor);
		renderHideOnSave(renrederedAttributes, textCellEditor);
		renderTextcelleditorId(renrederedAttributes, textCellEditor);
		renderInitialized(renrederedAttributes, textCellEditor);
		renderInputFormatter(renrederedAttributes, textCellEditor);
		renderTextcelleditorLocale(renrederedAttributes, textCellEditor);
		renderOutputFormatter(renrederedAttributes, textCellEditor);
		renderPreventOverlap(renrederedAttributes, textCellEditor);
		renderRender(renrederedAttributes, textCellEditor);
		renderRendered(renrederedAttributes, textCellEditor);
		renderShim(renrederedAttributes, textCellEditor);
		renderShowToolbar(renrederedAttributes, textCellEditor);
		renderSrcNode(renrederedAttributes, textCellEditor);
		renderStrings(renrederedAttributes, textCellEditor);
		renderTabIndex(renrederedAttributes, textCellEditor);
		renderToolbar(renrederedAttributes, textCellEditor);
		renderUnescapeValue(renrederedAttributes, textCellEditor);
		renderValidator(renrederedAttributes, textCellEditor);
		renderTextcelleditorValue(renrederedAttributes, textCellEditor);
		renderVisible(renrederedAttributes, textCellEditor);
		renderWidth(renrederedAttributes, textCellEditor);
		renderX(renrederedAttributes, textCellEditor);
		renderXy(renrederedAttributes, textCellEditor);
		renderY(renrederedAttributes, textCellEditor);
		renderZIndex(renrederedAttributes, textCellEditor);

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

	protected void renderAlign(ArrayList<String> renrederedAttributes, TextCellEditor textCellEditor) throws IOException {
		if (textCellEditor.getAlign() != null) {
			renrederedAttributes.add(renderObject("align", textCellEditor.getAlign()));
		}
	}

	protected void renderAlignOn(ArrayList<String> renrederedAttributes, TextCellEditor textCellEditor) throws IOException {
		if (textCellEditor.getAlignOn() != null) {
			renrederedAttributes.add(renderArray("alignOn", textCellEditor.getAlignOn()));
		}
	}

	protected void renderTextcelleditorBodyContent(ArrayList<String> renrederedAttributes, TextCellEditor textCellEditor) throws IOException {
		if (textCellEditor.getTextcelleditorBodyContent() != null) {
			renrederedAttributes.add(renderString("textcelleditorBodyContent", textCellEditor.getTextcelleditorBodyContent()));
		}
	}

	protected void renderBoundingBox(ArrayList<String> renrederedAttributes, TextCellEditor textCellEditor) throws IOException {
		if (textCellEditor.getBoundingBox() != null) {
			renrederedAttributes.add(renderString("boundingBox", textCellEditor.getBoundingBox()));
		}
	}

	protected void renderCentered(ArrayList<String> renrederedAttributes, TextCellEditor textCellEditor) throws IOException {
		if (textCellEditor.getCentered() != null) {
			renrederedAttributes.add(renderString("centered", textCellEditor.getCentered()));
		}
	}

	protected void renderConstrain(ArrayList<String> renrederedAttributes, TextCellEditor textCellEditor) throws IOException {
		if (textCellEditor.getConstrain() != null) {
			renrederedAttributes.add(renderString("constrain", textCellEditor.getConstrain()));
		}
	}

	protected void renderContentBox(ArrayList<String> renrederedAttributes, TextCellEditor textCellEditor) throws IOException {
		if (textCellEditor.getContentBox() != null) {
			renrederedAttributes.add(renderString("contentBox", textCellEditor.getContentBox()));
		}
	}

	protected void renderDestroyed(ArrayList<String> renrederedAttributes, TextCellEditor textCellEditor) throws IOException {
		if (textCellEditor.getDestroyed() != null) {
			renrederedAttributes.add(renderBoolean("destroyed", textCellEditor.getDestroyed()));
		}
	}

	protected void renderDisabled(ArrayList<String> renrederedAttributes, TextCellEditor textCellEditor) throws IOException {
		if (textCellEditor.getDisabled() != null) {
			renrederedAttributes.add(renderBoolean("disabled", textCellEditor.getDisabled()));
		}
	}

	protected void renderEditable(ArrayList<String> renrederedAttributes, TextCellEditor textCellEditor) throws IOException {
		if (textCellEditor.getEditable() != null) {
			renrederedAttributes.add(renderBoolean("editable", textCellEditor.getEditable()));
		}
	}

	protected void renderElementName(ArrayList<String> renrederedAttributes, TextCellEditor textCellEditor) throws IOException {
		if (textCellEditor.getElementName() != null) {
			renrederedAttributes.add(renderString("elementName", textCellEditor.getElementName()));
		}
	}

	protected void renderFillHeight(ArrayList<String> renrederedAttributes, TextCellEditor textCellEditor) throws IOException {
		if (textCellEditor.getFillHeight() != null) {
			renrederedAttributes.add(renderString("fillHeight", textCellEditor.getFillHeight()));
		}
	}

	protected void renderFocused(ArrayList<String> renrederedAttributes, TextCellEditor textCellEditor) throws IOException {
		if (textCellEditor.getFocused() != null) {
			renrederedAttributes.add(renderBoolean("focused", textCellEditor.getFocused()));
		}
	}

	protected void renderFooterContent(ArrayList<String> renrederedAttributes, TextCellEditor textCellEditor) throws IOException {
		if (textCellEditor.getFooterContent() != null) {
			renrederedAttributes.add(renderString("footerContent", textCellEditor.getFooterContent()));
		}
	}

	protected void renderHeaderContent(ArrayList<String> renrederedAttributes, TextCellEditor textCellEditor) throws IOException {
		if (textCellEditor.getHeaderContent() != null) {
			renrederedAttributes.add(renderString("headerContent", textCellEditor.getHeaderContent()));
		}
	}

	protected void renderHeight(ArrayList<String> renrederedAttributes, TextCellEditor textCellEditor) throws IOException {
		if (textCellEditor.getHeight() != null) {
			renrederedAttributes.add(renderString("height", textCellEditor.getHeight()));
		}
	}

	protected void renderHideOnSave(ArrayList<String> renrederedAttributes, TextCellEditor textCellEditor) throws IOException {
		if (textCellEditor.getHideOnSave() != null) {
			renrederedAttributes.add(renderBoolean("hideOnSave", textCellEditor.getHideOnSave()));
		}
	}

	protected void renderTextcelleditorId(ArrayList<String> renrederedAttributes, TextCellEditor textCellEditor) throws IOException {
		if (textCellEditor.getTextcelleditorId() != null) {
			renrederedAttributes.add(renderString("textcelleditorId", textCellEditor.getTextcelleditorId()));
		}
	}

	protected void renderInitialized(ArrayList<String> renrederedAttributes, TextCellEditor textCellEditor) throws IOException {
		if (textCellEditor.getInitialized() != null) {
			renrederedAttributes.add(renderBoolean("initialized", textCellEditor.getInitialized()));
		}
	}

	protected void renderInputFormatter(ArrayList<String> renrederedAttributes, TextCellEditor textCellEditor) throws IOException {
		if (textCellEditor.getInputFormatter() != null) {
			renrederedAttributes.add(renderString("inputFormatter", textCellEditor.getInputFormatter()));
		}
	}

	protected void renderTextcelleditorLocale(ArrayList<String> renrederedAttributes, TextCellEditor textCellEditor) throws IOException {
		if (textCellEditor.getTextcelleditorLocale() != null) {
			renrederedAttributes.add(renderString("textcelleditorLocale", textCellEditor.getTextcelleditorLocale()));
		}
	}

	protected void renderOutputFormatter(ArrayList<String> renrederedAttributes, TextCellEditor textCellEditor) throws IOException {
		if (textCellEditor.getOutputFormatter() != null) {
			renrederedAttributes.add(renderString("outputFormatter", textCellEditor.getOutputFormatter()));
		}
	}

	protected void renderPreventOverlap(ArrayList<String> renrederedAttributes, TextCellEditor textCellEditor) throws IOException {
		if (textCellEditor.getPreventOverlap() != null) {
			renrederedAttributes.add(renderBoolean("preventOverlap", textCellEditor.getPreventOverlap()));
		}
	}

	protected void renderRender(ArrayList<String> renrederedAttributes, TextCellEditor textCellEditor) throws IOException {
		if (textCellEditor.getRender() != null) {
			renrederedAttributes.add(renderString("render", textCellEditor.getRender()));
		}
	}

	protected void renderRendered(ArrayList<String> renrederedAttributes, TextCellEditor textCellEditor) throws IOException {
		if (textCellEditor.getRendered() != null) {
			renrederedAttributes.add(renderBoolean("rendered", textCellEditor.getRendered()));
		}
	}

	protected void renderShim(ArrayList<String> renrederedAttributes, TextCellEditor textCellEditor) throws IOException {
		if (textCellEditor.getShim() != null) {
			renrederedAttributes.add(renderBoolean("shim", textCellEditor.getShim()));
		}
	}

	protected void renderShowToolbar(ArrayList<String> renrederedAttributes, TextCellEditor textCellEditor) throws IOException {
		if (textCellEditor.getShowToolbar() != null) {
			renrederedAttributes.add(renderBoolean("showToolbar", textCellEditor.getShowToolbar()));
		}
	}

	protected void renderSrcNode(ArrayList<String> renrederedAttributes, TextCellEditor textCellEditor) throws IOException {
		if (textCellEditor.getSrcNode() != null) {
			renrederedAttributes.add(renderString("srcNode", textCellEditor.getSrcNode()));
		}
	}

	protected void renderStrings(ArrayList<String> renrederedAttributes, TextCellEditor textCellEditor) throws IOException {
		if (textCellEditor.getStrings() != null) {
			renrederedAttributes.add(renderObject("strings", textCellEditor.getStrings()));
		}
	}

	protected void renderTabIndex(ArrayList<String> renrederedAttributes, TextCellEditor textCellEditor) throws IOException {
		if (textCellEditor.getTabIndex() != null) {
			renrederedAttributes.add(renderNumber("tabIndex", textCellEditor.getTabIndex()));
		}
	}

	protected void renderToolbar(ArrayList<String> renrederedAttributes, TextCellEditor textCellEditor) throws IOException {
		if (textCellEditor.getToolbar() != null) {
			renrederedAttributes.add(renderObject("toolbar", textCellEditor.getToolbar()));
		}
	}

	protected void renderUnescapeValue(ArrayList<String> renrederedAttributes, TextCellEditor textCellEditor) throws IOException {
		if (textCellEditor.getUnescapeValue() != null) {
			renrederedAttributes.add(renderBoolean("unescapeValue", textCellEditor.getUnescapeValue()));
		}
	}

	protected void renderValidator(ArrayList<String> renrederedAttributes, TextCellEditor textCellEditor) throws IOException {
		if (textCellEditor.getValidator() != null) {
			renrederedAttributes.add(renderObject("validator", textCellEditor.getValidator()));
		}
	}

	protected void renderTextcelleditorValue(ArrayList<String> renrederedAttributes, TextCellEditor textCellEditor) throws IOException {
		if (textCellEditor.getTextcelleditorValue() != null) {
			renrederedAttributes.add(renderString("textcelleditorValue", textCellEditor.getTextcelleditorValue()));
		}
	}

	protected void renderVisible(ArrayList<String> renrederedAttributes, TextCellEditor textCellEditor) throws IOException {
		if (textCellEditor.getVisible() != null) {
			renrederedAttributes.add(renderBoolean("visible", textCellEditor.getVisible()));
		}
	}

	protected void renderWidth(ArrayList<String> renrederedAttributes, TextCellEditor textCellEditor) throws IOException {
		if (textCellEditor.getWidth() != null) {
			renrederedAttributes.add(renderString("width", textCellEditor.getWidth()));
		}
	}

	protected void renderX(ArrayList<String> renrederedAttributes, TextCellEditor textCellEditor) throws IOException {
		if (textCellEditor.getX() != null) {
			renrederedAttributes.add(renderNumber("x", textCellEditor.getX()));
		}
	}

	protected void renderXy(ArrayList<String> renrederedAttributes, TextCellEditor textCellEditor) throws IOException {
		if (textCellEditor.getXy() != null) {
			renrederedAttributes.add(renderArray("xy", textCellEditor.getXy()));
		}
	}

	protected void renderY(ArrayList<String> renrederedAttributes, TextCellEditor textCellEditor) throws IOException {
		if (textCellEditor.getY() != null) {
			renrederedAttributes.add(renderNumber("y", textCellEditor.getY()));
		}
	}

	protected void renderZIndex(ArrayList<String> renrederedAttributes, TextCellEditor textCellEditor) throws IOException {
		if (textCellEditor.getZIndex() != null) {
			renrederedAttributes.add(renderNumber("zIndex", textCellEditor.getZIndex()));
		}
	}

}
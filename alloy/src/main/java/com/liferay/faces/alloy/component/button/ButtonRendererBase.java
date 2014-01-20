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
package com.liferay.faces.alloy.component.button;

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
public abstract class ButtonRendererBase extends RendererBase {

	// Private Constants
	private static final String AUI_MODULE_NAME = "aui-button";

	protected void encodeJavaScriptMain(FacesContext facesContext, UIComponent uiComponent) throws IOException {

		Button button = (Button) uiComponent;

		ResponseWriter responseWriter = facesContext.getResponseWriter();

		responseWriter.write("var button = new A.Button");
		responseWriter.write(StringPool.OPEN_PARENTHESIS);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedAttributes = new ArrayList<String>();

		if (button.getBoundingBox() != null) {
			renderBoundingBox(renderedAttributes, button);
		}
		
		if (button.getContentBox() != null) {
			renderContentBox(renderedAttributes, button);
		}
		
		if (button.getCssClass() != null) {
			renderCssClass(renderedAttributes, button);
		}
		
		if (button.getDestroyed() != null) {
			renderDestroyed(renderedAttributes, button);
		}
		
		if (button.getDisabled() != null) {
			renderDisabled(renderedAttributes, button);
		}
		
		if (button.getFocused() != null) {
			renderFocused(renderedAttributes, button);
		}
		
		if (button.getHeight() != null) {
			renderHeight(renderedAttributes, button);
		}
		
		if (button.getIcon() != null) {
			renderIcon(renderedAttributes, button);
		}
		
		if (button.getIconAlign() != null) {
			renderIconAlign(renderedAttributes, button);
		}
		
		if (button.getIconElement() != null) {
			renderIconElement(renderedAttributes, button);
		}
		
		if (button.getButtonId() != null) {
			renderButtonId(renderedAttributes, button);
		}
		
		if (button.getInitialized() != null) {
			renderInitialized(renderedAttributes, button);
		}
		
		if (button.getLabel() != null) {
			renderLabel(renderedAttributes, button);
		}
		
		if (button.getButtonLocale() != null) {
			renderButtonLocale(renderedAttributes, button);
		}
		
		if (button.getPrimary() != null) {
			renderPrimary(renderedAttributes, button);
		}
		
		if (button.getRender() != null) {
			renderRender(renderedAttributes, button);
		}
		
		if (button.getRendered() != null) {
			renderRendered(renderedAttributes, button);
		}
		
		if (button.getSrcNode() != null) {
			renderSrcNode(renderedAttributes, button);
		}
		
		if (button.getStrings() != null) {
			renderStrings(renderedAttributes, button);
		}
		
		if (button.getTabIndex() != null) {
			renderTabIndex(renderedAttributes, button);
		}
		
		if (button.getVisible() != null) {
			renderVisible(renderedAttributes, button);
		}
		
		if (button.getWidth() != null) {
			renderWidth(renderedAttributes, button);
		}
		

		for (String renderedAttribute : renderedAttributes) {
			responseWriter.write(renderedAttribute);
			responseWriter.write(StringPool.COMMA);
		}

		responseWriter.write("after");
		responseWriter.write(StringPool.COLON);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedAfterEvents = new ArrayList<String>();

		if (button.getAfterBoundingBoxChange() != null) {
			renderAfterBoundingBoxChange(renderedAfterEvents, button);
		}
		
		if (button.getAfterContentBoxChange() != null) {
			renderAfterContentBoxChange(renderedAfterEvents, button);
		}
		
		if (button.getAfterCssClassChange() != null) {
			renderAfterCssClassChange(renderedAfterEvents, button);
		}
		
		if (button.getAfterDestroyedChange() != null) {
			renderAfterDestroyedChange(renderedAfterEvents, button);
		}
		
		if (button.getAfterDisabledChange() != null) {
			renderAfterDisabledChange(renderedAfterEvents, button);
		}
		
		if (button.getAfterFocusedChange() != null) {
			renderAfterFocusedChange(renderedAfterEvents, button);
		}
		
		if (button.getAfterHeightChange() != null) {
			renderAfterHeightChange(renderedAfterEvents, button);
		}
		
		if (button.getAfterIconChange() != null) {
			renderAfterIconChange(renderedAfterEvents, button);
		}
		
		if (button.getAfterIconAlignChange() != null) {
			renderAfterIconAlignChange(renderedAfterEvents, button);
		}
		
		if (button.getAfterIconElementChange() != null) {
			renderAfterIconElementChange(renderedAfterEvents, button);
		}
		
		if (button.getAfterIdChange() != null) {
			renderAfterIdChange(renderedAfterEvents, button);
		}
		
		if (button.getAfterInitializedChange() != null) {
			renderAfterInitializedChange(renderedAfterEvents, button);
		}
		
		if (button.getAfterLabelChange() != null) {
			renderAfterLabelChange(renderedAfterEvents, button);
		}
		
		if (button.getAfterLocaleChange() != null) {
			renderAfterLocaleChange(renderedAfterEvents, button);
		}
		
		if (button.getAfterPrimaryChange() != null) {
			renderAfterPrimaryChange(renderedAfterEvents, button);
		}
		
		if (button.getAfterRenderChange() != null) {
			renderAfterRenderChange(renderedAfterEvents, button);
		}
		
		if (button.getAfterRenderedChange() != null) {
			renderAfterRenderedChange(renderedAfterEvents, button);
		}
		
		if (button.getAfterSrcNodeChange() != null) {
			renderAfterSrcNodeChange(renderedAfterEvents, button);
		}
		
		if (button.getAfterStringsChange() != null) {
			renderAfterStringsChange(renderedAfterEvents, button);
		}
		
		if (button.getAfterTabIndexChange() != null) {
			renderAfterTabIndexChange(renderedAfterEvents, button);
		}
		
		if (button.getAfterVisibleChange() != null) {
			renderAfterVisibleChange(renderedAfterEvents, button);
		}
		
		if (button.getAfterWidthChange() != null) {
			renderAfterWidthChange(renderedAfterEvents, button);
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

		if (button.getOnBoundingBoxChange() != null) {
			renderOnBoundingBoxChange(renderedOnEvents, button);
		}
		
		if (button.getOnContentBoxChange() != null) {
			renderOnContentBoxChange(renderedOnEvents, button);
		}
		
		if (button.getOnCssClassChange() != null) {
			renderOnCssClassChange(renderedOnEvents, button);
		}
		
		if (button.getOnDestroyedChange() != null) {
			renderOnDestroyedChange(renderedOnEvents, button);
		}
		
		if (button.getOnDisabledChange() != null) {
			renderOnDisabledChange(renderedOnEvents, button);
		}
		
		if (button.getOnFocusedChange() != null) {
			renderOnFocusedChange(renderedOnEvents, button);
		}
		
		if (button.getOnHeightChange() != null) {
			renderOnHeightChange(renderedOnEvents, button);
		}
		
		if (button.getOnIconChange() != null) {
			renderOnIconChange(renderedOnEvents, button);
		}
		
		if (button.getOnIconAlignChange() != null) {
			renderOnIconAlignChange(renderedOnEvents, button);
		}
		
		if (button.getOnIconElementChange() != null) {
			renderOnIconElementChange(renderedOnEvents, button);
		}
		
		if (button.getOnIdChange() != null) {
			renderOnIdChange(renderedOnEvents, button);
		}
		
		if (button.getOnInitializedChange() != null) {
			renderOnInitializedChange(renderedOnEvents, button);
		}
		
		if (button.getOnLabelChange() != null) {
			renderOnLabelChange(renderedOnEvents, button);
		}
		
		if (button.getOnLocaleChange() != null) {
			renderOnLocaleChange(renderedOnEvents, button);
		}
		
		if (button.getOnPrimaryChange() != null) {
			renderOnPrimaryChange(renderedOnEvents, button);
		}
		
		if (button.getOnRenderChange() != null) {
			renderOnRenderChange(renderedOnEvents, button);
		}
		
		if (button.getOnRenderedChange() != null) {
			renderOnRenderedChange(renderedOnEvents, button);
		}
		
		if (button.getOnSrcNodeChange() != null) {
			renderOnSrcNodeChange(renderedOnEvents, button);
		}
		
		if (button.getOnStringsChange() != null) {
			renderOnStringsChange(renderedOnEvents, button);
		}
		
		if (button.getOnTabIndexChange() != null) {
			renderOnTabIndexChange(renderedOnEvents, button);
		}
		
		if (button.getOnVisibleChange() != null) {
			renderOnVisibleChange(renderedOnEvents, button);
		}
		
		if (button.getOnWidthChange() != null) {
			renderOnWidthChange(renderedOnEvents, button);
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

	protected void renderBoundingBox(List<String> renderedAttributes, Button button) throws IOException {
		java.lang.String boundingBox = button.getBoundingBox();
		renderedAttributes.add(renderString(Button.BOUNDING_BOX, boundingBox));
	}

	protected void renderContentBox(List<String> renderedAttributes, Button button) throws IOException {
		java.lang.String contentBox = button.getContentBox();
		renderedAttributes.add(renderString(Button.CONTENT_BOX, contentBox));
	}

	protected void renderCssClass(List<String> renderedAttributes, Button button) throws IOException {
		java.lang.String cssClass = button.getCssClass();
		renderedAttributes.add(renderString(Button.CSS_CLASS, cssClass));
	}

	protected void renderDestroyed(List<String> renderedAttributes, Button button) throws IOException {
		java.lang.Boolean destroyed = button.getDestroyed();
		renderedAttributes.add(renderBoolean(Button.DESTROYED, destroyed));
	}

	protected void renderDisabled(List<String> renderedAttributes, Button button) throws IOException {
		java.lang.Boolean disabled = button.getDisabled();
		renderedAttributes.add(renderBoolean(Button.DISABLED, disabled));
	}

	protected void renderFocused(List<String> renderedAttributes, Button button) throws IOException {
		java.lang.Boolean focused = button.getFocused();
		renderedAttributes.add(renderBoolean(Button.FOCUSED, focused));
	}

	protected void renderHeight(List<String> renderedAttributes, Button button) throws IOException {
		java.lang.Object height = button.getHeight();
		renderedAttributes.add(renderString(Button.HEIGHT, height));
	}

	protected void renderIcon(List<String> renderedAttributes, Button button) throws IOException {
		java.lang.String icon = button.getIcon();
		renderedAttributes.add(renderString(Button.ICON, icon));
	}

	protected void renderIconAlign(List<String> renderedAttributes, Button button) throws IOException {
		java.lang.String iconAlign = button.getIconAlign();
		renderedAttributes.add(renderString(Button.ICON_ALIGN, iconAlign));
	}

	protected void renderIconElement(List<String> renderedAttributes, Button button) throws IOException {
		java.lang.String iconElement = button.getIconElement();
		renderedAttributes.add(renderString(Button.ICON_ELEMENT, iconElement));
	}

	protected void renderButtonId(List<String> renderedAttributes, Button button) throws IOException {
		java.lang.String buttonId = button.getButtonId();
		renderedAttributes.add(renderString(Button.BUTTON_ID, buttonId));
	}

	protected void renderInitialized(List<String> renderedAttributes, Button button) throws IOException {
		java.lang.Boolean initialized = button.getInitialized();
		renderedAttributes.add(renderBoolean(Button.INITIALIZED, initialized));
	}

	protected void renderLabel(List<String> renderedAttributes, Button button) throws IOException {
		java.lang.String label = button.getLabel();
		renderedAttributes.add(renderString(Button.LABEL, label));
	}

	protected void renderButtonLocale(List<String> renderedAttributes, Button button) throws IOException {
		java.lang.String buttonLocale = button.getButtonLocale();
		renderedAttributes.add(renderString(Button.BUTTON_LOCALE, buttonLocale));
	}

	protected void renderPrimary(List<String> renderedAttributes, Button button) throws IOException {
		java.lang.Boolean primary = button.getPrimary();
		renderedAttributes.add(renderBoolean(Button.PRIMARY, primary));
	}

	protected void renderRender(List<String> renderedAttributes, Button button) throws IOException {
		java.lang.Object render = button.getRender();
		renderedAttributes.add(renderString(Button.RENDER, render));
	}

	protected void renderRendered(List<String> renderedAttributes, Button button) throws IOException {
		java.lang.Boolean rendered = button.getRendered();
		renderedAttributes.add(renderBoolean(Button.RENDERED, rendered));
	}

	protected void renderSrcNode(List<String> renderedAttributes, Button button) throws IOException {
		java.lang.String srcNode = button.getSrcNode();
		renderedAttributes.add(renderString(Button.SRC_NODE, srcNode));
	}

	protected void renderStrings(List<String> renderedAttributes, Button button) throws IOException {
		java.lang.Object strings = button.getStrings();
		renderedAttributes.add(renderObject(Button.STRINGS, strings));
	}

	protected void renderTabIndex(List<String> renderedAttributes, Button button) throws IOException {
		java.lang.Object tabIndex = button.getTabIndex();
		renderedAttributes.add(renderNumber(Button.TAB_INDEX, tabIndex));
	}

	protected void renderVisible(List<String> renderedAttributes, Button button) throws IOException {
		java.lang.Boolean visible = button.getVisible();
		renderedAttributes.add(renderBoolean(Button.VISIBLE, visible));
	}

	protected void renderWidth(List<String> renderedAttributes, Button button) throws IOException {
		java.lang.Object width = button.getWidth();
		renderedAttributes.add(renderString(Button.WIDTH, width));
	}

	protected void renderAfterBoundingBoxChange(List<String> renderedAttributes, Button button) throws IOException {
		java.lang.String afterBoundingBoxChange = button.getAfterBoundingBoxChange();
		renderedAttributes.add(renderString(Button.AFTER_BOUNDING_BOX_CHANGE, afterBoundingBoxChange));
	}

	protected void renderAfterContentBoxChange(List<String> renderedAttributes, Button button) throws IOException {
		java.lang.String afterContentBoxChange = button.getAfterContentBoxChange();
		renderedAttributes.add(renderString(Button.AFTER_CONTENT_BOX_CHANGE, afterContentBoxChange));
	}

	protected void renderAfterCssClassChange(List<String> renderedAttributes, Button button) throws IOException {
		java.lang.String afterCssClassChange = button.getAfterCssClassChange();
		renderedAttributes.add(renderString(Button.AFTER_CSS_CLASS_CHANGE, afterCssClassChange));
	}

	protected void renderAfterDestroyedChange(List<String> renderedAttributes, Button button) throws IOException {
		java.lang.String afterDestroyedChange = button.getAfterDestroyedChange();
		renderedAttributes.add(renderString(Button.AFTER_DESTROYED_CHANGE, afterDestroyedChange));
	}

	protected void renderAfterDisabledChange(List<String> renderedAttributes, Button button) throws IOException {
		java.lang.String afterDisabledChange = button.getAfterDisabledChange();
		renderedAttributes.add(renderString(Button.AFTER_DISABLED_CHANGE, afterDisabledChange));
	}

	protected void renderAfterFocusedChange(List<String> renderedAttributes, Button button) throws IOException {
		java.lang.String afterFocusedChange = button.getAfterFocusedChange();
		renderedAttributes.add(renderString(Button.AFTER_FOCUSED_CHANGE, afterFocusedChange));
	}

	protected void renderAfterHeightChange(List<String> renderedAttributes, Button button) throws IOException {
		java.lang.String afterHeightChange = button.getAfterHeightChange();
		renderedAttributes.add(renderString(Button.AFTER_HEIGHT_CHANGE, afterHeightChange));
	}

	protected void renderAfterIconChange(List<String> renderedAttributes, Button button) throws IOException {
		java.lang.String afterIconChange = button.getAfterIconChange();
		renderedAttributes.add(renderString(Button.AFTER_ICON_CHANGE, afterIconChange));
	}

	protected void renderAfterIconAlignChange(List<String> renderedAttributes, Button button) throws IOException {
		java.lang.String afterIconAlignChange = button.getAfterIconAlignChange();
		renderedAttributes.add(renderString(Button.AFTER_ICON_ALIGN_CHANGE, afterIconAlignChange));
	}

	protected void renderAfterIconElementChange(List<String> renderedAttributes, Button button) throws IOException {
		java.lang.String afterIconElementChange = button.getAfterIconElementChange();
		renderedAttributes.add(renderString(Button.AFTER_ICON_ELEMENT_CHANGE, afterIconElementChange));
	}

	protected void renderAfterIdChange(List<String> renderedAttributes, Button button) throws IOException {
		java.lang.String afterIdChange = button.getAfterIdChange();
		renderedAttributes.add(renderString(Button.AFTER_ID_CHANGE, afterIdChange));
	}

	protected void renderAfterInitializedChange(List<String> renderedAttributes, Button button) throws IOException {
		java.lang.String afterInitializedChange = button.getAfterInitializedChange();
		renderedAttributes.add(renderString(Button.AFTER_INITIALIZED_CHANGE, afterInitializedChange));
	}

	protected void renderAfterLabelChange(List<String> renderedAttributes, Button button) throws IOException {
		java.lang.String afterLabelChange = button.getAfterLabelChange();
		renderedAttributes.add(renderString(Button.AFTER_LABEL_CHANGE, afterLabelChange));
	}

	protected void renderAfterLocaleChange(List<String> renderedAttributes, Button button) throws IOException {
		java.lang.String afterLocaleChange = button.getAfterLocaleChange();
		renderedAttributes.add(renderString(Button.AFTER_LOCALE_CHANGE, afterLocaleChange));
	}

	protected void renderAfterPrimaryChange(List<String> renderedAttributes, Button button) throws IOException {
		java.lang.String afterPrimaryChange = button.getAfterPrimaryChange();
		renderedAttributes.add(renderString(Button.AFTER_PRIMARY_CHANGE, afterPrimaryChange));
	}

	protected void renderAfterRenderChange(List<String> renderedAttributes, Button button) throws IOException {
		java.lang.String afterRenderChange = button.getAfterRenderChange();
		renderedAttributes.add(renderString(Button.AFTER_RENDER_CHANGE, afterRenderChange));
	}

	protected void renderAfterRenderedChange(List<String> renderedAttributes, Button button) throws IOException {
		java.lang.String afterRenderedChange = button.getAfterRenderedChange();
		renderedAttributes.add(renderString(Button.AFTER_RENDERED_CHANGE, afterRenderedChange));
	}

	protected void renderAfterSrcNodeChange(List<String> renderedAttributes, Button button) throws IOException {
		java.lang.String afterSrcNodeChange = button.getAfterSrcNodeChange();
		renderedAttributes.add(renderString(Button.AFTER_SRC_NODE_CHANGE, afterSrcNodeChange));
	}

	protected void renderAfterStringsChange(List<String> renderedAttributes, Button button) throws IOException {
		java.lang.String afterStringsChange = button.getAfterStringsChange();
		renderedAttributes.add(renderString(Button.AFTER_STRINGS_CHANGE, afterStringsChange));
	}

	protected void renderAfterTabIndexChange(List<String> renderedAttributes, Button button) throws IOException {
		java.lang.String afterTabIndexChange = button.getAfterTabIndexChange();
		renderedAttributes.add(renderString(Button.AFTER_TAB_INDEX_CHANGE, afterTabIndexChange));
	}

	protected void renderAfterVisibleChange(List<String> renderedAttributes, Button button) throws IOException {
		java.lang.String afterVisibleChange = button.getAfterVisibleChange();
		renderedAttributes.add(renderString(Button.AFTER_VISIBLE_CHANGE, afterVisibleChange));
	}

	protected void renderAfterWidthChange(List<String> renderedAttributes, Button button) throws IOException {
		java.lang.String afterWidthChange = button.getAfterWidthChange();
		renderedAttributes.add(renderString(Button.AFTER_WIDTH_CHANGE, afterWidthChange));
	}

	protected void renderOnBoundingBoxChange(List<String> renderedAttributes, Button button) throws IOException {
		java.lang.String onBoundingBoxChange = button.getOnBoundingBoxChange();
		renderedAttributes.add(renderString(Button.ON_BOUNDING_BOX_CHANGE, onBoundingBoxChange));
	}

	protected void renderOnContentBoxChange(List<String> renderedAttributes, Button button) throws IOException {
		java.lang.String onContentBoxChange = button.getOnContentBoxChange();
		renderedAttributes.add(renderString(Button.ON_CONTENT_BOX_CHANGE, onContentBoxChange));
	}

	protected void renderOnCssClassChange(List<String> renderedAttributes, Button button) throws IOException {
		java.lang.String onCssClassChange = button.getOnCssClassChange();
		renderedAttributes.add(renderString(Button.ON_CSS_CLASS_CHANGE, onCssClassChange));
	}

	protected void renderOnDestroyedChange(List<String> renderedAttributes, Button button) throws IOException {
		java.lang.String onDestroyedChange = button.getOnDestroyedChange();
		renderedAttributes.add(renderString(Button.ON_DESTROYED_CHANGE, onDestroyedChange));
	}

	protected void renderOnDisabledChange(List<String> renderedAttributes, Button button) throws IOException {
		java.lang.String onDisabledChange = button.getOnDisabledChange();
		renderedAttributes.add(renderString(Button.ON_DISABLED_CHANGE, onDisabledChange));
	}

	protected void renderOnFocusedChange(List<String> renderedAttributes, Button button) throws IOException {
		java.lang.String onFocusedChange = button.getOnFocusedChange();
		renderedAttributes.add(renderString(Button.ON_FOCUSED_CHANGE, onFocusedChange));
	}

	protected void renderOnHeightChange(List<String> renderedAttributes, Button button) throws IOException {
		java.lang.String onHeightChange = button.getOnHeightChange();
		renderedAttributes.add(renderString(Button.ON_HEIGHT_CHANGE, onHeightChange));
	}

	protected void renderOnIconChange(List<String> renderedAttributes, Button button) throws IOException {
		java.lang.String onIconChange = button.getOnIconChange();
		renderedAttributes.add(renderString(Button.ON_ICON_CHANGE, onIconChange));
	}

	protected void renderOnIconAlignChange(List<String> renderedAttributes, Button button) throws IOException {
		java.lang.String onIconAlignChange = button.getOnIconAlignChange();
		renderedAttributes.add(renderString(Button.ON_ICON_ALIGN_CHANGE, onIconAlignChange));
	}

	protected void renderOnIconElementChange(List<String> renderedAttributes, Button button) throws IOException {
		java.lang.String onIconElementChange = button.getOnIconElementChange();
		renderedAttributes.add(renderString(Button.ON_ICON_ELEMENT_CHANGE, onIconElementChange));
	}

	protected void renderOnIdChange(List<String> renderedAttributes, Button button) throws IOException {
		java.lang.String onIdChange = button.getOnIdChange();
		renderedAttributes.add(renderString(Button.ON_ID_CHANGE, onIdChange));
	}

	protected void renderOnInitializedChange(List<String> renderedAttributes, Button button) throws IOException {
		java.lang.String onInitializedChange = button.getOnInitializedChange();
		renderedAttributes.add(renderString(Button.ON_INITIALIZED_CHANGE, onInitializedChange));
	}

	protected void renderOnLabelChange(List<String> renderedAttributes, Button button) throws IOException {
		java.lang.String onLabelChange = button.getOnLabelChange();
		renderedAttributes.add(renderString(Button.ON_LABEL_CHANGE, onLabelChange));
	}

	protected void renderOnLocaleChange(List<String> renderedAttributes, Button button) throws IOException {
		java.lang.String onLocaleChange = button.getOnLocaleChange();
		renderedAttributes.add(renderString(Button.ON_LOCALE_CHANGE, onLocaleChange));
	}

	protected void renderOnPrimaryChange(List<String> renderedAttributes, Button button) throws IOException {
		java.lang.String onPrimaryChange = button.getOnPrimaryChange();
		renderedAttributes.add(renderString(Button.ON_PRIMARY_CHANGE, onPrimaryChange));
	}

	protected void renderOnRenderChange(List<String> renderedAttributes, Button button) throws IOException {
		java.lang.String onRenderChange = button.getOnRenderChange();
		renderedAttributes.add(renderString(Button.ON_RENDER_CHANGE, onRenderChange));
	}

	protected void renderOnRenderedChange(List<String> renderedAttributes, Button button) throws IOException {
		java.lang.String onRenderedChange = button.getOnRenderedChange();
		renderedAttributes.add(renderString(Button.ON_RENDERED_CHANGE, onRenderedChange));
	}

	protected void renderOnSrcNodeChange(List<String> renderedAttributes, Button button) throws IOException {
		java.lang.String onSrcNodeChange = button.getOnSrcNodeChange();
		renderedAttributes.add(renderString(Button.ON_SRC_NODE_CHANGE, onSrcNodeChange));
	}

	protected void renderOnStringsChange(List<String> renderedAttributes, Button button) throws IOException {
		java.lang.String onStringsChange = button.getOnStringsChange();
		renderedAttributes.add(renderString(Button.ON_STRINGS_CHANGE, onStringsChange));
	}

	protected void renderOnTabIndexChange(List<String> renderedAttributes, Button button) throws IOException {
		java.lang.String onTabIndexChange = button.getOnTabIndexChange();
		renderedAttributes.add(renderString(Button.ON_TAB_INDEX_CHANGE, onTabIndexChange));
	}

	protected void renderOnVisibleChange(List<String> renderedAttributes, Button button) throws IOException {
		java.lang.String onVisibleChange = button.getOnVisibleChange();
		renderedAttributes.add(renderString(Button.ON_VISIBLE_CHANGE, onVisibleChange));
	}

	protected void renderOnWidthChange(List<String> renderedAttributes, Button button) throws IOException {
		java.lang.String onWidthChange = button.getOnWidthChange();
		renderedAttributes.add(renderString(Button.ON_WIDTH_CHANGE, onWidthChange));
	}

}
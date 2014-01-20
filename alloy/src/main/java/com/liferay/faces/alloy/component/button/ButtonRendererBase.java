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

		renderBoundingBox(renderedAttributes, button);
		renderContentBox(renderedAttributes, button);
		renderCssClass(renderedAttributes, button);
		renderDestroyed(renderedAttributes, button);
		renderDisabled(renderedAttributes, button);
		renderFocused(renderedAttributes, button);
		renderHeight(renderedAttributes, button);
		renderIcon(renderedAttributes, button);
		renderIconAlign(renderedAttributes, button);
		renderIconElement(renderedAttributes, button);
		renderButtonId(renderedAttributes, button);
		renderInitialized(renderedAttributes, button);
		renderLabel(renderedAttributes, button);
		renderButtonLocale(renderedAttributes, button);
		renderPrimary(renderedAttributes, button);
		renderRender(renderedAttributes, button);
		renderRendered(renderedAttributes, button);
		renderSrcNode(renderedAttributes, button);
		renderStrings(renderedAttributes, button);
		renderTabIndex(renderedAttributes, button);
		renderVisible(renderedAttributes, button);
		renderWidth(renderedAttributes, button);

		for (String renderedAttribute : renderedAttributes) {
			responseWriter.write(renderedAttribute);
			responseWriter.write(StringPool.COMMA);
		}

		responseWriter.write("after");
		responseWriter.write(StringPool.COLON);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedAfterEvents = new ArrayList<String>();

		renderAfterBoundingBoxChange(renderedAfterEvents, button);
		renderAfterContentBoxChange(renderedAfterEvents, button);
		renderAfterCssClassChange(renderedAfterEvents, button);
		renderAfterDestroyedChange(renderedAfterEvents, button);
		renderAfterDisabledChange(renderedAfterEvents, button);
		renderAfterFocusedChange(renderedAfterEvents, button);
		renderAfterHeightChange(renderedAfterEvents, button);
		renderAfterIconChange(renderedAfterEvents, button);
		renderAfterIconAlignChange(renderedAfterEvents, button);
		renderAfterIconElementChange(renderedAfterEvents, button);
		renderAfterIdChange(renderedAfterEvents, button);
		renderAfterInitializedChange(renderedAfterEvents, button);
		renderAfterLabelChange(renderedAfterEvents, button);
		renderAfterLocaleChange(renderedAfterEvents, button);
		renderAfterPrimaryChange(renderedAfterEvents, button);
		renderAfterRenderChange(renderedAfterEvents, button);
		renderAfterRenderedChange(renderedAfterEvents, button);
		renderAfterSrcNodeChange(renderedAfterEvents, button);
		renderAfterStringsChange(renderedAfterEvents, button);
		renderAfterTabIndexChange(renderedAfterEvents, button);
		renderAfterVisibleChange(renderedAfterEvents, button);
		renderAfterWidthChange(renderedAfterEvents, button);

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

		renderOnBoundingBoxChange(renderedOnEvents, button);
		renderOnContentBoxChange(renderedOnEvents, button);
		renderOnCssClassChange(renderedOnEvents, button);
		renderOnDestroyedChange(renderedOnEvents, button);
		renderOnDisabledChange(renderedOnEvents, button);
		renderOnFocusedChange(renderedOnEvents, button);
		renderOnHeightChange(renderedOnEvents, button);
		renderOnIconChange(renderedOnEvents, button);
		renderOnIconAlignChange(renderedOnEvents, button);
		renderOnIconElementChange(renderedOnEvents, button);
		renderOnIdChange(renderedOnEvents, button);
		renderOnInitializedChange(renderedOnEvents, button);
		renderOnLabelChange(renderedOnEvents, button);
		renderOnLocaleChange(renderedOnEvents, button);
		renderOnPrimaryChange(renderedOnEvents, button);
		renderOnRenderChange(renderedOnEvents, button);
		renderOnRenderedChange(renderedOnEvents, button);
		renderOnSrcNodeChange(renderedOnEvents, button);
		renderOnStringsChange(renderedOnEvents, button);
		renderOnTabIndexChange(renderedOnEvents, button);
		renderOnVisibleChange(renderedOnEvents, button);
		renderOnWidthChange(renderedOnEvents, button);

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

		if (boundingBox != null) {
			renderedAttributes.add(renderString(Button.BOUNDING_BOX, boundingBox));
		}
	}

	protected void renderContentBox(List<String> renderedAttributes, Button button) throws IOException {
		java.lang.String contentBox = button.getContentBox();

		if (contentBox != null) {
			renderedAttributes.add(renderString(Button.CONTENT_BOX, contentBox));
		}
	}

	protected void renderCssClass(List<String> renderedAttributes, Button button) throws IOException {
		java.lang.String cssClass = button.getCssClass();

		if (cssClass != null) {
			renderedAttributes.add(renderString(Button.CSS_CLASS, cssClass));
		}
	}

	protected void renderDestroyed(List<String> renderedAttributes, Button button) throws IOException {
		java.lang.Boolean destroyed = button.getDestroyed();

		if (destroyed != null) {
			renderedAttributes.add(renderBoolean(Button.DESTROYED, destroyed));
		}
	}

	protected void renderDisabled(List<String> renderedAttributes, Button button) throws IOException {
		java.lang.Boolean disabled = button.getDisabled();

		if (disabled != null) {
			renderedAttributes.add(renderBoolean(Button.DISABLED, disabled));
		}
	}

	protected void renderFocused(List<String> renderedAttributes, Button button) throws IOException {
		java.lang.Boolean focused = button.getFocused();

		if (focused != null) {
			renderedAttributes.add(renderBoolean(Button.FOCUSED, focused));
		}
	}

	protected void renderHeight(List<String> renderedAttributes, Button button) throws IOException {
		java.lang.Object height = button.getHeight();

		if (height != null) {
			renderedAttributes.add(renderString(Button.HEIGHT, height));
		}
	}

	protected void renderIcon(List<String> renderedAttributes, Button button) throws IOException {
		java.lang.String icon = button.getIcon();

		if (icon != null) {
			renderedAttributes.add(renderString(Button.ICON, icon));
		}
	}

	protected void renderIconAlign(List<String> renderedAttributes, Button button) throws IOException {
		java.lang.String iconAlign = button.getIconAlign();

		if (iconAlign != null) {
			renderedAttributes.add(renderString(Button.ICON_ALIGN, iconAlign));
		}
	}

	protected void renderIconElement(List<String> renderedAttributes, Button button) throws IOException {
		java.lang.String iconElement = button.getIconElement();

		if (iconElement != null) {
			renderedAttributes.add(renderString(Button.ICON_ELEMENT, iconElement));
		}
	}

	protected void renderButtonId(List<String> renderedAttributes, Button button) throws IOException {
		java.lang.String buttonId = button.getButtonId();

		if (buttonId != null) {
			renderedAttributes.add(renderString(Button.BUTTON_ID, buttonId));
		}
	}

	protected void renderInitialized(List<String> renderedAttributes, Button button) throws IOException {
		java.lang.Boolean initialized = button.getInitialized();

		if (initialized != null) {
			renderedAttributes.add(renderBoolean(Button.INITIALIZED, initialized));
		}
	}

	protected void renderLabel(List<String> renderedAttributes, Button button) throws IOException {
		java.lang.String label = button.getLabel();

		if (label != null) {
			renderedAttributes.add(renderString(Button.LABEL, label));
		}
	}

	protected void renderButtonLocale(List<String> renderedAttributes, Button button) throws IOException {
		java.lang.String buttonLocale = button.getButtonLocale();

		if (buttonLocale != null) {
			renderedAttributes.add(renderString(Button.BUTTON_LOCALE, buttonLocale));
		}
	}

	protected void renderPrimary(List<String> renderedAttributes, Button button) throws IOException {
		java.lang.Boolean primary = button.getPrimary();

		if (primary != null) {
			renderedAttributes.add(renderBoolean(Button.PRIMARY, primary));
		}
	}

	protected void renderRender(List<String> renderedAttributes, Button button) throws IOException {
		java.lang.Object render = button.getRender();

		if (render != null) {
			renderedAttributes.add(renderString(Button.RENDER, render));
		}
	}

	protected void renderRendered(List<String> renderedAttributes, Button button) throws IOException {
		java.lang.Boolean rendered = button.getRendered();

		if (rendered != null) {
			renderedAttributes.add(renderBoolean(Button.RENDERED, rendered));
		}
	}

	protected void renderSrcNode(List<String> renderedAttributes, Button button) throws IOException {
		java.lang.String srcNode = button.getSrcNode();

		if (srcNode != null) {
			renderedAttributes.add(renderString(Button.SRC_NODE, srcNode));
		}
	}

	protected void renderStrings(List<String> renderedAttributes, Button button) throws IOException {
		java.lang.Object strings = button.getStrings();

		if (strings != null) {
			renderedAttributes.add(renderObject(Button.STRINGS, strings));
		}
	}

	protected void renderTabIndex(List<String> renderedAttributes, Button button) throws IOException {
		java.lang.Object tabIndex = button.getTabIndex();

		if (tabIndex != null) {
			renderedAttributes.add(renderNumber(Button.TAB_INDEX, tabIndex));
		}
	}

	protected void renderVisible(List<String> renderedAttributes, Button button) throws IOException {
		java.lang.Boolean visible = button.getVisible();

		if (visible != null) {
			renderedAttributes.add(renderBoolean(Button.VISIBLE, visible));
		}
	}

	protected void renderWidth(List<String> renderedAttributes, Button button) throws IOException {
		java.lang.Object width = button.getWidth();

		if (width != null) {
			renderedAttributes.add(renderString(Button.WIDTH, width));
		}
	}

	protected void renderAfterBoundingBoxChange(List<String> renderedAttributes, Button button) throws IOException {
		java.lang.String afterBoundingBoxChange = button.getAfterBoundingBoxChange();

		if (afterBoundingBoxChange != null) {
			renderedAttributes.add(renderString(Button.AFTER_BOUNDING_BOX_CHANGE, afterBoundingBoxChange));
		}
	}

	protected void renderAfterContentBoxChange(List<String> renderedAttributes, Button button) throws IOException {
		java.lang.String afterContentBoxChange = button.getAfterContentBoxChange();

		if (afterContentBoxChange != null) {
			renderedAttributes.add(renderString(Button.AFTER_CONTENT_BOX_CHANGE, afterContentBoxChange));
		}
	}

	protected void renderAfterCssClassChange(List<String> renderedAttributes, Button button) throws IOException {
		java.lang.String afterCssClassChange = button.getAfterCssClassChange();

		if (afterCssClassChange != null) {
			renderedAttributes.add(renderString(Button.AFTER_CSS_CLASS_CHANGE, afterCssClassChange));
		}
	}

	protected void renderAfterDestroyedChange(List<String> renderedAttributes, Button button) throws IOException {
		java.lang.String afterDestroyedChange = button.getAfterDestroyedChange();

		if (afterDestroyedChange != null) {
			renderedAttributes.add(renderString(Button.AFTER_DESTROYED_CHANGE, afterDestroyedChange));
		}
	}

	protected void renderAfterDisabledChange(List<String> renderedAttributes, Button button) throws IOException {
		java.lang.String afterDisabledChange = button.getAfterDisabledChange();

		if (afterDisabledChange != null) {
			renderedAttributes.add(renderString(Button.AFTER_DISABLED_CHANGE, afterDisabledChange));
		}
	}

	protected void renderAfterFocusedChange(List<String> renderedAttributes, Button button) throws IOException {
		java.lang.String afterFocusedChange = button.getAfterFocusedChange();

		if (afterFocusedChange != null) {
			renderedAttributes.add(renderString(Button.AFTER_FOCUSED_CHANGE, afterFocusedChange));
		}
	}

	protected void renderAfterHeightChange(List<String> renderedAttributes, Button button) throws IOException {
		java.lang.String afterHeightChange = button.getAfterHeightChange();

		if (afterHeightChange != null) {
			renderedAttributes.add(renderString(Button.AFTER_HEIGHT_CHANGE, afterHeightChange));
		}
	}

	protected void renderAfterIconChange(List<String> renderedAttributes, Button button) throws IOException {
		java.lang.String afterIconChange = button.getAfterIconChange();

		if (afterIconChange != null) {
			renderedAttributes.add(renderString(Button.AFTER_ICON_CHANGE, afterIconChange));
		}
	}

	protected void renderAfterIconAlignChange(List<String> renderedAttributes, Button button) throws IOException {
		java.lang.String afterIconAlignChange = button.getAfterIconAlignChange();

		if (afterIconAlignChange != null) {
			renderedAttributes.add(renderString(Button.AFTER_ICON_ALIGN_CHANGE, afterIconAlignChange));
		}
	}

	protected void renderAfterIconElementChange(List<String> renderedAttributes, Button button) throws IOException {
		java.lang.String afterIconElementChange = button.getAfterIconElementChange();

		if (afterIconElementChange != null) {
			renderedAttributes.add(renderString(Button.AFTER_ICON_ELEMENT_CHANGE, afterIconElementChange));
		}
	}

	protected void renderAfterIdChange(List<String> renderedAttributes, Button button) throws IOException {
		java.lang.String afterIdChange = button.getAfterIdChange();

		if (afterIdChange != null) {
			renderedAttributes.add(renderString(Button.AFTER_ID_CHANGE, afterIdChange));
		}
	}

	protected void renderAfterInitializedChange(List<String> renderedAttributes, Button button) throws IOException {
		java.lang.String afterInitializedChange = button.getAfterInitializedChange();

		if (afterInitializedChange != null) {
			renderedAttributes.add(renderString(Button.AFTER_INITIALIZED_CHANGE, afterInitializedChange));
		}
	}

	protected void renderAfterLabelChange(List<String> renderedAttributes, Button button) throws IOException {
		java.lang.String afterLabelChange = button.getAfterLabelChange();

		if (afterLabelChange != null) {
			renderedAttributes.add(renderString(Button.AFTER_LABEL_CHANGE, afterLabelChange));
		}
	}

	protected void renderAfterLocaleChange(List<String> renderedAttributes, Button button) throws IOException {
		java.lang.String afterLocaleChange = button.getAfterLocaleChange();

		if (afterLocaleChange != null) {
			renderedAttributes.add(renderString(Button.AFTER_LOCALE_CHANGE, afterLocaleChange));
		}
	}

	protected void renderAfterPrimaryChange(List<String> renderedAttributes, Button button) throws IOException {
		java.lang.String afterPrimaryChange = button.getAfterPrimaryChange();

		if (afterPrimaryChange != null) {
			renderedAttributes.add(renderString(Button.AFTER_PRIMARY_CHANGE, afterPrimaryChange));
		}
	}

	protected void renderAfterRenderChange(List<String> renderedAttributes, Button button) throws IOException {
		java.lang.String afterRenderChange = button.getAfterRenderChange();

		if (afterRenderChange != null) {
			renderedAttributes.add(renderString(Button.AFTER_RENDER_CHANGE, afterRenderChange));
		}
	}

	protected void renderAfterRenderedChange(List<String> renderedAttributes, Button button) throws IOException {
		java.lang.String afterRenderedChange = button.getAfterRenderedChange();

		if (afterRenderedChange != null) {
			renderedAttributes.add(renderString(Button.AFTER_RENDERED_CHANGE, afterRenderedChange));
		}
	}

	protected void renderAfterSrcNodeChange(List<String> renderedAttributes, Button button) throws IOException {
		java.lang.String afterSrcNodeChange = button.getAfterSrcNodeChange();

		if (afterSrcNodeChange != null) {
			renderedAttributes.add(renderString(Button.AFTER_SRC_NODE_CHANGE, afterSrcNodeChange));
		}
	}

	protected void renderAfterStringsChange(List<String> renderedAttributes, Button button) throws IOException {
		java.lang.String afterStringsChange = button.getAfterStringsChange();

		if (afterStringsChange != null) {
			renderedAttributes.add(renderString(Button.AFTER_STRINGS_CHANGE, afterStringsChange));
		}
	}

	protected void renderAfterTabIndexChange(List<String> renderedAttributes, Button button) throws IOException {
		java.lang.String afterTabIndexChange = button.getAfterTabIndexChange();

		if (afterTabIndexChange != null) {
			renderedAttributes.add(renderString(Button.AFTER_TAB_INDEX_CHANGE, afterTabIndexChange));
		}
	}

	protected void renderAfterVisibleChange(List<String> renderedAttributes, Button button) throws IOException {
		java.lang.String afterVisibleChange = button.getAfterVisibleChange();

		if (afterVisibleChange != null) {
			renderedAttributes.add(renderString(Button.AFTER_VISIBLE_CHANGE, afterVisibleChange));
		}
	}

	protected void renderAfterWidthChange(List<String> renderedAttributes, Button button) throws IOException {
		java.lang.String afterWidthChange = button.getAfterWidthChange();

		if (afterWidthChange != null) {
			renderedAttributes.add(renderString(Button.AFTER_WIDTH_CHANGE, afterWidthChange));
		}
	}

	protected void renderOnBoundingBoxChange(List<String> renderedAttributes, Button button) throws IOException {
		java.lang.String onBoundingBoxChange = button.getOnBoundingBoxChange();

		if (onBoundingBoxChange != null) {
			renderedAttributes.add(renderString(Button.ON_BOUNDING_BOX_CHANGE, onBoundingBoxChange));
		}
	}

	protected void renderOnContentBoxChange(List<String> renderedAttributes, Button button) throws IOException {
		java.lang.String onContentBoxChange = button.getOnContentBoxChange();

		if (onContentBoxChange != null) {
			renderedAttributes.add(renderString(Button.ON_CONTENT_BOX_CHANGE, onContentBoxChange));
		}
	}

	protected void renderOnCssClassChange(List<String> renderedAttributes, Button button) throws IOException {
		java.lang.String onCssClassChange = button.getOnCssClassChange();

		if (onCssClassChange != null) {
			renderedAttributes.add(renderString(Button.ON_CSS_CLASS_CHANGE, onCssClassChange));
		}
	}

	protected void renderOnDestroyedChange(List<String> renderedAttributes, Button button) throws IOException {
		java.lang.String onDestroyedChange = button.getOnDestroyedChange();

		if (onDestroyedChange != null) {
			renderedAttributes.add(renderString(Button.ON_DESTROYED_CHANGE, onDestroyedChange));
		}
	}

	protected void renderOnDisabledChange(List<String> renderedAttributes, Button button) throws IOException {
		java.lang.String onDisabledChange = button.getOnDisabledChange();

		if (onDisabledChange != null) {
			renderedAttributes.add(renderString(Button.ON_DISABLED_CHANGE, onDisabledChange));
		}
	}

	protected void renderOnFocusedChange(List<String> renderedAttributes, Button button) throws IOException {
		java.lang.String onFocusedChange = button.getOnFocusedChange();

		if (onFocusedChange != null) {
			renderedAttributes.add(renderString(Button.ON_FOCUSED_CHANGE, onFocusedChange));
		}
	}

	protected void renderOnHeightChange(List<String> renderedAttributes, Button button) throws IOException {
		java.lang.String onHeightChange = button.getOnHeightChange();

		if (onHeightChange != null) {
			renderedAttributes.add(renderString(Button.ON_HEIGHT_CHANGE, onHeightChange));
		}
	}

	protected void renderOnIconChange(List<String> renderedAttributes, Button button) throws IOException {
		java.lang.String onIconChange = button.getOnIconChange();

		if (onIconChange != null) {
			renderedAttributes.add(renderString(Button.ON_ICON_CHANGE, onIconChange));
		}
	}

	protected void renderOnIconAlignChange(List<String> renderedAttributes, Button button) throws IOException {
		java.lang.String onIconAlignChange = button.getOnIconAlignChange();

		if (onIconAlignChange != null) {
			renderedAttributes.add(renderString(Button.ON_ICON_ALIGN_CHANGE, onIconAlignChange));
		}
	}

	protected void renderOnIconElementChange(List<String> renderedAttributes, Button button) throws IOException {
		java.lang.String onIconElementChange = button.getOnIconElementChange();

		if (onIconElementChange != null) {
			renderedAttributes.add(renderString(Button.ON_ICON_ELEMENT_CHANGE, onIconElementChange));
		}
	}

	protected void renderOnIdChange(List<String> renderedAttributes, Button button) throws IOException {
		java.lang.String onIdChange = button.getOnIdChange();

		if (onIdChange != null) {
			renderedAttributes.add(renderString(Button.ON_ID_CHANGE, onIdChange));
		}
	}

	protected void renderOnInitializedChange(List<String> renderedAttributes, Button button) throws IOException {
		java.lang.String onInitializedChange = button.getOnInitializedChange();

		if (onInitializedChange != null) {
			renderedAttributes.add(renderString(Button.ON_INITIALIZED_CHANGE, onInitializedChange));
		}
	}

	protected void renderOnLabelChange(List<String> renderedAttributes, Button button) throws IOException {
		java.lang.String onLabelChange = button.getOnLabelChange();

		if (onLabelChange != null) {
			renderedAttributes.add(renderString(Button.ON_LABEL_CHANGE, onLabelChange));
		}
	}

	protected void renderOnLocaleChange(List<String> renderedAttributes, Button button) throws IOException {
		java.lang.String onLocaleChange = button.getOnLocaleChange();

		if (onLocaleChange != null) {
			renderedAttributes.add(renderString(Button.ON_LOCALE_CHANGE, onLocaleChange));
		}
	}

	protected void renderOnPrimaryChange(List<String> renderedAttributes, Button button) throws IOException {
		java.lang.String onPrimaryChange = button.getOnPrimaryChange();

		if (onPrimaryChange != null) {
			renderedAttributes.add(renderString(Button.ON_PRIMARY_CHANGE, onPrimaryChange));
		}
	}

	protected void renderOnRenderChange(List<String> renderedAttributes, Button button) throws IOException {
		java.lang.String onRenderChange = button.getOnRenderChange();

		if (onRenderChange != null) {
			renderedAttributes.add(renderString(Button.ON_RENDER_CHANGE, onRenderChange));
		}
	}

	protected void renderOnRenderedChange(List<String> renderedAttributes, Button button) throws IOException {
		java.lang.String onRenderedChange = button.getOnRenderedChange();

		if (onRenderedChange != null) {
			renderedAttributes.add(renderString(Button.ON_RENDERED_CHANGE, onRenderedChange));
		}
	}

	protected void renderOnSrcNodeChange(List<String> renderedAttributes, Button button) throws IOException {
		java.lang.String onSrcNodeChange = button.getOnSrcNodeChange();

		if (onSrcNodeChange != null) {
			renderedAttributes.add(renderString(Button.ON_SRC_NODE_CHANGE, onSrcNodeChange));
		}
	}

	protected void renderOnStringsChange(List<String> renderedAttributes, Button button) throws IOException {
		java.lang.String onStringsChange = button.getOnStringsChange();

		if (onStringsChange != null) {
			renderedAttributes.add(renderString(Button.ON_STRINGS_CHANGE, onStringsChange));
		}
	}

	protected void renderOnTabIndexChange(List<String> renderedAttributes, Button button) throws IOException {
		java.lang.String onTabIndexChange = button.getOnTabIndexChange();

		if (onTabIndexChange != null) {
			renderedAttributes.add(renderString(Button.ON_TAB_INDEX_CHANGE, onTabIndexChange));
		}
	}

	protected void renderOnVisibleChange(List<String> renderedAttributes, Button button) throws IOException {
		java.lang.String onVisibleChange = button.getOnVisibleChange();

		if (onVisibleChange != null) {
			renderedAttributes.add(renderString(Button.ON_VISIBLE_CHANGE, onVisibleChange));
		}
	}

	protected void renderOnWidthChange(List<String> renderedAttributes, Button button) throws IOException {
		java.lang.String onWidthChange = button.getOnWidthChange();

		if (onWidthChange != null) {
			renderedAttributes.add(renderString(Button.ON_WIDTH_CHANGE, onWidthChange));
		}
	}

}
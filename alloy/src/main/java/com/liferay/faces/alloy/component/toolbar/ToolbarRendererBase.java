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
package com.liferay.faces.alloy.component.toolbar;

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
public abstract class ToolbarRendererBase extends RendererBase {

	// Private Constants
	private static final String AUI_MODULE_NAME = "aui-toolbar";

	protected void encodeJavaScriptMain(FacesContext facesContext, UIComponent uiComponent) throws IOException {

		Toolbar toolbar = (Toolbar) uiComponent;

		ResponseWriter responseWriter = facesContext.getResponseWriter();

		responseWriter.write("var toolbar = new A.Toolbar");
		responseWriter.write(StringPool.OPEN_PARENTHESIS);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedAttributes = new ArrayList<String>();

		if (toolbar.getBoundingBox() != null) {
			renderBoundingBox(renderedAttributes, toolbar);
		}

		if (toolbar.getToolbarChildren() != null) {
			renderToolbarChildren(renderedAttributes, toolbar);
		}

		if (toolbar.getContentBox() != null) {
			renderContentBox(renderedAttributes, toolbar);
		}

		if (toolbar.getCssClass() != null) {
			renderCssClass(renderedAttributes, toolbar);
		}

		if (toolbar.getDestroyed() != null) {
			renderDestroyed(renderedAttributes, toolbar);
		}

		if (toolbar.getDisabled() != null) {
			renderDisabled(renderedAttributes, toolbar);
		}

		if (toolbar.getFocused() != null) {
			renderFocused(renderedAttributes, toolbar);
		}

		if (toolbar.getHeight() != null) {
			renderHeight(renderedAttributes, toolbar);
		}

		if (toolbar.getHideClass() != null) {
			renderHideClass(renderedAttributes, toolbar);
		}

		if (toolbar.getToolbarId() != null) {
			renderToolbarId(renderedAttributes, toolbar);
		}

		if (toolbar.getInitialized() != null) {
			renderInitialized(renderedAttributes, toolbar);
		}

		if (toolbar.getToolbarLocale() != null) {
			renderToolbarLocale(renderedAttributes, toolbar);
		}

		if (toolbar.getRender() != null) {
			renderRender(renderedAttributes, toolbar);
		}

		if (toolbar.getRendered() != null) {
			renderRendered(renderedAttributes, toolbar);
		}

		if (toolbar.getSrcNode() != null) {
			renderSrcNode(renderedAttributes, toolbar);
		}

		if (toolbar.getStrings() != null) {
			renderStrings(renderedAttributes, toolbar);
		}

		if (toolbar.getTabIndex() != null) {
			renderTabIndex(renderedAttributes, toolbar);
		}

		if (toolbar.getToolbarRenderer() != null) {
			renderToolbarRenderer(renderedAttributes, toolbar);
		}

		if (toolbar.getUseARIA() != null) {
			renderUseARIA(renderedAttributes, toolbar);
		}

		if (toolbar.getVisible() != null) {
			renderVisible(renderedAttributes, toolbar);
		}

		if (toolbar.getWidth() != null) {
			renderWidth(renderedAttributes, toolbar);
		}


		for (String renderedAttribute : renderedAttributes) {
			responseWriter.write(renderedAttribute);
			responseWriter.write(StringPool.COMMA);
		}

		responseWriter.write("after");
		responseWriter.write(StringPool.COLON);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedAfterEvents = new ArrayList<String>();

		if (toolbar.getAfterBoundingBoxChange() != null) {
			renderAfterBoundingBoxChange(renderedAfterEvents, toolbar);
		}

		if (toolbar.getAfterChildrenChange() != null) {
			renderAfterChildrenChange(renderedAfterEvents, toolbar);
		}

		if (toolbar.getAfterContentBoxChange() != null) {
			renderAfterContentBoxChange(renderedAfterEvents, toolbar);
		}

		if (toolbar.getAfterCssClassChange() != null) {
			renderAfterCssClassChange(renderedAfterEvents, toolbar);
		}

		if (toolbar.getAfterDestroyedChange() != null) {
			renderAfterDestroyedChange(renderedAfterEvents, toolbar);
		}

		if (toolbar.getAfterDisabledChange() != null) {
			renderAfterDisabledChange(renderedAfterEvents, toolbar);
		}

		if (toolbar.getAfterFocusedChange() != null) {
			renderAfterFocusedChange(renderedAfterEvents, toolbar);
		}

		if (toolbar.getAfterHeightChange() != null) {
			renderAfterHeightChange(renderedAfterEvents, toolbar);
		}

		if (toolbar.getAfterHideClassChange() != null) {
			renderAfterHideClassChange(renderedAfterEvents, toolbar);
		}

		if (toolbar.getAfterIdChange() != null) {
			renderAfterIdChange(renderedAfterEvents, toolbar);
		}

		if (toolbar.getAfterInitializedChange() != null) {
			renderAfterInitializedChange(renderedAfterEvents, toolbar);
		}

		if (toolbar.getAfterLocaleChange() != null) {
			renderAfterLocaleChange(renderedAfterEvents, toolbar);
		}

		if (toolbar.getAfterRenderChange() != null) {
			renderAfterRenderChange(renderedAfterEvents, toolbar);
		}

		if (toolbar.getAfterRenderedChange() != null) {
			renderAfterRenderedChange(renderedAfterEvents, toolbar);
		}

		if (toolbar.getAfterSrcNodeChange() != null) {
			renderAfterSrcNodeChange(renderedAfterEvents, toolbar);
		}

		if (toolbar.getAfterStringsChange() != null) {
			renderAfterStringsChange(renderedAfterEvents, toolbar);
		}

		if (toolbar.getAfterTabIndexChange() != null) {
			renderAfterTabIndexChange(renderedAfterEvents, toolbar);
		}

		if (toolbar.getAfterToolbarRendererChange() != null) {
			renderAfterToolbarRendererChange(renderedAfterEvents, toolbar);
		}

		if (toolbar.getAfterUseARIAChange() != null) {
			renderAfterUseARIAChange(renderedAfterEvents, toolbar);
		}

		if (toolbar.getAfterVisibleChange() != null) {
			renderAfterVisibleChange(renderedAfterEvents, toolbar);
		}

		if (toolbar.getAfterWidthChange() != null) {
			renderAfterWidthChange(renderedAfterEvents, toolbar);
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

		if (toolbar.getOnBoundingBoxChange() != null) {
			renderOnBoundingBoxChange(renderedOnEvents, toolbar);
		}

		if (toolbar.getOnChildrenChange() != null) {
			renderOnChildrenChange(renderedOnEvents, toolbar);
		}

		if (toolbar.getOnContentBoxChange() != null) {
			renderOnContentBoxChange(renderedOnEvents, toolbar);
		}

		if (toolbar.getOnCssClassChange() != null) {
			renderOnCssClassChange(renderedOnEvents, toolbar);
		}

		if (toolbar.getOnDestroyedChange() != null) {
			renderOnDestroyedChange(renderedOnEvents, toolbar);
		}

		if (toolbar.getOnDisabledChange() != null) {
			renderOnDisabledChange(renderedOnEvents, toolbar);
		}

		if (toolbar.getOnFocusedChange() != null) {
			renderOnFocusedChange(renderedOnEvents, toolbar);
		}

		if (toolbar.getOnHeightChange() != null) {
			renderOnHeightChange(renderedOnEvents, toolbar);
		}

		if (toolbar.getOnHideClassChange() != null) {
			renderOnHideClassChange(renderedOnEvents, toolbar);
		}

		if (toolbar.getOnIdChange() != null) {
			renderOnIdChange(renderedOnEvents, toolbar);
		}

		if (toolbar.getOnInitializedChange() != null) {
			renderOnInitializedChange(renderedOnEvents, toolbar);
		}

		if (toolbar.getOnLocaleChange() != null) {
			renderOnLocaleChange(renderedOnEvents, toolbar);
		}

		if (toolbar.getOnRenderChange() != null) {
			renderOnRenderChange(renderedOnEvents, toolbar);
		}

		if (toolbar.getOnRenderedChange() != null) {
			renderOnRenderedChange(renderedOnEvents, toolbar);
		}

		if (toolbar.getOnSrcNodeChange() != null) {
			renderOnSrcNodeChange(renderedOnEvents, toolbar);
		}

		if (toolbar.getOnStringsChange() != null) {
			renderOnStringsChange(renderedOnEvents, toolbar);
		}

		if (toolbar.getOnTabIndexChange() != null) {
			renderOnTabIndexChange(renderedOnEvents, toolbar);
		}

		if (toolbar.getOnToolbarRendererChange() != null) {
			renderOnToolbarRendererChange(renderedOnEvents, toolbar);
		}

		if (toolbar.getOnUseARIAChange() != null) {
			renderOnUseARIAChange(renderedOnEvents, toolbar);
		}

		if (toolbar.getOnVisibleChange() != null) {
			renderOnVisibleChange(renderedOnEvents, toolbar);
		}

		if (toolbar.getOnWidthChange() != null) {
			renderOnWidthChange(renderedOnEvents, toolbar);
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

	protected void renderBoundingBox(List<String> renderedAttributes, Toolbar toolbar) throws IOException {
		java.lang.String boundingBox = toolbar.getBoundingBox();
		renderedAttributes.add(renderString(Toolbar.BOUNDING_BOX, boundingBox));
	}

	protected void renderToolbarChildren(List<String> renderedAttributes, Toolbar toolbar) throws IOException {
		java.lang.Object toolbarChildren = toolbar.getToolbarChildren();
		renderedAttributes.add(renderArray(Toolbar.TOOLBAR_CHILDREN, toolbarChildren));
	}

	protected void renderContentBox(List<String> renderedAttributes, Toolbar toolbar) throws IOException {
		java.lang.String contentBox = toolbar.getContentBox();
		renderedAttributes.add(renderString(Toolbar.CONTENT_BOX, contentBox));
	}

	protected void renderCssClass(List<String> renderedAttributes, Toolbar toolbar) throws IOException {
		java.lang.String cssClass = toolbar.getCssClass();
		renderedAttributes.add(renderString(Toolbar.CSS_CLASS, cssClass));
	}

	protected void renderDestroyed(List<String> renderedAttributes, Toolbar toolbar) throws IOException {
		java.lang.Boolean destroyed = toolbar.getDestroyed();
		renderedAttributes.add(renderBoolean(Toolbar.DESTROYED, destroyed));
	}

	protected void renderDisabled(List<String> renderedAttributes, Toolbar toolbar) throws IOException {
		java.lang.Boolean disabled = toolbar.getDisabled();
		renderedAttributes.add(renderBoolean(Toolbar.DISABLED, disabled));
	}

	protected void renderFocused(List<String> renderedAttributes, Toolbar toolbar) throws IOException {
		java.lang.Boolean focused = toolbar.getFocused();
		renderedAttributes.add(renderBoolean(Toolbar.FOCUSED, focused));
	}

	protected void renderHeight(List<String> renderedAttributes, Toolbar toolbar) throws IOException {
		java.lang.Object height = toolbar.getHeight();
		renderedAttributes.add(renderString(Toolbar.HEIGHT, height));
	}

	protected void renderHideClass(List<String> renderedAttributes, Toolbar toolbar) throws IOException {
		java.lang.String hideClass = toolbar.getHideClass();
		renderedAttributes.add(renderString(Toolbar.HIDE_CLASS, hideClass));
	}

	protected void renderToolbarId(List<String> renderedAttributes, Toolbar toolbar) throws IOException {
		java.lang.String toolbarId = toolbar.getToolbarId();
		renderedAttributes.add(renderString(Toolbar.TOOLBAR_ID, toolbarId));
	}

	protected void renderInitialized(List<String> renderedAttributes, Toolbar toolbar) throws IOException {
		java.lang.Boolean initialized = toolbar.getInitialized();
		renderedAttributes.add(renderBoolean(Toolbar.INITIALIZED, initialized));
	}

	protected void renderToolbarLocale(List<String> renderedAttributes, Toolbar toolbar) throws IOException {
		java.lang.String toolbarLocale = toolbar.getToolbarLocale();
		renderedAttributes.add(renderString(Toolbar.TOOLBAR_LOCALE, toolbarLocale));
	}

	protected void renderRender(List<String> renderedAttributes, Toolbar toolbar) throws IOException {
		java.lang.Object render = toolbar.getRender();
		renderedAttributes.add(renderString(Toolbar.RENDER, render));
	}

	protected void renderRendered(List<String> renderedAttributes, Toolbar toolbar) throws IOException {
		java.lang.Boolean rendered = toolbar.getRendered();
		renderedAttributes.add(renderBoolean(Toolbar.RENDERED, rendered));
	}

	protected void renderSrcNode(List<String> renderedAttributes, Toolbar toolbar) throws IOException {
		java.lang.String srcNode = toolbar.getSrcNode();
		renderedAttributes.add(renderString(Toolbar.SRC_NODE, srcNode));
	}

	protected void renderStrings(List<String> renderedAttributes, Toolbar toolbar) throws IOException {
		java.lang.Object strings = toolbar.getStrings();
		renderedAttributes.add(renderObject(Toolbar.STRINGS, strings));
	}

	protected void renderTabIndex(List<String> renderedAttributes, Toolbar toolbar) throws IOException {
		java.lang.Object tabIndex = toolbar.getTabIndex();
		renderedAttributes.add(renderNumber(Toolbar.TAB_INDEX, tabIndex));
	}

	protected void renderToolbarRenderer(List<String> renderedAttributes, Toolbar toolbar) throws IOException {
		java.lang.String toolbarRenderer = toolbar.getToolbarRenderer();
		renderedAttributes.add(renderString(Toolbar.TOOLBAR_RENDERER, toolbarRenderer));
	}

	protected void renderUseARIA(List<String> renderedAttributes, Toolbar toolbar) throws IOException {
		java.lang.Boolean useARIA = toolbar.getUseARIA();
		renderedAttributes.add(renderBoolean(Toolbar.USE_ARIA, useARIA));
	}

	protected void renderVisible(List<String> renderedAttributes, Toolbar toolbar) throws IOException {
		java.lang.Boolean visible = toolbar.getVisible();
		renderedAttributes.add(renderBoolean(Toolbar.VISIBLE, visible));
	}

	protected void renderWidth(List<String> renderedAttributes, Toolbar toolbar) throws IOException {
		java.lang.Object width = toolbar.getWidth();
		renderedAttributes.add(renderString(Toolbar.WIDTH, width));
	}

	protected void renderAfterBoundingBoxChange(List<String> renderedAttributes, Toolbar toolbar) throws IOException {
		java.lang.String afterBoundingBoxChange = toolbar.getAfterBoundingBoxChange();
		renderedAttributes.add(renderString(Toolbar.AFTER_BOUNDING_BOX_CHANGE, afterBoundingBoxChange));
	}

	protected void renderAfterChildrenChange(List<String> renderedAttributes, Toolbar toolbar) throws IOException {
		java.lang.String afterChildrenChange = toolbar.getAfterChildrenChange();
		renderedAttributes.add(renderString(Toolbar.AFTER_CHILDREN_CHANGE, afterChildrenChange));
	}

	protected void renderAfterContentBoxChange(List<String> renderedAttributes, Toolbar toolbar) throws IOException {
		java.lang.String afterContentBoxChange = toolbar.getAfterContentBoxChange();
		renderedAttributes.add(renderString(Toolbar.AFTER_CONTENT_BOX_CHANGE, afterContentBoxChange));
	}

	protected void renderAfterCssClassChange(List<String> renderedAttributes, Toolbar toolbar) throws IOException {
		java.lang.String afterCssClassChange = toolbar.getAfterCssClassChange();
		renderedAttributes.add(renderString(Toolbar.AFTER_CSS_CLASS_CHANGE, afterCssClassChange));
	}

	protected void renderAfterDestroyedChange(List<String> renderedAttributes, Toolbar toolbar) throws IOException {
		java.lang.String afterDestroyedChange = toolbar.getAfterDestroyedChange();
		renderedAttributes.add(renderString(Toolbar.AFTER_DESTROYED_CHANGE, afterDestroyedChange));
	}

	protected void renderAfterDisabledChange(List<String> renderedAttributes, Toolbar toolbar) throws IOException {
		java.lang.String afterDisabledChange = toolbar.getAfterDisabledChange();
		renderedAttributes.add(renderString(Toolbar.AFTER_DISABLED_CHANGE, afterDisabledChange));
	}

	protected void renderAfterFocusedChange(List<String> renderedAttributes, Toolbar toolbar) throws IOException {
		java.lang.String afterFocusedChange = toolbar.getAfterFocusedChange();
		renderedAttributes.add(renderString(Toolbar.AFTER_FOCUSED_CHANGE, afterFocusedChange));
	}

	protected void renderAfterHeightChange(List<String> renderedAttributes, Toolbar toolbar) throws IOException {
		java.lang.String afterHeightChange = toolbar.getAfterHeightChange();
		renderedAttributes.add(renderString(Toolbar.AFTER_HEIGHT_CHANGE, afterHeightChange));
	}

	protected void renderAfterHideClassChange(List<String> renderedAttributes, Toolbar toolbar) throws IOException {
		java.lang.String afterHideClassChange = toolbar.getAfterHideClassChange();
		renderedAttributes.add(renderString(Toolbar.AFTER_HIDE_CLASS_CHANGE, afterHideClassChange));
	}

	protected void renderAfterIdChange(List<String> renderedAttributes, Toolbar toolbar) throws IOException {
		java.lang.String afterIdChange = toolbar.getAfterIdChange();
		renderedAttributes.add(renderString(Toolbar.AFTER_ID_CHANGE, afterIdChange));
	}

	protected void renderAfterInitializedChange(List<String> renderedAttributes, Toolbar toolbar) throws IOException {
		java.lang.String afterInitializedChange = toolbar.getAfterInitializedChange();
		renderedAttributes.add(renderString(Toolbar.AFTER_INITIALIZED_CHANGE, afterInitializedChange));
	}

	protected void renderAfterLocaleChange(List<String> renderedAttributes, Toolbar toolbar) throws IOException {
		java.lang.String afterLocaleChange = toolbar.getAfterLocaleChange();
		renderedAttributes.add(renderString(Toolbar.AFTER_LOCALE_CHANGE, afterLocaleChange));
	}

	protected void renderAfterRenderChange(List<String> renderedAttributes, Toolbar toolbar) throws IOException {
		java.lang.String afterRenderChange = toolbar.getAfterRenderChange();
		renderedAttributes.add(renderString(Toolbar.AFTER_RENDER_CHANGE, afterRenderChange));
	}

	protected void renderAfterRenderedChange(List<String> renderedAttributes, Toolbar toolbar) throws IOException {
		java.lang.String afterRenderedChange = toolbar.getAfterRenderedChange();
		renderedAttributes.add(renderString(Toolbar.AFTER_RENDERED_CHANGE, afterRenderedChange));
	}

	protected void renderAfterSrcNodeChange(List<String> renderedAttributes, Toolbar toolbar) throws IOException {
		java.lang.String afterSrcNodeChange = toolbar.getAfterSrcNodeChange();
		renderedAttributes.add(renderString(Toolbar.AFTER_SRC_NODE_CHANGE, afterSrcNodeChange));
	}

	protected void renderAfterStringsChange(List<String> renderedAttributes, Toolbar toolbar) throws IOException {
		java.lang.String afterStringsChange = toolbar.getAfterStringsChange();
		renderedAttributes.add(renderString(Toolbar.AFTER_STRINGS_CHANGE, afterStringsChange));
	}

	protected void renderAfterTabIndexChange(List<String> renderedAttributes, Toolbar toolbar) throws IOException {
		java.lang.String afterTabIndexChange = toolbar.getAfterTabIndexChange();
		renderedAttributes.add(renderString(Toolbar.AFTER_TAB_INDEX_CHANGE, afterTabIndexChange));
	}

	protected void renderAfterToolbarRendererChange(List<String> renderedAttributes, Toolbar toolbar) throws IOException {
		java.lang.String afterToolbarRendererChange = toolbar.getAfterToolbarRendererChange();
		renderedAttributes.add(renderString(Toolbar.AFTER_TOOLBAR_RENDERER_CHANGE, afterToolbarRendererChange));
	}

	protected void renderAfterUseARIAChange(List<String> renderedAttributes, Toolbar toolbar) throws IOException {
		java.lang.String afterUseARIAChange = toolbar.getAfterUseARIAChange();
		renderedAttributes.add(renderString(Toolbar.AFTER_USE_ARIACHANGE, afterUseARIAChange));
	}

	protected void renderAfterVisibleChange(List<String> renderedAttributes, Toolbar toolbar) throws IOException {
		java.lang.String afterVisibleChange = toolbar.getAfterVisibleChange();
		renderedAttributes.add(renderString(Toolbar.AFTER_VISIBLE_CHANGE, afterVisibleChange));
	}

	protected void renderAfterWidthChange(List<String> renderedAttributes, Toolbar toolbar) throws IOException {
		java.lang.String afterWidthChange = toolbar.getAfterWidthChange();
		renderedAttributes.add(renderString(Toolbar.AFTER_WIDTH_CHANGE, afterWidthChange));
	}

	protected void renderOnBoundingBoxChange(List<String> renderedAttributes, Toolbar toolbar) throws IOException {
		java.lang.String onBoundingBoxChange = toolbar.getOnBoundingBoxChange();
		renderedAttributes.add(renderString(Toolbar.ON_BOUNDING_BOX_CHANGE, onBoundingBoxChange));
	}

	protected void renderOnChildrenChange(List<String> renderedAttributes, Toolbar toolbar) throws IOException {
		java.lang.String onChildrenChange = toolbar.getOnChildrenChange();
		renderedAttributes.add(renderString(Toolbar.ON_CHILDREN_CHANGE, onChildrenChange));
	}

	protected void renderOnContentBoxChange(List<String> renderedAttributes, Toolbar toolbar) throws IOException {
		java.lang.String onContentBoxChange = toolbar.getOnContentBoxChange();
		renderedAttributes.add(renderString(Toolbar.ON_CONTENT_BOX_CHANGE, onContentBoxChange));
	}

	protected void renderOnCssClassChange(List<String> renderedAttributes, Toolbar toolbar) throws IOException {
		java.lang.String onCssClassChange = toolbar.getOnCssClassChange();
		renderedAttributes.add(renderString(Toolbar.ON_CSS_CLASS_CHANGE, onCssClassChange));
	}

	protected void renderOnDestroyedChange(List<String> renderedAttributes, Toolbar toolbar) throws IOException {
		java.lang.String onDestroyedChange = toolbar.getOnDestroyedChange();
		renderedAttributes.add(renderString(Toolbar.ON_DESTROYED_CHANGE, onDestroyedChange));
	}

	protected void renderOnDisabledChange(List<String> renderedAttributes, Toolbar toolbar) throws IOException {
		java.lang.String onDisabledChange = toolbar.getOnDisabledChange();
		renderedAttributes.add(renderString(Toolbar.ON_DISABLED_CHANGE, onDisabledChange));
	}

	protected void renderOnFocusedChange(List<String> renderedAttributes, Toolbar toolbar) throws IOException {
		java.lang.String onFocusedChange = toolbar.getOnFocusedChange();
		renderedAttributes.add(renderString(Toolbar.ON_FOCUSED_CHANGE, onFocusedChange));
	}

	protected void renderOnHeightChange(List<String> renderedAttributes, Toolbar toolbar) throws IOException {
		java.lang.String onHeightChange = toolbar.getOnHeightChange();
		renderedAttributes.add(renderString(Toolbar.ON_HEIGHT_CHANGE, onHeightChange));
	}

	protected void renderOnHideClassChange(List<String> renderedAttributes, Toolbar toolbar) throws IOException {
		java.lang.String onHideClassChange = toolbar.getOnHideClassChange();
		renderedAttributes.add(renderString(Toolbar.ON_HIDE_CLASS_CHANGE, onHideClassChange));
	}

	protected void renderOnIdChange(List<String> renderedAttributes, Toolbar toolbar) throws IOException {
		java.lang.String onIdChange = toolbar.getOnIdChange();
		renderedAttributes.add(renderString(Toolbar.ON_ID_CHANGE, onIdChange));
	}

	protected void renderOnInitializedChange(List<String> renderedAttributes, Toolbar toolbar) throws IOException {
		java.lang.String onInitializedChange = toolbar.getOnInitializedChange();
		renderedAttributes.add(renderString(Toolbar.ON_INITIALIZED_CHANGE, onInitializedChange));
	}

	protected void renderOnLocaleChange(List<String> renderedAttributes, Toolbar toolbar) throws IOException {
		java.lang.String onLocaleChange = toolbar.getOnLocaleChange();
		renderedAttributes.add(renderString(Toolbar.ON_LOCALE_CHANGE, onLocaleChange));
	}

	protected void renderOnRenderChange(List<String> renderedAttributes, Toolbar toolbar) throws IOException {
		java.lang.String onRenderChange = toolbar.getOnRenderChange();
		renderedAttributes.add(renderString(Toolbar.ON_RENDER_CHANGE, onRenderChange));
	}

	protected void renderOnRenderedChange(List<String> renderedAttributes, Toolbar toolbar) throws IOException {
		java.lang.String onRenderedChange = toolbar.getOnRenderedChange();
		renderedAttributes.add(renderString(Toolbar.ON_RENDERED_CHANGE, onRenderedChange));
	}

	protected void renderOnSrcNodeChange(List<String> renderedAttributes, Toolbar toolbar) throws IOException {
		java.lang.String onSrcNodeChange = toolbar.getOnSrcNodeChange();
		renderedAttributes.add(renderString(Toolbar.ON_SRC_NODE_CHANGE, onSrcNodeChange));
	}

	protected void renderOnStringsChange(List<String> renderedAttributes, Toolbar toolbar) throws IOException {
		java.lang.String onStringsChange = toolbar.getOnStringsChange();
		renderedAttributes.add(renderString(Toolbar.ON_STRINGS_CHANGE, onStringsChange));
	}

	protected void renderOnTabIndexChange(List<String> renderedAttributes, Toolbar toolbar) throws IOException {
		java.lang.String onTabIndexChange = toolbar.getOnTabIndexChange();
		renderedAttributes.add(renderString(Toolbar.ON_TAB_INDEX_CHANGE, onTabIndexChange));
	}

	protected void renderOnToolbarRendererChange(List<String> renderedAttributes, Toolbar toolbar) throws IOException {
		java.lang.String onToolbarRendererChange = toolbar.getOnToolbarRendererChange();
		renderedAttributes.add(renderString(Toolbar.ON_TOOLBAR_RENDERER_CHANGE, onToolbarRendererChange));
	}

	protected void renderOnUseARIAChange(List<String> renderedAttributes, Toolbar toolbar) throws IOException {
		java.lang.String onUseARIAChange = toolbar.getOnUseARIAChange();
		renderedAttributes.add(renderString(Toolbar.ON_USE_ARIACHANGE, onUseARIAChange));
	}

	protected void renderOnVisibleChange(List<String> renderedAttributes, Toolbar toolbar) throws IOException {
		java.lang.String onVisibleChange = toolbar.getOnVisibleChange();
		renderedAttributes.add(renderString(Toolbar.ON_VISIBLE_CHANGE, onVisibleChange));
	}

	protected void renderOnWidthChange(List<String> renderedAttributes, Toolbar toolbar) throws IOException {
		java.lang.String onWidthChange = toolbar.getOnWidthChange();
		renderedAttributes.add(renderString(Toolbar.ON_WIDTH_CHANGE, onWidthChange));
	}

}
/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
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
package com.liferay.faces.alloy.component.autocomplete;

/**
 * @author Eduardo Lundgren
 * @author Bruno Basto
 * @author Nathan Cavanaugh
 * @generated
 */
public abstract class AutoCompleteBase extends javax.faces.component.UIPanel {

	private static final String ACTIVATE_FIRST_ITEM = "activateFirstItem";
	private static final String ACTIVE_ITEM = "activeItem";
	private static final String ALIGN = "align";
	private static final String ALIGN_ON = "alignOn";
	private static final String ALLOW_BROWSER_AUTOCOMPLETE = "allowBrowserAutocomplete";
	private static final String ALLOW_TRAILING_DELIMITER = "allowTrailingDelimiter";
	private static final String ALWAYS_SHOW_LIST = "alwaysShowList";
	private static final String BOUNDING_BOX = "boundingBox";
	private static final String CENTERED = "centered";
	private static final String CIRCULAR = "circular";
	private static final String CONTENT_BOX = "contentBox";
	private static final String DESTROYED = "destroyed";
	private static final String DISABLED = "disabled";
	private static final String ENABLE_CACHE = "enableCache";
	private static final String FOCUSED = "focused";
	private static final String HEIGHT = "height";
	private static final String HOVERED_ITEM = "hoveredItem";
	private static final String AUTOCOMPLETE_ID = "autocompleteId";
	private static final String INITIALIZED = "initialized";
	private static final String INPUT_NODE = "inputNode";
	private static final String LIST_NODE = "listNode";
	private static final String AUTOCOMPLETE_LOCALE = "autocompleteLocale";
	private static final String MAX_RESULTS = "maxResults";
	private static final String MIN_QUERY_LENGTH = "minQueryLength";
	private static final String QUERY = "query";
	private static final String QUERY_DELAY = "queryDelay";
	private static final String QUERY_DELIMITER = "queryDelimiter";
	private static final String RENDER = "render";
	private static final String RENDERED = "rendered";
	private static final String REQUEST_TEMPLATE = "requestTemplate";
	private static final String RESULT_FILTERS = "resultFilters";
	private static final String RESULT_FORMATTER = "resultFormatter";
	private static final String RESULT_HIGHLIGHTER = "resultHighlighter";
	private static final String RESULT_LIST_LOCATOR = "resultListLocator";
	private static final String RESULT_TEXT_LOCATOR = "resultTextLocator";
	private static final String RESULTS = "results";
	private static final String SCROLL_INTO_VIEW = "scrollIntoView";
	private static final String SOURCE = "source";
	private static final String SOURCE_TYPE = "sourceType";
	private static final String SRC_NODE = "srcNode";
	private static final String STRINGS = "strings";
	private static final String TAB_INDEX = "tabIndex";
	private static final String TAB_SELECT = "tabSelect";
	private static final String TOKEN_INPUT = "tokenInput";
	private static final String AUTOCOMPLETE_VALUE = "autocompleteValue";
	private static final String VISIBLE = "visible";
	private static final String WIDTH = "width";
	private static final String X = "x";
	private static final String XY = "xy";
	private static final String Y = "y";
	private static final String YQL_ENV = "yqlEnv";
	private static final String YQL_PROTOCOL = "yqlProtocol";
	private static final String AFTER_ACTIVATE_FIRST_ITEM_CHANGE = "afterActivateFirstItemChange";
	private static final String AFTER_ACTIVE_ITEM_CHANGE = "afterActiveItemChange";
	private static final String AFTER_ALIGN_CHANGE = "afterAlignChange";
	private static final String AFTER_ALIGN_ON_CHANGE = "afterAlignOnChange";
	private static final String AFTER_ALLOW_BROWSER_AUTOCOMPLETE_CHANGE = "afterAllowBrowserAutocompleteChange";
	private static final String AFTER_ALLOW_TRAILING_DELIMITER_CHANGE = "afterAllowTrailingDelimiterChange";
	private static final String AFTER_ALWAYS_SHOW_LIST_CHANGE = "afterAlwaysShowListChange";
	private static final String AFTER_BOUNDING_BOX_CHANGE = "afterBoundingBoxChange";
	private static final String AFTER_CENTERED_CHANGE = "afterCenteredChange";
	private static final String AFTER_CIRCULAR_CHANGE = "afterCircularChange";
	private static final String AFTER_CONTENT_BOX_CHANGE = "afterContentBoxChange";
	private static final String AFTER_DESTROYED_CHANGE = "afterDestroyedChange";
	private static final String AFTER_DISABLED_CHANGE = "afterDisabledChange";
	private static final String AFTER_ENABLE_CACHE_CHANGE = "afterEnableCacheChange";
	private static final String AFTER_FOCUSED_CHANGE = "afterFocusedChange";
	private static final String AFTER_HEIGHT_CHANGE = "afterHeightChange";
	private static final String AFTER_HOVERED_ITEM_CHANGE = "afterHoveredItemChange";
	private static final String AFTER_ID_CHANGE = "afterIdChange";
	private static final String AFTER_INITIALIZED_CHANGE = "afterInitializedChange";
	private static final String AFTER_INPUT_NODE_CHANGE = "afterInputNodeChange";
	private static final String AFTER_LIST_NODE_CHANGE = "afterListNodeChange";
	private static final String AFTER_LOCALE_CHANGE = "afterLocaleChange";
	private static final String AFTER_MAX_RESULTS_CHANGE = "afterMaxResultsChange";
	private static final String AFTER_MIN_QUERY_LENGTH_CHANGE = "afterMinQueryLengthChange";
	private static final String AFTER_QUERY_CHANGE = "afterQueryChange";
	private static final String AFTER_QUERY_DELAY_CHANGE = "afterQueryDelayChange";
	private static final String AFTER_QUERY_DELIMITER_CHANGE = "afterQueryDelimiterChange";
	private static final String AFTER_RENDER_CHANGE = "afterRenderChange";
	private static final String AFTER_RENDERED_CHANGE = "afterRenderedChange";
	private static final String AFTER_REQUEST_TEMPLATE_CHANGE = "afterRequestTemplateChange";
	private static final String AFTER_RESULT_FILTERS_CHANGE = "afterResultFiltersChange";
	private static final String AFTER_RESULT_FORMATTER_CHANGE = "afterResultFormatterChange";
	private static final String AFTER_RESULT_HIGHLIGHTER_CHANGE = "afterResultHighlighterChange";
	private static final String AFTER_RESULT_LIST_LOCATOR_CHANGE = "afterResultListLocatorChange";
	private static final String AFTER_RESULT_TEXT_LOCATOR_CHANGE = "afterResultTextLocatorChange";
	private static final String AFTER_RESULTS_CHANGE = "afterResultsChange";
	private static final String AFTER_SCROLL_INTO_VIEW_CHANGE = "afterScrollIntoViewChange";
	private static final String AFTER_SOURCE_CHANGE = "afterSourceChange";
	private static final String AFTER_SOURCE_TYPE_CHANGE = "afterSourceTypeChange";
	private static final String AFTER_SRC_NODE_CHANGE = "afterSrcNodeChange";
	private static final String AFTER_STRINGS_CHANGE = "afterStringsChange";
	private static final String AFTER_TAB_INDEX_CHANGE = "afterTabIndexChange";
	private static final String AFTER_TAB_SELECT_CHANGE = "afterTabSelectChange";
	private static final String AFTER_TOKEN_INPUT_CHANGE = "afterTokenInputChange";
	private static final String AFTER_VALUE_CHANGE = "afterValueChange";
	private static final String AFTER_VISIBLE_CHANGE = "afterVisibleChange";
	private static final String AFTER_WIDTH_CHANGE = "afterWidthChange";
	private static final String AFTER_XCHANGE = "afterXChange";
	private static final String AFTER_XY_CHANGE = "afterXyChange";
	private static final String AFTER_YCHANGE = "afterYChange";
	private static final String AFTER_YQL_ENV_CHANGE = "afterYqlEnvChange";
	private static final String AFTER_YQL_PROTOCOL_CHANGE = "afterYqlProtocolChange";
	private static final String ON_ACTIVATE_FIRST_ITEM_CHANGE = "onActivateFirstItemChange";
	private static final String ON_ACTIVE_ITEM_CHANGE = "onActiveItemChange";
	private static final String ON_ALIGN_CHANGE = "onAlignChange";
	private static final String ON_ALIGN_ON_CHANGE = "onAlignOnChange";
	private static final String ON_ALLOW_BROWSER_AUTOCOMPLETE_CHANGE = "onAllowBrowserAutocompleteChange";
	private static final String ON_ALLOW_TRAILING_DELIMITER_CHANGE = "onAllowTrailingDelimiterChange";
	private static final String ON_ALWAYS_SHOW_LIST_CHANGE = "onAlwaysShowListChange";
	private static final String ON_BOUNDING_BOX_CHANGE = "onBoundingBoxChange";
	private static final String ON_CENTERED_CHANGE = "onCenteredChange";
	private static final String ON_CIRCULAR_CHANGE = "onCircularChange";
	private static final String ON_CONTENT_BOX_CHANGE = "onContentBoxChange";
	private static final String ON_DESTROYED_CHANGE = "onDestroyedChange";
	private static final String ON_DISABLED_CHANGE = "onDisabledChange";
	private static final String ON_ENABLE_CACHE_CHANGE = "onEnableCacheChange";
	private static final String ON_FOCUSED_CHANGE = "onFocusedChange";
	private static final String ON_HEIGHT_CHANGE = "onHeightChange";
	private static final String ON_HOVERED_ITEM_CHANGE = "onHoveredItemChange";
	private static final String ON_ID_CHANGE = "onIdChange";
	private static final String ON_INITIALIZED_CHANGE = "onInitializedChange";
	private static final String ON_INPUT_NODE_CHANGE = "onInputNodeChange";
	private static final String ON_LIST_NODE_CHANGE = "onListNodeChange";
	private static final String ON_LOCALE_CHANGE = "onLocaleChange";
	private static final String ON_MAX_RESULTS_CHANGE = "onMaxResultsChange";
	private static final String ON_MIN_QUERY_LENGTH_CHANGE = "onMinQueryLengthChange";
	private static final String ON_QUERY_CHANGE = "onQueryChange";
	private static final String ON_QUERY_DELAY_CHANGE = "onQueryDelayChange";
	private static final String ON_QUERY_DELIMITER_CHANGE = "onQueryDelimiterChange";
	private static final String ON_RENDER_CHANGE = "onRenderChange";
	private static final String ON_RENDERED_CHANGE = "onRenderedChange";
	private static final String ON_REQUEST_TEMPLATE_CHANGE = "onRequestTemplateChange";
	private static final String ON_RESULT_FILTERS_CHANGE = "onResultFiltersChange";
	private static final String ON_RESULT_FORMATTER_CHANGE = "onResultFormatterChange";
	private static final String ON_RESULT_HIGHLIGHTER_CHANGE = "onResultHighlighterChange";
	private static final String ON_RESULT_LIST_LOCATOR_CHANGE = "onResultListLocatorChange";
	private static final String ON_RESULT_TEXT_LOCATOR_CHANGE = "onResultTextLocatorChange";
	private static final String ON_RESULTS_CHANGE = "onResultsChange";
	private static final String ON_SCROLL_INTO_VIEW_CHANGE = "onScrollIntoViewChange";
	private static final String ON_SOURCE_CHANGE = "onSourceChange";
	private static final String ON_SOURCE_TYPE_CHANGE = "onSourceTypeChange";
	private static final String ON_SRC_NODE_CHANGE = "onSrcNodeChange";
	private static final String ON_STRINGS_CHANGE = "onStringsChange";
	private static final String ON_TAB_INDEX_CHANGE = "onTabIndexChange";
	private static final String ON_TAB_SELECT_CHANGE = "onTabSelectChange";
	private static final String ON_TOKEN_INPUT_CHANGE = "onTokenInputChange";
	private static final String ON_VALUE_CHANGE = "onValueChange";
	private static final String ON_VISIBLE_CHANGE = "onVisibleChange";
	private static final String ON_WIDTH_CHANGE = "onWidthChange";
	private static final String ON_XCHANGE = "onXChange";
	private static final String ON_XY_CHANGE = "onXyChange";
	private static final String ON_YCHANGE = "onYChange";
	private static final String ON_YQL_ENV_CHANGE = "onYqlEnvChange";
	private static final String ON_YQL_PROTOCOL_CHANGE = "onYqlProtocolChange";

	protected java.lang.Boolean getActivateFirstItem() {
		return (java.lang.Boolean) getStateHelper().eval(ACTIVATE_FIRST_ITEM, null);
	}

	protected void setActivateFirstItem(java.lang.Boolean activateFirstItem) {
		getStateHelper().put(ACTIVATE_FIRST_ITEM, activateFirstItem);
	}

	protected java.lang.Object getActiveItem() {
		return (java.lang.Object) getStateHelper().eval(ACTIVE_ITEM, null);
	}

	protected void setActiveItem(java.lang.Object activeItem) {
		getStateHelper().put(ACTIVE_ITEM, activeItem);
	}

	protected java.lang.Object getAlign() {
		return (java.lang.Object) getStateHelper().eval(ALIGN, null);
	}

	protected void setAlign(java.lang.Object align) {
		getStateHelper().put(ALIGN, align);
	}

	protected java.lang.Object getAlignOn() {
		return (java.lang.Object) getStateHelper().eval(ALIGN_ON, null);
	}

	protected void setAlignOn(java.lang.Object alignOn) {
		getStateHelper().put(ALIGN_ON, alignOn);
	}

	protected java.lang.Boolean getAllowBrowserAutocomplete() {
		return (java.lang.Boolean) getStateHelper().eval(ALLOW_BROWSER_AUTOCOMPLETE, null);
	}

	protected void setAllowBrowserAutocomplete(java.lang.Boolean allowBrowserAutocomplete) {
		getStateHelper().put(ALLOW_BROWSER_AUTOCOMPLETE, allowBrowserAutocomplete);
	}

	protected java.lang.Boolean getAllowTrailingDelimiter() {
		return (java.lang.Boolean) getStateHelper().eval(ALLOW_TRAILING_DELIMITER, null);
	}

	protected void setAllowTrailingDelimiter(java.lang.Boolean allowTrailingDelimiter) {
		getStateHelper().put(ALLOW_TRAILING_DELIMITER, allowTrailingDelimiter);
	}

	protected java.lang.Boolean getAlwaysShowList() {
		return (java.lang.Boolean) getStateHelper().eval(ALWAYS_SHOW_LIST, null);
	}

	protected void setAlwaysShowList(java.lang.Boolean alwaysShowList) {
		getStateHelper().put(ALWAYS_SHOW_LIST, alwaysShowList);
	}

	protected java.lang.String getBoundingBox() {
		return (java.lang.String) getStateHelper().eval(BOUNDING_BOX, null);
	}

	protected void setBoundingBox(java.lang.String boundingBox) {
		getStateHelper().put(BOUNDING_BOX, boundingBox);
	}

	protected java.lang.Object getCentered() {
		return (java.lang.Object) getStateHelper().eval(CENTERED, null);
	}

	protected void setCentered(java.lang.Object centered) {
		getStateHelper().put(CENTERED, centered);
	}

	protected java.lang.Boolean getCircular() {
		return (java.lang.Boolean) getStateHelper().eval(CIRCULAR, null);
	}

	protected void setCircular(java.lang.Boolean circular) {
		getStateHelper().put(CIRCULAR, circular);
	}

	protected java.lang.String getContentBox() {
		return (java.lang.String) getStateHelper().eval(CONTENT_BOX, null);
	}

	protected void setContentBox(java.lang.String contentBox) {
		getStateHelper().put(CONTENT_BOX, contentBox);
	}

	protected java.lang.Boolean getDestroyed() {
		return (java.lang.Boolean) getStateHelper().eval(DESTROYED, null);
	}

	protected void setDestroyed(java.lang.Boolean destroyed) {
		getStateHelper().put(DESTROYED, destroyed);
	}

	protected java.lang.Boolean getDisabled() {
		return (java.lang.Boolean) getStateHelper().eval(DISABLED, null);
	}

	protected void setDisabled(java.lang.Boolean disabled) {
		getStateHelper().put(DISABLED, disabled);
	}

	protected java.lang.Boolean getEnableCache() {
		return (java.lang.Boolean) getStateHelper().eval(ENABLE_CACHE, null);
	}

	protected void setEnableCache(java.lang.Boolean enableCache) {
		getStateHelper().put(ENABLE_CACHE, enableCache);
	}

	protected java.lang.Boolean getFocused() {
		return (java.lang.Boolean) getStateHelper().eval(FOCUSED, null);
	}

	protected void setFocused(java.lang.Boolean focused) {
		getStateHelper().put(FOCUSED, focused);
	}

	protected java.lang.Object getHeight() {
		return (java.lang.Object) getStateHelper().eval(HEIGHT, null);
	}

	protected void setHeight(java.lang.Object height) {
		getStateHelper().put(HEIGHT, height);
	}

	protected java.lang.Object getHoveredItem() {
		return (java.lang.Object) getStateHelper().eval(HOVERED_ITEM, null);
	}

	protected void setHoveredItem(java.lang.Object hoveredItem) {
		getStateHelper().put(HOVERED_ITEM, hoveredItem);
	}

	protected java.lang.String getAutocompleteId() {
		return (java.lang.String) getStateHelper().eval(AUTOCOMPLETE_ID, null);
	}

	protected void setAutocompleteId(java.lang.String autocompleteId) {
		getStateHelper().put(AUTOCOMPLETE_ID, autocompleteId);
	}

	protected java.lang.Boolean getInitialized() {
		return (java.lang.Boolean) getStateHelper().eval(INITIALIZED, null);
	}

	protected void setInitialized(java.lang.Boolean initialized) {
		getStateHelper().put(INITIALIZED, initialized);
	}

	protected java.lang.Object getInputNode() {
		return (java.lang.Object) getStateHelper().eval(INPUT_NODE, null);
	}

	protected void setInputNode(java.lang.Object inputNode) {
		getStateHelper().put(INPUT_NODE, inputNode);
	}

	protected java.lang.Object getListNode() {
		return (java.lang.Object) getStateHelper().eval(LIST_NODE, null);
	}

	protected void setListNode(java.lang.Object listNode) {
		getStateHelper().put(LIST_NODE, listNode);
	}

	protected java.lang.String getAutocompleteLocale() {
		return (java.lang.String) getStateHelper().eval(AUTOCOMPLETE_LOCALE, null);
	}

	protected void setAutocompleteLocale(java.lang.String autocompleteLocale) {
		getStateHelper().put(AUTOCOMPLETE_LOCALE, autocompleteLocale);
	}

	protected java.lang.Object getMaxResults() {
		return (java.lang.Object) getStateHelper().eval(MAX_RESULTS, null);
	}

	protected void setMaxResults(java.lang.Object maxResults) {
		getStateHelper().put(MAX_RESULTS, maxResults);
	}

	protected java.lang.Object getMinQueryLength() {
		return (java.lang.Object) getStateHelper().eval(MIN_QUERY_LENGTH, null);
	}

	protected void setMinQueryLength(java.lang.Object minQueryLength) {
		getStateHelper().put(MIN_QUERY_LENGTH, minQueryLength);
	}

	protected java.lang.Object getQuery() {
		return (java.lang.Object) getStateHelper().eval(QUERY, null);
	}

	protected void setQuery(java.lang.Object query) {
		getStateHelper().put(QUERY, query);
	}

	protected java.lang.Object getQueryDelay() {
		return (java.lang.Object) getStateHelper().eval(QUERY_DELAY, null);
	}

	protected void setQueryDelay(java.lang.Object queryDelay) {
		getStateHelper().put(QUERY_DELAY, queryDelay);
	}

	protected java.lang.Object getQueryDelimiter() {
		return (java.lang.Object) getStateHelper().eval(QUERY_DELIMITER, null);
	}

	protected void setQueryDelimiter(java.lang.Object queryDelimiter) {
		getStateHelper().put(QUERY_DELIMITER, queryDelimiter);
	}

	protected java.lang.Object getRender() {
		return (java.lang.Object) getStateHelper().eval(RENDER, null);
	}

	protected void setRender(java.lang.Object render) {
		getStateHelper().put(RENDER, render);
	}

	protected java.lang.Boolean getRendered() {
		return (java.lang.Boolean) getStateHelper().eval(RENDERED, null);
	}

	protected void setRendered(java.lang.Boolean rendered) {
		getStateHelper().put(RENDERED, rendered);
	}

	protected java.lang.Object getRequestTemplate() {
		return (java.lang.Object) getStateHelper().eval(REQUEST_TEMPLATE, null);
	}

	protected void setRequestTemplate(java.lang.Object requestTemplate) {
		getStateHelper().put(REQUEST_TEMPLATE, requestTemplate);
	}

	protected java.lang.Object getResultFilters() {
		return (java.lang.Object) getStateHelper().eval(RESULT_FILTERS, null);
	}

	protected void setResultFilters(java.lang.Object resultFilters) {
		getStateHelper().put(RESULT_FILTERS, resultFilters);
	}

	protected java.lang.Object getResultFormatter() {
		return (java.lang.Object) getStateHelper().eval(RESULT_FORMATTER, null);
	}

	protected void setResultFormatter(java.lang.Object resultFormatter) {
		getStateHelper().put(RESULT_FORMATTER, resultFormatter);
	}

	protected java.lang.Object getResultHighlighter() {
		return (java.lang.Object) getStateHelper().eval(RESULT_HIGHLIGHTER, null);
	}

	protected void setResultHighlighter(java.lang.Object resultHighlighter) {
		getStateHelper().put(RESULT_HIGHLIGHTER, resultHighlighter);
	}

	protected java.lang.Object getResultListLocator() {
		return (java.lang.Object) getStateHelper().eval(RESULT_LIST_LOCATOR, null);
	}

	protected void setResultListLocator(java.lang.Object resultListLocator) {
		getStateHelper().put(RESULT_LIST_LOCATOR, resultListLocator);
	}

	protected java.lang.Object getResultTextLocator() {
		return (java.lang.Object) getStateHelper().eval(RESULT_TEXT_LOCATOR, null);
	}

	protected void setResultTextLocator(java.lang.Object resultTextLocator) {
		getStateHelper().put(RESULT_TEXT_LOCATOR, resultTextLocator);
	}

	protected java.lang.Object getResults() {
		return (java.lang.Object) getStateHelper().eval(RESULTS, null);
	}

	protected void setResults(java.lang.Object results) {
		getStateHelper().put(RESULTS, results);
	}

	protected java.lang.Boolean getScrollIntoView() {
		return (java.lang.Boolean) getStateHelper().eval(SCROLL_INTO_VIEW, null);
	}

	protected void setScrollIntoView(java.lang.Boolean scrollIntoView) {
		getStateHelper().put(SCROLL_INTO_VIEW, scrollIntoView);
	}

	protected java.lang.Object getSource() {
		return (java.lang.Object) getStateHelper().eval(SOURCE, null);
	}

	protected void setSource(java.lang.Object source) {
		getStateHelper().put(SOURCE, source);
	}

	protected java.lang.String getSourceType() {
		return (java.lang.String) getStateHelper().eval(SOURCE_TYPE, null);
	}

	protected void setSourceType(java.lang.String sourceType) {
		getStateHelper().put(SOURCE_TYPE, sourceType);
	}

	protected java.lang.String getSrcNode() {
		return (java.lang.String) getStateHelper().eval(SRC_NODE, null);
	}

	protected void setSrcNode(java.lang.String srcNode) {
		getStateHelper().put(SRC_NODE, srcNode);
	}

	protected java.lang.Object getStrings() {
		return (java.lang.Object) getStateHelper().eval(STRINGS, null);
	}

	protected void setStrings(java.lang.Object strings) {
		getStateHelper().put(STRINGS, strings);
	}

	protected java.lang.Object getTabIndex() {
		return (java.lang.Object) getStateHelper().eval(TAB_INDEX, null);
	}

	protected void setTabIndex(java.lang.Object tabIndex) {
		getStateHelper().put(TAB_INDEX, tabIndex);
	}

	protected java.lang.Boolean getTabSelect() {
		return (java.lang.Boolean) getStateHelper().eval(TAB_SELECT, null);
	}

	protected void setTabSelect(java.lang.Boolean tabSelect) {
		getStateHelper().put(TAB_SELECT, tabSelect);
	}

	protected java.lang.Object getTokenInput() {
		return (java.lang.Object) getStateHelper().eval(TOKEN_INPUT, null);
	}

	protected void setTokenInput(java.lang.Object tokenInput) {
		getStateHelper().put(TOKEN_INPUT, tokenInput);
	}

	protected java.lang.String getAutocompleteValue() {
		return (java.lang.String) getStateHelper().eval(AUTOCOMPLETE_VALUE, null);
	}

	protected void setAutocompleteValue(java.lang.String autocompleteValue) {
		getStateHelper().put(AUTOCOMPLETE_VALUE, autocompleteValue);
	}

	protected java.lang.Boolean getVisible() {
		return (java.lang.Boolean) getStateHelper().eval(VISIBLE, null);
	}

	protected void setVisible(java.lang.Boolean visible) {
		getStateHelper().put(VISIBLE, visible);
	}

	protected java.lang.Object getWidth() {
		return (java.lang.Object) getStateHelper().eval(WIDTH, null);
	}

	protected void setWidth(java.lang.Object width) {
		getStateHelper().put(WIDTH, width);
	}

	protected java.lang.Object getX() {
		return (java.lang.Object) getStateHelper().eval(X, null);
	}

	protected void setX(java.lang.Object x) {
		getStateHelper().put(X, x);
	}

	protected java.lang.Object getXy() {
		return (java.lang.Object) getStateHelper().eval(XY, null);
	}

	protected void setXy(java.lang.Object xy) {
		getStateHelper().put(XY, xy);
	}

	protected java.lang.Object getY() {
		return (java.lang.Object) getStateHelper().eval(Y, null);
	}

	protected void setY(java.lang.Object y) {
		getStateHelper().put(Y, y);
	}

	protected java.lang.String getYqlEnv() {
		return (java.lang.String) getStateHelper().eval(YQL_ENV, null);
	}

	protected void setYqlEnv(java.lang.String yqlEnv) {
		getStateHelper().put(YQL_ENV, yqlEnv);
	}

	protected java.lang.String getYqlProtocol() {
		return (java.lang.String) getStateHelper().eval(YQL_PROTOCOL, null);
	}

	protected void setYqlProtocol(java.lang.String yqlProtocol) {
		getStateHelper().put(YQL_PROTOCOL, yqlProtocol);
	}

	protected java.lang.String getAfterActivateFirstItemChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_ACTIVATE_FIRST_ITEM_CHANGE, null);
	}

	protected void setAfterActivateFirstItemChange(java.lang.String afterActivateFirstItemChange) {
		getStateHelper().put(AFTER_ACTIVATE_FIRST_ITEM_CHANGE, afterActivateFirstItemChange);
	}

	protected java.lang.String getAfterActiveItemChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_ACTIVE_ITEM_CHANGE, null);
	}

	protected void setAfterActiveItemChange(java.lang.String afterActiveItemChange) {
		getStateHelper().put(AFTER_ACTIVE_ITEM_CHANGE, afterActiveItemChange);
	}

	protected java.lang.String getAfterAlignChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_ALIGN_CHANGE, null);
	}

	protected void setAfterAlignChange(java.lang.String afterAlignChange) {
		getStateHelper().put(AFTER_ALIGN_CHANGE, afterAlignChange);
	}

	protected java.lang.String getAfterAlignOnChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_ALIGN_ON_CHANGE, null);
	}

	protected void setAfterAlignOnChange(java.lang.String afterAlignOnChange) {
		getStateHelper().put(AFTER_ALIGN_ON_CHANGE, afterAlignOnChange);
	}

	protected java.lang.String getAfterAllowBrowserAutocompleteChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_ALLOW_BROWSER_AUTOCOMPLETE_CHANGE, null);
	}

	protected void setAfterAllowBrowserAutocompleteChange(java.lang.String afterAllowBrowserAutocompleteChange) {
		getStateHelper().put(AFTER_ALLOW_BROWSER_AUTOCOMPLETE_CHANGE, afterAllowBrowserAutocompleteChange);
	}

	protected java.lang.String getAfterAllowTrailingDelimiterChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_ALLOW_TRAILING_DELIMITER_CHANGE, null);
	}

	protected void setAfterAllowTrailingDelimiterChange(java.lang.String afterAllowTrailingDelimiterChange) {
		getStateHelper().put(AFTER_ALLOW_TRAILING_DELIMITER_CHANGE, afterAllowTrailingDelimiterChange);
	}

	protected java.lang.String getAfterAlwaysShowListChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_ALWAYS_SHOW_LIST_CHANGE, null);
	}

	protected void setAfterAlwaysShowListChange(java.lang.String afterAlwaysShowListChange) {
		getStateHelper().put(AFTER_ALWAYS_SHOW_LIST_CHANGE, afterAlwaysShowListChange);
	}

	protected java.lang.String getAfterBoundingBoxChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_BOUNDING_BOX_CHANGE, null);
	}

	protected void setAfterBoundingBoxChange(java.lang.String afterBoundingBoxChange) {
		getStateHelper().put(AFTER_BOUNDING_BOX_CHANGE, afterBoundingBoxChange);
	}

	protected java.lang.String getAfterCenteredChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_CENTERED_CHANGE, null);
	}

	protected void setAfterCenteredChange(java.lang.String afterCenteredChange) {
		getStateHelper().put(AFTER_CENTERED_CHANGE, afterCenteredChange);
	}

	protected java.lang.String getAfterCircularChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_CIRCULAR_CHANGE, null);
	}

	protected void setAfterCircularChange(java.lang.String afterCircularChange) {
		getStateHelper().put(AFTER_CIRCULAR_CHANGE, afterCircularChange);
	}

	protected java.lang.String getAfterContentBoxChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_CONTENT_BOX_CHANGE, null);
	}

	protected void setAfterContentBoxChange(java.lang.String afterContentBoxChange) {
		getStateHelper().put(AFTER_CONTENT_BOX_CHANGE, afterContentBoxChange);
	}

	protected java.lang.String getAfterDestroyedChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_DESTROYED_CHANGE, null);
	}

	protected void setAfterDestroyedChange(java.lang.String afterDestroyedChange) {
		getStateHelper().put(AFTER_DESTROYED_CHANGE, afterDestroyedChange);
	}

	protected java.lang.String getAfterDisabledChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_DISABLED_CHANGE, null);
	}

	protected void setAfterDisabledChange(java.lang.String afterDisabledChange) {
		getStateHelper().put(AFTER_DISABLED_CHANGE, afterDisabledChange);
	}

	protected java.lang.String getAfterEnableCacheChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_ENABLE_CACHE_CHANGE, null);
	}

	protected void setAfterEnableCacheChange(java.lang.String afterEnableCacheChange) {
		getStateHelper().put(AFTER_ENABLE_CACHE_CHANGE, afterEnableCacheChange);
	}

	protected java.lang.String getAfterFocusedChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_FOCUSED_CHANGE, null);
	}

	protected void setAfterFocusedChange(java.lang.String afterFocusedChange) {
		getStateHelper().put(AFTER_FOCUSED_CHANGE, afterFocusedChange);
	}

	protected java.lang.String getAfterHeightChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_HEIGHT_CHANGE, null);
	}

	protected void setAfterHeightChange(java.lang.String afterHeightChange) {
		getStateHelper().put(AFTER_HEIGHT_CHANGE, afterHeightChange);
	}

	protected java.lang.String getAfterHoveredItemChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_HOVERED_ITEM_CHANGE, null);
	}

	protected void setAfterHoveredItemChange(java.lang.String afterHoveredItemChange) {
		getStateHelper().put(AFTER_HOVERED_ITEM_CHANGE, afterHoveredItemChange);
	}

	protected java.lang.String getAfterIdChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_ID_CHANGE, null);
	}

	protected void setAfterIdChange(java.lang.String afterIdChange) {
		getStateHelper().put(AFTER_ID_CHANGE, afterIdChange);
	}

	protected java.lang.String getAfterInitializedChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_INITIALIZED_CHANGE, null);
	}

	protected void setAfterInitializedChange(java.lang.String afterInitializedChange) {
		getStateHelper().put(AFTER_INITIALIZED_CHANGE, afterInitializedChange);
	}

	protected java.lang.String getAfterInputNodeChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_INPUT_NODE_CHANGE, null);
	}

	protected void setAfterInputNodeChange(java.lang.String afterInputNodeChange) {
		getStateHelper().put(AFTER_INPUT_NODE_CHANGE, afterInputNodeChange);
	}

	protected java.lang.String getAfterListNodeChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_LIST_NODE_CHANGE, null);
	}

	protected void setAfterListNodeChange(java.lang.String afterListNodeChange) {
		getStateHelper().put(AFTER_LIST_NODE_CHANGE, afterListNodeChange);
	}

	protected java.lang.String getAfterLocaleChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_LOCALE_CHANGE, null);
	}

	protected void setAfterLocaleChange(java.lang.String afterLocaleChange) {
		getStateHelper().put(AFTER_LOCALE_CHANGE, afterLocaleChange);
	}

	protected java.lang.String getAfterMaxResultsChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_MAX_RESULTS_CHANGE, null);
	}

	protected void setAfterMaxResultsChange(java.lang.String afterMaxResultsChange) {
		getStateHelper().put(AFTER_MAX_RESULTS_CHANGE, afterMaxResultsChange);
	}

	protected java.lang.String getAfterMinQueryLengthChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_MIN_QUERY_LENGTH_CHANGE, null);
	}

	protected void setAfterMinQueryLengthChange(java.lang.String afterMinQueryLengthChange) {
		getStateHelper().put(AFTER_MIN_QUERY_LENGTH_CHANGE, afterMinQueryLengthChange);
	}

	protected java.lang.String getAfterQueryChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_QUERY_CHANGE, null);
	}

	protected void setAfterQueryChange(java.lang.String afterQueryChange) {
		getStateHelper().put(AFTER_QUERY_CHANGE, afterQueryChange);
	}

	protected java.lang.String getAfterQueryDelayChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_QUERY_DELAY_CHANGE, null);
	}

	protected void setAfterQueryDelayChange(java.lang.String afterQueryDelayChange) {
		getStateHelper().put(AFTER_QUERY_DELAY_CHANGE, afterQueryDelayChange);
	}

	protected java.lang.String getAfterQueryDelimiterChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_QUERY_DELIMITER_CHANGE, null);
	}

	protected void setAfterQueryDelimiterChange(java.lang.String afterQueryDelimiterChange) {
		getStateHelper().put(AFTER_QUERY_DELIMITER_CHANGE, afterQueryDelimiterChange);
	}

	protected java.lang.String getAfterRenderChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_RENDER_CHANGE, null);
	}

	protected void setAfterRenderChange(java.lang.String afterRenderChange) {
		getStateHelper().put(AFTER_RENDER_CHANGE, afterRenderChange);
	}

	protected java.lang.String getAfterRenderedChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_RENDERED_CHANGE, null);
	}

	protected void setAfterRenderedChange(java.lang.String afterRenderedChange) {
		getStateHelper().put(AFTER_RENDERED_CHANGE, afterRenderedChange);
	}

	protected java.lang.String getAfterRequestTemplateChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_REQUEST_TEMPLATE_CHANGE, null);
	}

	protected void setAfterRequestTemplateChange(java.lang.String afterRequestTemplateChange) {
		getStateHelper().put(AFTER_REQUEST_TEMPLATE_CHANGE, afterRequestTemplateChange);
	}

	protected java.lang.String getAfterResultFiltersChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_RESULT_FILTERS_CHANGE, null);
	}

	protected void setAfterResultFiltersChange(java.lang.String afterResultFiltersChange) {
		getStateHelper().put(AFTER_RESULT_FILTERS_CHANGE, afterResultFiltersChange);
	}

	protected java.lang.String getAfterResultFormatterChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_RESULT_FORMATTER_CHANGE, null);
	}

	protected void setAfterResultFormatterChange(java.lang.String afterResultFormatterChange) {
		getStateHelper().put(AFTER_RESULT_FORMATTER_CHANGE, afterResultFormatterChange);
	}

	protected java.lang.String getAfterResultHighlighterChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_RESULT_HIGHLIGHTER_CHANGE, null);
	}

	protected void setAfterResultHighlighterChange(java.lang.String afterResultHighlighterChange) {
		getStateHelper().put(AFTER_RESULT_HIGHLIGHTER_CHANGE, afterResultHighlighterChange);
	}

	protected java.lang.String getAfterResultListLocatorChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_RESULT_LIST_LOCATOR_CHANGE, null);
	}

	protected void setAfterResultListLocatorChange(java.lang.String afterResultListLocatorChange) {
		getStateHelper().put(AFTER_RESULT_LIST_LOCATOR_CHANGE, afterResultListLocatorChange);
	}

	protected java.lang.String getAfterResultTextLocatorChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_RESULT_TEXT_LOCATOR_CHANGE, null);
	}

	protected void setAfterResultTextLocatorChange(java.lang.String afterResultTextLocatorChange) {
		getStateHelper().put(AFTER_RESULT_TEXT_LOCATOR_CHANGE, afterResultTextLocatorChange);
	}

	protected java.lang.String getAfterResultsChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_RESULTS_CHANGE, null);
	}

	protected void setAfterResultsChange(java.lang.String afterResultsChange) {
		getStateHelper().put(AFTER_RESULTS_CHANGE, afterResultsChange);
	}

	protected java.lang.String getAfterScrollIntoViewChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_SCROLL_INTO_VIEW_CHANGE, null);
	}

	protected void setAfterScrollIntoViewChange(java.lang.String afterScrollIntoViewChange) {
		getStateHelper().put(AFTER_SCROLL_INTO_VIEW_CHANGE, afterScrollIntoViewChange);
	}

	protected java.lang.String getAfterSourceChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_SOURCE_CHANGE, null);
	}

	protected void setAfterSourceChange(java.lang.String afterSourceChange) {
		getStateHelper().put(AFTER_SOURCE_CHANGE, afterSourceChange);
	}

	protected java.lang.String getAfterSourceTypeChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_SOURCE_TYPE_CHANGE, null);
	}

	protected void setAfterSourceTypeChange(java.lang.String afterSourceTypeChange) {
		getStateHelper().put(AFTER_SOURCE_TYPE_CHANGE, afterSourceTypeChange);
	}

	protected java.lang.String getAfterSrcNodeChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_SRC_NODE_CHANGE, null);
	}

	protected void setAfterSrcNodeChange(java.lang.String afterSrcNodeChange) {
		getStateHelper().put(AFTER_SRC_NODE_CHANGE, afterSrcNodeChange);
	}

	protected java.lang.String getAfterStringsChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_STRINGS_CHANGE, null);
	}

	protected void setAfterStringsChange(java.lang.String afterStringsChange) {
		getStateHelper().put(AFTER_STRINGS_CHANGE, afterStringsChange);
	}

	protected java.lang.String getAfterTabIndexChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_TAB_INDEX_CHANGE, null);
	}

	protected void setAfterTabIndexChange(java.lang.String afterTabIndexChange) {
		getStateHelper().put(AFTER_TAB_INDEX_CHANGE, afterTabIndexChange);
	}

	protected java.lang.String getAfterTabSelectChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_TAB_SELECT_CHANGE, null);
	}

	protected void setAfterTabSelectChange(java.lang.String afterTabSelectChange) {
		getStateHelper().put(AFTER_TAB_SELECT_CHANGE, afterTabSelectChange);
	}

	protected java.lang.String getAfterTokenInputChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_TOKEN_INPUT_CHANGE, null);
	}

	protected void setAfterTokenInputChange(java.lang.String afterTokenInputChange) {
		getStateHelper().put(AFTER_TOKEN_INPUT_CHANGE, afterTokenInputChange);
	}

	protected java.lang.String getAfterValueChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_VALUE_CHANGE, null);
	}

	protected void setAfterValueChange(java.lang.String afterValueChange) {
		getStateHelper().put(AFTER_VALUE_CHANGE, afterValueChange);
	}

	protected java.lang.String getAfterVisibleChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_VISIBLE_CHANGE, null);
	}

	protected void setAfterVisibleChange(java.lang.String afterVisibleChange) {
		getStateHelper().put(AFTER_VISIBLE_CHANGE, afterVisibleChange);
	}

	protected java.lang.String getAfterWidthChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_WIDTH_CHANGE, null);
	}

	protected void setAfterWidthChange(java.lang.String afterWidthChange) {
		getStateHelper().put(AFTER_WIDTH_CHANGE, afterWidthChange);
	}

	protected java.lang.String getAfterXChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_XCHANGE, null);
	}

	protected void setAfterXChange(java.lang.String afterXChange) {
		getStateHelper().put(AFTER_XCHANGE, afterXChange);
	}

	protected java.lang.String getAfterXyChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_XY_CHANGE, null);
	}

	protected void setAfterXyChange(java.lang.String afterXyChange) {
		getStateHelper().put(AFTER_XY_CHANGE, afterXyChange);
	}

	protected java.lang.String getAfterYChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_YCHANGE, null);
	}

	protected void setAfterYChange(java.lang.String afterYChange) {
		getStateHelper().put(AFTER_YCHANGE, afterYChange);
	}

	protected java.lang.String getAfterYqlEnvChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_YQL_ENV_CHANGE, null);
	}

	protected void setAfterYqlEnvChange(java.lang.String afterYqlEnvChange) {
		getStateHelper().put(AFTER_YQL_ENV_CHANGE, afterYqlEnvChange);
	}

	protected java.lang.String getAfterYqlProtocolChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_YQL_PROTOCOL_CHANGE, null);
	}

	protected void setAfterYqlProtocolChange(java.lang.String afterYqlProtocolChange) {
		getStateHelper().put(AFTER_YQL_PROTOCOL_CHANGE, afterYqlProtocolChange);
	}

	protected java.lang.String getOnActivateFirstItemChange() {
		return (java.lang.String) getStateHelper().eval(ON_ACTIVATE_FIRST_ITEM_CHANGE, null);
	}

	protected void setOnActivateFirstItemChange(java.lang.String onActivateFirstItemChange) {
		getStateHelper().put(ON_ACTIVATE_FIRST_ITEM_CHANGE, onActivateFirstItemChange);
	}

	protected java.lang.String getOnActiveItemChange() {
		return (java.lang.String) getStateHelper().eval(ON_ACTIVE_ITEM_CHANGE, null);
	}

	protected void setOnActiveItemChange(java.lang.String onActiveItemChange) {
		getStateHelper().put(ON_ACTIVE_ITEM_CHANGE, onActiveItemChange);
	}

	protected java.lang.String getOnAlignChange() {
		return (java.lang.String) getStateHelper().eval(ON_ALIGN_CHANGE, null);
	}

	protected void setOnAlignChange(java.lang.String onAlignChange) {
		getStateHelper().put(ON_ALIGN_CHANGE, onAlignChange);
	}

	protected java.lang.String getOnAlignOnChange() {
		return (java.lang.String) getStateHelper().eval(ON_ALIGN_ON_CHANGE, null);
	}

	protected void setOnAlignOnChange(java.lang.String onAlignOnChange) {
		getStateHelper().put(ON_ALIGN_ON_CHANGE, onAlignOnChange);
	}

	protected java.lang.String getOnAllowBrowserAutocompleteChange() {
		return (java.lang.String) getStateHelper().eval(ON_ALLOW_BROWSER_AUTOCOMPLETE_CHANGE, null);
	}

	protected void setOnAllowBrowserAutocompleteChange(java.lang.String onAllowBrowserAutocompleteChange) {
		getStateHelper().put(ON_ALLOW_BROWSER_AUTOCOMPLETE_CHANGE, onAllowBrowserAutocompleteChange);
	}

	protected java.lang.String getOnAllowTrailingDelimiterChange() {
		return (java.lang.String) getStateHelper().eval(ON_ALLOW_TRAILING_DELIMITER_CHANGE, null);
	}

	protected void setOnAllowTrailingDelimiterChange(java.lang.String onAllowTrailingDelimiterChange) {
		getStateHelper().put(ON_ALLOW_TRAILING_DELIMITER_CHANGE, onAllowTrailingDelimiterChange);
	}

	protected java.lang.String getOnAlwaysShowListChange() {
		return (java.lang.String) getStateHelper().eval(ON_ALWAYS_SHOW_LIST_CHANGE, null);
	}

	protected void setOnAlwaysShowListChange(java.lang.String onAlwaysShowListChange) {
		getStateHelper().put(ON_ALWAYS_SHOW_LIST_CHANGE, onAlwaysShowListChange);
	}

	protected java.lang.String getOnBoundingBoxChange() {
		return (java.lang.String) getStateHelper().eval(ON_BOUNDING_BOX_CHANGE, null);
	}

	protected void setOnBoundingBoxChange(java.lang.String onBoundingBoxChange) {
		getStateHelper().put(ON_BOUNDING_BOX_CHANGE, onBoundingBoxChange);
	}

	protected java.lang.String getOnCenteredChange() {
		return (java.lang.String) getStateHelper().eval(ON_CENTERED_CHANGE, null);
	}

	protected void setOnCenteredChange(java.lang.String onCenteredChange) {
		getStateHelper().put(ON_CENTERED_CHANGE, onCenteredChange);
	}

	protected java.lang.String getOnCircularChange() {
		return (java.lang.String) getStateHelper().eval(ON_CIRCULAR_CHANGE, null);
	}

	protected void setOnCircularChange(java.lang.String onCircularChange) {
		getStateHelper().put(ON_CIRCULAR_CHANGE, onCircularChange);
	}

	protected java.lang.String getOnContentBoxChange() {
		return (java.lang.String) getStateHelper().eval(ON_CONTENT_BOX_CHANGE, null);
	}

	protected void setOnContentBoxChange(java.lang.String onContentBoxChange) {
		getStateHelper().put(ON_CONTENT_BOX_CHANGE, onContentBoxChange);
	}

	protected java.lang.String getOnDestroyedChange() {
		return (java.lang.String) getStateHelper().eval(ON_DESTROYED_CHANGE, null);
	}

	protected void setOnDestroyedChange(java.lang.String onDestroyedChange) {
		getStateHelper().put(ON_DESTROYED_CHANGE, onDestroyedChange);
	}

	protected java.lang.String getOnDisabledChange() {
		return (java.lang.String) getStateHelper().eval(ON_DISABLED_CHANGE, null);
	}

	protected void setOnDisabledChange(java.lang.String onDisabledChange) {
		getStateHelper().put(ON_DISABLED_CHANGE, onDisabledChange);
	}

	protected java.lang.String getOnEnableCacheChange() {
		return (java.lang.String) getStateHelper().eval(ON_ENABLE_CACHE_CHANGE, null);
	}

	protected void setOnEnableCacheChange(java.lang.String onEnableCacheChange) {
		getStateHelper().put(ON_ENABLE_CACHE_CHANGE, onEnableCacheChange);
	}

	protected java.lang.String getOnFocusedChange() {
		return (java.lang.String) getStateHelper().eval(ON_FOCUSED_CHANGE, null);
	}

	protected void setOnFocusedChange(java.lang.String onFocusedChange) {
		getStateHelper().put(ON_FOCUSED_CHANGE, onFocusedChange);
	}

	protected java.lang.String getOnHeightChange() {
		return (java.lang.String) getStateHelper().eval(ON_HEIGHT_CHANGE, null);
	}

	protected void setOnHeightChange(java.lang.String onHeightChange) {
		getStateHelper().put(ON_HEIGHT_CHANGE, onHeightChange);
	}

	protected java.lang.String getOnHoveredItemChange() {
		return (java.lang.String) getStateHelper().eval(ON_HOVERED_ITEM_CHANGE, null);
	}

	protected void setOnHoveredItemChange(java.lang.String onHoveredItemChange) {
		getStateHelper().put(ON_HOVERED_ITEM_CHANGE, onHoveredItemChange);
	}

	protected java.lang.String getOnIdChange() {
		return (java.lang.String) getStateHelper().eval(ON_ID_CHANGE, null);
	}

	protected void setOnIdChange(java.lang.String onIdChange) {
		getStateHelper().put(ON_ID_CHANGE, onIdChange);
	}

	protected java.lang.String getOnInitializedChange() {
		return (java.lang.String) getStateHelper().eval(ON_INITIALIZED_CHANGE, null);
	}

	protected void setOnInitializedChange(java.lang.String onInitializedChange) {
		getStateHelper().put(ON_INITIALIZED_CHANGE, onInitializedChange);
	}

	protected java.lang.String getOnInputNodeChange() {
		return (java.lang.String) getStateHelper().eval(ON_INPUT_NODE_CHANGE, null);
	}

	protected void setOnInputNodeChange(java.lang.String onInputNodeChange) {
		getStateHelper().put(ON_INPUT_NODE_CHANGE, onInputNodeChange);
	}

	protected java.lang.String getOnListNodeChange() {
		return (java.lang.String) getStateHelper().eval(ON_LIST_NODE_CHANGE, null);
	}

	protected void setOnListNodeChange(java.lang.String onListNodeChange) {
		getStateHelper().put(ON_LIST_NODE_CHANGE, onListNodeChange);
	}

	protected java.lang.String getOnLocaleChange() {
		return (java.lang.String) getStateHelper().eval(ON_LOCALE_CHANGE, null);
	}

	protected void setOnLocaleChange(java.lang.String onLocaleChange) {
		getStateHelper().put(ON_LOCALE_CHANGE, onLocaleChange);
	}

	protected java.lang.String getOnMaxResultsChange() {
		return (java.lang.String) getStateHelper().eval(ON_MAX_RESULTS_CHANGE, null);
	}

	protected void setOnMaxResultsChange(java.lang.String onMaxResultsChange) {
		getStateHelper().put(ON_MAX_RESULTS_CHANGE, onMaxResultsChange);
	}

	protected java.lang.String getOnMinQueryLengthChange() {
		return (java.lang.String) getStateHelper().eval(ON_MIN_QUERY_LENGTH_CHANGE, null);
	}

	protected void setOnMinQueryLengthChange(java.lang.String onMinQueryLengthChange) {
		getStateHelper().put(ON_MIN_QUERY_LENGTH_CHANGE, onMinQueryLengthChange);
	}

	protected java.lang.String getOnQueryChange() {
		return (java.lang.String) getStateHelper().eval(ON_QUERY_CHANGE, null);
	}

	protected void setOnQueryChange(java.lang.String onQueryChange) {
		getStateHelper().put(ON_QUERY_CHANGE, onQueryChange);
	}

	protected java.lang.String getOnQueryDelayChange() {
		return (java.lang.String) getStateHelper().eval(ON_QUERY_DELAY_CHANGE, null);
	}

	protected void setOnQueryDelayChange(java.lang.String onQueryDelayChange) {
		getStateHelper().put(ON_QUERY_DELAY_CHANGE, onQueryDelayChange);
	}

	protected java.lang.String getOnQueryDelimiterChange() {
		return (java.lang.String) getStateHelper().eval(ON_QUERY_DELIMITER_CHANGE, null);
	}

	protected void setOnQueryDelimiterChange(java.lang.String onQueryDelimiterChange) {
		getStateHelper().put(ON_QUERY_DELIMITER_CHANGE, onQueryDelimiterChange);
	}

	protected java.lang.String getOnRenderChange() {
		return (java.lang.String) getStateHelper().eval(ON_RENDER_CHANGE, null);
	}

	protected void setOnRenderChange(java.lang.String onRenderChange) {
		getStateHelper().put(ON_RENDER_CHANGE, onRenderChange);
	}

	protected java.lang.String getOnRenderedChange() {
		return (java.lang.String) getStateHelper().eval(ON_RENDERED_CHANGE, null);
	}

	protected void setOnRenderedChange(java.lang.String onRenderedChange) {
		getStateHelper().put(ON_RENDERED_CHANGE, onRenderedChange);
	}

	protected java.lang.String getOnRequestTemplateChange() {
		return (java.lang.String) getStateHelper().eval(ON_REQUEST_TEMPLATE_CHANGE, null);
	}

	protected void setOnRequestTemplateChange(java.lang.String onRequestTemplateChange) {
		getStateHelper().put(ON_REQUEST_TEMPLATE_CHANGE, onRequestTemplateChange);
	}

	protected java.lang.String getOnResultFiltersChange() {
		return (java.lang.String) getStateHelper().eval(ON_RESULT_FILTERS_CHANGE, null);
	}

	protected void setOnResultFiltersChange(java.lang.String onResultFiltersChange) {
		getStateHelper().put(ON_RESULT_FILTERS_CHANGE, onResultFiltersChange);
	}

	protected java.lang.String getOnResultFormatterChange() {
		return (java.lang.String) getStateHelper().eval(ON_RESULT_FORMATTER_CHANGE, null);
	}

	protected void setOnResultFormatterChange(java.lang.String onResultFormatterChange) {
		getStateHelper().put(ON_RESULT_FORMATTER_CHANGE, onResultFormatterChange);
	}

	protected java.lang.String getOnResultHighlighterChange() {
		return (java.lang.String) getStateHelper().eval(ON_RESULT_HIGHLIGHTER_CHANGE, null);
	}

	protected void setOnResultHighlighterChange(java.lang.String onResultHighlighterChange) {
		getStateHelper().put(ON_RESULT_HIGHLIGHTER_CHANGE, onResultHighlighterChange);
	}

	protected java.lang.String getOnResultListLocatorChange() {
		return (java.lang.String) getStateHelper().eval(ON_RESULT_LIST_LOCATOR_CHANGE, null);
	}

	protected void setOnResultListLocatorChange(java.lang.String onResultListLocatorChange) {
		getStateHelper().put(ON_RESULT_LIST_LOCATOR_CHANGE, onResultListLocatorChange);
	}

	protected java.lang.String getOnResultTextLocatorChange() {
		return (java.lang.String) getStateHelper().eval(ON_RESULT_TEXT_LOCATOR_CHANGE, null);
	}

	protected void setOnResultTextLocatorChange(java.lang.String onResultTextLocatorChange) {
		getStateHelper().put(ON_RESULT_TEXT_LOCATOR_CHANGE, onResultTextLocatorChange);
	}

	protected java.lang.String getOnResultsChange() {
		return (java.lang.String) getStateHelper().eval(ON_RESULTS_CHANGE, null);
	}

	protected void setOnResultsChange(java.lang.String onResultsChange) {
		getStateHelper().put(ON_RESULTS_CHANGE, onResultsChange);
	}

	protected java.lang.String getOnScrollIntoViewChange() {
		return (java.lang.String) getStateHelper().eval(ON_SCROLL_INTO_VIEW_CHANGE, null);
	}

	protected void setOnScrollIntoViewChange(java.lang.String onScrollIntoViewChange) {
		getStateHelper().put(ON_SCROLL_INTO_VIEW_CHANGE, onScrollIntoViewChange);
	}

	protected java.lang.String getOnSourceChange() {
		return (java.lang.String) getStateHelper().eval(ON_SOURCE_CHANGE, null);
	}

	protected void setOnSourceChange(java.lang.String onSourceChange) {
		getStateHelper().put(ON_SOURCE_CHANGE, onSourceChange);
	}

	protected java.lang.String getOnSourceTypeChange() {
		return (java.lang.String) getStateHelper().eval(ON_SOURCE_TYPE_CHANGE, null);
	}

	protected void setOnSourceTypeChange(java.lang.String onSourceTypeChange) {
		getStateHelper().put(ON_SOURCE_TYPE_CHANGE, onSourceTypeChange);
	}

	protected java.lang.String getOnSrcNodeChange() {
		return (java.lang.String) getStateHelper().eval(ON_SRC_NODE_CHANGE, null);
	}

	protected void setOnSrcNodeChange(java.lang.String onSrcNodeChange) {
		getStateHelper().put(ON_SRC_NODE_CHANGE, onSrcNodeChange);
	}

	protected java.lang.String getOnStringsChange() {
		return (java.lang.String) getStateHelper().eval(ON_STRINGS_CHANGE, null);
	}

	protected void setOnStringsChange(java.lang.String onStringsChange) {
		getStateHelper().put(ON_STRINGS_CHANGE, onStringsChange);
	}

	protected java.lang.String getOnTabIndexChange() {
		return (java.lang.String) getStateHelper().eval(ON_TAB_INDEX_CHANGE, null);
	}

	protected void setOnTabIndexChange(java.lang.String onTabIndexChange) {
		getStateHelper().put(ON_TAB_INDEX_CHANGE, onTabIndexChange);
	}

	protected java.lang.String getOnTabSelectChange() {
		return (java.lang.String) getStateHelper().eval(ON_TAB_SELECT_CHANGE, null);
	}

	protected void setOnTabSelectChange(java.lang.String onTabSelectChange) {
		getStateHelper().put(ON_TAB_SELECT_CHANGE, onTabSelectChange);
	}

	protected java.lang.String getOnTokenInputChange() {
		return (java.lang.String) getStateHelper().eval(ON_TOKEN_INPUT_CHANGE, null);
	}

	protected void setOnTokenInputChange(java.lang.String onTokenInputChange) {
		getStateHelper().put(ON_TOKEN_INPUT_CHANGE, onTokenInputChange);
	}

	protected java.lang.String getOnValueChange() {
		return (java.lang.String) getStateHelper().eval(ON_VALUE_CHANGE, null);
	}

	protected void setOnValueChange(java.lang.String onValueChange) {
		getStateHelper().put(ON_VALUE_CHANGE, onValueChange);
	}

	protected java.lang.String getOnVisibleChange() {
		return (java.lang.String) getStateHelper().eval(ON_VISIBLE_CHANGE, null);
	}

	protected void setOnVisibleChange(java.lang.String onVisibleChange) {
		getStateHelper().put(ON_VISIBLE_CHANGE, onVisibleChange);
	}

	protected java.lang.String getOnWidthChange() {
		return (java.lang.String) getStateHelper().eval(ON_WIDTH_CHANGE, null);
	}

	protected void setOnWidthChange(java.lang.String onWidthChange) {
		getStateHelper().put(ON_WIDTH_CHANGE, onWidthChange);
	}

	protected java.lang.String getOnXChange() {
		return (java.lang.String) getStateHelper().eval(ON_XCHANGE, null);
	}

	protected void setOnXChange(java.lang.String onXChange) {
		getStateHelper().put(ON_XCHANGE, onXChange);
	}

	protected java.lang.String getOnXyChange() {
		return (java.lang.String) getStateHelper().eval(ON_XY_CHANGE, null);
	}

	protected void setOnXyChange(java.lang.String onXyChange) {
		getStateHelper().put(ON_XY_CHANGE, onXyChange);
	}

	protected java.lang.String getOnYChange() {
		return (java.lang.String) getStateHelper().eval(ON_YCHANGE, null);
	}

	protected void setOnYChange(java.lang.String onYChange) {
		getStateHelper().put(ON_YCHANGE, onYChange);
	}

	protected java.lang.String getOnYqlEnvChange() {
		return (java.lang.String) getStateHelper().eval(ON_YQL_ENV_CHANGE, null);
	}

	protected void setOnYqlEnvChange(java.lang.String onYqlEnvChange) {
		getStateHelper().put(ON_YQL_ENV_CHANGE, onYqlEnvChange);
	}

	protected java.lang.String getOnYqlProtocolChange() {
		return (java.lang.String) getStateHelper().eval(ON_YQL_PROTOCOL_CHANGE, null);
	}

	protected void setOnYqlProtocolChange(java.lang.String onYqlProtocolChange) {
		getStateHelper().put(ON_YQL_PROTOCOL_CHANGE, onYqlProtocolChange);
	}

}
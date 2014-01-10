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
package com.liferay.faces.alloy.component.autocompletelist;

/**
 * @author Eduardo Lundgren
 * @author Bruno Basto
 * @author Nathan Cavanaugh
 * @generated
 */
public abstract class AutoCompleteListBase extends javax.faces.component.UIPanel {

	private static final String HOST = "host";
	private static final String LIST_NODE = "listNode";
	private static final String LOADING_MESSAGE = "loadingMessage";
	private static final String RESULTS = "results";
	private static final String SELECTED_ENTRY = "selectedEntry";
	private static final String STRINGS = "strings";
	private static final String AFTER_HOST_CHANGE = "afterHostChange";
	private static final String AFTER_LIST_NODE_CHANGE = "afterListNodeChange";
	private static final String AFTER_LOADING_MESSAGE_CHANGE = "afterLoadingMessageChange";
	private static final String AFTER_RESULTS_CHANGE = "afterResultsChange";
	private static final String AFTER_SELECTED_ENTRY_CHANGE = "afterSelectedEntryChange";
	private static final String AFTER_STRINGS_CHANGE = "afterStringsChange";
	private static final String ON_HOST_CHANGE = "onHostChange";
	private static final String ON_LIST_NODE_CHANGE = "onListNodeChange";
	private static final String ON_LOADING_MESSAGE_CHANGE = "onLoadingMessageChange";
	private static final String ON_RESULTS_CHANGE = "onResultsChange";
	private static final String ON_SELECTED_ENTRY_CHANGE = "onSelectedEntryChange";
	private static final String ON_STRINGS_CHANGE = "onStringsChange";

	protected java.lang.Object getHost() {
		return (java.lang.Object) getStateHelper().eval(HOST, null);
	}

	protected void setHost(java.lang.Object host) {
		getStateHelper().put(HOST, host);
	}

	protected java.lang.Object getListNode() {
		return (java.lang.Object) getStateHelper().eval(LIST_NODE, null);
	}

	protected void setListNode(java.lang.Object listNode) {
		getStateHelper().put(LIST_NODE, listNode);
	}

	protected java.lang.String getLoadingMessage() {
		return (java.lang.String) getStateHelper().eval(LOADING_MESSAGE, null);
	}

	protected void setLoadingMessage(java.lang.String loadingMessage) {
		getStateHelper().put(LOADING_MESSAGE, loadingMessage);
	}

	protected java.lang.Object getResults() {
		return (java.lang.Object) getStateHelper().eval(RESULTS, null);
	}

	protected void setResults(java.lang.Object results) {
		getStateHelper().put(RESULTS, results);
	}

	protected java.lang.Object getSelectedEntry() {
		return (java.lang.Object) getStateHelper().eval(SELECTED_ENTRY, null);
	}

	protected void setSelectedEntry(java.lang.Object selectedEntry) {
		getStateHelper().put(SELECTED_ENTRY, selectedEntry);
	}

	protected java.lang.Object getStrings() {
		return (java.lang.Object) getStateHelper().eval(STRINGS, null);
	}

	protected void setStrings(java.lang.Object strings) {
		getStateHelper().put(STRINGS, strings);
	}

	protected java.lang.String getAfterHostChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_HOST_CHANGE, null);
	}

	protected void setAfterHostChange(java.lang.String afterHostChange) {
		getStateHelper().put(AFTER_HOST_CHANGE, afterHostChange);
	}

	protected java.lang.String getAfterListNodeChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_LIST_NODE_CHANGE, null);
	}

	protected void setAfterListNodeChange(java.lang.String afterListNodeChange) {
		getStateHelper().put(AFTER_LIST_NODE_CHANGE, afterListNodeChange);
	}

	protected java.lang.String getAfterLoadingMessageChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_LOADING_MESSAGE_CHANGE, null);
	}

	protected void setAfterLoadingMessageChange(java.lang.String afterLoadingMessageChange) {
		getStateHelper().put(AFTER_LOADING_MESSAGE_CHANGE, afterLoadingMessageChange);
	}

	protected java.lang.String getAfterResultsChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_RESULTS_CHANGE, null);
	}

	protected void setAfterResultsChange(java.lang.String afterResultsChange) {
		getStateHelper().put(AFTER_RESULTS_CHANGE, afterResultsChange);
	}

	protected java.lang.String getAfterSelectedEntryChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_SELECTED_ENTRY_CHANGE, null);
	}

	protected void setAfterSelectedEntryChange(java.lang.String afterSelectedEntryChange) {
		getStateHelper().put(AFTER_SELECTED_ENTRY_CHANGE, afterSelectedEntryChange);
	}

	protected java.lang.String getAfterStringsChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_STRINGS_CHANGE, null);
	}

	protected void setAfterStringsChange(java.lang.String afterStringsChange) {
		getStateHelper().put(AFTER_STRINGS_CHANGE, afterStringsChange);
	}

	protected java.lang.String getOnHostChange() {
		return (java.lang.String) getStateHelper().eval(ON_HOST_CHANGE, null);
	}

	protected void setOnHostChange(java.lang.String onHostChange) {
		getStateHelper().put(ON_HOST_CHANGE, onHostChange);
	}

	protected java.lang.String getOnListNodeChange() {
		return (java.lang.String) getStateHelper().eval(ON_LIST_NODE_CHANGE, null);
	}

	protected void setOnListNodeChange(java.lang.String onListNodeChange) {
		getStateHelper().put(ON_LIST_NODE_CHANGE, onListNodeChange);
	}

	protected java.lang.String getOnLoadingMessageChange() {
		return (java.lang.String) getStateHelper().eval(ON_LOADING_MESSAGE_CHANGE, null);
	}

	protected void setOnLoadingMessageChange(java.lang.String onLoadingMessageChange) {
		getStateHelper().put(ON_LOADING_MESSAGE_CHANGE, onLoadingMessageChange);
	}

	protected java.lang.String getOnResultsChange() {
		return (java.lang.String) getStateHelper().eval(ON_RESULTS_CHANGE, null);
	}

	protected void setOnResultsChange(java.lang.String onResultsChange) {
		getStateHelper().put(ON_RESULTS_CHANGE, onResultsChange);
	}

	protected java.lang.String getOnSelectedEntryChange() {
		return (java.lang.String) getStateHelper().eval(ON_SELECTED_ENTRY_CHANGE, null);
	}

	protected void setOnSelectedEntryChange(java.lang.String onSelectedEntryChange) {
		getStateHelper().put(ON_SELECTED_ENTRY_CHANGE, onSelectedEntryChange);
	}

	protected java.lang.String getOnStringsChange() {
		return (java.lang.String) getStateHelper().eval(ON_STRINGS_CHANGE, null);
	}

	protected void setOnStringsChange(java.lang.String onStringsChange) {
		getStateHelper().put(ON_STRINGS_CHANGE, onStringsChange);
	}

}
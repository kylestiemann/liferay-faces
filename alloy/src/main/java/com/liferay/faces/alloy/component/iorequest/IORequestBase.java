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
package com.liferay.faces.alloy.component.iorequest;

/**
 * @author Eduardo Lundgren
 * @author Bruno Basto
 * @author Nathan Cavanaugh
 * @generated
 */
public abstract class IORequestBase extends javax.faces.component.UIPanel {

	private static final String ACTIVE = "active";
	private static final String ARGUMENTS = "arguments";
	private static final String AUTO_LOAD = "autoLoad";
	private static final String CACHE = "cache";
	private static final String CFG = "cfg";
	private static final String CONTEXT = "context";
	private static final String DATA = "data";
	private static final String DATA_TYPE = "dataType";
	private static final String FORM = "form";
	private static final String HEADERS = "headers";
	private static final String METHOD = "method";
	private static final String RESPONSE_DATA = "responseData";
	private static final String SELECTOR = "selector";
	private static final String SYNC = "sync";
	private static final String TIMEOUT = "timeout";
	private static final String TRANSACTION = "transaction";
	private static final String URI = "uri";
	private static final String XDR = "xdr";
	private static final String AFTER_ACTIVE_CHANGE = "afterActiveChange";
	private static final String AFTER_ARGUMENTS_CHANGE = "afterArgumentsChange";
	private static final String AFTER_AUTO_LOAD_CHANGE = "afterAutoLoadChange";
	private static final String AFTER_CACHE_CHANGE = "afterCacheChange";
	private static final String AFTER_CFG_CHANGE = "afterCfgChange";
	private static final String AFTER_CONTEXT_CHANGE = "afterContextChange";
	private static final String AFTER_DATA_CHANGE = "afterDataChange";
	private static final String AFTER_DATA_TYPE_CHANGE = "afterDataTypeChange";
	private static final String AFTER_FORM_CHANGE = "afterFormChange";
	private static final String AFTER_HEADERS_CHANGE = "afterHeadersChange";
	private static final String AFTER_METHOD_CHANGE = "afterMethodChange";
	private static final String AFTER_RESPONSE_DATA_CHANGE = "afterResponseDataChange";
	private static final String AFTER_SELECTOR_CHANGE = "afterSelectorChange";
	private static final String AFTER_SYNC_CHANGE = "afterSyncChange";
	private static final String AFTER_TIMEOUT_CHANGE = "afterTimeoutChange";
	private static final String AFTER_TRANSACTION_CHANGE = "afterTransactionChange";
	private static final String AFTER_URI_CHANGE = "afterUriChange";
	private static final String AFTER_XDR_CHANGE = "afterXdrChange";
	private static final String ON_ACTIVE_CHANGE = "onActiveChange";
	private static final String ON_ARGUMENTS_CHANGE = "onArgumentsChange";
	private static final String ON_AUTO_LOAD_CHANGE = "onAutoLoadChange";
	private static final String ON_CACHE_CHANGE = "onCacheChange";
	private static final String ON_CFG_CHANGE = "onCfgChange";
	private static final String ON_CONTEXT_CHANGE = "onContextChange";
	private static final String ON_DATA_CHANGE = "onDataChange";
	private static final String ON_DATA_TYPE_CHANGE = "onDataTypeChange";
	private static final String ON_FORM_CHANGE = "onFormChange";
	private static final String ON_HEADERS_CHANGE = "onHeadersChange";
	private static final String ON_METHOD_CHANGE = "onMethodChange";
	private static final String ON_RESPONSE_DATA_CHANGE = "onResponseDataChange";
	private static final String ON_SELECTOR_CHANGE = "onSelectorChange";
	private static final String ON_SYNC_CHANGE = "onSyncChange";
	private static final String ON_TIMEOUT_CHANGE = "onTimeoutChange";
	private static final String ON_TRANSACTION_CHANGE = "onTransactionChange";
	private static final String ON_URI_CHANGE = "onUriChange";
	private static final String ON_XDR_CHANGE = "onXdrChange";

	protected java.lang.Boolean getActive() {
		return (java.lang.Boolean) getStateHelper().eval(ACTIVE, null);
	}

	protected void setActive(java.lang.Boolean active) {
		getStateHelper().put(ACTIVE, active);
	}

	protected java.lang.Object getArguments() {
		return (java.lang.Object) getStateHelper().eval(ARGUMENTS, null);
	}

	protected void setArguments(java.lang.Object arguments) {
		getStateHelper().put(ARGUMENTS, arguments);
	}

	protected java.lang.Boolean getAutoLoad() {
		return (java.lang.Boolean) getStateHelper().eval(AUTO_LOAD, null);
	}

	protected void setAutoLoad(java.lang.Boolean autoLoad) {
		getStateHelper().put(AUTO_LOAD, autoLoad);
	}

	protected java.lang.Boolean getCache() {
		return (java.lang.Boolean) getStateHelper().eval(CACHE, null);
	}

	protected void setCache(java.lang.Boolean cache) {
		getStateHelper().put(CACHE, cache);
	}

	protected java.lang.String getCfg() {
		return (java.lang.String) getStateHelper().eval(CFG, null);
	}

	protected void setCfg(java.lang.String cfg) {
		getStateHelper().put(CFG, cfg);
	}

	protected java.lang.Object getContext() {
		return (java.lang.Object) getStateHelper().eval(CONTEXT, null);
	}

	protected void setContext(java.lang.Object context) {
		getStateHelper().put(CONTEXT, context);
	}

	protected java.lang.Object getData() {
		return (java.lang.Object) getStateHelper().eval(DATA, null);
	}

	protected void setData(java.lang.Object data) {
		getStateHelper().put(DATA, data);
	}

	protected java.lang.String getDataType() {
		return (java.lang.String) getStateHelper().eval(DATA_TYPE, null);
	}

	protected void setDataType(java.lang.String dataType) {
		getStateHelper().put(DATA_TYPE, dataType);
	}

	protected java.lang.Object getForm() {
		return (java.lang.Object) getStateHelper().eval(FORM, null);
	}

	protected void setForm(java.lang.Object form) {
		getStateHelper().put(FORM, form);
	}

	protected java.lang.Object getHeaders() {
		return (java.lang.Object) getStateHelper().eval(HEADERS, null);
	}

	protected void setHeaders(java.lang.Object headers) {
		getStateHelper().put(HEADERS, headers);
	}

	protected java.lang.String getMethod() {
		return (java.lang.String) getStateHelper().eval(METHOD, null);
	}

	protected void setMethod(java.lang.String method) {
		getStateHelper().put(METHOD, method);
	}

	protected java.lang.Object getResponseData() {
		return (java.lang.Object) getStateHelper().eval(RESPONSE_DATA, null);
	}

	protected void setResponseData(java.lang.Object responseData) {
		getStateHelper().put(RESPONSE_DATA, responseData);
	}

	protected java.lang.String getSelector() {
		return (java.lang.String) getStateHelper().eval(SELECTOR, null);
	}

	protected void setSelector(java.lang.String selector) {
		getStateHelper().put(SELECTOR, selector);
	}

	protected java.lang.Boolean getSync() {
		return (java.lang.Boolean) getStateHelper().eval(SYNC, null);
	}

	protected void setSync(java.lang.Boolean sync) {
		getStateHelper().put(SYNC, sync);
	}

	protected java.lang.Object getTimeout() {
		return (java.lang.Object) getStateHelper().eval(TIMEOUT, null);
	}

	protected void setTimeout(java.lang.Object timeout) {
		getStateHelper().put(TIMEOUT, timeout);
	}

	protected java.lang.Object getTransaction() {
		return (java.lang.Object) getStateHelper().eval(TRANSACTION, null);
	}

	protected void setTransaction(java.lang.Object transaction) {
		getStateHelper().put(TRANSACTION, transaction);
	}

	protected java.lang.String getUri() {
		return (java.lang.String) getStateHelper().eval(URI, null);
	}

	protected void setUri(java.lang.String uri) {
		getStateHelper().put(URI, uri);
	}

	protected java.lang.Object getXdr() {
		return (java.lang.Object) getStateHelper().eval(XDR, null);
	}

	protected void setXdr(java.lang.Object xdr) {
		getStateHelper().put(XDR, xdr);
	}

	protected java.lang.String getAfterActiveChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_ACTIVE_CHANGE, null);
	}

	protected void setAfterActiveChange(java.lang.String afterActiveChange) {
		getStateHelper().put(AFTER_ACTIVE_CHANGE, afterActiveChange);
	}

	protected java.lang.String getAfterArgumentsChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_ARGUMENTS_CHANGE, null);
	}

	protected void setAfterArgumentsChange(java.lang.String afterArgumentsChange) {
		getStateHelper().put(AFTER_ARGUMENTS_CHANGE, afterArgumentsChange);
	}

	protected java.lang.String getAfterAutoLoadChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_AUTO_LOAD_CHANGE, null);
	}

	protected void setAfterAutoLoadChange(java.lang.String afterAutoLoadChange) {
		getStateHelper().put(AFTER_AUTO_LOAD_CHANGE, afterAutoLoadChange);
	}

	protected java.lang.String getAfterCacheChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_CACHE_CHANGE, null);
	}

	protected void setAfterCacheChange(java.lang.String afterCacheChange) {
		getStateHelper().put(AFTER_CACHE_CHANGE, afterCacheChange);
	}

	protected java.lang.String getAfterCfgChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_CFG_CHANGE, null);
	}

	protected void setAfterCfgChange(java.lang.String afterCfgChange) {
		getStateHelper().put(AFTER_CFG_CHANGE, afterCfgChange);
	}

	protected java.lang.String getAfterContextChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_CONTEXT_CHANGE, null);
	}

	protected void setAfterContextChange(java.lang.String afterContextChange) {
		getStateHelper().put(AFTER_CONTEXT_CHANGE, afterContextChange);
	}

	protected java.lang.String getAfterDataChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_DATA_CHANGE, null);
	}

	protected void setAfterDataChange(java.lang.String afterDataChange) {
		getStateHelper().put(AFTER_DATA_CHANGE, afterDataChange);
	}

	protected java.lang.String getAfterDataTypeChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_DATA_TYPE_CHANGE, null);
	}

	protected void setAfterDataTypeChange(java.lang.String afterDataTypeChange) {
		getStateHelper().put(AFTER_DATA_TYPE_CHANGE, afterDataTypeChange);
	}

	protected java.lang.String getAfterFormChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_FORM_CHANGE, null);
	}

	protected void setAfterFormChange(java.lang.String afterFormChange) {
		getStateHelper().put(AFTER_FORM_CHANGE, afterFormChange);
	}

	protected java.lang.String getAfterHeadersChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_HEADERS_CHANGE, null);
	}

	protected void setAfterHeadersChange(java.lang.String afterHeadersChange) {
		getStateHelper().put(AFTER_HEADERS_CHANGE, afterHeadersChange);
	}

	protected java.lang.String getAfterMethodChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_METHOD_CHANGE, null);
	}

	protected void setAfterMethodChange(java.lang.String afterMethodChange) {
		getStateHelper().put(AFTER_METHOD_CHANGE, afterMethodChange);
	}

	protected java.lang.String getAfterResponseDataChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_RESPONSE_DATA_CHANGE, null);
	}

	protected void setAfterResponseDataChange(java.lang.String afterResponseDataChange) {
		getStateHelper().put(AFTER_RESPONSE_DATA_CHANGE, afterResponseDataChange);
	}

	protected java.lang.String getAfterSelectorChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_SELECTOR_CHANGE, null);
	}

	protected void setAfterSelectorChange(java.lang.String afterSelectorChange) {
		getStateHelper().put(AFTER_SELECTOR_CHANGE, afterSelectorChange);
	}

	protected java.lang.String getAfterSyncChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_SYNC_CHANGE, null);
	}

	protected void setAfterSyncChange(java.lang.String afterSyncChange) {
		getStateHelper().put(AFTER_SYNC_CHANGE, afterSyncChange);
	}

	protected java.lang.String getAfterTimeoutChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_TIMEOUT_CHANGE, null);
	}

	protected void setAfterTimeoutChange(java.lang.String afterTimeoutChange) {
		getStateHelper().put(AFTER_TIMEOUT_CHANGE, afterTimeoutChange);
	}

	protected java.lang.String getAfterTransactionChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_TRANSACTION_CHANGE, null);
	}

	protected void setAfterTransactionChange(java.lang.String afterTransactionChange) {
		getStateHelper().put(AFTER_TRANSACTION_CHANGE, afterTransactionChange);
	}

	protected java.lang.String getAfterUriChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_URI_CHANGE, null);
	}

	protected void setAfterUriChange(java.lang.String afterUriChange) {
		getStateHelper().put(AFTER_URI_CHANGE, afterUriChange);
	}

	protected java.lang.String getAfterXdrChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_XDR_CHANGE, null);
	}

	protected void setAfterXdrChange(java.lang.String afterXdrChange) {
		getStateHelper().put(AFTER_XDR_CHANGE, afterXdrChange);
	}

	protected java.lang.String getOnActiveChange() {
		return (java.lang.String) getStateHelper().eval(ON_ACTIVE_CHANGE, null);
	}

	protected void setOnActiveChange(java.lang.String onActiveChange) {
		getStateHelper().put(ON_ACTIVE_CHANGE, onActiveChange);
	}

	protected java.lang.String getOnArgumentsChange() {
		return (java.lang.String) getStateHelper().eval(ON_ARGUMENTS_CHANGE, null);
	}

	protected void setOnArgumentsChange(java.lang.String onArgumentsChange) {
		getStateHelper().put(ON_ARGUMENTS_CHANGE, onArgumentsChange);
	}

	protected java.lang.String getOnAutoLoadChange() {
		return (java.lang.String) getStateHelper().eval(ON_AUTO_LOAD_CHANGE, null);
	}

	protected void setOnAutoLoadChange(java.lang.String onAutoLoadChange) {
		getStateHelper().put(ON_AUTO_LOAD_CHANGE, onAutoLoadChange);
	}

	protected java.lang.String getOnCacheChange() {
		return (java.lang.String) getStateHelper().eval(ON_CACHE_CHANGE, null);
	}

	protected void setOnCacheChange(java.lang.String onCacheChange) {
		getStateHelper().put(ON_CACHE_CHANGE, onCacheChange);
	}

	protected java.lang.String getOnCfgChange() {
		return (java.lang.String) getStateHelper().eval(ON_CFG_CHANGE, null);
	}

	protected void setOnCfgChange(java.lang.String onCfgChange) {
		getStateHelper().put(ON_CFG_CHANGE, onCfgChange);
	}

	protected java.lang.String getOnContextChange() {
		return (java.lang.String) getStateHelper().eval(ON_CONTEXT_CHANGE, null);
	}

	protected void setOnContextChange(java.lang.String onContextChange) {
		getStateHelper().put(ON_CONTEXT_CHANGE, onContextChange);
	}

	protected java.lang.String getOnDataChange() {
		return (java.lang.String) getStateHelper().eval(ON_DATA_CHANGE, null);
	}

	protected void setOnDataChange(java.lang.String onDataChange) {
		getStateHelper().put(ON_DATA_CHANGE, onDataChange);
	}

	protected java.lang.String getOnDataTypeChange() {
		return (java.lang.String) getStateHelper().eval(ON_DATA_TYPE_CHANGE, null);
	}

	protected void setOnDataTypeChange(java.lang.String onDataTypeChange) {
		getStateHelper().put(ON_DATA_TYPE_CHANGE, onDataTypeChange);
	}

	protected java.lang.String getOnFormChange() {
		return (java.lang.String) getStateHelper().eval(ON_FORM_CHANGE, null);
	}

	protected void setOnFormChange(java.lang.String onFormChange) {
		getStateHelper().put(ON_FORM_CHANGE, onFormChange);
	}

	protected java.lang.String getOnHeadersChange() {
		return (java.lang.String) getStateHelper().eval(ON_HEADERS_CHANGE, null);
	}

	protected void setOnHeadersChange(java.lang.String onHeadersChange) {
		getStateHelper().put(ON_HEADERS_CHANGE, onHeadersChange);
	}

	protected java.lang.String getOnMethodChange() {
		return (java.lang.String) getStateHelper().eval(ON_METHOD_CHANGE, null);
	}

	protected void setOnMethodChange(java.lang.String onMethodChange) {
		getStateHelper().put(ON_METHOD_CHANGE, onMethodChange);
	}

	protected java.lang.String getOnResponseDataChange() {
		return (java.lang.String) getStateHelper().eval(ON_RESPONSE_DATA_CHANGE, null);
	}

	protected void setOnResponseDataChange(java.lang.String onResponseDataChange) {
		getStateHelper().put(ON_RESPONSE_DATA_CHANGE, onResponseDataChange);
	}

	protected java.lang.String getOnSelectorChange() {
		return (java.lang.String) getStateHelper().eval(ON_SELECTOR_CHANGE, null);
	}

	protected void setOnSelectorChange(java.lang.String onSelectorChange) {
		getStateHelper().put(ON_SELECTOR_CHANGE, onSelectorChange);
	}

	protected java.lang.String getOnSyncChange() {
		return (java.lang.String) getStateHelper().eval(ON_SYNC_CHANGE, null);
	}

	protected void setOnSyncChange(java.lang.String onSyncChange) {
		getStateHelper().put(ON_SYNC_CHANGE, onSyncChange);
	}

	protected java.lang.String getOnTimeoutChange() {
		return (java.lang.String) getStateHelper().eval(ON_TIMEOUT_CHANGE, null);
	}

	protected void setOnTimeoutChange(java.lang.String onTimeoutChange) {
		getStateHelper().put(ON_TIMEOUT_CHANGE, onTimeoutChange);
	}

	protected java.lang.String getOnTransactionChange() {
		return (java.lang.String) getStateHelper().eval(ON_TRANSACTION_CHANGE, null);
	}

	protected void setOnTransactionChange(java.lang.String onTransactionChange) {
		getStateHelper().put(ON_TRANSACTION_CHANGE, onTransactionChange);
	}

	protected java.lang.String getOnUriChange() {
		return (java.lang.String) getStateHelper().eval(ON_URI_CHANGE, null);
	}

	protected void setOnUriChange(java.lang.String onUriChange) {
		getStateHelper().put(ON_URI_CHANGE, onUriChange);
	}

	protected java.lang.String getOnXdrChange() {
		return (java.lang.String) getStateHelper().eval(ON_XDR_CHANGE, null);
	}

	protected void setOnXdrChange(java.lang.String onXdrChange) {
		getStateHelper().put(ON_XDR_CHANGE, onXdrChange);
	}

}
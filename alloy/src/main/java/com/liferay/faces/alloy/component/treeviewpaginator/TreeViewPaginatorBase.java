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
package com.liferay.faces.alloy.component.treeviewpaginator;

/**
 * @author Eduardo Lundgren
 * @author Bruno Basto
 * @author Nathan Cavanaugh
 * @generated
 */
public abstract class TreeViewPaginatorBase extends javax.faces.component.UIPanel {

	private static final String PAGINATOR = "paginator";
	private static final String AFTER_PAGINATOR_CHANGE = "afterPaginatorChange";
	private static final String ON_PAGINATOR_CHANGE = "onPaginatorChange";

	protected java.lang.Object getPaginator() {
		return (java.lang.Object) getStateHelper().eval(PAGINATOR, null);
	}

	protected void setPaginator(java.lang.Object paginator) {
		getStateHelper().put(PAGINATOR, paginator);
	}

	protected java.lang.String getAfterPaginatorChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_PAGINATOR_CHANGE, null);
	}

	protected void setAfterPaginatorChange(java.lang.String afterPaginatorChange) {
		getStateHelper().put(AFTER_PAGINATOR_CHANGE, afterPaginatorChange);
	}

	protected java.lang.String getOnPaginatorChange() {
		return (java.lang.String) getStateHelper().eval(ON_PAGINATOR_CHANGE, null);
	}

	protected void setOnPaginatorChange(java.lang.String onPaginatorChange) {
		getStateHelper().put(ON_PAGINATOR_CHANGE, onPaginatorChange);
	}

}
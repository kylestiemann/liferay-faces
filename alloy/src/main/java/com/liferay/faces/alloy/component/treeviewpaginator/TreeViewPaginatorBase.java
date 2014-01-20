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
package com.liferay.faces.alloy.component.treeviewpaginator;

/**
 * @author Bruno Basto
 * @author Kyle Stiemann
 * @generated
 */
public abstract class TreeViewPaginatorBase extends javax.faces.component.UIPanel {

	public static final String PAGINATOR = "paginator";
	public static final String AFTER_PAGINATOR_CHANGE = "afterPaginatorChange";
	public static final String ON_PAGINATOR_CHANGE = "onPaginatorChange";

	public java.lang.Object getPaginator() {
		return (java.lang.Object) getStateHelper().eval(PAGINATOR, null);
	}

	public void setPaginator(java.lang.Object paginator) {
		getStateHelper().put(PAGINATOR, paginator);
	}

	public java.lang.String getAfterPaginatorChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_PAGINATOR_CHANGE, null);
	}

	public void setAfterPaginatorChange(java.lang.String afterPaginatorChange) {
		getStateHelper().put(AFTER_PAGINATOR_CHANGE, afterPaginatorChange);
	}

	public java.lang.String getOnPaginatorChange() {
		return (java.lang.String) getStateHelper().eval(ON_PAGINATOR_CHANGE, null);
	}

	public void setOnPaginatorChange(java.lang.String onPaginatorChange) {
		getStateHelper().put(ON_PAGINATOR_CHANGE, onPaginatorChange);
	}

}
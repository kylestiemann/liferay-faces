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
package com.liferay.faces.alloy.component.datecelleditor;

/**
 * @author Eduardo Lundgren
 * @author Bruno Basto
 * @author Nathan Cavanaugh
 * @generated
 */
public abstract class DateCellEditorBase extends javax.faces.component.UIPanel {

	public static final String DATE_CELL_EDITOR_BODY_CONTENT = "bodyContent";
	public static final String CALENDAR = "calendar";
	public static final String DATE_FORMAT = "dateFormat";
	public static final String INPUT_FORMATTER = "inputFormatter";
	public static final String OUTPUT_FORMATTER = "outputFormatter";
	public static final String AFTER_BODY_CONTENT_CHANGE = "afterBodyContentChange";
	public static final String AFTER_CALENDAR_CHANGE = "afterCalendarChange";
	public static final String AFTER_DATE_FORMAT_CHANGE = "afterDateFormatChange";
	public static final String AFTER_INPUT_FORMATTER_CHANGE = "afterInputFormatterChange";
	public static final String AFTER_OUTPUT_FORMATTER_CHANGE = "afterOutputFormatterChange";
	public static final String ON_BODY_CONTENT_CHANGE = "onBodyContentChange";
	public static final String ON_CALENDAR_CHANGE = "onCalendarChange";
	public static final String ON_DATE_FORMAT_CHANGE = "onDateFormatChange";
	public static final String ON_INPUT_FORMATTER_CHANGE = "onInputFormatterChange";
	public static final String ON_OUTPUT_FORMATTER_CHANGE = "onOutputFormatterChange";

	public java.lang.String getDateCellEditorBodyContent() {
		return (java.lang.String) getStateHelper().eval(DATE_CELL_EDITOR_BODY_CONTENT, null);
	}

	public void setDateCellEditorBodyContent(java.lang.String dateCellEditorBodyContent) {
		getStateHelper().put(DATE_CELL_EDITOR_BODY_CONTENT, dateCellEditorBodyContent);
	}

	public java.lang.Object getCalendar() {
		return (java.lang.Object) getStateHelper().eval(CALENDAR, null);
	}

	public void setCalendar(java.lang.Object calendar) {
		getStateHelper().put(CALENDAR, calendar);
	}

	public java.lang.String getDateFormat() {
		return (java.lang.String) getStateHelper().eval(DATE_FORMAT, null);
	}

	public void setDateFormat(java.lang.String dateFormat) {
		getStateHelper().put(DATE_FORMAT, dateFormat);
	}

	public java.lang.Object getInputFormatter() {
		return (java.lang.Object) getStateHelper().eval(INPUT_FORMATTER, null);
	}

	public void setInputFormatter(java.lang.Object inputFormatter) {
		getStateHelper().put(INPUT_FORMATTER, inputFormatter);
	}

	public java.lang.Object getOutputFormatter() {
		return (java.lang.Object) getStateHelper().eval(OUTPUT_FORMATTER, null);
	}

	public void setOutputFormatter(java.lang.Object outputFormatter) {
		getStateHelper().put(OUTPUT_FORMATTER, outputFormatter);
	}

	public java.lang.String getAfterBodyContentChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_BODY_CONTENT_CHANGE, null);
	}

	public void setAfterBodyContentChange(java.lang.String afterBodyContentChange) {
		getStateHelper().put(AFTER_BODY_CONTENT_CHANGE, afterBodyContentChange);
	}

	public java.lang.String getAfterCalendarChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_CALENDAR_CHANGE, null);
	}

	public void setAfterCalendarChange(java.lang.String afterCalendarChange) {
		getStateHelper().put(AFTER_CALENDAR_CHANGE, afterCalendarChange);
	}

	public java.lang.String getAfterDateFormatChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_DATE_FORMAT_CHANGE, null);
	}

	public void setAfterDateFormatChange(java.lang.String afterDateFormatChange) {
		getStateHelper().put(AFTER_DATE_FORMAT_CHANGE, afterDateFormatChange);
	}

	public java.lang.String getAfterInputFormatterChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_INPUT_FORMATTER_CHANGE, null);
	}

	public void setAfterInputFormatterChange(java.lang.String afterInputFormatterChange) {
		getStateHelper().put(AFTER_INPUT_FORMATTER_CHANGE, afterInputFormatterChange);
	}

	public java.lang.String getAfterOutputFormatterChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_OUTPUT_FORMATTER_CHANGE, null);
	}

	public void setAfterOutputFormatterChange(java.lang.String afterOutputFormatterChange) {
		getStateHelper().put(AFTER_OUTPUT_FORMATTER_CHANGE, afterOutputFormatterChange);
	}

	public java.lang.String getOnBodyContentChange() {
		return (java.lang.String) getStateHelper().eval(ON_BODY_CONTENT_CHANGE, null);
	}

	public void setOnBodyContentChange(java.lang.String onBodyContentChange) {
		getStateHelper().put(ON_BODY_CONTENT_CHANGE, onBodyContentChange);
	}

	public java.lang.String getOnCalendarChange() {
		return (java.lang.String) getStateHelper().eval(ON_CALENDAR_CHANGE, null);
	}

	public void setOnCalendarChange(java.lang.String onCalendarChange) {
		getStateHelper().put(ON_CALENDAR_CHANGE, onCalendarChange);
	}

	public java.lang.String getOnDateFormatChange() {
		return (java.lang.String) getStateHelper().eval(ON_DATE_FORMAT_CHANGE, null);
	}

	public void setOnDateFormatChange(java.lang.String onDateFormatChange) {
		getStateHelper().put(ON_DATE_FORMAT_CHANGE, onDateFormatChange);
	}

	public java.lang.String getOnInputFormatterChange() {
		return (java.lang.String) getStateHelper().eval(ON_INPUT_FORMATTER_CHANGE, null);
	}

	public void setOnInputFormatterChange(java.lang.String onInputFormatterChange) {
		getStateHelper().put(ON_INPUT_FORMATTER_CHANGE, onInputFormatterChange);
	}

	public java.lang.String getOnOutputFormatterChange() {
		return (java.lang.String) getStateHelper().eval(ON_OUTPUT_FORMATTER_CHANGE, null);
	}

	public void setOnOutputFormatterChange(java.lang.String onOutputFormatterChange) {
		getStateHelper().put(ON_OUTPUT_FORMATTER_CHANGE, onOutputFormatterChange);
	}

}
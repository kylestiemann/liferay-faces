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
package com.liferay.faces.alloy.component.formvalidator;

/**
 * @author Eduardo Lundgren
 * @author Bruno Basto
 * @author Nathan Cavanaugh
 * @generated
 */
public abstract class FormValidatorBase extends javax.faces.component.UIPanel {

	public static final String BOUNDING_BOX = "boundingBox";
	public static final String CONTAINER_ERROR_CLASS = "containerErrorClass";
	public static final String CONTAINER_VALID_CLASS = "containerValidClass";
	public static final String DESTROYED = "destroyed";
	public static final String ERROR_CLASS = "errorClass";
	public static final String EXTRACT_RULES = "extractRules";
	public static final String FIELD_CONTAINER = "fieldContainer";
	public static final String FIELD_STRINGS = "fieldStrings";
	public static final String INITIALIZED = "initialized";
	public static final String LABEL_CSS_CLASS = "labelCssClass";
	public static final String MESSAGE_CONTAINER = "messageContainer";
	public static final String RULES = "rules";
	public static final String SELECT_TEXT = "selectText";
	public static final String SHOW_ALL_MESSAGES = "showAllMessages";
	public static final String SHOW_MESSAGES = "showMessages";
	public static final String STACK_ERROR_CONTAINER = "stackErrorContainer";
	public static final String STRINGS = "strings";
	public static final String VALID_CLASS = "validClass";
	public static final String VALIDATE_ON_BLUR = "validateOnBlur";
	public static final String VALIDATE_ON_INPUT = "validateOnInput";
	public static final String AFTER_BOUNDING_BOX_CHANGE = "afterBoundingBoxChange";
	public static final String AFTER_CONTAINER_ERROR_CLASS_CHANGE = "afterContainerErrorClassChange";
	public static final String AFTER_CONTAINER_VALID_CLASS_CHANGE = "afterContainerValidClassChange";
	public static final String AFTER_DESTROYED_CHANGE = "afterDestroyedChange";
	public static final String AFTER_ERROR_CLASS_CHANGE = "afterErrorClassChange";
	public static final String AFTER_EXTRACT_RULES_CHANGE = "afterExtractRulesChange";
	public static final String AFTER_FIELD_CONTAINER_CHANGE = "afterFieldContainerChange";
	public static final String AFTER_FIELD_STRINGS_CHANGE = "afterFieldStringsChange";
	public static final String AFTER_INITIALIZED_CHANGE = "afterInitializedChange";
	public static final String AFTER_LABEL_CSS_CLASS_CHANGE = "afterLabelCssClassChange";
	public static final String AFTER_MESSAGE_CONTAINER_CHANGE = "afterMessageContainerChange";
	public static final String AFTER_RULES_CHANGE = "afterRulesChange";
	public static final String AFTER_SELECT_TEXT_CHANGE = "afterSelectTextChange";
	public static final String AFTER_SHOW_ALL_MESSAGES_CHANGE = "afterShowAllMessagesChange";
	public static final String AFTER_SHOW_MESSAGES_CHANGE = "afterShowMessagesChange";
	public static final String AFTER_STACK_ERROR_CONTAINER_CHANGE = "afterStackErrorContainerChange";
	public static final String AFTER_STRINGS_CHANGE = "afterStringsChange";
	public static final String AFTER_VALID_CLASS_CHANGE = "afterValidClassChange";
	public static final String AFTER_VALIDATE_ON_BLUR_CHANGE = "afterValidateOnBlurChange";
	public static final String AFTER_VALIDATE_ON_INPUT_CHANGE = "afterValidateOnInputChange";
	public static final String ON_BOUNDING_BOX_CHANGE = "onBoundingBoxChange";
	public static final String ON_CONTAINER_ERROR_CLASS_CHANGE = "onContainerErrorClassChange";
	public static final String ON_CONTAINER_VALID_CLASS_CHANGE = "onContainerValidClassChange";
	public static final String ON_DESTROYED_CHANGE = "onDestroyedChange";
	public static final String ON_ERROR_CLASS_CHANGE = "onErrorClassChange";
	public static final String ON_EXTRACT_RULES_CHANGE = "onExtractRulesChange";
	public static final String ON_FIELD_CONTAINER_CHANGE = "onFieldContainerChange";
	public static final String ON_FIELD_STRINGS_CHANGE = "onFieldStringsChange";
	public static final String ON_INITIALIZED_CHANGE = "onInitializedChange";
	public static final String ON_LABEL_CSS_CLASS_CHANGE = "onLabelCssClassChange";
	public static final String ON_MESSAGE_CONTAINER_CHANGE = "onMessageContainerChange";
	public static final String ON_RULES_CHANGE = "onRulesChange";
	public static final String ON_SELECT_TEXT_CHANGE = "onSelectTextChange";
	public static final String ON_SHOW_ALL_MESSAGES_CHANGE = "onShowAllMessagesChange";
	public static final String ON_SHOW_MESSAGES_CHANGE = "onShowMessagesChange";
	public static final String ON_STACK_ERROR_CONTAINER_CHANGE = "onStackErrorContainerChange";
	public static final String ON_STRINGS_CHANGE = "onStringsChange";
	public static final String ON_VALID_CLASS_CHANGE = "onValidClassChange";
	public static final String ON_VALIDATE_ON_BLUR_CHANGE = "onValidateOnBlurChange";
	public static final String ON_VALIDATE_ON_INPUT_CHANGE = "onValidateOnInputChange";

	public java.lang.String getBoundingBox() {
		return (java.lang.String) getStateHelper().eval(BOUNDING_BOX, null);
	}

	public void setBoundingBox(java.lang.String boundingBox) {
		getStateHelper().put(BOUNDING_BOX, boundingBox);
	}

	public java.lang.String getContainerErrorClass() {
		return (java.lang.String) getStateHelper().eval(CONTAINER_ERROR_CLASS, null);
	}

	public void setContainerErrorClass(java.lang.String containerErrorClass) {
		getStateHelper().put(CONTAINER_ERROR_CLASS, containerErrorClass);
	}

	public java.lang.String getContainerValidClass() {
		return (java.lang.String) getStateHelper().eval(CONTAINER_VALID_CLASS, null);
	}

	public void setContainerValidClass(java.lang.String containerValidClass) {
		getStateHelper().put(CONTAINER_VALID_CLASS, containerValidClass);
	}

	public java.lang.Boolean getDestroyed() {
		return (java.lang.Boolean) getStateHelper().eval(DESTROYED, null);
	}

	public void setDestroyed(java.lang.Boolean destroyed) {
		getStateHelper().put(DESTROYED, destroyed);
	}

	public java.lang.String getErrorClass() {
		return (java.lang.String) getStateHelper().eval(ERROR_CLASS, null);
	}

	public void setErrorClass(java.lang.String errorClass) {
		getStateHelper().put(ERROR_CLASS, errorClass);
	}

	public java.lang.Boolean getExtractRules() {
		return (java.lang.Boolean) getStateHelper().eval(EXTRACT_RULES, null);
	}

	public void setExtractRules(java.lang.Boolean extractRules) {
		getStateHelper().put(EXTRACT_RULES, extractRules);
	}

	public java.lang.String getFieldContainer() {
		return (java.lang.String) getStateHelper().eval(FIELD_CONTAINER, null);
	}

	public void setFieldContainer(java.lang.String fieldContainer) {
		getStateHelper().put(FIELD_CONTAINER, fieldContainer);
	}

	public java.lang.Object getFieldStrings() {
		return (java.lang.Object) getStateHelper().eval(FIELD_STRINGS, null);
	}

	public void setFieldStrings(java.lang.Object fieldStrings) {
		getStateHelper().put(FIELD_STRINGS, fieldStrings);
	}

	public java.lang.Boolean getInitialized() {
		return (java.lang.Boolean) getStateHelper().eval(INITIALIZED, null);
	}

	public void setInitialized(java.lang.Boolean initialized) {
		getStateHelper().put(INITIALIZED, initialized);
	}

	public java.lang.String getLabelCssClass() {
		return (java.lang.String) getStateHelper().eval(LABEL_CSS_CLASS, null);
	}

	public void setLabelCssClass(java.lang.String labelCssClass) {
		getStateHelper().put(LABEL_CSS_CLASS, labelCssClass);
	}

	public java.lang.String getMessageContainer() {
		return (java.lang.String) getStateHelper().eval(MESSAGE_CONTAINER, null);
	}

	public void setMessageContainer(java.lang.String messageContainer) {
		getStateHelper().put(MESSAGE_CONTAINER, messageContainer);
	}

	public java.lang.Object getRules() {
		return (java.lang.Object) getStateHelper().eval(RULES, null);
	}

	public void setRules(java.lang.Object rules) {
		getStateHelper().put(RULES, rules);
	}

	public java.lang.Boolean getSelectText() {
		return (java.lang.Boolean) getStateHelper().eval(SELECT_TEXT, null);
	}

	public void setSelectText(java.lang.Boolean selectText) {
		getStateHelper().put(SELECT_TEXT, selectText);
	}

	public java.lang.Boolean getShowAllMessages() {
		return (java.lang.Boolean) getStateHelper().eval(SHOW_ALL_MESSAGES, null);
	}

	public void setShowAllMessages(java.lang.Boolean showAllMessages) {
		getStateHelper().put(SHOW_ALL_MESSAGES, showAllMessages);
	}

	public java.lang.Boolean getShowMessages() {
		return (java.lang.Boolean) getStateHelper().eval(SHOW_MESSAGES, null);
	}

	public void setShowMessages(java.lang.Boolean showMessages) {
		getStateHelper().put(SHOW_MESSAGES, showMessages);
	}

	public java.lang.String getStackErrorContainer() {
		return (java.lang.String) getStateHelper().eval(STACK_ERROR_CONTAINER, null);
	}

	public void setStackErrorContainer(java.lang.String stackErrorContainer) {
		getStateHelper().put(STACK_ERROR_CONTAINER, stackErrorContainer);
	}

	public java.lang.String getStrings() {
		return (java.lang.String) getStateHelper().eval(STRINGS, null);
	}

	public void setStrings(java.lang.String strings) {
		getStateHelper().put(STRINGS, strings);
	}

	public java.lang.String getValidClass() {
		return (java.lang.String) getStateHelper().eval(VALID_CLASS, null);
	}

	public void setValidClass(java.lang.String validClass) {
		getStateHelper().put(VALID_CLASS, validClass);
	}

	public java.lang.Boolean getValidateOnBlur() {
		return (java.lang.Boolean) getStateHelper().eval(VALIDATE_ON_BLUR, null);
	}

	public void setValidateOnBlur(java.lang.Boolean validateOnBlur) {
		getStateHelper().put(VALIDATE_ON_BLUR, validateOnBlur);
	}

	public java.lang.Boolean getValidateOnInput() {
		return (java.lang.Boolean) getStateHelper().eval(VALIDATE_ON_INPUT, null);
	}

	public void setValidateOnInput(java.lang.Boolean validateOnInput) {
		getStateHelper().put(VALIDATE_ON_INPUT, validateOnInput);
	}

	public java.lang.String getAfterBoundingBoxChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_BOUNDING_BOX_CHANGE, null);
	}

	public void setAfterBoundingBoxChange(java.lang.String afterBoundingBoxChange) {
		getStateHelper().put(AFTER_BOUNDING_BOX_CHANGE, afterBoundingBoxChange);
	}

	public java.lang.String getAfterContainerErrorClassChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_CONTAINER_ERROR_CLASS_CHANGE, null);
	}

	public void setAfterContainerErrorClassChange(java.lang.String afterContainerErrorClassChange) {
		getStateHelper().put(AFTER_CONTAINER_ERROR_CLASS_CHANGE, afterContainerErrorClassChange);
	}

	public java.lang.String getAfterContainerValidClassChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_CONTAINER_VALID_CLASS_CHANGE, null);
	}

	public void setAfterContainerValidClassChange(java.lang.String afterContainerValidClassChange) {
		getStateHelper().put(AFTER_CONTAINER_VALID_CLASS_CHANGE, afterContainerValidClassChange);
	}

	public java.lang.String getAfterDestroyedChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_DESTROYED_CHANGE, null);
	}

	public void setAfterDestroyedChange(java.lang.String afterDestroyedChange) {
		getStateHelper().put(AFTER_DESTROYED_CHANGE, afterDestroyedChange);
	}

	public java.lang.String getAfterErrorClassChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_ERROR_CLASS_CHANGE, null);
	}

	public void setAfterErrorClassChange(java.lang.String afterErrorClassChange) {
		getStateHelper().put(AFTER_ERROR_CLASS_CHANGE, afterErrorClassChange);
	}

	public java.lang.String getAfterExtractRulesChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_EXTRACT_RULES_CHANGE, null);
	}

	public void setAfterExtractRulesChange(java.lang.String afterExtractRulesChange) {
		getStateHelper().put(AFTER_EXTRACT_RULES_CHANGE, afterExtractRulesChange);
	}

	public java.lang.String getAfterFieldContainerChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_FIELD_CONTAINER_CHANGE, null);
	}

	public void setAfterFieldContainerChange(java.lang.String afterFieldContainerChange) {
		getStateHelper().put(AFTER_FIELD_CONTAINER_CHANGE, afterFieldContainerChange);
	}

	public java.lang.String getAfterFieldStringsChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_FIELD_STRINGS_CHANGE, null);
	}

	public void setAfterFieldStringsChange(java.lang.String afterFieldStringsChange) {
		getStateHelper().put(AFTER_FIELD_STRINGS_CHANGE, afterFieldStringsChange);
	}

	public java.lang.String getAfterInitializedChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_INITIALIZED_CHANGE, null);
	}

	public void setAfterInitializedChange(java.lang.String afterInitializedChange) {
		getStateHelper().put(AFTER_INITIALIZED_CHANGE, afterInitializedChange);
	}

	public java.lang.String getAfterLabelCssClassChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_LABEL_CSS_CLASS_CHANGE, null);
	}

	public void setAfterLabelCssClassChange(java.lang.String afterLabelCssClassChange) {
		getStateHelper().put(AFTER_LABEL_CSS_CLASS_CHANGE, afterLabelCssClassChange);
	}

	public java.lang.String getAfterMessageContainerChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_MESSAGE_CONTAINER_CHANGE, null);
	}

	public void setAfterMessageContainerChange(java.lang.String afterMessageContainerChange) {
		getStateHelper().put(AFTER_MESSAGE_CONTAINER_CHANGE, afterMessageContainerChange);
	}

	public java.lang.String getAfterRulesChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_RULES_CHANGE, null);
	}

	public void setAfterRulesChange(java.lang.String afterRulesChange) {
		getStateHelper().put(AFTER_RULES_CHANGE, afterRulesChange);
	}

	public java.lang.String getAfterSelectTextChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_SELECT_TEXT_CHANGE, null);
	}

	public void setAfterSelectTextChange(java.lang.String afterSelectTextChange) {
		getStateHelper().put(AFTER_SELECT_TEXT_CHANGE, afterSelectTextChange);
	}

	public java.lang.String getAfterShowAllMessagesChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_SHOW_ALL_MESSAGES_CHANGE, null);
	}

	public void setAfterShowAllMessagesChange(java.lang.String afterShowAllMessagesChange) {
		getStateHelper().put(AFTER_SHOW_ALL_MESSAGES_CHANGE, afterShowAllMessagesChange);
	}

	public java.lang.String getAfterShowMessagesChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_SHOW_MESSAGES_CHANGE, null);
	}

	public void setAfterShowMessagesChange(java.lang.String afterShowMessagesChange) {
		getStateHelper().put(AFTER_SHOW_MESSAGES_CHANGE, afterShowMessagesChange);
	}

	public java.lang.String getAfterStackErrorContainerChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_STACK_ERROR_CONTAINER_CHANGE, null);
	}

	public void setAfterStackErrorContainerChange(java.lang.String afterStackErrorContainerChange) {
		getStateHelper().put(AFTER_STACK_ERROR_CONTAINER_CHANGE, afterStackErrorContainerChange);
	}

	public java.lang.String getAfterStringsChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_STRINGS_CHANGE, null);
	}

	public void setAfterStringsChange(java.lang.String afterStringsChange) {
		getStateHelper().put(AFTER_STRINGS_CHANGE, afterStringsChange);
	}

	public java.lang.String getAfterValidClassChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_VALID_CLASS_CHANGE, null);
	}

	public void setAfterValidClassChange(java.lang.String afterValidClassChange) {
		getStateHelper().put(AFTER_VALID_CLASS_CHANGE, afterValidClassChange);
	}

	public java.lang.String getAfterValidateOnBlurChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_VALIDATE_ON_BLUR_CHANGE, null);
	}

	public void setAfterValidateOnBlurChange(java.lang.String afterValidateOnBlurChange) {
		getStateHelper().put(AFTER_VALIDATE_ON_BLUR_CHANGE, afterValidateOnBlurChange);
	}

	public java.lang.String getAfterValidateOnInputChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_VALIDATE_ON_INPUT_CHANGE, null);
	}

	public void setAfterValidateOnInputChange(java.lang.String afterValidateOnInputChange) {
		getStateHelper().put(AFTER_VALIDATE_ON_INPUT_CHANGE, afterValidateOnInputChange);
	}

	public java.lang.String getOnBoundingBoxChange() {
		return (java.lang.String) getStateHelper().eval(ON_BOUNDING_BOX_CHANGE, null);
	}

	public void setOnBoundingBoxChange(java.lang.String onBoundingBoxChange) {
		getStateHelper().put(ON_BOUNDING_BOX_CHANGE, onBoundingBoxChange);
	}

	public java.lang.String getOnContainerErrorClassChange() {
		return (java.lang.String) getStateHelper().eval(ON_CONTAINER_ERROR_CLASS_CHANGE, null);
	}

	public void setOnContainerErrorClassChange(java.lang.String onContainerErrorClassChange) {
		getStateHelper().put(ON_CONTAINER_ERROR_CLASS_CHANGE, onContainerErrorClassChange);
	}

	public java.lang.String getOnContainerValidClassChange() {
		return (java.lang.String) getStateHelper().eval(ON_CONTAINER_VALID_CLASS_CHANGE, null);
	}

	public void setOnContainerValidClassChange(java.lang.String onContainerValidClassChange) {
		getStateHelper().put(ON_CONTAINER_VALID_CLASS_CHANGE, onContainerValidClassChange);
	}

	public java.lang.String getOnDestroyedChange() {
		return (java.lang.String) getStateHelper().eval(ON_DESTROYED_CHANGE, null);
	}

	public void setOnDestroyedChange(java.lang.String onDestroyedChange) {
		getStateHelper().put(ON_DESTROYED_CHANGE, onDestroyedChange);
	}

	public java.lang.String getOnErrorClassChange() {
		return (java.lang.String) getStateHelper().eval(ON_ERROR_CLASS_CHANGE, null);
	}

	public void setOnErrorClassChange(java.lang.String onErrorClassChange) {
		getStateHelper().put(ON_ERROR_CLASS_CHANGE, onErrorClassChange);
	}

	public java.lang.String getOnExtractRulesChange() {
		return (java.lang.String) getStateHelper().eval(ON_EXTRACT_RULES_CHANGE, null);
	}

	public void setOnExtractRulesChange(java.lang.String onExtractRulesChange) {
		getStateHelper().put(ON_EXTRACT_RULES_CHANGE, onExtractRulesChange);
	}

	public java.lang.String getOnFieldContainerChange() {
		return (java.lang.String) getStateHelper().eval(ON_FIELD_CONTAINER_CHANGE, null);
	}

	public void setOnFieldContainerChange(java.lang.String onFieldContainerChange) {
		getStateHelper().put(ON_FIELD_CONTAINER_CHANGE, onFieldContainerChange);
	}

	public java.lang.String getOnFieldStringsChange() {
		return (java.lang.String) getStateHelper().eval(ON_FIELD_STRINGS_CHANGE, null);
	}

	public void setOnFieldStringsChange(java.lang.String onFieldStringsChange) {
		getStateHelper().put(ON_FIELD_STRINGS_CHANGE, onFieldStringsChange);
	}

	public java.lang.String getOnInitializedChange() {
		return (java.lang.String) getStateHelper().eval(ON_INITIALIZED_CHANGE, null);
	}

	public void setOnInitializedChange(java.lang.String onInitializedChange) {
		getStateHelper().put(ON_INITIALIZED_CHANGE, onInitializedChange);
	}

	public java.lang.String getOnLabelCssClassChange() {
		return (java.lang.String) getStateHelper().eval(ON_LABEL_CSS_CLASS_CHANGE, null);
	}

	public void setOnLabelCssClassChange(java.lang.String onLabelCssClassChange) {
		getStateHelper().put(ON_LABEL_CSS_CLASS_CHANGE, onLabelCssClassChange);
	}

	public java.lang.String getOnMessageContainerChange() {
		return (java.lang.String) getStateHelper().eval(ON_MESSAGE_CONTAINER_CHANGE, null);
	}

	public void setOnMessageContainerChange(java.lang.String onMessageContainerChange) {
		getStateHelper().put(ON_MESSAGE_CONTAINER_CHANGE, onMessageContainerChange);
	}

	public java.lang.String getOnRulesChange() {
		return (java.lang.String) getStateHelper().eval(ON_RULES_CHANGE, null);
	}

	public void setOnRulesChange(java.lang.String onRulesChange) {
		getStateHelper().put(ON_RULES_CHANGE, onRulesChange);
	}

	public java.lang.String getOnSelectTextChange() {
		return (java.lang.String) getStateHelper().eval(ON_SELECT_TEXT_CHANGE, null);
	}

	public void setOnSelectTextChange(java.lang.String onSelectTextChange) {
		getStateHelper().put(ON_SELECT_TEXT_CHANGE, onSelectTextChange);
	}

	public java.lang.String getOnShowAllMessagesChange() {
		return (java.lang.String) getStateHelper().eval(ON_SHOW_ALL_MESSAGES_CHANGE, null);
	}

	public void setOnShowAllMessagesChange(java.lang.String onShowAllMessagesChange) {
		getStateHelper().put(ON_SHOW_ALL_MESSAGES_CHANGE, onShowAllMessagesChange);
	}

	public java.lang.String getOnShowMessagesChange() {
		return (java.lang.String) getStateHelper().eval(ON_SHOW_MESSAGES_CHANGE, null);
	}

	public void setOnShowMessagesChange(java.lang.String onShowMessagesChange) {
		getStateHelper().put(ON_SHOW_MESSAGES_CHANGE, onShowMessagesChange);
	}

	public java.lang.String getOnStackErrorContainerChange() {
		return (java.lang.String) getStateHelper().eval(ON_STACK_ERROR_CONTAINER_CHANGE, null);
	}

	public void setOnStackErrorContainerChange(java.lang.String onStackErrorContainerChange) {
		getStateHelper().put(ON_STACK_ERROR_CONTAINER_CHANGE, onStackErrorContainerChange);
	}

	public java.lang.String getOnStringsChange() {
		return (java.lang.String) getStateHelper().eval(ON_STRINGS_CHANGE, null);
	}

	public void setOnStringsChange(java.lang.String onStringsChange) {
		getStateHelper().put(ON_STRINGS_CHANGE, onStringsChange);
	}

	public java.lang.String getOnValidClassChange() {
		return (java.lang.String) getStateHelper().eval(ON_VALID_CLASS_CHANGE, null);
	}

	public void setOnValidClassChange(java.lang.String onValidClassChange) {
		getStateHelper().put(ON_VALID_CLASS_CHANGE, onValidClassChange);
	}

	public java.lang.String getOnValidateOnBlurChange() {
		return (java.lang.String) getStateHelper().eval(ON_VALIDATE_ON_BLUR_CHANGE, null);
	}

	public void setOnValidateOnBlurChange(java.lang.String onValidateOnBlurChange) {
		getStateHelper().put(ON_VALIDATE_ON_BLUR_CHANGE, onValidateOnBlurChange);
	}

	public java.lang.String getOnValidateOnInputChange() {
		return (java.lang.String) getStateHelper().eval(ON_VALIDATE_ON_INPUT_CHANGE, null);
	}

	public void setOnValidateOnInputChange(java.lang.String onValidateOnInputChange) {
		getStateHelper().put(ON_VALIDATE_ON_INPUT_CHANGE, onValidateOnInputChange);
	}

}
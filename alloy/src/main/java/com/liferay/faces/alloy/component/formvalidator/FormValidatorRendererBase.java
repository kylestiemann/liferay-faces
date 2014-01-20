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
public abstract class FormValidatorRendererBase extends RendererBase {

	// Private Constants
	private static final String AUI_MODULE_NAME = "aui-form-validator";

	protected void encodeJavaScriptMain(FacesContext facesContext, UIComponent uiComponent) throws IOException {

		FormValidator formValidator = (FormValidator) uiComponent;

		ResponseWriter responseWriter = facesContext.getResponseWriter();

		responseWriter.write("var formValidator = new A.FormValidator");
		responseWriter.write(StringPool.OPEN_PARENTHESIS);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedAttributes = new ArrayList<String>();

		if (formValidator.getBoundingBox() != null) {
			renderBoundingBox(renderedAttributes, formValidator);
		}
		
		if (formValidator.getContainerErrorClass() != null) {
			renderContainerErrorClass(renderedAttributes, formValidator);
		}
		
		if (formValidator.getContainerValidClass() != null) {
			renderContainerValidClass(renderedAttributes, formValidator);
		}
		
		if (formValidator.getDestroyed() != null) {
			renderDestroyed(renderedAttributes, formValidator);
		}
		
		if (formValidator.getErrorClass() != null) {
			renderErrorClass(renderedAttributes, formValidator);
		}
		
		if (formValidator.getExtractRules() != null) {
			renderExtractRules(renderedAttributes, formValidator);
		}
		
		if (formValidator.getFieldContainer() != null) {
			renderFieldContainer(renderedAttributes, formValidator);
		}
		
		if (formValidator.getFieldStrings() != null) {
			renderFieldStrings(renderedAttributes, formValidator);
		}
		
		if (formValidator.getInitialized() != null) {
			renderInitialized(renderedAttributes, formValidator);
		}
		
		if (formValidator.getLabelCssClass() != null) {
			renderLabelCssClass(renderedAttributes, formValidator);
		}
		
		if (formValidator.getMessageContainer() != null) {
			renderMessageContainer(renderedAttributes, formValidator);
		}
		
		if (formValidator.getRules() != null) {
			renderRules(renderedAttributes, formValidator);
		}
		
		if (formValidator.getSelectText() != null) {
			renderSelectText(renderedAttributes, formValidator);
		}
		
		if (formValidator.getShowAllMessages() != null) {
			renderShowAllMessages(renderedAttributes, formValidator);
		}
		
		if (formValidator.getShowMessages() != null) {
			renderShowMessages(renderedAttributes, formValidator);
		}
		
		if (formValidator.getStackErrorContainer() != null) {
			renderStackErrorContainer(renderedAttributes, formValidator);
		}
		
		if (formValidator.getStrings() != null) {
			renderStrings(renderedAttributes, formValidator);
		}
		
		if (formValidator.getValidClass() != null) {
			renderValidClass(renderedAttributes, formValidator);
		}
		
		if (formValidator.getValidateOnBlur() != null) {
			renderValidateOnBlur(renderedAttributes, formValidator);
		}
		
		if (formValidator.getValidateOnInput() != null) {
			renderValidateOnInput(renderedAttributes, formValidator);
		}
		

		for (String renderedAttribute : renderedAttributes) {
			responseWriter.write(renderedAttribute);
			responseWriter.write(StringPool.COMMA);
		}

		responseWriter.write("after");
		responseWriter.write(StringPool.COLON);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedAfterEvents = new ArrayList<String>();

		if (formValidator.getAfterBoundingBoxChange() != null) {
			renderAfterBoundingBoxChange(renderedAfterEvents, formValidator);
		}
		
		if (formValidator.getAfterContainerErrorClassChange() != null) {
			renderAfterContainerErrorClassChange(renderedAfterEvents, formValidator);
		}
		
		if (formValidator.getAfterContainerValidClassChange() != null) {
			renderAfterContainerValidClassChange(renderedAfterEvents, formValidator);
		}
		
		if (formValidator.getAfterDestroyedChange() != null) {
			renderAfterDestroyedChange(renderedAfterEvents, formValidator);
		}
		
		if (formValidator.getAfterErrorClassChange() != null) {
			renderAfterErrorClassChange(renderedAfterEvents, formValidator);
		}
		
		if (formValidator.getAfterExtractRulesChange() != null) {
			renderAfterExtractRulesChange(renderedAfterEvents, formValidator);
		}
		
		if (formValidator.getAfterFieldContainerChange() != null) {
			renderAfterFieldContainerChange(renderedAfterEvents, formValidator);
		}
		
		if (formValidator.getAfterFieldStringsChange() != null) {
			renderAfterFieldStringsChange(renderedAfterEvents, formValidator);
		}
		
		if (formValidator.getAfterInitializedChange() != null) {
			renderAfterInitializedChange(renderedAfterEvents, formValidator);
		}
		
		if (formValidator.getAfterLabelCssClassChange() != null) {
			renderAfterLabelCssClassChange(renderedAfterEvents, formValidator);
		}
		
		if (formValidator.getAfterMessageContainerChange() != null) {
			renderAfterMessageContainerChange(renderedAfterEvents, formValidator);
		}
		
		if (formValidator.getAfterRulesChange() != null) {
			renderAfterRulesChange(renderedAfterEvents, formValidator);
		}
		
		if (formValidator.getAfterSelectTextChange() != null) {
			renderAfterSelectTextChange(renderedAfterEvents, formValidator);
		}
		
		if (formValidator.getAfterShowAllMessagesChange() != null) {
			renderAfterShowAllMessagesChange(renderedAfterEvents, formValidator);
		}
		
		if (formValidator.getAfterShowMessagesChange() != null) {
			renderAfterShowMessagesChange(renderedAfterEvents, formValidator);
		}
		
		if (formValidator.getAfterStackErrorContainerChange() != null) {
			renderAfterStackErrorContainerChange(renderedAfterEvents, formValidator);
		}
		
		if (formValidator.getAfterStringsChange() != null) {
			renderAfterStringsChange(renderedAfterEvents, formValidator);
		}
		
		if (formValidator.getAfterValidClassChange() != null) {
			renderAfterValidClassChange(renderedAfterEvents, formValidator);
		}
		
		if (formValidator.getAfterValidateOnBlurChange() != null) {
			renderAfterValidateOnBlurChange(renderedAfterEvents, formValidator);
		}
		
		if (formValidator.getAfterValidateOnInputChange() != null) {
			renderAfterValidateOnInputChange(renderedAfterEvents, formValidator);
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

		if (formValidator.getOnBoundingBoxChange() != null) {
			renderOnBoundingBoxChange(renderedOnEvents, formValidator);
		}
		
		if (formValidator.getOnContainerErrorClassChange() != null) {
			renderOnContainerErrorClassChange(renderedOnEvents, formValidator);
		}
		
		if (formValidator.getOnContainerValidClassChange() != null) {
			renderOnContainerValidClassChange(renderedOnEvents, formValidator);
		}
		
		if (formValidator.getOnDestroyedChange() != null) {
			renderOnDestroyedChange(renderedOnEvents, formValidator);
		}
		
		if (formValidator.getOnErrorClassChange() != null) {
			renderOnErrorClassChange(renderedOnEvents, formValidator);
		}
		
		if (formValidator.getOnExtractRulesChange() != null) {
			renderOnExtractRulesChange(renderedOnEvents, formValidator);
		}
		
		if (formValidator.getOnFieldContainerChange() != null) {
			renderOnFieldContainerChange(renderedOnEvents, formValidator);
		}
		
		if (formValidator.getOnFieldStringsChange() != null) {
			renderOnFieldStringsChange(renderedOnEvents, formValidator);
		}
		
		if (formValidator.getOnInitializedChange() != null) {
			renderOnInitializedChange(renderedOnEvents, formValidator);
		}
		
		if (formValidator.getOnLabelCssClassChange() != null) {
			renderOnLabelCssClassChange(renderedOnEvents, formValidator);
		}
		
		if (formValidator.getOnMessageContainerChange() != null) {
			renderOnMessageContainerChange(renderedOnEvents, formValidator);
		}
		
		if (formValidator.getOnRulesChange() != null) {
			renderOnRulesChange(renderedOnEvents, formValidator);
		}
		
		if (formValidator.getOnSelectTextChange() != null) {
			renderOnSelectTextChange(renderedOnEvents, formValidator);
		}
		
		if (formValidator.getOnShowAllMessagesChange() != null) {
			renderOnShowAllMessagesChange(renderedOnEvents, formValidator);
		}
		
		if (formValidator.getOnShowMessagesChange() != null) {
			renderOnShowMessagesChange(renderedOnEvents, formValidator);
		}
		
		if (formValidator.getOnStackErrorContainerChange() != null) {
			renderOnStackErrorContainerChange(renderedOnEvents, formValidator);
		}
		
		if (formValidator.getOnStringsChange() != null) {
			renderOnStringsChange(renderedOnEvents, formValidator);
		}
		
		if (formValidator.getOnValidClassChange() != null) {
			renderOnValidClassChange(renderedOnEvents, formValidator);
		}
		
		if (formValidator.getOnValidateOnBlurChange() != null) {
			renderOnValidateOnBlurChange(renderedOnEvents, formValidator);
		}
		
		if (formValidator.getOnValidateOnInputChange() != null) {
			renderOnValidateOnInputChange(renderedOnEvents, formValidator);
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

	protected void renderBoundingBox(List<String> renderedAttributes, FormValidator formValidator) throws IOException {
		java.lang.String boundingBox = formValidator.getBoundingBox();
		renderedAttributes.add(renderString(FormValidator.BOUNDING_BOX, boundingBox));
	}

	protected void renderContainerErrorClass(List<String> renderedAttributes, FormValidator formValidator) throws IOException {
		java.lang.String containerErrorClass = formValidator.getContainerErrorClass();
		renderedAttributes.add(renderString(FormValidator.CONTAINER_ERROR_CLASS, containerErrorClass));
	}

	protected void renderContainerValidClass(List<String> renderedAttributes, FormValidator formValidator) throws IOException {
		java.lang.String containerValidClass = formValidator.getContainerValidClass();
		renderedAttributes.add(renderString(FormValidator.CONTAINER_VALID_CLASS, containerValidClass));
	}

	protected void renderDestroyed(List<String> renderedAttributes, FormValidator formValidator) throws IOException {
		java.lang.Boolean destroyed = formValidator.getDestroyed();
		renderedAttributes.add(renderBoolean(FormValidator.DESTROYED, destroyed));
	}

	protected void renderErrorClass(List<String> renderedAttributes, FormValidator formValidator) throws IOException {
		java.lang.String errorClass = formValidator.getErrorClass();
		renderedAttributes.add(renderString(FormValidator.ERROR_CLASS, errorClass));
	}

	protected void renderExtractRules(List<String> renderedAttributes, FormValidator formValidator) throws IOException {
		java.lang.Boolean extractRules = formValidator.getExtractRules();
		renderedAttributes.add(renderBoolean(FormValidator.EXTRACT_RULES, extractRules));
	}

	protected void renderFieldContainer(List<String> renderedAttributes, FormValidator formValidator) throws IOException {
		java.lang.String fieldContainer = formValidator.getFieldContainer();
		renderedAttributes.add(renderString(FormValidator.FIELD_CONTAINER, fieldContainer));
	}

	protected void renderFieldStrings(List<String> renderedAttributes, FormValidator formValidator) throws IOException {
		java.lang.Object fieldStrings = formValidator.getFieldStrings();
		renderedAttributes.add(renderObject(FormValidator.FIELD_STRINGS, fieldStrings));
	}

	protected void renderInitialized(List<String> renderedAttributes, FormValidator formValidator) throws IOException {
		java.lang.Boolean initialized = formValidator.getInitialized();
		renderedAttributes.add(renderBoolean(FormValidator.INITIALIZED, initialized));
	}

	protected void renderLabelCssClass(List<String> renderedAttributes, FormValidator formValidator) throws IOException {
		java.lang.String labelCssClass = formValidator.getLabelCssClass();
		renderedAttributes.add(renderString(FormValidator.LABEL_CSS_CLASS, labelCssClass));
	}

	protected void renderMessageContainer(List<String> renderedAttributes, FormValidator formValidator) throws IOException {
		java.lang.String messageContainer = formValidator.getMessageContainer();
		renderedAttributes.add(renderString(FormValidator.MESSAGE_CONTAINER, messageContainer));
	}

	protected void renderRules(List<String> renderedAttributes, FormValidator formValidator) throws IOException {
		java.lang.Object rules = formValidator.getRules();
		renderedAttributes.add(renderObject(FormValidator.RULES, rules));
	}

	protected void renderSelectText(List<String> renderedAttributes, FormValidator formValidator) throws IOException {
		java.lang.Boolean selectText = formValidator.getSelectText();
		renderedAttributes.add(renderBoolean(FormValidator.SELECT_TEXT, selectText));
	}

	protected void renderShowAllMessages(List<String> renderedAttributes, FormValidator formValidator) throws IOException {
		java.lang.Boolean showAllMessages = formValidator.getShowAllMessages();
		renderedAttributes.add(renderBoolean(FormValidator.SHOW_ALL_MESSAGES, showAllMessages));
	}

	protected void renderShowMessages(List<String> renderedAttributes, FormValidator formValidator) throws IOException {
		java.lang.Boolean showMessages = formValidator.getShowMessages();
		renderedAttributes.add(renderBoolean(FormValidator.SHOW_MESSAGES, showMessages));
	}

	protected void renderStackErrorContainer(List<String> renderedAttributes, FormValidator formValidator) throws IOException {
		java.lang.String stackErrorContainer = formValidator.getStackErrorContainer();
		renderedAttributes.add(renderString(FormValidator.STACK_ERROR_CONTAINER, stackErrorContainer));
	}

	protected void renderStrings(List<String> renderedAttributes, FormValidator formValidator) throws IOException {
		java.lang.String strings = formValidator.getStrings();
		renderedAttributes.add(renderString(FormValidator.STRINGS, strings));
	}

	protected void renderValidClass(List<String> renderedAttributes, FormValidator formValidator) throws IOException {
		java.lang.String validClass = formValidator.getValidClass();
		renderedAttributes.add(renderString(FormValidator.VALID_CLASS, validClass));
	}

	protected void renderValidateOnBlur(List<String> renderedAttributes, FormValidator formValidator) throws IOException {
		java.lang.Boolean validateOnBlur = formValidator.getValidateOnBlur();
		renderedAttributes.add(renderBoolean(FormValidator.VALIDATE_ON_BLUR, validateOnBlur));
	}

	protected void renderValidateOnInput(List<String> renderedAttributes, FormValidator formValidator) throws IOException {
		java.lang.Boolean validateOnInput = formValidator.getValidateOnInput();
		renderedAttributes.add(renderBoolean(FormValidator.VALIDATE_ON_INPUT, validateOnInput));
	}

	protected void renderAfterBoundingBoxChange(List<String> renderedAttributes, FormValidator formValidator) throws IOException {
		java.lang.String afterBoundingBoxChange = formValidator.getAfterBoundingBoxChange();
		renderedAttributes.add(renderString(FormValidator.AFTER_BOUNDING_BOX_CHANGE, afterBoundingBoxChange));
	}

	protected void renderAfterContainerErrorClassChange(List<String> renderedAttributes, FormValidator formValidator) throws IOException {
		java.lang.String afterContainerErrorClassChange = formValidator.getAfterContainerErrorClassChange();
		renderedAttributes.add(renderString(FormValidator.AFTER_CONTAINER_ERROR_CLASS_CHANGE, afterContainerErrorClassChange));
	}

	protected void renderAfterContainerValidClassChange(List<String> renderedAttributes, FormValidator formValidator) throws IOException {
		java.lang.String afterContainerValidClassChange = formValidator.getAfterContainerValidClassChange();
		renderedAttributes.add(renderString(FormValidator.AFTER_CONTAINER_VALID_CLASS_CHANGE, afterContainerValidClassChange));
	}

	protected void renderAfterDestroyedChange(List<String> renderedAttributes, FormValidator formValidator) throws IOException {
		java.lang.String afterDestroyedChange = formValidator.getAfterDestroyedChange();
		renderedAttributes.add(renderString(FormValidator.AFTER_DESTROYED_CHANGE, afterDestroyedChange));
	}

	protected void renderAfterErrorClassChange(List<String> renderedAttributes, FormValidator formValidator) throws IOException {
		java.lang.String afterErrorClassChange = formValidator.getAfterErrorClassChange();
		renderedAttributes.add(renderString(FormValidator.AFTER_ERROR_CLASS_CHANGE, afterErrorClassChange));
	}

	protected void renderAfterExtractRulesChange(List<String> renderedAttributes, FormValidator formValidator) throws IOException {
		java.lang.String afterExtractRulesChange = formValidator.getAfterExtractRulesChange();
		renderedAttributes.add(renderString(FormValidator.AFTER_EXTRACT_RULES_CHANGE, afterExtractRulesChange));
	}

	protected void renderAfterFieldContainerChange(List<String> renderedAttributes, FormValidator formValidator) throws IOException {
		java.lang.String afterFieldContainerChange = formValidator.getAfterFieldContainerChange();
		renderedAttributes.add(renderString(FormValidator.AFTER_FIELD_CONTAINER_CHANGE, afterFieldContainerChange));
	}

	protected void renderAfterFieldStringsChange(List<String> renderedAttributes, FormValidator formValidator) throws IOException {
		java.lang.String afterFieldStringsChange = formValidator.getAfterFieldStringsChange();
		renderedAttributes.add(renderString(FormValidator.AFTER_FIELD_STRINGS_CHANGE, afterFieldStringsChange));
	}

	protected void renderAfterInitializedChange(List<String> renderedAttributes, FormValidator formValidator) throws IOException {
		java.lang.String afterInitializedChange = formValidator.getAfterInitializedChange();
		renderedAttributes.add(renderString(FormValidator.AFTER_INITIALIZED_CHANGE, afterInitializedChange));
	}

	protected void renderAfterLabelCssClassChange(List<String> renderedAttributes, FormValidator formValidator) throws IOException {
		java.lang.String afterLabelCssClassChange = formValidator.getAfterLabelCssClassChange();
		renderedAttributes.add(renderString(FormValidator.AFTER_LABEL_CSS_CLASS_CHANGE, afterLabelCssClassChange));
	}

	protected void renderAfterMessageContainerChange(List<String> renderedAttributes, FormValidator formValidator) throws IOException {
		java.lang.String afterMessageContainerChange = formValidator.getAfterMessageContainerChange();
		renderedAttributes.add(renderString(FormValidator.AFTER_MESSAGE_CONTAINER_CHANGE, afterMessageContainerChange));
	}

	protected void renderAfterRulesChange(List<String> renderedAttributes, FormValidator formValidator) throws IOException {
		java.lang.String afterRulesChange = formValidator.getAfterRulesChange();
		renderedAttributes.add(renderString(FormValidator.AFTER_RULES_CHANGE, afterRulesChange));
	}

	protected void renderAfterSelectTextChange(List<String> renderedAttributes, FormValidator formValidator) throws IOException {
		java.lang.String afterSelectTextChange = formValidator.getAfterSelectTextChange();
		renderedAttributes.add(renderString(FormValidator.AFTER_SELECT_TEXT_CHANGE, afterSelectTextChange));
	}

	protected void renderAfterShowAllMessagesChange(List<String> renderedAttributes, FormValidator formValidator) throws IOException {
		java.lang.String afterShowAllMessagesChange = formValidator.getAfterShowAllMessagesChange();
		renderedAttributes.add(renderString(FormValidator.AFTER_SHOW_ALL_MESSAGES_CHANGE, afterShowAllMessagesChange));
	}

	protected void renderAfterShowMessagesChange(List<String> renderedAttributes, FormValidator formValidator) throws IOException {
		java.lang.String afterShowMessagesChange = formValidator.getAfterShowMessagesChange();
		renderedAttributes.add(renderString(FormValidator.AFTER_SHOW_MESSAGES_CHANGE, afterShowMessagesChange));
	}

	protected void renderAfterStackErrorContainerChange(List<String> renderedAttributes, FormValidator formValidator) throws IOException {
		java.lang.String afterStackErrorContainerChange = formValidator.getAfterStackErrorContainerChange();
		renderedAttributes.add(renderString(FormValidator.AFTER_STACK_ERROR_CONTAINER_CHANGE, afterStackErrorContainerChange));
	}

	protected void renderAfterStringsChange(List<String> renderedAttributes, FormValidator formValidator) throws IOException {
		java.lang.String afterStringsChange = formValidator.getAfterStringsChange();
		renderedAttributes.add(renderString(FormValidator.AFTER_STRINGS_CHANGE, afterStringsChange));
	}

	protected void renderAfterValidClassChange(List<String> renderedAttributes, FormValidator formValidator) throws IOException {
		java.lang.String afterValidClassChange = formValidator.getAfterValidClassChange();
		renderedAttributes.add(renderString(FormValidator.AFTER_VALID_CLASS_CHANGE, afterValidClassChange));
	}

	protected void renderAfterValidateOnBlurChange(List<String> renderedAttributes, FormValidator formValidator) throws IOException {
		java.lang.String afterValidateOnBlurChange = formValidator.getAfterValidateOnBlurChange();
		renderedAttributes.add(renderString(FormValidator.AFTER_VALIDATE_ON_BLUR_CHANGE, afterValidateOnBlurChange));
	}

	protected void renderAfterValidateOnInputChange(List<String> renderedAttributes, FormValidator formValidator) throws IOException {
		java.lang.String afterValidateOnInputChange = formValidator.getAfterValidateOnInputChange();
		renderedAttributes.add(renderString(FormValidator.AFTER_VALIDATE_ON_INPUT_CHANGE, afterValidateOnInputChange));
	}

	protected void renderOnBoundingBoxChange(List<String> renderedAttributes, FormValidator formValidator) throws IOException {
		java.lang.String onBoundingBoxChange = formValidator.getOnBoundingBoxChange();
		renderedAttributes.add(renderString(FormValidator.ON_BOUNDING_BOX_CHANGE, onBoundingBoxChange));
	}

	protected void renderOnContainerErrorClassChange(List<String> renderedAttributes, FormValidator formValidator) throws IOException {
		java.lang.String onContainerErrorClassChange = formValidator.getOnContainerErrorClassChange();
		renderedAttributes.add(renderString(FormValidator.ON_CONTAINER_ERROR_CLASS_CHANGE, onContainerErrorClassChange));
	}

	protected void renderOnContainerValidClassChange(List<String> renderedAttributes, FormValidator formValidator) throws IOException {
		java.lang.String onContainerValidClassChange = formValidator.getOnContainerValidClassChange();
		renderedAttributes.add(renderString(FormValidator.ON_CONTAINER_VALID_CLASS_CHANGE, onContainerValidClassChange));
	}

	protected void renderOnDestroyedChange(List<String> renderedAttributes, FormValidator formValidator) throws IOException {
		java.lang.String onDestroyedChange = formValidator.getOnDestroyedChange();
		renderedAttributes.add(renderString(FormValidator.ON_DESTROYED_CHANGE, onDestroyedChange));
	}

	protected void renderOnErrorClassChange(List<String> renderedAttributes, FormValidator formValidator) throws IOException {
		java.lang.String onErrorClassChange = formValidator.getOnErrorClassChange();
		renderedAttributes.add(renderString(FormValidator.ON_ERROR_CLASS_CHANGE, onErrorClassChange));
	}

	protected void renderOnExtractRulesChange(List<String> renderedAttributes, FormValidator formValidator) throws IOException {
		java.lang.String onExtractRulesChange = formValidator.getOnExtractRulesChange();
		renderedAttributes.add(renderString(FormValidator.ON_EXTRACT_RULES_CHANGE, onExtractRulesChange));
	}

	protected void renderOnFieldContainerChange(List<String> renderedAttributes, FormValidator formValidator) throws IOException {
		java.lang.String onFieldContainerChange = formValidator.getOnFieldContainerChange();
		renderedAttributes.add(renderString(FormValidator.ON_FIELD_CONTAINER_CHANGE, onFieldContainerChange));
	}

	protected void renderOnFieldStringsChange(List<String> renderedAttributes, FormValidator formValidator) throws IOException {
		java.lang.String onFieldStringsChange = formValidator.getOnFieldStringsChange();
		renderedAttributes.add(renderString(FormValidator.ON_FIELD_STRINGS_CHANGE, onFieldStringsChange));
	}

	protected void renderOnInitializedChange(List<String> renderedAttributes, FormValidator formValidator) throws IOException {
		java.lang.String onInitializedChange = formValidator.getOnInitializedChange();
		renderedAttributes.add(renderString(FormValidator.ON_INITIALIZED_CHANGE, onInitializedChange));
	}

	protected void renderOnLabelCssClassChange(List<String> renderedAttributes, FormValidator formValidator) throws IOException {
		java.lang.String onLabelCssClassChange = formValidator.getOnLabelCssClassChange();
		renderedAttributes.add(renderString(FormValidator.ON_LABEL_CSS_CLASS_CHANGE, onLabelCssClassChange));
	}

	protected void renderOnMessageContainerChange(List<String> renderedAttributes, FormValidator formValidator) throws IOException {
		java.lang.String onMessageContainerChange = formValidator.getOnMessageContainerChange();
		renderedAttributes.add(renderString(FormValidator.ON_MESSAGE_CONTAINER_CHANGE, onMessageContainerChange));
	}

	protected void renderOnRulesChange(List<String> renderedAttributes, FormValidator formValidator) throws IOException {
		java.lang.String onRulesChange = formValidator.getOnRulesChange();
		renderedAttributes.add(renderString(FormValidator.ON_RULES_CHANGE, onRulesChange));
	}

	protected void renderOnSelectTextChange(List<String> renderedAttributes, FormValidator formValidator) throws IOException {
		java.lang.String onSelectTextChange = formValidator.getOnSelectTextChange();
		renderedAttributes.add(renderString(FormValidator.ON_SELECT_TEXT_CHANGE, onSelectTextChange));
	}

	protected void renderOnShowAllMessagesChange(List<String> renderedAttributes, FormValidator formValidator) throws IOException {
		java.lang.String onShowAllMessagesChange = formValidator.getOnShowAllMessagesChange();
		renderedAttributes.add(renderString(FormValidator.ON_SHOW_ALL_MESSAGES_CHANGE, onShowAllMessagesChange));
	}

	protected void renderOnShowMessagesChange(List<String> renderedAttributes, FormValidator formValidator) throws IOException {
		java.lang.String onShowMessagesChange = formValidator.getOnShowMessagesChange();
		renderedAttributes.add(renderString(FormValidator.ON_SHOW_MESSAGES_CHANGE, onShowMessagesChange));
	}

	protected void renderOnStackErrorContainerChange(List<String> renderedAttributes, FormValidator formValidator) throws IOException {
		java.lang.String onStackErrorContainerChange = formValidator.getOnStackErrorContainerChange();
		renderedAttributes.add(renderString(FormValidator.ON_STACK_ERROR_CONTAINER_CHANGE, onStackErrorContainerChange));
	}

	protected void renderOnStringsChange(List<String> renderedAttributes, FormValidator formValidator) throws IOException {
		java.lang.String onStringsChange = formValidator.getOnStringsChange();
		renderedAttributes.add(renderString(FormValidator.ON_STRINGS_CHANGE, onStringsChange));
	}

	protected void renderOnValidClassChange(List<String> renderedAttributes, FormValidator formValidator) throws IOException {
		java.lang.String onValidClassChange = formValidator.getOnValidClassChange();
		renderedAttributes.add(renderString(FormValidator.ON_VALID_CLASS_CHANGE, onValidClassChange));
	}

	protected void renderOnValidateOnBlurChange(List<String> renderedAttributes, FormValidator formValidator) throws IOException {
		java.lang.String onValidateOnBlurChange = formValidator.getOnValidateOnBlurChange();
		renderedAttributes.add(renderString(FormValidator.ON_VALIDATE_ON_BLUR_CHANGE, onValidateOnBlurChange));
	}

	protected void renderOnValidateOnInputChange(List<String> renderedAttributes, FormValidator formValidator) throws IOException {
		java.lang.String onValidateOnInputChange = formValidator.getOnValidateOnInputChange();
		renderedAttributes.add(renderString(FormValidator.ON_VALIDATE_ON_INPUT_CHANGE, onValidateOnInputChange));
	}

}
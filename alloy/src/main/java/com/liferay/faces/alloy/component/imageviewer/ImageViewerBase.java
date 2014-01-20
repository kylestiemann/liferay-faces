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
package com.liferay.faces.alloy.component.imageviewer;

/**
 * @author Bruno Basto
 * @author Kyle Stiemann
 * @generated
 */
public abstract class ImageViewerBase extends javax.faces.component.UIPanel {

	public static final String ALIGN = "align";
	public static final String ALIGN_ON = "alignOn";
	public static final String ANIM = "anim";
	public static final String IMAGE_VIEWER_BODY_CONTENT = "bodyContent";
	public static final String BOUNDING_BOX = "boundingBox";
	public static final String CAPTION = "caption";
	public static final String CAPTION_EL = "captionEl";
	public static final String CAPTION_FROM_TITLE = "captionFromTitle";
	public static final String CENTERED = "centered";
	public static final String CLOSE_EL = "closeEl";
	public static final String CONSTRAIN = "constrain";
	public static final String CONTENT_BOX = "contentBox";
	public static final String CONTROL_LEFT_EL = "controlLeftEl";
	public static final String CONTROL_RIGHT_EL = "controlRightEl";
	public static final String CURRENT_INDEX = "currentIndex";
	public static final String DESTROYED = "destroyed";
	public static final String DISABLED = "disabled";
	public static final String FILL_HEIGHT = "fillHeight";
	public static final String FOCUS_ON = "focusOn";
	public static final String FOCUSED = "focused";
	public static final String FOOTER_CONTENT = "footerContent";
	public static final String HEADER_CONTENT = "headerContent";
	public static final String HEIGHT = "height";
	public static final String IMAGE_VIEWER_ID = "id";
	public static final String IMAGE = "image";
	public static final String IMAGE_ANIM = "imageAnim";
	public static final String INFO_EL = "infoEl";
	public static final String INFO_TEMPLATE = "infoTemplate";
	public static final String INITIALIZED = "initialized";
	public static final String LINKS = "links";
	public static final String LOADER = "loader";
	public static final String LOADING = "loading";
	public static final String LOADING_EL = "loadingEl";
	public static final String IMAGE_VIEWER_LOCALE = "locale";
	public static final String MASK_NODE = "maskNode";
	public static final String MAX_HEIGHT = "maxHeight";
	public static final String MAX_WIDTH = "maxWidth";
	public static final String MODAL = "modal";
	public static final String PRELOAD_ALL_IMAGES = "preloadAllImages";
	public static final String PREVENT_OVERLAP = "preventOverlap";
	public static final String RENDER = "render";
	public static final String RENDERED = "rendered";
	public static final String SHIM = "shim";
	public static final String SHOW_CLOSE = "showClose";
	public static final String SHOW_CONTROLS = "showControls";
	public static final String SRC_NODE = "srcNode";
	public static final String STRINGS = "strings";
	public static final String TAB_INDEX = "tabIndex";
	public static final String TOTAL_LINKS = "totalLinks";
	public static final String VISIBLE = "visible";
	public static final String WIDTH = "width";
	public static final String X = "x";
	public static final String XY = "xy";
	public static final String Y = "y";
	public static final String Z_INDEX = "zIndex";
	public static final String AFTER_ALIGN_CHANGE = "afterAlignChange";
	public static final String AFTER_ALIGN_ON_CHANGE = "afterAlignOnChange";
	public static final String AFTER_ANIM_CHANGE = "afterAnimChange";
	public static final String AFTER_BODY_CONTENT_CHANGE = "afterBodyContentChange";
	public static final String AFTER_BOUNDING_BOX_CHANGE = "afterBoundingBoxChange";
	public static final String AFTER_CAPTION_CHANGE = "afterCaptionChange";
	public static final String AFTER_CAPTION_EL_CHANGE = "afterCaptionElChange";
	public static final String AFTER_CAPTION_FROM_TITLE_CHANGE = "afterCaptionFromTitleChange";
	public static final String AFTER_CENTERED_CHANGE = "afterCenteredChange";
	public static final String AFTER_CLOSE_EL_CHANGE = "afterCloseElChange";
	public static final String AFTER_CONSTRAIN_CHANGE = "afterConstrainChange";
	public static final String AFTER_CONTENT_BOX_CHANGE = "afterContentBoxChange";
	public static final String AFTER_CONTROL_LEFT_EL_CHANGE = "afterControlLeftElChange";
	public static final String AFTER_CONTROL_RIGHT_EL_CHANGE = "afterControlRightElChange";
	public static final String AFTER_CURRENT_INDEX_CHANGE = "afterCurrentIndexChange";
	public static final String AFTER_DESTROYED_CHANGE = "afterDestroyedChange";
	public static final String AFTER_DISABLED_CHANGE = "afterDisabledChange";
	public static final String AFTER_FILL_HEIGHT_CHANGE = "afterFillHeightChange";
	public static final String AFTER_FOCUS_ON_CHANGE = "afterFocusOnChange";
	public static final String AFTER_FOCUSED_CHANGE = "afterFocusedChange";
	public static final String AFTER_FOOTER_CONTENT_CHANGE = "afterFooterContentChange";
	public static final String AFTER_HEADER_CONTENT_CHANGE = "afterHeaderContentChange";
	public static final String AFTER_HEIGHT_CHANGE = "afterHeightChange";
	public static final String AFTER_ID_CHANGE = "afterIdChange";
	public static final String AFTER_IMAGE_CHANGE = "afterImageChange";
	public static final String AFTER_IMAGE_ANIM_CHANGE = "afterImageAnimChange";
	public static final String AFTER_INFO_EL_CHANGE = "afterInfoElChange";
	public static final String AFTER_INFO_TEMPLATE_CHANGE = "afterInfoTemplateChange";
	public static final String AFTER_INITIALIZED_CHANGE = "afterInitializedChange";
	public static final String AFTER_LINKS_CHANGE = "afterLinksChange";
	public static final String AFTER_LOADER_CHANGE = "afterLoaderChange";
	public static final String AFTER_LOADING_CHANGE = "afterLoadingChange";
	public static final String AFTER_LOADING_EL_CHANGE = "afterLoadingElChange";
	public static final String AFTER_LOCALE_CHANGE = "afterLocaleChange";
	public static final String AFTER_MASK_NODE_CHANGE = "afterMaskNodeChange";
	public static final String AFTER_MAX_HEIGHT_CHANGE = "afterMaxHeightChange";
	public static final String AFTER_MAX_WIDTH_CHANGE = "afterMaxWidthChange";
	public static final String AFTER_MODAL_CHANGE = "afterModalChange";
	public static final String AFTER_PRELOAD_ALL_IMAGES_CHANGE = "afterPreloadAllImagesChange";
	public static final String AFTER_PREVENT_OVERLAP_CHANGE = "afterPreventOverlapChange";
	public static final String AFTER_RENDER_CHANGE = "afterRenderChange";
	public static final String AFTER_RENDERED_CHANGE = "afterRenderedChange";
	public static final String AFTER_SHIM_CHANGE = "afterShimChange";
	public static final String AFTER_SHOW_CLOSE_CHANGE = "afterShowCloseChange";
	public static final String AFTER_SHOW_CONTROLS_CHANGE = "afterShowControlsChange";
	public static final String AFTER_SRC_NODE_CHANGE = "afterSrcNodeChange";
	public static final String AFTER_STRINGS_CHANGE = "afterStringsChange";
	public static final String AFTER_TAB_INDEX_CHANGE = "afterTabIndexChange";
	public static final String AFTER_TOTAL_LINKS_CHANGE = "afterTotalLinksChange";
	public static final String AFTER_VISIBLE_CHANGE = "afterVisibleChange";
	public static final String AFTER_WIDTH_CHANGE = "afterWidthChange";
	public static final String AFTER_XCHANGE = "afterXChange";
	public static final String AFTER_XY_CHANGE = "afterXyChange";
	public static final String AFTER_YCHANGE = "afterYChange";
	public static final String AFTER_ZINDEX_CHANGE = "afterZIndexChange";
	public static final String ON_ALIGN_CHANGE = "onAlignChange";
	public static final String ON_ALIGN_ON_CHANGE = "onAlignOnChange";
	public static final String ON_ANIM_CHANGE = "onAnimChange";
	public static final String ON_BODY_CONTENT_CHANGE = "onBodyContentChange";
	public static final String ON_BOUNDING_BOX_CHANGE = "onBoundingBoxChange";
	public static final String ON_CAPTION_CHANGE = "onCaptionChange";
	public static final String ON_CAPTION_EL_CHANGE = "onCaptionElChange";
	public static final String ON_CAPTION_FROM_TITLE_CHANGE = "onCaptionFromTitleChange";
	public static final String ON_CENTERED_CHANGE = "onCenteredChange";
	public static final String ON_CLOSE_EL_CHANGE = "onCloseElChange";
	public static final String ON_CONSTRAIN_CHANGE = "onConstrainChange";
	public static final String ON_CONTENT_BOX_CHANGE = "onContentBoxChange";
	public static final String ON_CONTROL_LEFT_EL_CHANGE = "onControlLeftElChange";
	public static final String ON_CONTROL_RIGHT_EL_CHANGE = "onControlRightElChange";
	public static final String ON_CURRENT_INDEX_CHANGE = "onCurrentIndexChange";
	public static final String ON_DESTROYED_CHANGE = "onDestroyedChange";
	public static final String ON_DISABLED_CHANGE = "onDisabledChange";
	public static final String ON_FILL_HEIGHT_CHANGE = "onFillHeightChange";
	public static final String ON_FOCUS_ON_CHANGE = "onFocusOnChange";
	public static final String ON_FOCUSED_CHANGE = "onFocusedChange";
	public static final String ON_FOOTER_CONTENT_CHANGE = "onFooterContentChange";
	public static final String ON_HEADER_CONTENT_CHANGE = "onHeaderContentChange";
	public static final String ON_HEIGHT_CHANGE = "onHeightChange";
	public static final String ON_ID_CHANGE = "onIdChange";
	public static final String ON_IMAGE_CHANGE = "onImageChange";
	public static final String ON_IMAGE_ANIM_CHANGE = "onImageAnimChange";
	public static final String ON_INFO_EL_CHANGE = "onInfoElChange";
	public static final String ON_INFO_TEMPLATE_CHANGE = "onInfoTemplateChange";
	public static final String ON_INITIALIZED_CHANGE = "onInitializedChange";
	public static final String ON_LINKS_CHANGE = "onLinksChange";
	public static final String ON_LOADER_CHANGE = "onLoaderChange";
	public static final String ON_LOADING_CHANGE = "onLoadingChange";
	public static final String ON_LOADING_EL_CHANGE = "onLoadingElChange";
	public static final String ON_LOCALE_CHANGE = "onLocaleChange";
	public static final String ON_MASK_NODE_CHANGE = "onMaskNodeChange";
	public static final String ON_MAX_HEIGHT_CHANGE = "onMaxHeightChange";
	public static final String ON_MAX_WIDTH_CHANGE = "onMaxWidthChange";
	public static final String ON_MODAL_CHANGE = "onModalChange";
	public static final String ON_PRELOAD_ALL_IMAGES_CHANGE = "onPreloadAllImagesChange";
	public static final String ON_PREVENT_OVERLAP_CHANGE = "onPreventOverlapChange";
	public static final String ON_RENDER_CHANGE = "onRenderChange";
	public static final String ON_RENDERED_CHANGE = "onRenderedChange";
	public static final String ON_SHIM_CHANGE = "onShimChange";
	public static final String ON_SHOW_CLOSE_CHANGE = "onShowCloseChange";
	public static final String ON_SHOW_CONTROLS_CHANGE = "onShowControlsChange";
	public static final String ON_SRC_NODE_CHANGE = "onSrcNodeChange";
	public static final String ON_STRINGS_CHANGE = "onStringsChange";
	public static final String ON_TAB_INDEX_CHANGE = "onTabIndexChange";
	public static final String ON_TOTAL_LINKS_CHANGE = "onTotalLinksChange";
	public static final String ON_VISIBLE_CHANGE = "onVisibleChange";
	public static final String ON_WIDTH_CHANGE = "onWidthChange";
	public static final String ON_XCHANGE = "onXChange";
	public static final String ON_XY_CHANGE = "onXyChange";
	public static final String ON_YCHANGE = "onYChange";
	public static final String ON_ZINDEX_CHANGE = "onZIndexChange";

	public java.lang.Object getAlign() {
		return (java.lang.Object) getStateHelper().eval(ALIGN, null);
	}

	public void setAlign(java.lang.Object align) {
		getStateHelper().put(ALIGN, align);
	}

	public java.lang.Object getAlignOn() {
		return (java.lang.Object) getStateHelper().eval(ALIGN_ON, null);
	}

	public void setAlignOn(java.lang.Object alignOn) {
		getStateHelper().put(ALIGN_ON, alignOn);
	}

	public java.lang.Boolean getAnim() {
		return (java.lang.Boolean) getStateHelper().eval(ANIM, null);
	}

	public void setAnim(java.lang.Boolean anim) {
		getStateHelper().put(ANIM, anim);
	}

	public java.lang.String getImageViewerBodyContent() {
		return (java.lang.String) getStateHelper().eval(IMAGE_VIEWER_BODY_CONTENT, null);
	}

	public void setImageViewerBodyContent(java.lang.String imageViewerBodyContent) {
		getStateHelper().put(IMAGE_VIEWER_BODY_CONTENT, imageViewerBodyContent);
	}

	public java.lang.String getBoundingBox() {
		return (java.lang.String) getStateHelper().eval(BOUNDING_BOX, null);
	}

	public void setBoundingBox(java.lang.String boundingBox) {
		getStateHelper().put(BOUNDING_BOX, boundingBox);
	}

	public java.lang.String getCaption() {
		return (java.lang.String) getStateHelper().eval(CAPTION, null);
	}

	public void setCaption(java.lang.String caption) {
		getStateHelper().put(CAPTION, caption);
	}

	public java.lang.Object getCaptionEl() {
		return (java.lang.Object) getStateHelper().eval(CAPTION_EL, null);
	}

	public void setCaptionEl(java.lang.Object captionEl) {
		getStateHelper().put(CAPTION_EL, captionEl);
	}

	public java.lang.Boolean getCaptionFromTitle() {
		return (java.lang.Boolean) getStateHelper().eval(CAPTION_FROM_TITLE, null);
	}

	public void setCaptionFromTitle(java.lang.Boolean captionFromTitle) {
		getStateHelper().put(CAPTION_FROM_TITLE, captionFromTitle);
	}

	public java.lang.Boolean getCentered() {
		return (java.lang.Boolean) getStateHelper().eval(CENTERED, null);
	}

	public void setCentered(java.lang.Boolean centered) {
		getStateHelper().put(CENTERED, centered);
	}

	public java.lang.Object getCloseEl() {
		return (java.lang.Object) getStateHelper().eval(CLOSE_EL, null);
	}

	public void setCloseEl(java.lang.Object closeEl) {
		getStateHelper().put(CLOSE_EL, closeEl);
	}

	public java.lang.Object getConstrain() {
		return (java.lang.Object) getStateHelper().eval(CONSTRAIN, null);
	}

	public void setConstrain(java.lang.Object constrain) {
		getStateHelper().put(CONSTRAIN, constrain);
	}

	public java.lang.String getContentBox() {
		return (java.lang.String) getStateHelper().eval(CONTENT_BOX, null);
	}

	public void setContentBox(java.lang.String contentBox) {
		getStateHelper().put(CONTENT_BOX, contentBox);
	}

	public java.lang.Object getControlLeftEl() {
		return (java.lang.Object) getStateHelper().eval(CONTROL_LEFT_EL, null);
	}

	public void setControlLeftEl(java.lang.Object controlLeftEl) {
		getStateHelper().put(CONTROL_LEFT_EL, controlLeftEl);
	}

	public java.lang.Object getControlRightEl() {
		return (java.lang.Object) getStateHelper().eval(CONTROL_RIGHT_EL, null);
	}

	public void setControlRightEl(java.lang.Object controlRightEl) {
		getStateHelper().put(CONTROL_RIGHT_EL, controlRightEl);
	}

	public java.lang.Object getCurrentIndex() {
		return (java.lang.Object) getStateHelper().eval(CURRENT_INDEX, null);
	}

	public void setCurrentIndex(java.lang.Object currentIndex) {
		getStateHelper().put(CURRENT_INDEX, currentIndex);
	}

	public java.lang.Boolean getDestroyed() {
		return (java.lang.Boolean) getStateHelper().eval(DESTROYED, null);
	}

	public void setDestroyed(java.lang.Boolean destroyed) {
		getStateHelper().put(DESTROYED, destroyed);
	}

	public java.lang.Boolean getDisabled() {
		return (java.lang.Boolean) getStateHelper().eval(DISABLED, null);
	}

	public void setDisabled(java.lang.Boolean disabled) {
		getStateHelper().put(DISABLED, disabled);
	}

	public java.lang.Object getFillHeight() {
		return (java.lang.Object) getStateHelper().eval(FILL_HEIGHT, null);
	}

	public void setFillHeight(java.lang.Object fillHeight) {
		getStateHelper().put(FILL_HEIGHT, fillHeight);
	}

	public java.lang.Object getFocusOn() {
		return (java.lang.Object) getStateHelper().eval(FOCUS_ON, null);
	}

	public void setFocusOn(java.lang.Object focusOn) {
		getStateHelper().put(FOCUS_ON, focusOn);
	}

	public java.lang.Boolean getFocused() {
		return (java.lang.Boolean) getStateHelper().eval(FOCUSED, null);
	}

	public void setFocused(java.lang.Boolean focused) {
		getStateHelper().put(FOCUSED, focused);
	}

	public java.lang.Object getFooterContent() {
		return (java.lang.Object) getStateHelper().eval(FOOTER_CONTENT, null);
	}

	public void setFooterContent(java.lang.Object footerContent) {
		getStateHelper().put(FOOTER_CONTENT, footerContent);
	}

	public java.lang.Object getHeaderContent() {
		return (java.lang.Object) getStateHelper().eval(HEADER_CONTENT, null);
	}

	public void setHeaderContent(java.lang.Object headerContent) {
		getStateHelper().put(HEADER_CONTENT, headerContent);
	}

	public java.lang.Object getHeight() {
		return (java.lang.Object) getStateHelper().eval(HEIGHT, null);
	}

	public void setHeight(java.lang.Object height) {
		getStateHelper().put(HEIGHT, height);
	}

	public java.lang.String getImageViewerId() {
		return (java.lang.String) getStateHelper().eval(IMAGE_VIEWER_ID, null);
	}

	public void setImageViewerId(java.lang.String imageViewerId) {
		getStateHelper().put(IMAGE_VIEWER_ID, imageViewerId);
	}

	public java.lang.Object getImage() {
		return (java.lang.Object) getStateHelper().eval(IMAGE, null);
	}

	public void setImage(java.lang.Object image) {
		getStateHelper().put(IMAGE, image);
	}

	public java.lang.Object getImageAnim() {
		return (java.lang.Object) getStateHelper().eval(IMAGE_ANIM, null);
	}

	public void setImageAnim(java.lang.Object imageAnim) {
		getStateHelper().put(IMAGE_ANIM, imageAnim);
	}

	public java.lang.Object getInfoEl() {
		return (java.lang.Object) getStateHelper().eval(INFO_EL, null);
	}

	public void setInfoEl(java.lang.Object infoEl) {
		getStateHelper().put(INFO_EL, infoEl);
	}

	public java.lang.String getInfoTemplate() {
		return (java.lang.String) getStateHelper().eval(INFO_TEMPLATE, null);
	}

	public void setInfoTemplate(java.lang.String infoTemplate) {
		getStateHelper().put(INFO_TEMPLATE, infoTemplate);
	}

	public java.lang.Boolean getInitialized() {
		return (java.lang.Boolean) getStateHelper().eval(INITIALIZED, null);
	}

	public void setInitialized(java.lang.Boolean initialized) {
		getStateHelper().put(INITIALIZED, initialized);
	}

	public java.lang.Object getLinks() {
		return (java.lang.Object) getStateHelper().eval(LINKS, null);
	}

	public void setLinks(java.lang.Object links) {
		getStateHelper().put(LINKS, links);
	}

	public java.lang.Object getLoader() {
		return (java.lang.Object) getStateHelper().eval(LOADER, null);
	}

	public void setLoader(java.lang.Object loader) {
		getStateHelper().put(LOADER, loader);
	}

	public java.lang.Boolean getLoading() {
		return (java.lang.Boolean) getStateHelper().eval(LOADING, null);
	}

	public void setLoading(java.lang.Boolean loading) {
		getStateHelper().put(LOADING, loading);
	}

	public java.lang.Object getLoadingEl() {
		return (java.lang.Object) getStateHelper().eval(LOADING_EL, null);
	}

	public void setLoadingEl(java.lang.Object loadingEl) {
		getStateHelper().put(LOADING_EL, loadingEl);
	}

	public java.lang.String getImageViewerLocale() {
		return (java.lang.String) getStateHelper().eval(IMAGE_VIEWER_LOCALE, null);
	}

	public void setImageViewerLocale(java.lang.String imageViewerLocale) {
		getStateHelper().put(IMAGE_VIEWER_LOCALE, imageViewerLocale);
	}

	public java.lang.Object getMaskNode() {
		return (java.lang.Object) getStateHelper().eval(MASK_NODE, null);
	}

	public void setMaskNode(java.lang.Object maskNode) {
		getStateHelper().put(MASK_NODE, maskNode);
	}

	public java.lang.Object getMaxHeight() {
		return (java.lang.Object) getStateHelper().eval(MAX_HEIGHT, null);
	}

	public void setMaxHeight(java.lang.Object maxHeight) {
		getStateHelper().put(MAX_HEIGHT, maxHeight);
	}

	public java.lang.Object getMaxWidth() {
		return (java.lang.Object) getStateHelper().eval(MAX_WIDTH, null);
	}

	public void setMaxWidth(java.lang.Object maxWidth) {
		getStateHelper().put(MAX_WIDTH, maxWidth);
	}

	public java.lang.Boolean getModal() {
		return (java.lang.Boolean) getStateHelper().eval(MODAL, null);
	}

	public void setModal(java.lang.Boolean modal) {
		getStateHelper().put(MODAL, modal);
	}

	public java.lang.Boolean getPreloadAllImages() {
		return (java.lang.Boolean) getStateHelper().eval(PRELOAD_ALL_IMAGES, null);
	}

	public void setPreloadAllImages(java.lang.Boolean preloadAllImages) {
		getStateHelper().put(PRELOAD_ALL_IMAGES, preloadAllImages);
	}

	public java.lang.Boolean getPreventOverlap() {
		return (java.lang.Boolean) getStateHelper().eval(PREVENT_OVERLAP, null);
	}

	public void setPreventOverlap(java.lang.Boolean preventOverlap) {
		getStateHelper().put(PREVENT_OVERLAP, preventOverlap);
	}

	public java.lang.Object getRender() {
		return (java.lang.Object) getStateHelper().eval(RENDER, null);
	}

	public void setRender(java.lang.Object render) {
		getStateHelper().put(RENDER, render);
	}

	public java.lang.Boolean getRendered() {
		return (java.lang.Boolean) getStateHelper().eval(RENDERED, null);
	}

	public void setRendered(java.lang.Boolean rendered) {
		getStateHelper().put(RENDERED, rendered);
	}

	public java.lang.Boolean getShim() {
		return (java.lang.Boolean) getStateHelper().eval(SHIM, null);
	}

	public void setShim(java.lang.Boolean shim) {
		getStateHelper().put(SHIM, shim);
	}

	public java.lang.Boolean getShowClose() {
		return (java.lang.Boolean) getStateHelper().eval(SHOW_CLOSE, null);
	}

	public void setShowClose(java.lang.Boolean showClose) {
		getStateHelper().put(SHOW_CLOSE, showClose);
	}

	public java.lang.Boolean getShowControls() {
		return (java.lang.Boolean) getStateHelper().eval(SHOW_CONTROLS, null);
	}

	public void setShowControls(java.lang.Boolean showControls) {
		getStateHelper().put(SHOW_CONTROLS, showControls);
	}

	public java.lang.String getSrcNode() {
		return (java.lang.String) getStateHelper().eval(SRC_NODE, null);
	}

	public void setSrcNode(java.lang.String srcNode) {
		getStateHelper().put(SRC_NODE, srcNode);
	}

	public java.lang.Object getStrings() {
		return (java.lang.Object) getStateHelper().eval(STRINGS, null);
	}

	public void setStrings(java.lang.Object strings) {
		getStateHelper().put(STRINGS, strings);
	}

	public java.lang.Object getTabIndex() {
		return (java.lang.Object) getStateHelper().eval(TAB_INDEX, null);
	}

	public void setTabIndex(java.lang.Object tabIndex) {
		getStateHelper().put(TAB_INDEX, tabIndex);
	}

	public java.lang.Boolean getTotalLinks() {
		return (java.lang.Boolean) getStateHelper().eval(TOTAL_LINKS, null);
	}

	public void setTotalLinks(java.lang.Boolean totalLinks) {
		getStateHelper().put(TOTAL_LINKS, totalLinks);
	}

	public java.lang.Boolean getVisible() {
		return (java.lang.Boolean) getStateHelper().eval(VISIBLE, null);
	}

	public void setVisible(java.lang.Boolean visible) {
		getStateHelper().put(VISIBLE, visible);
	}

	public java.lang.Object getWidth() {
		return (java.lang.Object) getStateHelper().eval(WIDTH, null);
	}

	public void setWidth(java.lang.Object width) {
		getStateHelper().put(WIDTH, width);
	}

	public java.lang.Object getX() {
		return (java.lang.Object) getStateHelper().eval(X, null);
	}

	public void setX(java.lang.Object x) {
		getStateHelper().put(X, x);
	}

	public java.lang.Object getXy() {
		return (java.lang.Object) getStateHelper().eval(XY, null);
	}

	public void setXy(java.lang.Object xy) {
		getStateHelper().put(XY, xy);
	}

	public java.lang.Object getY() {
		return (java.lang.Object) getStateHelper().eval(Y, null);
	}

	public void setY(java.lang.Object y) {
		getStateHelper().put(Y, y);
	}

	public java.lang.Object getZIndex() {
		return (java.lang.Object) getStateHelper().eval(Z_INDEX, null);
	}

	public void setZIndex(java.lang.Object zIndex) {
		getStateHelper().put(Z_INDEX, zIndex);
	}

	public java.lang.String getAfterAlignChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_ALIGN_CHANGE, null);
	}

	public void setAfterAlignChange(java.lang.String afterAlignChange) {
		getStateHelper().put(AFTER_ALIGN_CHANGE, afterAlignChange);
	}

	public java.lang.String getAfterAlignOnChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_ALIGN_ON_CHANGE, null);
	}

	public void setAfterAlignOnChange(java.lang.String afterAlignOnChange) {
		getStateHelper().put(AFTER_ALIGN_ON_CHANGE, afterAlignOnChange);
	}

	public java.lang.String getAfterAnimChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_ANIM_CHANGE, null);
	}

	public void setAfterAnimChange(java.lang.String afterAnimChange) {
		getStateHelper().put(AFTER_ANIM_CHANGE, afterAnimChange);
	}

	public java.lang.String getAfterBodyContentChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_BODY_CONTENT_CHANGE, null);
	}

	public void setAfterBodyContentChange(java.lang.String afterBodyContentChange) {
		getStateHelper().put(AFTER_BODY_CONTENT_CHANGE, afterBodyContentChange);
	}

	public java.lang.String getAfterBoundingBoxChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_BOUNDING_BOX_CHANGE, null);
	}

	public void setAfterBoundingBoxChange(java.lang.String afterBoundingBoxChange) {
		getStateHelper().put(AFTER_BOUNDING_BOX_CHANGE, afterBoundingBoxChange);
	}

	public java.lang.String getAfterCaptionChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_CAPTION_CHANGE, null);
	}

	public void setAfterCaptionChange(java.lang.String afterCaptionChange) {
		getStateHelper().put(AFTER_CAPTION_CHANGE, afterCaptionChange);
	}

	public java.lang.String getAfterCaptionElChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_CAPTION_EL_CHANGE, null);
	}

	public void setAfterCaptionElChange(java.lang.String afterCaptionElChange) {
		getStateHelper().put(AFTER_CAPTION_EL_CHANGE, afterCaptionElChange);
	}

	public java.lang.String getAfterCaptionFromTitleChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_CAPTION_FROM_TITLE_CHANGE, null);
	}

	public void setAfterCaptionFromTitleChange(java.lang.String afterCaptionFromTitleChange) {
		getStateHelper().put(AFTER_CAPTION_FROM_TITLE_CHANGE, afterCaptionFromTitleChange);
	}

	public java.lang.String getAfterCenteredChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_CENTERED_CHANGE, null);
	}

	public void setAfterCenteredChange(java.lang.String afterCenteredChange) {
		getStateHelper().put(AFTER_CENTERED_CHANGE, afterCenteredChange);
	}

	public java.lang.String getAfterCloseElChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_CLOSE_EL_CHANGE, null);
	}

	public void setAfterCloseElChange(java.lang.String afterCloseElChange) {
		getStateHelper().put(AFTER_CLOSE_EL_CHANGE, afterCloseElChange);
	}

	public java.lang.String getAfterConstrainChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_CONSTRAIN_CHANGE, null);
	}

	public void setAfterConstrainChange(java.lang.String afterConstrainChange) {
		getStateHelper().put(AFTER_CONSTRAIN_CHANGE, afterConstrainChange);
	}

	public java.lang.String getAfterContentBoxChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_CONTENT_BOX_CHANGE, null);
	}

	public void setAfterContentBoxChange(java.lang.String afterContentBoxChange) {
		getStateHelper().put(AFTER_CONTENT_BOX_CHANGE, afterContentBoxChange);
	}

	public java.lang.String getAfterControlLeftElChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_CONTROL_LEFT_EL_CHANGE, null);
	}

	public void setAfterControlLeftElChange(java.lang.String afterControlLeftElChange) {
		getStateHelper().put(AFTER_CONTROL_LEFT_EL_CHANGE, afterControlLeftElChange);
	}

	public java.lang.String getAfterControlRightElChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_CONTROL_RIGHT_EL_CHANGE, null);
	}

	public void setAfterControlRightElChange(java.lang.String afterControlRightElChange) {
		getStateHelper().put(AFTER_CONTROL_RIGHT_EL_CHANGE, afterControlRightElChange);
	}

	public java.lang.String getAfterCurrentIndexChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_CURRENT_INDEX_CHANGE, null);
	}

	public void setAfterCurrentIndexChange(java.lang.String afterCurrentIndexChange) {
		getStateHelper().put(AFTER_CURRENT_INDEX_CHANGE, afterCurrentIndexChange);
	}

	public java.lang.String getAfterDestroyedChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_DESTROYED_CHANGE, null);
	}

	public void setAfterDestroyedChange(java.lang.String afterDestroyedChange) {
		getStateHelper().put(AFTER_DESTROYED_CHANGE, afterDestroyedChange);
	}

	public java.lang.String getAfterDisabledChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_DISABLED_CHANGE, null);
	}

	public void setAfterDisabledChange(java.lang.String afterDisabledChange) {
		getStateHelper().put(AFTER_DISABLED_CHANGE, afterDisabledChange);
	}

	public java.lang.String getAfterFillHeightChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_FILL_HEIGHT_CHANGE, null);
	}

	public void setAfterFillHeightChange(java.lang.String afterFillHeightChange) {
		getStateHelper().put(AFTER_FILL_HEIGHT_CHANGE, afterFillHeightChange);
	}

	public java.lang.String getAfterFocusOnChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_FOCUS_ON_CHANGE, null);
	}

	public void setAfterFocusOnChange(java.lang.String afterFocusOnChange) {
		getStateHelper().put(AFTER_FOCUS_ON_CHANGE, afterFocusOnChange);
	}

	public java.lang.String getAfterFocusedChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_FOCUSED_CHANGE, null);
	}

	public void setAfterFocusedChange(java.lang.String afterFocusedChange) {
		getStateHelper().put(AFTER_FOCUSED_CHANGE, afterFocusedChange);
	}

	public java.lang.String getAfterFooterContentChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_FOOTER_CONTENT_CHANGE, null);
	}

	public void setAfterFooterContentChange(java.lang.String afterFooterContentChange) {
		getStateHelper().put(AFTER_FOOTER_CONTENT_CHANGE, afterFooterContentChange);
	}

	public java.lang.String getAfterHeaderContentChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_HEADER_CONTENT_CHANGE, null);
	}

	public void setAfterHeaderContentChange(java.lang.String afterHeaderContentChange) {
		getStateHelper().put(AFTER_HEADER_CONTENT_CHANGE, afterHeaderContentChange);
	}

	public java.lang.String getAfterHeightChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_HEIGHT_CHANGE, null);
	}

	public void setAfterHeightChange(java.lang.String afterHeightChange) {
		getStateHelper().put(AFTER_HEIGHT_CHANGE, afterHeightChange);
	}

	public java.lang.String getAfterIdChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_ID_CHANGE, null);
	}

	public void setAfterIdChange(java.lang.String afterIdChange) {
		getStateHelper().put(AFTER_ID_CHANGE, afterIdChange);
	}

	public java.lang.String getAfterImageChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_IMAGE_CHANGE, null);
	}

	public void setAfterImageChange(java.lang.String afterImageChange) {
		getStateHelper().put(AFTER_IMAGE_CHANGE, afterImageChange);
	}

	public java.lang.String getAfterImageAnimChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_IMAGE_ANIM_CHANGE, null);
	}

	public void setAfterImageAnimChange(java.lang.String afterImageAnimChange) {
		getStateHelper().put(AFTER_IMAGE_ANIM_CHANGE, afterImageAnimChange);
	}

	public java.lang.String getAfterInfoElChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_INFO_EL_CHANGE, null);
	}

	public void setAfterInfoElChange(java.lang.String afterInfoElChange) {
		getStateHelper().put(AFTER_INFO_EL_CHANGE, afterInfoElChange);
	}

	public java.lang.String getAfterInfoTemplateChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_INFO_TEMPLATE_CHANGE, null);
	}

	public void setAfterInfoTemplateChange(java.lang.String afterInfoTemplateChange) {
		getStateHelper().put(AFTER_INFO_TEMPLATE_CHANGE, afterInfoTemplateChange);
	}

	public java.lang.String getAfterInitializedChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_INITIALIZED_CHANGE, null);
	}

	public void setAfterInitializedChange(java.lang.String afterInitializedChange) {
		getStateHelper().put(AFTER_INITIALIZED_CHANGE, afterInitializedChange);
	}

	public java.lang.String getAfterLinksChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_LINKS_CHANGE, null);
	}

	public void setAfterLinksChange(java.lang.String afterLinksChange) {
		getStateHelper().put(AFTER_LINKS_CHANGE, afterLinksChange);
	}

	public java.lang.String getAfterLoaderChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_LOADER_CHANGE, null);
	}

	public void setAfterLoaderChange(java.lang.String afterLoaderChange) {
		getStateHelper().put(AFTER_LOADER_CHANGE, afterLoaderChange);
	}

	public java.lang.String getAfterLoadingChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_LOADING_CHANGE, null);
	}

	public void setAfterLoadingChange(java.lang.String afterLoadingChange) {
		getStateHelper().put(AFTER_LOADING_CHANGE, afterLoadingChange);
	}

	public java.lang.String getAfterLoadingElChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_LOADING_EL_CHANGE, null);
	}

	public void setAfterLoadingElChange(java.lang.String afterLoadingElChange) {
		getStateHelper().put(AFTER_LOADING_EL_CHANGE, afterLoadingElChange);
	}

	public java.lang.String getAfterLocaleChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_LOCALE_CHANGE, null);
	}

	public void setAfterLocaleChange(java.lang.String afterLocaleChange) {
		getStateHelper().put(AFTER_LOCALE_CHANGE, afterLocaleChange);
	}

	public java.lang.String getAfterMaskNodeChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_MASK_NODE_CHANGE, null);
	}

	public void setAfterMaskNodeChange(java.lang.String afterMaskNodeChange) {
		getStateHelper().put(AFTER_MASK_NODE_CHANGE, afterMaskNodeChange);
	}

	public java.lang.String getAfterMaxHeightChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_MAX_HEIGHT_CHANGE, null);
	}

	public void setAfterMaxHeightChange(java.lang.String afterMaxHeightChange) {
		getStateHelper().put(AFTER_MAX_HEIGHT_CHANGE, afterMaxHeightChange);
	}

	public java.lang.String getAfterMaxWidthChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_MAX_WIDTH_CHANGE, null);
	}

	public void setAfterMaxWidthChange(java.lang.String afterMaxWidthChange) {
		getStateHelper().put(AFTER_MAX_WIDTH_CHANGE, afterMaxWidthChange);
	}

	public java.lang.String getAfterModalChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_MODAL_CHANGE, null);
	}

	public void setAfterModalChange(java.lang.String afterModalChange) {
		getStateHelper().put(AFTER_MODAL_CHANGE, afterModalChange);
	}

	public java.lang.String getAfterPreloadAllImagesChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_PRELOAD_ALL_IMAGES_CHANGE, null);
	}

	public void setAfterPreloadAllImagesChange(java.lang.String afterPreloadAllImagesChange) {
		getStateHelper().put(AFTER_PRELOAD_ALL_IMAGES_CHANGE, afterPreloadAllImagesChange);
	}

	public java.lang.String getAfterPreventOverlapChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_PREVENT_OVERLAP_CHANGE, null);
	}

	public void setAfterPreventOverlapChange(java.lang.String afterPreventOverlapChange) {
		getStateHelper().put(AFTER_PREVENT_OVERLAP_CHANGE, afterPreventOverlapChange);
	}

	public java.lang.String getAfterRenderChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_RENDER_CHANGE, null);
	}

	public void setAfterRenderChange(java.lang.String afterRenderChange) {
		getStateHelper().put(AFTER_RENDER_CHANGE, afterRenderChange);
	}

	public java.lang.String getAfterRenderedChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_RENDERED_CHANGE, null);
	}

	public void setAfterRenderedChange(java.lang.String afterRenderedChange) {
		getStateHelper().put(AFTER_RENDERED_CHANGE, afterRenderedChange);
	}

	public java.lang.String getAfterShimChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_SHIM_CHANGE, null);
	}

	public void setAfterShimChange(java.lang.String afterShimChange) {
		getStateHelper().put(AFTER_SHIM_CHANGE, afterShimChange);
	}

	public java.lang.String getAfterShowCloseChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_SHOW_CLOSE_CHANGE, null);
	}

	public void setAfterShowCloseChange(java.lang.String afterShowCloseChange) {
		getStateHelper().put(AFTER_SHOW_CLOSE_CHANGE, afterShowCloseChange);
	}

	public java.lang.String getAfterShowControlsChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_SHOW_CONTROLS_CHANGE, null);
	}

	public void setAfterShowControlsChange(java.lang.String afterShowControlsChange) {
		getStateHelper().put(AFTER_SHOW_CONTROLS_CHANGE, afterShowControlsChange);
	}

	public java.lang.String getAfterSrcNodeChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_SRC_NODE_CHANGE, null);
	}

	public void setAfterSrcNodeChange(java.lang.String afterSrcNodeChange) {
		getStateHelper().put(AFTER_SRC_NODE_CHANGE, afterSrcNodeChange);
	}

	public java.lang.String getAfterStringsChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_STRINGS_CHANGE, null);
	}

	public void setAfterStringsChange(java.lang.String afterStringsChange) {
		getStateHelper().put(AFTER_STRINGS_CHANGE, afterStringsChange);
	}

	public java.lang.String getAfterTabIndexChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_TAB_INDEX_CHANGE, null);
	}

	public void setAfterTabIndexChange(java.lang.String afterTabIndexChange) {
		getStateHelper().put(AFTER_TAB_INDEX_CHANGE, afterTabIndexChange);
	}

	public java.lang.String getAfterTotalLinksChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_TOTAL_LINKS_CHANGE, null);
	}

	public void setAfterTotalLinksChange(java.lang.String afterTotalLinksChange) {
		getStateHelper().put(AFTER_TOTAL_LINKS_CHANGE, afterTotalLinksChange);
	}

	public java.lang.String getAfterVisibleChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_VISIBLE_CHANGE, null);
	}

	public void setAfterVisibleChange(java.lang.String afterVisibleChange) {
		getStateHelper().put(AFTER_VISIBLE_CHANGE, afterVisibleChange);
	}

	public java.lang.String getAfterWidthChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_WIDTH_CHANGE, null);
	}

	public void setAfterWidthChange(java.lang.String afterWidthChange) {
		getStateHelper().put(AFTER_WIDTH_CHANGE, afterWidthChange);
	}

	public java.lang.String getAfterXChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_XCHANGE, null);
	}

	public void setAfterXChange(java.lang.String afterXChange) {
		getStateHelper().put(AFTER_XCHANGE, afterXChange);
	}

	public java.lang.String getAfterXyChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_XY_CHANGE, null);
	}

	public void setAfterXyChange(java.lang.String afterXyChange) {
		getStateHelper().put(AFTER_XY_CHANGE, afterXyChange);
	}

	public java.lang.String getAfterYChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_YCHANGE, null);
	}

	public void setAfterYChange(java.lang.String afterYChange) {
		getStateHelper().put(AFTER_YCHANGE, afterYChange);
	}

	public java.lang.String getAfterZIndexChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_ZINDEX_CHANGE, null);
	}

	public void setAfterZIndexChange(java.lang.String afterZIndexChange) {
		getStateHelper().put(AFTER_ZINDEX_CHANGE, afterZIndexChange);
	}

	public java.lang.String getOnAlignChange() {
		return (java.lang.String) getStateHelper().eval(ON_ALIGN_CHANGE, null);
	}

	public void setOnAlignChange(java.lang.String onAlignChange) {
		getStateHelper().put(ON_ALIGN_CHANGE, onAlignChange);
	}

	public java.lang.String getOnAlignOnChange() {
		return (java.lang.String) getStateHelper().eval(ON_ALIGN_ON_CHANGE, null);
	}

	public void setOnAlignOnChange(java.lang.String onAlignOnChange) {
		getStateHelper().put(ON_ALIGN_ON_CHANGE, onAlignOnChange);
	}

	public java.lang.String getOnAnimChange() {
		return (java.lang.String) getStateHelper().eval(ON_ANIM_CHANGE, null);
	}

	public void setOnAnimChange(java.lang.String onAnimChange) {
		getStateHelper().put(ON_ANIM_CHANGE, onAnimChange);
	}

	public java.lang.String getOnBodyContentChange() {
		return (java.lang.String) getStateHelper().eval(ON_BODY_CONTENT_CHANGE, null);
	}

	public void setOnBodyContentChange(java.lang.String onBodyContentChange) {
		getStateHelper().put(ON_BODY_CONTENT_CHANGE, onBodyContentChange);
	}

	public java.lang.String getOnBoundingBoxChange() {
		return (java.lang.String) getStateHelper().eval(ON_BOUNDING_BOX_CHANGE, null);
	}

	public void setOnBoundingBoxChange(java.lang.String onBoundingBoxChange) {
		getStateHelper().put(ON_BOUNDING_BOX_CHANGE, onBoundingBoxChange);
	}

	public java.lang.String getOnCaptionChange() {
		return (java.lang.String) getStateHelper().eval(ON_CAPTION_CHANGE, null);
	}

	public void setOnCaptionChange(java.lang.String onCaptionChange) {
		getStateHelper().put(ON_CAPTION_CHANGE, onCaptionChange);
	}

	public java.lang.String getOnCaptionElChange() {
		return (java.lang.String) getStateHelper().eval(ON_CAPTION_EL_CHANGE, null);
	}

	public void setOnCaptionElChange(java.lang.String onCaptionElChange) {
		getStateHelper().put(ON_CAPTION_EL_CHANGE, onCaptionElChange);
	}

	public java.lang.String getOnCaptionFromTitleChange() {
		return (java.lang.String) getStateHelper().eval(ON_CAPTION_FROM_TITLE_CHANGE, null);
	}

	public void setOnCaptionFromTitleChange(java.lang.String onCaptionFromTitleChange) {
		getStateHelper().put(ON_CAPTION_FROM_TITLE_CHANGE, onCaptionFromTitleChange);
	}

	public java.lang.String getOnCenteredChange() {
		return (java.lang.String) getStateHelper().eval(ON_CENTERED_CHANGE, null);
	}

	public void setOnCenteredChange(java.lang.String onCenteredChange) {
		getStateHelper().put(ON_CENTERED_CHANGE, onCenteredChange);
	}

	public java.lang.String getOnCloseElChange() {
		return (java.lang.String) getStateHelper().eval(ON_CLOSE_EL_CHANGE, null);
	}

	public void setOnCloseElChange(java.lang.String onCloseElChange) {
		getStateHelper().put(ON_CLOSE_EL_CHANGE, onCloseElChange);
	}

	public java.lang.String getOnConstrainChange() {
		return (java.lang.String) getStateHelper().eval(ON_CONSTRAIN_CHANGE, null);
	}

	public void setOnConstrainChange(java.lang.String onConstrainChange) {
		getStateHelper().put(ON_CONSTRAIN_CHANGE, onConstrainChange);
	}

	public java.lang.String getOnContentBoxChange() {
		return (java.lang.String) getStateHelper().eval(ON_CONTENT_BOX_CHANGE, null);
	}

	public void setOnContentBoxChange(java.lang.String onContentBoxChange) {
		getStateHelper().put(ON_CONTENT_BOX_CHANGE, onContentBoxChange);
	}

	public java.lang.String getOnControlLeftElChange() {
		return (java.lang.String) getStateHelper().eval(ON_CONTROL_LEFT_EL_CHANGE, null);
	}

	public void setOnControlLeftElChange(java.lang.String onControlLeftElChange) {
		getStateHelper().put(ON_CONTROL_LEFT_EL_CHANGE, onControlLeftElChange);
	}

	public java.lang.String getOnControlRightElChange() {
		return (java.lang.String) getStateHelper().eval(ON_CONTROL_RIGHT_EL_CHANGE, null);
	}

	public void setOnControlRightElChange(java.lang.String onControlRightElChange) {
		getStateHelper().put(ON_CONTROL_RIGHT_EL_CHANGE, onControlRightElChange);
	}

	public java.lang.String getOnCurrentIndexChange() {
		return (java.lang.String) getStateHelper().eval(ON_CURRENT_INDEX_CHANGE, null);
	}

	public void setOnCurrentIndexChange(java.lang.String onCurrentIndexChange) {
		getStateHelper().put(ON_CURRENT_INDEX_CHANGE, onCurrentIndexChange);
	}

	public java.lang.String getOnDestroyedChange() {
		return (java.lang.String) getStateHelper().eval(ON_DESTROYED_CHANGE, null);
	}

	public void setOnDestroyedChange(java.lang.String onDestroyedChange) {
		getStateHelper().put(ON_DESTROYED_CHANGE, onDestroyedChange);
	}

	public java.lang.String getOnDisabledChange() {
		return (java.lang.String) getStateHelper().eval(ON_DISABLED_CHANGE, null);
	}

	public void setOnDisabledChange(java.lang.String onDisabledChange) {
		getStateHelper().put(ON_DISABLED_CHANGE, onDisabledChange);
	}

	public java.lang.String getOnFillHeightChange() {
		return (java.lang.String) getStateHelper().eval(ON_FILL_HEIGHT_CHANGE, null);
	}

	public void setOnFillHeightChange(java.lang.String onFillHeightChange) {
		getStateHelper().put(ON_FILL_HEIGHT_CHANGE, onFillHeightChange);
	}

	public java.lang.String getOnFocusOnChange() {
		return (java.lang.String) getStateHelper().eval(ON_FOCUS_ON_CHANGE, null);
	}

	public void setOnFocusOnChange(java.lang.String onFocusOnChange) {
		getStateHelper().put(ON_FOCUS_ON_CHANGE, onFocusOnChange);
	}

	public java.lang.String getOnFocusedChange() {
		return (java.lang.String) getStateHelper().eval(ON_FOCUSED_CHANGE, null);
	}

	public void setOnFocusedChange(java.lang.String onFocusedChange) {
		getStateHelper().put(ON_FOCUSED_CHANGE, onFocusedChange);
	}

	public java.lang.String getOnFooterContentChange() {
		return (java.lang.String) getStateHelper().eval(ON_FOOTER_CONTENT_CHANGE, null);
	}

	public void setOnFooterContentChange(java.lang.String onFooterContentChange) {
		getStateHelper().put(ON_FOOTER_CONTENT_CHANGE, onFooterContentChange);
	}

	public java.lang.String getOnHeaderContentChange() {
		return (java.lang.String) getStateHelper().eval(ON_HEADER_CONTENT_CHANGE, null);
	}

	public void setOnHeaderContentChange(java.lang.String onHeaderContentChange) {
		getStateHelper().put(ON_HEADER_CONTENT_CHANGE, onHeaderContentChange);
	}

	public java.lang.String getOnHeightChange() {
		return (java.lang.String) getStateHelper().eval(ON_HEIGHT_CHANGE, null);
	}

	public void setOnHeightChange(java.lang.String onHeightChange) {
		getStateHelper().put(ON_HEIGHT_CHANGE, onHeightChange);
	}

	public java.lang.String getOnIdChange() {
		return (java.lang.String) getStateHelper().eval(ON_ID_CHANGE, null);
	}

	public void setOnIdChange(java.lang.String onIdChange) {
		getStateHelper().put(ON_ID_CHANGE, onIdChange);
	}

	public java.lang.String getOnImageChange() {
		return (java.lang.String) getStateHelper().eval(ON_IMAGE_CHANGE, null);
	}

	public void setOnImageChange(java.lang.String onImageChange) {
		getStateHelper().put(ON_IMAGE_CHANGE, onImageChange);
	}

	public java.lang.String getOnImageAnimChange() {
		return (java.lang.String) getStateHelper().eval(ON_IMAGE_ANIM_CHANGE, null);
	}

	public void setOnImageAnimChange(java.lang.String onImageAnimChange) {
		getStateHelper().put(ON_IMAGE_ANIM_CHANGE, onImageAnimChange);
	}

	public java.lang.String getOnInfoElChange() {
		return (java.lang.String) getStateHelper().eval(ON_INFO_EL_CHANGE, null);
	}

	public void setOnInfoElChange(java.lang.String onInfoElChange) {
		getStateHelper().put(ON_INFO_EL_CHANGE, onInfoElChange);
	}

	public java.lang.String getOnInfoTemplateChange() {
		return (java.lang.String) getStateHelper().eval(ON_INFO_TEMPLATE_CHANGE, null);
	}

	public void setOnInfoTemplateChange(java.lang.String onInfoTemplateChange) {
		getStateHelper().put(ON_INFO_TEMPLATE_CHANGE, onInfoTemplateChange);
	}

	public java.lang.String getOnInitializedChange() {
		return (java.lang.String) getStateHelper().eval(ON_INITIALIZED_CHANGE, null);
	}

	public void setOnInitializedChange(java.lang.String onInitializedChange) {
		getStateHelper().put(ON_INITIALIZED_CHANGE, onInitializedChange);
	}

	public java.lang.String getOnLinksChange() {
		return (java.lang.String) getStateHelper().eval(ON_LINKS_CHANGE, null);
	}

	public void setOnLinksChange(java.lang.String onLinksChange) {
		getStateHelper().put(ON_LINKS_CHANGE, onLinksChange);
	}

	public java.lang.String getOnLoaderChange() {
		return (java.lang.String) getStateHelper().eval(ON_LOADER_CHANGE, null);
	}

	public void setOnLoaderChange(java.lang.String onLoaderChange) {
		getStateHelper().put(ON_LOADER_CHANGE, onLoaderChange);
	}

	public java.lang.String getOnLoadingChange() {
		return (java.lang.String) getStateHelper().eval(ON_LOADING_CHANGE, null);
	}

	public void setOnLoadingChange(java.lang.String onLoadingChange) {
		getStateHelper().put(ON_LOADING_CHANGE, onLoadingChange);
	}

	public java.lang.String getOnLoadingElChange() {
		return (java.lang.String) getStateHelper().eval(ON_LOADING_EL_CHANGE, null);
	}

	public void setOnLoadingElChange(java.lang.String onLoadingElChange) {
		getStateHelper().put(ON_LOADING_EL_CHANGE, onLoadingElChange);
	}

	public java.lang.String getOnLocaleChange() {
		return (java.lang.String) getStateHelper().eval(ON_LOCALE_CHANGE, null);
	}

	public void setOnLocaleChange(java.lang.String onLocaleChange) {
		getStateHelper().put(ON_LOCALE_CHANGE, onLocaleChange);
	}

	public java.lang.String getOnMaskNodeChange() {
		return (java.lang.String) getStateHelper().eval(ON_MASK_NODE_CHANGE, null);
	}

	public void setOnMaskNodeChange(java.lang.String onMaskNodeChange) {
		getStateHelper().put(ON_MASK_NODE_CHANGE, onMaskNodeChange);
	}

	public java.lang.String getOnMaxHeightChange() {
		return (java.lang.String) getStateHelper().eval(ON_MAX_HEIGHT_CHANGE, null);
	}

	public void setOnMaxHeightChange(java.lang.String onMaxHeightChange) {
		getStateHelper().put(ON_MAX_HEIGHT_CHANGE, onMaxHeightChange);
	}

	public java.lang.String getOnMaxWidthChange() {
		return (java.lang.String) getStateHelper().eval(ON_MAX_WIDTH_CHANGE, null);
	}

	public void setOnMaxWidthChange(java.lang.String onMaxWidthChange) {
		getStateHelper().put(ON_MAX_WIDTH_CHANGE, onMaxWidthChange);
	}

	public java.lang.String getOnModalChange() {
		return (java.lang.String) getStateHelper().eval(ON_MODAL_CHANGE, null);
	}

	public void setOnModalChange(java.lang.String onModalChange) {
		getStateHelper().put(ON_MODAL_CHANGE, onModalChange);
	}

	public java.lang.String getOnPreloadAllImagesChange() {
		return (java.lang.String) getStateHelper().eval(ON_PRELOAD_ALL_IMAGES_CHANGE, null);
	}

	public void setOnPreloadAllImagesChange(java.lang.String onPreloadAllImagesChange) {
		getStateHelper().put(ON_PRELOAD_ALL_IMAGES_CHANGE, onPreloadAllImagesChange);
	}

	public java.lang.String getOnPreventOverlapChange() {
		return (java.lang.String) getStateHelper().eval(ON_PREVENT_OVERLAP_CHANGE, null);
	}

	public void setOnPreventOverlapChange(java.lang.String onPreventOverlapChange) {
		getStateHelper().put(ON_PREVENT_OVERLAP_CHANGE, onPreventOverlapChange);
	}

	public java.lang.String getOnRenderChange() {
		return (java.lang.String) getStateHelper().eval(ON_RENDER_CHANGE, null);
	}

	public void setOnRenderChange(java.lang.String onRenderChange) {
		getStateHelper().put(ON_RENDER_CHANGE, onRenderChange);
	}

	public java.lang.String getOnRenderedChange() {
		return (java.lang.String) getStateHelper().eval(ON_RENDERED_CHANGE, null);
	}

	public void setOnRenderedChange(java.lang.String onRenderedChange) {
		getStateHelper().put(ON_RENDERED_CHANGE, onRenderedChange);
	}

	public java.lang.String getOnShimChange() {
		return (java.lang.String) getStateHelper().eval(ON_SHIM_CHANGE, null);
	}

	public void setOnShimChange(java.lang.String onShimChange) {
		getStateHelper().put(ON_SHIM_CHANGE, onShimChange);
	}

	public java.lang.String getOnShowCloseChange() {
		return (java.lang.String) getStateHelper().eval(ON_SHOW_CLOSE_CHANGE, null);
	}

	public void setOnShowCloseChange(java.lang.String onShowCloseChange) {
		getStateHelper().put(ON_SHOW_CLOSE_CHANGE, onShowCloseChange);
	}

	public java.lang.String getOnShowControlsChange() {
		return (java.lang.String) getStateHelper().eval(ON_SHOW_CONTROLS_CHANGE, null);
	}

	public void setOnShowControlsChange(java.lang.String onShowControlsChange) {
		getStateHelper().put(ON_SHOW_CONTROLS_CHANGE, onShowControlsChange);
	}

	public java.lang.String getOnSrcNodeChange() {
		return (java.lang.String) getStateHelper().eval(ON_SRC_NODE_CHANGE, null);
	}

	public void setOnSrcNodeChange(java.lang.String onSrcNodeChange) {
		getStateHelper().put(ON_SRC_NODE_CHANGE, onSrcNodeChange);
	}

	public java.lang.String getOnStringsChange() {
		return (java.lang.String) getStateHelper().eval(ON_STRINGS_CHANGE, null);
	}

	public void setOnStringsChange(java.lang.String onStringsChange) {
		getStateHelper().put(ON_STRINGS_CHANGE, onStringsChange);
	}

	public java.lang.String getOnTabIndexChange() {
		return (java.lang.String) getStateHelper().eval(ON_TAB_INDEX_CHANGE, null);
	}

	public void setOnTabIndexChange(java.lang.String onTabIndexChange) {
		getStateHelper().put(ON_TAB_INDEX_CHANGE, onTabIndexChange);
	}

	public java.lang.String getOnTotalLinksChange() {
		return (java.lang.String) getStateHelper().eval(ON_TOTAL_LINKS_CHANGE, null);
	}

	public void setOnTotalLinksChange(java.lang.String onTotalLinksChange) {
		getStateHelper().put(ON_TOTAL_LINKS_CHANGE, onTotalLinksChange);
	}

	public java.lang.String getOnVisibleChange() {
		return (java.lang.String) getStateHelper().eval(ON_VISIBLE_CHANGE, null);
	}

	public void setOnVisibleChange(java.lang.String onVisibleChange) {
		getStateHelper().put(ON_VISIBLE_CHANGE, onVisibleChange);
	}

	public java.lang.String getOnWidthChange() {
		return (java.lang.String) getStateHelper().eval(ON_WIDTH_CHANGE, null);
	}

	public void setOnWidthChange(java.lang.String onWidthChange) {
		getStateHelper().put(ON_WIDTH_CHANGE, onWidthChange);
	}

	public java.lang.String getOnXChange() {
		return (java.lang.String) getStateHelper().eval(ON_XCHANGE, null);
	}

	public void setOnXChange(java.lang.String onXChange) {
		getStateHelper().put(ON_XCHANGE, onXChange);
	}

	public java.lang.String getOnXyChange() {
		return (java.lang.String) getStateHelper().eval(ON_XY_CHANGE, null);
	}

	public void setOnXyChange(java.lang.String onXyChange) {
		getStateHelper().put(ON_XY_CHANGE, onXyChange);
	}

	public java.lang.String getOnYChange() {
		return (java.lang.String) getStateHelper().eval(ON_YCHANGE, null);
	}

	public void setOnYChange(java.lang.String onYChange) {
		getStateHelper().put(ON_YCHANGE, onYChange);
	}

	public java.lang.String getOnZIndexChange() {
		return (java.lang.String) getStateHelper().eval(ON_ZINDEX_CHANGE, null);
	}

	public void setOnZIndexChange(java.lang.String onZIndexChange) {
		getStateHelper().put(ON_ZINDEX_CHANGE, onZIndexChange);
	}

}
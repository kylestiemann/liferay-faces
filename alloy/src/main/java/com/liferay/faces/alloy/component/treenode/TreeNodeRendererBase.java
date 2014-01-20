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
package com.liferay.faces.alloy.component.treenode;

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
public abstract class TreeNodeRendererBase extends RendererBase {

	// Private Constants
	private static final String AUI_MODULE_NAME = "aui-tree-node";

	protected void encodeJavaScriptMain(FacesContext facesContext, UIComponent uiComponent) throws IOException {

		TreeNode treeNode = (TreeNode) uiComponent;

		ResponseWriter responseWriter = facesContext.getResponseWriter();

		responseWriter.write("var treeNode = new A.TreeNode");
		responseWriter.write(StringPool.OPEN_PARENTHESIS);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedAttributes = new ArrayList<String>();

		renderAlwaysShowHitArea(renderedAttributes, treeNode);
		renderBoundingBox(renderedAttributes, treeNode);
		renderTreeNodeChildren(renderedAttributes, treeNode);
		renderContainer(renderedAttributes, treeNode);
		renderContentBox(renderedAttributes, treeNode);
		renderCssClasses(renderedAttributes, treeNode);
		renderDestroyed(renderedAttributes, treeNode);
		renderDraggable(renderedAttributes, treeNode);
		renderExpanded(renderedAttributes, treeNode);
		renderHitAreaEl(renderedAttributes, treeNode);
		renderIconEl(renderedAttributes, treeNode);
		renderTreeNodeId(renderedAttributes, treeNode);
		renderIndex(renderedAttributes, treeNode);
		renderInitialized(renderedAttributes, treeNode);
		renderLabel(renderedAttributes, treeNode);
		renderLabelEl(renderedAttributes, treeNode);
		renderLeaf(renderedAttributes, treeNode);
		renderNextSibling(renderedAttributes, treeNode);
		renderOwnerTree(renderedAttributes, treeNode);
		renderParentNode(renderedAttributes, treeNode);
		renderPrevSibling(renderedAttributes, treeNode);
		renderRendered(renderedAttributes, treeNode);
		renderTabIndex(renderedAttributes, treeNode);

		for (String renderedAttribute : renderedAttributes) {
			responseWriter.write(renderedAttribute);
			responseWriter.write(StringPool.COMMA);
		}

		responseWriter.write("after");
		responseWriter.write(StringPool.COLON);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedAfterEvents = new ArrayList<String>();

		renderAfterAlwaysShowHitAreaChange(renderedAfterEvents, treeNode);
		renderAfterBoundingBoxChange(renderedAfterEvents, treeNode);
		renderAfterChildrenChange(renderedAfterEvents, treeNode);
		renderAfterContainerChange(renderedAfterEvents, treeNode);
		renderAfterContentBoxChange(renderedAfterEvents, treeNode);
		renderAfterCssClassesChange(renderedAfterEvents, treeNode);
		renderAfterDestroyedChange(renderedAfterEvents, treeNode);
		renderAfterDraggableChange(renderedAfterEvents, treeNode);
		renderAfterExpandedChange(renderedAfterEvents, treeNode);
		renderAfterHitAreaElChange(renderedAfterEvents, treeNode);
		renderAfterIconElChange(renderedAfterEvents, treeNode);
		renderAfterIdChange(renderedAfterEvents, treeNode);
		renderAfterIndexChange(renderedAfterEvents, treeNode);
		renderAfterInitializedChange(renderedAfterEvents, treeNode);
		renderAfterLabelChange(renderedAfterEvents, treeNode);
		renderAfterLabelElChange(renderedAfterEvents, treeNode);
		renderAfterLeafChange(renderedAfterEvents, treeNode);
		renderAfterNextSiblingChange(renderedAfterEvents, treeNode);
		renderAfterOwnerTreeChange(renderedAfterEvents, treeNode);
		renderAfterParentNodeChange(renderedAfterEvents, treeNode);
		renderAfterPrevSiblingChange(renderedAfterEvents, treeNode);
		renderAfterRenderedChange(renderedAfterEvents, treeNode);
		renderAfterTabIndexChange(renderedAfterEvents, treeNode);

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

		renderOnAlwaysShowHitAreaChange(renderedOnEvents, treeNode);
		renderOnBoundingBoxChange(renderedOnEvents, treeNode);
		renderOnChildrenChange(renderedOnEvents, treeNode);
		renderOnContainerChange(renderedOnEvents, treeNode);
		renderOnContentBoxChange(renderedOnEvents, treeNode);
		renderOnCssClassesChange(renderedOnEvents, treeNode);
		renderOnDestroyedChange(renderedOnEvents, treeNode);
		renderOnDraggableChange(renderedOnEvents, treeNode);
		renderOnExpandedChange(renderedOnEvents, treeNode);
		renderOnHitAreaElChange(renderedOnEvents, treeNode);
		renderOnIconElChange(renderedOnEvents, treeNode);
		renderOnIdChange(renderedOnEvents, treeNode);
		renderOnIndexChange(renderedOnEvents, treeNode);
		renderOnInitializedChange(renderedOnEvents, treeNode);
		renderOnLabelChange(renderedOnEvents, treeNode);
		renderOnLabelElChange(renderedOnEvents, treeNode);
		renderOnLeafChange(renderedOnEvents, treeNode);
		renderOnNextSiblingChange(renderedOnEvents, treeNode);
		renderOnOwnerTreeChange(renderedOnEvents, treeNode);
		renderOnParentNodeChange(renderedOnEvents, treeNode);
		renderOnPrevSiblingChange(renderedOnEvents, treeNode);
		renderOnRenderedChange(renderedOnEvents, treeNode);
		renderOnTabIndexChange(renderedOnEvents, treeNode);

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

	protected void renderAlwaysShowHitArea(List<String> renderedAttributes, TreeNode treeNode) throws IOException {
		java.lang.Boolean alwaysShowHitArea = treeNode.getAlwaysShowHitArea();

		if (alwaysShowHitArea != null) {
			renderedAttributes.add(renderBoolean(TreeNode.ALWAYS_SHOW_HIT_AREA, alwaysShowHitArea));
		}
	}

	protected void renderBoundingBox(List<String> renderedAttributes, TreeNode treeNode) throws IOException {
		java.lang.String boundingBox = treeNode.getBoundingBox();

		if (boundingBox != null) {
			renderedAttributes.add(renderString(TreeNode.BOUNDING_BOX, boundingBox));
		}
	}

	protected void renderTreeNodeChildren(List<String> renderedAttributes, TreeNode treeNode) throws IOException {
		java.lang.Object treeNodeChildren = treeNode.getTreeNodeChildren();

		if (treeNodeChildren != null) {
			renderedAttributes.add(renderArray(TreeNode.TREE_NODE_CHILDREN, treeNodeChildren));
		}
	}

	protected void renderContainer(List<String> renderedAttributes, TreeNode treeNode) throws IOException {
		java.lang.String container = treeNode.getContainer();

		if (container != null) {
			renderedAttributes.add(renderString(TreeNode.CONTAINER, container));
		}
	}

	protected void renderContentBox(List<String> renderedAttributes, TreeNode treeNode) throws IOException {
		java.lang.String contentBox = treeNode.getContentBox();

		if (contentBox != null) {
			renderedAttributes.add(renderString(TreeNode.CONTENT_BOX, contentBox));
		}
	}

	protected void renderCssClasses(List<String> renderedAttributes, TreeNode treeNode) throws IOException {
		java.lang.Object cssClasses = treeNode.getCssClasses();

		if (cssClasses != null) {
			renderedAttributes.add(renderObject(TreeNode.CSS_CLASSES, cssClasses));
		}
	}

	protected void renderDestroyed(List<String> renderedAttributes, TreeNode treeNode) throws IOException {
		java.lang.Boolean destroyed = treeNode.getDestroyed();

		if (destroyed != null) {
			renderedAttributes.add(renderBoolean(TreeNode.DESTROYED, destroyed));
		}
	}

	protected void renderDraggable(List<String> renderedAttributes, TreeNode treeNode) throws IOException {
		java.lang.Boolean draggable = treeNode.getDraggable();

		if (draggable != null) {
			renderedAttributes.add(renderBoolean(TreeNode.DRAGGABLE, draggable));
		}
	}

	protected void renderExpanded(List<String> renderedAttributes, TreeNode treeNode) throws IOException {
		java.lang.Boolean expanded = treeNode.getExpanded();

		if (expanded != null) {
			renderedAttributes.add(renderBoolean(TreeNode.EXPANDED, expanded));
		}
	}

	protected void renderHitAreaEl(List<String> renderedAttributes, TreeNode treeNode) throws IOException {
		java.lang.String hitAreaEl = treeNode.getHitAreaEl();

		if (hitAreaEl != null) {
			renderedAttributes.add(renderString(TreeNode.HIT_AREA_EL, hitAreaEl));
		}
	}

	protected void renderIconEl(List<String> renderedAttributes, TreeNode treeNode) throws IOException {
		java.lang.String iconEl = treeNode.getIconEl();

		if (iconEl != null) {
			renderedAttributes.add(renderString(TreeNode.ICON_EL, iconEl));
		}
	}

	protected void renderTreeNodeId(List<String> renderedAttributes, TreeNode treeNode) throws IOException {
		java.lang.String treeNodeId = treeNode.getTreeNodeId();

		if (treeNodeId != null) {
			renderedAttributes.add(renderString(TreeNode.TREE_NODE_ID, treeNodeId));
		}
	}

	protected void renderIndex(List<String> renderedAttributes, TreeNode treeNode) throws IOException {
		java.lang.Object index = treeNode.getIndex();

		if (index != null) {
			renderedAttributes.add(renderObject(TreeNode.INDEX, index));
		}
	}

	protected void renderInitialized(List<String> renderedAttributes, TreeNode treeNode) throws IOException {
		java.lang.Boolean initialized = treeNode.getInitialized();

		if (initialized != null) {
			renderedAttributes.add(renderBoolean(TreeNode.INITIALIZED, initialized));
		}
	}

	protected void renderLabel(List<String> renderedAttributes, TreeNode treeNode) throws IOException {
		java.lang.String label = treeNode.getLabel();

		if (label != null) {
			renderedAttributes.add(renderString(TreeNode.LABEL, label));
		}
	}

	protected void renderLabelEl(List<String> renderedAttributes, TreeNode treeNode) throws IOException {
		java.lang.String labelEl = treeNode.getLabelEl();

		if (labelEl != null) {
			renderedAttributes.add(renderString(TreeNode.LABEL_EL, labelEl));
		}
	}

	protected void renderLeaf(List<String> renderedAttributes, TreeNode treeNode) throws IOException {
		java.lang.Boolean leaf = treeNode.getLeaf();

		if (leaf != null) {
			renderedAttributes.add(renderBoolean(TreeNode.LEAF, leaf));
		}
	}

	protected void renderNextSibling(List<String> renderedAttributes, TreeNode treeNode) throws IOException {
		java.lang.Object nextSibling = treeNode.getNextSibling();

		if (nextSibling != null) {
			renderedAttributes.add(renderString(TreeNode.NEXT_SIBLING, nextSibling));
		}
	}

	protected void renderOwnerTree(List<String> renderedAttributes, TreeNode treeNode) throws IOException {
		java.lang.Object ownerTree = treeNode.getOwnerTree();

		if (ownerTree != null) {
			renderedAttributes.add(renderString(TreeNode.OWNER_TREE, ownerTree));
		}
	}

	protected void renderParentNode(List<String> renderedAttributes, TreeNode treeNode) throws IOException {
		java.lang.Object parentNode = treeNode.getParentNode();

		if (parentNode != null) {
			renderedAttributes.add(renderString(TreeNode.PARENT_NODE, parentNode));
		}
	}

	protected void renderPrevSibling(List<String> renderedAttributes, TreeNode treeNode) throws IOException {
		java.lang.Object prevSibling = treeNode.getPrevSibling();

		if (prevSibling != null) {
			renderedAttributes.add(renderString(TreeNode.PREV_SIBLING, prevSibling));
		}
	}

	protected void renderRendered(List<String> renderedAttributes, TreeNode treeNode) throws IOException {
		java.lang.Boolean rendered = treeNode.getRendered();

		if (rendered != null) {
			renderedAttributes.add(renderBoolean(TreeNode.RENDERED, rendered));
		}
	}

	protected void renderTabIndex(List<String> renderedAttributes, TreeNode treeNode) throws IOException {
		java.lang.String tabIndex = treeNode.getTabIndex();

		if (tabIndex != null) {
			renderedAttributes.add(renderString(TreeNode.TAB_INDEX, tabIndex));
		}
	}

	protected void renderAfterAlwaysShowHitAreaChange(List<String> renderedAttributes, TreeNode treeNode) throws IOException {
		java.lang.String afterAlwaysShowHitAreaChange = treeNode.getAfterAlwaysShowHitAreaChange();

		if (afterAlwaysShowHitAreaChange != null) {
			renderedAttributes.add(renderString(TreeNode.AFTER_ALWAYS_SHOW_HIT_AREA_CHANGE, afterAlwaysShowHitAreaChange));
		}
	}

	protected void renderAfterBoundingBoxChange(List<String> renderedAttributes, TreeNode treeNode) throws IOException {
		java.lang.String afterBoundingBoxChange = treeNode.getAfterBoundingBoxChange();

		if (afterBoundingBoxChange != null) {
			renderedAttributes.add(renderString(TreeNode.AFTER_BOUNDING_BOX_CHANGE, afterBoundingBoxChange));
		}
	}

	protected void renderAfterChildrenChange(List<String> renderedAttributes, TreeNode treeNode) throws IOException {
		java.lang.String afterChildrenChange = treeNode.getAfterChildrenChange();

		if (afterChildrenChange != null) {
			renderedAttributes.add(renderString(TreeNode.AFTER_CHILDREN_CHANGE, afterChildrenChange));
		}
	}

	protected void renderAfterContainerChange(List<String> renderedAttributes, TreeNode treeNode) throws IOException {
		java.lang.String afterContainerChange = treeNode.getAfterContainerChange();

		if (afterContainerChange != null) {
			renderedAttributes.add(renderString(TreeNode.AFTER_CONTAINER_CHANGE, afterContainerChange));
		}
	}

	protected void renderAfterContentBoxChange(List<String> renderedAttributes, TreeNode treeNode) throws IOException {
		java.lang.String afterContentBoxChange = treeNode.getAfterContentBoxChange();

		if (afterContentBoxChange != null) {
			renderedAttributes.add(renderString(TreeNode.AFTER_CONTENT_BOX_CHANGE, afterContentBoxChange));
		}
	}

	protected void renderAfterCssClassesChange(List<String> renderedAttributes, TreeNode treeNode) throws IOException {
		java.lang.String afterCssClassesChange = treeNode.getAfterCssClassesChange();

		if (afterCssClassesChange != null) {
			renderedAttributes.add(renderString(TreeNode.AFTER_CSS_CLASSES_CHANGE, afterCssClassesChange));
		}
	}

	protected void renderAfterDestroyedChange(List<String> renderedAttributes, TreeNode treeNode) throws IOException {
		java.lang.String afterDestroyedChange = treeNode.getAfterDestroyedChange();

		if (afterDestroyedChange != null) {
			renderedAttributes.add(renderString(TreeNode.AFTER_DESTROYED_CHANGE, afterDestroyedChange));
		}
	}

	protected void renderAfterDraggableChange(List<String> renderedAttributes, TreeNode treeNode) throws IOException {
		java.lang.String afterDraggableChange = treeNode.getAfterDraggableChange();

		if (afterDraggableChange != null) {
			renderedAttributes.add(renderString(TreeNode.AFTER_DRAGGABLE_CHANGE, afterDraggableChange));
		}
	}

	protected void renderAfterExpandedChange(List<String> renderedAttributes, TreeNode treeNode) throws IOException {
		java.lang.String afterExpandedChange = treeNode.getAfterExpandedChange();

		if (afterExpandedChange != null) {
			renderedAttributes.add(renderString(TreeNode.AFTER_EXPANDED_CHANGE, afterExpandedChange));
		}
	}

	protected void renderAfterHitAreaElChange(List<String> renderedAttributes, TreeNode treeNode) throws IOException {
		java.lang.String afterHitAreaElChange = treeNode.getAfterHitAreaElChange();

		if (afterHitAreaElChange != null) {
			renderedAttributes.add(renderString(TreeNode.AFTER_HIT_AREA_EL_CHANGE, afterHitAreaElChange));
		}
	}

	protected void renderAfterIconElChange(List<String> renderedAttributes, TreeNode treeNode) throws IOException {
		java.lang.String afterIconElChange = treeNode.getAfterIconElChange();

		if (afterIconElChange != null) {
			renderedAttributes.add(renderString(TreeNode.AFTER_ICON_EL_CHANGE, afterIconElChange));
		}
	}

	protected void renderAfterIdChange(List<String> renderedAttributes, TreeNode treeNode) throws IOException {
		java.lang.String afterIdChange = treeNode.getAfterIdChange();

		if (afterIdChange != null) {
			renderedAttributes.add(renderString(TreeNode.AFTER_ID_CHANGE, afterIdChange));
		}
	}

	protected void renderAfterIndexChange(List<String> renderedAttributes, TreeNode treeNode) throws IOException {
		java.lang.String afterIndexChange = treeNode.getAfterIndexChange();

		if (afterIndexChange != null) {
			renderedAttributes.add(renderString(TreeNode.AFTER_INDEX_CHANGE, afterIndexChange));
		}
	}

	protected void renderAfterInitializedChange(List<String> renderedAttributes, TreeNode treeNode) throws IOException {
		java.lang.String afterInitializedChange = treeNode.getAfterInitializedChange();

		if (afterInitializedChange != null) {
			renderedAttributes.add(renderString(TreeNode.AFTER_INITIALIZED_CHANGE, afterInitializedChange));
		}
	}

	protected void renderAfterLabelChange(List<String> renderedAttributes, TreeNode treeNode) throws IOException {
		java.lang.String afterLabelChange = treeNode.getAfterLabelChange();

		if (afterLabelChange != null) {
			renderedAttributes.add(renderString(TreeNode.AFTER_LABEL_CHANGE, afterLabelChange));
		}
	}

	protected void renderAfterLabelElChange(List<String> renderedAttributes, TreeNode treeNode) throws IOException {
		java.lang.String afterLabelElChange = treeNode.getAfterLabelElChange();

		if (afterLabelElChange != null) {
			renderedAttributes.add(renderString(TreeNode.AFTER_LABEL_EL_CHANGE, afterLabelElChange));
		}
	}

	protected void renderAfterLeafChange(List<String> renderedAttributes, TreeNode treeNode) throws IOException {
		java.lang.String afterLeafChange = treeNode.getAfterLeafChange();

		if (afterLeafChange != null) {
			renderedAttributes.add(renderString(TreeNode.AFTER_LEAF_CHANGE, afterLeafChange));
		}
	}

	protected void renderAfterNextSiblingChange(List<String> renderedAttributes, TreeNode treeNode) throws IOException {
		java.lang.String afterNextSiblingChange = treeNode.getAfterNextSiblingChange();

		if (afterNextSiblingChange != null) {
			renderedAttributes.add(renderString(TreeNode.AFTER_NEXT_SIBLING_CHANGE, afterNextSiblingChange));
		}
	}

	protected void renderAfterOwnerTreeChange(List<String> renderedAttributes, TreeNode treeNode) throws IOException {
		java.lang.String afterOwnerTreeChange = treeNode.getAfterOwnerTreeChange();

		if (afterOwnerTreeChange != null) {
			renderedAttributes.add(renderString(TreeNode.AFTER_OWNER_TREE_CHANGE, afterOwnerTreeChange));
		}
	}

	protected void renderAfterParentNodeChange(List<String> renderedAttributes, TreeNode treeNode) throws IOException {
		java.lang.String afterParentNodeChange = treeNode.getAfterParentNodeChange();

		if (afterParentNodeChange != null) {
			renderedAttributes.add(renderString(TreeNode.AFTER_PARENT_NODE_CHANGE, afterParentNodeChange));
		}
	}

	protected void renderAfterPrevSiblingChange(List<String> renderedAttributes, TreeNode treeNode) throws IOException {
		java.lang.String afterPrevSiblingChange = treeNode.getAfterPrevSiblingChange();

		if (afterPrevSiblingChange != null) {
			renderedAttributes.add(renderString(TreeNode.AFTER_PREV_SIBLING_CHANGE, afterPrevSiblingChange));
		}
	}

	protected void renderAfterRenderedChange(List<String> renderedAttributes, TreeNode treeNode) throws IOException {
		java.lang.String afterRenderedChange = treeNode.getAfterRenderedChange();

		if (afterRenderedChange != null) {
			renderedAttributes.add(renderString(TreeNode.AFTER_RENDERED_CHANGE, afterRenderedChange));
		}
	}

	protected void renderAfterTabIndexChange(List<String> renderedAttributes, TreeNode treeNode) throws IOException {
		java.lang.String afterTabIndexChange = treeNode.getAfterTabIndexChange();

		if (afterTabIndexChange != null) {
			renderedAttributes.add(renderString(TreeNode.AFTER_TAB_INDEX_CHANGE, afterTabIndexChange));
		}
	}

	protected void renderOnAlwaysShowHitAreaChange(List<String> renderedAttributes, TreeNode treeNode) throws IOException {
		java.lang.String onAlwaysShowHitAreaChange = treeNode.getOnAlwaysShowHitAreaChange();

		if (onAlwaysShowHitAreaChange != null) {
			renderedAttributes.add(renderString(TreeNode.ON_ALWAYS_SHOW_HIT_AREA_CHANGE, onAlwaysShowHitAreaChange));
		}
	}

	protected void renderOnBoundingBoxChange(List<String> renderedAttributes, TreeNode treeNode) throws IOException {
		java.lang.String onBoundingBoxChange = treeNode.getOnBoundingBoxChange();

		if (onBoundingBoxChange != null) {
			renderedAttributes.add(renderString(TreeNode.ON_BOUNDING_BOX_CHANGE, onBoundingBoxChange));
		}
	}

	protected void renderOnChildrenChange(List<String> renderedAttributes, TreeNode treeNode) throws IOException {
		java.lang.String onChildrenChange = treeNode.getOnChildrenChange();

		if (onChildrenChange != null) {
			renderedAttributes.add(renderString(TreeNode.ON_CHILDREN_CHANGE, onChildrenChange));
		}
	}

	protected void renderOnContainerChange(List<String> renderedAttributes, TreeNode treeNode) throws IOException {
		java.lang.String onContainerChange = treeNode.getOnContainerChange();

		if (onContainerChange != null) {
			renderedAttributes.add(renderString(TreeNode.ON_CONTAINER_CHANGE, onContainerChange));
		}
	}

	protected void renderOnContentBoxChange(List<String> renderedAttributes, TreeNode treeNode) throws IOException {
		java.lang.String onContentBoxChange = treeNode.getOnContentBoxChange();

		if (onContentBoxChange != null) {
			renderedAttributes.add(renderString(TreeNode.ON_CONTENT_BOX_CHANGE, onContentBoxChange));
		}
	}

	protected void renderOnCssClassesChange(List<String> renderedAttributes, TreeNode treeNode) throws IOException {
		java.lang.String onCssClassesChange = treeNode.getOnCssClassesChange();

		if (onCssClassesChange != null) {
			renderedAttributes.add(renderString(TreeNode.ON_CSS_CLASSES_CHANGE, onCssClassesChange));
		}
	}

	protected void renderOnDestroyedChange(List<String> renderedAttributes, TreeNode treeNode) throws IOException {
		java.lang.String onDestroyedChange = treeNode.getOnDestroyedChange();

		if (onDestroyedChange != null) {
			renderedAttributes.add(renderString(TreeNode.ON_DESTROYED_CHANGE, onDestroyedChange));
		}
	}

	protected void renderOnDraggableChange(List<String> renderedAttributes, TreeNode treeNode) throws IOException {
		java.lang.String onDraggableChange = treeNode.getOnDraggableChange();

		if (onDraggableChange != null) {
			renderedAttributes.add(renderString(TreeNode.ON_DRAGGABLE_CHANGE, onDraggableChange));
		}
	}

	protected void renderOnExpandedChange(List<String> renderedAttributes, TreeNode treeNode) throws IOException {
		java.lang.String onExpandedChange = treeNode.getOnExpandedChange();

		if (onExpandedChange != null) {
			renderedAttributes.add(renderString(TreeNode.ON_EXPANDED_CHANGE, onExpandedChange));
		}
	}

	protected void renderOnHitAreaElChange(List<String> renderedAttributes, TreeNode treeNode) throws IOException {
		java.lang.String onHitAreaElChange = treeNode.getOnHitAreaElChange();

		if (onHitAreaElChange != null) {
			renderedAttributes.add(renderString(TreeNode.ON_HIT_AREA_EL_CHANGE, onHitAreaElChange));
		}
	}

	protected void renderOnIconElChange(List<String> renderedAttributes, TreeNode treeNode) throws IOException {
		java.lang.String onIconElChange = treeNode.getOnIconElChange();

		if (onIconElChange != null) {
			renderedAttributes.add(renderString(TreeNode.ON_ICON_EL_CHANGE, onIconElChange));
		}
	}

	protected void renderOnIdChange(List<String> renderedAttributes, TreeNode treeNode) throws IOException {
		java.lang.String onIdChange = treeNode.getOnIdChange();

		if (onIdChange != null) {
			renderedAttributes.add(renderString(TreeNode.ON_ID_CHANGE, onIdChange));
		}
	}

	protected void renderOnIndexChange(List<String> renderedAttributes, TreeNode treeNode) throws IOException {
		java.lang.String onIndexChange = treeNode.getOnIndexChange();

		if (onIndexChange != null) {
			renderedAttributes.add(renderString(TreeNode.ON_INDEX_CHANGE, onIndexChange));
		}
	}

	protected void renderOnInitializedChange(List<String> renderedAttributes, TreeNode treeNode) throws IOException {
		java.lang.String onInitializedChange = treeNode.getOnInitializedChange();

		if (onInitializedChange != null) {
			renderedAttributes.add(renderString(TreeNode.ON_INITIALIZED_CHANGE, onInitializedChange));
		}
	}

	protected void renderOnLabelChange(List<String> renderedAttributes, TreeNode treeNode) throws IOException {
		java.lang.String onLabelChange = treeNode.getOnLabelChange();

		if (onLabelChange != null) {
			renderedAttributes.add(renderString(TreeNode.ON_LABEL_CHANGE, onLabelChange));
		}
	}

	protected void renderOnLabelElChange(List<String> renderedAttributes, TreeNode treeNode) throws IOException {
		java.lang.String onLabelElChange = treeNode.getOnLabelElChange();

		if (onLabelElChange != null) {
			renderedAttributes.add(renderString(TreeNode.ON_LABEL_EL_CHANGE, onLabelElChange));
		}
	}

	protected void renderOnLeafChange(List<String> renderedAttributes, TreeNode treeNode) throws IOException {
		java.lang.String onLeafChange = treeNode.getOnLeafChange();

		if (onLeafChange != null) {
			renderedAttributes.add(renderString(TreeNode.ON_LEAF_CHANGE, onLeafChange));
		}
	}

	protected void renderOnNextSiblingChange(List<String> renderedAttributes, TreeNode treeNode) throws IOException {
		java.lang.String onNextSiblingChange = treeNode.getOnNextSiblingChange();

		if (onNextSiblingChange != null) {
			renderedAttributes.add(renderString(TreeNode.ON_NEXT_SIBLING_CHANGE, onNextSiblingChange));
		}
	}

	protected void renderOnOwnerTreeChange(List<String> renderedAttributes, TreeNode treeNode) throws IOException {
		java.lang.String onOwnerTreeChange = treeNode.getOnOwnerTreeChange();

		if (onOwnerTreeChange != null) {
			renderedAttributes.add(renderString(TreeNode.ON_OWNER_TREE_CHANGE, onOwnerTreeChange));
		}
	}

	protected void renderOnParentNodeChange(List<String> renderedAttributes, TreeNode treeNode) throws IOException {
		java.lang.String onParentNodeChange = treeNode.getOnParentNodeChange();

		if (onParentNodeChange != null) {
			renderedAttributes.add(renderString(TreeNode.ON_PARENT_NODE_CHANGE, onParentNodeChange));
		}
	}

	protected void renderOnPrevSiblingChange(List<String> renderedAttributes, TreeNode treeNode) throws IOException {
		java.lang.String onPrevSiblingChange = treeNode.getOnPrevSiblingChange();

		if (onPrevSiblingChange != null) {
			renderedAttributes.add(renderString(TreeNode.ON_PREV_SIBLING_CHANGE, onPrevSiblingChange));
		}
	}

	protected void renderOnRenderedChange(List<String> renderedAttributes, TreeNode treeNode) throws IOException {
		java.lang.String onRenderedChange = treeNode.getOnRenderedChange();

		if (onRenderedChange != null) {
			renderedAttributes.add(renderString(TreeNode.ON_RENDERED_CHANGE, onRenderedChange));
		}
	}

	protected void renderOnTabIndexChange(List<String> renderedAttributes, TreeNode treeNode) throws IOException {
		java.lang.String onTabIndexChange = treeNode.getOnTabIndexChange();

		if (onTabIndexChange != null) {
			renderedAttributes.add(renderString(TreeNode.ON_TAB_INDEX_CHANGE, onTabIndexChange));
		}
	}

}
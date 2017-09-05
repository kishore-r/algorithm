/************************************************************************
 *                                                                      *
 *                                                                      *
 *                                                                      *
 *  (c) Copyright by  - all rights reserved                             *
 *                                                                      *
 ************************************************************************
 *
 * Initial Creation:
 *    Author      rak
 *    Created on  Aug 31, 2017
 *
 ************************************************************************/
package com.algorithm.graph;

public class Edge {
    private int fromNode;
    private int toNode;
    private int length;

    public Edge(int fromNode, int toNode, int length) {
        this.fromNode = fromNode;
        this.toNode = toNode;
        this.length = length;
    }

    /**
     * COMMENT - Add concise description of this setter method.
     *           Description should go beyond the method name.
     * 
     * @return Returns the fromNode.
     */
    public int getFromNode() {
        return fromNode;
    }

    /**
     * COMMENT - Add concise description of this setter method.
     *           Description should go beyond the method name.
     * 
     * @return Returns the toNode.
     */
    public int getToNode() {
        return toNode;
    }

    /**
     * COMMENT - Add concise description of this setter method.
     *           Description should go beyond the method name.
     * 
     * @return Returns the length.
     */
    public int getLength() {
        return length;
    }

    /**
     * COMMENT - Add concise description of this setter method.
     *           Description should go beyond the method name.
     * 
     * @param fromNode The fromNode to set.
     */
    public void setFromNode(int fromNode) {
        this.fromNode = fromNode;
    }

    /**
     * COMMENT - Add concise description of this setter method.
     *           Description should go beyond the method name.
     * 
     * @param toNode The toNode to set.
     */
    public void setToNode(int toNode) {
        this.toNode = toNode;
    }

    /**
     * COMMENT - Add concise description of this setter method.
     *           Description should go beyond the method name.
     * 
     * @param length The length to set.
     */
    public void setLength(int length) {
        this.length = length;
    }

    public int getNebhourIndex(int sourceIndex) {
        if (this.fromNode == sourceIndex) {
            return this.toNode;
        } else {
            return this.fromNode;
        }
    }
}

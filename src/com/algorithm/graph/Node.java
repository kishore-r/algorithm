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

import java.util.ArrayList;

public class Node {
    private int distanceFromSource = Integer.MAX_VALUE; // used for dijikstra calculations 
    private boolean isVisited;
    private ArrayList<Edge> edges = new ArrayList<Edge>();
    private int parentNode; // used for BFS

    /**
     * COMMENT - Add concise description of this setter method.
     *           Description should go beyond the method name.
     * 
     * @return Returns the distanceFromSource.
     */
    public int getDistanceFromSource() {
        return distanceFromSource;
    }

    /**
     * COMMENT - Add concise description of this setter method.
     *           Description should go beyond the method name.
     * 
     * @return Returns the isVisited.
     */
    public boolean isVisited() {
        return isVisited;
    }

    /**
     * COMMENT - Add concise description of this setter method.
     *           Description should go beyond the method name.
     * 
     * @return Returns the edges.
     */
    public ArrayList<Edge> getEdges() {
        return edges;
    }

    /**
     * COMMENT - Add concise description of this setter method.
     *           Description should go beyond the method name.
     * 
     * @param distanceFromSource The distanceFromSource to set.
     */
    public void setDistanceFromSource(int distanceFromSource) {
        this.distanceFromSource = distanceFromSource;
    }

    /**
     * COMMENT - Add concise description of this setter method.
     *           Description should go beyond the method name.
     * 
     * @param isVisited The isVisited to set.
     */
    public void setVisited(boolean isVisited) {
        this.isVisited = isVisited;
    }

    /**
     * COMMENT - Add concise description of this setter method.
     *           Description should go beyond the method name.
     * 
     * @param edges The edges to set.
     */
    public void setEdges(ArrayList<Edge> edges) {
        this.edges = edges;
    }

    /**
     * COMMENT - Add concise description of this setter method.
     *           Description should go beyond the method name.
     * 
     * @return Returns the parentNode.
     */
    public int getParentNode() {
        return parentNode;
    }

    /**
     * COMMENT - Add concise description of this setter method.
     *           Description should go beyond the method name.
     * 
     * @param parentNode The parentNode to set.
     */
    public void setParentNode(int parentNode) {
        this.parentNode = parentNode;
    }

}

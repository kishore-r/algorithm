/************************************************************************
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

import com.algorithm.util.AlgorithamUtil;

/**
 * creates Graph  with the provided Edges List. 
 * 
 */
public class Graph {
    private int noOfNodes;
    private int noOfEdges;
    private Node[] nodes;
    private Edge[] edges;

    public Graph(Edge[] edges) {
        this.edges = edges;
        this.nodes = new Node[calculateNoOfNodes(edges)];
        this.noOfNodes = this.nodes.length;
        this.noOfEdges = edges.length;
        for (int i = 0; i < this.nodes.length; i++) {
            this.nodes[i] = new Node();
        }

        for (int j = 0; j < edges.length; j++) {
            nodes[edges[j].getFromNode()].getEdges().add(edges[j]);
            nodes[edges[j].getToNode()].getEdges().add(edges[j]);

        }
    }

    /**
     * Method calculates no of Nodes based on the Edge[] provides.
     * 
     *  method assumes the Edge array with positive integer vales for fromNode, toNode and length 
     *  
     *
     * @param edges
     * @return
     */
    private int calculateNoOfNodes(Edge[] edges) {
        int tmpNoOfEdges = 0;
        boolean isEdgeStartFromZero = false;
        for (int i = 0; i < edges.length; i++) {
            isEdgeStartFromZero = edges[i].getFromNode() == 0 || isEdgeStartFromZero;
            if (edges[i].getFromNode() > tmpNoOfEdges) {
                tmpNoOfEdges = edges[i].getFromNode();
            }
            if (edges[i].getToNode() > tmpNoOfEdges) {
                tmpNoOfEdges = edges[i].getToNode();
            }
        }

        return isEdgeStartFromZero ? tmpNoOfEdges + 1 : tmpNoOfEdges;
    }

    /**
     * COMMENT - Add concise description of this setter method.
     *           Description should go beyond the method name.
     * 
     * @return Returns the noOfNodes.
     */
    public int getNoOfNodes() {
        return noOfNodes;
    }

    /**
     * COMMENT - Add concise description of this setter method.
     *           Description should go beyond the method name.
     * 
     * @return Returns the noOfEdges.
     */
    public int getNoOfEdges() {
        return noOfEdges;
    }

    /**
     * COMMENT - Add concise description of this setter method.
     *           Description should go beyond the method name.
     * 
     * @return Returns the nodes.
     */
    public Node[] getNodes() {
        return nodes;
    }

    /**
     * COMMENT - Add concise description of this setter method.
     *           Description should go beyond the method name.
     * 
     * @return Returns the edges.
     */
    public Edge[] getEdges() {
        return edges;
    }

    /**
     * COMMENT - Add concise description of this setter method.
     *           Description should go beyond the method name.
     * 
     * @param noOfNodes The noOfNodes to set.
     */
    public void setNoOfNodes(int noOfNodes) {
        this.noOfNodes = noOfNodes;
    }

    /**
     * COMMENT - Add concise description of this setter method.
     *           Description should go beyond the method name.
     * 
     * @param noOfEdges The noOfEdges to set.
     */
    public void setNoOfEdges(int noOfEdges) {
        this.noOfEdges = noOfEdges;
    }

    /**
     * COMMENT - Add concise description of this setter method.
     *           Description should go beyond the method name.
     * 
     * @param nodes The nodes to set.
     */
    public void setNodes(Node[] nodes) {
        this.nodes = nodes;
    }

    /**
     * COMMENT - Add concise description of this setter method.
     *           Description should go beyond the method name.
     * 
     * @param edges The edges to set.
     */
    public void setEdges(Edge[] edges) {
        this.edges = edges;
    }

    /**
     * COMMENT - Enter concise description of the method's purpose. 
     * 
     *  should display in the following foramt .
     *  F - from , T - To Node , L - Length
     * ------- GRAPH ---------------------
     * NO of Nodes : 4
     * Node :0
     * Edges of : 0
     * F T L
     * 0 2 2
     * 0 3 2
     * 0 1 2
     * 
     */
    public void printGraph() {
        AlgorithamUtil.println("------- GRAPH ---------------------");
        AlgorithamUtil.println("NO of Nodes : " + this.noOfNodes);
        for (int i = 0; i < this.nodes.length; i++) {
            AlgorithamUtil.println("Node :" + i);
            AlgorithamUtil.println("Edges of : " + i);
            AlgorithamUtil.print(" F T L");
            for (int j = 0; j < this.nodes[i].getEdges().size(); j++) {
                AlgorithamUtil.println("");
                Edge edge = this.nodes[i].getEdges().get(j);
                AlgorithamUtil.print(" " + edge.getFromNode() + " " + edge.getToNode() + " " + edge.getLength());
            }
            AlgorithamUtil.println("");
        }
    }
}

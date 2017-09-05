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
package com.algorithm.graph.dijkstra;

import java.util.ArrayList;

import com.algorithm.graph.AbstractGraphAlgoritham;
import com.algorithm.graph.Edge;
import com.algorithm.graph.Graph;
import com.algorithm.graph.Node;
import com.algorithm.util.AlgorithamUtil;

/**
 * COMMENT - Add description of this class or interface here. 
 *           Description should go beyond the class/interface name.
 *           Use the following template:
 * ------------------------------------
 * Pseudocode
 * -------------------------------------
 * function Dijikstra(Graph, Source)
 *  create vertex set Q
 *      for each vertex v in Graph;
 *          dist[v] := INFINITY;
 *          prev[v[ := UNDEFINED;
 *          add v to Q;
 *      dist[source] := 0;
 *      
 *      while Q is not Empty:
 *          u := vertex v in Q with shortest mini dist[s];
 *          remove u from Q
 *          for each neighbor v of u 
 *              alt := dist[u] + length (u,v);
 *    
 *              if alt < dist[v]:
 *                  dist[v] := alt;
 *                  prev[v] : u;
 *                  
 *                  
 *        return dist[], prev[]
 *              
 */
public class Dijkstra extends AbstractGraphAlgoritham {
    private int currentSource;
    private Graph graph;
    private int sourceNode;

    public Dijkstra(Graph graph, int source) {
        this.graph = graph;
        this.currentSource = source;
        this.sourceNode = source;
    }

    public void calculateShortestPath() {
        // initialize the source distance to := 0
        Node[] nodes = this.graph.getNodes();
        nodes[currentSource].setDistanceFromSource(0);
        for (int nodesIndex = 0; nodesIndex < nodes.length; nodesIndex++) {
            ArrayList<Edge> currentEdgeList = nodes[this.currentSource].getEdges();
            for (int edgeIndex = 0; edgeIndex < currentEdgeList.size(); edgeIndex++) {
                int neighbour = currentEdgeList.get(edgeIndex).getNebhourIndex(currentSource);
                if (!nodes[neighbour].isVisited()) {
                    int calculatedDistance = nodes[this.currentSource].getDistanceFromSource() + currentEdgeList.get(edgeIndex).getLength();

                    if (calculatedDistance < nodes[neighbour].getDistanceFromSource()) {
                        nodes[neighbour].setDistanceFromSource(calculatedDistance);
                    }

                }
            }
            nodes[this.currentSource].setVisited(true);
            this.currentSource = getNextShortestDistancedNode(nodes);
        }
        displayShortestPath();
    }

    private int getNextShortestDistancedNode(Node[] nodes) {
        int tmpNodeIndex = 0;
        int tmpShotestDistance = Integer.MAX_VALUE;
        for (int i = 0; i < nodes.length; i++) {
            int currentDistance = nodes[i].getDistanceFromSource();
            if (!nodes[i].isVisited() && currentDistance < tmpShotestDistance) {
                tmpShotestDistance = currentDistance;
                tmpNodeIndex = i;
            }
        }
        return tmpNodeIndex;
    }

    protected void displayShortestPath() {
        Node[] nodes = this.graph.getNodes();
        AlgorithamUtil.println("-----------------------------------------------");
        for (int i = 0; i < nodes.length; i++) {
            AlgorithamUtil.println("Shortest Distance from Node " + this.sourceNode + " to Node " + i + " is : " + nodes[i].getDistanceFromSource());
        }

    }

    /**
     * COMMENT - Add concise description of this setter method.
     *           Description should go beyond the method name.
     * 
     * @return Returns the graph.
     */
    public Graph getGraph() {
        return graph;
    }

    /**
     * COMMENT - Add concise description of this setter method.
     *           Description should go beyond the method name.
     * 
     * @param graph The graph to set.
     */
    public void setGraph(Graph graph) {
        this.graph = graph;
    }
}

/************************************************************************
 *                                                                      *
 *                                                                      *
 *  (c) Copyright by  - all rights reserved                             *
 *                                                                      *
 ************************************************************************
 *
 * Initial Creation:
 *    Author      rak
 *    Created on  Sep 4, 2017
 *
 ************************************************************************/
package com.algorithm.graph.bfs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

import com.algorithm.graph.AbstractGraphAlgoritham;
import com.algorithm.graph.Edge;
import com.algorithm.graph.Graph;
import com.algorithm.graph.Node;
import com.algorithm.util.AlgorithamUtil;

/**
 * COMMENT - Add description of this class or interface here. 
 * 
 * ------------------------------------
 * Pseudocode
 * ------------------------------------
 * Algorith BFS(s)
 * 
 *  for each vertex v
 *      do  flag[v] := false;
 *          prev[v] := -1;
 *   Q := empty Queue;
 *   flag[s] :=true;
 *   add(Q, s);
 *   while Q is not empty
 *    do v:= dequeue(q);
 *      for each w adjacent  to v 
 *        do if flag[w] = false
 *          then flag[w] := true;
 *              prev[w]  : = v;
 *              enqueue(Q, w); 
 *          
 * 
 * 
 */
public class BreadthFirstSearch extends AbstractGraphAlgoritham {
    private Graph graph;
    int sourceNode;

    BreadthFirstSearch(Graph graph, int sourceNode) {
        this.graph = graph;
        this.sourceNode = sourceNode;
    }

    public void calculateShortestPath() {

        Node[] nodes = this.graph.getNodes();
        for (int i = 0; i < nodes.length; i++) {
            nodes[i].setVisited(false);
            nodes[i].setParentNode(-1);
        }
        Queue<Integer> queue = new LinkedList<Integer>();
        nodes[this.sourceNode].setVisited(true);
        queue.add(this.sourceNode);

        while (!queue.isEmpty()) {
            int deQueuedSourceNode = queue.poll();

            ArrayList<Edge> currentNodesEdges = nodes[deQueuedSourceNode].getEdges();
            for (int edge = 0; edge < currentNodesEdges.size(); edge++) {
                int nehiboourIndex = currentNodesEdges.get(edge).getNebhourIndex(deQueuedSourceNode);

                if (!nodes[nehiboourIndex].isVisited()) {
                    queue.add(nehiboourIndex);
                    nodes[nehiboourIndex].setVisited(true);
                    nodes[nehiboourIndex].setParentNode(deQueuedSourceNode);
                }

            }
        }
        displayShortestPath();
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

    @Override
    protected void displayShortestPath() {
        // TODO Auto-generated method stub
        Node[] nodes = this.graph.getNodes();
        AlgorithamUtil.println("-----------------------------------------------");
        AlgorithamUtil.println("Shortest path to each Node from  " + this.sourceNode);
        for (int i = 0; i < nodes.length; i++) {
            AlgorithamUtil.print("Path to Node " + i + ";{");
            printPathTo(i);
            AlgorithamUtil.print("}");
            AlgorithamUtil.println("");
        }
    }

    private void printPathTo(int dest) {
        if (dest == -1) {
            return;
        } else {
            printPathTo(this.graph.getNodes()[dest].getParentNode());
            AlgorithamUtil.print(dest + " ");
        }
    }

}

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
 *    Created on  Sep 5, 2017
 *
 ************************************************************************/
package com.algorithm.graph.bfs;

import org.junit.Test;

import com.algorithm.graph.Edge;
import com.algorithm.graph.Graph;

public class TestBreadthFirstSearch {

    @Test
    public void testCalculateShortestPath() {
        Graph graph = new Graph(new Edge[] { new Edge(0, 2, 1), new Edge(0, 3, 4), new Edge(0, 4, 2), new Edge(0, 1, 3), new Edge(1, 3, 2), new Edge(1, 4, 3), new Edge(1, 5, 1), new Edge(2, 4, 1), new Edge(3, 5, 4), new Edge(4, 5, 2),
            new Edge(4, 6, 7), new Edge(4, 7, 2), new Edge(5, 6, 4), new Edge(6, 7, 5) });
        graph.printGraph();
        BreadthFirstSearch bfs = new BreadthFirstSearch(graph, 0);
        bfs.calculateShortestPath();
    }

}

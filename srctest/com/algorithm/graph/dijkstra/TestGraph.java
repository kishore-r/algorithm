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
package com.algorithm.graph.dijkstra;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TestGraph {

    @Test
    public void testGraph() {
        Graph graph = new Graph(new Edge[] { new Edge(0, 2, 2), new Edge(0, 3, 2), new Edge(0, 1, 2), new Edge(1, 3, 2) });
        graph.printGraph();
        assertTrue(graph.getNoOfNodes() == 4);
        assertTrue(graph.getNodes()[0].getEdges().size() == 3);
    }
}

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
 *    Created on  Sep 4, 2017
 *
 ************************************************************************/
package com.algorithm.graph.dijkstra;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TestDijikstra {

    @Test
    public void testCalculateShortestPath() {
        Graph graph = new Graph(new Edge[] { new Edge(0, 2, 1), new Edge(0, 3, 4), new Edge(0, 4, 2), new Edge(0, 1, 3), new Edge(1, 3, 2), new Edge(1, 4, 3), new Edge(1, 5, 1), new Edge(2, 4, 1), new Edge(3, 5, 4), new Edge(4, 5, 2),
            new Edge(4, 6, 7), new Edge(4, 7, 2), new Edge(5, 6, 4), new Edge(6, 7, 5) });
        graph.printGraph();
        Dijkstra dijiktra = new Dijkstra(graph, 0);
        dijiktra.calculateShortestPath();
        assertTrue(dijiktra.getGraph().getNodes()[5].getDistanceFromSource() == 4);
        assertTrue(dijiktra.getGraph().getNodes()[6].getDistanceFromSource() == 8);
        assertTrue(dijiktra.getGraph().getNodes()[7].getDistanceFromSource() == 4);
    }

}

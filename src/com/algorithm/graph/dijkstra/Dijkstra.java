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
public class Dijkstra {

}

package com.snarula.algo.test;

import com.snarula.algo.graph.Graph;
import com.snarula.algo.graph.Node;

public class GraphTest {
	public static final int weight = 6;

	public static void main(String arg[]) {
		
		Graph graph = new Graph(4, 3);
		Node one = graph.addNode("A");
		Node two =graph.addNode("B");
		Node three =graph.addNode("C");
		Node four =graph.addNode("D");
		
		graph.addEdge(one, two, weight);
		graph.addEdge(two, three, weight);
		graph.addEdge(one, four, weight);
		
		graph.performDFS(one);
		//graph.performBFS(one);
	}
}

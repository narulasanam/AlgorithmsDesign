package com.snarula.algo.graph;

public class Edge {

	int weight;
	Node startNode;
	Node endNode;
	
	Edge(Node startNode,Node endNode, int weight){
		this.startNode = startNode;
		this.endNode = endNode;
		this.weight = weight;
	}
}

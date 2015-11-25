package com.snarula.algo.graph;

import java.util.ArrayList;

public class Node {
	String label;
	boolean visited;
	ArrayList<Node> adj;
	
	public Node(String label){
		this.label = label;
		adj = new ArrayList<>();
	}
}

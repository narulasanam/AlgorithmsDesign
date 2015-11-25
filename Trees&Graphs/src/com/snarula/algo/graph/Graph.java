package com.snarula.algo.graph;

import java.util.ArrayList;
import java.util.HashMap;

import com.snarula.algo.test.MyQueue;

public class Graph {
	int V;
	int E;
	HashMap<String,Node> vertices;
	ArrayList<Edge> edges;

	public Graph(int V, int E) {
		this.V = V;
		this.E = E;
		vertices = new HashMap<String, Node>(V);
		edges = new ArrayList<Edge>(E);
	}

	public Node addNode(String label) {
		Node node = new Node(label);
		vertices.put(label,node);
		return node;
	}

	public void addEdge(Node start, Node end, int weight) {
		Edge edge = new Edge(start, end, weight);
		start.adj.add(end);
		end.adj.add(start);
		edges.add(edge);
	}

	public void performDFS(Node root) {
		if (root == null) {
			return;
		}
		visit(root);
		root.visited = true;
		for (Node n : root.adj) {
			if (!n.visited)
				performDFS(n);
		}
	}

	public void performBFS(Node root) {
		if (root == null) {
			return;
		}
		MyQueue<Node> queue = new MyQueue<Node>();
		queue.enqueue(root);
		root.visited = true;
		while (!queue.isEmpty()) {
			Node temp = queue.dequeue();
			visit(temp);
			for(Node n : temp.adj){
				if(!n.visited){
					n.visited = true;
					queue.enqueue(n);
				}
			}

		}
	}

	public void visit(Node root) {
		System.out.println(root.label);

	}
}

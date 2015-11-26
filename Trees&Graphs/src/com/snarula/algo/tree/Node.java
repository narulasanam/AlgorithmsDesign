package com.snarula.algo.tree;

public class Node {
	int data;
	Node left;
	Node right;
	Node parent;
	
	public Node(int data) {
		left = null;
		right = null;
		this.data = data;
		this.parent = null;
	}

	public Node getLeft() {
		return left;
	}

	public void setLeft(Node left) {
		this.left = left;
		left.parent = this;
	}

	public Node getRight() {
		return right;
	}

	public void setRight(Node right) {
		this.right = right;
		right.parent = this;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public Node getParent() {
		return parent;
	}

	public void setParent(Node parent) {
		this.parent = parent;
	}
	

}

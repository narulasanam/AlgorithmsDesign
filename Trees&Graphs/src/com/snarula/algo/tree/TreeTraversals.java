package com.snarula.algo.tree;

public class TreeTraversals {
	Node root;

	public TreeTraversals(Node root) {
		this.root = root;
	}

	public Node getRoot() {
		return root;
	}

	public void setRoot(Node root) {
		this.root = root;
	}

	public void preOrderTraversal(Node node) {
		if (node != null) {
			visit(node);
			preOrderTraversal(node.left);
			preOrderTraversal(node.right);
		}
	}

	public void inOrderTraversal(Node node) {
		if (node != null) {
			preOrderTraversal(node.left);
			visit(node);
			preOrderTraversal(node.right);
		}
	}

	public void postOrderTraversal(Node node) {
		if (node != null) {
			preOrderTraversal(node.left);
			preOrderTraversal(node.right);
			visit(node);
		}
	}

	private void visit(Node node) {
		System.out.println(node.data);

	}

}

package com.snarula.algo.tree;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

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

	public void levelOrderTraversal(Node node) {
		if (node == null)
			return;
		LinkedList<Node> q = new LinkedList<Node>();
		q.addLast(node);

		while (!q.isEmpty()) {
			Node temp = q.removeFirst();
			System.out.println(temp.data);
			if (temp.left != null)
				q.addLast(temp.left);
			if (temp.right != null)
				q.addLast(temp.right);
		}
	}

	public void recLevelOrderTraversal(Node node) {
		if (node != null) {
			recLevelOrdertraversal(Arrays.asList(node));
		}
	}

	public void spiralTraversal(Node node) {
		if (node == null)
			return;
		Stack<Node> stack = new Stack<Node>();
		stack.push(node);
		boolean directionFlag = false;
		while (!stack.isEmpty()) {
			Stack<Node> tempStack = new Stack<Node>();
			while (!stack.isEmpty()) {
				Node temp = stack.pop();
				System.out.println(temp.data);
				if (!directionFlag) {
					if (temp.left != null) {
						stack.push(temp.left);
					}

					if (temp.right != null) {
						stack.push(temp.right);
					}

				} else {
					if (temp.right != null) {
						stack.push(temp.right);
					}
					if (temp.left != null) {
						stack.push(temp.left);
					}
				}
			}
			directionFlag = !directionFlag;

		}

	}

	private void recLevelOrdertraversal(List<Node> level) {
		// TODO Auto-generated method stub

		LinkedList<Node> nextLevel = new LinkedList<>();
		for (Node n : level) {
			System.out.println(n.data);
			if (n.left != null)
				nextLevel.add(n.left);

			if (n.right != null)
				nextLevel.add(n.right);
		}

		if (!nextLevel.isEmpty())
			recLevelOrdertraversal(nextLevel);
	}

	private void visit(Node node) {
		System.out.println(node.data);

	}

}

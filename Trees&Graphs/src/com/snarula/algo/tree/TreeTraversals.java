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

	public void preOrderIterative(Node root) {
		if (root == null) {
			return;
		}

		Stack<Node> stack = new Stack<Node>();
		stack.push(root);
		while (!stack.isEmpty()) {
			visit(stack.pop());
			if (root.right != null) {
				stack.push(root.right);
			}
			if (root.left != null) {
				stack.push(root.left);
			}
		}

	}
	
	public void inOrderTraversalIterative(Node root) {
		if (root == null) {
			return;
		}
		
	}

	public void inOrderTraversal(Node node) {
		if (node != null) {
			inOrderTraversal(node.left);
			visit(node);
			inOrderTraversal(node.right);
		}
	}

	public void postOrderTraversal(Node node) {
		if (node != null) {
			postOrderTraversal(node.left);
			postOrderTraversal(node.right);
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
						tempStack.push(temp.left);
					}

					if (temp.right != null) {
						tempStack.push(temp.right);
					}

				} else {
					if (temp.right != null) {
						tempStack.push(temp.right);
					}
					if (temp.left != null) {
						tempStack.push(temp.left);
					}
				}
			}
			directionFlag = !directionFlag;
			stack = tempStack;

		}

	}

	public void recSpiralTraversal(Node node) {
		if (node == null)
			return;
		recSpiralTraversal(Arrays.asList(node), false);
	}

	private void recSpiralTraversal(List<Node> level, boolean directionFlag) {
		LinkedList<Node> nextLevel = new LinkedList<Node>();
		for (Node n : level) {
			System.out.println(n.data);
			if (!directionFlag) {

				if (n.right != null) {
					nextLevel.addLast(n.right);
				}

				if (n.left != null) {
					nextLevel.addLast(n.left);
				}
			} else {
				if (n.left != null) {
					nextLevel.addLast(n.left);
				}

				if (n.right != null) {
					nextLevel.addLast(n.right);
				}
			}
		}
		if (!nextLevel.isEmpty()) {
			recSpiralTraversal(nextLevel, !directionFlag);
		}

	}

	private void recLevelOrdertraversal(List<Node> level) {
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

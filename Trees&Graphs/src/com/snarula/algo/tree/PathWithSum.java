package com.snarula.algo.tree;

public class PathWithSum {

	public int countPathWithSum(Node node, int targetSum) {
		if (node == null)
			return 0;

		int pathFromRoot = countPathWithSumFromNode(node, targetSum, 0);

		int pathOnleft = countPathWithSum(node.left, targetSum);

		int pathOnRight = countPathWithSum(node.right, targetSum);

		return pathFromRoot + pathOnleft + pathOnRight;

	}

	private int countPathWithSumFromNode(Node node, int targetSum,
			int currentSum) {
		if (node == null)
			return 0;

		currentSum += node.data;

		int totalPath = 0;
		if (currentSum == targetSum) {
			totalPath++;
		}

		totalPath += countPathWithSumFromNode(node.left, targetSum, currentSum);
		totalPath += countPathWithSumFromNode(node.right, targetSum, currentSum);

		return totalPath;
	}

	public static void main(String arg[]) {
		
		Node root = new Node(5);
		Node left = new Node(3);
		Node right = new Node(6);
		Node leftleft = new Node(1);
		Node leftright = new Node(2);

		
		root.setLeft(left);
		root.setRight(right);
		
		left.setLeft(leftleft);
		left.setRight(leftright);
		
		PathWithSum ob = new PathWithSum();
		System.out.println(ob.countPathWithSum(root, 3));
		
	}
}

package com.snarula.algo.tree;

public class MinDepthTree {

	public static void main(String arg[]) {
		
		int array[] = { 1, 2, 3, 4, 5};
		Node root = createMinDepthTree(array);
		TreeTraversals t = new TreeTraversals(root);
		t.preOrderTraversal(root);
		
	}

	private static Node createMinDepthTree(int[] array) {
		return createMinDepthTree(array, 0, array.length - 1);
	}

	private static Node createMinDepthTree(int[] array, int start, int end) {
		
		if (end < start)
			return null;
		
		int mid = (start + end) / 2;
		Node root = new Node(array[mid]);
		root.left = createMinDepthTree(array, start, mid-1);
		root.right = createMinDepthTree(array, mid+1, end);
		
		return root;

	}

}

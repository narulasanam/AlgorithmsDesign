package com.snarula.algo.tree;

public class TreeOperations {

	public boolean isBalanced(Node root) {
		if (root == null) {
			return false;
		}

		if (checkHeight(root)) {
			return true;
		}
		return false;
	}

	public boolean validateBST(Node root) {
		return validateBST(root, null, null);

	}

	private boolean validateBST(Node root,Integer min, Integer max){
		if (root == null)
			return true;

		if (((min != null) && root.data <= min)
				|| ((max != null) && (root.data > max)))
			return false;
		

			if (!validateBST(root.left,min, root.data) || !validateBST(root.right, root.data, max))
				return false;
		
		return true;
	}

	private boolean checkHeight(Node root) {
		if (root == null)
			return true;

		int leftHeight = getHeight(root.left);
		int rightHeight = getHeight(root.right);

		if (Math.abs(leftHeight - rightHeight) > 1) {
			return false;
		} else {
			return checkHeight(root.left) && checkHeight(root.right);
		}
	}

	private int getHeight(Node root) {
		if (root == null)
			return -1;

		return Math.max(getHeight(root.left), getHeight(root.right)) + 1;
	}
	
	
	public boolean checkSubTree(Node root1, Node root2){
		
		StringBuilder s1 = new StringBuilder();
		StringBuilder s2 = new StringBuilder();
		
		getOrderString(root1, s1);
		getOrderString(root2, s2);
		
		
		
		return s1.indexOf(s2.toString()) != -1;
	}
	
	
	private void getOrderString(Node node, StringBuilder s1) {
		
		if(node == null){
			s1.append("X");
			return;
		}
		s1.append(String.valueOf(node.data)+",");
		getOrderString(node.left,s1);
		getOrderString(node.right, s1);
	}

	public Node inOrderSuccessor(Node node) {
		if(node == null) return null;
		
		if(node.right !=null){
			return leftMostChild(node.right);
		}
		else {
			Node q = node;
			Node parent = q.parent;
			while(parent != null && parent.left !=q){
				q= parent;
				parent = parent.parent;
			}
			return q;
		}
		
	}

	private Node leftMostChild(Node node) {
		while(node.left !=null){
			node = node.left;
		}
		return node;
	}
}

package com.snarula.algo.test;

import com.snarula.algo.tree.Node;
import com.snarula.algo.tree.TreeOperations;

public class TreeOperationTest {

	public static void main(String[] args) {
		Node root = new Node(5);
		Node left = new Node(3);
		Node right = new Node(6);
		Node leftleft = new Node(0);
		Node leftright = new Node(2);

		Node a= new Node(111);
		Node b = new Node(121);
		
		root.setLeft(left);
		root.setRight(right);
		
		left.setLeft(leftleft);
		left.setRight(leftright);
		
/*		leftleft.setLeft(a);
		a.setLeft(b);
		*/
		TreeOperations op= new TreeOperations();
		
		System.out.print("isBalanced: ");
		System.out.println(op.isBalanced(root));
		
		System.out.print("isBST: ");
		System.out.println(op.validateBST(root));
		
		System.out.print("inOrderSucc: ");
		System.out.println(op.inOrderSuccessor(left).getData());
		
		System.out.print("isSubTree: ");
		System.out.println(op.checkSubTree(root, a));
		

	}

}

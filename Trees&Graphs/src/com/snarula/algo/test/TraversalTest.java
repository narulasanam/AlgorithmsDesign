package com.snarula.algo.test;
import com.snarula.algo.tree.*;

public class TraversalTest {

	public static void main(String[] args) {
		Node root = new Node(5);
		Node left = new Node(3);
		Node right = new Node(9);
		
		Node leftleft = new Node(2);
		Node leftright = new Node(1);
		
		Node rightLeft = new Node(7);
		Node rightRight = new Node(10);
		
		root.setLeft(left);
		root.setRight(right);
		
		left.setLeft(leftleft);
		left.setRight(leftright);
		
		right.setLeft(rightLeft);
		right.setRight(rightRight);
		
		
		TreeTraversals t = new TreeTraversals(root);
		System.out.println("*****PREORDER*******");
		t.preOrderTraversal(root);
		System.out.println("************");
		
		System.out.println("*****INORDER*******");
		t.inOrderTraversal(root);
		System.out.println("************");
		
		System.out.println("*****POSTORDER*******");
		t.postOrderTraversal(root);
		System.out.println("************");
		
		/*
		System.out.println("*****LOT*******");
		t.levelOrderTraversal(root);
		
		System.out.println("*****REC**LOT*******");
		t.recLevelOrderTraversal(root);
		
		System.out.println("*****Spiral*******");
		t.spiralTraversal(root);
		
		System.out.println("*****REC Spiral*******");
		t.recSpiralTraversal(root);
		*/
		
		System.out.println("*****INORDER**Iterative*****");
		t.inOrderTraversalIterative(root);
		System.out.println("************");
		
		System.out.println("*****POSTORDER*Iterative******");
		t.postOrderTraversalIterative(root);
		System.out.println("************");
		
		

	}

}

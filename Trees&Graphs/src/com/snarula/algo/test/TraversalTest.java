package com.snarula.algo.test;
import com.snarula.algo.*;

public class TraversalTest {

	public static void main(String[] args) {
		Node root = new Node(5);
		Node left = new Node(1);
		Node right = new Node(10);
		
		root.setLeft(left);
		root.setRight(right);
		
		
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

	}

}

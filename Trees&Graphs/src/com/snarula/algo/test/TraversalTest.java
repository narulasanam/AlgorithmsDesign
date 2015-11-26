package com.snarula.algo.test;
import com.snarula.algo.tree.*;

public class TraversalTest {

	public static void main(String[] args) {
		Node root = new Node(5);
		Node left = new Node(1);
		Node right = new Node(10);
		Node leftleft = new Node(11);
		Node leftright = new Node(12);
		
		root.setLeft(left);
		root.setRight(right);
		
		left.setLeft(leftleft);
		left.setRight(leftright);
		
		
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
		
		
		System.out.println("*****LOT*******");
		t.levelOrderTraversal(root);
		
		System.out.println("*****REC**LOT*******");
		t.recLevelOrderTraversal(root);
		
		System.out.println("*****Spiral*******");
		t.spiralTraversal(root);
		
		System.out.println("*****REC Spiral*******");
		t.recSpiralTraversal(root);
		
		

	}

}

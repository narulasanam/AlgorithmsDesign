package com.snarula.algo;

public class LinkedList <T> {

	private Node<T> head;
	private int listCount;

	LinkedList() {
		head = null;
		listCount = 0;
	}

	public void add(T d) {
		Node<T> temp = new Node<T>(d);
		if (head == null) {
			head = temp;
			head.next = null;
		}
		else {
			Node<T> temp1 = head;
			while(temp1.next != null) {
				temp1 = temp1.next();
			}
			temp1.next = temp;
			temp.next =null;
		}
		listCount++;
	}
	
	public Node<T> getFirst() {
		return head;
	}
	
}

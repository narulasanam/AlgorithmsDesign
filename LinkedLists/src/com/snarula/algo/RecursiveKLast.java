package com.snarula.algo;

public class RecursiveKLast {

	public static void main(String[] args) {
		LinkedList<Integer> ll = new LinkedList<Integer>();

		ll.add(1);
		ll.add(2);
		ll.add(2);
		ll.add(5);
		ll.add(4);
		
		kthLastElement(ll.getFirst(), 3);
	}

	private static int kthLastElement(Node<Integer> head, int i) {
		if(head == null) {
			return 0;
		}
		
		int index = kthLastElement(head.next, i) + 1;
		if (index == i) {
			System.out.println(i +"th element is :" + head.data);
		}
	return index;	
	}

	
	
}

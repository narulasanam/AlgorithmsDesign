package com.snarula.algo;

import java.util.HashSet;

public class DupNode {

	public static void main(String arg[]) {
		LinkedList<Integer> ll = new LinkedList<Integer>();
				
		ll.add(1);
		ll.add(2);
		ll.add(2);
		ll.add(5);
		ll.add(4);
		
		ll.add(1);
		ll.add(2);
		ll.add(2);
		ll.add(6);
		ll.add(4);
	
		
		checkDuplicate(ll);
		print(ll);
	}

	private static void print(LinkedList<Integer> ll) {
		Node<Integer> t = ll.getFirst();
		while(t!=null){
			System.out.println(t.data);
			t = t.next;
		}
		
	}

	private static void checkDuplicate(LinkedList<Integer> ll) {
		HashSet <Integer> elements = new HashSet<Integer>();
		Node<Integer> temp = ll.getFirst();
		Node<Integer> prev = null;
		
		while(temp != null) {
			
			if (!elements.contains(temp.data)){
				elements.add(temp.data);
				prev = temp;
			}
			else {
				prev.next = temp.next;
			}
			temp = temp.next();
			
		}
	}
}

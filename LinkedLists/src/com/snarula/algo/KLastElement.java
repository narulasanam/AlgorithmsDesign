package com.snarula.algo;

public class KLastElement {
	public static void main(String arg[]) {
		LinkedList<Integer> ll = new LinkedList<Integer>();
		
		ll.add(1);
		ll.add(2);
		ll.add(2);
		ll.add(5);
		ll.add(4);
	
		System.out.println(findKthElement(ll,5));
		
	}

	private static int findKthElement(LinkedList<Integer> ll,int num) {
		int value = -1;
		if(ll.size() < num) {
			System.out.println("the number is larger than the size of linkedlist");
		}
		else {
			Node<Integer> slow = ll.getFirst();
			Node<Integer> fast = slow;
			
			for(int i=1; i<num; i++){
				fast = fast.next;
			}
			
			while(fast.next!=null){
				slow =slow.next;
				fast = fast.next;
			}
			value = slow.data;
		}
		return value;
	}
	
}

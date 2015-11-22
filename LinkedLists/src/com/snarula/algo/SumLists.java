package com.snarula.algo;

public class SumLists {
	public static void main(String arg[]) {
		LinkedList<Integer> ll1 = new LinkedList<Integer>();
		LinkedList<Integer> ll2 = new LinkedList<Integer>();

		ll1.add(1);
		ll1.add(2);
		ll1.add(3);
		ll1.add(9);

		ll2.add(9);
		ll2.add(4);
		ll2.add(4);
		ll2.add(4);

		Node<Integer> head = sum(ll1.getFirst(), ll2.getFirst());
		while(head != null){
			System.out.println(head.data);
			head = head.next;
		}

	}

	private static Node<Integer> sum(Node<Integer> firstHead,
			Node<Integer> secondHead) {
		LinkedList<Integer> result = new LinkedList<Integer>();
		Node head = null;
		boolean carry = false;
		while (firstHead != null || secondHead != null || carry) {
			int sumData = (firstHead== null ? 0 : firstHead.data) + (secondHead==null ? 0 : secondHead.data) + (carry ? 1 : 0);
			carry = false;
			if (sumData > 9) {
				sumData %= 10;
				carry = true;
			}

			if (head == null) {
				head = new Node(sumData);
			} else {
				
				Node temp = new Node(sumData);
				temp.next = head;
				head = temp;
				
			}
			if (firstHead!=null) firstHead = firstHead.next;
			if (secondHead!=null) secondHead = secondHead.next;
		}

		return head;
	}
}

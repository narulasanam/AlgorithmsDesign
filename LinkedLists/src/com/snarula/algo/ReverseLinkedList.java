package com.snarula.algo;

public class ReverseLinkedList {

	public static void main(String arg[]) {
		LinkedList<Integer> ll = new LinkedList<Integer>();

		ll.add(1);
		ll.add(-2);
		ll.add(2);
		ll.add(5);
		ll.add(4);

		Node newHead = ReverseLinkedList.reverse(ll.getFirst());
		print(newHead);
		
		Node recHead = ReverseLinkedList.recReverse(newHead);
		print(recHead);
		
	}

	private static void print(Node newHead){
		while (newHead != null) {
			System.out.println(newHead.data);
			newHead = newHead.next;
		}
	}
	private static Node reverse(Node<Integer> currentNode) {
		Node<Integer> previousNode = null;
		Node<Integer> nextNode = null;
		while (currentNode != null) {

			nextNode = currentNode.next;
			// start reversing the links
			currentNode.next = previousNode;

			// increment previousNode and currentNode
			previousNode = currentNode;
			currentNode = nextNode;
		}
		return previousNode;

	}

	private static Node recReverse(Node node) {
		if (node == null || node.next == null) {
			return node;
		}
		Node remaining = recReverse(node.next);
		node.next.next = node;
		node.next = null;
		return remaining;

	}

}

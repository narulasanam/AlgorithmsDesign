package com.snarula.algo;


import java.util.LinkedList;
import java.util.Stack;
public class PalinLL {

public static void main(String[] args) {
	LinkedList<Integer> ll = new LinkedList<Integer>();
		ll.add(1);
		ll.add(2);
		ll.add(3);
		ll.add(2);
		ll.add(1);
	
		System.out.println(checkPalin(ll));

	}

	static boolean checkPalin(LinkedList<Integer> ll) {
		Stack<Integer> stack = new Stack<Integer>();
		int size = ll.size();
		int start = size/2;
		for (int i=0; i < size/2; i++) {
			stack.push(ll.get(i));
		}
		
		// for odd num in list
		if(size % 2 != 0) {
			start +=1;
		}
		
		
		for(int j=start; j<size; j++){
			if(stack.pop() != ll.get(j)) {
				return false;
			}
		}
		
		return true;
	}
}

package com.snarula.algo.test;

import com.snarula.algo.SortStack;
import com.snarula.algo.Stack;

public class sortStackTest {

	public static void main(String[] args) {
		SortStack stack = new SortStack();
		Stack<Integer> testStack = new Stack<>();

		System.out.println(testStack.push(3));
		System.out.println(testStack.push(-3));
		System.out.println(testStack.push(90));

		System.out.println("*******");

		Stack<Integer> k = stack.sort(testStack);

		while (!k.isEmpty()) {
			System.out.println(k.pop());
		}

	}

}

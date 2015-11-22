package com.snarula.algo;

public class ThreeInOne {
	public static void main(String arg[]) {

		Stack<Integer> stack = new Stack<>();

		stack.push(1);
		stack.push(2);
		stack.push(-3);

		while (stack.size != 0) {
			System.out.println(stack.pop());
		}
	}
}

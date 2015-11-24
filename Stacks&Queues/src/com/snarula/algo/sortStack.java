package com.snarula.algo;


public class SortStack {

	public SortStack() {
	}

	public Stack<Integer> sort(Stack<Integer> stack) {
		if (stack == null)
			return null;

		Stack<Integer> sortedStack = new Stack<Integer>();
		while (!stack.isEmpty()) {
			Integer temp = stack.pop();

			while (!sortedStack.isEmpty() && sortedStack.peek() > temp) {
				stack.push(sortedStack.pop());
			}
			sortedStack.push(temp);

		}
		return sortedStack;
	}

}

package com.snarula.algo;

public class MinOperation {

	public static void main(String[] args) {
		ArrayImplOfStack stack = new ArrayImplOfStack(10);
		stack.push(-10);
		stack.push(12);
		stack.push(1);
		stack.push(-15);
		
		//System.out.println(stack.pop());
		
		System.out.println(stack.min());

	}

}

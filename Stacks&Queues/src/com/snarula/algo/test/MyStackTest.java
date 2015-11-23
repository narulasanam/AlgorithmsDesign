package com.snarula.algo.test;

import com.snarula.algo.MyStack;

public class MyStackTest {
	public static void main(String arg[]) {
		MyStack<Integer> stack = new MyStack<>();

		for (int i = 1; i < 5; i++) {
			System.out.println(stack.push(i));
		}
		System.out.println("*******");
		
		for(int j=0; j<2; j++){
		System.out.println(stack.pop());
		}
	}
}

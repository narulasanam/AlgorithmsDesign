package com.snarula.algo;

import java.util.Stack;

public class MyQueue<T> {
	Stack<T> stack;
	int size;

	public MyQueue() {
		stack = new Stack<T>();
		size = 0;
	}

	public T enqueue(T data) {
		stack.push(data);
		size++;
		return data;
	}

	public T dequeue() {
		if(isEmpty()) return null;
		
		Stack<T> temp = new Stack<T>();
		while (!stack.isEmpty()) {
			temp.push(stack.pop());
		}
		T value = temp.pop();

		while (!temp.isEmpty()) {
			stack.push(temp.pop());
		}
		return value;
	}

	
	public boolean isEmpty(){
		
		if(size == 0){
			return true;
		}
		
		return false;
	}
}

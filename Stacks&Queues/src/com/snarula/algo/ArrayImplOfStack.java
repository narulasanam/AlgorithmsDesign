package com.snarula.algo;

import java.lang.reflect.Array;

public class ArrayImplOfStack {

	int maxLimit;
	int min = Integer.MAX_VALUE;
	int size;
	int top; 
	int [] stack;
	
	
	public ArrayImplOfStack(int arraySize) {
		stack = new int[arraySize];
		maxLimit = arraySize;
	}
	
	
	void push(int data) {
		if(size == maxLimit) {
			System.err.println("Overflow");
			return;
		}
		
		
		if(data < min)
			min = data;
		
		
		moveArray(data);
		size++;
	}
	

	private void moveArray(int data) {
		for(int i= size -1; i >= 0; i--) {
			stack[i+1] = stack[i];
		}
		stack[0] = data;
	}


	int pop(){
		if(size == 0) {
			System.err.println("underflow");
			return 0;
		}
		
		size--;
		return stack[0];
		
	}
	
	int min(){
		if(size == 0){
			System.err.println("stack is empty");
			return Integer.MAX_VALUE;
		}
		return min;
	}
}

package com.snarula.algo;

import java.lang.reflect.Array;

public class ArrayImplOfStack {

	int maxLimit;
	int min = -1;
	int size;
	int top; 
	int [] stack;
	
	
	public ArrayImplOfStack(int arraySize) {
		stack = new int[arraySize];
		maxLimit = arraySize;
	}
	
	
	void push(int data) {
		if(size == maxLimit) {
			System.out.println("Overflow");
			return;
		}
		
		
		if(min == -1 || data < stack[min])
			min = 0;
		else
			min++;
		
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
			System.out.println("underflow");
			return 0;
		}
		
		size--;
		return stack[0];
		
	}
	
	int min(){
		return stack[min];
	}
}

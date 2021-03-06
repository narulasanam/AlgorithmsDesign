package com.snarula.algo;

public class Stack<T> {

	public int size = 0;
	public static class StackNode<T> {
		StackNode<T> next;
		T data;

		StackNode(T data) {
			this.data = data;
		}
	}
	
	private StackNode<T> top;
	
	public T push(T data) {

		StackNode<T> temp = new StackNode<T>(data);
		if(top == null){
			top = temp;
		}
		else {
			temp.next = top;
			top = temp;
		}
		size++;
		
		return data;
		
	}
	
	public T pop(){
		if(top == null) return null;
		
		T temp = top.data;
		top = top.next;
		size--;
		return temp;
	}

	int size(){
		return size;
	}
	
	
	T peek(){
		if(top == null) return null;
		
		return top.data;
	}
	
	public boolean isEmpty(){
		if(size ==0)
			return true;
		
		return false;
	}
}

package com.snarula.algo;

public class Node<T> {
	T data;
	Node<T> next;


	Node(T data) {
		next = null;
		this.data = data;
	}
	
	public Node<T> next(){
		return next;
	}
	
	public void setNext(Node<T> next){
		this.next = next;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
}

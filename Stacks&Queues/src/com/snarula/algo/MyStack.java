package com.snarula.algo;

import java.util.ArrayDeque;
import java.util.Queue;

public class MyStack<T> {
	Queue<T> queue;
	int size;
	
	public MyStack(){
		queue = new ArrayDeque<T>();
		size = 0;
	}
	
	public T push(T data){
		
		queue.add(data);
		size++;
		
		return data;
	}
	
	public T pop(){
		Queue<T> temp = new ArrayDeque<>();
		while(!(queue.size() == 1)){
			temp.add(queue.remove());
		}
		T value = queue.remove();
		queue = temp;
		return value;
	}
	
}

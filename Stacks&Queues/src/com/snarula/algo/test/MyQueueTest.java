package com.snarula.algo.test;

import com.snarula.algo.MyQueue;

public class MyQueueTest {

	public static void main(String[] args) {
		MyQueue<Integer> queue = new MyQueue<Integer>();
		
		for(int i=1; i<5; i++){
			System.out.println(queue.enqueue(i));
		}
		
		System.err.println("*********");
		
		for(int j=0; j<2; j++){
			System.out.println(queue.dequeue());
		}

	}

}

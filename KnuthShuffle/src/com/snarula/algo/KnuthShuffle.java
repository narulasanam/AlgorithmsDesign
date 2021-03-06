package com.snarula.algo;

import java.util.Random;

public class KnuthShuffle {
	
	static int [] array = {1,2,3,4,5};
	public static void main(String arg[]) {
		KnuthShuffle.shuffle2(array);
		for(int i=0; i < array.length; i++) {
		    System.out.println(array[i]);
		}
	}

	static void shuffle(int[] array){
		int n = array.length;
		for(int i=0; i<n; i++) {
			int r = i + (int)(Math.random() * (n-i));
			int temp = array[i];
			array[i] = array[r];
			array[r] = temp;
		}
	}
	
	static void shuffle2(int[] array){
		int n = array.length;
		Random random = new Random();
		for(int i=n-1; i>0; i--) {
			int r = random.nextInt(i);
			int temp = array[i];
			array[i] = array[r];
			array[r] = temp;
		}
	}
}

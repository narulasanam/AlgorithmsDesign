package com.snarula.algo;

public class Fibonacci {

	public static void main(String arg[]){
		Fibonacci fib = new Fibonacci();
		System.out.println(fib.fibonnaci(5));
	}
	
	public int fibonnaci(int n) {
		if (n == 0) return 1;
		
		int a = 0;
		int b = 1;
		
		for(int i=2; i<n; i++){
			int c = a + b;
			a = b;
			b = c;
			System.out.println(c);
		}
		return a+b;
		
	}
	
	
	
}

package com.snarula.algo;

public class minProduct {

	public static void main(String[] args) {
		System.out.println(multiply(10,20));
	}
	
	
	public static int multiply(int smaller, int larger) {
		if(smaller == 0) return 0;
		if(smaller == 1) return larger;
		
		int halfSmall =  smaller >> 1;
		
		int halfProd = multiply(halfSmall,larger);
		System.out.println(smaller);
		if(smaller % 2 == 0){
			return halfProd+halfProd;
		}
		else {
			return halfProd+halfProd+larger;
		}
		
	}

}

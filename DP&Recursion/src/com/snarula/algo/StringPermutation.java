package com.snarula.algo;

import java.util.ArrayList;

public class StringPermutation {
	
	
	
	public static void main(String arg[]){
	    //calculatePermutation("sanam");
	    System.out.println();
	    calculatePerm2("san");
	}

	private static void calculatePermutation(String string) {
		calculatePermutation("",string);
	}

	
	private static void calculatePerm2(String string) {
		int n = string.length();
		char[] a = string.toCharArray();
		
		calculatePerm2(a,n);
	}

	private static void calculatePerm2(char[] a, int n) {
		if(n==1){
			System.out.println(a);
			return;
		}
		for(int i=0;i<n;i++){
			swap(a,i,n-1);
			calculatePerm2(a,n-1);
			swap(a,i,n-1);
		}
		
	}
	
	private static void swap(char[] a, int i, int j) {
		char temp = a[i];
		a[i] = a[j];
		a[j] = temp;
		
	}

	private static void calculatePermutation(String prefix, String s) {
		int n = s.length();
		if(n == 0) {
			System.out.println(prefix);
		} else {
			for(int i=0; i<n ; i++) {
				calculatePermutation(prefix+s.charAt(i), s.substring(0,i) + s.substring(i+1,n));
			}
		}
		
	}

}

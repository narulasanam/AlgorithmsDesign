package com.snarula.algo;

import java.util.HashMap;

public class StringPermutation {
	
	
	
	public static void main(String arg[]){
	    //calculatePermutation("sanam");
	    System.out.println();
	    //calculatePerm2("san");
	    calcDupPerm("aaa");
	}

	private static void calcDupPerm(String string) {
		HashMap<Character,Integer> map = new HashMap<>();
		map = buildFreqTable(string.toCharArray());
		calcDupPerm(map,"",string.length());
	
		
	}

	private static void calcDupPerm(HashMap<Character, Integer> map,
			String prefix, int n) {
		if(n == 0) {
			System.out.println(prefix);
		}
		else {
			for(char c: map.keySet()) {
				int count = map.get(c);
				if(count > 0){
					map.put(c, count-1);
					calcDupPerm(map, prefix +c, n-1);
					map.put(c, count);
				}
			}
		}
		
	}

	private static HashMap<Character, Integer> buildFreqTable(char[] charArray) {
		HashMap<Character,Integer> map = new HashMap<>();
		for(char c: charArray){
			if(!map.containsKey(c)) {
				map.put(c,0);
			}
			map.put(c, map.get(c)+1);
		}
		return map;
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

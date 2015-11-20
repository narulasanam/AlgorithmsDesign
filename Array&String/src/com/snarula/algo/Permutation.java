package com.snarula.algo;

public class Permutation {

	public static void main(String arg[]) {
		String s1 = "sanam";
		String s2 = "anams";
		System.out.println(checkPerm(s1,s2));
	}
	
	static boolean checkPerm(String s1, String s2) {
		
		if(s1.length() !=s2.length()) {
			return false;
		}
		
		int[] letters = new int[128];
		char[] s1_array = s1.toCharArray();
		
		for(char c: s1_array){
			letters[c]++;
		}
		
		for(int index=0; index< s2.length(); index++) {
			
			letters[s2.charAt(index)]--;
			
			if(letters[index] < 0)
				return false;
		}
		
		return true;
	}
}

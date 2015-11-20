package com.snarula.algo;

public class URLIFY {

	public static void main(String s[]) {
		String input= "This is my life         ";
		int length = 15;
		
		System.out.println(performUrlification(input,length));
		
	}
	
	static String performUrlification(String input, int length) {
		StringBuilder b = new StringBuilder();
		
		char[] inputArray = input.toCharArray();
		
		for(int i=0; i<length; i++){
			if(inputArray[i] != ' '){
				b.append(inputArray[i]);
			}
			else {
				b.append("%20");
			}
		}
		return b.toString();
	}
	
}

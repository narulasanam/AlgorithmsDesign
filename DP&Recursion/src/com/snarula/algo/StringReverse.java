package com.snarula.algo;

public class StringReverse {

	public static void main(String arg[]) {
	
		System.out.println(getStringReverse("sanam"));
		
	}

	private static String getStringReverse(String string) {
		StringBuilder builder = new StringBuilder(string);
		int n = string.length();
		for(int i=0; i<n/2; i++){
			char temp = builder.charAt(i);
			int otherEnd = n-i-1;
			builder.setCharAt(i ,builder.charAt(otherEnd));
			builder.setCharAt(otherEnd, temp);
		}
		
		return builder.toString();
	}
}

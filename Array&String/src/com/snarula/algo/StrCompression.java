package com.snarula.algo;

public class StrCompression {
	
	public static void main(String arg[]) {
		String s1 = "grrrrrrrrr";
		System.out.println(compressStr(s1));
}

	static String compressStr(String s1) {
	StringBuffer b1 = new StringBuffer();
	int counter = 1;
	
	for(int i=0; i < s1.length() ; i++) {
		
		if ((i+1 < s1.length()) && (s1.charAt(i)) == (s1.charAt(i+1))) {
			counter++;
		}
		else {
			b1.append(s1.charAt(i) + String.valueOf(counter));
			counter = 1;
		}

	}
	return s1.length() > b1.length()? b1.toString():s1; 	
	}
}

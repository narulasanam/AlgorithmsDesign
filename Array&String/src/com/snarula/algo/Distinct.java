package com.snarula.algo;
class Distinct {

	public static void main(String s[]) {
		String s1 = "Sanam";
		System.out.println(checkDistinct(s1));
	}

	static boolean checkDistinct(String s1) {
		
		if(s1.length() > 128)
			return false;
		
		String s2 = s1.toLowerCase();
		
		boolean[] char_set = new boolean[128];
		
		for (int index = 0; index < s2.length(); index++) {
			int val = s2.charAt(index);
			if (char_set[val]) {
				return false;
			} else {
				char_set[val] =true;
			}
		}
		return true;
	}

}

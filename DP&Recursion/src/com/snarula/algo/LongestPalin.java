package com.snarula.algo;

public class LongestPalin {

	public static void main(String[] args) {
		//System.out.println(getLongestPalin(null));
		System.out.println(getLongestPalinOpt("sanas"));
	}

	public static String getLongestPalinOpt(String s) {
		if (s == null) {
			throw new IllegalArgumentException("String reference to null");
		}

		if (s.length() == 0 || s.length() == 1) {
			return s;
		}

		String longestPalin = s.substring(0, 1);
		int length = 1;
		for (int i = 0; i < s.length(); i++) {
			String str = getLongestPalinOpt(s, i, i);
			if (str.length() > length) {
				length = str.length();
				longestPalin = str;
			}
		}
		return longestPalin;
	}

	static String getLongestPalinOpt(String s, int i, int j) {
		while (i >= 0 && j < s.length() && s.charAt(i) == s.charAt(j)) {
			i--;
			j++;
		}
		return s.substring(i+1, j);

	}

	public static String getLongestPalin(String s) {
		if (s == null) {
			throw new IllegalArgumentException("String reference to null");
		}

		if (s.length() == 0 || s.length() == 1) {
			return s;
		}

		int length = s.length();
		int longestLength = 1;
		String longestPalin = s.substring(0, 1);

		for (int i = 0; i < length; i++) {
			for (int j = i + 1; j < length; j++) {

				int len = j - i;

				String str = s.substring(i, j + 1);
				if (isPalindrome(str)) {
					if (str.length() > longestLength) {
						longestLength = str.length();
						longestPalin = str;
					}
				}
			}
		}
		return longestPalin;
	}

	private static boolean isPalindrome(String str) {
		int n = str.length();
		for (int i = 0; i < str.length() / 2; i++) {
			if ((str.charAt(i) != (str.charAt(n - i - 1)))) {
				return false;
			}
		}

		return true;
	}
}

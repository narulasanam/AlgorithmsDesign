package com.snarula.algo;

public class LongestPalin {

	public static void main(String[] args) {
		System.out.println(getLongestPalin(null));
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

				String str = s.substring(i, j+1);
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

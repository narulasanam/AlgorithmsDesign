package com.snarula.algo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

class PalinPermutation {
	public static void main(String arg[]) {
		String input = "this hit";
		System.out.println(checkPalinPerm(input));
	}

	static boolean checkPalinPerm(String input) {
		Map<Character, Integer> charMapper = new HashMap<Character, Integer>();
		
		for (int i = 0; i < input.length(); i++) {
			char temp = input.charAt(i);
			if (temp == ' ')
				continue;
			if (charMapper.containsKey(temp)) {
				int count = charMapper.get(temp);
				charMapper.put(temp, count + 1);
			} else {
				charMapper.put(temp, 1);
			}

		}
		int count = 0;
		Iterator iterator = charMapper.entrySet().iterator();
		while (iterator.hasNext()) {
			Map.Entry pair = (Map.Entry) iterator.next();
			int t = (int) pair.getValue();
			if (t % 2 != 0) {
				count++;
			}
		}

		if (count != 1) {
			return false;
		}
		return true;
	}
}

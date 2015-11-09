package com.snarula.algo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Anagrams {
	
	public static void main(String arg[]) {
		
		
		HashMap<String, ArrayList<String>> list = getAnagramList(Arrays.asList("sea","eas","seal","eals"));
		Iterator it = list.entrySet().iterator();
		while(it.hasNext()) {
			Map.Entry pair = (Map.Entry) it.next();
			System.out.println(pair.getKey() + "-------"+pair.getValue());
		}
		
	}

	
	public static HashMap<String, ArrayList<String>> getAnagramList(List<String> input) {
		HashMap<String, ArrayList<String>> map = new HashMap<String, ArrayList<String>>();
		
		for(String word: input) {			
			String temp = getSortedString(word);
			if(map.containsKey(temp)) {
				map.get(temp).add(word);
			} else {
				ArrayList<String> wordList = new ArrayList<String>();
				wordList.add(word);
				map.put(temp, wordList);
			}
			
		}
		return map;
	}


	private static String getSortedString(String word) {
		char [] charArray = word.toCharArray();
		Arrays.sort(charArray);
		
		return new String(charArray);
	}
	
}

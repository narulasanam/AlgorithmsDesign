package com.snarula.algo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class MinCut {
	public static void main(String arg[]) {
		Map<Integer, List<Integer>> graph = getGraph("KargerMinCut");

	}

	private static LinkedHashMap<Integer, List<Integer>> getGraph(String path) {
		// TODO Auto-generated method stub
		Map<Integer, List<Integer>> graphMap = new LinkedHashMap<>();
		try {
			FileReader fileReader = new FileReader(path);
			BufferedReader br = new BufferedReader(fileReader);
			String line;
			while ((line = br.readLine()) != null) {
				String[] splitArray = line.split("(\\s)+");
				List<Integer> adjList = new ArrayList<>();
				for (int i = 1; i < splitArray.length; i++) 
					adjList.add(Integer.parseInt(splitArray[i]));
				graphMap.put(Integer.parseInt(splitArray[0]),adjList);
			}

		} catch (Exception e) {
			e.printStackTrace();
		};

		return null;
	}
}

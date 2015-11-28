package com.snarula.algo;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class TwoSum {
	
	static ArrayList<Integer> targets = new ArrayList<Integer>();
	static HashMap<Long,Boolean> input= new HashMap<Long,Boolean>();
	public static void main(String arg[]) {
		takeInput();
		System.out.println(targets);
	}

	static void takeInput(){
		File file = new File("2sum.txt");
		try {
			Scanner in = new Scanner(file);
			while(in.hasNextLong()){
				input.put(in.nextLong(),false);
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

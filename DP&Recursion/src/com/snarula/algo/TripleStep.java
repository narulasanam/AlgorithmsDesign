package com.snarula.algo;

import java.util.Arrays;

public class TripleStep {

	public static void main(String[] args) {

		TripleStep ts = new TripleStep();
		System.out.println(ts.countSteps(36));
	}
	
	
	int countSteps(int n){
		int[] memo = new int[n+1];
		Arrays.fill(memo, -1);
		return getNumOfSteps(n, memo);
	}
	
	public int getNumOfSteps(int num, int []memo){
		if(num < 0) return 0;
		if(num == 0) return 1;

		if(memo[num] > -1) return memo[num];
		else {
			memo[num] = getNumOfSteps(num-1,memo) + getNumOfSteps(num - 2, memo)+ getNumOfSteps(num -3 , memo); 
		return memo[num];
		}
	}

}

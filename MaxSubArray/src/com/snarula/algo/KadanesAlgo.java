package com.snarula.algo;

/*
 * KadanAlgo is a DP solution for maximum subarray problem.
 * It taken O(n) time to solve the problem.
 * Note: Kadane algo does not work in case all the elements 
 * of the array are negative.
 */
public class KadanesAlgo implements SearchAndFind {

	@Override
	public int findMaxSubArray(int[] a) {
		int maxSum = Integer.MIN_VALUE;
		int currentSum = 0;

		for (int i = 0; i < a.length; i++) {
			currentSum += a[i];

			if (currentSum < 0)
				currentSum = 0;

			if (currentSum > maxSum)
				maxSum = currentSum;
		}

		return maxSum;
	}

}

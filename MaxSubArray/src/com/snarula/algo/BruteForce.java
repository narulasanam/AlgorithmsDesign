package com.snarula.algo;

/*
 * This is a brute force solution for maximum subarray problem.
 * It taken Omega(n2) time to solve the problem.
 * 
 */
public class BruteForce implements SearchAndFind {

	@Override
	public int findMaxSubArray(int[] a) {
		int maxSum = Integer.MIN_VALUE;
		for (int i = 0; i < a.length; i++) {
			int currentSum = 0;
			currentSum += a[i];
			if (currentSum > maxSum)
				maxSum = currentSum;

			for (int j = i + 1; j < a.length; j++) {
				currentSum += a[j];
				if (currentSum > maxSum)
					maxSum = currentSum;

			}
		}
		return maxSum;
	}

}

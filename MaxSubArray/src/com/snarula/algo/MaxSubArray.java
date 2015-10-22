package com.snarula.algo;

public class MaxSubArray {

	public static void main(String arg[]) {
		int[] array = { -1, -2, 3, -4, 5, -6, -9 };

		BruteForce bForce = new BruteForce();
		DivideAndConquer dConquer = new DivideAndConquer();
		KadanesAlgo kAlgo = new KadanesAlgo();

		int sum = bForce.findMaxSubArray(array);
		System.out.println(sum);

		sum = dConquer.findMaxSubArray(array);
		System.out.println(sum);

		sum = kAlgo.findMaxSubArray(array);
		System.out.println(sum);

	}

}

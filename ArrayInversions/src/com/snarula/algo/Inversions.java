package com.snarula.algo;

public class Inversions {

	static CountInvMergeSort mSort = new CountInvMergeSort();

	public static void main(String arg[]) {
		mSort.readAndPopulate("IntegerArray.txt");
		mSort.sort();
		System.out.println("Inversions are : " + mSort.getInversion());
	}
}

package com.snarula.algo;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CountInvMergeSort {
	private long[] tempMergArr;
	private int length;
	private static long inversion = 0;
	static long[] array = new long[100000];

	public void sort() {
		this.length = array.length;
		this.tempMergArr = new long[length];
		countInversionAndSort(0, length - 1);
	}

	private void countInversionAndSort(int lowerIndex, int higherIndex) {

		if (lowerIndex < higherIndex) {
			int middle = lowerIndex + (higherIndex - lowerIndex) / 2;
			// Count inversion and sorts the left side of the array
			countInversionAndSort(lowerIndex, middle);
			// Count inversion and sorts the right side of the array
			countInversionAndSort(middle + 1, higherIndex);
			// Now merge and count split inversions
			countSplitInversionAndMergeParts(lowerIndex, middle, higherIndex);
		}
	}

	private void countSplitInversionAndMergeParts(int lowerIndex, int middle,
			int higherIndex) {
		for (int i = lowerIndex; i <= higherIndex; i++)
			tempMergArr[i] = array[i];

		int i = lowerIndex;
		int j = middle + 1;
		int mynum = j;
		int k = lowerIndex;

		while (i <= middle && j <= higherIndex) {
			if (tempMergArr[i] <= tempMergArr[j]) {
				array[k] = tempMergArr[i];
				i++;
			} else {
				array[k] = tempMergArr[j];
				setInversion(getInversion() + (j - i - (j - mynum)));
				j++;
			}
			k++;
		}
		while (i <= middle) {
			array[k] = tempMergArr[i];
			k++;
			i++;
		}

	}
/*
 * reads from an external file and populate
 * the data structure.
 */
	public void readAndPopulate(String filename) {

		File file = new File(filename);
		try {
			Scanner sc = new Scanner(file);
			int j = 0;
			while (sc.hasNextLine()) {
				long i = sc.nextLong();
				array[j] = i;
				j++;
			}
			sc.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

	public static long getInversion() {
		return inversion;
	}

	public static void setInversion(long inversion) {
		CountInvMergeSort.inversion = inversion;
	}
}

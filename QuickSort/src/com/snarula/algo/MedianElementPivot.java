package com.snarula.algo;

import java.util.Arrays;
import java.util.TreeMap;

public class MedianElementPivot {

	long count = 0;

	public void quickSort(int[] array, int l, int r) {
		if (l < r) {

			int pivot = findMedian(array, l, r);

			if (pivot == array[r])
				swap(array, l, r);

			else if (pivot == array[(r + l) / 2])
				swap(array, (r + l) / 2, l);

			int p = partition(array, l, r, pivot);
			count += p - l;
			if (l < p - 1)
				quickSort(array, l, p - 1);

			count += r - p;
			if (p + 1 < r)
				quickSort(array, p + 1, r);
		}
	}

	private int findMedian(int[] array, int l, int r) {
		int arr[] = { array[l], array[r], array[(l + r) / 2] };
		Arrays.sort(arr);
		return arr[1];
	}

	private int partition(int[] array, int l, int r, int pivot) {
		int i = l + 1;
		for (int j = l + 1; j <= r; j++) {
			if (array[j] < pivot) {
				swap(array, i, j);
				i++;
			}
		}
		if (l != i - 1)
			swap(array, l, i - 1);
		return i - 1;
	}

	private void swap(int[] array, int i, int j) {
		// TODO Auto-generated method stub
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}

}

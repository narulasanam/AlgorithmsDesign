package com.snarula.algo;

public class Searching {

	public static void main(String[] args) {
		int[] array = { 1, 3, 7, 9, 4, 2};
		
		int max = findMaxUsingBinarySearch(array, 0, array.length - 1);
		System.out.println(max);

	}

	private static int findMaxUsingBinarySearch(int[] array, int start, int last) {
		int middle = 0;
		
		while (start < last) {
			middle = start + (last - start) / 2;
			if (array[middle] > array[middle + 1] && array[middle] > array[middle -1])
				return array[middle];
			else if  (array[middle] > array[middle+1] && array[middle] < array[middle -1])
				last = middle - 1;			
			else
				start = middle + 1;
		}
		if(start == last)
			return start > last ? array[start]:array[last];
			
		return array[middle];
	}

}

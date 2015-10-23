package com.snarula.algo;

public class FirstElementPivot {

	long count = 0;

	public void quickSort(int[] array, int l, int r) {

		if (l > r)
			return;

		if (r < 1)
			return;
		
		if (l < r) {

			int p = partition(array, l, r);
			count += p - 1;
			System.out.println("count is:" + count);
			quickSort(array, 0, p - 1);

			count += r - (p + 1);
			quickSort(array, p + 1, r);
		}
	}

	private int partition(int[] array, int l, int r) {
		long pivot = array[l];
		System.out.println("l is :" + l);
		int i = l + 1;
		for (int j = l + 1; j <= r; j++) {
			if (array[j] < pivot) {
				swap(array, i, j);
				i++;
			}
		}
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

package com.snarula.algo;

public class LastElementPivot {

	long count = 0;

	public void quickSort(int[] array, int l, int r) {
		
		/*if(l!=0 && l-r <= 1 )
			return;*/
		
		if (l < r) {
			int pivot = array[r];
			
			swap(array,l,r);

			int p = partition(array, l, r, pivot);
			count += p - l;
			if (l < p - 1)
				quickSort(array, l, p - 1);

			count += r - p;
			if (p + 1 < r)
				quickSort(array, p + 1, r);
		}
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

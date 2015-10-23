package com.snarula.algo;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class QuickSort {
	
	static int[] array = new int[1000];
	//static long[] array = {3,9,8,4,6,10,2,5,7,1};
	//static long[] array = {3,9,8,4,6,10,2,5,7,1,11,21,31,51,61,71,81,91,101,1001,10011,890,657};
	
	public static void main(String arg[]) {
		
		//readAndPopulate("QuickSortInput.txt");
		readAndPopulate("1000.txt");
		
		/*FirstElementPivot fPivot = new FirstElementPivot();
		fPivot.quickSort(array, 0, array.length -1);
		
		LastElementPivot lPivot = new LastElementPivot();
		lPivot.quickSort(array, 0, array.length -1);*/
		
		MedianElementPivot mPivot = new MedianElementPivot();
		mPivot.quickSort(array, 0, array.length-1);
		
		System.out.println(Arrays.toString(array));
		
		//System.out.println("num of count:" +fPivot.count);
		
		//System.out.println("num of count:" +lPivot.count);
		
		System.out.println("num of count:" +mPivot.count);
	}
	
	
	/*
	 * reads from an external file and populate
	 * the data structure.
	 */
		public static void readAndPopulate(String filename) {

			File file = new File(filename);
			try {
				Scanner sc = new Scanner(file);
				int j = 0;
				while (sc.hasNextLine()) {
					int i = sc.nextInt();
					array[j] = i;
					j++;
				}
				sc.close();
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}

		}

}

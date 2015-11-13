package com.snarula.algo;

public class Island {
	public static void main(String arg[]) {
		int mat[][] = { { 1, 0, 1, 1 }, 
						{ 1, 1, 1, 1 }, 
						{ 0, 1, 1, 1 } };

		int count = countIsland(mat);
		System.out.println(count);

	}

	public static int countIsland(int[][] mat) {
		int n= mat.length;
		int count = 0;
		for(int row = 0; row < n ; row++) {
			for(int col = 0; col < n; col++) {
				if(true == isConnected(mat, row, col, n)) {
					count++;
				}
			}
		}
		return count;
	}

	private static boolean isConnected(int[][] mat, int row, int col, int n) {
		if(!isValidIndex(row,col,n)) {
			return false;
		}
		if(mat[row][col] == 1){
			mat[row][col] = 0;
			
			isConnected(mat, row -1, col, n); // up
			isConnected(mat, row , col-1, n); // left
			isConnected(mat, row +1, col, n); // down
			isConnected(mat, row , col+1, n); // right
			
			return true;
		}
		return false;
	}

	private static boolean isValidIndex(int row, int col, int n) {
		if(row < n && row >= 0 && col < n && col >=0) {
			return true;
		}
		return false;
	}
}

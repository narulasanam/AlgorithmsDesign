package com.snarula.algo;

class ZeroMatrix {
	public static void main(String arg[]) {
		
		/*int[][] matrix = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 },
				{ 13, 14, 15, 16 } };
		*/
		int[][] matrix = { { 1, 2, 3 }, {4, 0, 6,}, { 7, 0, 9}};
		
		int size = matrix.length;
		if (size <= 0) {
			System.out.println("Size cannot be zero");
		}

		print(zeroMatrix(matrix, size));
	}

	static int[][] zeroMatrix(int[][] matrix, int size) {
		int[][] matCopy = new int[size][size];
		//System.arraycopy(matrix, 0, matCopy, 0, size);
		for (int i = 0; i <size; i++ ) {
			for (int j = 0; j<size; j++) {
				matCopy[i][j] = matrix[i][j];
			}
		}
		
		for (int row = 0; row <size; row++ ) {
			for (int col = 0; col<size; col++) {
				if (matrix[row][col] == 0) {
					matCopy = performZeroOp(row, col, matCopy);
				}
			}
		}
		return matCopy;

	}

	static int[][] performZeroOp(int i, int j, int[][] matCopy) {
		for (int index = 0; index < matCopy.length; index++) {
			matCopy[i][index] = 0;
			matCopy[index][j] = 0;
		}
		return matCopy;

	}

	private static void print(int[][] rotateMatrix) {
		for (int[] row : rotateMatrix) {
			for (int j : row) {
				System.out.print(j + " ");
			}
			System.out.println();

		}

	}

}

package com.snarula.algo;

class RotateMatrix {

	public static void main(String arg[]) {
		
		int[][] matrix = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, {9, 10, 11, 12 }, {13,14,15,16}};
		int size = matrix.length;
		if (size <= 0) {
			System.out.println("Size cannot be zero");
		}
		

		print(rotateMatrix90(matrix, size));
		print(rotateMatrix180(matrix, size));
	}

	private static int[][] rotateMatrix180(int[][] matrix, int size) {
		
		// TODO: 
		
		return matrix;
	}

	private static void print(int[][] rotateMatrix) {
		for(int [] row :rotateMatrix){
			for(int j: row){
				System.out.print(j+" ");
			}
			System.out.println();
			
		}
		
	}

	static int[][] rotateMatrix90(int[][] matrix, int size) {
		for (int layer = 0; layer < size / 2; layer++) {
			int first = layer;
			int last = size - 1 - layer;
			for (int i = first; i < last; i++) {
				int offset = i - first;
				// save top
				int top = matrix[first][i];

				matrix[first][i] = matrix[last - offset][first];

				matrix[last - offset][first] = matrix[last][last - offset];

				matrix[last][last - offset] = matrix[i][last];

				matrix[first + offset][last] = top;

			}

		}

		return matrix;
	}
}

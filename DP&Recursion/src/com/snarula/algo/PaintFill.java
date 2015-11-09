package com.snarula.algo;

public class PaintFill {

	public static void main(String arg[]){
		int mat[][] = {{1,2,3},{0,0,0},{0,7,0}};
		if(paint(mat, mat.length -1, mat[0].length -1)){
			System.out.println(mat);
		}
	}
	public static boolean paint(int[][] mat, int row, int col){
		if(row < 0 || row >= mat.length || col < 0 || col >= mat.length){
			return false;
		}
		if(mat[row][col] == 0){
			mat[row][col] = 1 ;
			paint(mat, row -1, col);
			paint(mat, row + 1, col);
			paint(mat, row, col - 1);
			paint(mat, row , col + 1);
		}
		
		return true;
	}
}

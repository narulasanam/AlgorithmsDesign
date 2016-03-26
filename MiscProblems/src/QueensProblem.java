
public class QueensProblem {

	static int result[];
	public static int GRID_SIZE = 8;
	int solutionNum = 1;
	
	QueensProblem() {
		result = new int[GRID_SIZE];
		
	}

	
	void placeQueens(int row) {
		if(row == GRID_SIZE) {
			System.out.print("Solution num "+solutionNum +" is: ");
			printSolution();
			solutionNum++;
			
		} else {
			for (int col=0; col<GRID_SIZE; col++){
				if(checkValid(row, col)) {
					result[row] = col;
					placeQueens(row+1);
				}
			}
		}
	}
	
	
	private boolean checkValid(int row1, int col1) {
		for(int row2=0; row2<row1; row2++) {
			// this will give the col in which the queen is present.
			int col2 = result[row2];
			
			if(col1 == col2) {
				return false;
			}
			
			int colDistance = Math.abs(col2 - col1);
			int rowDistance = row1 - row2;
			
			if(colDistance == rowDistance) {
				return false;
			}
		}
		return true;
	}


	private void printSolution() {
		for(int i: result) {
			System.out.print(i+", ");
		}
		System.out.println();
	}


	public static void main(String[] args) {
		QueensProblem q = new QueensProblem();
		q.placeQueens(0);
	}

}

/*
 * (Largest row and column) Write a program that randomly fills in 0s and 1s into 
 * a 4-by-4 matrix, prints the matrix, and finds the first row and column with the most 1s.
 * 0011
 * 0011
 * 1101
 * 1010
 * The largest row index: 2
 * The largest column index: 2
 * 
 */
package chapter08;


public class ProgrammingExercise10 {

	public static void main(String[] args) {
		int[][] matrix = new int[4][4];
		fillMatrixWithRandomBinaries(matrix);
		findsTheRowAndColumnsWithTheMost1s(matrix);
	}

	public static void findsTheRowAndColumnsWithTheMost1s(int[][] matrix) {
		int row = 0;
		int column = 0 ;
		int largest1Count = 0;
		int onesCounter;
		
		for (int i = 0; i < matrix.length; i++) {
			onesCounter = 0;
			for (int j = 0; j < matrix[i].length; j++) {
				// we will have how many 1's at i. indice.
				if(matrix[i][j] == 1) {
					onesCounter++;
				}
			}
			if(onesCounter > largest1Count) {
				row = i;
				largest1Count = onesCounter;
			}
		}
		largest1Count = 0;
		onesCounter = 0;
		for (int i = 0; i < matrix.length; i++) {
			onesCounter = 0;
			for (int j = 0; j < matrix[i].length; j++) {
				// we will have how many 1's at i. indice.
				if(matrix[j][i] == 1) {
					onesCounter++;
				}
			}
			if(onesCounter > largest1Count) {
				column = i;
				largest1Count = onesCounter;
			}
		}
		
		printArray(matrix);
		System.out.print("The largest row index : " + row);
		System.out.print("\nThe largest column index : " + column);
		
	}

	public static void printArray(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.printf("%s",matrix[i][j]);
			}
			System.out.println();
		}
	}

	public static void fillMatrixWithRandomBinaries(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = (int)(Math.random() * 50) % 2;
			}
		}
	}
}

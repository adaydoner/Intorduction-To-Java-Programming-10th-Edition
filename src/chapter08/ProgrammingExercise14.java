/*
 * (Explore matrix) Write a program that prompts the user to enter the length of a
 * square matrix, randomly fills in 0s and 1s into the matrix, prints the matrix, and
 * finds the rows, columns, and diagonals with all 0s or 1s.
 */
package chapter08;

import java.util.Scanner;

public class ProgrammingExercise14 {
	
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		int sizeOfSquareMatrix;

		System.out.print("Enter the size for the matrix : ");
		sizeOfSquareMatrix = input.nextInt();

		int[][] matrix = new int[sizeOfSquareMatrix][sizeOfSquareMatrix];

		fillMatrixWithRandom1sAnd0s(matrix);
		printMatrix(matrix);
		exploreRowsOfMatrix(matrix);
		exploreColumnsOfMatrix(matrix);
		exploreDiagonalsOfMatrix(matrix);

	}

	public static void fillMatrixWithRandom1sAnd0s(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = (int) (Math.random() * 2);
			}
		}
	}

	public static void printMatrix(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.printf("%2d", matrix[i][j]);
			}
			System.out.println();
		}
	}

	public static void exploreRowsOfMatrix(int[][] matrix) {
		boolean anyRowHoldSameNumbers = false; // this will true if any of row has same numbers,
		for (int i = 0; i < matrix.length; i++) {
			int counterFor1 = 0;
			for (int j = 0; j < matrix[i].length; j++) {
				if (matrix[i][j] == 1) {
					counterFor1++;
				}
			}
			if (counterFor1 == matrix.length) { // mean all elements on i. row are 1
				System.out.println("All 1s on row " + i);
				anyRowHoldSameNumbers = true;
			} else if (counterFor1 == 0) { // mean all elements on i. row are 0
				System.out.println("All 0s on row " + i);
				anyRowHoldSameNumbers = true;
			}
		}
		if (anyRowHoldSameNumbers == false) {
			System.out.println("No same numbers on a row");
		}
	}

	public static void exploreColumnsOfMatrix(int[][] matrix) {
		boolean anyColumnHoldSameNumbers = false; // this will true if any of row has same numbers,
		for (int i = 0; i < matrix.length; i++) {
			int counterFor1 = 0;
			for (int j = 0; j < matrix[i].length; j++) {
				if (matrix[j][i] == 1) {
					counterFor1++;
				}
			}
			if (counterFor1 == matrix.length) { // mean all elements on i. column are 1
				System.out.println("All 1s on column " + i);
				anyColumnHoldSameNumbers = true;
			} else if (counterFor1 == 0) { // mean all elements on i. column are 0
				System.out.println("All 0s on column " + i);
				anyColumnHoldSameNumbers = true;
			}
		}

		if (anyColumnHoldSameNumbers == false) {
			System.out.println("No same numbers on a column ");
		}
	}

	public static void exploreDiagonalsOfMatrix(int[][] matrix) {
		boolean isMajorDiagonalHoldSameNumbers = false;
		boolean isSubDiagonalHoldSameNumbers = false;
		int counterFor1 = 0;
		for (int i = 0; i < matrix.length; i++) {
			if (matrix[i][i] == 1) { // checking major diagonal
				counterFor1++;
			}
		}
		if (counterFor1 == matrix.length) { // mean all elements on major diagonal are 1
			System.out.println("All 1s on major diagonal ");
			isMajorDiagonalHoldSameNumbers = true;
		} else if (counterFor1 == 0) { // mean all elements on major diagonal are 0
			System.out.println("All 0s on major diagonal ");
			isMajorDiagonalHoldSameNumbers = true;
		}
		if (isMajorDiagonalHoldSameNumbers == false) {
			System.out.println("No same numbers on a major diagonal ");
		}

		counterFor1 = 0;
		for (int i = matrix.length - 1, j = 0; i >= 0; i--, j++) {
			if (matrix[i][j] == 1) { // checking sub diagonal
				counterFor1++;
			}
		}
		if (counterFor1 == matrix.length) { // mean all elements on sub diagonal are 1
			System.out.println("All 1s on sub diagonal ");
			isSubDiagonalHoldSameNumbers = true;
		} else if (counterFor1 == 0) { // mean all elements on sub diagonal are 0
			System.out.println("All 0s on sub diagonal ");
			isSubDiagonalHoldSameNumbers = true;
		}
		if (isSubDiagonalHoldSameNumbers == false) {
			System.out.println("No same numbers on a sub diagonal ");
		}
	}
}

/*
 * (Check Sudoku solution) Listing 8.4 checks whether a solution is valid by checking whether every number is valid in the board. 
 * Rewrite the program by checking whether every row, every column, and every small box has the numbers 1 to 9.
 */
package chapter08;

import java.util.Scanner;

public class ProgrammingExercise24 {
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		int[][] sudoku = new int[9][9];
		boolean validationForSolution = false;
		
		sudoku = getSolutionFromUser();
		if(isValid(sudoku)) {
			validationForSolution = true;
		} else {
			validationForSolution = false;
		}
		
		System.out.println("Solution is " + validationForSolution);
		input.close();
	}
	public static int[][] getSolutionFromUser() {
		int[][] sudokuSolution = new int[9][9];
		System.out.println("Enter a Sudoku puzzle solution");
		for (int i = 0; i < sudokuSolution.length; i++) {
			for (int j = 0; j < sudokuSolution[i].length; j++) {
				sudokuSolution[i][j] = input.nextInt();
			}
		}
		return sudokuSolution;
	}

	public static boolean isValid(int[][] sudoku) {
		if(validationForRows(sudoku) && validationForColumns(sudoku) && validationForSmallBoxes(sudoku)) {
			return true;
		}
		return false;
	}

	public static boolean validationForColumns(int[][] sudoku) {
		
		for (int i = 0; i < sudoku.length; i++) {
			boolean[] stateOfEveryNumberInColumn = new boolean[9];
			for (int j = 0; j < sudoku.length; j++) {
				stateOfEveryNumberInColumn[sudoku[j][i] - 1] = true; // if number is 1 , boolean array's 0. index would be true , if number is 9 , boolean array's 8. index would be true.
			}
			for (boolean b : stateOfEveryNumberInColumn) {
				if(b == false) { // if any of element in boolean array is false that would be mean number doesnt exist in i. column
					return false;
				}
			}
		}
		// if false condition wont work that would be mean all columns are valid.
		return true;
	}

	public static boolean validationForRows(int[][] sudoku) {
		for (int i = 0; i < sudoku.length; i++) {
			boolean[] stateOfEveryNumberInRow = new boolean[9];
			for (int j = 0; j < sudoku.length; j++) {
				stateOfEveryNumberInRow[sudoku[i][j] - 1] = true; // if number is 1 , boolean array's 0. index would be true , if number is 9 , boolean array's 8. index would be true.
			}
			for (boolean b : stateOfEveryNumberInRow) {
				if(b == false) { // if any of element in boolean array is false that would be mean number doesnt exist in i. row
					return false;
				}
			}
		}
		// if false condition wont work that would be mean all columns are valid.
		return true;
	}

	public static boolean validationForSmallBoxes(int[][] sudoku) {

		for (int k = 0; k < 3; k++) {
			for (int k2 = 0; k2 < 3; k2++) {
				boolean[] stateOfEveryNumberInRow = new boolean[9];
				for (int row = k; row < k * 3 + 3; row++) {
					for (int column = k2; column < k2 * 3 + 3; column++) {
						stateOfEveryNumberInRow[sudoku[row][column] - 1] = true;
					}
				}
				for (boolean b : stateOfEveryNumberInRow) {
					if(b == false) {
						return false;
					}
				}
			}
		}
		return true;
	}
}

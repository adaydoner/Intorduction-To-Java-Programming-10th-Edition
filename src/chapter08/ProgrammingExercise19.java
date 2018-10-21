/*
 * (Pattern recognition: four consecutive equal numbers) Write the following 
 * method that tests whether a two-dimensional array has four consecutive numbers 
 * of the same value, either horizontally, vertically, or diagonally.
 * 
 * 			public static boolean isConsecutiveFour(int[][] values)
 * 
 * Write a test program that prompts the user to enter the number of rows and columns
 * of a two-dimensional array and then the values in the array and displays
 * true if the array contains four consecutive numbers with the same value. Otherwise, display false.
 */
package chapter08;

import java.util.Scanner;

public class ProgrammingExercise19 {

	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		int row;
		int column;
		char sortRandomNumbers = 'A';

		while (sortRandomNumbers != 'Y' && sortRandomNumbers != 'y' && sortRandomNumbers != 'N' && sortRandomNumbers != 'n') {
			System.out.print("Would  you like to see the alghoritm with random values ? (Yes or No ?) : ");
			sortRandomNumbers = input.next().charAt(0);
		}

		if (sortRandomNumbers == 'y' || sortRandomNumbers == 'Y') {
			row = (int) (Math.random() * 10) + 4; // random number of row
			column = (int) (Math.random() * 10) + 4;// random number of column
			System.out.println("number of row and column : " + row + ", " + column);
			int[][] matrix = new int[row][column];
			fillMatrixWithRandomValues(matrix); // random elements
			printArray(matrix);
			System.out.println(isConsecutiveFour(matrix));
		} else {
			System.out.print("Enter number of row and column : ");
			row = input.nextInt();
			column = input.nextInt();
			int[][] matrix = new int[row][column];
			fillMatrixWithSpecifiedNumbersFromUser(matrix);
			System.out.println(isConsecutiveFour(matrix));
		}

		input.close();
	}

	public static void printArray(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.printf("%2d", matrix[i][j]);
			}
			System.out.println();
		}
	}

	public static void fillMatrixWithRandomValues(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = (int) (Math.random() * 10); // fill matrix with random numbers between 0 to 9
			}
		}
	}

	private static void fillMatrixWithSpecifiedNumbersFromUser(int[][] matrix) {
		System.out.println("Enter elements of matrix : ");
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = input.nextInt();
			}
		}
	}

	public static boolean isConsecutiveFour(int[][] matrix) {
		if (isAnyRowHasConsecutiveFour(matrix)) {
			return true;
		} else if (isAnyColumnHasConsecutiveFour(matrix)) {
			return true;
		} else if (isAnyDiagonalHasConsecutiveFour(matrix)) {
			return true;
		}
		return false;
	}

	private static boolean isAnyDiagonalHasConsecutiveFour(int[][] matrix) {
		// kind of look complicated but its like only way to check every situations to me , after almost an hour thinking...
		for (int i = 0; i < matrix.length; i++) {
			int number = -1;
			int consecutiveSameNumberCounter = 0;
			/* - major diagonal and up-right diagonals.
			 * Inner loop's work principal:
			 * row will start from 0 to row's length
			 * column will start from i which is increase after checking one diagonal to column's length so
			 * when i = 0 ; inner loop will check {0, 0} - {1 , 1} - {2, 2} - {3, 3} - ... it will finish and i would increase
			 * when i = 1 ; inner loop will check {0, 1} - {1 , 2} - {2, 3} - {3, 4} - ... it will finish and i would increase
			 * when i = 2 ; inner loop will check {0, 2} - {1 , 3} - {2, 4} - {3, 5} - ... it will finish and i would increase
			 * inner loop would finish either row is reach to (row's length - 1) which is last index for row or
			 * 							column reach to (column's length - 1) which is last index for column
			 * return true if it find any consecutive four number.
			 */
			for (int row = 0,column = i; column < matrix[0].length && row < matrix.length; row++,column++) {
				if (matrix[row][column] == number) {
					consecutiveSameNumberCounter++;
					if (consecutiveSameNumberCounter == 4) {
						return true;
					}
				} else {
					number = matrix[row][column];
					consecutiveSameNumberCounter = 1;
				}
			}
		}
		for (int i = 0; i < matrix.length; i++) {
			int number = -1;
			int consecutiveSameNumberCounter = 0;
			/*- major diagonal and down-left diagonals.
			 * Inner loop's work principal:
			 * row will start from i to row's length
			 * column will start from  0 to column's length - 1
			 * when i = 0 ; inner loop will check {0, 0} - {1 , 1} - {2, 2} - {3, 3} - ... it will finish and i would increase
			 * when i = 1 ; inner loop will check {1, 0} - {2 , 1} - {3, 2} - {4, 3} - ... it will finish and i would increase
			 * when i = 2 ; inner loop will check {2, 0} - {3 , 1} - {4, 2} - {5, 3} - ... it will finish and i would increase
			 * inner loop would finish either row is reach to (row's length - 1) which is last index for row or
			 * 							column reach to (column's length - 1) which is last index for column
			 * return true if it find any consecutive four number.
			 */
			for (int row = i, column = 0; row < matrix.length && column < matrix[0].length; column++, row++) {
				if (matrix[row][column] == number) {
					consecutiveSameNumberCounter++;
					if (consecutiveSameNumberCounter == 4) {
						return true;
					}
				} else {
					number = matrix[row][column];
					consecutiveSameNumberCounter = 1;
				}
			}
		}
		
		for (int i = matrix.length - 1; i >= 0 ; i--) {
			int number = -1;
			int consecutiveSameNumberCounter = 0;
			/*- sub diagonal and up-left diagonals.
			 * Inner loop's work principal:
			 * i will start from row's last index to zero lets say matrix.length is 6 to make it understandable so row's last index will be (5)
			 * row will start from i to 0
			 * column will start from  0 to column's length - 1
			 * when i = 5 ; inner loop will check {5, 0} - {4, 1} - {3, 2} - {2, 3} - ... it will finish and i would increase
			 * when i = 4 ; inner loop will check {4, 0} - {3, 1} - {2, 2} - {3, 3} - ... it will finish and i would increase
			 * when i = 3 ; inner loop will check {3, 0} - {2, 1} - {1, 2} - {0, 3} - ... it will finish and i would increase
			 * inner loop would finish either row would equal to 0 or
			 * 							column reach to (column's length - 1) which is last index for column
			 * return true if it find any consecutive four number.
			 */
			for (int row = i,column = 0; row >= 0 && column < matrix[0].length; column++,row--) {
				if (matrix[row][column] == number) {
					consecutiveSameNumberCounter++;
					if (consecutiveSameNumberCounter == 4) {
						return true;
					}
				} else {
					number = matrix[row][column];
					consecutiveSameNumberCounter = 1;
				}
			}
		}
		
		for (int i = 0; i < matrix.length ; i++) {
			int number = -1;
			int consecutiveSameNumberCounter = 0;
			/*- sub diagonal and down-right diagonals.
			 * Inner loop's work principal:
			 * row will start from row's length - 1 to 0 , lets say row's length is 6 so row's last index would be (5)
			 * column will start from  i to column's length - 1 and i will start from 0 to row's length - 1
			 * when i = 0 ; inner loop will check {5, 0} - {4, 1} - {3, 2} - {2, 3} - ... it will finish and i would increase
			 * when i = 1 ; inner loop will check {5, 1} - {4, 2} - {3, 3} - {2, 4} - ... it will finish and i would increase
			 * when i = 2 ; inner loop will check {5, 2} - {4, 3} - {3, 4} - {2, 5} - ... it will finish and i would increase
			 * inner loop would finish either row would equal to 0 or
			 * 							column reach to (column's length - 1) which is last index for column
			 * return true if it find any consecutive four number.
			 */
			for (int row = matrix.length - 1,column = i; row >= 0 && column < matrix[0].length; row--,column++) {
				if (matrix[row][column] == number) {
					consecutiveSameNumberCounter++;
					if (consecutiveSameNumberCounter == 4) {
						return true;
					}
				} else {
					number = matrix[row][column];
					consecutiveSameNumberCounter = 1;
				}
			}
		}
		
		return false;
	}

	private static boolean isAnyColumnHasConsecutiveFour(int[][] matrix) {
		int number = -1;
		for (int i = 0; i < matrix[0].length; i++) {
			int consecutiveSameNumberCounter = 0;
			for (int j = 0; j < matrix.length; j++) {
				if(matrix[j][i] == number) {
					consecutiveSameNumberCounter++;
					if(consecutiveSameNumberCounter == 4) {
						return true;
					}
				} else {
					number = matrix[j][i];
					consecutiveSameNumberCounter = 1;
				}
			}
		}
		return false;
	}

	public static boolean isAnyRowHasConsecutiveFour(int[][] matrix) {
		int number = -1;
		for (int i = 0; i < matrix.length; i++) {
			int consecutiveSameNumberCounter = 0;
			for (int j = 0; j < matrix[i].length; j++) {
				if(matrix[i][j] == number) {
					consecutiveSameNumberCounter++;
					if(consecutiveSameNumberCounter == 4) {
						return true;
					}
				} else {
					number = matrix[i][j];
					consecutiveSameNumberCounter = 1;
				}
			}
		}
		return false;

	}
}

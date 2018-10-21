/*
 * (Sort two-dimensional array) Write a method to sort a two-dimensional array using the following header:
 * 
 * 		public static void sort(int m[][])
 * 
 * The method performs a primary sort on rows and a secondary sort on columns. 
 * For example, the following array 	
 * {
 * {4, 2, 1},
 * {1, 2, 2},
 * {4, 2, 3},
 * {1, 2, 5},
 * {1, 1, 6},
 * {4, 1, 7}
 * }
 * will be sorted to 					
 * {
 * {1, 1, 6},
 * {1, 2, 2},
 * {1, 2, 5},
 * {4, 1, 7},
 * {4, 2, 1},
 * {4, 2, 3}
 * }.
 */
package chapter08;

import java.util.Scanner;

public class ProgrammingExercise16 {


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
			column = (int) (Math.random() * 10) + 2; // random number of column
			System.out.println("number of row and column : " + row + ", " + column);
			int[][] matrix = new int[row][column];
			fillMatrixWithRandomValues(matrix); // random elements
			printArray(matrix);
			System.out.println("\nSorted array");
			sort(matrix);
			printArray(matrix);
		} else {
			System.out.print("Enter number of row and column : ");
			row = input.nextInt();
			column = input.nextInt();
			int[][] matrix = new int[row][column];
			fillMatrixWithSpecifiedNumbersFromUser(matrix);
			sort(matrix);
			printArray(matrix);
		}

		input.close();
	}

	public static void fillMatrixWithRandomValues(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = (int) (Math.random() * 10); // fill matrix with random numbers between 0 to 9
			}
		}
	}

	public static void fillMatrixWithSpecifiedNumbersFromUser(int[][] matrix) {
		System.out.println("Enter elements of matrix : ");
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = input.nextInt();
			}
		}
	}
	public static void sort(int[][] matrix) {
		int[] temp = new int[matrix[0].length];
		for (int firstRowToCompare = 0; firstRowToCompare < matrix.length; firstRowToCompare++) {
			for (int secondRowToCompare = firstRowToCompare + 1; secondRowToCompare < matrix.length; secondRowToCompare++) {
				for (int columnNumber = 0; columnNumber < matrix[0].length; columnNumber++) {
					// if columnNumber. element is same for both compared rows , we will pass the next column to compare.
					if(matrix[secondRowToCompare][columnNumber] == matrix[firstRowToCompare][columnNumber]) {
						continue;
					}else if (matrix[secondRowToCompare][columnNumber] < matrix[firstRowToCompare][columnNumber]) { // else if columnumber. element is smaller than compared one , we will swap rows and pass next compare.
						temp = matrix[firstRowToCompare];
						matrix[firstRowToCompare] = matrix[secondRowToCompare];
						matrix[secondRowToCompare] = temp;
						break;
					} else { // else columnNumber. element is larger than compared one , then we wont swap and pass to next compare
						break;
					}
				}
			}
		}
	}

	public static void printArray(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			System.out.printf("%s", "{");
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.printf("%2d", matrix[i][j]);
			}
			System.out.printf("%s", " }");
			System.out.println();
		}
	}
}

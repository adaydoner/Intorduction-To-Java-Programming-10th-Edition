/*
 * (Largest block) Given a square matrix with the elements 0 or 1, write a program to find a maximum square submatrix whose elements are all 1s.
 *  Your program should prompt the user to enter the number of rows in the matrix. 
 *  The program then displays the location of the first element in the maximum square submatrix and the number of the rows in the submatrix.
 *  Your program should implement and use the following method to find the maximum square submatrix:
 *  		public static int[] findLargestBlock(int[][] m)
 *  The return value is an array that consists of three values. 
 *  The first two values are the row and column indices for the first element in the submatrix, and the third value is the number of the rows in the submatrix.
 */
package chapter08;

import java.util.Scanner;

public class ProgrammingExercise35 {
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		int sizeOfSquareMatrix;
		int[] largestBlock = new int[3];
		sizeOfSquareMatrix = getNumberOfRows();
		int[][] matrix = new int[sizeOfSquareMatrix][sizeOfSquareMatrix];
		matrix = getElementsOfMatrix(sizeOfSquareMatrix);
		largestBlock = findLargestBlock(matrix);
		System.out.printf("The maximum square submatrix is at (%2d,%2d) with size %d",largestBlock[0], largestBlock[1],largestBlock[2]);
	}
	
	public static int[][] getElementsOfMatrix(int sizeOfSquareMatrix) {
		System.out.println("Enter the matrix row by row:");
		int[][] matrix = new int[sizeOfSquareMatrix][sizeOfSquareMatrix];
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				matrix[i][j] = input.nextInt();
			}
		}
		return matrix;
	}
	
	public static int getNumberOfRows() {
		int size;
		System.out.print("Enter the number of rows in the matrix : ");
		size = input.nextInt();
		return size;
	}

	public static int[] findLargestBlock(int[][] matrix) {
		int[] largestBlock = new int[3];
		for (int size = 1; size <= matrix.length; size++) {
			/*
			 * following loops will hold the index of start point for possible square submatrix. 
			 */
			for (int row = 0; row < matrix.length; row++) {
				for (int column = 0; column < matrix[row].length; column++) {
					boolean notSubmatrix = true;
					/*
					 * following loops will check if matrix that start with (row,column) has square submatrix size with the size of "size" variable.
					 */
					for (int i = row; i < row + size; i++) {
						for (int j = column; j < column + size; j++) {
							/* 
							 * if either i or j is bigger than matrix.length or any of element is 0. we will say its not a valid submatrix and set the flag false
							 *  and break the loops for check next ones.
							 */
							if(i + 1 > matrix.length || j + 1 > matrix[0].length || matrix[i][j] != 1) { 
								notSubmatrix = false;
								break;
							}
						}
						if(notSubmatrix == false) {
							break;
						}
					}
					if(notSubmatrix ==  true){ 
						/* if loops that stay above check submatrix wont set the flag = false, we would say our matrix has a submatrix with size of size variable,
						 * and start point is row,column
						 */
						largestBlock[0] = row;
						largestBlock[1] = column;
						largestBlock[2] = size;
					}
				}
			}
		}
		
		return largestBlock;
	}
}

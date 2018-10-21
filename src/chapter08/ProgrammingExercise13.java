/*
 * (Locate the largest element) Write the following method that returns the location of the largest element in a two-dimensional array.
 * 			public static int[] locateLargest(double[][] a)
 * The return value is a one-dimensional array that contains two elements. These
 * two elements indicate the row and column indices of the largest element in the
 * two-dimensional array. Write a test program that prompts the user to enter a twodimensional
 * array and displays the location of the largest element in the array.
 */
package chapter08;

import java.util.Scanner;

public class ProgrammingExercise13 {
		static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print("Enter the number of rows and columns of the array : ");
		int rowNumber = input.nextInt();
		int columnNumber = input.nextInt();
		double[][] matrix = new double[rowNumber][columnNumber];
		int[] locationOfLargestElement = new int[2];
		getMatrixElements(matrix);
		locationOfLargestElement = locateTheLargestElement(matrix);
		System.out.printf("%s%d%s%d%s","The location of the largest element is at (",locationOfLargestElement[0],", ",locationOfLargestElement[1],")");
	}

	public static int[] locateTheLargestElement(double[][] matrix) {
		int[] locationOfLargestElement = new int[2];
		double largestElement = 0 ;
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if(matrix[i][j] > largestElement) {
					largestElement = matrix[i][j];
					locationOfLargestElement[0] = i;
					locationOfLargestElement[1] = j;
				}
			}
		}
		return locationOfLargestElement;
	}

	public static void getMatrixElements(double[][] matrix) {
		System.out.println("Enter the array : ");
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = input.nextDouble();
			}
		}
	}
}

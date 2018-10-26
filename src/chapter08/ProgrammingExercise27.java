/*
 * (Column sorting) Implement the following method to sort the columns in a twodimensional array. A new array is returned and the original array is intact.
 * 		public static double[][] sortColumns(double[][] m)
 * Write a test program that prompts the user to enter a 3 * 3 matrix of double values and displays a new column-sorted matrix.
 */
package chapter08;

import java.util.Scanner;

public class ProgrammingExercise27 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter a 3-by-3 matrix row by row : ");
		double[][] matrix = new double[3][3];

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = input.nextDouble();
			}
		}
		matrix = sortColumns(matrix);
		
		input.close();
	}
	public static double[][] sortColumns(double[][] m){
		double temp;
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				for (int j2 = j + 1; j2 < m[i].length; j2++) {
					if(m[j2][i] < m[j][i]) {
						temp = m[j][i];
						m[j][i] = m[j2][i];
						m[j2][i] = temp;
					}
				}
			}
		}
		System.out.println("The column-sorted array is ");
		printArray(m);
		
		return m;
	}

	public static void printArray(double[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}

}

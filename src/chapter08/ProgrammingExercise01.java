/*
 * (Sum elements column by column) Write a method that returns the sum of all the elements in a specified column in a matrix using the following header:
 * 
 * 		public static double sumColumn(double[][] m, int columnIndex)
 * 
 * Write a test program that reads a 3-by-4 matrix and displays the sum of each column.
 */
package chapter08;

import java.util.Scanner;

public class ProgrammingExercise01 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double[][] specifiedNumbers = new double[3][4];
		System.out.println("Enter a 3-by-4 matrix row by row : ");
		for (int i = 0; i < specifiedNumbers.length; i++) {
			for (int j = 0; j < specifiedNumbers[0].length; j++) {
				specifiedNumbers[i][j] = input.nextDouble();
			}
		}
		for (int i = 0; i < specifiedNumbers[0].length; i++) {
			System.out.printf("%s%d%s%.2f\n","Sum of the elements at column ",(i+1)," is ",sumColumn(specifiedNumbers, i));
		}
		input.close();
	}
	public static double sumColumn(double[][] m, int columnIndex) {
		double sumOfColumn = 0;
		for (int i = 0; i < m.length; i++) {
			sumOfColumn += m[i][columnIndex];
		}
		return sumOfColumn;
	}
}

/*
 * (Sum the major diagonal in a matrix) Write a method that sums all the numbers 
 * in the major diagonal in an n * n matrix of double values using the following header:
 * 	public static double sumMajorDiagonal(double[][] m)
 * Write a test program that reads a 4-by-4 matrix and displays the sum of all its elements on the major diagonal.
 */
package chapter08;

import java.util.Scanner;

public class ProgrammingExercise02 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double[][] specifiedNumbers = new double[4][4];
		System.out.println("Enter a 4-by-4 matrix row by row : ");

		for (int i = 0; i < specifiedNumbers.length; i++) {
			for (int j = 0; j < specifiedNumbers[0].length; j++) {
				specifiedNumbers[i][j] = input.nextDouble();
			}
		}
		
		System.out.printf("%s%.2f","Sum of the elements in the major diagonal is ",sumMajorDiagonal(specifiedNumbers));
		input.close();
	}

	public static double sumMajorDiagonal(double[][] m) {
		double sum = 0;
		for (int i = 0; i < m.length; i++) {
			sum += m[i][i];
		}

		return sum;
	}
}

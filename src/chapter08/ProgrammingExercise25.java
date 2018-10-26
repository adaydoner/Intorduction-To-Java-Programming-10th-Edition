/*
 * (Markov matrix) An n * n matrix is called a positive Markov matrix if each element is positive and the sum of the elements in each column is 1. 
 * Write the following method to check whether a matrix is a Markov matrix.
 * 			public static boolean isMarkovMatrix(double[][] m)
 * Write a test program that prompts the user to enter a 3 * 3 matrix of double values and tests whether it is a Markov matrix.
 */
package chapter08;

import java.util.Scanner;

public class ProgrammingExercise25 {

	public static void main(String[] args) {
		java.util.Scanner input = new Scanner(System.in);
		double[][] markovMatrix = new double[3][3];
		System.out.println("Enter a 3-by-3 matrix row by row : ");
		for (int i = 0; i < markovMatrix.length; i++) {
			for (int j = 0; j < markovMatrix[i].length; j++) {
				markovMatrix[i][j] = input.nextDouble();
			}
		}
		if(isMarkovMatrix(markovMatrix)) {
			System.out.println("It is a markov matrix.");
		} else {
			System.out.println("It is not a markov matrix.");
		}
		input.close();
	}
	public static boolean isMarkovMatrix(double[][] m) {
		if(isAllNumbersPositive(m) && isEachColumnsNumbersSum1(m)) {
			return true;
		}
		return false;
	}
	
	public static boolean isAllNumbersPositive(double[][] m) {
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				if(m[i][j] < 0) {
					return false;
				}
			}
		}
		return true;
	}
	private static boolean isEachColumnsNumbersSum1(double[][] m) {
		for (int i = 0; i < m.length; i++) {
			double sum = 0;
			for (int j = 0; j < m[i].length; j++) {
				sum += m[j][i];
			}
			if (sum != 1) {
				return false;
			}
		}
		return true;
	}
}

/*
 * (Algebra: multiply two matrices) Write a method to multiply two matrices. The header of the method is:
 * 		public static double[][] multiplyMatrix(double[][] a, double[][] b)
 * 
 * To multiply matrix a by matrix b, the number of columns in a must be the same as 
 * the number of rows in b, and the two matrices must have elements of the same or compatible types.
 * Write a test program that prompts the user to enter two 3 * 3 matrices and displays their product.
 */
package chapter08;

import java.util.Scanner;

public class ProgrammingExercise06 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double[][] matrix1 = new double[3][3];
		double[][] matrix2 = new double[3][3];
		double[][] multipleOfTwoMatrix = new double[3][3];
		
		System.out.println("Enter matrix1 : ");
		for (int i = 0; i < matrix1.length; i++) {
			for (int j = 0; j < matrix1[i].length; j++) {
				matrix1[i][j] = input.nextDouble();
			}
		}
		
		System.out.println("Enter matrix2 : ");
		for (int i = 0; i < matrix2.length; i++) {
			for (int j = 0; j < matrix2[i].length; j++) {
				matrix2[i][j] = input.nextDouble();
			}
		}
		
		multipleOfTwoMatrix = multiplyMatrix(matrix1,matrix2);
		
		System.out.println("The multiplication of the matrices is ");

		for (int i = 0; i < multipleOfTwoMatrix.length; i++) {
			for (int j = 0; j < multipleOfTwoMatrix[i].length; j++) {
				System.out.printf("%-10.2f", matrix1[i][j]);
			}
			if (i == 1) {
				System.out.printf("%s%5s","*", " ");
			} else {
				System.out.printf("%6s", " ");
			}
			for (int j = 0; j < multipleOfTwoMatrix[i].length; j++) {
				System.out.printf("%-10.2f", matrix2[i][j]);
			}
			if (i == 1) {
				System.out.printf("%s%5s","=", " ");
			} else {
				System.out.printf("%6s", " ");
			}
			for (int j = 0; j < multipleOfTwoMatrix[i].length; j++) {
				System.out.printf("%-10.2f", multipleOfTwoMatrix[i][j]);
			}
			System.out.println();
		}
		
		input.close();
	}
	public static double[][] multiplyMatrix(double[][] a, double[][] b){
		double[][] multipleOfTwoMatrix = new double[3][3];
		
		for (int i = 0; i < multipleOfTwoMatrix.length; i++) {
			for (int j = 0; j < multipleOfTwoMatrix.length; j++) {
				multipleOfTwoMatrix[i][j] = a[i][0] * b[0][j] + a[i][1] * b[1][j] + a[i][2] * b[2][j]; 
			}
		}
		
		return multipleOfTwoMatrix;
	}
}

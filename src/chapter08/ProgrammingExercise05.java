/*
 * (Algebra: add two matrices) Write a method to add two matrices. The header of the method is as follows:
 * 		public static double[][] addMatrix(double[][] a, double[][] b)
 * In order to be added, the two matrices must have the same dimensions and the same or compatible types of elements. Let c be the resulting matrix.
 * Each element cij is aij + bij.
 * Write a test program that prompts the user to enter two 3 * 3 matrices and displays their sum.
 */
package chapter08;

import java.util.Scanner;

public class ProgrammingExercise05 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double[][] matrix1 = new double[3][3];
		double[][] matrix2 = new double[3][3];
		double[][] sumOfTwoMatrix = new double[3][3];
		
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
		
		sumOfTwoMatrix = addMatrix(matrix1,matrix2);
		
		printMatrix(sumOfTwoMatrix);
		
		input.close();
	}
	public static void printMatrix(double[][] sumOfTwoMatrix) {
		for (int i = 0; i < sumOfTwoMatrix.length; i++) {
			for (int j = 0; j < sumOfTwoMatrix[i].length; j++) {
				System.out.printf("%6.2f ",sumOfTwoMatrix[i][j]);
			}
			System.out.println();
		}
	}
	public static double[][] addMatrix(double[][] a, double[][] b){
		double[][] sumMatrix = new double[3][3];
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				sumMatrix[i][j] = a[i][j] + b[i][j];
			}
		}
		
		return sumMatrix;
	}
}

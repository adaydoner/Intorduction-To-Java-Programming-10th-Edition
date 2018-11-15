/*
 * (The Location class) Design a class named Location for locating a maximal  value and its location in a two-dimensional array. 
 * The class contains public data fields row, column, and maxValue that store the maximal value and its indices 
 * in a two-dimensional array with row and column as int types and maxValue as a double type.
 * 
 * Write the following method that returns the location of the largest element in a two-dimensional array:
 * 
 * 		public static Location locateLargest(double[][] a)
 * 
 * The return value is an instance of Location. Write a test program that prompts 
 * the user to enter a two-dimensional array and displays the location of the largest element in the array.
 */
package chapter09;

import java.util.Scanner;

public class ProgrammingExercise13 {
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		Location elementOfMatrice = new Location();
		int row = 0;
		int column = 0;
		System.out.print("Enter the number of rows and columns in the array : ");
		row = input.nextInt();
		column = input.nextInt();

		double[][] matrice = new double[row][column];
		getMatriceValues(matrice);

		elementOfMatrice = locateLargest(matrice);
		System.out.printf("The location of the largest element is %.2f at (%d, %d)", elementOfMatrice.maxValue,elementOfMatrice.indices[0], elementOfMatrice.indices[1]);

	}

	private static void getMatriceValues(double[][] matrice) {
		System.out.println("Enter the array : ");
		for (int i = 0; i < matrice.length; i++) {
			for (int j = 0; j < matrice[i].length; j++) {
				matrice[i][j] = input.nextDouble();
			}
		}
	}

	public static Location locateLargest(double[][] matrice) {
		Location location = new Location();
		location.row = matrice.length;
		location.column = matrice[0].length;
		for (int i = 0; i < location.row; i++) {
			for (int j = 0; j < location.column; j++) {
				if (matrice[i][j] > location.maxValue) {
					location.maxValue = matrice[i][j];
					location.indices[0] = i;
					location.indices[1] = j;
				}
			}
		}
		return location;
	}
}

class Location {
	public int row;
	public int column;
	public double maxValue;
	public int[] indices = new int[2];
}
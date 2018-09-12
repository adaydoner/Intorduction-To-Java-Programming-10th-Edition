/*
 * (Display matrix of 0s and 1s) Write a method that displays an n-by-n matrix using the following header:
 * 
 * 		public static void printMatrix(int n)
 * 
 * Each element is 0 or 1, which is generated randomly. Write a test program that prompts the user to enter n and displays an n-by-n matrix
 */
package chapter06;

import java.util.Scanner;

public class ProgrammingExercise17 {

	private static void printMatrix(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.printf("%2d",(int)(Math.random() * 2));
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter n : ");
		int n = input.nextInt();
		printMatrix(n);
		input.close();
	}
}

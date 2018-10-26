/*
 * (Strictly identical arrays) The two-dimensional arrays m1 and m2 are strictly identical if their corresponding elements are equal. 
 * Write a method that returns true if m1 and m2 are strictly identical, using the following header:
 * 			public static boolean equals(int[][] m1, int[][] m2)
 * Write a test program that prompts the user to enter two 3 * 3 arrays of integers and displays whether the two are strictly identical.
 */
package chapter08;

import java.util.Scanner;

public class ProgrammingExercise28 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[][] list1 = new int[3][3];
		int[][] list2 = new int[3][3];
		System.out.print("Enter list1 :");
		for (int i = 0; i < list1.length; i++) {
			for (int j = 0; j < list1[i].length; j++) {
				list1[i][j] = input.nextInt();
			}
		}
		
		System.out.print("Enter list2 :");
		for (int i = 0; i < list2.length; i++) {
			for (int j = 0; j < list2[i].length; j++) {
				list2[i][j] = input.nextInt();
			}
		}
		
		if(equals(list1, list2)) {
			System.out.println("The two arrays are strictly identical");
		} else {
			System.out.println("The two arrays are not strictly identical");
		}
		
		input.close();
	}
	
	public static boolean equals(int[][] m1, int[][] m2) {
		for (int row = 0; row < m2.length; row++) {
			for (int column = 0; column < m2[row].length; column++) {
				if(m1[row][column] != m2[row][column]) {
					return false;
				}
			}
		}
		
		return true;
	}
}

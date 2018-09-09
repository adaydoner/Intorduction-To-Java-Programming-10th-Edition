/*
 * (Display patterns) Write a method to display a pattern as follows:
 * 
 * 					 1
 * 				   2 1
 * 				 3 2 1
 * 	   ...
 * 	   n n-1 ... 3 2 1
 * 
 * 	The method header is
 * 	public static void displayPattern(int n)
 */
package chapter06;

import java.util.Scanner;

public class ProgrammingExercise06 {

	public static void displayPattern(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n - i; j++) {
				System.out.printf("%4s"," ");
			}
			for (int j = i; j >= 1; j--) {
				System.out.printf("%4d", j);
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int number = input.nextInt();
		displayPattern(number);
		input.close();
	}
}

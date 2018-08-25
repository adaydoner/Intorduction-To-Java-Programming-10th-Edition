/*
 * (Display pyramid) Write a program that prompts the user to enter an integer from
 * 1 to 15 and displays a pyramid,
 */
package chapter05;

import java.util.Scanner;

public class ProgrammingExercise17 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int numberOfLines;
		System.out.print("Enter the number of lines : ");
		numberOfLines = input.nextInt();
		while (numberOfLines < 1 || numberOfLines > 15) {
			System.out.println("Invalid input");
			System.out.print("Enter the number of lines : ");
			numberOfLines = input.nextInt();
		}
		for (int currentLine = 1; currentLine <= numberOfLines; currentLine++) {
			for (int i = 1; i <= numberOfLines - currentLine; i++) {		// Give the right amount space before write numbers
				System.out.printf("%3s", " ");
			}
			for (int number = currentLine; number > 1; number--) {			// this will write from specified numbers to the middle but not "1"
				System.out.printf("%3d", number);
			}
			for (int number = 1; number <= currentLine; number++) {			// this will write from "1" which is located in the middle to the specified numbers for right side of pyramid
				System.out.printf("%3d", number);
			}
			System.out.println();
		}
		input.close();
	}
}
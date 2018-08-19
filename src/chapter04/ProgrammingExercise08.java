/*
 * (Find the character of an ASCII code) Write a program that receives an ASCII code (an integer between 0 and 127) and displays its character.
 */
package chapter04;

import java.util.Scanner;

public class ProgrammingExercise08 {

	public static void main(String[] args) {
		Scanner readNumber = new Scanner(System.in);
		int choice = -1;
		while (choice < 0 || 127 < choice) {
			System.out.print("Enter an ASCII code between (0 - 127) : ");
			choice = readNumber.nextInt();
		}
		char ch = (char)choice;
		System.out.printf("The character for ASCII code" + choice + " is " + ch);
		readNumber.close();
	}
}

/*
 * (Process a string) Write a program that prompts the user to enter a string and displays its length and its first character.
 */
package chapter04;

import java.util.Scanner;

public class ProgrammingExercise20 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String usersString;
		System.out.print("Enter a string : ");
		usersString = input.nextLine();
		System.out.printf("The length of \"%s\" is %d \n", usersString, usersString.length());
		System.out.printf("First character of \"%s\" is %c", usersString, usersString.charAt(0));
		input.close();
	}
}

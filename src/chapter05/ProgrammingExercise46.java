/*
 * (Reverse a string) Write a program that prompts the user to enter a string and displays the string in reverse order
 */
package chapter05;

import java.util.Scanner;

public class ProgrammingExercise46 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String usersInput;
		String reversedString = "";
		System.out.print("Enter a string : ");
		usersInput = input.nextLine();
		for (int i = 0; i < usersInput.length(); i++) {
			reversedString = usersInput.charAt(i) + reversedString;
		}
		System.out.println("The reversed string is " + reversedString);
		input.close();
	}
}

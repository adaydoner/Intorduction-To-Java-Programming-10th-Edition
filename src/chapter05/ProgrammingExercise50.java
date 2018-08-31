/*
 * (Count uppercase letters) Write a program that prompts the user to enter a string and displays the number of the uppercase letters in the string.
 */
package chapter05;

import java.util.Scanner;

public class ProgrammingExercise50 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String usersString;
		int uppercaseCounter = 0;
		System.out.print("Enter a string : ");
		usersString = input.nextLine();
		
		for (int i = 0; i < usersString.length(); i++) {
			if(65 <= usersString.charAt(i) && usersString.charAt(i) <= 90) {
				uppercaseCounter++;
			}
		}
		System.out.println("The number of uppercase letters is " + uppercaseCounter);
		input.close();
	}
}

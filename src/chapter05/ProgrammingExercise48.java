/*	
 * (Process string) Write a program that prompts the user to enter a string and displays the characters at odd positions
 */
package chapter05;

import java.util.Scanner;

public class ProgrammingExercise48 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String usersString;
		System.out.print("Enter a string : ");
		usersString = input.nextLine();
		for (int i = 0; i < usersString.length(); i += 2) {
			System.out.print(usersString.charAt(i));
		}
		input.close();
	}
}

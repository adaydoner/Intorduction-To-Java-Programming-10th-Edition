/*
 * (Count the letters in a string) Write a method that counts the number of letters in a string using the following header:
 * 
 * 		public static int countLetters(String s)
 * 
 * Write a test program that prompts the user to enter a string and displays the number of letters in the string.
 */
package chapter06;

import java.util.Scanner;

public class ProgrammingExercise20 {

	public static int countLetters(String usersString) {
		int letterCounter = 0;
		for (int i = 0; i < usersString.length(); i++) {
			if((usersString.charAt(i) >= 'a' && usersString.charAt(i) <= 'z') || (usersString.charAt(i) >= 'A' && usersString.charAt(i) <= 'Z')) {
				letterCounter++;
			} else {
				continue;
			}
		}
		return letterCounter;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String usersString;
		int counterForLetters;
		System.out.print("Enter a string : ");
		usersString = input.nextLine();
		counterForLetters = countLetters(usersString);
		System.out.println("Number of letters in >>" + usersString + "\n" + counterForLetters);
		input.close();
	}
}

/*
 * (Count vowels and consonants) Assume letters A, E, I, O, and U as the vowels.
 * Write a program that prompts the user to enter a string and displays the number
 * of vowels and consonants in the string.
 */
package chapter05;

import java.util.Scanner;

public class ProgrammingExercise49 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String usersString;
		int numberOfVowels = 0;
		int numberOfConsonants = 0;
		
		System.out.print("Enter a string : ");
		usersString = input.nextLine();
		usersString = usersString.toUpperCase();
		for (int i = 0; i < usersString.length(); i++) {
			if(usersString.charAt(i) == 'A' || usersString.charAt(i) == 'I' || usersString.charAt(i) == 'O' || usersString.charAt(i) == 'U') {
				numberOfVowels++;
			} else {
				numberOfConsonants++;
			}
		}
		System.out.println("The number of vowels is "  + numberOfVowels);
		System.out.println("The number of consonants is " + numberOfConsonants);
		input.close();
	}
}

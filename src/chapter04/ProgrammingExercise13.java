/*
 * (Vowel or consonant?) Write a program that prompts the user to enter a letter and
 * check whether the letter is a vowel or consonant.
 */
package chapter04;

import java.util.Scanner;

public class ProgrammingExercise13 {
	public static String VowelOrConsonant(char letter) {

		letter = Character.toUpperCase(letter);
		if (letter == 'A' || letter == 'E' || letter == 'I' || letter == 'O' || letter == 'U') {
			return "vowel";
		} else if (letter < 'A' || letter > 'Z') {
			return "invalid input";
		} else {
			return "consonant";
		}
	}

	public static void main(String[] args) {
		char letter;
		String status;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a letter : ");
		letter = input.nextLine().charAt(0);
		status = VowelOrConsonant(letter);
		if (status.charAt(0) == 'i') {
			System.out.printf("%c is an %s", letter, status);
		} else {
			System.out.printf("%c is a %s", letter, status);
		}
		input.close();
	}
}

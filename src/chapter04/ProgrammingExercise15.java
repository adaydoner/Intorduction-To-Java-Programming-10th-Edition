/*
 * (Phone key pads) The international standard letter/number mapping found on the telephone is shown below:
 * 
 * Write a program that prompts the user to enter a letter and displays its corresponding number.
 */

package chapter04;

import java.util.Scanner;

public class ProgrammingExercise15 {

	public static int CorrespondingNumber(char letter) {
		letter = Character.toUpperCase(letter);

		if (letter >= 'A' && letter < 'P') {
			int number = 2;
			int n = letter - 'A';
			number = number + (n / 3);
			return number;
		} else if (letter >= 'P' && letter <= 'S') {
			return 7;
		} else if (letter >= 'T' && letter <= 'V') {
			return 8;
		} else if (letter >= 'W' && letter <= 'Z') {
			return 9;
		} else {
			return -1;
		}
	}

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		char letter;
		int correspondingNumber;
		System.out.print("Enter a letter : ");
		letter = input.nextLine().charAt(0);
		correspondingNumber = CorrespondingNumber(letter);
		
		if (correspondingNumber != -1) {
			System.out.printf("The corresponding number is %d", correspondingNumber);
		} else {
			System.out.printf("%s is an invalid input", letter);
		}
		input.close();
	}
}

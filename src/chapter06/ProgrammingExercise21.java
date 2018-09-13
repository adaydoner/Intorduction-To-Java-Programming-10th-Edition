/*
 * (Phone keypads) The international standard letter/number mapping for telephones
 * is shown in Programming Exercise 4.15. Write a method that returns a number,
 * given an uppercase letter, as follows:
 * 
 * 		int getNumber(char uppercaseLetter)
 * 
 * Write a test program that prompts the user to enter a phone number as a string.
 * The input number may contain letters. The program translates a letter (uppercase
 * or lowercase) to a digit and leaves all other characters intact. Here is a sample run
 * of the program:

 */
package chapter06;

import java.util.Scanner;

public class ProgrammingExercise21 {
	public static int getNumber(char uppercaseLetter) {
		int number;
		int n;
		if ('0' <= uppercaseLetter && uppercaseLetter <= '9') {
			return uppercaseLetter;
		}
		if (uppercaseLetter >= 'A' && uppercaseLetter < 'P') {
			number = 2;
			n = uppercaseLetter - 'A';
			number = number + (n / 3);
			return number + '0';
		} else if (uppercaseLetter >= 'P' && uppercaseLetter <= 'S') {
			return 7 + '0';
		} else if (uppercaseLetter >= 'T' && uppercaseLetter <= 'V') {
			return 8 + '0';
		} else if (uppercaseLetter >= 'W' && uppercaseLetter <= 'Z') {
			return 9 + '0';
		} else {
			return uppercaseLetter;
		}
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String usersString;
		int returnedValueAsANumberForChar;
		System.out.print("Enter a string : ");
		usersString = input.nextLine();
		usersString = usersString.toUpperCase();
		for (int i = 0; i < usersString.length(); i++) {
			returnedValueAsANumberForChar = getNumber(usersString.charAt(i));
			System.out.print((char) (returnedValueAsANumberForChar));
		}
		input.close();
	}
}

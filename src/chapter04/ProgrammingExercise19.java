/*
 * (Business: check ISBN-10) Rewrite the Programming Exercise 3.9 by entering the ISBN number as a string.
 */
package chapter04;

import java.util.Scanner;

public class ProgrammingExercise19 {
	private static int CheckSum(int[] isbn) {
		int d10 = 0;
		for (int i = 0; i <= 8; i++) {
			d10 += (isbn[i] * (i + 1));
		}
		return d10 % 11;
	}

	public static void main(String[] args) {
		String enteredNumber;
		int[] isbn = new int[10];
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the first 9 digits of an ISBN as integer : ");
		enteredNumber = input.next();

		for (int i = 8; i >= 0; i--) {
			isbn[i] = enteredNumber.charAt(i) - 48;
		}
		isbn[9] = CheckSum(isbn);

		System.out.print("The ISBN-10 number is ");
		for (int i = 0; i <= 8; i++) {
			System.out.print(isbn[i]);
		}
		if (isbn[9] == 10) {
			System.out.print("X");
		} else {
			System.out.print(isbn[9]);
		}
		input.close();
	}
}

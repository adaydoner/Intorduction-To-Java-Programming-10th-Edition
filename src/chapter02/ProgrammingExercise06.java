/*
 * Chapter 2 Exercise 6:
 *
 *      (Sum the digits in an integer) Write a program that reads an integer
 *       between 0 and 1000 and adds all the digits in the integer.
 *       For example, if an integer is 932, the sum of all its digits is 14.
 *
 */

package chapter02;

import java.util.Scanner;

public class ProgrammingExercise06 {

	private static void sumOfDigits(int number) {
		int firstDigit;
		int secondDigit;
		int thirdDigit;
		firstDigit = number % 10;
		secondDigit = (number / 10) % 10;
		thirdDigit = number / 100;
		System.out.printf("The sum of the digits is %d", (firstDigit + secondDigit + thirdDigit));

	}

	public static void main(String[] args) {
		Scanner readNumber = new Scanner(System.in);
		int number;
		System.out.print("Enter a number between 0 and 1000 : ");
		number = readNumber.nextInt();
		sumOfDigits(number);

		if (readNumber != null) {
			readNumber.close();
		}
	}

}

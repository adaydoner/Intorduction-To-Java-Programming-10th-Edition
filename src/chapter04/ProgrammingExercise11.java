/*
 * (Decimal to hex) Write a program that prompts the user to enter an integer between
 * 0 and 15 and displays its corresponding hex number.
 */
package chapter04;

import java.util.Scanner;

public class ProgrammingExercise11 {

	private static String DecimalToHex(int decimalNumber) {
		if (decimalNumber < 0 || decimalNumber > 15) {
			return null;
		}
		if (decimalNumber <= 9) {
			return Character.toString((char) (decimalNumber + '0'));
		} else {
			return Character.toString((char) (decimalNumber - 10 + 'A'));
		}
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int decimalNumber;
		String hexNumber;
		System.out.println("Enter a decimal value (0 to 15) : ");
		decimalNumber = input.nextInt();

		hexNumber = DecimalToHex(decimalNumber);

		if (hexNumber == null) {
			System.out.printf("%d is an invalid input", decimalNumber);
		} else {
			System.out.println("The hex value is: " + hexNumber);
		}
		input.close();
	}
}

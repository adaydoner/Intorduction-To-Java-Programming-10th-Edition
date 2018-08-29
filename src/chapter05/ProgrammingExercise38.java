/*
 * (Decimal to octal) Write a program that prompts the user to enter a decimal
 * integer and displays its corresponding octal value. Don’t use Java’s Integer.toOctalString(int) in this program.
 */
package chapter05;

import java.util.Scanner;

public class ProgrammingExercise38 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int decimalNumber;
		String enteredNumbersBinaryValue = "";
		int nextBinaryDigit;
		System.out.print("Enter a decimal integer : ");
		decimalNumber = input.nextInt();
		int backupDecimalNumber = decimalNumber;
		if (decimalNumber > 0) {
			while (decimalNumber > 0) {
				nextBinaryDigit = decimalNumber % 8;
				enteredNumbersBinaryValue = nextBinaryDigit + enteredNumbersBinaryValue;
				decimalNumber /= 8;
			}
		}
		System.out.println("Decimal " + backupDecimalNumber + "'s binary value : " + enteredNumbersBinaryValue);
		input.close();

	}
}

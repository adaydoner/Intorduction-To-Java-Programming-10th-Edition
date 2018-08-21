/*
 * (Financial application: monetary units) Rewrite Listing 2.10, ComputeChange.
 * java, to fix the possible loss of accuracy when converting a float value to an int
 * value. Read the input as a string such as "11.56". Your program should extract
 * the dollar amount before the decimal point and the cents after the decimal amount
 * using the indexOf and substring methods
 */
package chapter04;

import java.util.Scanner;

public class ProgrammingExercise26 {

	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);

		// Receive the amount
		System.out.print("Enter an amount in double, for example 11.56: ");
		String amount = input.nextLine();
		String[] decimalPoint = amount.split(",");
		char[] beforeDecimalPoint = decimalPoint[0].toCharArray();
		char[] afterDecimalPoint = decimalPoint[1].toCharArray();
		int beforePoint = 0;
		int afterPoint = 0;
		int power = -1;
		for (int i = beforeDecimalPoint.length - 1; i >= 0; i--) {
			power++;
			beforePoint += (Math.pow(10, power) * (beforeDecimalPoint[i] - 48));
		}
		power = -1;
		for (int i = afterDecimalPoint.length - 1; i >= 0 ; i--) {
			power++;
			afterPoint += Math.pow(10, power) * (afterDecimalPoint[i] - 48);
		}
		// Find the number of one dollars
		int numberOfOneDollars = beforePoint;
		int remainingAmount = afterPoint;

		// Find the number of quarters in the remaining amount
		int numberOfQuarters = remainingAmount / 25;
		remainingAmount = remainingAmount % 25;

		// Find the number of dimes in the remaining amount
		int numberOfDimes = remainingAmount / 10;
		remainingAmount = remainingAmount % 10;

		// Find the number of nickels in the remaining amount
		int numberOfNickels = remainingAmount / 5;
		remainingAmount = remainingAmount % 5;

		// Find the number of pennies in the remaining amount
		int numberOfPennies = remainingAmount;

		// Display results
		System.out.println("Your amount " + amount + " consists of");
		System.out.println(" " + numberOfOneDollars + " dollars");
		System.out.println(" " + numberOfQuarters + " quarters ");
		System.out.println(" " + numberOfDimes + " dimes");
		System.out.println(" " + numberOfNickels + " nickels");
		System.out.println(" " + numberOfPennies + " pennies");
		input.close();
	}
}

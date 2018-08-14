/*
 * (Financial application: monetary units) Rewrite Listing 2.10, ComputeChange.java, 
 * to fix the possible loss of accuracy when converting a double value to an
 * int value. Enter the input as an integer whose last two digits represent the cents.
 * For example, the input 1156 represents 11 dollars and 56 cents.
 */
package chapter02;

import java.util.Scanner;

public class ProgrammingExercise22 {
	public static void SliceIt(double amount) {

		int remainingAmount = (int) (amount * 100);

		// Find the number of one dollars
		int numberOfOneDollars = remainingAmount / 100;
		remainingAmount = remainingAmount % 100;

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

		System.out.println("Your amount " + amount + " consists of \n" + 
				"\t" + numberOfOneDollars + " dollars\n" + 
				"\t" + numberOfQuarters + " quarters\n" + 
				"\t" + numberOfDimes + " dimes\n" + 
				"\t" + numberOfNickels + " nickels\n" + 
				"\t" + numberOfPennies + " pennies");
	}

	public static void main(String[] args) {

		// Create a Scanner
		Scanner readNumber = new Scanner(System.in);

		// Receive the amount
		System.out.print("Enter an amount in double, for example 11.56: ");
		double amount = readNumber.nextDouble();
		SliceIt(amount);
		readNumber.close();
	}
}
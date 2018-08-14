/*
 * (Financial application: monetary units) Modify Listing 2.10, ComputeChange.java, 
 * to display the nonzero denominations only, using singular words for single
 * units such as 1 dollar and 1 penny, and plural words for more than one unit such
 * as 2 dollars and 3 pennies.
 */
package chapter03;

import java.util.Scanner;

public class ProgrammingExercise07 {

	private static void MonetaryUnits(double amount) {
		double remainingMoney = amount * 100;
		int dollars = (int) (remainingMoney / 100);
		remainingMoney %= 100;
		int quarters = (int) (remainingMoney / 25);
		remainingMoney %= 25;
		int dimes = (int) (remainingMoney / 10);
		remainingMoney %= 10;
		int nickels = (int) (remainingMoney / 5);
		remainingMoney %= 5;
		int pennies = (int) (remainingMoney);
		System.out.println("Your amount $" + amount + " consist of");
		if (dollars > 0) {
			System.out.println("\t" + dollars + " dollars");
		}
		if (quarters > 0) {
			System.out.println("\t" + quarters + " quarters");
		}
		if (dimes > 0) {
			System.out.println("\t" + dimes + " dimes");
		}
		if (nickels > 0) {
			System.out.println("\t" + nickels + " nickels");
		}
		if (pennies > 0) {
			System.out.println("\t" + pennies + " pennies");
		}
	}

	public static void main(String[] args) {
		double amount;
		Scanner readNumber = new Scanner(System.in);
		System.out.print("Enter an amount for example 11,56 : ");
		amount = readNumber.nextDouble();
		MonetaryUnits(amount);
		readNumber.close();
	}
}

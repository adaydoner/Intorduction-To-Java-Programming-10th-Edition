/*
 * (Financials: currency exchange) Write a program that prompts the user to enter
 * the exchange rate from currency in U.S. dollars to Chinese RMB. Prompt the user
 * to enter 0 to convert from U.S. dollars to Chinese RMB and 1 to convert from
 * Chinese RMB and U.S. dollars. Prompt the user to enter the amount in U.S. dollars
 * or Chinese RMB to convert it to Chinese RMB or U.S. dollars, respectively.
 */
package chapter03;

import java.util.Scanner;

public class ProgrammingExercise31 {

	public static double ConvertUSDtoRMB(double amount, double exchangeRate) {
		double amountOFUSD;
		amountOFUSD = Math.abs(amount * exchangeRate);
		return amountOFUSD;
	}

	public static double ConvertRMBtoUSD(double amount, double exchangeRate) {
		double amountOfRMB;
		amountOfRMB = Math.abs(amount / exchangeRate);
		return amountOfRMB;
	}

	public static void main(String[] args) {
		double exchangeRate;
		int exchangeChoose;
		double amount;
		double exchangeAmount;
		Scanner readNumber = new Scanner(System.in);
		System.out.print("Enter the exchange rate from dollars to RMB : ");
		exchangeRate = readNumber.nextDouble();
		System.out.print("Enter 0 to convert dollars to RMB and 1 vice versa : ");
		exchangeChoose = readNumber.nextInt();
		if(exchangeChoose == 0) {
			System.out.print("Enter the dollar amount : ");
			amount = readNumber.nextDouble();
			exchangeAmount = ConvertUSDtoRMB(amount,exchangeRate);
			System.out.printf("$%.1f is %.1f yuan",amount,exchangeAmount);
		}
		else if(exchangeChoose == 1){
			System.out.print("Enter the RMB amount : ");
			amount = readNumber.nextDouble();
			exchangeAmount = ConvertRMBtoUSD(amount,exchangeRate);
			System.out.printf("%.1f yuan is $%.2f",amount,exchangeAmount);
		}
		else {
			System.out.print("Incorrect input.");
		}
		readNumber.close();
	}
}

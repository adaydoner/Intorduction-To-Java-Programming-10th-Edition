/*
 * (Financial application: compute the future investment value) Write a method that
 * computes future investment value at a given interest rate for a specified number of years. 
 * The future investment is determined using the formula in Programming Exercise 2.21. Use the following method header:
 * 
 * 		public static double futureInvestmentValue(double investmentAmount, double monthlyInterestRate, int years)
 * 
 * For example, futureInvestmentValue(10000, 0.05/12, 5) returns 12833.59.
 * Write a test program that prompts the user to enter the investment amount (e.g., 1000) 
 * and the interest rate (e.g., 9%) and prints a table that displays future value for the years from 1 to 30
 */
package chapter06;

import java.util.Scanner;

public class ProgrammingExercise07 {

	public static double futureInvestmentValue(double investmentAmount, double monthlyInterestRate, int years) {
		double futureInvestmentValue;
		futureInvestmentValue = investmentAmount * Math.pow((1 + monthlyInterestRate), years*12);
		return futureInvestmentValue;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double investmentAmount;
		double monthlyInterestRate;
		double futureInvestmentValue;
		System.out.print("The amount invested : ");
		investmentAmount = input.nextDouble();
		System.out.print("Annual interest rate (e.g. 9) : ");
		monthlyInterestRate = input.nextDouble() / 1200.0;
		System.out.printf("%5s     %12s\n","Years","Future Value");
		
		for (int i = 1; i <= 30; i++) {
			futureInvestmentValue = futureInvestmentValue(investmentAmount, monthlyInterestRate, i);
			System.out.printf("%-5d     %12.2f\n",i, futureInvestmentValue);
		}
		input.close();
	}
}

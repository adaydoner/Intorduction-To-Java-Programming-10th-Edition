/*
 * (Financial application: calculate future investment value) Write a program that
 * reads in investment amount, annual interest rate, and number of years, and displays
 * the future investment value using the following formula:
 * futureInvestmentValue = investmentAmount * (1 + monthlyInterestRate) power numberOfYears*12
 */
package chapter02;

import java.util.Scanner;

public class ProgrammingExercise21 {
	public static double CalculateFutureInvestmentValue(double amount, double annualInterestRate, int years) {
		double futureInvestmentValue;
		futureInvestmentValue = amount * Math.pow((1 + annualInterestRate / 12.0), years*12);
		return futureInvestmentValue;
	}

	public static void main(String[] args) { 
		Scanner readNumber = new Scanner(System.in);
		double investmentAmount;
		double annualInterestRate;
		int years;
		double futureInvestmentValue;
		System.out.print("Enter investment amount : ");
		investmentAmount = readNumber.nextDouble();
		System.out.print("Enter annual interest rate in percentage : ");
		annualInterestRate = readNumber.nextDouble() / 100;
		System.out.print("Enter number of years : ");
		years = readNumber.nextInt();
		futureInvestmentValue = CalculateFutureInvestmentValue(investmentAmount, annualInterestRate, years);
		System.out.printf("Accumulated value is $%.2f",futureInvestmentValue);
		
		if(readNumber != null) {
			readNumber.close();
		}
	}

}

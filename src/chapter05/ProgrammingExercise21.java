/*
 * (Financial application: compare loans with various interest rates) 
 * Write a program that lets the user enter the loan amount and loan period in number of years
 * and displays the monthly and total payments for each interest rate starting from
 * 5% to 8%, with an increment of 1/8.
 */
package chapter05;

import java.util.Scanner;

public class ProgrammingExercise21 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double loanAmount;
		int loanPeriod;
		System.out.print("Loan Amount : ");
		loanAmount = input.nextDouble();
		System.out.print("Number of Years : ");
		loanPeriod = input.nextInt();
		System.out.printf("%-20s%-20s%-20s\n", "Interest Rate", "Monthly Payment", "Total Payment");
		for (double interestRate = 5; interestRate <= 8; interestRate += (1 / 8.0)) {
			double monthlyPayment = loanAmount * (interestRate / 1200) / (1 - 1 / Math.pow(1 + (interestRate / 1200), loanPeriod * 12));
			double totalPayment = monthlyPayment * loanPeriod * 12;
			System.out.printf("%-5.3f%-15s%-20.2f%-20.2f\n", interestRate," %", monthlyPayment, totalPayment);
		}
		input.close();
	}
}

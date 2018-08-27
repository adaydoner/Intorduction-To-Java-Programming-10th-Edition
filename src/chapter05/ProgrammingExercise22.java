/*
 * (Financial application: loan amortization schedule) The monthly payment for a
 * given loan pays the principal and the interest. The monthly interest is computed
 * by multiplying the monthly interest rate and the balance (the remaining principal).
 * The principal paid for the month is therefore the monthly payment minus
 * the monthly interest. Write a program that lets the user enter the loan amount,number of years, and interest rate and displays the amortization schedule for the loan.
 */
package chapter05;

import java.util.Scanner;

public class ProgrammingExercise22 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double loanAmount;
		int numberOfYears;
		double annualInterestRate;
		System.out.print("Loan Amount : ");
		loanAmount = input.nextDouble();
		System.out.print("Number of Years : ");
		numberOfYears = input.nextInt();
		System.out.print("Annual Interest Rate : ");
		annualInterestRate = input.nextDouble();
		double monthlyPayment = loanAmount * (annualInterestRate / 1200) / (1 - 1 / Math.pow(1 + (annualInterestRate / 1200), numberOfYears * 12));
		double totalPayment = monthlyPayment * numberOfYears * 12;

		System.out.printf("\n%-16s : %.2f $ \n", "Monthly Payment", monthlyPayment);
		System.out.printf("%-16s : %.2f $\n\n", "Total Payment", totalPayment);

		System.out.printf("%-15s%-15s%-15s%-15s\n", "Payment#", "Interest", "Principal", "Balance");
		double balance = loanAmount;
		for (int i = 1; i <= numberOfYears * 12; i++) {
			double interest = (annualInterestRate / 1200) * balance;
			double principal = monthlyPayment - interest;
			balance = balance - principal;
			System.out.printf("%-15d%-15.2f%-15.2f%-15.2f\n", i, interest, principal, balance);
		}
	}
}

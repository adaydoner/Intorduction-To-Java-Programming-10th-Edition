/*
 * (Financial application: compound value) Suppose you save $100 each month
 * into a savings account with the annual interest rate 5%. Thus, the monthly interest
 * rate is 0.05/12 = 0.00417. After the first month, the value in the account becomes
 * 100 * (1 + 0.00417) = 100.417
 * 
 * After the second month, the value in the account becomes
 * (100 + 100.417) * (1 + 0.00417) = 201.252
 * 
 * After the third month, the value in the account becomes
 * (100 + 201.252) * (1 + 0.00417) = 302.507 
 * and so on.
 */

package chapter02;

import java.util.Scanner;

public class ProgrammingExercise13 {
	public static double DisplayAccount(int amount, double annualRate, int months) {
		double account = 0;
		double monthlyRate = (annualRate / 100 ) / 12.0;
		for (int i = 1; i <= months; i++) {
			account = (amount + account) * (1 + monthlyRate);
		}
		return account;
	}
	public static double MonthlyAverageEarnings(double totalAmountOfSavingAccount , int monthlySavingAmount , int months) {
		double averageEarnings;
		averageEarnings = (totalAmountOfSavingAccount - (monthlySavingAmount * months)) / months;
		return averageEarnings;
	}

	public static void main(String[] args) {
		int monthlySavingAmount;
		double annualInterestRate;
		int howManyMonths;
		double finalAccount;
		double monthlyEarning;
		Scanner readNumber = new Scanner(System.in);
		System.out.print("Enter the monthly saving amount : ");
		monthlySavingAmount = readNumber.nextInt();
		System.out.print("Enter annual interest rate : ");
		annualInterestRate = readNumber.nextDouble();
		System.out.print("How many months later you want to see how much money you will have : ");
		howManyMonths = readNumber.nextInt();
		
		finalAccount = DisplayAccount(monthlySavingAmount, annualInterestRate, howManyMonths);
		
		System.out.printf("\nAfter the %d month, the account value is $%.2f \n\n",howManyMonths,finalAccount);
		monthlyEarning = MonthlyAverageEarnings(finalAccount, monthlySavingAmount, howManyMonths);
		System.out.printf("Your monthly earning is $%.2f ",monthlyEarning);		
		if (readNumber != null) {
			readNumber.close();
		}

	}

}

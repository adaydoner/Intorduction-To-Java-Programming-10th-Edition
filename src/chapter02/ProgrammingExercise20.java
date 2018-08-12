/*
 * (Financial application: calculate interest) If you know the balance and the annual
 * percentage interest rate, you can compute the interest on the next monthly payment using the following formula:
 * interest = balance * (annualInterestRate/1200)
 * 
 * Note : I developed ProgramExercise13 more efficiently than book's asks for Exercise13 so it can shows what this question asked
 * and also not just for one month but for how many months you'd like to see.
 * So I'm gonna do this exercise just because not break up the flow.
 */

package chapter02;

import java.util.Scanner;

public class ProgrammingExercise20 {
	
	private static double InterestForNextMonth(double balance, double interestRate) {
		double interestForNextMonth;
		interestForNextMonth = balance * (interestRate / 1200);
		return interestForNextMonth;
	}


	public static void main(String[] args) {
		double balance;
		double interestRate;
		double interestForNextMonth;
		Scanner readNumber = new Scanner(System.in);
		System.out.println("Enter balance and interest rate (e.g., 3 for 3%) : ");
		balance = readNumber.nextDouble();
		interestRate = readNumber.nextDouble();
		interestForNextMonth = InterestForNextMonth(balance,interestRate);
		System.out.printf("The interest is %.5f",interestForNextMonth);
		if(readNumber != null) {
			readNumber.close();
		}
	}
}

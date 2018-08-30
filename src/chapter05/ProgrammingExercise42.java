/*
 * (Financial application: find the sales amount) Rewrite Programming Exercise 5.39 as follows:
 * 
 * 		Use a for loop instead of a do-while loop.
 * 		Let the user enter COMMISSION_SOUGHT instead of fixing it as a constant.
 * 
 * 
 */
package chapter05;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ProgrammingExercise42 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DecimalFormat format = new DecimalFormat("###,###.00");
		double commission = 0;
		System.out.print("How much money you want to earn ? : ");
		commission = input.nextDouble();
		double oldCommission = commission;
		double salesAmount;

		for ( salesAmount = 0.01; commission <= oldCommission; salesAmount += 0.1) {
			if (salesAmount <= 5_000) {
				commission = salesAmount * 0.08;
			} else if (salesAmount <= 10_000) {
				commission = (5_000 * 0.08) + ((salesAmount - 5_000) * 0.1);
			} else if (salesAmount > 10_000) {
				commission = (5_000 * 0.08) + (5_000 * 0.1) + (salesAmount - 10_000) * 0.12;
			}
		}
		input.close();
		System.out.println("You need $" + format.format(salesAmount) + " sales amount to make a commission of $" + oldCommission);
	}
}

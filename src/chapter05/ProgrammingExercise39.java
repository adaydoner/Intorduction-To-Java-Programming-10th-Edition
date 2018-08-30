/*
 * (Financial application: find the sales amount) You have just started a sales job
 * in a department store. Your pay consists of a base salary and a commission. The
 * base salary is $5,000. The scheme shown below is used to determine the commission rate.
 * 		Sales Amount 			Commission Rate
 * 		$0.01–$5,000 			8 percent
 * 		$5,000.01–$10,000 		10 percent
 * 		$10,000.01 and above 	12 percent
 * 
 * Note that this is a graduated rate. The rate for the first $5,000 is at 8%, the next
 * $5000 is at 10%, and the rest is at 12%. If the sales amount is 25,000, the commission
 * is 5,000 * 8% + 5,000 * 10% + 15,000 * 12% = 2,700.
 * Your goal is to earn $30,000 a year. Write a program that finds the minimum sales
 * you have to generate in order to make $30,000.
 */
package chapter05;

import java.text.DecimalFormat;

public class ProgrammingExercise39 {

	public static void main(String[] args) {
		DecimalFormat format = new DecimalFormat("###,###.00");
		double commission = 0;
		double salesAmount = 0.01;
		do {
			salesAmount += 0.01;

			if (salesAmount <= 5_000) {
				commission = salesAmount * 0.08;
			} else if (salesAmount <= 10_000) {
				commission = (5_000 * 0.08) + ((salesAmount - 5_000) * 0.1);
			} else if (salesAmount > 10_000) {
				commission = (5_000 * 0.08) + (5_000 * 0.1) + (salesAmount - 10_000) * 0.12;
			}
		} while (commission < 30_000);

		System.out.println("You need $" + format.format(salesAmount) + " sales amount to make a commission of $30.000");
	}
}

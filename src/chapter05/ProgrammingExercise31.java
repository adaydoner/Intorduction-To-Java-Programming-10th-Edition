/*
 * (Financial application: compute CD value) Suppose you put $10,000 into a CD
 * with an annual percentage yield of 5.75%. After one month, the CD is worth
 * 
 * 		10000 + 10000 * 5.75 / 1200 = 10047.92
 * 
 * After two months, the CD is worth
 * 
 * 		10047.91 + 10047.91 * 5.75 / 1200 = 10096.06
 * 
 * After three months, the CD is worth
 * 
 * 		10096.06 + 10096.06 * 5.75 / 1200 = 10144.44
 * 
 * and so on. Write a program that prompts the user to enter an amount (e.g., 10000), the
 * annual percentage yield (e.g., 5.75), and the number of months (e.g., 18) and
 * displays a table
 */
package chapter05;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ProgrammingExercise31 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DecimalFormat format = new DecimalFormat("##.00");
		double depositAmount;
		double annualPercentageYield;
		int month;
		double cdValue = 0;
		System.out.print("Enter the initial deposit amount : ");
		depositAmount = input.nextDouble();
		cdValue = depositAmount;
		System.out.print("Enter annual percentage yield : ");
		annualPercentageYield = input.nextDouble();
		System.out.print("Enter maturity period (number of months) : ");
		month = input.nextInt();
		System.out.printf("%5s\t%8s\n","Month","CD Value");
		for (int i = 1; i <= month ; i++) {
			cdValue += depositAmount * (annualPercentageYield / 1200);
			System.out.printf("%-5d\t%s\n",i,format.format(cdValue));
		}
		input.close();
	}
}

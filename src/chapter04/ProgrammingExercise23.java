/*
 * (Financial application: payroll) Write a program that reads the following information and prints a payroll statement:
 * Employee’s name (e.g., Smith)
 * Number of hours worked in a week (e.g., 10)
 * Hourly pay rate (e.g., 9.75)
 * Federal tax withholding rate (e.g., 20%)
 * State tax withholding rate (e.g., 9%)
 */
package chapter04;

import java.util.Scanner;

public class ProgrammingExercise23 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String name;
		double workedHours;
		double payRate;
		double federalTaxRate;
		double stateTaxRate;
		System.out.print("Enter employee's name : ");
		name = input.nextLine();
		System.out.print("Enter number of hours worked in a week : ");
		workedHours = input.nextDouble();
		System.out.print("Enter hourly pay rate : ");
		payRate = input.nextDouble();
		System.out.print("Enter federal tax withholding rate : ");
		federalTaxRate = input.nextDouble();
		System.out.print("Enter state tax withholding rate : ");
		stateTaxRate = input.nextDouble();

		double federalWithHolding = (payRate * workedHours) * federalTaxRate;
		double stateWithHolding = (payRate * workedHours) * stateTaxRate;
		double grossPay = payRate * workedHours;
		double totalDeduction = federalWithHolding + stateWithHolding;
		double netPay = grossPay - totalDeduction;

		System.out.printf("Employee Name     : %s \n", name);
		System.out.printf("Hours Worked      : %.2f \n", workedHours);
		System.out.printf("Pay Rate          : $%.2f \n", payRate);
		System.out.printf("Gross Pay         : $%.2f \n", grossPay);
		System.out.println("Deductions        :");
		System.out.println("   Federal Withholding ( " + federalTaxRate * 100 + "% ) : $" + federalWithHolding);
		System.out.println("   State Withholding ( " + stateTaxRate * 100 + "% )    : $" + stateWithHolding);
		System.out.printf("   Total Deduction               : $%.2f \n", totalDeduction);
		System.out.printf("Net Pay           : $%.2f", netPay);
		input.close();
	}
}

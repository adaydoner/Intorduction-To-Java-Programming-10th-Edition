/*
 * (Financial application: compute tax) Rewrite Listing 3.5, ComputeTax.java, using arrays. For each filing status, there are six tax rates. 
 * Each rate is applied to a certain amount of taxable income.
 * For example, from the taxable income of $400,000 for a single filer, 
 * $8,350 is taxed at 10%, 
 * (33,950 - 8,350) at 15%, 
 * (82,250 - 33,950) at 25%, 
 * (171,550 - 82,550) at 28%, 
 * (372,550 - 82,250) at 33%, and 
 * (400,000 - 372,950) at 36%. 
 * The six rates are the same for all filing statuses, which can be represented in the following array:
 * 				double[] rates = {0.10, 0.15, 0.25, 0.28, 0.33, 0.35};
 * 
 * The brackets for each rate for all the filing statuses can be represented in a twodimensional array as follows:
 * 				int[][] brackets = {
 * 				{8350, 33950, 82250, 171550, 372950}, 	// Single filer
 *				{16700, 67900, 137050, 20885, 372950}, 	// Married jointly
 * 														// -or qualifying widow(er)
 *	 			{8350, 33950, 68525, 104425, 186475}, 	// Married separately
 * 				{11950, 45500, 117450, 190200, 372950} 	// Head of household 
 * 								  };
 * Suppose the taxable income is $400,000 for single filers. The tax can be computed as follows:
 * 				tax = brackets[0][0] * rates[0] +
 * 				(brackets[0][1] – brackets[0][0]) * rates[1] +
 * 				(brackets[0][2] – brackets[0][1]) * rates[2] +
 * 				(brackets[0][3] – brackets[0][2]) * rates[3] +
 *				(brackets[0][4] – brackets[0][3]) * rates[4] +
 * 				(400000 – brackets[0][4]) * rates[5]
 */
package chapter08;

import java.util.Scanner;

public class ProgrammingExercise12 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int status;
		double income;
		double tax;
		double[] rates = { 0.10, 0.15, 0.25, 0.28, 0.33, 0.35 };
		int[][] brackets = 
			{ 
				{ 8350, 33950, 82250, 171550, 372950 }, 	// Single filer
				{ 16700, 67900, 137050, 171550, 372950 }, 	// Married jointly or qualifying widow(er)
				{ 8350, 33950, 68525, 104425, 186475 }, 	// Married separately
				{ 11950, 45500, 117450, 190200, 372950 } 	// Head of household
			};
		System.out.print("0 - single filer"
						+ "\n1 - married jointly or qualifying widow(er)"
						+ "\n2 - married separately"
						+ "\n3 - head of household)"
						+ "\nEnter the filing status: ");
		status = input.nextInt();
		
		System.out.print("Enter the taxable income: ");
		income = input.nextDouble();
		tax = computeTax(brackets,rates,status,income);
		System.out.println("Tax is " + (int)(tax * 100) / 100.0);
		
		input.close();
	}

	public static double computeTax(int[][] brackets, double[] rates, int status, double income) {
		double tax = 0;
		if (income <= brackets[status][0]) {
			tax = income * rates[0];
		} else if(income <= brackets[status][1]) {
			tax = brackets[status][0] * rates[0] + 
					(income - brackets[status][0]) * rates[1];
		} else if(income <= brackets[status][2]) {
			tax = brackets[status][0] * rates[0] + 
					(brackets[status][1] - brackets[status][0]) * rates[1] + 
					(income - brackets[status][1]) * rates[2];
		} else if (income <= brackets[status][3]) {
			tax = brackets[status][0] * rates[0] + 
					(brackets[status][1] - brackets[status][0]) * rates[1] + 
					(brackets[status][2] - brackets[status][1]) * rates[2] + 
					(income - brackets[status][2]) * rates[3];
		} else if (income <= brackets[status][4]) {
			tax = brackets[status][0] * rates[0] + 
					(brackets[status][1] - brackets[status][0]) * rates[1] +
					(brackets[status][2] - brackets[status][1]) * rates[2] +
					(brackets[status][3] - brackets[status][2]) * rates[3] + 
					(income - brackets[status][3]) * rates[4];
		} else {
			tax = brackets[status][0] * rates[0] +
					(brackets[status][1] - brackets[status][0]) * rates[1] +
					(brackets[status][2] - brackets[status][1]) * rates[2] +
					(brackets[status][3] - brackets[status][2]) * rates[3] + 
					(brackets[status][4] - brackets[status][3]) * rates[4] + 
					(income - brackets[status][4]) * rates[5];
		}
		return tax;
	}
}

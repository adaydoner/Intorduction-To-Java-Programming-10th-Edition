package chapter10;
import Classes.*;
/**
 * (Financial: the Tax class) Programming Exercise 8.12 writes a program for computing taxes using arrays. 
 * Design a class named Tax to contain the following instance data fields:
 * 		int filingStatus: One of the four tax-filing statuses: 0—single filer, 1— married filing jointly or qualifying widow(er), 2—married filing separately, 
 * 							and 3—head of household. Use the public static constants SINGLE_FILER (0), MARRIED_JOINTLY_OR_QUALIFYING_WIDOW(ER) (1), MARRIED_SEPARATELY (2), 
 * 							HEAD_OF_HOUSEHOLD (3) to represent the statuses.
 * 
 * 		int[][] brackets: Stores the tax brackets for each filing status.
 * 		double[] rates: Stores the tax rates for each bracket.
 * 		double taxableIncome: Stores the taxable income.
 * 		
 * Provide the getter and setter methods for each data field and the getTax() method that returns the tax. 
 * Also provide a no-arg constructor and the constructor Tax(filingStatus, brackets, rates, taxableIncome).
 * Draw the UML diagram for the class and then implement the class. Write a test
 * program that uses the Tax class to print the 2001 and 2009 tax tables for taxable
 * income from $50,000 to $60,000 with intervals of $1,000 for all four statuses.The tax rates for the year 2009 were given in Table 3.2.
 * 
 * @author Ali Dogan Aydoner
 *
 */
public class ProgrammingExercise08 {
	public static void main(String[] args) {
		double[] rates = { 0.10, 0.15, 0.25, 0.28, 0.33, 0.35 };
		int[][] brackets = 
			{ 
				{ 8350, 33950, 82250, 171550, 372950 }, 	// Single filer
				{ 16700, 67900, 137050, 171550, 372950 }, 	// Married jointly or qualifying widow(er)
				{ 8350, 33950, 68525, 104425, 186475 }, 	// Married separately
				{ 11950, 45500, 117450, 190200, 372950 } 	// Head of household
			};
		System.out.printf("%-13s%-10s%-13s%-10s%-13s%-10s%-13s%-10s%-13s\n", "Taxable", " ", "Single", " ", "Married Joint", " ", "Married", " ", "Head of");
		System.out.printf("%-13s%-10s%-13s%-10s%-13s%-10s%-13s%-10s%-13s\n", "Income", " ", " ", " ", "or Qualifying", " ", "Seperate", " ", "a House");
		System.out.printf("%46s%-13s%47s\n", " ", "Widow(er)", " ");
		System.out.println("---------------------------------------------------------------------------------------------------------------");
		for (int i = 50000; i < 60000; i += 1000) {
			System.out.printf("%-13d%-10s%-13f%-10s%-13f%-10s%-13f%-10s%-13f\n",
			i,"",
			new Tax(Tax.SINGLE_FILER, brackets, rates, i).getTax(),"",
			new Tax(Tax.MARRIED_JOINTLY_OR_QUALIFYING_WIDOW_ER, brackets, rates, i).getTax(),"",
			new Tax(Tax.MARRIED_SEPARATELY, brackets, rates, i).getTax(),"",
			new Tax(Tax.HEAD_OF_HOUSEHOLD, brackets, rates, i).getTax());
		}
		
	}
}

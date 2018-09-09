/*
 * (Financial application: compute commissions) Write a method that computes the
 * commission, using the scheme in Programming Exercise 5.39. The header of the method is as follows:
 * 
 * 		public static double computeCommission(double salesAmount)
 * 
 * Write a test program that displays the table shown in book.
 */
package chapter06;

public class ProgrammingExercise11 {
	public static double computeCommission(double salesAmount) {
		double commission = 0;
		if (salesAmount <= 5_000) {
			commission = salesAmount * 0.08;
		} else if (salesAmount <= 10_000) {
			commission = (5_000 * 0.08) + ((salesAmount - 5_000) * 0.1);
		} else if (salesAmount > 10_000) {
			commission = (5_000 * 0.08) + (5_000 * 0.1) + (salesAmount - 10_000) * 0.12;
		}
		return commission;
		
	}
	public static void main(String[] args) {
		System.out.printf("%12s%7s%10s\n", "Sales Amount", " ", "Commission");
		System.out.println("-------------------------------");
		for (int salesAmount = 10_000; salesAmount <= 100_000; salesAmount += 5000) {
			double commission;
			commission = computeCommission(salesAmount);
			System.out.printf("%12d%7s%10.1f\n",salesAmount," ",commission);
			
		}
	}
}

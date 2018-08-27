/*
 * (Compute pi) You can approximate p by using the following series:
 * pi = 4(1 - 1/3 + 1/5 - 1/7 + 1/9 - ... + (-1)pow i+1 / 2i - 1)
 * 
 * Write a program that displays the p value for i = 10000, 20000, …, and 100000.
 */
package chapter05;

public class ProgrammingExercise25 {

	public static void main(String[] args) {
		double piWith10k = 0.0;
		double piWith20k = 0.0;
		double piWith100k = 0.0;
		for (int i = 1, counter = 1; counter <= 10000; i += 2, counter++) {
			if (counter % 2 == 1) {
				piWith10k += 1.0 / i;
			} else {
				piWith10k -= 1.0 / i;
			}
		}
		System.out.println("pi value for i = 10.000 = " + 4 * piWith10k);
		//**********************************************************************************************
		for (int i = 1, counter = 1; counter <= 20000; i += 2, counter++) {
			if (counter % 2 == 1) {
				piWith20k += 1.0 / i;
			} else {
				piWith20k -= 1.0 / i;
			}
		}
		System.out.println("pi value for i = 20.000 = " + 4 * piWith20k);
		//**********************************************************************************************
		for (int i = 1, counter = 1; counter <= 100000; i += 2, counter++) {
			if (counter % 2 == 1) {
				piWith100k += 1.0 / i;
			} else {
				piWith100k -= 1.0 / i;
			}
		}
		System.out.println("pi value for i = 100.000 = " + 4 * piWith100k);
		//**********************************************************************************************
		System.out.println("\nMath.PI method : " + Math.PI);
	}
}
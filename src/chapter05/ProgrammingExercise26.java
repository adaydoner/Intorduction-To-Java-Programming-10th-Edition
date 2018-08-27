/*
 * (Compute e)
 * Write a program that displays the e value for i = 10000, 20000, …, and 100000.
 */
package chapter05;

public class ProgrammingExercise26 {
	public static double fact(int number) {
		double factOfNumber = 1.0;
		for (int i = number; i >= 1; i--) {
			factOfNumber *= i;
		}
		return factOfNumber;
	}

	public static void main(String[] args) {
		double e = 1.0;
		for (int i = 1; i <= 10_000; i++) {
			e += 1 / fact(i);
		}
		e = 1.0;
		for (int i = 1; i <= 20_000; i++) {
			e += 1 / fact(i);
		}
		e = 1.0;
		for (int i = 1; i <= 100_000; i++) {
			e += 1 / fact(i);
		}
		System.out.printf("%-30s%.20f\n", "e value for i = 10.000 : ", e);
		System.out.printf("%-30s%.20f\n", "e value for i = 20.000 : ", e);
		System.out.printf("%-30s%.20f\n", "e value for i = 100.000 : ", e);
		System.out.printf("%-30s%.20f\n", "e value for Math.E method : ", Math.E);
	}
}

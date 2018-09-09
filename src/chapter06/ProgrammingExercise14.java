/*
 * (Estimate p) p can be computed using the following series
 * 
 * 	m(i) = 4(1 - 1/3 + 1/5 - 1/7 + 1/9 - 1/11 + ... + (-1)pow(i+1) / 2i - 1
 * 
 * Write a method that returns m(i) for a given i and write a test program that displays like the table shown in book.
 */
package chapter06;

public class ProgrammingExercise14 {

	private static double computePi(int numberThatFindPiOverIt) {
		double piValue = 0;
		for (int i = 1; i <= numberThatFindPiOverIt; i += 2) {
			if ((i + 3) % 4 == 0) {
				piValue += (1.0 / i);
			} else {
				piValue -= (1.0 / i);
			}
		}
		return (4 * piValue);
	}

	public static void main(String[] args) {
		System.out.printf("%3s%12s%2s\n", "i", " ", "m(i)");
		System.out.println("-----------------");
		for (int i = 1; i <= 901; i += 100) {
			double pi;
			pi = computePi(i);
			System.out.printf("%3d%9s%7.4f\n", i, " ", pi);
		}
	}
}

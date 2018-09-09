/*
 * (Sum series) Write a method to compute the following series:
 * 
 * 	m(i) = 1/2 + 2/3 + ... + i/i+1
 * 
 * Write a test program that displays like the table shown in book.
 */
package chapter06;

public class ProgrammingExercise13 {

	private static double computeSum(int num) {
		double sum = 0;
		for (double i = 1; i <= num ; i++) {
			sum += i / (i + 1);
		}
		return sum;
	}

	public static void main(String[] args) {
		System.out.printf("%2s%12s%2s\n","i"," ","m(i)");
		System.out.println("-----------------");
		for (int i = 1; i <= 20; i++) {
			double sum ;
			sum = computeSum(i);
			System.out.printf("%2d%9s%7.4f\n",i," ",sum);
		}
	}
}

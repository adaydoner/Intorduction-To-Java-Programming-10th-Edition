/*
 * (Summation)
 */
package chapter05;

import java.text.DecimalFormat;

public class ProgrammingExercise35 {

	public static void main(String[] args) {
		DecimalFormat format = new DecimalFormat("##.00");
		double summation = 0;
		for (int i = 1; i <= 624; i++) {
			summation += 1.0 / (Math.sqrt(i) + Math.sqrt(i + 1));
		}
		System.out.println(format.format(summation));
	}
}

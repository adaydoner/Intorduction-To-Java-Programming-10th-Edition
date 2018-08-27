/*
 * (Sum a series) Write a program to sum the following series:
 * 1/3 + 3/5 + 5/7 + ... + 95/97 + 	97/99
 */
package chapter05;

public class ProgrammingExercise24 {

	public static void main(String[] args) {
		double summary = 0.0;
		for (double i = 1, j = 3; i <= 97; i += 2, j += 2) {
			summary += (i / j);
		}

		System.out.println("summary = " + summary);
	}
}

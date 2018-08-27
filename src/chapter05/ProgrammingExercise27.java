/*
 * (Display leap years) Write a program that displays all the leap years, ten per line,,
 * from 101 to 2100, separated by exactly one space. Also display the number of
 * leap years in this period.
 */
package chapter05;

public class ProgrammingExercise27 {

	public static void main(String[] args) {
		int counter = 0;
		for (int i = 101; i <= 2100; i++) {
			if (i % 400 == 0 || (i % 4 == 0 && i % 100 != 0)) {
				counter++;
				System.out.printf("%d ", i);
				if (counter % 10 == 0) {
					System.out.println();
				}
			}
		}
		System.out.println("\nNumber of leap years : " + counter);
	}
}

/*
 * (Conversion from miles to kilometers) Write a program that displays the following
 * table (note that 1 mile is 1.609 kilometers):
 */
package chapter05;

public class ProgrammingExercise04 {

	public static void main(String[] args) {
		final double MILES_TO_KM = 1.609;
		System.out.println("Miles\tKilometers");
		for (int i = 1; i <= 10; i ++) {
			System.out.printf("%-5d\t%-10.3f\n", i, (i * MILES_TO_KM));
		}
	}
}

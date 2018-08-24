/*
 * (Conversion from miles to kilometers) Write a program that displays the following two tables side by side:
 */
package chapter05;

public class ProgrammingExercise06 {

	public static void main(String[] args) {
		final double MILES_TO_KM = 1.609;
		System.out.printf("%-10s%10s\t|\t%-10s%10s\n","Miles","Kilometers","Kilometers","Miles");
		for (int i = 1, j = 20; i <= 10; i ++ , j += 5) {
			System.out.printf("%-10d%10.3f\t|\t%-10d%10.3f\n",i, i*MILES_TO_KM,j,(j / MILES_TO_KM));
		}
	}
}

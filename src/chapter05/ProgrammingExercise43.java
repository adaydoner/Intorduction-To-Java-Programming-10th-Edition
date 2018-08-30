/*
 * (Math: combinations) Write a program that displays all possible combinations
 * for picking two numbers from integers 1 to 7. Also display the total number of all combinations.
 */
package chapter05;

public class ProgrammingExercise43 {

	public static void main(String[] args) {
		int total = 0;
		for (int i = 1; i <= 7; i++) {
			for (int j = 1; j <= 7; j++) {
				System.out.println(i + " " + j);
				total += j;
			}
			total += i;
		}
		System.out.println("\nThe total number of all combinations is " + total);
		System.out.println();
		total = 0;
		for (int i = 1; i <= 7; i++) {
			for (int j = i; j <= 7; j++) {
				System.out.println(i + " " + j);
				total += j;
			}
			total += i;
		}
		System.out.println("\nThe total number of all combinations is " + total);

	}
}

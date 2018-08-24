/*
 * (Conversion from kilograms to pounds and pounds to kilograms) Write a program
 * that displays the following two tables side by side:
 */
package chapter05;

public class ProgrammingExercise05 {

	public static void main(String[] args) {
		final double KGtoPounds = 2.2;
		System.out.printf("%-10s%10s\t|\t%-10s%10s\n","Kilograms","Pounds","Pounds","Kilograms");
		for (int i = 1, j = 20; i < 200; i += 2 , j += 5) {
			System.out.printf("%-10d%10.1f\t|\t%-10d%10.2f\n",i, i*KGtoPounds,j,(j / KGtoPounds));
		}
	}
}

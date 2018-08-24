/*
 * (Conversion from kilograms to pounds and pounds to kilograms) Write a program
 * that displays the following two tables side by side:
 */
package chapter05;

public class ProgrammingExercise05 {

	public static void main(String[] args) {
		final double KGtoPounds = 2.2;
		System.out.printf("%-6s\t%6s  \t|\t%-9s\t%6s\n","Kilograms","Pounds","Pounds","Kilograms");
		for (int i = 1, j = 20; i < 200; i += 2 , j += 5) {
			System.out.printf("%-6d\t\t%6.1f  \t|\t%-6d\t\t   %6.2f\n",i, i*KGtoPounds,j,(j / KGtoPounds));
		}
	}
}

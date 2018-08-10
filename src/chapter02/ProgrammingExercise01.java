/*
 * Chapter 2 Exercise 1:
 *      (Convert Celsius to Fahrenheit) Write a program that reads a Celsius degree
 *      in a double value from the console, then converts it to Fahrenheit and displays the result.
 *
 *          fahrenheit = (9 / 5) * celsius + 32
 */
package chapter02;

import java.util.Scanner;

public class ProgrammingExercise01 {
	
	public static void celsiusIntoFahrenheit(double celsiusDegree) {
		double fahrenheitDegree;
		fahrenheitDegree = (9.0 / 5) * celsiusDegree + 32;
		System.out.printf("%.1f celsius = %.1f Fahrenheit", celsiusDegree, fahrenheitDegree);

	}

	public static void main(String[] args) {
		double celsius;
		Scanner readNumber = new Scanner(System.in);
		System.out.print("Celsius Degree : ");
		celsius = readNumber.nextDouble();
		celsiusIntoFahrenheit(celsius);

		if (readNumber != null) {
			readNumber.close();
		}
	}

}

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
	public static double CelsiusToFahrenheit(double celsiusDegree) {
		double fahrenheitDegree;
		fahrenheitDegree = (9.0/5) * celsiusDegree + 32;
		return fahrenheitDegree;
	}

	public static void main(String[] args) {
		double celsius ;
		double fahrenheit;
		Scanner readNumber = new Scanner(System.in);
		
		System.out.print("Celsius Degree : "); // 43(.)9 invalid  --- 43(,)9 valid
		celsius = readNumber.nextDouble();
		fahrenheit = CelsiusToFahrenheit(celsius);
		
		//System.out.println(celsius + " celsius degree equal to " + fahrenheit + " Fahrenheit.");
		System.out.printf("%.1f celsius = %.1f Fahrenheit",celsius,fahrenheit);
		
		if(readNumber!=null) {readNumber.close();}
	}

}

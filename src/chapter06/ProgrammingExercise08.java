/*
 * (Conversions between Celsius and Fahrenheit) Write a class that contains the following two methods:
 * 
 * 			Convert from Celsius to Fahrenheit
 * 			public static double celsiusToFahrenheit(double celsius)
 * 
 * 			Convert from Fahrenheit to Celsius
 * 			public static double fahrenheitToCelsius(double fahrenheit)
 * 
 * Display the results in table that shown in book.
 * 
 */
package chapter06;

public class ProgrammingExercise08 {
	public static double celsiusToFahrenheit(double celsius) {
		double fahrenheit = (9.0 / 5) * celsius + 32;
		return fahrenheit;
	}
	public static double fahrenheitToCelsius(double fahrenheit) {
		double celsius = (5.0 / 9) * (fahrenheit - 32);
		return celsius;
	}
	
	public static void main(String[] args) {
		System.out.printf("%-7s       %-10s       %s       %-10s       %-7s\n","Celsius","Fahrenheit","|","Fahrenheit","Celsius");
		System.out.println("-----------------------------------------------------------------");
		for (double celsius = 40.0, fahrenheit = 120.0; celsius >= 31 ; celsius--,fahrenheit -= 10) {
			double fahrenheitFromCelsius = celsiusToFahrenheit(celsius);
			double celsiusFromFahrenheit = fahrenheitToCelsius(fahrenheit);
			System.out.printf("%-7.1f       %-10.1f       %s       %-10.1f       %-7.2f\n",celsius,fahrenheitFromCelsius,"|",fahrenheit,celsiusFromFahrenheit);
		}

	}

}

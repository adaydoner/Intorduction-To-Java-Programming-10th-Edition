/*
 * (Science: wind-chill temperature) Programming Exercise 2.17 gives a formula
 * to compute the wind-chill temperature. The formula is valid for temperatures in
 * the range between −58ºF and 41ºF and wind speed greater than or equal to 2.
 * Write a program that prompts the user to enter a temperature and a wind speed.
 * The program displays the wind-chill temperature if the input is valid; otherwise,
 * it displays a message indicating whether the temperature and/or wind speed is invalid.
 */
package chapter03;

import java.util.Scanner;

public class ProgrammingExercise20 {
	private static double CalculateWindChillTemperature(double outsideTemperature, double windSpeed) {
		double windChilIndex;
		windChilIndex = 35.74 + 0.6215 * outsideTemperature - 35.75 * Math.pow(windSpeed, 0.16)
				+ 0.4275 * outsideTemperature * Math.pow(windSpeed, 0.16);
		windChilIndex = ((int) (windChilIndex * 100000) / 100000.0); // to get rid of lots of numbers after comma
		return windChilIndex;
	}

	public static void main(String[] args) {
		double outsideTemperature = 42;
		double windSpeed = 0;
		double windChillIndex;
		Scanner readNumber = new Scanner(System.in);
		while (true) {
			System.out.print("Temperature in Fahrenheit between -58F and 41F and wind speed (>=2) in miles/h : ");
			outsideTemperature = readNumber.nextDouble();
			windSpeed = readNumber.nextDouble();
			if ((outsideTemperature > 41 || outsideTemperature < -58) && windSpeed < 2) {
				System.out.println("Temperature and windspeed is invalid.\n");
			} 
			else if (outsideTemperature > 41 || outsideTemperature < -58) {
				System.out.println("Temperature is invalid.\n");
			} 
			else if (windSpeed < 2) {
				System.out.println("Windspeed is invalid.\n");
			} 
			else {
				windChillIndex = CalculateWindChillTemperature(outsideTemperature, windSpeed);
				System.out.println("The wind chill index is " + windChillIndex + "\n");
			}
		}
	}
}

/*
 * (Science: wind-chill temperature) How cold is it outside? The temperature alone
 * is not enough to provide the answer. Other factors including wind speed, relative
 * humidity, and sunshine play important roles in determining coldness outside.
 * In 2001, the National Weather Service (NWS) implemented the new wind-chill
 * temperature to measure the coldness using temperature and wind speed.
 */
package chapter02;

import java.util.Scanner;

public class ProgrammingExercise17 {


	private static double CalculateWindChillTemperature(double outsideTemperature, double windSpeed) {
		double windChilIndex;
		windChilIndex = 35.74 + 0.6215 * outsideTemperature - 35.75 * Math.pow(windSpeed, 0.16) + 0.4275 * outsideTemperature * Math.pow(windSpeed, 0.16);
		windChilIndex = ((int)(windChilIndex * 100000) / 100000.0); // For get rid of lots of numbers after comma
		return windChilIndex;
	}

	public static void main(String[] args) {
		double outsideTemperature;
		double windSpeed;
		double windChillIndex;
		Scanner readNumber = new Scanner(System.in);
		do {
		System.out.print("Enter the temperature in Fahrenheit between -58°F and 41°F : ");
		outsideTemperature = readNumber.nextDouble();
		}while(outsideTemperature > 41 || outsideTemperature < -58);
		
		do {
		System.out.print("Enter the wind speed (>=2) in miles per hour : ");
		windSpeed = readNumber.nextDouble();
		}while(windSpeed < 2);
		
		windChillIndex = CalculateWindChillTemperature(outsideTemperature,windSpeed);
		System.out.println("The wind chill index is " + windChillIndex);
		
		if(readNumber != null) {
			readNumber.close();
		}
	}

}

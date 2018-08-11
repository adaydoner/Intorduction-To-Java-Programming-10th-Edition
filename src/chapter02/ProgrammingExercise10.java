/*
 * Chapter 2 Exercise 10:
 *
 *      (Science: calculating energy)(Science: calculating energy) Write a program that calculates the energy needed
 *      to heat water from an initial temperature to a final temperature. Your program
 *      should prompt the user to enter the amount of water in kilograms and the initial and final temperatures of the water.
 */

package chapter02;

import java.util.Scanner;

public class ProgrammingExercise10 {
	public static double CalculateNeededEnergy(double waterInKg, double initialTemp, double finalTemp) {
		double energy;
		energy = waterInKg * (finalTemp - initialTemp ) * 4184 ;
		return energy;
	}

	public static void main(String[] args) {
		double waterInKg;
		double initialTemperature;
		double finalTemperature;
		double neededEnergy;
		Scanner readNumber = new Scanner(System.in);
		System.out.print("Enter the amount of water in kilograms : ");
		waterInKg = readNumber.nextDouble();
		System.out.print("Enter the initial temperature : ");
		initialTemperature = readNumber.nextDouble();
		System.out.print("Enter the final temperature : ");
		finalTemperature = readNumber.nextDouble();
		neededEnergy = CalculateNeededEnergy(waterInKg, initialTemperature, finalTemperature);
		System.out.printf("The energy needed is %5.1f ",neededEnergy);
		
		if(readNumber != null) {
			readNumber.close();
		}

	}

}

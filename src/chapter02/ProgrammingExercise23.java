/*
 * (Cost of driving) Write a program that prompts the user to enter the distance to
 * drive, the fuel efficiency of the car in miles per gallon, and the price per gallon,
 * and displays the cost of the trip.
 */
package chapter02;

import java.util.Scanner;

public class ProgrammingExercise23 {


	private static double CalculateCostOfDriving(double drivingDistance, double milesPerGallon, double pricePerGallon) {
		double costOfDriving;
		costOfDriving = (drivingDistance / milesPerGallon) * pricePerGallon;
		return costOfDriving;
	}

	public static void main(String[] args) {
		double drivingDistance;
		double milesPerGallon;
		double pricePerGallon;
		double costOfDriving;
		Scanner readNumber = new Scanner(System.in);
		System.out.print("Enter the driving distance : ");
		drivingDistance = readNumber.nextDouble();
		System.out.print("Enter miles per gallon : ");
		milesPerGallon = readNumber.nextDouble();
		System.out.print("Enter price per gallon : ");
		pricePerGallon = readNumber.nextDouble();
		costOfDriving = CalculateCostOfDriving(drivingDistance,milesPerGallon,pricePerGallon);
		System.out.printf("The cost of driving is $%.2f",costOfDriving);
		
		if(readNumber != null) {
			readNumber.close();
		}

	}
}

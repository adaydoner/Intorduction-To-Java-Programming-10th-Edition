/*
 * (Central city) Given a set of cities, the central city is the city that has the shortest
 * total distance to all other cities. Write a program that prompts the user to enter
 * the number of the cities and the locations of the cities (coordinates), and finds the central city and its total distance to all other cities.
 */
package chapter08;

import java.util.Scanner;

public class ProgrammingExercise21 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int numberOfCities;
		System.out.print("Enter the number of cities : ");
		numberOfCities = input.nextInt();
		System.out.print("Enter the coordinates of the cities : ");
		double[][] coordinatesOfCities = new double[numberOfCities][2];

		for (int i = 0; i < numberOfCities; i++) { // x and y for all cities.
			coordinatesOfCities[i][0] = input.nextDouble();
			coordinatesOfCities[i][1] = input.nextDouble();
		}

		findCentralCity(coordinatesOfCities);
		
		input.close();
	}

	public static void findCentralCity(double[][] coordinatesOfCities) {
		double[] totalDistance = new double[coordinatesOfCities.length];
		for (int i = 0; i < coordinatesOfCities.length; i++) {
			double distance = 0;
			for (int j = 0; j < coordinatesOfCities.length; j++) {
				if(j == i) continue;
				distance = findDistance(coordinatesOfCities[i][0], coordinatesOfCities[i][1], coordinatesOfCities[j][0], coordinatesOfCities[j][1]);
				totalDistance[i] += distance;
			}
		}
		double shortestTotalDistance = Double.MAX_VALUE;
		int shortestTotalDistancesIndex = 0;
		for (int i = 0; i < totalDistance.length; i++) {
			if(totalDistance[i] < shortestTotalDistance) {
				shortestTotalDistance = totalDistance[i];
				shortestTotalDistancesIndex = i;
			}
		}
		
		System.out.printf("The central city is at ( %.2f , %.2f )",coordinatesOfCities[shortestTotalDistancesIndex][0], coordinatesOfCities[shortestTotalDistancesIndex][1]);
		System.out.printf("The total distance to all other cities is %.2f",shortestTotalDistance);
	}

	public static double findDistance(double x1, double y1, double x2, double y2) {
		double distance;
		distance = Math.abs(Math.sqrt(Math.pow(x2 - x1 , 2) + Math.pow(y2 - y1, 2)));
		return distance;
	}

}

/*
 * (Geometry: great circle distance) The great circle distance is the distance between
 * two points on the surface of a sphere. Let (x1, y1) and (x2, y2) be the geographical
 * latitude and longitude of two points.
 * 
 * d = radius * arccos(sin(x1) * sin(x2) + cos(x1) * cos(x2) * cos(y1 - y2))
 * 
 * Write a program that prompts the user to enter the latitude and longitude of two
 * points on the earth in degrees and displays its great circle distance.
 */
package chapter04;

import java.util.Scanner;

public class ProgrammingExercise02 {

	private static void GreatCircleDistance(double point1x, double point1y, double point2x, double point2y) {
		double greatDistance;
		final double AVERAGE_EARTH_RADIUS = 6371.01;
		greatDistance = AVERAGE_EARTH_RADIUS * Math.acos(Math.sin(Math.toRadians(point1x)) * Math.sin(Math.toRadians(point2x)) + 
				Math.cos(Math.toRadians(point1x)) * Math.cos(Math.toRadians(point2x)) * Math.cos(Math.toRadians(point1y - point2y)));
		System.out.printf("The distance between the two points is %f km",greatDistance);
		
	}


	public static void main(String[] args) {
		Scanner readNumber = new Scanner(System.in);
		double point1Latitude;
		double point1Longitude;
		double point2Latitude;
		double point2Longitude;
		System.out.print("Enter point 1 (latitude and longitude) in degrees : ");
		point1Latitude = readNumber.nextDouble();
		point1Longitude = readNumber.nextDouble();
		System.out.print("Enter point 2 (latitude and longitude) in degrees:");
		point2Latitude = readNumber.nextDouble();
		point2Longitude = readNumber.nextDouble();
		GreatCircleDistance(point1Latitude,point1Longitude,point2Latitude,point2Longitude);
		readNumber.close();
	}
}

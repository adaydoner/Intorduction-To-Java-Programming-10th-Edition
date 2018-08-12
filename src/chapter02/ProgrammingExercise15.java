/*
 * (Geometry: distance of two points) Write a program that prompts the user to enter
 * two points (x1, y1) and (x2, y2) and displays their distance between them.
 * 
 * The formula for computing the distance is SquareRoot((x2 - x1)2 + (y2 - y1)2) 
 */

package chapter02;

import java.util.Scanner;

public class ProgrammingExercise15 {


	private static double FindDistanceOfPoints(double x1, double y1, double x2, double y2) {
		double calculation;
		calculation = Math.pow((Math.pow(x2 - x1, 2)) + Math.pow(y2 - y1, 2), 0.5);
		return calculation;
	}

	public static void main(String[] args) {
		double x1;
		double y1;
		double x2;
		double y2;
		double distanceOfTwo;
		Scanner readNumber = new Scanner(System.in);
		System.out.print("Enter x1 and y1 : ");
		x1 = readNumber.nextDouble();
		y1 = readNumber.nextDouble();
		System.out.print("Enter x2 and y2 : ");
		x2 = readNumber.nextDouble();
		y2 = readNumber.nextDouble();
		distanceOfTwo = FindDistanceOfPoints(x1,y1,x2,y2);
		System.out.println("The distance between the two points is " + distanceOfTwo);
		
		if(readNumber != null) {
			readNumber.close();
		}
	}
}

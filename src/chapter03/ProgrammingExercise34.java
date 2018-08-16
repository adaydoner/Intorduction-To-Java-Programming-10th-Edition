/*
 * (Geometry: point on line segment) Programming Exercise 3.32 shows how to test
 * whether a point is on an unbounded line. Revise Programming Exercise 3.32 to
 * test whether a point is on a line segment. Write a program that prompts the user
 * to enter the three points for p0, p1, and p2 and displays whether p2 is on the line segment from p0 to p1.
 */
package chapter03;

import java.util.Scanner;

public class ProgrammingExercise34 {

	private static void CheckIfPointLiesOnSegment(double point0x, double point0y, double point1x, double point1y, double point2x, double point2y) {
		double formula;
		double distanceOfPoints01;
		double distanceOfPoints02;
		double distanceOfPoints12;
		formula = (point1x - point0x) * (point2y - point0y) - (point2x - point0x) * (point1y - point0y);
		distanceOfPoints01 = (int)(Math.pow((Math.pow(point1x - point0x, 2)) + Math.pow(point1y - point0y, 2), 0.5) * 1000) / 1000.0;
		distanceOfPoints02 = (int)(Math.pow((Math.pow(point2x - point0x, 2)) + Math.pow(point2y - point0y, 2), 0.5) * 1000) / 1000.0;
		distanceOfPoints12 = (int)(Math.pow((Math.pow(point2x - point1x, 2)) + Math.pow(point2y - point1y, 2), 0.5) * 1000) / 1000.0;
		if(formula == 0 && distanceOfPoints01 == distanceOfPoints02 + distanceOfPoints12) {
			System.out.printf("(%.1f, %.1f) is on the line segment from (%.1f, %.1f) to (%.1f, %.1f)",point2x,point2y,point0x,point0y,point1x,point1y);
		}
		else {
			System.out.printf("(%.1f, %.1f) is not on the line segment from (%.1f, %.1f) to (%.1f, %.1f)",point2x,point2y,point0x,point0y,point1x,point1y);
		}
	}

	public static void main(String[] args) {
		Scanner readNumber = new Scanner(System.in);
		double point0x;
		double point0y;
		double point1x;
		double point1y;
		double point2x;
		double point2y;
		System.out.print("Enter three points for p0, p1, and p2 : ");
		point0x = readNumber.nextDouble();
		point0y = readNumber.nextDouble();
		point1x = readNumber.nextDouble();
		point1y = readNumber.nextDouble();
		point2x = readNumber.nextDouble();
		point2y = readNumber.nextDouble();
		CheckIfPointLiesOnSegment(point0x, point0y, point1x, point1y, point2x, point2y);
		readNumber.close();
	}
}

/*
 * (Geometry: intersecting point) Write a method that returns the intersecting point of two lines.
 * The intersecting point of the two lines can be found by using the formula shown in Programming Exercise 3.25.
 * Assume that (x1, y1) and (x2, y2) are the two points on line 1 and (x3, y3) and (x4, y4) are on line 2.
 * 			public static double[] getIntersectingPoint(double[][] points)
 * The points are stored in a 4-by-2 two-dimensional array points with (points[0][0], points[0][1]) for (x1, y1).
 * The method returns the intersecting point or null if the two lines are parallel.
 * Write a program that prompts the user to enter four points and displays the intersecting point. 
 * See Programming Exercise 3.25 for a sample run.
 */
package chapter08;

import java.util.Scanner;

public class ProgrammingExercise31 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double[][] pointsOfTwoLines = new double[4][2];
		double[] intersectingPoint = new double[2];
		System.out.print("Enter four points , x1 y1 x2 y2 x3 y3 x4 y4 : ");
		for (int i = 0; i < pointsOfTwoLines.length; i++) {
			for (int j = 0; j < pointsOfTwoLines[i].length; j++) {
				pointsOfTwoLines[i][j] = input.nextDouble();
			}
		}
		intersectingPoint = getIntersectingPoint(pointsOfTwoLines);
		
		if(intersectingPoint == null) {
			System.out.println("Two lines are parallel.");
		} else {
			System.out.println("x : " + intersectingPoint[0] + "\ny : " + intersectingPoint[1]);
		}
		
		input.close();
	}
	public static double[] getIntersectingPoint(double[][] points) {
		double[] intersectingPoint = new double[2];
		double a = points[0][1] - points[1][1];
		double b = -points[0][0] + points[1][0];
		double e = (points[0][1] - points[1][1]) * points[0][0] - (points[0][0] - points[1][0]) * points[0][1];
		double c = points[2][1] - points[3][1];
		double d = -points[2][0] + points[3][0];
		double f = (points[2][1] - points[3][1]) * points[2][0] - (points[2][0] - points[3][0]) * points[2][1];
		
		if (a * d - b * c == 0) {
			intersectingPoint = null;
		} else {
			intersectingPoint[0] = ((e * d) - (b * f)) / ((a * d) - (b * c));
			intersectingPoint[1] = ((a * f) - (e * c)) / ((a * d) - (b * c));
		}
		
		return intersectingPoint;
	}
}

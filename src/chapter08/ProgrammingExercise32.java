/*
 * (Geometry: area of a triangle) Write a method that returns the area of a triangle using the following header:
 * 		public static double getTriangleArea(double[][] points)
 * The points are stored in a 3-by-2 two-dimensional array points with points[0] [0] and points[0][1] for (x1, y1).
 * The triangle area can be computed using the formula in Programming Exercise 2.19. The method returns 0 if the three points are on the same line.
 * Write a program that prompts the user to enter three points of a triangle and displays the triangle's area.
 */
package chapter08;

import java.util.Scanner;

public class ProgrammingExercise32 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double[][] trianglePoints = new double[3][2];
		double area = 0 ;
		System.out.print("Enter x1, y1, x2, y2, x3, y3 : ");
		for (int i = 0; i < trianglePoints.length; i++) {
			for (int j = 0; j < trianglePoints[i].length; j++) {
				trianglePoints[i][j] = input.nextDouble();
			}
		}
		area = getTriangleArea(trianglePoints);
		
		if(area == 0) {
			System.out.println("The three points are on the same line");
		} else {
			System.out.printf("The area of the triangle is %.2f",area);
		}
		
		input.close();
	}
	
	
	
	public static double getTriangleArea(double[][] points) {
		double side1 = FindDistanceOfPoints(points[0][0], points[0][1], points[1][0], points[1][1]);
		double side2 = FindDistanceOfPoints(points[0][0], points[0][1], points[2][0], points[2][1]);
		double side3 = FindDistanceOfPoints(points[2][0], points[2][1], points[1][0], points[1][1]);
		double s = (side1 + side2 + side3) / 2;
		double area = s * (s - side1) * (s - side2) * (s - side3);

		if (area < 0.000001)
			return 0;
		else
			return Math.sqrt(area);
	}

	private static double FindDistanceOfPoints(double x1, double y1, double x2, double y2) {
		double calculation;
		calculation = Math.pow((Math.pow(x2 - x1, 2)) + Math.pow(y2 - y1, 2), 0.5);
		return calculation;
	}
}

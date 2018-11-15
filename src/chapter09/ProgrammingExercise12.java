/*
 * (Geometry: intersecting point) Suppose two line segments intersect. 
 * The two endpoints for the first line segment are (x1, y1) and (x2, y2) and for the second line segment are (x3, y3) and (x4, y4). 
 * Write a program that prompts the user to enter these four endpoints and displays the intersecting point. 
 * As discussed in Programming Exercise 3.25, the intersecting point can be found by solving a linear equation.
 * Use the LinearEquation class in Programming Exercise 9.11 to solve this equation. 
 */
package chapter09;

import java.util.Scanner;

public class ProgrammingExercise12 {
	static Scanner input = new Scanner(System.in);
	static int X = 0;
	static int Y = 1;

	public static void main(String[] args) {
		double[][] pointsCoordinates = new double[4][2];
		getPoints(pointsCoordinates);
		intersectingPoint(pointsCoordinates);
		
	}

	public static void intersectingPoint(double[][] pointsCoordinates) {
		double a = pointsCoordinates[0][Y] - pointsCoordinates[1][Y];
		double b = -pointsCoordinates[0][X] + pointsCoordinates[1][X];
		double c = pointsCoordinates[2][Y] - pointsCoordinates[3][Y];
		double d = -pointsCoordinates[2][X] + pointsCoordinates[3][X];
		double e = (a * pointsCoordinates[0][X]) - (-b * pointsCoordinates[0][Y]);
		double f = (c * pointsCoordinates[2][X]) - (-d * pointsCoordinates[2][Y]);
		double intersectingPointsX = 0;
		double intersectingPointsY = 0;
		LinearEquation equation = new LinearEquation(a, b, c, d, e, f);
		
		if(!equation.isSolvable()){
			System.out.println("Two lines are parrallel.");
		} else {
			intersectingPointsX = equation.getX();
			intersectingPointsY = equation.getY();
			System.out.printf("The intersecting point is at (%.2f , %.2f)", intersectingPointsX,intersectingPointsY);
		}
		
	}

	public static void getPoints(double[][] pointsCoordinates) {
		System.out.println("Enter two endpoint for two line (e.g : 1 1 2 2 4 4 8 8) : ");
		for (int i = 0; i < pointsCoordinates.length; i++) {
			for (int j = 0; j < pointsCoordinates[i].length; j++) {
				pointsCoordinates[i][j] = input.nextDouble();
			}
		}
	}
}

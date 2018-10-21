/*
 * (Geometry: same line?) Programming Exercise 6.39 gives a method for testing whether three points are on the same line.
 * Write the following method to test whether all the points in the array points are on the same line.
 * 			public static boolean sameLine(double[][] points)
 * 
 * Write a program that prompts the user to enter five points and displays whether they are on the same line.
 */
package chapter08;

import java.util.Scanner;

public class ProgrammingExercise15 {
	static Scanner input = new Scanner(System.in);
	static final int NUMBER_OF_POINTS = 5;

	public static void main(String[] args) {

		double[][] points = new double[NUMBER_OF_POINTS][2];
		getCoordinatesOfPoints(points);
		if (checkIfAllPointsAreOnSameLine(points)) {
			System.out.println("The " + NUMBER_OF_POINTS + " points are on the same line");
		} else {
			System.out.println("The " + NUMBER_OF_POINTS + " points are not on the same line");
		}

	}

	public static void getCoordinatesOfPoints(double[][] points) {
		System.out.print("Enter " + NUMBER_OF_POINTS + " points : ");
		for (int i = 0; i < points.length; i++) {
			for (int j = 0; j < 2; j++) {
				points[i][j] = input.nextDouble();
			}
		}
	}

	public static boolean checkIfAllPointsAreOnSameLine(double[][] points) {
		boolean areAllPointsOnSameLine = true;
		for (int i = 0; i < points.length; i++) {
			for (int j = i + 1; j < points.length; j++) {
				for (int k = j + 1; k < points.length; k++) {
					// if any of point combination aren't on the same line then specified numbers aren't on the same line
					if(!onTheSameLine(points[i][0], points[i][1], points[j][0], points[j][1], points[k][0], points[k][1])) { 
						areAllPointsOnSameLine = false;
					}
				}
			}
		}
		return areAllPointsOnSameLine;
	}

	public static boolean onTheSameLine(double x0, double y0, double x1, double y1, double x2, double y2) {
		double formula = calculateFormula(x0, y0, x1, y1, x2, y2);
		if (formula == 0) {
			return true;
		}
		return false;
	}

	public static double calculateFormula(double x0, double y0, double x1, double y1, double x2, double y2) {
		double formula;
		formula = (x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0);
		return formula;
	}
}

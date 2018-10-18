/*
 * (All closest pairs of points) Revise Listing 8.3, FindNearestPoints.java, to display all closest pairs of points with the same minimum distance.
 */
package chapter08;

import java.util.Scanner;

public class ProgrammingExercise08 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int numberOfPoints;
		System.out.print("Enter the number of points : ");
		numberOfPoints = input.nextInt();
		double[][] points = new double[numberOfPoints][2];
		double shortestDistance = Integer.MAX_VALUE;
		double[][] closestPairOfPoints = new double[numberOfPoints][4];
		int closestPairOfPointsWriter = 0;
		System.out.println("Enter " + numberOfPoints + " points : ");
		for (int i = 0; i < numberOfPoints; i++) {
			points[i][0] = input.nextInt();
			points[i][1] = input.nextInt();
		}

		for (int i = 0; i < points.length; i++) {
			for (int j = i + 1; j < points.length; j++) {
				double distance = distance(points[i][0], points[i][1], points[j][0], points[j][1]);
				if (shortestDistance == distance) {
					closestPairOfPoints[closestPairOfPointsWriter][0] = points[i][0];
					closestPairOfPoints[closestPairOfPointsWriter][1] = points[i][1];
					closestPairOfPoints[closestPairOfPointsWriter][2] = points[j][0];
					closestPairOfPoints[closestPairOfPointsWriter][3] = points[j][1];
					closestPairOfPointsWriter++;
				} else if (shortestDistance > distance) {
					shortestDistance = distance;
					clearArray(closestPairOfPoints);
					closestPairOfPointsWriter = 0;
					closestPairOfPoints[closestPairOfPointsWriter][0] = points[i][0];
					closestPairOfPoints[closestPairOfPointsWriter][1] = points[i][1];
					closestPairOfPoints[closestPairOfPointsWriter][2] = points[j][0];
					closestPairOfPoints[closestPairOfPointsWriter][3] = points[j][1];
					closestPairOfPointsWriter++;
				}
			}
		}
		printAllClosestPoints(closestPairOfPoints,shortestDistance);

		input.close();
	}

	public static void printAllClosestPoints(double[][] closestPairOfPoints, double shortestDistance) {
		for (int i = 0; i < closestPairOfPoints.length; i++) {
				if(closestPairOfPoints[i][0] == 0 && closestPairOfPoints[i][1] == 0 && closestPairOfPoints[i][2] == 0 && closestPairOfPoints[i][3] == 0) continue;
				System.out.println("The closest two points are " + closestPairOfPoints[i][0] + "," + closestPairOfPoints[i][1] + " and " + closestPairOfPoints[i][2] + "," + closestPairOfPoints[i][3]);
		}
		System.out.println("Their distance is " + shortestDistance);
	}

	public static void clearArray(double[][] closestPairOfPoints) {
		for (int i = 0; i < closestPairOfPoints.length; i++) {
			for (int j = 0; j < closestPairOfPoints[i].length; j++) {
				closestPairOfPoints[i][j] = 0;
			}
		}
	}

	public static double distance(double x1, double y1, double x2, double y2) {
		return Math.abs(Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1)));
	}
}

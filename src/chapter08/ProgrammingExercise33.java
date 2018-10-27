/*
 * (Geometry: polygon subareas) A convex 4-vertex polygon is divided into four triangles, as shown in Figure 8.9.
 * Write a program that prompts the user to enter the coordinates of four vertices and displays the areas of the four triangles in increasing order.
 */
package chapter08;

import java.util.Scanner;

public class ProgrammingExercise33 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double[][] fourVerticesPoints = new double[4][2];
		double[] areaOfSmallTriangles = new double[fourVerticesPoints.length];
		double[][] furthestPoints = new double[2][2];
		double[][] otherPoints = new double[2][2];
		System.out.print("Enter x1, y1, x2, y2, x3, y3, x4, y4 : ");

		for (int i = 0; i < fourVerticesPoints.length; i++) {
			for (int j = 0; j < fourVerticesPoints[i].length; j++) {
				fourVerticesPoints[i][j] = input.nextDouble();
			}
		}

		furthestPoints = findFurthestPoints(fourVerticesPoints);
		otherPoints = findOtherPointsThanFurthestOnes(fourVerticesPoints, furthestPoints);
		double[] centerPoint = getIntersectingOfFourPoints(otherPoints, furthestPoints);
		//double[] centerPoint = { 0.597701149, -0.2528735632 };
		// calculate all small triangles areas
		areaOfSmallTriangles = areaOfallTrianglesCombine(otherPoints, furthestPoints, centerPoint);
		sortAreas(areaOfSmallTriangles);
		printSortedAreas(areaOfSmallTriangles);

		input.close();
	}

	public static double[][] findOtherPointsThanFurthestOnes(double[][] fourVerticesPoints, double[][] furthestPoints) {
		double[][] otherPoints = new double[2][2];
		int writer = 0;
		for (int i = 0; i < fourVerticesPoints.length; i++) {
				if((fourVerticesPoints[i] != furthestPoints[0] && fourVerticesPoints[i] != furthestPoints[1])) {
					otherPoints[writer] = fourVerticesPoints[i];
					writer++;
				}
		}
		return otherPoints;
	}

	public static double[][] findFurthestPoints(double[][] fourVerticesPoints) {
		double longestDistance = 0;
		double[][] furthestTwoPoints = new double[2][2];
		for (int i = 0; i < fourVerticesPoints.length; i++) {
			double distance;
			for (int j = +1; j < fourVerticesPoints.length; j++) {
				distance = findDistanceOfPoints(fourVerticesPoints[i][0], fourVerticesPoints[i][1], fourVerticesPoints[j][0], fourVerticesPoints[j][1]);
				if (distance > longestDistance) {
					longestDistance = distance;
					furthestTwoPoints[0] = fourVerticesPoints[i];
					furthestTwoPoints[1] = fourVerticesPoints[j];
				}
			}
		}
		return furthestTwoPoints;
	}

	public static double[] getIntersectingOfFourPoints(double[][] otherPoints, double[][] furthestPoints) {
		double[] intersectingPoint = new double[2];
		double a = furthestPoints[0][1] - furthestPoints[1][1];
		double b = -(furthestPoints[0][0] - furthestPoints[1][0]);
		double c = otherPoints[0][1] - otherPoints[1][1];
		double d = -(otherPoints[0][0] - otherPoints[1][0]);
		double e = (furthestPoints[0][1] - furthestPoints[1][1]) * furthestPoints[0][0] - (furthestPoints[0][0] - furthestPoints[1][0]) * furthestPoints[0][1];
		double f = (otherPoints[0][1] - otherPoints[1][1]) * otherPoints[0][0] - (otherPoints[0][0] - otherPoints[1][0]) * otherPoints[0][1];
		
		if (a * d - b * c == 0) {
			return null;
		}
		intersectingPoint[0] = (e * d - b * f) / (a * d - b * c);
		intersectingPoint[1] = (a * f - e * c) / (a * d - b * c);

		return intersectingPoint;
	}

	public static double[] areaOfallTrianglesCombine(double[][] otherPoints, double[][] furthestPoints, double[] centerPoint) {
		double[] area = new double[4];
		int writer = 0;
		for (int i = 0; i < otherPoints.length; i++) {
			for (int j = 0; j < furthestPoints.length; j++) {
				double side1 = findDistanceOfPoints(otherPoints[i][0], otherPoints[i][1], furthestPoints[j][0], furthestPoints[j][1]);
				double side2 = findDistanceOfPoints(otherPoints[i][0], otherPoints[i][1], centerPoint[0], centerPoint[1]);
				double side3 = findDistanceOfPoints(centerPoint[0], centerPoint[1], furthestPoints[j][0], furthestPoints[j][1]);
				double s = (side1 + side2 + side3) / 2;
				if (s == 0)	continue;
				area[writer] = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
				writer++;
			}
		}
		return area;
	}

	public static double findDistanceOfPoints(double x1, double y1, double x2, double y2) {
		double calculation;
		calculation = Math.pow((Math.pow(x2 - x1, 2)) + Math.pow(y2 - y1, 2), 0.5);
		return calculation;
	}

	public static void sortAreas(double[] areaOfSmallTriangles) {
		for (int i = 0; i < areaOfSmallTriangles.length; i++) {
			double temp;
			for (int j = i + 1; j < areaOfSmallTriangles.length; j++) {
				if (areaOfSmallTriangles[j] < areaOfSmallTriangles[i]) {
					temp = areaOfSmallTriangles[i];
					areaOfSmallTriangles[i] = areaOfSmallTriangles[j];
					areaOfSmallTriangles[j] = temp;
				}
			}
		}
	}

	public static void printSortedAreas(double[] areaOfSmallTriangles) {
		for (int i = 0; i < areaOfSmallTriangles.length; i++) {
			System.out.printf("%.3f ", areaOfSmallTriangles[i]);
		}
	}
}

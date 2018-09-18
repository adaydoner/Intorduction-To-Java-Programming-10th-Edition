/*
 * (Geometry: point position) Programming Exercise 3.32 shows how to test whether 
 * a point is on the left side of a directed line, on the right, or on the same line. Write 
 * the methods with the following headers:
 * 
 * 
 * 		public static boolean leftOfTheLine(double x0, double y0,double x1, double y1, double x2, double y2)
 * 		public static boolean onTheSameLine(double x0, double y0,double x1, double y1, double x2, double y2)
 * 		public static boolean onTheLineSegment(double x0, double y0,double x1, double y1, double x2, double y2)
 * 
 * 
 * Write a program that prompts the user to enter the three points for p0, p1, and p2 
 * and displays whether p2 is on the left of the line from p0 to p1, right, the same 
 * line, or on the line segment
 * 
 */
package chapter06;

import java.util.Scanner;

public class ProgrammingExercise39 {
	public static double calculateFormula(double x0, double y0, double x1, double y1, double x2, double y2) {
		double formula;
		formula = (x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0);
		return formula;
	}
	/**
	 * Return true if point (x2, y2) is on the left side of the directed line from (x0, y0) to (x1, y1)
	 */
	public static boolean leftOfTheLine(double x0, double y0, double x1, double y1, double x2, double y2) {
		double formula = calculateFormula(x0, y0, x1, y1, x2, y2);
		if (formula > 0) {
			return true;
		}
		return false;
	}
	/**
	 * Return true if point (x2, y2) is on the right side of the directed line from (x0, y0) to (x1, y1)
	 */
	public static boolean rightOfTheLine(double x0, double y0, double x1, double y1, double x2, double y2) {
		double formula = calculateFormula(x0, y0, x1, y1, x2, y2);
		if(formula < 0) {
			return true;
		}
		return false;
	}


	/**
	 * Return true if point (x2, y2) is on the same line from (x0, y0) to (x1, y1)
	 */
	public static boolean onTheSameLine(double x0, double y0, double x1, double y1, double x2, double y2) {
		double formula = calculateFormula(x0, y0, x1, y1, x2, y2);
		if (formula == 0) {
			return true;
		}
		return false;
	}

	/**
	 * Return true if point (x2, y2) is on the line segment from (x0, y0) to (x1,
	 * y1)
	 */
	public static boolean onTheLineSegment(double x0, double y0, double x1, double y1, double x2, double y2) {
		double formula = calculateFormula(x0, y0, x1, y1, x2, y2);
		if (formula <= 0.0000000001 && ((x0 <= x2 && x2 <= x1) || (x0 >= x2 && x2 >= x1))) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double point0x;
		double point0y;
		double point1x;
		double point1y;
		double point2x;
		double point2y;
		System.out.print("Enter three points for p0, p1, and p2 : ");
		point0x = input.nextDouble();
		point0y = input.nextDouble();
		point1x = input.nextDouble();
		point1y = input.nextDouble();
		point2x = input.nextDouble();
		point2y = input.nextDouble();
		if (leftOfTheLine(point0x, point0y, point1x, point1y, point2x, point2y)) {
			System.out.printf("(%.1f, %.1f) is on the left side of the line from (%.1f, %.1f) to (%.1f, %.1f)", point2x, point2y, point0x, point0y, point1x, point1y);
		} else if (rightOfTheLine(point0x, point0y, point1x, point1y, point2x, point2y)) {
			System.out.printf("(%.1f, %.1f) is on the right side of the line from (%.1f, %.1f) to (%.1f, %.1f)", point2x, point2y, point0x, point0y, point1x, point1y);
		} else if(onTheLineSegment(point0x, point0y, point1x, point1y, point2x, point2y)) {
			System.out.printf("(%.1f, %.1f) is on the line segment (%.1f, %.1f) to (%.1f, %.1f)", point2x, point2y, point0x, point0y, point1x, point1y);
		} else if (onTheSameLine(point0x, point0y, point1x, point1y, point2x, point2y)) {
			System.out.printf("(%.1f, %.1f) is on the line from (%.1f, %.1f) to (%.1f, %.1f)", point2x, point2y, point0x, point0y, point1x, point1y);
		}

		input.close();
	}
}

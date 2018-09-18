/*
 * (Geometry: point position) Given a directed line from point p0(x0, y0) to p1(x1,
 * y1), you can use the following condition to decide whether a point p2(x2, y2) is
 * on the left of the line, on the right, or on the same line
 * 
 * (x1 - x0)*(y2 - y0) - (x2 - x0)*(y1 - y0) > 0 => p2 is on the left side of the line
 * (x1 - x0)*(y2 - y0) - (x2 - x0)*(y1 - y0) = 0 => p2 is on the same line
 * (x1 - x0)*(y2 - y0) - (x2 - x0)*(y1 - y0) < 0 => p2 is on the right side of the line
 * 
 * Write a program that prompts the user to enter the three points for p0, p1, and p2
 * and displays whether p2 is on the left of the line from p0 to p1, on the right, or on
 * the same line.
 */
package chapter03;

import java.util.Scanner;

public class ProgrammingExercise32 {

	public static void StatesOfThirdPoint(double point0x, double point0y, double point1x, double point1y, double point2x, double point2y) {
		double formula;
		formula = (point1x - point0x) * (point2y - point0y) - (point2x - point0x) * (point1y - point0y);
		if(formula > 0) {
			System.out.printf("(%.1f, %.1f) is on the left side of the line from (%.1f, %.1f) to (%.1f, %.1f)",point2x,point2y,point0x,point0y,point1x,point1y);
		}
		else if (formula == 0) {
			System.out.printf("(%.1f, %.1f) is on the line from (%.1f, %.1f) to (%.1f, %.1f)",point2x,point2y,point0x,point0y,point1x,point1y);
		}
		else {
			System.out.printf("(%.1f, %.1f) is on the right side of the line from (%.1f, %.1f) to (%.1f, %.1f)",point2x,point2y,point0x,point0y,point1x,point1y);
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
		System.out.println("Enter three points for p0, p1, and p2 : ");
		point0x = readNumber.nextDouble();
		point0y = readNumber.nextDouble();
		point1x = readNumber.nextDouble();
		point1y = readNumber.nextDouble();
		point2x = readNumber.nextDouble();
		point2y = readNumber.nextDouble();
		StatesOfThirdPoint(point0x,point0y,point1x,point1y,point2x,point2y);
		readNumber.close();
	}
}

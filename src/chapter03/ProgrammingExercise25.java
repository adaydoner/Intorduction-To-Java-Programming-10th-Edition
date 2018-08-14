/*
 * (Geometry: intersecting point) Two points on line 1 are given as (x1, y1) and (x2,
 * y2) and on line 2 as (x3, y3) and (x4, y4), as shown in Figure 3.8a–b.
 * The intersecting point of the two lines can be found by solving the following linear equation:
 * 		(y1 - y2)x - (x1 - x2)y = (y1 - y2)x1 - (x1 - x2)y1
 * 		(y3 - y4)x - (x3 - x4)y = (y3 - y4)x3 - (x3 - x4)y3
 * 
 * This linear equation can be solved using Cramer’s rule (see Programming Exercise3.3). 
 * If the equation has no solutions, the two lines are parallel (Figure 3.8c).
 * Write a program that prompts the user to enter four points and displays the intersecting point.
 */
package chapter03;

import java.util.Scanner;

public class ProgrammingExercise25 {

	private static void TheIntersectingPoint(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4) {
		String firstLinearEquation = ((y1 - y2) + "x" + "  " + (-x1 + x2) + "y" + " = " + ((y1 - y2) * x1 - (x1 - x2) * y1));
		String secondLinearEquation = ((y3 - y4) + "x" + "  " + (-x3 + x4) + "y" + " = " + ((y3 - y4) * x3 - (x3 - x4) * y3));
		System.out.println("First linear is = " + firstLinearEquation + "\n" + 
						   "Second linear is = " + secondLinearEquation);
		double a = y1 - y2;
		double b = -x1 + x2;
		double e = (y1 - y2) * x1 - (x1 - x2) * y1;
		double c = y3 - y4;
		double d = -x3 + x4;
		double f = (y3 - y4) * x3 - (x3 - x4) * y3;
		if (a * d - b * c == 0) {
			System.out.println("Two lines are parrallel.");
		} else {
			Double xResult = ((e * d) - (b * f)) / ((a * d) - (b * c));
			Double yResult = ((a * f) - (e * c)) / ((a * d) - (b * c));
			System.out.printf("The intersecting point is at (%.2f , %.2f)", xResult, yResult);
		}

	}

	public static void main(String[] args) {
		Scanner readNumber = new Scanner(System.in);
		double x1;
		double y1;
		double x2;
		double y2;
		double x3;
		double y3;
		double x4;
		double y4;
		System.out.println("Enter x1, y1, x2, y2, x3, y3, x4, y4 : ");
		x1 = readNumber.nextDouble();
		y1 = readNumber.nextDouble();
		x2 = readNumber.nextDouble();
		y2 = readNumber.nextDouble();
		x3 = readNumber.nextDouble();
		y3 = readNumber.nextDouble();
		x4 = readNumber.nextDouble();
		y4 = readNumber.nextDouble();
		TheIntersectingPoint(x1, y1, x2, y2, x3, y3, x4, y4);
		readNumber.close();
	}
}

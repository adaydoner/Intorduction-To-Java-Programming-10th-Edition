/*
 * (Geometry: two circles) Write a program that prompts the user to enter the center
 * coordinates and radius of two circles and determines whether the second circle is
 * inside the first or overlaps with the first, as shown in Figure 3.10. (Hint: circle2 is
 * inside circle1 if the distance between the two centers 6 = |r1 - r2| and circle2
 * overlaps circle1 if the distance between the two centers <= r1 + r2. Test your program to cover all cases.)
 */
package chapter03;

import java.util.Scanner;

public class ProgrammingExercise29 {
	public static double DistanceBetweenTwoPoints(double x1 , double y1 , double x2 , double y2) {
		double distance = Math.abs(Math.pow(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2), 0.5));
		return distance;
	}

	public static void CheckCirclesStates(double circle1CentersX, double circle1CentersY, double circle1Radius, double circle2CentersX, double circle2CentersY, double circle2Radius) {
		// 0.5 5.1 13
		// 1 1.7 4.5
		// c2 is inside c1
		double distanceBetweenCentersOfC1C2 = DistanceBetweenTwoPoints(circle1CentersX, circle1CentersY, circle2CentersX, circle2CentersY);
		if(distanceBetweenCentersOfC1C2 <= Math.abs(circle1Radius - circle2Radius)) {
			System.out.println("c2 is inside c1.");
		}
		else if(distanceBetweenCentersOfC1C2 <= circle1Radius + circle2Radius) {
			System.out.println("c2 overlaps c1.");
		}
		else {
			System.out.println("c2 does not overlap c1");
		}
	}

	public static void main(String[] args) {
		Scanner readNumber = new Scanner(System.in);
		double circle1CentersX;
		double circle1CentersY;
		double circle1Radius;
		double circle2CentersX;
		double circle2CentersY;
		double circle2Radius;
		System.out.print("Enter circle1's center x-, y- coordinates, and radius : ");
		circle1CentersX = readNumber.nextDouble();
		circle1CentersY = readNumber.nextDouble();
		circle1Radius = readNumber.nextDouble();
		System.out.print("Enter circle2's center x-, y- coordinates, and radius : ");
		circle2CentersX = readNumber.nextDouble();
		circle2CentersY = readNumber.nextDouble();
		circle2Radius = readNumber.nextDouble();
		CheckCirclesStates(circle1CentersX,circle1CentersY,circle1Radius,circle2CentersX,circle2CentersY,circle2Radius);
		readNumber.close();
	}
}

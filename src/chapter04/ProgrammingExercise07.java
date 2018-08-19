/*
 * (Corner point coordinates) Suppose a pentagon is centered at (0, 0) with one point
 * at the 0 o’clock position, as shown in Figure 4.7c. Write a program that prompts
 * the user to enter the radius of the bounding circle of a pentagon and displays the
 * coordinates of the five corner points on the pentagon.
 */
package chapter04;

import java.util.Scanner;

public class ProgrammingExercise07 {
	private static double[] GeneratePointOnCircleByAngle(double radius, int angle) {
		double[] point = new double[2];
		point[0] = radius * Math.cos(Math.toRadians(angle));
		point[1] = radius * Math.sin(Math.toRadians(angle));
		return point;
	}

	public static void main(String[] args) {
		Scanner readNumber = new Scanner(System.in);
		System.out.print("Enter the radius of the bounding circle : ");
		double radius;
		int angle = -54; // -54 + (360 / 5) + (360 / 5) = 90 degree. Question asks one point at 90 degree 
		double[][] point = new double[5][2];
		radius = readNumber.nextDouble();
		for (int i = 0; i < 5; i++) {
			angle = angle + (360 / 5);
			point[i] = GeneratePointOnCircleByAngle(radius,angle);
		}
		for (int i = 0; i < 5; i++) {
			System.out.printf("point %d ==>>\t (x,y) : %f, %f \n",(i+1),point[i][0], point[i][1]);
		}
		readNumber.close();
	}
}

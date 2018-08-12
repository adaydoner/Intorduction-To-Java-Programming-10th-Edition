/*
 * (Geometry: area of a triangle) Write a program that prompts the user to enter
 * three points (x1, y1), (x2, y2), (x3, y3) of a triangle and displays its area.
 */
package chapter02;

import java.util.Scanner;

public class ProgrammingExercise19 {
	public static double AreaOfTriangle(double x1,double y1,double x2,double y2,double x3,double y3) {
		double area;
		double side1 = FindDistanceOfPoints(x1, y1, x2, y2);
		double side2 = FindDistanceOfPoints(x1, y1, x3, y3);
		double side3 = FindDistanceOfPoints(x2, y2, x3, y3);
		//formula
		double s = (side1 + side2 + side3) / 2;
		area = Math.pow((s * (s - side1) * (s - side2) * (s - side3)), 0.5);
		area = (int)(area * 10) / 10.0;
		return area;
	}
	private static double FindDistanceOfPoints(double x1, double y1, double x2, double y2) {
		double calculation;
		calculation = Math.pow((Math.pow(x2 - x1, 2)) + Math.pow(y2 - y1, 2), 0.5);
		return calculation;
}

	public static void main(String[] args) {
		double x1;
		double y1;
		double x2;
		double y2;
		double x3;
		double y3;
		double area;
		Scanner readNumber = new Scanner(System.in);
		System.out.println("Enter three coordinates of points for a triangle : ");
		x1 = readNumber.nextDouble();
		y1 = readNumber.nextDouble();
		x2 = readNumber.nextDouble();
		y2 = readNumber.nextDouble();
		x3 = readNumber.nextDouble();
		y3 = readNumber.nextDouble();
		area = AreaOfTriangle(x1,y1,x2,y2,x3,y3);
		System.out.println("The area of the triangle is "+ area);
	}

}

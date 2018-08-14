/*
 * (Geometry: points in triangle?) Suppose a right triangle is placed in a plane as shown below. 
 * The right-angle point is placed at (0, 0), and the other two points are placed at (200, 0), and (0, 100). 
 * Write a program that prompts the user to enter a point with x- and y-coordinates and 
 * determines whether the point is inside the triangle.
 * Area A = [ x1(y2 – y3) + x2(y3 – y1) + x3(y1-y2)]/2
 */
package chapter03;

import java.util.Scanner;

public class ProgrammingExercise27 {
	public static double CalculateTriangleArea (double x1,double y1,double x2,double y2,double x3,double y3) {
		double area;
		area = Math.abs((x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2)) / 2.0 );
		return area;
	}

	private static void IsPointInside(double x, double y) {
		double triangleX1 = 0;
		double triangleY1 = 0;
		double triangleX2 = 200;
		double triangleY2 = 0;
		double triangleX3 = 0;
		double triangleY3 = 100;
		double areaOfTriangle = CalculateTriangleArea(triangleX1, triangleY1, triangleX2, triangleY2, triangleX3, triangleY3);
		double area1 = CalculateTriangleArea(x, y, triangleX1, triangleY1, triangleX2, triangleY2);
		double area2 = CalculateTriangleArea(x, y, triangleX1, triangleY1, triangleX3, triangleY3);
		double area3 = CalculateTriangleArea(x, y, triangleX2, triangleY2, triangleX3, triangleY3);
		if(areaOfTriangle == (area1+area2+area3)) {
			System.out.println("The point is in the triangle");
		}
		else {
			System.out.println("The point is not in the triangle");
		}
	}

	public static void main(String[] args) {
		Scanner readNumber = new Scanner(System.in);
		double x;
		double y;
		System.out.print("Enter a point's x and y coordinates : ");
		x = readNumber.nextDouble();
		y = readNumber.nextDouble();
		IsPointInside(x,y);
		readNumber.close();
	}
}

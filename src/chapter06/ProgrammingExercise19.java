/*
 * (The MyTriangle class) Create a class named MyTriangle that contains the following two methods:
 * 		public static boolean isValid(double side1, double side2, double side3)
 * 		public static double area(double side1, double side2, double side3)
 * 
 * Write a test program that reads three sides for a triangle and computes the area if
 * the input is valid. Otherwise, it displays that the input is invalid.
 */
package chapter06;

import java.util.Scanner;

public class ProgrammingExercise19 {

	public static double area(double side1, double side2, double side3) {
		boolean isTriangleValid;
		double area;
		double s;
		isTriangleValid = isValid(side1, side2, side3);
		if(isTriangleValid) {
			s = (side1 + side2 + side3) / 2;
			area = Math.pow((s * (s - side1) * (s - side2) * (s - side3)), 0.5);
			area = (int)(area * 10) / 10.0;
		} else {
			area = -1;
		}
		return area;
	}

	public static boolean isValid(double side1, double side2, double side3) {
		if (side1 + side2 > side3 && side1 + side3 > side2 && side2 + side3 > side1) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double s1;
		double s2;
		double s3;
		double areaOfTriangle;
		System.out.print("Enter triangle's sides : ");
		s1 = input.nextDouble();
		s2 = input.nextDouble();
		s3 = input.nextDouble();
		areaOfTriangle = area(s1, s2, s3);
		if(areaOfTriangle == -1 ) {
			System.out.println("The input is invalid.");
		} else {
			System.out.println("Area : " + areaOfTriangle);
		}

	}
}

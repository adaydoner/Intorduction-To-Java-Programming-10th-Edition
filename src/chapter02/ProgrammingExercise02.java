/*
 * Chapter 2 Exercise 2:
 *
 *      (Compute the volume of a cylinder) Write a program that reads in the radius
 *      and length of a cylinder and computes the area and volume.
 */
package chapter02;

import java.util.Scanner;

public class ProgrammingExercise02 {

	private static void areaOfCylinder(double radius) {
		double area;
		area = radius * radius * Math.PI;
		System.out.printf("Area of Cylinder : %.2f \n", area);
	}

	private static void volumeOfCylinder(double radius, double length) {
		double volume;
		volume = radius * radius * Math.PI * length;
		System.out.printf("Volume of Cylinder : %.2f \n", volume);
	}

	public static void main(String[] args) {
		double radius;
		double length;
		Scanner readNumber = new Scanner(System.in);
		System.out.print("Enter the radius and length of a cylinder : ");
		radius = readNumber.nextDouble();
		length = readNumber.nextDouble();

		areaOfCylinder(radius);
		volumeOfCylinder(radius, length);

		if (readNumber != null) {
			readNumber.close();
		}
	}

}

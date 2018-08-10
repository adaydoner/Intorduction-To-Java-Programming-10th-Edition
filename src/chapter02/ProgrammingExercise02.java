/*
 * Chapter 2 Exercise 2:
 *
 *      (Compute the volume of a cylinder) Write a program that reads in the radius
 *      and length of a cylinder and computes the area and volume.
 */
package chapter02;

import java.util.Scanner;

public class ProgrammingExercise02 {

	private static double areaOfCylinder(double radius) {
		double area;
		area = radius * radius * Math.PI;
		return area;
	}

	private static double volumeOfCylinder(double area, double length) {
		double volume;
		volume = area * length;
		return volume;
	}

	public static void main(String[] args) {
		double radius;
		double length;
		double area;
		double volume;
		Scanner readNumber = new Scanner(System.in);
		System.out.print("Enter the radius and length of a cylinder : ");
		radius = readNumber.nextDouble();
		length = readNumber.nextDouble();

		area = areaOfCylinder(radius);
		System.out.printf("Area of Cylinder : %.2f \n", area);
		volume = volumeOfCylinder(area, length);
		System.out.printf("Volume of Cylinder : %.2f \n", volume);
		
		if(readNumber != null) {readNumber.close();}
		}

	}

/*
 * (Geometry: area of a regular polygon) A regular polygon is an n-sided polygon in
 * which all sides are of the same length and all angles have the same degree (i.e., the
 * polygon is both equilateral and equiangular).
 * Write a program that prompts the user to enter the number of sides and their length of a regular polygon and displays its area
 */
package chapter04;

import java.util.Scanner;

public class ProgrammingExercise05 {

	public static void AreaOfPolygon(int numberOfSides, double lengthOfSide) {
		double area;
		area = (numberOfSides * Math.pow(lengthOfSide, 2)) / (4 * Math.tan(Math.PI / numberOfSides));
		System.out.println("The area of the polygon is " + area);
	}

	public static void main(String[] args) {
		Scanner readNumber = new Scanner(System.in);
		System.out.print("Enter the number of sides : ");
		int numberOfSides = readNumber.nextInt();
		System.out.print("Enter the side length : ");
		double lengthOfSide = readNumber.nextDouble();
		AreaOfPolygon(numberOfSides,lengthOfSide);
		readNumber.close();
	}
}

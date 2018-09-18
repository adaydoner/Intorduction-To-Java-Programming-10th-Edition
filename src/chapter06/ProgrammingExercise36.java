/*
 * (Geometry: area of a regular polygon) A regular polygon is an n-sided polygon
 * in which all sides are of the same length and all angles have the same degree (i.e.,
 * the polygon is both equilateral and equiangular). The formula for computing the
 * area of a regular polygon is
 * 
 * 		Area = (n * s2) / 4 * tan(pi /n)
 * 
 * Write a method that returns the area of a regular polygon using the following header:
 * 		public static double area(int n, double side)
 * 
 * Write a main method that prompts the user to enter the number of sides and the side of a regular polygon and displays its area.
 */
package chapter06;

import java.util.Scanner;

public class ProgrammingExercise36 {
	public static double area(int n, double side) {
		double area;
		area = (n * Math.abs(Math.pow(side, 2))) / (4 * Math.tan(Math.PI / n));
		return area;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int numberOfSides;
		double sideOfRegularPolygon;
		double areaOfregularPolygon;
		System.out.print("Enter the number of sides : ");
		numberOfSides = input.nextInt();
		System.out.print("Enter the side : ");
		sideOfRegularPolygon = input.nextDouble();
		
		
		areaOfregularPolygon = area(numberOfSides , sideOfRegularPolygon);
		System.out.printf("The area of the pentagon is %f",areaOfregularPolygon);
		input.close();
	}

}

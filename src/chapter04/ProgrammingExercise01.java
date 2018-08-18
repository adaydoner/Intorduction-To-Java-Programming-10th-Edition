/*
 * (Geometry: area of a pentagon) Write a program that prompts the user to enter
 * the length from the center of a pentagon to a vertex and computes the area of the
 * pentagon, as shown in the following figure.
 */

package chapter04;

import java.util.Scanner;

public class ProgrammingExercise01 {

	private static void AreaOfPentagon(double r) {
		double area;
		double lengthOfSide;
		lengthOfSide = 2 * r * Math.sin(Math.PI / 5);
		area = (5 * Math.pow(lengthOfSide, 2)) / (4 * Math.tan(Math.PI / 5));
		System.out.printf("The area of the pentagon is : %.2f ",area);
	}

	public static void main(String[] args) {
		Scanner readNumber = new Scanner(System.in);
		double r;
		System.out.print("Enter the length from the center to a vertex : ");
		r = readNumber.nextDouble();
		AreaOfPentagon(r);
		readNumber.close();
	}
}

/*
 * (Geometry: area of a hexagon)
 * Write a program that prompts the user to enter the side of a hexagon and displays its area.
 */
package chapter04;

import java.util.Scanner;

public class ProgrammingExercise04 {

	public static void AreaOfHexagon(double side) {
		double area;
		area = (6 * Math.pow(side, 2)) / (4 * Math.tan(Math.PI / 6));
		System.out.printf("The area of the hexagon is %.2f",area);
	}

	public static void main(String[] args) {
		Scanner readNumber = new Scanner(System.in);
		System.out.printf("Enter the side : ");
		double side = readNumber.nextDouble();
		AreaOfHexagon(side);
		readNumber.close();
	}
}

/*
 * (Geometry: area of a hexagon)
 */
package chapter02;

import java.util.Scanner;

public class ProgrammingExercise16 {

	private static double CalculateAreaOfHexagon(double sideLength) {
		double area;
		area = (Math.pow(27, 0.5) / 2) * Math.pow(sideLength, 2);
		return area;
	}

	public static void main(String[] args) {
		double sideLength;
		double areaOfHexagon;
		Scanner readNumber = new Scanner(System.in);
		System.out.print("Enter the side : ");
		sideLength = readNumber.nextDouble();

		areaOfHexagon = CalculateAreaOfHexagon(sideLength);
		System.out.printf("The area of the hexagon is %.4f", areaOfHexagon);

		if (readNumber != null) {
			readNumber.close();
		}
	}
}

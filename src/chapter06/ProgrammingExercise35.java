/**
 * (Geometry: area of a pentagon) The area of a pentagon can be computed using the following formula:
 * 		Area = 5 * s2 / (t * tan (pi/5))
 * 
 * Write a method that returns the area of a pentagon using the following header:
 * 		public static double area(double side)
 * 
 * Write a main method that prompts the user to enter the side of a pentagon and displays its area.
 */

package chapter06;

import java.util.Scanner;

public class ProgrammingExercise35 {
	public static double area(double side) {
		double area;
		area = (5 * Math.abs(Math.pow(side, 2))) / (4 * Math.tan(Math.PI / 5));
		return area;
		
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double sideOfPentagon;
		double areaOfPentagon;
		System.out.print("Enter the side : ");
		sideOfPentagon = input.nextDouble();
		areaOfPentagon = area(sideOfPentagon);
		System.out.printf("The area of the pentagon is %f",areaOfPentagon);
		input.close();
	}

}

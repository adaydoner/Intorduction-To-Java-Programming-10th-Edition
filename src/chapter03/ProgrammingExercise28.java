/*
 * (Geometry: two rectangles) Write a program that prompts the user to enter the
 * center x-, y-coordinates, width, and height of two rectangles and determines
 * whether the second rectangle is inside the first or overlaps with the first
 * Tes1 : 
 * Enter r1's center x-, y-coordinates, width, and height: 2.5 4 2.5 43
 * Enter r2's center x-, y-coordinates, width, and height: 1.5 5 0.5 3
 * r2 is inside r1
 * Test2 : 
 * Enter r1's center x-, y-coordinates, width, and height: 1 2 3 5.5
 * Enter r2's center x-, y-coordinates, width, and height: 3 4 4.5 5
 * r2 overlaps r1
 * Test3 : 
 * Enter r1's center x-, y-coordinates, width, and height: 1 2 3 3
 * Enter r2's center x-, y-coordinates, width, and height: 40 45 3 2
 * r2 does not overlap r1
 */
package chapter03;

import java.util.Scanner;

public class ProgrammingExercise28 {
	public static void CheckRectanglesStates(double x1, double y1, double width1, double height1, double x2, double y2, double width2, double height2) {
		if( y2 >= y1 + Math.abs(height1 / 2 - height2 / 2) && y2 <= y1 + Math.abs(height1 / 2 + height2 / 2) ||
			y2 <= y1 - Math.abs(height1 / 2 + height2 / 2) && y2 >= y1 - Math.abs(height1 / 2 - height2 / 2) ||
			x2 >= x1 + Math.abs(width1 / 2 - width2 / 2) && x2 <= x1 + Math.abs(width1 / 2 + width2 / 2) ||
			x2 <= x1 - Math.abs(width1 / 2 + width2 / 2) && x2 >= x1 - Math.abs(width1 / 2 - width2 / 2) ){
			System.out.println("r2 overlaps r1.");
		}
		else if(y2 > y1 + Math.abs(height1 / 2 + height2 / 2) ||
				y2 < y1 - Math.abs(height1 / 2 - height2 / 2) ||
				x2 > x1 + Math.abs(width1 / 2 + width2 / 2) ||
				x2 < x1 - Math.abs(width1 / 2 - width2 / 2)) {
			System.out.println("r2 does not overlap r1");
		}
		else {
			System.out.println("r2 is inside r1.");
		}
	}

	public static void main(String[] args) {
		Scanner readNumber = new Scanner(System.in);
		double r1x;
		double r1y;
		double r1width;
		double r1height;
		double r2x;
		double r2y;
		double r2width;
		double r2height;
		System.out.print("Enter r1's center x-, y-coordinates, width, and height : ");
		r1x = readNumber.nextDouble();
		r1y = readNumber.nextDouble();
		r1width = readNumber.nextDouble();
		r1height = readNumber.nextDouble();
		System.out.print("Enter r2's center x-, y-coordinates, width, and height : ");
		r2x = readNumber.nextDouble();
		r2y = readNumber.nextDouble();
		r2width = readNumber.nextDouble();
		r2height = readNumber.nextDouble();
		CheckRectanglesStates(r1x, r1y, r1width, r1height,r2x, r2y, r2width, r2height);
		readNumber.close();
	}
}

/*
 * (Geometry: point in a rectangle?) Write a program that prompts the user to enter
 * a point (x, y) and checks whether the point is within the rectangle centered at
 * (0, 0) with width 10 and height 5.
 * 
 * For example, (2, 2) is inside the rectangle and (6, 4) is outside the rectangle.
 */
package chapter03;

import java.util.Scanner;

public class ProgrammingExercise23 {


	private static boolean CheckPointIfItsInRectangle(double x, double y) {
		boolean answer = true;
		double rectanglesWidth = 10.0;
		double rectanglesHeight = 5.0;
		if(x <= (rectanglesWidth / 2) && x >= (0 - rectanglesWidth / 2)) {
			if(y <= (rectanglesHeight/2) && y >= (0 - rectanglesHeight / 2)) {
				answer = true;
			}
			else {
				answer = false;
			}
		}
		else {
			answer = false;
		}
		return answer;
	}


	public static void main(String[] args) {
		Scanner readNumber = new Scanner(System.in);
		double x;
		double y;
		boolean isPointInRectangle;
		System.out.print("Enter a point with two coordinates : ");
		x = readNumber.nextDouble();
		y = readNumber.nextDouble();
		isPointInRectangle = CheckPointIfItsInRectangle(x,y);
		if(isPointInRectangle) {
			System.out.printf("Point (%.1f, %.1f) is in the rectangle",x,y);
		}
		else {
			System.out.printf("Point (%.1f, %.1f) is not in the rectangle",x,y);
		}
		readNumber.close();
	}
}

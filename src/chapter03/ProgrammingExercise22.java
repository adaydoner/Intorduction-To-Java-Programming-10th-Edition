/*
 * (Geometry: point in a circle?) Write a program that prompts the user to enter a
 * point (x, y) and checks whether the point is within the circle centered at (0, 0)
 * with radius 10. For example, (4, 5) is inside the circle and (9, 9) is outside the circle, as shown in Figure 3.7a.
 * 
 * (Hint: A point is in the circle if its distance to (0, 0) is less than or equal to 10.
 * The formula for computing the distance is 
 * 2(x2 - x1)2 + (y2 - y1)2.
 */
package chapter03;

import java.util.Scanner;

public class ProgrammingExercise22 {

	private static boolean CheckPointIfItsInCircle(double x, double y) {
		double distance;
		boolean answer;
		distance = Math.pow(Math.pow(x, 2) + Math.pow(y, 2), 0.5);
		if(10 - distance > 0) {
			answer = true;
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
		boolean isPointInCircle;
		System.out.print("Enter a point with two coordinates : ");
		x = readNumber.nextDouble();
		y = readNumber.nextDouble();
		isPointInCircle = CheckPointIfItsInCircle(x,y);
		if(isPointInCircle) {
			System.out.printf("Point (%.1f, %.1f) is in the circle",x,y);
		}
		else {
			System.out.printf("Point (%.1f, %.1f) is not in the circle",x,y);
		}
		readNumber.close();
	}
}

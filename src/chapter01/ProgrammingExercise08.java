/**
 * Chapter 1 Exercise 8:
 *      (Area and perimeter of a circle) Write a program that displays the area and perimeter of a circle that has a radius of 5.5
 */

package chapter01;

public class ProgrammingExercise08 {

	public static void main(String[] args) {
		double radius = 5.5;

		System.out.println("Parimeter : " + 2 * radius * Math.PI);
		System.out.println("Area : " + radius * radius * Math.PI);

	}

}

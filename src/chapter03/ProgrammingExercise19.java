/*
 * (Compute the perimeter of a triangle) Write a program that reads three edges for
 * a triangle and computes the perimeter if the input is valid. Otherwise, display that
 * the input is invalid. The input is valid if the sum of every pair of two edges is
 * greater than the remaining edge.
 */
package chapter03;

import java.util.Scanner;

public class ProgrammingExercise19 {


	private static boolean CheckIfInputIsValid(double side1, double side2, double side3) {
		boolean valid = true;
		if(side1 + side2 > side3 && 
		   side1 + side3 > side2 &&
		   side2 + side3 > side1) {
			valid = true;
		}
		else {
			valid = false;
		}
		return valid;
	}


	private static double PerimeterOfTriangle(double side1, double side2, double side3) {
		double perimeter = side1 + side2 + side3;
		return perimeter;
	}


	public static void main(String[] args) {
		Scanner readNumber = new Scanner(System.in);
		double side1;
		double side2;
		double side3;
		System.out.print("Side 1 : ");
		side1 = readNumber.nextDouble();
		System.out.print("Side 2 : ");
		side2 = readNumber.nextDouble();
		System.out.print("Side 3 : ");
		side3 = readNumber.nextDouble();
		if(CheckIfInputIsValid(side1,side2,side3)) {
			double perimeter;
			perimeter =	PerimeterOfTriangle(side1,side2,side3);
			System.out.printf("The perimeter of a triangle : %.1f",perimeter);
			
		}
		else {
			System.out.println("It can not be a triangle because of the invalid side values.");
		}
	}
}

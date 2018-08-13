/*
 * The two roots of a quadratic equation can be obtained using formula
 * b2 - 4ac is called the discriminant of the quadratic equation. If it is positive, the
 * equation has two real roots. If it is zero, the equation has one root. If it is negative,
 * the equation has no real roots.
 * 
 * Write a program that prompts the user to enter values for a, b, and c and displays
 * the result based on the discriminant. If the discriminant is positive, display two
 * roots. If the discriminant is 0, display one root. Otherwise, display “The equation
 * has no real roots”.
 */
package chapter03;

import java.util.Scanner;

public class ProgrammingExercise01 {

	private static void FindOneRoot(double a, double b, double c, double discriminant) {
		double root1 = (-b + Math.pow(discriminant, 0.5)) / 2 * a;
		System.out.println("The equation has one root " + root1);
	}

	public static void FindTwoRoots(double a, double b, double c, double discriminant) {
		double root1 = (-b + Math.pow(discriminant, 0.5)) / 2 * a;
		double root2 = (-b - Math.pow(discriminant, 0.5)) / 2 * a;
		root1 = (int)(root1 * 100) / 100.0;
		root2 = (int)(root2 * 100) / 100.0;
		System.out.println("The equation has two roots " + root1 + " and " + root2);
	}

	public static void main(String[] args) {
		double a;
		double b;
		double c;
		double discriminant;

		Scanner readNumber = new Scanner(System.in);
		System.out.print("a : ");
		a = readNumber.nextDouble();
		System.out.print("b : ");
		b = readNumber.nextDouble();
		System.out.print("c : ");
		c = readNumber.nextDouble();
		discriminant = (Math.pow(b, 2) - 4 * a * c);
		if (discriminant > 0) {
			FindTwoRoots(a, b, c, discriminant);
		} else if (discriminant == 0) {
			FindOneRoot(a, b, c, discriminant);
		} else {
			System.out.println("The equation  has no roots.");
		}
	}
}

/*
 * (Algebra: solve 2 * 2 linear equations) A linear equation can be solved using
 * Cramer�s rule given in Programming Exercise 1.13. Write a program that prompts
 * the user to enter a, b, c, d, e, and f and displays the result. If ad - bc is 0, report
 * that �The equation has no solution.�
 */
package chapter03;

import java.util.Scanner;

public class ProgrammingExercise03 {

	public static void main(String[] args) {
		double a;
		double b;
		double c;
		double d;
		double e;
		double f;

		Scanner readNumber = new Scanner(System.in);
		System.out.println("Enter a, b, c, d, e, f : ");
		a = readNumber.nextDouble();
		b = readNumber.nextDouble();
		c = readNumber.nextDouble();
		d = readNumber.nextDouble();
		e = readNumber.nextDouble();
		f = readNumber.nextDouble();

		if (a * d - b * c == 0) {
			System.out.println("The equation has no solution.");
		} 
		else {
			Double xResult = ((e * d) - (b * f)) / ((a * d) - (b * c));
			Double yResult = ((a * f) - (e * c)) / ((a * d) - (b * c));
			System.out.printf("x : %.0f and y : %.0f",xResult,yResult);
		}
		readNumber.close();
	}
}

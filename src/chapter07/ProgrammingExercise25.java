/*
 * (Algebra: solve quadratic equations) Write a method for solving a quadratic equation using the following header:
 * 		public static int solveQuadratic(double[] eqn, double[] roots)
 * The coefficients of a quadratic equation ax2 + bx + c = 0 are passed to the
 * array eqn and the real roots are stored in roots.
 * The method returns the number of real roots.
 * Write a program that prompts the user to enter values for a, b, and c and displays the number of real roots and all real roots.
 */
package chapter07;

import java.util.Scanner;

public class ProgrammingExercise25 {
	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		double[] coefficients = new double[3];
		double[] roots = new double[2];
		int numberOfRoot;
		getCoefficients(coefficients);
		numberOfRoot = solveQuadratic(coefficients, roots);
		
		if(numberOfRoot == 0) {
			System.out.println("The equations has no roots.");
		} else if (numberOfRoot == 1) {
			System.out.println("The equation has one root : " + roots[0]);
		} else {
			System.out.println("The equation has two root : " + roots[0] + "   " + roots[1]);
		}
		
		
	}

	public static void getCoefficients(double[] coefficients) {
		System.out.print("Enter a , b and c values for quadratic equations : ");
		for (int i = 0; i < coefficients.length; i++) {
			coefficients[i] = input.nextDouble();
		}
	}
	
	public static int solveQuadratic(double[] eqn, double[] roots) {
		double discriminant;
		discriminant = (Math.pow(eqn[1], 2) - 4 * eqn[0] * eqn[2]);
		
		if(discriminant > 0) {
			roots[0] = (-eqn[1] + Math.pow(discriminant, 0.5)) / 2 * eqn[0];
			roots[1] = (-eqn[1] - Math.pow(discriminant, 0.5)) / 2 * eqn[0];
			return 2;
		} else if (discriminant == 0) {
			roots[0] = (-eqn[1] + Math.pow(discriminant, 0.5)) / 2 * eqn[0];
			return 1;
		} else {
			return 0 ;
		}
	}
}

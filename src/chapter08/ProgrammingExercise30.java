/*
 * (Algebra: solve linear equations) Write a method that solves the following 2 * 2 system of linear equations:
 * 		a00x + a01y = b0					
 * 										x = b0a11 - b1a01 / a00a11 - a01a10
 * 										y = b1a00 - b0a10 / a00a11 - a01a10
 * 		a10x + a11y = b1
 * 			
 * 					public static double[] linearEquation(double[][] a, double[] b)
 * 
 * 
 * The method returns null if a00a11 - a01a10 is 0. Write a test program that 
 * prompts the user to enter a00, a01, a10, a11, b0, and b1, and displays the result. If 
 * a00a11 - a01a10 is 0, report that “The equation has no solution.” A sample run is similar to Programming Exercise 3.3.
 */
package chapter08;

import java.util.Scanner;

public class ProgrammingExercise30 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double[][] a = new double[2][2];
		double[] b = new double[2];
		double[] solution = new double[2]; // for possible x and y value.
		/*
		 * a00x + a01y = b0
		 * a10x + a11y = b1
		 */
		System.out.print("enter a00, a01, a10, a11, b0, and b1 : ");
		// we get values from user.
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				a[i][j] = input.nextDouble();
			}
		}
		for (int i = 0; i < b.length; i++) {
			b[i] = input.nextDouble();
		}
		
		solution = linearEquation(a, b);
		
		if(solution == null) {
			System.out.println("The equation has no solution.");
		} else {
			System.out.println("x : " + solution[0] + "\ny : " + solution[1]);
		}
		
		input.close();
	}
	public static double[] linearEquation(double[][] a, double[] b) {
		double[] solution = new double[2];
		// if (a * d - b * c == 0)
		if(a[0][0] * a[1][1] - a[0][1] * a[1][0] == 0) {
			solution = null;
		} else {
			solution[0] = ((b[0] * a[1][1]) - (b[1] * a[0][1])) / ((a[0][0] * a[1][1]) - (a[0][1] * a[1][0]));
			solution[1] = ((b[1] * a[0][0]) - (b[0] * a[1][0])) / ((a[0][0] * a[1][1]) - (a[0][1] * a[1][0]));
		}
		return solution;
	}
}

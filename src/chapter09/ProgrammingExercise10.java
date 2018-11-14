/*
 * (Algebra: quadratic equations) Design a class named QuadraticEquation for a quadratic equation ax2 + bx + x = 0. The class contains:
 * 		Private data fields a, b, and c that represent three coefficients.
 * 		A constructor for the arguments for a, b, and c.
 * 		Three getter methods for a, b, and c.
 * 		A method named getDiscriminant() that returns the discriminant, which is b2 - 4ac.
 * 		The methods named getRoot1() and getRoot2() for returning two roots of the equation
 * 
 * Draw the UML diagram for the class and then implement the class. Write a test program that prompts the user to enter values for a, b, and c and displays the result based on the discriminant. 
 * If the discriminant is positive, display the two roots. If the discriminant is 0, display the one root. Otherwise, display “The equation has no roots.” 
 * 
 */
package chapter09;

import java.util.Scanner;

public class ProgrammingExercise10 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double a;
		double b;
		double c;
		
		System.out.print("Enter values for a , b and c (eg. 2 4 5) : ");
		a = input.nextDouble();
		b = input.nextDouble();
		c = input.nextDouble();
		
		QuadraticEquation equation = new QuadraticEquation(a,b,c);
		if(equation.getDiscriminant() > 0){
			System.out.println("Root 1 : " + equation.getRoot1() + "\nRoot 2 : " + equation.getRoot2());
		} else if (equation.getDiscriminant() == 0){
			System.out.println("Root : " + equation.getRoot1());
		} else {
			System.out.println("The equation has no roots.");
		}
		
	}
}

class QuadraticEquation {
	private double a;
	private double b;
	private double c;

	QuadraticEquation(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public double getA() {
		return a;
	}

	public double getB() {
		return b;
	}

	public double getC() {
		return c;
	}

	public double getDiscriminant() {
		return (Math.pow(b, 2) - (4 * a * c));
	}

	public double getRoot1() {
		return (-b + Math.pow(getDiscriminant(), 0.5)) / (2 * a);
	}

	public double getRoot2() {
		return (-b - Math.pow(getDiscriminant(), 0.5)) / (2 * a);
	}
}
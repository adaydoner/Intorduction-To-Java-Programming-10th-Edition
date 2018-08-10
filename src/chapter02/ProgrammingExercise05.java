/*
 * Chapter 2 Exercise 5:
 *
 *      (Financial application: calculate tips) Write a program that reads the subtotal
 *       and the gratuity rate, then computes the gratuity and total.
 *
 */

package chapter02;

import java.util.Scanner;

public class ProgrammingExercise05 {


	private static void calculateTips(double subtotal, int gratuityRate) {
		double gratuity = (subtotal * gratuityRate) / 100;
		double total = gratuity + subtotal ;
		System.out.printf("The gratuity is $%.2f and total is $%.2f",gratuity,total);
	}

	public static void main(String[] args) {
		Scanner readNumber = new Scanner(System.in);
		double subtotal;
		int gratuityRate;
		System.out.print("Enter the subtotal and a gratuity rate : ");
		subtotal = readNumber.nextDouble();
		gratuityRate = readNumber.nextInt();
		
		calculateTips(subtotal,gratuityRate);
		if(readNumber != null) {
			readNumber.close();
		}

	}
}

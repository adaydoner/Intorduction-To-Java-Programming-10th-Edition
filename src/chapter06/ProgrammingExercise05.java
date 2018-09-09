/*
 * (Sort three numbers) Write a method with the following header to display three numbers in increasing order:
 * 
 * 	public static void displaySortedNumbers(double num1, double num2, double num3)
 * 
 * Write a test program that prompts the user to enter three numbers and invokes the
 * method to display them in increasing order.
 */
package chapter06;

import java.util.Scanner;

public class ProgrammingExercise05 {

	private static void displaySortedNumbers(double num1, double num2, double num3) {
		double[] numArray = new double[3];
		double tempNumber;
		numArray[0] = num1;
		numArray[1] = num2;
		numArray[2] = num3;
		System.out.println("Numbers increasing order : ");
		for (int i = 0; i < 3; i++) {
			for (int j = i + 1; j < 3; j++) {
				if(numArray[i] > numArray[j]) {
					tempNumber = numArray[i];
					numArray[i] = numArray[j];
					numArray[j] = tempNumber;
				}
			}
			System.out.println(numArray[i]);
		}
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double num1;
		double num2;
		double num3;
		System.out.print("Write three numbers (e.g. 20 30 40) : ");
		num1 = input.nextDouble();
		num2 = input.nextDouble();
		num3 = input.nextDouble();
		displaySortedNumbers(num1, num2, num3);
		input.close();
	}
}

/*
 * (Average an array) Write two overloaded methods that return the average of an array with the following headers:
 * 		public static int average(int[] array)
 * 		public static double average(double[] array)
 * 
 * Write a test program that prompts the user to enter ten double values, invokes this method, and displays the average value.
 */
package chapter07;

import java.util.Scanner;

public class ProgrammingExercise08 {
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		double[] doubleNumbers = new double[10];
		int[] integerNumbers = new int[10];
		double averageDouble;
		int averageInteger;
		getDoubleNumbers(doubleNumbers);
		averageDouble = average(doubleNumbers);
		System.out.println("double average method worked : " + averageDouble);
		getIntegerNumbers(integerNumbers);
		averageInteger = average(integerNumbers);
		System.out.println("integer average method worked : " + averageInteger);
	}

	public static void getDoubleNumbers(double[] numbers) {
		System.out.print("Enter 10 double values : ");
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = input.nextDouble();
		}
	}
	public static void getIntegerNumbers(int[] numbers) {
		System.out.print("Enter 10 integer values : ");
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = input.nextInt();
		}
	}

	public static int average(int[] array) {
		int sum = 0;
		int average;
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		average = sum /array.length; 
		return average;
	}

	public static double average(double[] array) {
		double sum = 0;
		double average;
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		average = sum /array.length; 
		return average;
	}
}

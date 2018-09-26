/*
 * (Statistics: compute deviation) Programming Exercise 5.45 computes the standard
 * deviation of numbers. This exercise uses a different but equivalent formula to
 * compute the standard deviation of n numbers.
 * 		mean = sum(i to n)/n (xi +... + xn/n);
 * 		deviation = sqrt(sum(i to n) [(xi - mean)power of 2] / n - 1)
 * 
 * To compute the standard deviation with this formula, you have to store the individual
 * numbers using an array, so that they can be used after the mean is obtained. Your program should contain the following methods:
 * 
 * 		public static double deviation(double[] x)
 * 		public static double mean(double[] x) 
 * Write a test program that prompts the user to enter ten numbers and displays the  mean and standard deviation, as shown in the following sample run
 */
package chapter07;

import java.util.Scanner;

public class ProgrammingExercise11 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		final int ARRAY_SIZE = 10; 
		double[] numbers = new double[ARRAY_SIZE];
		double mean;
		double deviation;
		System.out.print("Enter " + ARRAY_SIZE + " numbers : ");
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = input.nextDouble();
		}
		mean = mean(numbers);
		deviation = deviation(numbers);
		System.out.printf("%s%3.2f","The mean is \n",mean);
		System.out.printf("%s%3.5f","The deviation is ",deviation);
		
		input.close();
	}
	public static double mean(double[] x) {
		double sum = 0;
		double mean = 0;
		for (int i = 0; i < x.length; i++) {
			sum += x[i];
		}
		mean = sum / x.length;
		return mean;
	}

	public static double deviation(double[] x) {
		double mean = mean(x);
		double deviation = 0 ;
		double firstPartOfFormula = 0;
		for (int i = 0; i < x.length; i++) {
			firstPartOfFormula += Math.pow((x[i] - mean), 2);
		}
		deviation = Math.sqrt(firstPartOfFormula / (x.length - 1));
		
		return deviation;
	}
}

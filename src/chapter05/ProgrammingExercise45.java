/*
 * (Statistics: compute mean and standard deviation) In business applications, you
 * are often asked to compute the mean and standard deviation of data. The mean is
 * simply the average of the numbers. The standard deviation is a statistic that tells 
 * you how tightly all the various data are clustered around the mean in a set of data.
 * For example, what is the average age of the students in a class? How close are the
 * ages? If all the students are the same age, the deviation is 0.
 * 
 * Write a program that prompts the user to enter ten numbers, and displays the
 * mean and standard deviations of these numbers
 */
package chapter05;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ProgrammingExercise45 {
	public static double Mean (double[] array) {
		double total = 0;
		for (int i = 0; i < array.length; i++) {
			total += array[i];
		}
		total /= array.length ;
		return total;
	}
	public static double StandardDeviation (double[] array) {
		double firstStatement = 0;
		double secondStatement = 0;
		double returnValue;
		for (int i = 0; i < array.length; i++) {
			firstStatement += Math.pow(array[i], 2);
		}
		for (int i = 0; i < array.length; i++) {
			secondStatement += array[i];
		}
		secondStatement = Math.pow(secondStatement, 2) / array.length ;
		
		returnValue = Math.sqrt((firstStatement - secondStatement) / (array.length - 1));
		return returnValue;
	}

	public static void main(String[] args) {
		DecimalFormat format = new DecimalFormat("#.00000");
		Scanner input = new Scanner(System.in);
		double mean;
		double standardDeviation;
		double[] numbersArray = new double[10];
		System.out.println("Enter ten numbers : ");
		for (int i = 0; i < 10; i++) {
			numbersArray[i] = input.nextDouble();
		}
		mean = Mean(numbersArray);
		standardDeviation = StandardDeviation(numbersArray);
		System.out.println("The mean is " + mean);
		System.out.println("The standard deviation is " + format.format((double)standardDeviation));
		input.close();
	}
}

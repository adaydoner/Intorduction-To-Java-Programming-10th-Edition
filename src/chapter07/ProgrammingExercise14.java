/*
 * (Computing greatest common divisor) Write a method that returns the gcd of an unspecified number 
 * of integers. The method header is specified as follows:
 * 			public static int gcd(int... numbers)
 * 
 * Write a test program that prompts the user to enter five numbers, invokes the 
 * method to find the gcd of these numbers, and displays the gcd.
 */
package chapter07;

import java.util.Scanner;

public class ProgrammingExercise14 {

	public static void main(String[] args) {
		final int ARRAY_SIZE = 5;
		Scanner input = new Scanner(System.in);
		int[] specifiedNumbers = new int[ARRAY_SIZE];
		int greatestCommonDivisor;
		
		System.out.println("Enter " + ARRAY_SIZE + " integer numbers to find their greatest common divisor : ");
		for (int i = 0; i < ARRAY_SIZE; i++) {
			specifiedNumbers[i] = input.nextInt();
		}
		
		greatestCommonDivisor = gcd(specifiedNumbers);
		System.out.print("Greatest common divisor is : " + greatestCommonDivisor);
		
		input.close();
	}
	
	public static int gcd(int... numbers) {
		int minimumNumber;
		int gcd = 1;
		boolean flag;
		minimumNumber = min(numbers); // greatest common divisor cant be bigger than minimum number.
		for (int i = 1; i <= minimumNumber; i++) {
			flag = true;
			for (int j = 0; j < numbers.length; j++) {
				if (numbers[j] % i != 0) { // if "i" cant divide evenly one of digit, then we can say its not a common divisor.
					flag = false;
				}
			}
			if (flag) {
				gcd = i; // if any "i" value can divide every member evenly, then flag would be stay true and we can set gcd with new i value..
			}
		}
		return gcd;
	}

	public static int min(int[] numbers) {
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < numbers.length; i++) {
			if(numbers[i] < min) {
				min = numbers[i];
			}
		}
		return min;
	}

}

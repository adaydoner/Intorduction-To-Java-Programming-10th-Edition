/*
 * (Occurrence of max numbers) Write a program that reads integers, finds the largest
 * of them, and counts its occurrences. Assume that the input ends with number
 * 0. Suppose that you entered 3 5 2 5 5 5 0; the program finds that the largest
 * is 5 and the occurrence count for 5 is 4.
 * 
 * (Hint: Maintain two variables, max and count. max stores the current max number,
 * and count stores its occurrences. Initially, assign the first number to max
 * and 1 to count. Compare each subsequent number with max. If the number is
 * greater than max, assign it to max and reset count to 1. If the number is equal to
 * max, increment count by 1.)
 */
package chapter05;

import java.util.Scanner;

public class ProgrammingExercise41 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int largestNumber = 0;
		int occurrence = 0;
		int number;
		System.out.print("Enter numbers ( put 0 for last digit ) : ");
		do {
			number = input.nextInt();
			if (number > largestNumber) {
				largestNumber = number;
				occurrence = 1;
			} else if (number == largestNumber) {
				occurrence++;
			}
		} while (number != 0);
		System.out.println("Largest Number : " + largestNumber);
		System.out.println("Occurrence count for " + largestNumber + " is : " + occurrence);
		input.close();
	}
}

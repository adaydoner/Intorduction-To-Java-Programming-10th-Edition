/*
 * (Sum the digits in an integer) Write a method that computes the sum of the digits in an integer. Use the following method header:
 * 		public static int SumDigits(long n)
 * For example, sumDigits(234) returns 9 (2 + 3 + 4). (Hint: Use the % operator to extract digits, and the / operator to remove the extracted digit. 
 * For instance, to extract 4 from 234, use 234 % 10 (= 4). To remove 4 from 234, use 234 / 10 (= 23). 
 * Use a loop to repeatedly extract and remove the digit until all the digits are extracted. 
 * Write a test program that prompts the user to enter an integer and displays the sum of all its digits.
 */
package chapter06;

import java.util.Scanner;

public class ProgrammingExercise02 {
	
	public static int SumDigits(long n) {
		int sum = 0;
		while(n > 0) {		// n would be 0 when number between 1-10 tried to divided by integer 10 which is would be our last digit ;
			sum += (n % 10); // Every time n isn't 0 and loop work , its mean we still have number left to add sum. This line give us next digit;
			n /= 10; // This line delete the digit we add the sum.
		}
		return sum;
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int sumOfDigits;
		System.out.print("Enter a number you want to see sum of its digits : ");
		long number = input.nextInt();
		sumOfDigits = SumDigits(number);
		System.out.print("Sum of digits : " + sumOfDigits);
		input.close();
	}
}

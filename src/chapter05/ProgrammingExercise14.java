/*
 * (Compute the greatest common divisor) Another solution for Listing 5.9 to find
 * the greatest common divisor of two integers n1 and n2 is as follows: First find d
 * to be the minimum of n1 and n2, then check whether d, d-1, d-2, . . . , 2, or 1 is
 * a divisor for both n1 and n2 in this order. The first such common divisor is the
 * greatest common divisor for n1 and n2. Write a program that prompts the user to
 * enter two positive integers and displays the gcd.
 */
package chapter05;

import java.util.Scanner;

public class ProgrammingExercise14 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number1;
		int number2;
		System.out.print("Which two numbers you want to see their greatest common divisor : ");
		number1 = input.nextInt();
		number2 = input.nextInt();

		if (number1 > number2) { // we will have smaller number in "number1"
			int temp;
			temp = number1;
			number1 = number2;
			number2 = temp;
		}

		for (int i = number1; i > 0; i--) {
			if (number1 % i == 0 && number2 % i == 0) {
				System.out.println("Highest common divisor is " + i);
				break;
			}
		}
		input.close();

	}

}

package chapter10;

import java.util.Scanner;

/**
 * (Displaying the prime factors) Write a program that prompts the user to enter a positive integer and displays all its smallest factors in decreasing order. 
 * For example, if the integer is 120, the smallest factors are displayed as 5, 3, 2, 2, 2. 
 * Use the StackOfIntegers class to store the factors (e.g., 2, 2, 2, 3, 5) and retrieve and display them in reverse order.
 * 
 * @author Ali Dogan Aydoner
 *
 */
public class ProgrammingExercise05 {
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		StackOfIntegers factors = new StackOfIntegers();
		int num = -1;
		while (num <= 1) {
			System.out.print("Enter a positive integer : ");
			num = input.nextInt();
		}
		
		findFactors(factors, num);
		showFactors(factors);
		input.close();
	}

	public static boolean isPrime(int divider) {
		return MyInteger.isPrime(divider);
	}

	private static void findFactors(StackOfIntegers factors, int num) {
		int factor = 2;
		while (num != 1) {
			if (isPrime(factor) && num % factor == 0) {
				num /= factor; 
				factors.push(factor);
			} else {
				factor++;
			}
		}
	}

	public static void showFactors(StackOfIntegers factors) {
		for (int i = factors.getSize(); i > 0; i--) {
			System.out.println(factors.pop());
		}
	}

}

/*
 * (Emirp) An emirp (prime spelled backward) is a nonpalindromic prime number
 * whose reversal is also a prime. For example, 17 is a prime and 71 is a prime, so 17
 * and 71 are emirps. Write a program that displays the first 100 emirps. Display 10
 * numbers per line, separated by exactly one space, as follows:
 * 
 * 13 17 31 37 71 73 79 97 107 113
 * 149 157 167 179 199 311 337 347 359 389
 * ...
 */
package chapter06;

import java.util.Scanner;

public class ProgrammingExercise27 {

	private static boolean isEmirp(int number) {
		int reverseOfNumber = reverseOfNumber(number); // we get reverse of our number.
		if(!isPalindrome(number) && isPrime(number) && isPrime(reverseOfNumber)) { // An emirp is a nonpalindromic prime number whose reversal is also a prime. condition
			return true;
		}
		return false;
	}

	private static int reverseOfNumber(int number) {
		String numberInString = String.valueOf(number);
		String reverseOfNumber = "";
		for (int i = numberInString.length() - 1; i >= 0 ; i--) {
			reverseOfNumber += numberInString.charAt(i);
		}
		number = Integer.parseInt(reverseOfNumber);
		return number;
	}

	public static boolean isPrime(int number) {
		int divideNumber = 2;
		while (divideNumber < number) {
			if (number % divideNumber == 0) { // if number can divided by any number between 2 and (number -1) its not a
												// prime.
				return false;
			}
			divideNumber++;
		}
		return true;
	}

	public static boolean isPalindrome(int number) {
		String numberInString = String.valueOf(number);
		if (numberInString.length() > 1) {
			for (int i = 0; i < numberInString.length() / 2; i++) {
				if (numberInString.charAt(i) != numberInString.charAt(numberInString.length() - (i + 1))) { // if any character wont match its not a palindromic.
					return false;
				}
			}
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int emirpNumberCounter = 0;
		int number = 13;
		while (emirpNumberCounter < 100) {
			if (isEmirp(number)) {
				emirpNumberCounter++;
				System.out.printf("%6d", number);
				if (emirpNumberCounter % 10 == 0) {
					System.out.println();
				}
			}
			number++;
		}

		input.close();
	}
}

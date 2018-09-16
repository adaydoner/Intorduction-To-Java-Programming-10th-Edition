/*
 * (Palindromic prime) A palindromic prime is a prime number and also palindromic.
 * For example, 131 is a prime and also a palindromic prime, as are 313 and
 * 757. Write a program that displays the first 100 palindromic prime numbers. Display
 * 10 numbers per line, separated by exactly one space, as follows:
 * 
 * 2 3 5 7 11 101 131 151 181 191
 * 313 353 373 383 727 757 787 797 919 929
 * ...
 * 
 */
package chapter06;

import java.util.Scanner;

public class ProgrammingExercise26 {

	public static boolean isPrime(int number) {
		int divideNumber = 2;
		while(divideNumber < number) {
			if (number % divideNumber == 0) { // if number can divided by any number between 2 and (number -1) its not a prime. 
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
				if (numberInString.charAt(i) != numberInString.charAt(numberInString.length() - (i+1))) { // if any character wont match its not a palindromic.
					return false;
				}
			}
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int palindromicPrimeCounter = 0 ;
		int number = 2;
		while(palindromicPrimeCounter < 100) {
			if(isPrime(number) && isPalindrome(number)) {
				palindromicPrimeCounter++;
				System.out.printf("%10d",number);
				if(palindromicPrimeCounter % 10 == 0) {
					System.out.println();
				}
			}
			number++;
		}
		
		input.close();
	}
}

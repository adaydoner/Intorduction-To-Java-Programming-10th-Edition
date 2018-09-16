/*
 * (Financial: credit card number validation) Credit card numbers follow certain patterns.
 * A credit card number must have between 13 and 16 digits. It must start with:
 * 
 * ■ 4 for Visa cards
 * ■ 5 for Master cards
 * ■ 37 for American Express cards
 * ■ 6 for Discover cards
 * 
 * In 1954, Hans Luhn of IBM proposed an algorithm for validating credit card
 * numbers. The algorithm is useful to determine whether a card number is entered
 * correctly or whether a credit card is scanned correctly by a scanner. Credit card
 * numbers are generated following this validity check, commonly known as the
 * Luhn check or the Mod 10 check, which can be described as follows (for illustration,
 * consider the card number 4388576018402626):
 * 
 * Double every second digit from right to left. If doubling of a digit results in a
 * two-digit number, add up the two digits to get a single-digit number.
 * 
 * Write a program that prompts the user to enter a credit card number as a long
 * integer. Display whether the number is valid or invalid. Design your program to
 * use the following methods:
 * 
 * public static boolean isValid(long number)+
 * public static int sumOfDoubleEvenPlace(long number)+
 * public static int sumOfOddPlace(long number)+
 * public static int getDigit(int number)+
 * public static boolean prefixMatched(long number, int d)
 * public static int getSize(long d)+
 * public static long getPrefix(long number, int k)
 * 
 */
package chapter06;

import java.util.Scanner;

public class ProgrammingExercise31 {
	/*
	 * check every conditions if credit card number is valid or not.
	 */
	public static boolean isValid(long number) {
		int sumOfDoubleEvenPlace;
		int sumOfOddPlace;
		int size;
		int prefix;
		size = getSize(number);
		prefix = (int)getPrefix(number,2);
		if(size < 13 || size > 16 || !prefixMatched(number,prefix))	{ // if size would be less than 13 and larger than 16 or prefix wont match with valid ones , number would be invalid.
			return false;
		}
		sumOfDoubleEvenPlace = sumOfDoubleEvenPlace(number);
		sumOfOddPlace = sumOfOddPlace(number);
		if((sumOfDoubleEvenPlace + sumOfOddPlace) % 10 == 0) {
			return true;
		}
		return false;
	}
	
	/*
	 * Calculate summarize of (2* even place digits).
	 */
	public static int sumOfDoubleEvenPlace(long number) {
		String numberInString;
		int sum = 0;
		numberInString = String.valueOf(number);
		for (int i = getSize(number) - 1; i >= 0; i -= 2) {
			if((numberInString.charAt(i) - '0') * 2 < 10) {
				sum += getDigit((numberInString.charAt(i) - '0') * 2);
			} else {
				sum += getDigit((numberInString.charAt(i) - '0') * 2);
			}
		}
		return sum;
	}
	
	/*
	 * calculation of summarize odd places digits.
	 */
	public static int sumOfOddPlace(long number) {
		String numberInString;
		int sum = 0;
		numberInString = String.valueOf(number);
		for (int i = 1; i <= getSize(number); i += 2) {
				sum += getDigit(numberInString.charAt(i) - '0');
		}
		return sum;
	}

	/*
	 * get digit * 2 value.
	 */
	public static int getDigit(int number) {
		String numberInString;
		if(number < 10) { // if (digit * 2) would be smaller than 10 we will use it normally
			return number;
		}
		numberInString = String.valueOf(number);
		return ((numberInString.charAt(0) - '0') + (numberInString.charAt(1) - '0')); // if it  would be bigger than 10 , we will sum of 2 digits(e.g 1 + 0) seperately
	}

	/*
	 * get size of credit card number to compare with valid sizes.
	 */
	public static int getSize(long d) {
		String numberInString;
		numberInString = String.valueOf(d);
		return numberInString.length() - 1;
	}
	
	/*
	 * get first 2 prefix to compare with valid credit card prefixes.
	 */
	public static long getPrefix(long number, int k) {
		String numberInString;
		numberInString = String.valueOf(number);

		numberInString = String.valueOf(numberInString.charAt(0)) + String.valueOf(numberInString.charAt(1));
		return Long.parseLong(numberInString);
	}
	
	/*
	 * compare number's prefix with valid prefixes.
	 */
	public static boolean prefixMatched(long number, int prefix) {
		if(String.valueOf(prefix).charAt(0) - '0' == 4 || String.valueOf(prefix).charAt(0) - '0'  == 5 || String.valueOf(prefix).charAt(0) - '0'  == 6 || prefix == 37) {
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		long creditCardNumber;
		System.out.print("Enter a credit card number as a long integer : ");
		creditCardNumber = input.nextLong();
		if(isValid(creditCardNumber)) {
			System.out.printf("%d%s",creditCardNumber," is valid.");
		} else {
			System.out.printf("%d%s",creditCardNumber," is invalid.");
		}
		
		input.close();
	}
}

/*
 * (Palindrome integer) Write the methods with the following headers 
 * 		// Return the reversal of an integer, i.e., reverse(456) returns 654
 * 		public static int reverse(int number)
 * 		
 * 		// Return true if number is a palindrome
 * 		public static boolean isPalindrome(int number)
 * 
 * Use the reverse method to implement isPalindrome. A number is a palindrome
 * if its reversal is the same as itself. Write a test program that prompts the
 * user to enter an integer and reports whether the integer is a palindrome
 */
package chapter06;

import java.util.Scanner;

public class ProgrammingExercise03 {

	public static int Reverse(int number) {
		String num;
		String reversedNumInString = "";
		num = String.valueOf(number); // hold integer as a string.
		for (int i = 0; i < num.length(); i++) { // get characters digits by digits from number that we hold as a string 
			reversedNumInString = num.charAt(i) + reversedNumInString;	// write characters backwards to our reversedNumInString variable.
		}
		number = Integer.parseInt(reversedNumInString);	// turn string number back integer as reversed.
		return number;
	}
	
	
	public static boolean IsPalindrome(int num) {
		int reverseNumber;
		reverseNumber = Reverse(num); // Call reverse method to get reversed number
		if(reverseNumber == num) {	// if number equals to reversed number then its palindrome.
			return true;
		} else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number;
		boolean isPalindrome;
		System.out.print("Enter a number : ");
		number = input.nextInt();
		
		isPalindrome = IsPalindrome(number); // Call isPalindrome method , it will give us the answer.
		if(isPalindrome) {
			System.out.println(number +  " is palindrome");
		} else {
			System.out.println(number +  " is not a palindrome");
		}
		input.close();
	}

}

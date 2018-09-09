/*
 * (Display an integer reversed) Write a method with the following header to display
 * an integer in reverse order:
 * 
 * 		public static void reverse(int number)
 * 
 * For example, reverse(3456) displays 6543. Write a test program that prompts
 * the user to enter an integer and displays its reversal.
 */
package chapter06;

import java.util.Scanner;

public class ProgrammingExercise04 {

	private static void reverse(int number) {
		String num;
		String reversedNum = "";
		num = String.valueOf(number);
		for (int i = 0; i < num.length(); i++) {
			reversedNum = num.charAt(i) + reversedNum;
		}
		System.out.println("Reverse of (" + number + ") is : " + Integer.parseInt(reversedNum));
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number;
		System.out.print("Enter a number you want to reversed : ");
		number = input.nextInt();
		reverse(number);
		input.close();
	}
}

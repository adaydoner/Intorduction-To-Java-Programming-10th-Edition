/*
 * (Find the Unicode of a character) Write a program that receives a character and displays its Unicode.
 */
package chapter04;

import java.util.Scanner;

public class ProgrammingExercise09 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a character : ");
		char ch = input.nextLine().charAt(0);
		int unicodeOfChar = ch;
		System.out.println("The unicode for the character " + ch + " is " + unicodeOfChar);
		
		input.close();
	}
}

/*
 * (Check password) Some websites impose certain rules for passwords. Write a
 * method that checks whether a string is a valid password. Suppose the password
 * rules are as follows:
 * 		A password must have at least eight characters.
 * 		A password consists of only letters and digits.
 * 		A password must contain at least two digits.
 * 
 * Write a program that prompts the user to enter a password and displays Valid
 * Password if the rules are followed or Invalid Password otherwise.
 */

package chapter06;

import java.util.Scanner;

public class ProgrammingExercise18 {

	public static void isPasswordValid(String password) {
		int digitCounter = 0 ;
		if(password.length() < 8 || password.length() < 3) {
			System.out.println("Invalid Password.. A password must have at least eight characters.");
			System.exit(1);
		}
		for (int i = 0; i < password.length(); i++) {
			if(password.charAt(i) >= '0' && password.charAt(i) <= '9' || password.charAt(i) >= 'a' && password.charAt(i) <= 'z' || password.charAt(i) >= 'A' && password.charAt(i) <= 'Z' ) {
				continue;
			} else {
				System.out.println("Invalid Password.. A password consists of only letters and digits.");
				System.exit(1);
			}
		}
		for (int i = 0; i < password.length(); i++) {
			if(password.charAt(i) > '0' && password.charAt(i) < '9') {
				digitCounter++;
			}
		}
		if(digitCounter < 3) {
			System.out.println("Invalid Password.. A password must contain at least two digits.");
			System.exit(1);
		} else {
			System.out.println("Valid Password.");
		}
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a password : ");
		String password = input.nextLine();
		isPasswordValid(password);
		input.close();
	}
}

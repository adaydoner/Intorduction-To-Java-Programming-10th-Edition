/*
 * (Check SSN) Write a program that prompts the user to enter a Social Security 
 * number in the format DDD-DD-DDDD, where D is a digit. Your program should
 * check whether the input is valid.
 */
package chapter04;

import java.util.Scanner;

public class ProgrammingExercise21 {
	public static boolean IsNumeric(String str) {
		try {
			double d = Double.parseDouble(str);
		} catch (NumberFormatException nfe) {
			return false;
		}
		return true;
	}

	public static boolean CheckSSN(String socialSecurityNumber) {
		String[] numberParts = new String[3];
		numberParts = socialSecurityNumber.split("-");
		if (IsNumeric(numberParts[0]) && IsNumeric(numberParts[1]) && IsNumeric(numberParts[2])
			&& numberParts[0].length() == 3 && numberParts[1].length() == 2 && numberParts[2].length() == 4) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String socialSecurityNumber;
		System.out.print("Enter a SSN : ");
		socialSecurityNumber = input.nextLine();
		if (CheckSSN(socialSecurityNumber)) {
			System.out.printf("\"%s\" is a valid social security number", socialSecurityNumber);
		} else {
			System.out.printf("\"%s\" is an invalid social security number", socialSecurityNumber);
		}
		input.close();
	}
}

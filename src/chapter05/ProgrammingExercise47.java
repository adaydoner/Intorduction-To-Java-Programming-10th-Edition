/*
 * (Business: check ISBN-13) ISBN-13 is a new standard for indentifying books. It
 * uses 13 digits d1d2d3d4d5d6d7d8d9d10d11d12d13. The last digit d13 is a checksum,
 * which is calculated from the other digits
 * 
 * 10 - (d1 + 3d2 + d3 + 3d4 + d5 + 3d6 + d7 + 3d8 + d9 + 3d10 + d11 + 3d12)%10
 * 
 * If the checksum is 10, replace it with 0. Your program should read the input as a string
 */
package chapter05;

import java.util.Scanner;

public class ProgrammingExercise47 {

	public static int ISBN13(String first12OfISBN) {
		int returnValue;
		returnValue = (first12OfISBN.charAt(0) - '0') + (3 * (first12OfISBN.charAt(1) - '0')) + (first12OfISBN.charAt(2) - '0') + 
				(3 * (first12OfISBN.charAt(3) - '0')) + (first12OfISBN.charAt(4) - '0') + (3 * (first12OfISBN.charAt(5) - '0')) + 
				(first12OfISBN.charAt(6) - '0') + (3 * (first12OfISBN.charAt(7) - '0')) + (first12OfISBN.charAt(8) - '0') + 
				(3 * (first12OfISBN.charAt(9) - '0')) + (first12OfISBN.charAt(10) - '0') + (3 * (first12OfISBN.charAt(11) - '0'));
		returnValue = 10 - (returnValue % 10);
		if (returnValue == 10) {
			return 0;
		} else {
			return returnValue;
		}
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String first12OfISBN;
		int ISBN13;
		System.out.println("Enter the first 12 digits of an ISBN-13 as a string : ");
		first12OfISBN = input.nextLine();
		ISBN13 = (ISBN13(first12OfISBN));
		System.out.println("The ISBN-13 number is " + first12OfISBN + "" + ISBN13);
		input.close();
	}
}

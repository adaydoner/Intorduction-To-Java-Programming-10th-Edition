/*
 * (Format an integer) Write a method with the following header to format the integer with the specified width.
 * 
 * 			public static String format(int number, int width)
 * 
 * The method returns a string for the number with one or more prefix 0s. The size of the string is the width. For example, format(34, 4) returns 0034 and format( 
 * 34, 5) returns 00034. If the number is longer than the width, the method returns the string representation for the number. For example, format(34, 1) returns 34.
 * 
 * Write a test program that prompts the user to enter a number and its width and displays a string returned by invoking format(number, width).
 */
package chapter06;

import java.util.Scanner;

public class ProgrammingExercise37 {
	public static String format(int number, int width) {
		String numberInString = String.valueOf(number);
		int differenceBetweenWidthAndNumber;
		if(numberInString.length() >= width) { 
			return numberInString; // if width smaller than length we returned number back.
		}
		// if length will be bigger than number size , we add zeros to number untill it would equal to width value.
		differenceBetweenWidthAndNumber = (width) - numberInString.length(); // this is difference between width and number size which is mean zeros we need to put.
		for (int i = 0; i < differenceBetweenWidthAndNumber; i++) {
			numberInString = "0" + numberInString;
		}
		return numberInString;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int numberSpecified;
		int widthSpecified;
		String formattedValue;
		System.out.print("Enter an integer value : ");
		numberSpecified = input.nextInt();
		System.out.print("Enter a width : ");
		widthSpecified = input.nextInt();
		formattedValue = format(numberSpecified, widthSpecified);
		System.out.printf("(%d, %d) = %s", numberSpecified, widthSpecified, formattedValue);
	}

}

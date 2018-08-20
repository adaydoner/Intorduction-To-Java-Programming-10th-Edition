/*
 * (Hex to binary) Write a program that prompts the user to enter a hex digit and displays its corresponding binary number.
 */
package chapter04;

import java.util.Scanner;

public class ProgrammingExercise12 {

	public static int[] HexToBin(char hexDigit) {
		int[] binary = new int[4];
		int decimal;
		int i = 0;
		if (hexDigit >= 'A' && hexDigit <= 'F') {
			decimal = (hexDigit - 'A') + 10;
			while (decimal > 0) {
				binary[i] = decimal % 2;
				i++;
				decimal = decimal / 2;
			}
			return binary;
		} else {
			return null;
		}
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		char hexDigit;
		int[] binary = new int[4];
		System.out.println("Enter a hex digit : ");
		hexDigit = input.nextLine().charAt(0);
		binary = HexToBin(hexDigit);
		if(binary == null) {
			System.out.printf("%c is an invalid input",hexDigit);
		} else {
			System.out.println("The binary value is " + binary[3] + "" + binary[2] + "" + binary[1] + "" + binary[0]);
		}
		input.close();
	}
}

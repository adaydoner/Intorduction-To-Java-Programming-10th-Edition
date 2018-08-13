/*
 * (Random month) Write a program that randomly generates an integer between 1
 * and 12 and displays the English month name January, February, …, December for
 * the number 1, 2, …, 12, accordingly.
 */
package chapter03;

import java.util.Scanner;

public class ProgrammingExercise04 {

	public static void main(String[] args) {
		int randomNumber;
		String[] months = {"0","January","February","March","April","May","June","July","August","September","October","November","December"};
		for (int i = 0; i < 25; i++) {
			randomNumber = (int)(Math.random() * 12) + 1;
			System.out.println(randomNumber + ". month is : " + months[randomNumber]);
		}
	}

}

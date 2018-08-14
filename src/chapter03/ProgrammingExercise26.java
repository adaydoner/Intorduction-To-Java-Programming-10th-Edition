/*
 * (Use the &&, || and ^ operators) Write a program that prompts the user to enter
 * an integer and determines whether it is divisible by 5 and 6, whether it is divisible
 * by 5 or 6, and whether it is divisible by 5 or 6, but not both.
 */
package chapter03;

import java.util.Scanner;

public class ProgrammingExercise26 {

	private static void IsNumberDivisible(int usersNumber) {
		if((usersNumber % 5) == 0 && (usersNumber % 6) == 0) {
			System.out.println("Is 10 divisible by 5 and 6 ? -" + true);
		}
		else {
			System.out.println("Is 10 divisible by 5 and 6 ? -" + false);
		}
		if((usersNumber % 5) == 0 || (usersNumber % 6) == 0) {
			System.out.println("Is 10 divisible by 5 or 6 ? -" + true);
		}
		else {
			System.out.println("Is 10 divisible by 5 or 6 ? -" + false);
		}
		if((usersNumber % 5) == 0 ^ (usersNumber % 6) == 0) {
			System.out.println("Is 10 divisible by 5 or 6, but not both ? -" + true);
		}
		else {
			System.out.println("Is 10 divisible by 5 or 6, but not both ? -" + false);
		}
	}

	public static void main(String[] args) {
		Scanner readNumber = new Scanner(System.in);
		int usersNumber;
		System.out.print("Enter an integer : ");
		usersNumber = readNumber.nextInt();
		IsNumberDivisible(usersNumber);
		readNumber.close();
	}
}

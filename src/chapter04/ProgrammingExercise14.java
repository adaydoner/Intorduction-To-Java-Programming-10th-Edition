/*
 * (Convert letter grade to number) Write a program that prompts the user to enter a
 * letter grade A, B, C, D, or F and displays its corresponding numeric value 4, 3, 2, 1, or 0.
 */
package chapter04;

import java.util.Scanner;

public class ProgrammingExercise14 {

	public static int ConvertGradeToNumber(char grade) {
		grade = Character.toUpperCase(grade);
		if (grade == 'A') {
			return 4;
		}
		if (grade == 'B') {
			return 3;
		}
		if (grade == 'C') {
			return 2;
		}
		if (grade == 'D') {
			return 1;
		}
		if (grade == 'F') {
			return 0;
		} else {
			return -1;
		}
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		char grade = '0';
		int number;
		System.out.println("Enter a letter grade : ");
		grade = input.nextLine().charAt(0);
		number = ConvertGradeToNumber(grade);
		if (number == -1) {
			System.out.printf("%c is an invalid grade", grade);
		} else {
			System.out.printf("The numeric value for grade %c is %d", grade, number);
		}
	}
}

/*
 * (Sort three integers) Write a program that prompts the user to enter three integers
 * and display the integers in non-decreasing order.
 */

package chapter03;

import java.util.Scanner;

public class ProgrammingExercise08 {

	public static int[] SortIntegers(int... numbers) {
		for (int i = 0; i < numbers.length; i++) {
			for (int j = i+1 ; j < numbers.length ; j++) {
				if(numbers[i] > numbers[j]) {
					int temp = numbers[i];
					numbers[i] = numbers[j];
					numbers[j] = temp;
				}
			}
		}
		return numbers;
	}
	public static void main(String[] args) {
		int[] numbers = {0,0,0};
		Scanner readNumber = new Scanner(System.in);
		System.out.println("Enter three number : ");
		numbers[0] = readNumber.nextInt();
		numbers[1] = readNumber.nextInt();
		numbers[2] = readNumber.nextInt();
		numbers = SortIntegers(numbers);
		
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}

	}

}

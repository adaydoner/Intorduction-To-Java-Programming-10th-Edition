/*
 * (Find the factors of an integer) Write a program that reads an integer and displays
 * all its smallest factors in increasing order. For example, if the input integer is
 * 120, the output should be as follows: 2, 2, 2, 3, 5.
 */
package chapter05;

import java.util.Scanner;

public class ProgrammingExercise16 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number;
		System.out.print("Enter number : ");
		number = input.nextInt();
		
		for (int i = 2; i <= number;) {
			if(number % i == 0) {
				System.out.printf("%d ",i);
				number /= i ;
			} else {
				i++;
			}
		}
		input.close();
	}

}

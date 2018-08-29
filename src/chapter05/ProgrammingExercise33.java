/*
 * (Perfect number) A positive integer is called a perfect number if it is equal to
 * the sum of all of its positive divisors, excluding itself. For example, 6 is the first
 * perfect number because 6 = 3 + 2 + 1. The next is 28 = 14 + 7 + 4 + 2 + 1. 
 * There are four perfect numbers less than 10,000. Write a program to find all these four numbers.
 */
package chapter05;

public class ProgrammingExercise33 {

	public static void main(String[] args) {
		System.out.println("There are four perfect numbers less than 10,000.");
		for (int i = 1; i <= 10_000; i++) {
			int divisor = 0;
			for (int divisorNumber = 1; divisorNumber < i; divisorNumber++) {
				if(i % divisorNumber == 0) {
					divisor += divisorNumber;
				}
			}
			if(i == divisor) {
				System.out.println(i);
			}
		}
	}

}

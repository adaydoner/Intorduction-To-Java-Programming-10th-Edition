/*
 * (Find numbers divisible by 5 and 6) Write a program that displays all the numbers
 * from 100 to 1,000, ten per line, that are divisible by 5 and 6. Numbers are
 * separated by exactly one space.
 */
package chapter05;

public class ProgrammingExercise10 {

	public static void main(String[] args) {
		int counter = 0;
		for (int i = 100; i <= 1000;) {
			if (i % 5 == 0 && i % 6 == 0) {
				System.out.print(i + " ");
				i += 30; // When we find first number that divisible by 5 and 6 we can add 30 and find next number quicklier.
				counter++; // to count numbers that program write out so we can make new line in every ten number.
				if (counter % 10 == 0 && counter != 0) {
					System.out.println(); // new line in every ten number.
				}
			} else {
				i++;
			}
		}
	}
}

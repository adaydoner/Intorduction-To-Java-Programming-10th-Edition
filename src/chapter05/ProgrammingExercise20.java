/*
 * (Display prime numbers between 2 and 1,000) Modify Listing 5.15 to display all
 * the prime numbers between 2 and 1,000, inclusive. Display eight prime numbers
 * per line. Numbers are separated by exactly one space.
 */
package chapter05;

public class ProgrammingExercise20 {

	public static void main(String[] args) {
		int primeCounter = 0;
		for (int number = 2; number <= 1000; number++) {
			boolean isPrime = true;
			
			for (int j = number - 1; j > 1; j--) {			// if number would divide by any number except "itself(number)" and "1" it can't be prime number.
				if (number % j == 0) {					   
					isPrime = false;
					break;									// exit from loop in case we sure number can't be prime number.
				}
			}
			if (isPrime == true) {
				System.out.printf("%d ", number);
				primeCounter++;
				if (primeCounter % 8 == 0) {				// new line per 8 numbers
					System.out.println();
				}
			}
		}
	}
}

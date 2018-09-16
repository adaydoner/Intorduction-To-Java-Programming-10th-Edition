/*
 * (Twin primes) Twin primes are a pair of prime numbers that differ by 2. For example,
 * 3 and 5 are twin primes, 5 and 7 are twin primes, and 11 and 13 are twin primes.
 * Write a program to find all twin primes less than 1,000. Display the output as follows:
 * (3, 5)
 * (5, 7)
 * ...
 */
package chapter06;

public class ProgrammingExercise29 {
	public static boolean isPrime(int number) {
		int divideNumber = 2;
		if(number == 1 || number == 0) return false;
		while (divideNumber < number) {
			if (number % divideNumber == 0) { // if number can divided by any number between 2 and (number -1) its not a
												// prime.
				return false;
			}
			divideNumber++;
		}
		return true;
	}

	public static void main(String[] args) {
		int number = 1;
		while (number <= 1_000) {
			if (isPrime(number) && isPrime(number + 2)) {
				System.out.printf("(%d,%d)\n", number, number + 2);
			}
			number++;
		}

	}

}

/*
 * (Use the isPrime Method) Listing 6.7, PrimeNumberMethod.java, provides the
 * isPrime(int number) method for testing whether a number is prime. Use this
 * method to find the number of prime numbers less than 10000.
 */
package chapter06;

public class ProgrammingExercise10 {
	public static boolean isPrime(int number) {
		for (int divisor = 2; divisor <= number / 2;divisor++) {
			if (number % divisor == 0) { // If true, number is not prime
				return false; // Number is not a prime
			}
		}
		return true; // Number is prime
	}

	public static void main(String[] args) {
		int number = 2;
		int lineCounter = 0;
		while(number <= 10_000) {
			if(isPrime(number)) {
				System.out.printf("%5d",number);
				lineCounter++;
				if(lineCounter % 10 == 0) {
					System.out.println();
				}
			}
			number++;
		}
	}
}

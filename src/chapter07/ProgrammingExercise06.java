/*
 * (Revise Listing 5.15, PrimeNumber.java) Listing 5.15 determines whether a number n is prime by checking whether 2, 3, 4, 5, 6, . . . , n/2 is a divisor. 
 * If a divisor is found, n is not prime. A more efficient approach is to check whether any of the
 * prime numbers less than or equal to sqrt(n) can divide n evenly. If not, n is prime.
 * Rewrite Listing 5.15 to display the first 50 prime numbers using this approach.
 * You need to use an array to store the prime numbers and later use them to check
 * whether they are possible divisors for n.
 */
package chapter07;

public class ProgrammingExercise06 {

	public static void main(String[] args) {
		final int NUMBER_OF_PRIMES = 50;
		final int NUMBER_OF_PRIMES_PER_LINE = 10;
		int[] primeNumbersArray = new int[50];
		int count = 0;
		int number = 2;
		boolean hasArrayOnlyPrimes;
		while (count < NUMBER_OF_PRIMES) {
			boolean isPrime = true; // Is the current number prime?
			for (int divisor = 2; divisor <= number / 2; divisor++) {
				if (number % divisor == 0) { // If true, number is not prime
					isPrime = false;
					break;
				}
			}
			primeNumbersArray[count] = number;
			if (isPrime) {
				count++; // Increase the count
				if (count % NUMBER_OF_PRIMES_PER_LINE == 0) {
					System.out.println(number);
				} else {
					System.out.print(number + " ");
				}
			}
			number++;
		}
		hasArrayOnlyPrimes = CheckIfArrayHasOnlyPrimeNumbers(primeNumbersArray);
		System.out.print("Check : " + hasArrayOnlyPrimes);
	}

	public static boolean CheckIfArrayHasOnlyPrimeNumbers(int[] primeNumbersArray) {
		for (int i = 0; i < primeNumbersArray.length; i++) {
			for (int divisor = 2; divisor <= (int)Math.sqrt(primeNumbersArray[i]); divisor++) {
				if (primeNumbersArray[i] % divisor == 0) { // If true, number is not prime
					return false;
				}
			}
		}
		return true;
	}
}

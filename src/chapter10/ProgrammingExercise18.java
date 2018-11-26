package chapter10;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * (Large prime numbers) Write a program that finds five prime numbers larger than Long.MAX_VALUE.
 * @author Ali Dogan Aydoner
 *
 */
public class ProgrammingExercise18 {

	public static void main(String[] args) {
		long longMax = Long.MAX_VALUE;
		long[] primeNumbers = new long[1000];
		findPrimes(primeNumbers); // prime number list , we will try to divide large numbers evenly with these..
		
		int writtenNumbers = 0;
		BigInteger bigIntNumber = new BigInteger(String.valueOf(longMax)).add(BigInteger.ONE);
		
		while (writtenNumbers < 5) {
			if(isPrime(bigIntNumber,primeNumbers)){
				System.out.println(bigIntNumber + " is a prime number.");
				writtenNumbers++;
			}
			bigIntNumber = bigIntNumber.add(BigInteger.ONE);
		}
	}
	public static boolean isPrime(BigInteger bigIntNumber, long[] primeNumbers) {
		for (int i = 0; i < 1000; i++) {
			if(new BigDecimal(bigIntNumber).remainder(new BigDecimal(primeNumbers[i])).equals(BigDecimal.ZERO)){
				// not a prime
				return false;
			}
		}
		return true;
	}

	public static void findPrimes(long[] primeNumbers) {
		int writers = 0;
		for (int i = 2; writers < 1000; i++) {
			if(isPrime(i)){
				primeNumbers[writers] = i;
				writers++;
			}
		}
	}

	public static boolean isPrime(int i) {
		for (int j = 2; j < i; j++) {
			if(i % j == 0){
				return false;
			}
		}
		return true;
	}
}
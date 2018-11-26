package chapter10;

import java.math.BigDecimal;

/**
 * (Mersenne prime) A prime number is called a Mersenne prime if it can be written in the form Math.pow(2,p) - 1 for some positive integer p. 
 * Write a program that finds all Mersenne primes with p … 100 and displays the output as shown below. 
 * (Hint: You have to use BigInteger to store the number, because it is too big to be stored in long.
 * @author Ali Dogan Aydoner
 *
 */
public class ProgrammingExercise19 {

	public static void main(String[] args) {
		long[] primeNumbers = new long[1000];
		findPrimes(primeNumbers); // prime number list , we will try to divide large numbers evenly with these..
		System.out.printf("%-10s%-10s\n","p","2^p - 1");
		
		for (int i = 2; i <= 100; i++) {
			BigDecimal bd = new BigDecimal(2);
			bd = bd.pow(i).subtract(BigDecimal.ONE);
			if(isPrime(bd,primeNumbers)){
				System.out.printf("%-10d%-10s\n",i,bd.toString());
			}
		}
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

	public static boolean isPrime(BigDecimal bd,long[] primeNumbers) {
		for (int i = 0; i < 1000; i++) {
			if(!bd.equals(new BigDecimal(primeNumbers[i])) && bd.remainder(new BigDecimal(primeNumbers[i])).equals(BigDecimal.ZERO)){
				// not a prime
				return false;
			}
		}
		return true;
	}
}

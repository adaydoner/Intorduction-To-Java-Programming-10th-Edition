/*
 * (Mersenne prime) A prime number is called a Mersenne prime if it can be written
 * in the form 2 power of p - 1 for some positive integer p. Write a program that finds all
 * Mersenne primes with p <= 31 and displays the output as follows:
 * 
 * p 2^p –1
 * -------
 * 2	3
 * 3	7
 * 5	31
 * ...
 */

package chapter06;

public class ProgrammingExercise28 {
	public static boolean isPrime(int number) {
		if(number == 1 || number == 0) return false;
		int divideNumber = 2;
		while (divideNumber < number) {
			if (number % divideNumber == 0) { // if number can divided by any number between 2 and (number -1) its not a
												// prime.
				return false;
			}
			divideNumber++;
		}
		return true;
	}

	private static int mersennePrime(int powerValue) {
		int number = (int)Math.pow(2, powerValue) - 1;
		if(isPrime(number)) {
			return number;
		}
		return -1;
	}


	public static void main(String[] args) {
		int powerValueForMersenneCalculation = 1;
		int valueOfMersenneComputation;
		System.out.printf("%-5s%10s%-5s\n","p"," ","2^p-1");
		System.out.println("------------------------");
		while(powerValueForMersenneCalculation <= 31) {
			valueOfMersenneComputation = mersennePrime(powerValueForMersenneCalculation);
			if(valueOfMersenneComputation == -1) {
				powerValueForMersenneCalculation++;
			}else {
				System.out.printf("%-5d%10s%-5d\n",powerValueForMersenneCalculation," ",valueOfMersenneComputation);
				powerValueForMersenneCalculation++;
			}
		}
	}
}

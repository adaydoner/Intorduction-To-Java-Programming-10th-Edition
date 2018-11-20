package chapter10;
import Classes.MyInteger;
/**
 * (Displaying the prime numbers) Write a program that displays all the prime numbers less than 120 in decreasing order. 
 * Use the StackOfIntegers class to store the prime numbers (e.g., 2, 3, 5, ...) and retrieve and display them in reverse order.
 * 
 * 
 * @author Ali Dogan Aydoner
 *
 */
public class ProgrammingExercise06 {

	public static void main(String[] args) {
		StackOfIntegers primeNumbers = new StackOfIntegers();
		pushPrimeNumbers(primeNumbers);
		showPrimeNumbers(primeNumbers);
	}

	private static void pushPrimeNumbers(StackOfIntegers primeNumbers) {
		for (int i = 2; i < 120; i++) {
			if (MyInteger.isPrime(i)) {
				primeNumbers.push(i);
			}
		}
	}

	public static void showPrimeNumbers(StackOfIntegers primeNumbers) {
		for (int i = primeNumbers.getSize() - 1; i >= 0; i--) {
			System.out.println(primeNumbers.pop());
		}

	}
}

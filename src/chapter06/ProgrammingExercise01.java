/*
 * (Math: pentagonal numbers) A pentagonal number is defined as n(3n–1)/2 for
 * n = 1, 2, . . ., and so on. Therefore, the first few numbers are 1, 5, 12, 22, . . . .
 * Write a method with the following header that returns a pentagonal number:
 * 
 * public static int getPentagonalNumber(int n)
 * 
 * Write a test program that uses this method to display the first 100 pentagonal
 * numbers with 10 numbers on each line.
 */
package chapter06;

public class ProgrammingExercise01 {

	public static void main(String[] args) {
		for (int i = 1; i <= 100; i++) { // Since we need to use method with a return value , we should use for loop to call method
			System.out.printf("%10d", getPentagonalNumber(i)); // when we have pentagonalnumber from method , we can print it.
			if (i % 10 == 0) { 			// it will make new line for every 10 printed numbers
				System.out.println();
			}
		}
	}

	public static int getPentagonalNumber(int n) {
		int getPentagonalNumber = n * (3 * n - 1) / 2;
		return getPentagonalNumber;
	}
}

package chapter10;

import java.math.BigInteger;

/**
 * (Square numbers) Find the first ten square numbers that are greater than Long.MAX_VALUE. A square number is a number in the form of n2. 
 * For example, 4, 9, and 16 are square numbers. Find an efficient approach to run your program fast.
 * @author Ali Dogan Aydoner
 *
 */
public class ProgrammingExercise17 {

	public static void main(String[] args) {
		long squareOfLongMax = (long)Math.sqrt(Long.MAX_VALUE);
		int writtenNumbers = 0;
		// first square number that greater than Long.MAX_VALUE
		BigInteger bigIntNumber = new BigInteger(String.valueOf(squareOfLongMax)).add(BigInteger.ONE);
		while(writtenNumbers < 10){
			System.out.println(bigIntNumber.pow(2));
			bigIntNumber = bigIntNumber.add(BigInteger.ONE);
			writtenNumbers++;
		}
	}
}

package chapter10;

import java.math.BigInteger;

/**
 * (Divisible by 2 or 3) Find the first ten numbers with 50 decimal digits that are divisible by 2 or 3.
 * @author Ali Dogan Aydoner
 *
 */
public class ProgrammingExercise16 {

	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		String stringNumber = 1 + "";
		// make number with 50 digit.
		for (int i = 0; i < 49; i++) {
			stringNumber += "0";
		}
		
		BigInteger bigIntNumber = new BigInteger(stringNumber);
		int writenNumbers = 0;
		while(writenNumbers < 10){
			if(bigIntNumber.remainder(new BigInteger("2")) == BigInteger.ZERO || bigIntNumber.remainder(new BigInteger("3")) == BigInteger.ZERO){
				System.out.println(bigIntNumber);
				writenNumbers++;
			}
			bigIntNumber = bigIntNumber.add(BigInteger.ONE);
		}
		System.out.println("Execute time is : " + (System.currentTimeMillis() - startTime) + " milliseconds");
	}
}

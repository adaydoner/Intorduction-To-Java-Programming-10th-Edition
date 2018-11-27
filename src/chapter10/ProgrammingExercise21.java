package chapter10;

import java.math.BigDecimal;

/**
 * (Divisible by 5 or 6) Find the first ten numbers greater than Long.MAX_VALUE that are divisible by 5 or 6.
 * @author Ali Dogan Aydoner
 *
 */
public class ProgrammingExercise21 {

	public static void main(String[] args) {
		BigDecimal bd = new BigDecimal(Long.MAX_VALUE).add(BigDecimal.ONE); // we got the first number that bigger than long.max value
		int writtenNumbers = 0;
		
		while (writtenNumbers < 5) {
			if (bd.remainder(new BigDecimal(5)).equals(BigDecimal.ZERO) || bd.remainder(new BigDecimal(6)).equals(BigDecimal.ZERO)) {
				System.out.println(bd.toString());
				writtenNumbers++;
			}
			bd = bd.add(BigDecimal.ONE);
		}
	}
}

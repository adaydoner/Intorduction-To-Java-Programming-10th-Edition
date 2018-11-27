package chapter10;

import java.math.BigDecimal;
import java.math.MathContext;

/**
 * (Approximate e) Programming Exercise 5.26 approximates e using the following series:
 * 		e = 1 + 1/1! + 1 / 2! + 1/3! + ... + 1 / i!
 * 
 * In order to get better precision, use BigDecimal with 25 digits of precision in the computation. Write a program that displays the e value for i = 100, 200, . . . , and 1000.
 * @author Ali Dogan Aydoner
 *
 */
public class ProgrammingExercise20 {

	public static void main(String[] args) {
		BigDecimal bdE = new BigDecimal("0");
		
		for (int i = 1; i < 100; i++) {
			bdE = bdE.add(new BigDecimal(1).divide(fact(new BigDecimal(i)), MathContext.DECIMAL32));
		}
		System.out.println("Value for i = 100  => " + bdE.toString());

		bdE = BigDecimal.ZERO;
		for (int i = 1; i < 200; i++) {
			bdE = bdE.add(new BigDecimal(1).divide(fact(new BigDecimal(i)), MathContext.DECIMAL32));
		}
		System.out.println("Value for i = 200  => " + bdE.toString());
		
		bdE = BigDecimal.ZERO;
		for (int i = 1; i < 300; i++) {
			bdE = bdE.add(new BigDecimal(1).divide(fact(new BigDecimal(i)), MathContext.DECIMAL32));
		}
		System.out.println("Value for i = 300  => " + bdE.toString());
		
	}

	public static BigDecimal fact(BigDecimal bigDecimal) {
		BigDecimal fact = new BigDecimal(1);
		for (BigDecimal i = new BigDecimal(1); bigDecimal.compareTo(i) >= 0; i = i.add(new BigDecimal(1))) {
			fact = fact.multiply(i);
		}
		return fact;
	}
}

/*
 * (Financial application: compute future tuition) Suppose that the tuition for a university
 * is $10,000 this year and increases 5% every year. In one year, the tuition
 * will be $10,500. Write a program that computes the tuition in ten years and the
 * total cost of four years worth of tuition after the tenth year.
 */
package chapter05;
import java.text.DecimalFormat;

public class ProgrammingExercise07 {
	

	public static void main(String[] args) {
		
		final double TUITION_INCREASE_RATE = 0.05;
		int tuition = 10000;
		for (int i = 1; i <= 10; i++) {
			tuition = (int) (tuition + (tuition * TUITION_INCREASE_RATE));
			System.out.println(i + ". years tuition would be : " + DecimalFormat.getCurrencyInstance().format(tuition));
		}
		System.out.println("\n");
		int costOfFourYearsStudy = 0;
		for (int i = 0; i < 4; i++) {
			tuition = (int) (tuition + (tuition * TUITION_INCREASE_RATE));
			costOfFourYearsStudy += tuition;
		}
		System.out.print("Total cost of four years worth of tuition after the tenth year(11-12-13-14) would be : " + DecimalFormat.getCurrencyInstance().format(costOfFourYearsStudy));
	}
}

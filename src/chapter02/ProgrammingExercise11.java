/**
 * (Population projection) Rewrite Programming Exercise 1.11 to prompt the user 
 * to enter the number of years and displays the population after the number of years.
 * Use the hint in Programming Exercise 1.11 for this program. The population
 * should be cast into an integer. Here is a sample run of the program:
 * (1-11);
 *  --- One birth every 7 seconds
 *  --- One death every 13 seconds
 *  --- One new immigrant every 45 seconds
 * Write a program to display the population for each of the next five years. Assume the current population is 312,032,486 and one year has 365 days.
 
 */
package chapter02;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ProgrammingExercise11 {
	public static double YearlyPopulationChange(double birthRate, double deathRate, double immigrantRate) {
		double yearlyChange;
		double yearlyBirths = birthRate * 60 * 60 * 24 * 365;
		double yearlyDeaths = deathRate * 60 * 60 * 24 * 365;
		double yearlyImmigrants = immigrantRate * 60 * 60 * 24 * 365;
		yearlyChange = yearlyBirths - yearlyDeaths + yearlyImmigrants;
		return yearlyChange;

	}

	public static void main(String[] args) {

		Scanner readNumber = new Scanner(System.in);
		DecimalFormat formatter = new DecimalFormat("#,###");
		int years;
		int currentPopulation = 312_032_486;
		double wantedPopulation;
		double birthRate = 1.0 / 7;
		double deathRate = 1.0 / 13;
		double immigrationRate = 1.0 / 45;
		System.out.print("Enter the number of years : ");
		years = readNumber.nextInt();
		wantedPopulation = YearlyPopulationChange(birthRate, deathRate, immigrationRate) * years + currentPopulation;

		System.out.println("The population in " + years + " is " + formatter.format(wantedPopulation));

		if (readNumber != null) {
			readNumber.close();
		}

	}

}

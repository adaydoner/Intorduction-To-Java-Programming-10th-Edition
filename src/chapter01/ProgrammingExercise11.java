/*
 * (Population projection) The U.S. Census Bureau projects population based on the following assumptions:
 *  --- One birth every 7 seconds
 *  --- One death every 13 seconds
 *  --- One new immigrant every 45 seconds
 * Write a program to display the population for each of the next five years. Assume the current population is 312,032,486 and one year has 365 days.
 */

package chapter01;

import java.text.DecimalFormat;

public class ProgrammingExercise11 {

	public static void main(String[] args) {
		DecimalFormat formatter = new DecimalFormat("#,###");
		int currentPopulation = 312_032_486;
		int birthsOfYear, deathsOfYear, immigrationsOfYear;
		
		birthsOfYear = (int) (((60.0 / 7) * 60 * 24 * 365));
		deathsOfYear = (int) (((60.0 / 13) * 60 * 24 * 365));
		immigrationsOfYear = (int) (((60.0 / 45) * 60 * 24 * 365));
		
		int yearlyChange = (birthsOfYear - deathsOfYear + immigrationsOfYear);
		
		System.out.println("Year of 2018 Population : " + formatter.format(currentPopulation));
		for (int i = 1; i <= 5; i++) {
			currentPopulation = (currentPopulation + yearlyChange);
			System.out.println("Year of " + (i + 2018) + " Population : " + formatter.format(currentPopulation));
		}
	}

}

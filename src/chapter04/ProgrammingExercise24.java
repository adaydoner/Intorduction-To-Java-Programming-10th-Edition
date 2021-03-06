/*
 * (Order three cities) Write a program that prompts the user to enter three cities and displays them in ascending order.
 */
package chapter04;

import java.util.Scanner;

public class ProgrammingExercise24 {

	public static void SortCities(String[] cities) {
		String temp;
		String[] cities2 = new String[3];
		for (int i = 0; i < cities.length; i++) {
			cities2[i] = cities[i].toLowerCase();
		}
		for (int i = 0; i < 3; i++) {
			for (int j = i + 1; j < 3; j++) {
				if (cities2[i].compareTo(cities2[j]) > 0) {
					temp = cities2[i];
					cities2[i] = cities2[j];
					cities2[j] = temp;
					temp = cities[i];
					cities[i] = cities[j];
					cities[j] = temp;
				}
			}
		}
		System.out.printf("The three cities in alphabetical order are %s %s %s", cities[0], cities[1], cities[2]);
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String[] cities = new String[3];
		System.out.print("Enter the first city : ");
		cities[0] = input.nextLine();
		System.out.print("Enter the second city : ");
		cities[1] = input.nextLine();
		System.out.print("Enter the third city : ");
		cities[2] = input.nextLine();
		SortCities(cities);
		input.close();
	}
}

package chapter02;

import java.util.Scanner;

public class ProgrammingExercise04 {
	public static double poundsIntoKilogram(double pounds) {
		double kilogram;
		kilogram = pounds * 0.454;
		return kilogram;
	}

	public static void main(String[] args) {
		Scanner readNumber = new Scanner(System.in);
		double kilogram;
		double pounds;
		System.out.print("Enter a number in pounds : ");
		pounds = readNumber.nextDouble();
		kilogram = poundsIntoKilogram(pounds);
		System.out.printf("%.2f pounds is %.3f kilograms",pounds,kilogram);
		
		if(readNumber != null) {
			readNumber.close();
		}

	}

}

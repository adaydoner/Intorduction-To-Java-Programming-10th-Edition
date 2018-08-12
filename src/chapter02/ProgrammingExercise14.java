/*
 * (Health application: computing BMI) Body Mass Index (BMI) is a measure of
 * health on weight. It can be calculated by taking your weight in kilograms and
 * dividing by the square of your height in meters. Write a program that prompts the
 * user to enter a weight in pounds and height in inches and displays the BMI. Note
 * that one pound is 0.45359237 kilograms and one inch is 0.0254 meters.
 */
package chapter02;

import java.util.Scanner;

public class ProgrammingExercise14 {
	public static double BMI(double weight , double height) {
		double bmi;
		bmi = weight / Math.pow(height, 2);
		return bmi;
	}

	public static void main(String[] args) {
		int userChoosing;
		double weight;
		double height;
		double userBMI = 0;
		Scanner readNumber = new Scanner(System.in);
		System.out.println("- What type would you like to use ?-");
		System.out.println("1.)Kilograms / Meter");
		System.out.println("2.)Pounds / Inches");
		userChoosing = readNumber.nextInt();
		System.out.print("Enter weight : ");
		weight = readNumber.nextDouble();
		System.out.print("Enter height : ");
		height = readNumber.nextDouble();
		if(userChoosing == 1) {
			userBMI = BMI(weight,height);
		}
		else if (userChoosing == 2) {
			userBMI = BMI((weight * 0.45359237),(height * 0.0254));
		}
		System.out.printf("BMI is %.3f",userBMI);

		if (readNumber != null) {
			readNumber.close();
		}

	}

}

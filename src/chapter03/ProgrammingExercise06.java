/*
 * (Health application: BMI) Revise Listing 3.4, ComputeAndInterpretBMI.java, to
 * let the user enter weight, feet, and inches. For example, if a person is 5 feet and 10
 * inches, you will enter 5 for feet and 10 for inches.
 */
package chapter03;

import java.util.Scanner;

public class ProgrammingExercise06 {
	public static double CalculateBMI(double weight, double height) {
		double bmi;
		bmi = weight / (height * height);
		return bmi;
	}

	public static void main(String[] args) {
		final double KILOGRAMS_PER_POUND = 0.45359237;
		final double METERS_PER_INCH = 0.0254;
		final double INCHS_PER_FEET = 12;
		Scanner readNumber = new Scanner(System.in);
		double weight;
		double height;
		double bmi;
		System.out.print("Enter weight in pounds : ");
		weight = (readNumber.nextDouble()) * KILOGRAMS_PER_POUND;
		System.out.print("Enter feet : ");
		height = (readNumber.nextDouble()) * INCHS_PER_FEET;
		System.out.print("Enter inches : ");
		height = ( readNumber.nextDouble() + height ) * METERS_PER_INCH;
		
		bmi = CalculateBMI(weight, height);
		System.out.println("BMI is : " + (int)(bmi * 100) / 100.0);
		
		if(bmi < 18) {
			System.out.println("Underweight");
		}
		else if (bmi < 25) {
			System.out.println("Normal");
		}
		else if (bmi < 30){
			System.out.println("Overweight");
		}
		else {
			System.out.println("Obese");
		}
	}

}

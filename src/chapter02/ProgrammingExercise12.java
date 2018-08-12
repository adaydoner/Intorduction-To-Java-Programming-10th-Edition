/*
 * (Physics: finding runway length) Given an airplane’s acceleration a and take-off
 * speed v, you can compute the minimum runway length needed for an airplane to
 * take off using the following formula: Length = v'2 / 2a
 * Write a program that prompts the user to enter v in meters/second (m/s) and the
 * acceleration a in meters/second squared (m/s2), and displays the minimum runway
 * length.
 */
package chapter02;

import java.util.Scanner;

public class ProgrammingExercise12 {
	public static double FindRunwayLength(int speed , double acceleration) {
		double runwayLength;
		runwayLength = (Math.pow(speed, 2)) / (2 * acceleration);
		return runwayLength;
	}

	public static void main(String[] args) {
		int speed;
		double acceleration;
		double runwayLength;
		Scanner readNumber = new Scanner(System.in);
		System.out.print("Enter speed and acceleration : ");
		speed = readNumber.nextInt();
		acceleration = readNumber.nextDouble();
		runwayLength = FindRunwayLength(speed, acceleration);
		System.out.printf("The minimum runway length for this airplane is %.3f",runwayLength);
		
		if(readNumber != null) {
			readNumber.close();
		}
	}

}

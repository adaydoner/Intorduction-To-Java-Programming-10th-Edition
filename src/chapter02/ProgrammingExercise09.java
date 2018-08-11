/*
 *      (Physics: acceleration)
 *      
 *      a = (v1 - v0) / t
 */


package chapter02;

import java.util.Scanner;

public class ProgrammingExercise09 {
	public static double FindAcceleration(double v0 , double v1 , double t) {
		double acceleration;
		acceleration = (v1 - v0) / t;
		return acceleration;
	}

	public static void main(String[] args) {
		double v0;
		double v1;
		double t;
		double averageAcceleration;
		
		Scanner readNumber = new Scanner(System.in);
		System.out.print("Enter v0, v1, and t : ");
		v0 = readNumber.nextDouble();
		v1 = readNumber.nextDouble();
		t = readNumber.nextDouble();
		averageAcceleration = FindAcceleration(v0, v1, t) ;
		System.out.printf("The average acceleration is %.3f " ,averageAcceleration);
		
		if(readNumber != null) {
			readNumber.close();
		}

	}

}

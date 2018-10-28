/*
 * (Geometry: rightmost lowest point) In computational geometry, often you need to find the rightmost lowest point in a set of points.
 * Write the following method that returns the rightmost lowest point in a set of points.
 * 		public static double[] getRightmostLowestPoint(double[][] points)
 * 
 * Write a test program that prompts the user to enter the coordinates of six points and displays the rightmost lowest point.
 */
package chapter08;

import java.util.Scanner;

public class ProgrammingExercise34 {
    static Scanner input = new Scanner(System.in);
    static final int NUMBER_OF_POINTS = 6;
	
    public static void main(String[] args) {
		double[][] points = new double[NUMBER_OF_POINTS][2];
		double[] rightmostLowestPoint;
		
		getPointsFromUser(points);
		rightmostLowestPoint = getRightmostLowestPoint(points);
		
		System.out.printf("The rightmost lowest point is (%.1f, %.1f)",rightmostLowestPoint[0],rightmostLowestPoint[1]);
		
    	
    }
	public static void getPointsFromUser(double[][] points) {
		System.out.print("Enter " + NUMBER_OF_POINTS + " points : ");
		for (int i = 0; i < points.length; i++) {
			for (int j = 0; j < points[i].length; j++) {
				points[i][j] = input.nextDouble();
			}
		}
	}
	
	public static double[] getRightmostLowestPoint(double[][] points) {
		double lowestYValue = Double.MAX_VALUE;
		double highestXValueOfSameLowestPoints = 0;

		for (int i = 0; i < points.length; i++) {
			if (points[i][1] < lowestYValue) { // get Y values of each points and pick te lowest one
				lowestYValue = points[i][1];
				highestXValueOfSameLowestPoints = points[i][0]; 
			} else if(points[i][1] == lowestYValue && points[i][0] > highestXValueOfSameLowestPoints) { // if there would be same y value , get the point that has the highest X value.
				highestXValueOfSameLowestPoints = points[i][0];
			}
		}
		
		return new double[] { highestXValueOfSameLowestPoints , lowestYValue };
	}
	
}

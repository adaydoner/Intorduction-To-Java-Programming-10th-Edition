package chapter10;
import java.util.Scanner;

import Classes.MyRectangle2D;
/**
 * (Geometry: the bounding rectangle) A bounding rectangle is the minimum rectangle that encloses a set of points in a two-dimensional plane, as shown in Figure 10.24d. 
 * Write a method that returns a bounding rectangle for a set of points in a two-dimensional plane, as follows:
 * 
 * 		public static MyRectangle2D getRectangle(double[][] points)
 * 		
 * The Rectangle2D class is defined in Programming Exercise 10.13. 
 * Write a test program that prompts the user to enter five points and displays the bounding rectangle’s center, width, and height.
 * @author Ali Dogan Aydoner
 *
 */
public class ProgrammingExercise15 {
	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		double[][] points = new double[5][2];

		getPoints(points);
		System.out.printf("The bounding rectangle's center (%.2f, %.2f), width %.2f, height %.2f",
				MyRectangle2D.getRectangle(points).getX(),MyRectangle2D.getRectangle(points).getY(),MyRectangle2D.getRectangle(points).getWidth(),MyRectangle2D.getRectangle(points).getHeight());
		input.close();
	}

	private static void getPoints(double[][] points) {
		System.out.print("Enter five points : ");
		for (int i = 0; i < points.length; i++) {
			for (int j = 0; j < points[i].length; j++) {
				points[i][j] = input.nextDouble();
			}
		}
	}
}

/*
 * (Points nearest to each other) Listing 8.3 gives a program that finds two points in a
 * two-dimensional space nearest to each other. Revise the program so that it finds two
 * points in a three-dimensional space nearest to each other. Use a two-dimensional
 * array to represent the points. Test the program using the following points:
 * 
 * 	double[][] points = {{-1, 0, 3}, {-1, -1, -1}, {4, 1, 1}, {2, 0.5, 9}, {3.5, 2, -1}, {3, 1.5, 3}, {-1.5, 4, 2}, {5.5, 4, -0.5}};
 */
package chapter08;

public class ProgrammingExercise07 {

	public static void main(String[] args) {
		double[][] points = { { -1, 0, 3 }, { -1, -1, -1 }, { 4, 1, 1 }, { 2, 0.5, 9 }, { 3.5, 2, -1 }, { 3, 1.5, 3 }, { -1.5, 4, 2 }, { 5.5, 4, -0.5 } };
		double distance = 0;
		double minDistance = 5000;
		double[][] nearestPoints = new double[2][3];
		for (int i = 0; i < points.length; i++) {
			for (int j = i + 1; j < points.length; j++) {
				distance = distanceBetweenTwoPoints(points[i], points[j]);
				if(distance < minDistance ) {
					minDistance = distance;
					nearestPoints[0] = points[i];
					nearestPoints[1] = points[j];
				}
			}
		}
		System.out.println("--- Closest points ---");
		printArray(nearestPoints[0]);
		System.out.print(" - ");
		printArray(nearestPoints[1]);
		System.out.println("\n--- Distance ---");
		System.out.println(distance);
	}

	public static void printArray(double[] ds) {
		System.out.print("{ ");
		for (int i = 0; i < ds.length; i++) {
			System.out.print(" " + ds[i]);
			if(i == ds.length - 1) break;
			System.out.print(",");
		}
		System.out.print(" } ");
	}

	public static double distanceBetweenTwoPoints(double[] point1, double[] point2) {
		double distance = 0;
		
		distance = Math.abs(Math.sqrt(Math.pow(point1[0] - point2[0], 2) + Math.pow(point1[1] - point2[1], 2) + Math.pow(point1[2] - point2[2], 2)));
		
		return distance;
	}
}

package chapter11;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * (Area of a convex polygon) A polygon is convex if it contains any line segments that connects two points of the polygon. 
 * Write a program that prompts the user to enter the number of points in a convex polygon, then enter the points clockwise, and display the area of the polygon.
 * @author Ali Dogan Aydoner
 *
 */
public class ProgrammingExercise15 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		ArrayList<Double> pointX = new ArrayList<Double>();
		ArrayList<Double> pointY = new ArrayList<Double>();

		int numberOfPoint;
		double area;
		
		System.out.print("Enter the number of the point : ");
		numberOfPoint = input.nextInt();
		
		System.out.println("Enter the coordinates of the points clockwise : ");
		for (int i = 0; i < numberOfPoint; i++) {
			pointX.add(input.nextDouble());
			pointY.add(input.nextDouble());
		}
		area = areaOfConvexPolygon(pointX,pointY);
		System.out.println(area);
		
		input.close();
	}

	private static double areaOfConvexPolygon(ArrayList<Double> x, ArrayList<Double> y) {
		x = makeCounterClockWise(x);
		y = makeCounterClockWise(y);
		double firstDeterminant = 0;
		double secondDeterminant = 0;
		
		for (int i = 0,j = 1; i < x.size() - 1; i++,j++) {
			firstDeterminant += x.get(i) * y.get(j);
		}
		firstDeterminant += x.get(x.size() - 1) * y.get(0);
		
		
		for (int j = 0,i = 1; j < y.size() - 1; j++,i++) {
			secondDeterminant += y.get(j) * x.get(i);
		}
		secondDeterminant += y.get(y.size() - 1) * x.get(0);
		
		return ((1.0 / 2) * (firstDeterminant - secondDeterminant));
	}

	public static ArrayList<Double> makeCounterClockWise(ArrayList<Double> list) {
		ArrayList<Double> counterClockWiseList = new ArrayList<>();
		counterClockWiseList.add(list.get(0));
		for (int i = list.size() - 1; i > 0 ; i--) {
			counterClockWiseList.add(list.get(i));
		}
		return counterClockWiseList;
	}


}

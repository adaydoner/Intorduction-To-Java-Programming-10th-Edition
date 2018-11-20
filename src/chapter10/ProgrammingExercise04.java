package chapter10;
import Classes.MyPoint;
/**
 * (The MyPoint class) Design a class named MyPoint to represent a point with x- and y-coordinates. The class contains:
 * 		The data fields x and y that represent the coordinates with getter methods.
 * 		A no-arg constructor that creates a point (0, 0).
 * 		A constructor that constructs a point with specified coordinates.
 * 		A method named distance that returns the distance from this point to a specified point of the MyPoint type.
 * 		A method named distance that returns the distance from this point to another point with specified x- and y-coordinates.
 * 	
 * Draw the UML diagram for the class and then implement the class. 
 * Write a test program that creates the two points (0, 0) and (10, 30.5) and displays the distance between them.
 * 
 * @author Ali Dogan Aydoner
 *
 */
public class ProgrammingExercise04 {
	public static void main(String[] args) {
		MyPoint point1 = new MyPoint(0,0);
		MyPoint point2 = new MyPoint(10,30.5);
		
		System.out.println("Distance between object1(0,0) and object2(10,30.5) is  " + point1.distance(point2));
		System.out.println("Distance between object1(0,0) and primitive(5,0) is  " + point1.distance(5,0));
	}
}
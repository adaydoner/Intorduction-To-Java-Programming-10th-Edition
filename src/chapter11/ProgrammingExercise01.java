package chapter11;
import java.util.Scanner;
import Classes.GeometricObject;
import Classes.IllegalTriangleException;
import Classes.Triangle;
/**
 * (The Triangle class) Design a class named Triangle that extends GeometricObject. The class contains:
 *  Three double data fields named side1, side2, and side3 with default values 1.0 to denote three sides of the triangle.
 * A no-arg constructor that creates a default triangle.
 * A constructor that creates a triangle with the specified side1, side2, and side3.
 * The accessor methods for all three data fields.
 * A method named getArea() that returns the area of this triangle.
 * A method named getPerimeter() that returns the perimeter of this triangle.
 * A method named toString() that returns a string description for the triangle.
 * 
 * For the formula to compute the area of a triangle, see Programming Exercise 2.19. The toString() method is implemented as follows:
 * 		return "Triangle: side1 = " + side1 + " side2 = " + side2 + " side3 = " + side3;
 * Draw the UML diagrams for the classes Triangle and GeometricObject and
 * implement the classes. Write a test program that prompts the user to enter three
 * sides of the triangle, a color, and a Boolean value to indicate whether the triangle
 * is filled. The program should create a Triangle object with these sides and set
 * the color and filled properties using the input. The program should display
 * the area, perimeter, color, and true or false to indicate whether it is filled or not
 */

public class ProgrammingExercise01 {
	public static void main(String[] args) throws IllegalTriangleException {
		Scanner input = new Scanner(System.in);
		double[] triangleSideLengths = new double[3];
		String color;
		boolean filled;
		System.out.print("Enter three side length to make a triangle : ");
		for (int i = 0; i < triangleSideLengths.length; i++) {
			triangleSideLengths[i] = input.nextDouble();
		}
		System.out.print("Color ?  isFilled ?(true or false) : ");
		color = input.nextLine();
		filled = input.nextBoolean();
		
		Triangle t1 = new Triangle(triangleSideLengths[0],triangleSideLengths[1],triangleSideLengths[2]);
		t1.setColor(color);
		t1.setFilled(filled);
		
		System.out.print("Area of triangle :" + t1.getArea() + "\n");
		System.out.print("Perimeter of triangle" + t1.getPerimeter() + "\n");
		System.out.print("Color : " + t1.getColor() + "\n");
		System.out.print("Filled : " + t1.isFilled() + "\n");
		
		
		input.close();
	}
}
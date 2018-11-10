/*
 * (The Rectangle class) Following the example of the Circle class in Section 9.2,  design a class named Rectangle to represent a rectangle. The class contains:
 * 		Two double data fields named width and height that specify the width and height of the rectangle. The default values are 1 for both width and height.
 * 		A no-arg constructor that creates a default rectangle.
 * 		A constructor that creates a rectangle with the specified width and height.
 * 		A method named getArea() that returns the area of this rectangle.
 * 		A method named getPerimeter() that returns the perimeter.
 * Draw the UML diagram for the class and then implement the class. 
 * Write a test program that creates two Rectangle objects—one with width 4 and height 40 and the other with width 3.5 and height 35.9.
 * Display the width, height, area, and perimeter of each rectangle in this order.
 */
package chapter09;

public class ProgrammingExercise01 {

	public static void main(String[] args) {
		// Test Rectangle Class..
		
		Rectangle firstRectangle = new Rectangle(4 , 40);
		Rectangle secondRectangle = new Rectangle(3.5, 35.9);
		
		System.out.printf("First Rectangle's ; Width : %.2f - Height : %.2f - Area : %.2f - Perimeter : %.2f \n",firstRectangle.getWidth(), firstRectangle.getHeight(), firstRectangle.getArea() , firstRectangle.getPerimeter());
		System.out.printf("Second Rectangle's ; Width : %.2f - Height : %.2f - Area : %.2f - Perimeter : %.2f \n",secondRectangle.getWidth(), secondRectangle.getHeight(), secondRectangle.getArea() , secondRectangle.getPerimeter());
	}
}

package chapter10;
import Classes.*;
/**
 * (Geometry: the Triangle2D class) Define the Triangle2D class that contains:
 * 		Three points named p1, p2, and p3 of the type MyPoint with getter and setter methods. MyPoint is defined in Programming Exercise 10.4.
 * 		A no-arg constructor that creates a default triangle with the points (0, 0), (1, 1), and (2, 5).
 * 		A constructor that creates a triangle with the specified points.
 * 		A method getArea() that returns the area of the triangle.
 * 		A method getPerimeter() that returns the perimeter of the triangle
 * 		A method contains(MyPoint p) that returns true if the specified point p is inside this triangle (see Figure 10.22a).
 * 		A method contains(Triangle2D t) that returns true if the specified triangle is inside this triangle (see Figure 10.22b).
 * 		A method overlaps(Triangle2D t) that returns true if the specified triangle overlaps with this triangle (see Figure 10.22c).
 *
 * 
 * Draw the UML diagram for the class and then implement the class. 
 * Write a test program that creates a Triangle2D objects t1 using the constructor new Triangle2D(new MyPoint(2.5, 2), new MyPoint(4.2, 3), new MyPoint(5, 3.5)), 
 * displays its area and perimeter, and displays the result of t1.contains(3, 3), r1.contains(new Triangle2D(new MyPoint(2.9, 2), new MyPoint(4, 1), MyPoint(1, 3.4))), 
 * and t1. overlaps(new Triangle2D(new MyPoint(2, 5.5), new MyPoint(4, -3), MyPoint(2, 6.5))).
 * 
 * 
 * @author Ali Dogan Aydoner
 *
 */
public class ProgrammingExercise12 {
	public static void main(String[] args) {
		Triangle2D t1 = new Triangle2D(new MyPoint(2.5, 2), new MyPoint(4.2, 3), new MyPoint(5, 3.5));
		System.out.println("First triangle's area : " + t1.getArea() + "  perimeter : " + t1.getPerimeter());
		System.out.println("Triangle 1 contains (3,3) ? : " + t1.contains(new MyPoint(3, 3)));
		System.out.println("Triangle 1 contains triangle[2.9,2][4,1][1,3.4] : " + t1.contains(new Triangle2D(new MyPoint(2.9, 2), new MyPoint(4, 1), new MyPoint(1, 3.4))));
		System.out.println("Triangle 1 overlaps with triangle[2,5.5][4,-3][2,6.5] ? : "	+ t1.overlaps(new Triangle2D(new MyPoint(2, 5.5), new MyPoint(4, -3), new MyPoint(2, 6.5))));
	}
}

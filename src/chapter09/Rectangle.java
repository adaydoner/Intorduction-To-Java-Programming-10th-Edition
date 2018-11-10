// This class created for Chapter09.ProgrammingExercise01
package chapter09;

public class Rectangle {
	private double width = 1;
	private double height = 1;


	Rectangle(double widthValue, double heightValue) {
		width = widthValue;
		height = heightValue;
	}
	
	public double getWidth(){
		return width;
	}
	
	public double getHeight(){
		return height;
	}

	double getArea() {
		return (width * height);
	}

	double getPerimeter() {
		return (width * 2 + height * 2);
	}
}

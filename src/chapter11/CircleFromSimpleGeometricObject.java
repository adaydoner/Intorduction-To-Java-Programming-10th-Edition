package chapter11;
import chapter11.SimpleGeometricObject;

public class CircleFromSimpleGeometricObject extends SimpleGeometricObject {
	private double radius;
	
	CircleFromSimpleGeometricObject(double radius){
		this(radius,"white");
	}
	
	CircleFromSimpleGeometricObject(double radius, String color){
		this(radius,color,false);
	}
	
	CircleFromSimpleGeometricObject(double radius, String color, boolean filled){
		this.radius = radius;
		setColor(color);
		setFilled(filled);
	}
	public double getArea(){
		return Math.PI * radius * radius;
	}
	public double getPerimeter(){
		return 2 * Math.PI * radius;
	}
	public double getDiameter(){
		return 2 * radius;
	}
	public void printCircle(){
		System.out.println("This circle created at : " + this.getDateCreated() + " and its radius is : " + radius );
	}
	
	/**
	 * getters and setters
	 */
	public double getRadius(){
		return radius;
	}
	public void setRadius(double radius){
		this.radius = radius;
	}
}

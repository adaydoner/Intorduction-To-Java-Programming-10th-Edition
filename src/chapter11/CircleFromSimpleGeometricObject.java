package chapter11;
import chapter11.SimpleGeometricObject;

public class CircleFromSimpleGeometricObject extends SimpleGeometricObject {
	private double radius;
	private static final String author = "Dogan";
	
	CircleFromSimpleGeometricObject(double radius){
		this(radius,"white");
	}
	
	CircleFromSimpleGeometricObject(double radius, String color){
		this(radius,color,false);
	}
	
	CircleFromSimpleGeometricObject(double radius, String color, boolean filled){
		super(color, filled);
		this.radius = radius;
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
	
	//test override static method
	public static String getAuthor(){
		return author;
	}
	
	//overriding
	public String toString(){
		return (super.toString() + "\nradius : " + radius); 
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

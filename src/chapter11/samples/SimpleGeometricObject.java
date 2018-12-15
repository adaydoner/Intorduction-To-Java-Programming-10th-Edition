package chapter11.samples;

import java.util.Date;

public class SimpleGeometricObject {
	private String color;
	private boolean filled;
	Date dateCreated;
	private static final String author = "Ali Dogan";
	
	SimpleGeometricObject(){
		this("white",false);
	}
	SimpleGeometricObject(String color, boolean filled){
		dateCreated = new Date();
		this.color = color;
		this.filled = filled;
	}
	public String toString(){
		return ("Created on : " + dateCreated.toString() + "\nColor : " + color + "\nFilled : " + filled); 
	}
	
	public static String getAuthor(){
		return author;
	}
	
	/**
	 * getters and setters
	 */
	public String getColor(){
		return color;
	}
	public void setColor(String color){
		this.color = color;
	}
	public boolean isFilled(){
		return filled;
	}
	public void setFilled(boolean filled){
		this.filled = filled;
	}
	public Date getDateCreated(){
		return dateCreated;
	}
	
}

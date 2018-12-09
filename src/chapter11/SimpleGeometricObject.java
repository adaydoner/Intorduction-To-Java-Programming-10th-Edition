package chapter11;

import java.util.Date;

public class SimpleGeometricObject {
	private String color;
	private boolean filled;
	Date dateCreated;
	
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

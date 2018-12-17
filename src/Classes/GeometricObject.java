package Classes;

import java.util.Date;

public class GeometricObject {
	private String color;
	private boolean filled;
	private Date dateCreated;
	
	public GeometricObject () {
		this("white",false);
	}
	
	public GeometricObject (String color, boolean filled) {
		this.color = color;
		this.filled = filled;
		dateCreated = new Date();
	}
	
	@Override
	public String toString() {
		return "created on " + dateCreated + "\ncolor: " + color + " and filled: " + filled;
	}
	
	/*
	 * getters and setters
	 */
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	public boolean isFilled() {
		return filled;
	}
	public void setFilled(boolean filled) {
		this.filled = filled;
	}
	public String getDateCreated() {
		return dateCreated.toString();
	}
}

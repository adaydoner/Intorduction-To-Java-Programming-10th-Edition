package chapter11;


public class RectangleFromSimpleGeometricObject extends SimpleGeometricObject{
	private double width;
	private double height;
	
	RectangleFromSimpleGeometricObject(){
		this(0,0);
	}
	
	RectangleFromSimpleGeometricObject(double width, double height){
		this(width,height,"white",false);
	}
	
	RectangleFromSimpleGeometricObject(double width, double height, String color, boolean filled){
		super(color, filled);
		this.width = width;
		this.height = height;
	}
	
	public double getArea(){
		return width * height;
	}
	
	public double getPerimeter(){
		return 2 * (width + height);
	}
	
	public String toString(){
		return super.toString() + "\nrectangle's toString method.";
	}
	
	/*
	 * getters and setters
	 */
	public double getWidth(){
		return width;
	}
	public void setWidth(double width){
		this.width = width;
	}
	public double getHeight(){
		return height;
	}
	public void setHeight(double height){
		this.height = height;
	}
	
	
}

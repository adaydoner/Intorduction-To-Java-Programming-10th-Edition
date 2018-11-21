package Classes;

public class Circle2D {
	private double x;
	private double y;
	private double radius;
	
	
	/**
	 * constructor that creates a circle with the x = 0, y = 0, and radius = 1.
	 */
	public Circle2D(){
		this(0,0,1);
	}
	
	/**
	 * constructor that creates a circle with the specified x, y, and radius.
	 * @param x
	 * @param y
	 * @param radius
	 */
	public Circle2D(double x, double y, double radius){
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
	
	/**
	 * returns the perimeter of the circle
	 * @return
	 */
	public double getPerimeter(){
		return 2 * Math.PI * radius;
	}
	
	/**
	 * returns the area of the circle.
	 * @return
	 */
	public double getArea(){
		return Math.PI * radius * radius;
	}
	
	/**
	 * returns true if the specified point (x, y) is inside this circle
	 * @param x
	 * @param y
	 * @return
	 */
	public boolean contains(double x, double y){
		return (Math.sqrt(Math.pow(this.x - x, 2) + Math.pow(this.y - y, 2)) < radius);
	}
	
	/**
	 * returns true if the specified circle is inside this circle
	 * @param circle
	 * @return
	 */
	public boolean contains(Circle2D circle){
		return (Math.sqrt(Math.pow(this.x - circle.x, 2) + Math.pow(this.y - circle.y, 2)) + circle.radius < this.radius);
	}
	
	/**
	 * returns true if the specified circle overlaps with this circle
	 * @param circle
	 * @return
	 */
	public boolean overlaps(Circle2D circle){
		return (Math.sqrt(Math.pow(this.x - circle.x, 2) + Math.pow(this.y - circle.y, 2)) > this.radius + circle.radius);
	}
	
	
	/**
	 * getters and setters
	 */
	public double getX(){
		return x;
	}
	public double getY(){
		return y;
	}
	public double getRadius(){
		return radius;
	}
}

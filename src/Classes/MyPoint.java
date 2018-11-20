package Classes;

public class MyPoint {
	private double x;
	private double y;

	/**
	 * A no-arg constructor that creates a point (0, 0).
	 */
	public MyPoint() {
		this(0,0);
	}

	/**
	 * A constructor that constructs a point with specified coordinates.
	 * 
	 * @param x
	 * @param y
	 */
	public MyPoint(double x, double y) {
		this.x = x;
		this.y = y;
	}

	/**
	 * returns the distance from this point to a specified point of the MyPoint
	 * type.
	 * 
	 * @param x
	 * @param y
	 * @return
	 */
	public double distance(MyPoint point2) {
		return (Math.sqrt(Math.pow(x - point2.getX(), 2) + Math.pow(y - point2.getY(), 2)));
	}

	/**
	 * returns the distance from this point to another point with specified x-
	 * and y-coordinates
	 * 
	 * @param x
	 * @param y
	 * @return
	 */
	public double distance(double x, double y) {
		return this.distance(new MyPoint(x, y));
	}
	
	/*
	 * getters and setters.
	 */
	public double getX() {
		return x;
	}
	public double getY() {
		return y;
	}
	
	
}
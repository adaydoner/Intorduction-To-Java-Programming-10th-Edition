package Classes;
/**
 * This class initialized with conditions that giving at chapter 10. exercise 13.
 * @author Ali Dogan Aydoner
 *
 */
public class MyRectangle2D {
	private double x;
	private double y;
	private double width;
	private double height;
	
	/**
	 * constructor that creates a default rectangle with (0, 0) for (x, y) and 1 for both width and height.
	 */
	public MyRectangle2D(){
		this(0,0,1,1);
	}
	/**
	 * constructor that creates a rectangle with the specified x, y, width, and height.
	 * @param x
	 * @param y
	 * @param width
	 * @param height
	 */
	public MyRectangle2D(double x, double y, double width, double height){
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}
	/**
	 * returns the area of the rectangle.
	 * @return
	 */
	public double getArea(){
		return width * height;
	}
	/**
	 * returns the perimeter of the rectangle.
	 * @return
	 */
	public double getPerimeter(){
		return 2 * (width + height);
	}
	
	/**
	 * This method would find the bounding rectangle for given points and displays its center, width, and height.
	 * Points should given with an multi dimensional double array that contains x and y svalues for each point
	 * @param points
	 * @return
	 */
	public static MyRectangle2D getRectangle(double[][] points){
		double maxX = 0;
		double maxY = 0;
		double minX = Double.MAX_VALUE;
		double minY = Double.MAX_VALUE;
		for (int i = 0; i < points.length; i++) {
			if (points[i][0] > maxX) {
				maxX = points[i][0];
			}
			if (points[i][0] < minX) {
				minX = points[i][0];
			}

			if (points[i][1] > maxY) {
				maxY = points[i][1];
			}
			if (points[i][1] < minY) {
				minY = points[i][1];
			}
		}
		MyRectangle2D boundedRectangle = new MyRectangle2D();
		boundedRectangle.setX((maxX + minX) / 2);
		boundedRectangle.setY((maxY + minY) / 2);
		boundedRectangle.setWidth(maxX - minX);
		boundedRectangle.setHeight(maxY - minY);
		
		return boundedRectangle;
	}
	
	/**
	 * returns true if the specified point (x, y) is inside this rectangle
	 * @param x
	 * @param y
	 * @return
	 */
	public boolean contains(double x, double y){
		// Get max X & Y
        double maxX = getMax(getP1().getX(), getP2().getX(), getP3().getX(), getP4().getX());
        double maxY = getMax(getP1().getY(), getP2().getY(), getP3().getY(), getP4().getY());
        // Get min X & Y
        double minX = getMin(getP1().getX(), getP2().getX(), getP3().getX(), getP4().getX());
        double minY = getMin(getP1().getY(), getP2().getY(), getP3().getY(), getP4().getY());

        if (x < minX || x > maxX || y < minY || y > maxY)  return false;

        return true;
	}

	/**
	 * returns true if the specified rectangle is inside this rectangle
	 * @param r2
	 * @return
	 */
	public boolean contains(MyRectangle2D r2) {
		double xDistance = (r2.x > x) ? r2.x - x : x - r2.x;
		double yDistance = (r2.y > y) ? r2.y - y : y - r2.y;

		// if the r2 is inside this rectangle
		// this is only valid if the rectangles are parallel
		return (xDistance <= (width - r2.width) / 2 && yDistance <= (height - r2.height) / 2);

	}
	
	/**
	 * returns true if the specified rectangle overlaps with this rectangle
	 * @param r2
	 * @return
	 */
	public boolean overlaps(MyRectangle2D r2) {
        // subtract from the highest number
        double xDistance = (r2.x > x) ? r2.x - x : x - r2.x;
        double yDistance = (r2.y > y) ? r2.y - y : y - r2.y;

        // if the r2 overlaps this rectangle
        // this is only valid if the rectangles are parallel
        return (xDistance <= (width + r2.width) / 2 && yDistance <= (height + r2.height) / 2);

    }
	
	private double getMax(double... n) {
		double max = n[0];
		for (int i = 1; i < n.length; i++) {
			if (max < n[i]) {
				max = n[i];
			}
		}
		return max;
	}
	private double getMin(double... n) {
        double min = n[0];
        for (int i = 1; i < n.length; i++) {
            if (min > n[i]) {
                min = n[i];
            }
        }
        return min;
    }

	/*
	 * getters and setters.
	 */
	public MyPoint getP1() {
		return new MyPoint(x - width / 2, y + height / 2);
	}

	public MyPoint getP2() {
		return new MyPoint(x + width / 2, y + height / 2);
	}

	public MyPoint getP3() {
		return new MyPoint(x - width / 2, y - height / 2);
	}

	public MyPoint getP4() {
		return new MyPoint(x + width / 2, y - height / 2);
	}
	public double getX() {
		return x;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
}

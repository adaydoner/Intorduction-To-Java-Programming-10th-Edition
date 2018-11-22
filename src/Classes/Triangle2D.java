
package Classes;
import java.awt.geom.Line2D;
/**
 * initialized with conditions that giving at Chapter10.PE.12
 * @author Ali Dogan Aydoner
 *
 */
public class Triangle2D {
	private MyPoint p1;
	private MyPoint p2;
	private MyPoint p3;
	
	/**
	 * no-arg constructor that creates a default triangle with the points (0, 0), (1, 1), and (2, 5).
	 */
	public Triangle2D(){
		this(new MyPoint(0,0),new MyPoint(1,1), new MyPoint(2, 5));
	}
	
	/**
	 * A constructor that creates a triangle with the specified points.
	 * @param x1
	 * @param y1
	 * @param x2
	 * @param y2
	 * @param x3
	 * @param y3
	 */
	public Triangle2D(MyPoint p1 , MyPoint p2, MyPoint p3){
		this.p1 = p1;
		this.p2 = p2;
		this.p3 = p3;
	}

	/*
	 * A method getArea() that returns the area of the triangle.
	 */
	public double getArea(){
		double side1 = p1.distance(p2);
		double side2 = p1.distance(p3);
		double side3 = p2.distance(p3);
		
		return findTriangleArea(side1, side2, side3);
	}
	
	/**
	 * returns the perimeter of the triangle.
	 * @return
	 */
	public double getPerimeter(){
		return p1.distance(p2) + p1.distance(p3) + p2.distance(p3);
	}

	public static double findTriangleArea(double side1, double side2, double side3) {
		double s = (side1 + side2 + side3) / 2;
		return  Math.pow((s * (s - side1) * (s - side2) * (s - side3)), 0.5);
	}
	
	/**
	 * returns true if the specified point p is inside this triangle
	 * @param p
	 * @return
	 */
	public boolean contains(MyPoint p){
		double bx = p2.getX() - p1.getX();
		double by = p2.getY() - p1.getY();
		double cx = p3.getX() - p1.getX();
		double cy = p3.getY() - p1.getY();
		double x = p.getX() - p1.getX();
		double y = p.getY() - p1.getY();

		double d = bx * cy - cx * by;
		double wa = (x * (by - cy) + y * (cx - bx) + bx * cy - cx * by) / d;
		double wb = (x * cy - y * cx) / d;
		double wc = (y * bx - x * by) / d;
		
		return (0 < wa && wa < 1) && (0 < wb && wb < 1) && (0 < wc && wc < 1);
	}
	
	/**
	 * returns true if the specified triangle is inside this triangle
	 * @param t
	 * @return
	 */
	public boolean contains(Triangle2D t){
		return (this.contains(t.getP1()) && this.contains(t.getP2()) && this.contains(t.getP3()));
	}
	
	/**
	 * returns true if the specified triangle overlaps with this triangle
	 * @param t
	 */
	public boolean overlaps(Triangle2D t){
		Line2D[] thisTriangleLines = new Line2D[]{new Line2D.Double(p1.getX(),p1.getY(),p2.getX(),p2.getY()),
												  new Line2D.Double(p1.getX(),p1.getY(),p3.getX(),p3.getY()),
												  new Line2D.Double(p2.getX(),p2.getY(),p3.getX(),p3.getY())};
		
		Line2D[] tTriangleLines = new Line2D[]{new Line2D.Double(t.getP1().getX(),t.getP1().getY(),t.getP2().getX(),t.getP2().getY()),
											   new Line2D.Double(t.getP1().getX(),t.getP1().getY(),t.getP3().getX(),t.getP3().getY()),
											   new Line2D.Double(t.getP2().getX(),t.getP2().getY(),t.getP3().getX(),t.getP3().getY())};
		
		for (int i = 0; i < thisTriangleLines.length; i++) {
			for (int j = 0; j < tTriangleLines.length; j++) {
				if(thisTriangleLines[i].intersectsLine(tTriangleLines[j])){
					return true;
				}
			}
		}
		return false;
	}

	/**
	 * getters and setters
	 */
	public MyPoint getP1() {
		return p1;
	}
	public void setP1(MyPoint p1) {
		this.p1 = p1;
	}
	public MyPoint getP2() {
		return p2;
	}
	public void setP2(MyPoint p2) {
		this.p2 = p2;
	}
	public MyPoint getP3() {
		return p3;
	}
	public void setP3(MyPoint p3) {
		this.p3 = p3;
	}
}

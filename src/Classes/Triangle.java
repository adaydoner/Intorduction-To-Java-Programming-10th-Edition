package Classes;
/**
 * initialized with conditions that giving at Chapter11.PE.01
 * @author Ali Dogan Aydoner
 *
 */
public class Triangle extends GeometricObject {
	private double side1;
	private double side2;
	private double side3;
	
	public Triangle() throws IllegalTriangleException {
		this(1,1,1);
	}
	
	/**
	 * this will set triangle's side length from given values.
	 * if values cant make a valid triangle , new object would initialize with;
	 * side1 = 1
	 * side2 = 1 
	 * side3 = 1
	 * @param side1
	 * @param side2
	 * @param side3
	 */
	public Triangle (double side1, double side2, double side3) throws IllegalTriangleException {
		if(isTriangle(side1,side2,side3)){
			this.side1 = side1;
			this.side2 = side2;
			this.side3 = side3;
		} else {
			throw new IllegalTriangleException();
		}
	}
	
	private boolean isTriangle(double side1, double side2, double side3) {
		if(side1 + side2 > side3 && side1 + side3 > side2 && side2 + side3 > side1){
			return true;
		}
		return false;
	}

	public double getArea() {
		double p = getPerimeter() / 2;
		return Math.abs(Math.sqrt(p * (p - side1) * (p - side2) * (p - side3)));
	}
	
	public double getPerimeter() {
		return side1 + side2 + side3;
	}
	
	@Override
	public String toString() {
		return "Triangle: side1 = " + side1 + " side2 = " + side2 + " side3 = " + side3;
	}
	/*
	 * getters and setters
	 */
	public double getSide1() {
		return side1;
	}
	public double getSide2() {
		return side2;
	}
	public double getSide3() {
		return side3;
	}
}

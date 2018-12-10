package chapter11;
import chapter11.SimpleGeometricObject;

public class TestGeometricObjects {

	public static void main(String[] args) {
		SimpleGeometricObject sgo = new SimpleGeometricObject();
		CircleFromSimpleGeometricObject sgoCircle = new CircleFromSimpleGeometricObject(5,"blue",true);
		RectangleFromSimpleGeometricObject sgoRectangle = new RectangleFromSimpleGeometricObject(5,10,"black",true);
		System.out.println(sgo.toString());
		sgoCircle.printCircle();
		
		
		System.out.println("\n");
		System.out.println("Circle area : " + sgoCircle.getArea() + "\nRectangle area : " + sgoRectangle.getArea());
		System.out.println("Circle perimeter : " + sgoCircle.getPerimeter() + "\nRectangle perimeter : " + sgoRectangle.getPerimeter());
		System.out.println();
		System.out.println("overriding toString method by circle : \n" + sgoCircle.toString());
		
		System.out.println("\n");
		System.out.println(sgoRectangle.toString());
		
		System.out.println("\n");
		
		System.out.println(CircleFromSimpleGeometricObject .getAuthor());
		System.out.println(SimpleGeometricObject.getAuthor());
		
		
		
		
	}
}

/*
 * (Random points on a circle) Write a program that generates three random points
 * on a circle centered at (0, 0) with radius 40 and display three angles in a triangle
 * formed by these three points(Hint: Generate a random angle a in radians between 0 and 2p
 * 
 */
package chapter04;

public class ProgrammingExercise06 {
	public static double DistanceBetweenTwoPoints(double x1, double y1, double x2, double y2) {
		double distance;
		distance = Math.round(Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2)));
		return distance;
	}

	public static double GenerateRandomAngle() {
		double angle;
		angle = (int)((Math.random() * 360) * 10) / 10.0;
		return angle;
	}

	private static double[] GeneratePointOnCircleByAngle(double point1angle) {
		double[] point = new double[2];
		final int CIRCLE_RADIUS = 40;
		point[0] = (int)(CIRCLE_RADIUS * Math.cos(Math.toRadians(point1angle)) * 10) / 10.0;
		point[1] = (int)(CIRCLE_RADIUS * Math.sin(Math.toRadians(point1angle)) * 10) / 10.0;
		return point;
	}


	public static void main(String[] args) {
		double[] point1 = new double[2];
		double[] point2 = new double[2];
		double[] point3 = new double[2];
		double point1angle;
		double point2angle;
		double point3angle;
		point1angle = GenerateRandomAngle();
		point2angle = GenerateRandomAngle();
		point3angle = GenerateRandomAngle();
		point1 = GeneratePointOnCircleByAngle(point1angle);
		point2 = GeneratePointOnCircleByAngle(point2angle);
		point3 = GeneratePointOnCircleByAngle(point3angle);
		
		System.out.println("point1 x : " + point1[0] + "  point1 y : " + point1[1] + " \t point1 angle in degree : " + point1angle);
		System.out.println("point2 x : " + point2[0] + "  point2 y : " + point2[1] + " \t point2 angle in degree : " + point2angle);
		System.out.println("point3 x : " + point3[0] + "  point3 y : " + point3[1] + " \t point3 angle in degree : " + point3angle);
	}
}

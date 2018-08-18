/*
 * (Geography: estimate areas) Find the GPS locations for Atlanta, Georgia; Orlando, Florida; Savannah, Georgia; and Charlotte, North Carolina from
 * www.gps-data-team.com/map/ and compute the estimated area enclosed by these four cities. 
 * (Hint: Use the formula in Programming Exercise 4.2 to compute the distance between two cities.Divide the polygon into two triangles and use the
 * formula in Programming Exercise 2.19 to compute the area of a triangle.)
 */
package chapter04;

public class ProgrammingExercise03 {
	public static double DistanceBetweenTwoPointsOnEarth(double point1x, double point1y, double point2x, double point2y) {
		double distance;
		final double AVERAGE_EARTH_RADIUS = 6371.01;
		distance = AVERAGE_EARTH_RADIUS * Math.acos(Math.sin(Math.toRadians(point1x)) * Math.sin(Math.toRadians(point2x)) + Math.cos(Math.toRadians(point1x)) * Math.cos(Math.toRadians(point2x)) * Math.cos(Math.toRadians(point1y - point2y)));
		return distance;
	}

	public static double AreaOfTriangle(double side1, double side2, double side3) {
		double area;
		double s = (side1 + side2 + side3) / 2;
		area = Math.pow((s * (s - side1) * (s - side2) * (s - side3)), 0.5);
		return area;
	}

	public static void main(String[] args) {
		double atlantaX = 33.7489954;
		double atlantaY = -84.3879824;

		double orlandoX = 28.5383355;
		double orlandoY = -81.37923649999999;

		double savannahX = 32.0808989;
		double savannahY = -81.09120300000001;

		double charlotteX = 35.2270869;
		double charlotteY = -80.84312669999997;

		double distanceAtlantaToOrlando = DistanceBetweenTwoPointsOnEarth(atlantaX, atlantaY, orlandoX, orlandoY);
		double distanceAtlantaToSavannah = DistanceBetweenTwoPointsOnEarth(atlantaX, atlantaY, savannahX, savannahY);
		double distanceOrlandoToSavannah = DistanceBetweenTwoPointsOnEarth(orlandoX, orlandoY, savannahX, savannahY);
		double distanceAtlantaToCharlotte = DistanceBetweenTwoPointsOnEarth(atlantaX, atlantaY, charlotteX, charlotteY);
		double distanceSavannahToCharlotte = DistanceBetweenTwoPointsOnEarth(savannahX, savannahY, charlotteX, charlotteY);
		double areaOfAtlantaSavannahCharlotte = AreaOfTriangle(distanceAtlantaToSavannah, distanceAtlantaToCharlotte, distanceSavannahToCharlotte);
		double areaOfAtlantaSavannahOrlando = AreaOfTriangle(distanceAtlantaToSavannah, distanceAtlantaToOrlando, distanceOrlandoToSavannah);
		System.out.printf("Area between Atlanta,GA - Savannah,GA - Charlotte,NC is              : %f\n",areaOfAtlantaSavannahCharlotte);
		System.out.printf("Area between Atlanta,GA - Savannah,GA - Orlando,FL is                : %f\n",areaOfAtlantaSavannahOrlando);
		System.out.printf("Area between Atlanta,GA - Savannah,GA - Charlotte,NC - Orlando,FL is : %.3f",(areaOfAtlantaSavannahCharlotte + areaOfAtlantaSavannahOrlando));
	}
}

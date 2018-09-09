/*
 * (Conversions between feet and meters) Write a class that contains the following two methods:
 * 
 * 	public static double footToMeter(double foot)
 * 	public static double meterToFoot(double meter)
 * 
 *		The formula for the conversion is:	
 *		meter = 0.305 * foot
 *		foot = 3.279 * meter
 *	Display the results in table that shown in book.
 */
package chapter06;

public class ProgrammingExercise09 {
	public static double footToMeter(double foot) {
		double meter = 0.305 * foot;
		return meter;
	}
	public static double meterToFoot(double meter) {
		double foot = 3.279 * meter;
		return foot;
	}
	public static void main(String[] args) {
		System.out.printf("%-7s       %-10s       %s       %-10s       %-7s\n","Feet","Meters","|","Meters","Feet");
		System.out.println("-----------------------------------------------------------------");
		for (double feet = 1, meters = 20; feet <= 10 ; feet++,meters += 5) {
			double metersFromFeet = footToMeter(feet);
			double feetFromMeters = meterToFoot(meters);
			System.out.printf("%-7.1f       %-10.3f       %s       %-10.1f       %-7.3f\n",feet,metersFromFeet,"|",meters,feetFromMeters);
		}


	}
}

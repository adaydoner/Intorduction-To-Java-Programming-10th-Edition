/*
 *      (Algebra: solve 2 * 2 linear equations)
 *      You can use Cramer’s rule to solve the following 2 * 2 system of linear equation.
 *      Write a program that solves the following equation and displays the value for x and y:
 *
 *          3.4x + 50.2y = 44.5
 *          2.1x + .55y = 5.9
 */
package chapter01;

public class ProgrammingExercise13 {

	public static void main(String[] args) {
		//program will compute every linear and give back x and y values only in this format , you are free to change only NUMBERS.
		String firstLinearEquations = "3.4x + 50.2y = 44.5";
		String secondLinearEquations = "2.1x + .55y = 5.9";
		// Collect X values
		String[] arrayX1 = firstLinearEquations.split("x"); // Linear's X values which is 3.4 is now in arrayX1[0] . Rest of linear is in arrayX1[1]
		String[] arrayX2 = secondLinearEquations.split("x");

		// Convert string arrays's first value to double
		Double x1 = Double.parseDouble(arrayX1[0]);
		Double x2 = Double.parseDouble(arrayX2[0]);

		// Collect Z values(Results)
		String[] arrayZ1 = arrayX1[1].split(" "); // This time we split arrayX1[1] by "(space)" and linear's result z values will be in array's last value
		String[] arrayZ2 = arrayX2[1].split(" ");

		// Convert String to double
		Double z1 = Double.parseDouble(arrayZ1[arrayZ1.length - 1]);
		Double z2 = Double.parseDouble(arrayZ2[arrayZ2.length - 1]);

		// Collects Y values
		String[] arrayY1 = arrayZ1[arrayZ1.length - 3].split("y"); // arrayZ1[arrayZ1.length-3] this will give us (50.2y) and (.55y) and we will split this by (y) and arrayY1[0] will be 50.2
		String[] arrayY2 = arrayZ2[arrayZ2.length - 3].split("y");

		// Convert String to double
		Double y1 = Double.parseDouble(arrayY1[0]);
		Double y2 = Double.parseDouble(arrayY2[0]);
		System.out.println("x1 : " + x1 + "\n"+"x2 : " + x2 + "\n"+"y1 : " + y1 + "\n"+"y2 : " + y2 + "\n"+"z1 : " + z1 +"\n"+"z2 : " + z2);
		
		//Cramer's rules to solve 2x2 sytems
		Double xResult = ((z1 * y2) - (y1 * z2)) / ((x1 * y2) - (y1 * x2));
		System.out.printf("x : %2.2f \n", xResult);
		Double yResult = ((x1 * z2) - (z1 * x2)) / ((x1 * y2) - (y1 * x2));
		System.out.printf("y : %2.2f", yResult);
	}

}

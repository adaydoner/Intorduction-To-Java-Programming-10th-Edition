/*
 * (Cost of shipping) A shipping company uses the following function to calculate
 * the cost (in dollars) of shipping based on the weight of the package (in pounds).
 * c(w) = d
 * 3.5, if 0 6 w 6 = 1
 * 5.5, if 1 6 w 6 = 3
 * 8.5, if 3 6 w 6 = 10
 * 10.5, if 10 6 w 6 = 20
 * Write a program that prompts the user to enter the weight of the package and
 * display the shipping cost. If the weight is greater than 50, display a message “the package cannot be shipped.”
 */
package chapter03;

import java.util.Scanner;

public class ProgrammingExercise18 {

	private static double ShippmentCost(double weightOfPackage) {
		double cost = 0;
		if (weightOfPackage <= 1) {
			cost = weightOfPackage * 3.5;
		} else if (weightOfPackage <= 3) {
			cost = weightOfPackage * 5.5;
		} else if (weightOfPackage <= 10) {
			cost = weightOfPackage * 8.5;
		} else {
			cost = weightOfPackage * 10.5;
		}
		return cost;
	}

	public static void main(String[] args) {
		while (true) {
			double weightOfPackage;
			double cost;
			Scanner readNumber = new Scanner(System.in);
			System.out.print("Weight of package : ");
			weightOfPackage = readNumber.nextDouble();
			if (weightOfPackage > 50) {
				System.out.println("The package cannot be shipped.\n");
			} 
			else if (weightOfPackage < 0) {
				System.out.println("You entered invalid weight.\n");
			} 
			else {
				cost = ShippmentCost(weightOfPackage);
				System.out.printf("The package can be shipped for $%.2f \n\n", cost);
			}
		}
	}
}

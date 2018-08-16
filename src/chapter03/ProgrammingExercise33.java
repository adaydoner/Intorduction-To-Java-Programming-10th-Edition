/*
 * (Financial: compare costs) Suppose you shop for rice in two different packages.
 * You would like to write a program to compare the cost. The program prompts the
 * user to enter the weight and price of the each package and displays the one with
 * the better price.
 */
package chapter03;

import java.util.Scanner;

public class ProgrammingExercise33 {

	private static void CompareCosts(double weightOfPackage1, double priceOfPackage1, double weightOfPackage2, double priceOfPackage2) {
		double firstPackageCosts;
		firstPackageCosts = Math.abs(priceOfPackage1 / weightOfPackage1);
		double secondPackageCosts;
		secondPackageCosts = Math.abs(priceOfPackage2 / weightOfPackage2);
		if(firstPackageCosts < secondPackageCosts) {
			System.out.println("Package 1 has a better price.");
		}
		else if (secondPackageCosts < firstPackageCosts) {
			System.out.println("Package 2 has a better price.");
		}
		else {
			System.out.println("Two packages have the same price.");
		}
	}

	public static void main(String[] args) {
		Scanner readNumber = new Scanner(System.in);
		double weightOfPackage1;
		double priceOfPackage1;
		double weightOfPackage2;
		double priceOfPackage2;
		System.out.print("Enter weight and price for package 1 : ");
		weightOfPackage1 = readNumber.nextDouble();
		priceOfPackage1 = readNumber.nextDouble();
		System.out.print("Enter weight and price for package 2 : ");
		weightOfPackage2 = readNumber.nextDouble();
		priceOfPackage2 = readNumber.nextDouble();
		CompareCosts(weightOfPackage1, priceOfPackage1, weightOfPackage2, priceOfPackage2);
		readNumber.close();
	}
}

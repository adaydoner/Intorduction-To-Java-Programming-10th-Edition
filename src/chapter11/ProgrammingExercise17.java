package chapter11;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

/**
 * (Algebra: perfect square) Write a program that prompts the user to enter an integer m and find the smallest integer n such that m * n is a perfect square. 
 * (Hint: Store all smallest factors of m into an array list. n is the product of the factors that appear an odd number of times in the array list. 
 * For example, consider m = 90, store the factors 2, 3, 3, 5 in an array list. 2 and 5 appear an odd number of times in the array list. So, n is 10.)
 * @author Ali Dogan Aydoner
 *
 */
public class ProgrammingExercise17 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int m;
		int n;
		ArrayList<Integer> factors = new ArrayList<>();
		
		System.out.print("Enter an integer m : ");
		m = input.nextInt();
		factors = factors(m);
		
		n = findN(factors);
		System.out.println("The smallest number n for m * n to be a perfect square is " + n);
		
		System.out.println("m * n is " + (m * n));
		
		input.close();
	}

	private static int findN(ArrayList<Integer> factors) {
		int n = 1;
		int count;
		for (int i = 0; i < factors.size();) {
			count = Collections.frequency(factors, factors.get(i));
			if(isOdd(count)){
				n *= factors.get(i);
			}
			i += count;
		}
		return n;
	}

	private static boolean isOdd(int count) {
		return (count % 2 == 1) ? true : false;
	}

	private static ArrayList<Integer> factors(int number) {
		ArrayList<Integer> factors = new ArrayList<>();
		while(number != 1){
			for (int i = 2; i <= number; i++) {
				if(number % i == 0){
					number /= i;
					factors.add(i);
					break;
				}
			}
		}
		
		return factors;
	}
}

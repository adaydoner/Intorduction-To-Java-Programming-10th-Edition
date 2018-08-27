/*
 * (Demonstrate cancellation errors) A cancellation error occurs when you are
 * manipulating a very large number with a very small number. The large number
 * may cancel out the smaller number. For example, the result of 100000000.0 +
 * 0.000000001 is equal to 100000000.0. To avoid cancellation errors and obtain
 * more accurate results, carefully select the order of computation. For example, in
 * computing the following series, you will obtain more accurate results by computing
 * from right to left rather than from left to right:
 * 
 * 1 + 1/2 + 1/3 + ... + 1/n
 * 
 * Write a program that compares the results of the summation of the preceding
 * series, computing from left to right and from right to left with n = 50000.
 */
package chapter05;

public class ProgrammingExercise23 {

	public static void main(String[] args) {
		double leftToRightSummary = 0;
		double rightToLeftSummary = 0;
		for (double i = 1; i <= 50000; i++) {
			leftToRightSummary += 1 / i;
		}
		System.out.println("Left To Right Summary = " + leftToRightSummary);
		System.out.println();
		for (double i = 50000; i >= 1; i--) {
			rightToLeftSummary += 1 / i;
		}
		System.out.println("Right To Left Summary = " + rightToLeftSummary + "\n");
		System.out.println("Right to left summary - Left to right summary is = " + (rightToLeftSummary - leftToRightSummary));
	}
}

/**
 * Chapter 1 Exercise 7:
 *      (Approximate) pi can be computed using the following formula:
 *      4.0 * (1 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11))
 */
package chapter01;

public class ProgrammingExercise07 {

	public static void main(String[] args) {
		double pi = 0;
		int counter = 1; // Since formula goes + - + - + , our counter will show to program what next number's sign will be.
		for (int i = 1; i <= 1999; i = i + 2) {
			if (counter % 2 == 1) { // It (counter mod 2) is 1 then its 1st - 3rd - 5th - 7th elements of formula and sign would be (-)
				pi = (pi + (1.0 / i)); 
				counter++;
			}
			else {   				// Else (counter % 2) is 0 then its 2nd - 4th - 6th - 8th eleents of formula and sign would be (+)
				pi = (pi - (1.0 / i));
				counter++;
			}
		}
		System.out.println(4*pi);
	}

}

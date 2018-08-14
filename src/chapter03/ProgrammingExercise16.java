/*
 * (Random points) Write a program that displays a random coordinate in a rectangle.
 * The rectangle is centered at (0, 0) with width 100 and height 200
 */
package chapter03;

public class ProgrammingExercise16 {

	public static void main(String[] args) {
		// x will be between (-50 , + 50 )
		// y will be between (-100 , + 100 )
		int[] coordinates = new int[8];
		for (int i = 0; i <= 6; i += 2) {
			if ((int) (Math.random() * 10) % 2 == 1) {
				coordinates[i] = ((int)(Math.random() * 100) % 51);
			} 
			else {
				coordinates[i] = 0 - ((int)(Math.random() * 100) % 51);
			}
			if((int)(Math.random() * 10) % 2 == 1) {
				coordinates[i + 1] = (int)(Math.random() * 100);
			}
			else {
				coordinates[i + 1] = 0 - (int)(Math.random() * 100);
			}
		}
		int counter = 1;
		for (int i = 0; i <=6 ; i += 2) {
			System.out.println("X" + counter + ",Y"+ counter + ": " + coordinates[i] + "," + coordinates[i + 1]);
			counter++;
		}
	}
}

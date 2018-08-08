/*
 * (Summation of a series) Write a program that displays the result of ( 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9. )
 */
package chapter01;

public class ProgrammingExercise06 {

	public static void main(String[] args) {
		int result=0;
		for (int i = 1; i <= 9; i++) {
				result=result+i;
		}
		System.out.println("Summary : "+result);
		//System.out.println(1+2+3+4+5+6+7+8+9);

	}

}

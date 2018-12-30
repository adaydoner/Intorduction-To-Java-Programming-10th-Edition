package chapter12;
/**
 * (OutOfMemoryError) Write a program that causes the JVM to throw an OutOfMemoryError and catches and handles this error.
 * @author Ali Dogan Aydoner
 *
 */
public class ProgrammingExercise10 {
	public static void main(String[] args) {
		try{
			int[] outOfMemory = new int[1_000_000_000];
		} catch (OutOfMemoryError ome){
			//System.out.println("handled out of memory exception");
		}
		System.out.println("this line comes after handle out of memory exception.");
	}
}

package chapter10;
import Classes.MyCalculator;
/**
 * (Calculator) Revise Listing 7.9, Calculator.java, to accept an expression as a string in which the operands and operator are separated by zero or more spaces.
 * For example, 3+4 and 3 + 4 are acceptable expressions.
 * 
 * @author Ali Dogan Aydoner
 *
 */
public class ProgrammingExercise26 {
	public static void main(String[] args) {
		System.out.println(MyCalculator.calculate("   5 +  2"));
		System.out.println(MyCalculator.calculate("  5     .  2"));
		System.out.println(MyCalculator.calculate("   5/  1"));
	}
}

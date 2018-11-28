package chapter10;
import Classes.MyCharacter;
/**
 * (Implement the Character class) The Character class is provided in the Java library. 
 * Provide your own implementation for this class. Name the new class MyCharacter.
 * @author Ali Dogan Aydoner
 *
 */
public class ProgrammingExercise24 {
	public static void main(String[] args) {
		MyCharacter mc = new MyCharacter('a');
		System.out.println(MyCharacter.toUpperCase(mc.getVal()));
		System.out.println(MyCharacter.toLowerCase('y'));
		System.out.println(MyCharacter.isDigit('7'));
		System.out.println(MyCharacter.isLetter('2'));
	}
}

package chapter10;
import Classes.MyString2;
/**
 * (New string split method) The split method in the String class returns an array of strings consisting of the substrings split by the delimiters. 
 * However, the delimiters are not returned. Implement the following new method that returns 
 * an array of strings consisting of the substrings split by the matching delimiters, including the matching delimiters.
 * @author Ali Dogan Aydoner
 *
 */
public class ProgrammingExercise25 {
	public static void main(String[] args) {
		String[] test = new String[4];
		test = MyString2.split("Ali went to work", " ");
		for (int i = 0; i < test.length; i++) {
			System.out.println(test[i]);
		}
		
		System.out.println();
		
		
		String[] test2 = new String[5];
		test2 = MyString2.split("ALI-DallasALI-LosAngelesALI-NewYorkALI-Arlington", "ALI-");
		for (int i = 0; i < test2.length; i++) {
			System.out.println(test2[i]);
		}
		
	}
}

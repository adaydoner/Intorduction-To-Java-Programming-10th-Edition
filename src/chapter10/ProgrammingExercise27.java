package chapter10;
import Classes.MyStringBuilder1;
/**
 * (Implement the StringBuilder class) The StringBuilder class is provided in the Java library. 
 * Provide your own implementation for the following methods (name the new class MyStringBuilder1):
 * 
 * 		public MyStringBuilder1(String s);
 * 		public MyStringBuilder1 append(MyStringBuilder1 s);	
 * 		public MyStringBuilder1 append(int i);
 * 		public int length();
 * 		public char charAt(int index);
 * 		public MyStringBuilder1 toLowerCase();
 * 		public MyStringBuilder1 substring(int begin, int end);
 * 		public String toString();
 * 
 * 
 * @author Ali Dogan Aydoner
 *
 */
public class ProgrammingExercise27 {
	public static void main(String[] args) {
		MyStringBuilder1 msb = new MyStringBuilder1("ali");
		System.out.println(msb.append(new MyStringBuilder1("sonraki")).getVal());
	}
}

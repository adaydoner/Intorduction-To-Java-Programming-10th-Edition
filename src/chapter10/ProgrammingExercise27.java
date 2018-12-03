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
		MyStringBuilder1 msb2 = new MyStringBuilder1("KARENINA");
		System.out.println("Object 1 : " + msb.toString());
		System.out.println("Object 2 : " + msb2.toString());
		System.out.println("Append method for ali + next : " + msb.append(new MyStringBuilder1("next")).toString());
		System.out.println("Append method for KARENINA + integerNum(1234) : " + msb2.append(1234).toString());
		System.out.println("length method for ali : " + msb.length());
		System.out.println("length method for KARENINA : " + msb2.length());
		System.out.println("to lower case method for KARENINA : " + msb2.toLowerCase().toString());
		System.out.println("substring method for KARENINA(2-5) : " + msb2.substring(2, 5).toString());
		
	}
}

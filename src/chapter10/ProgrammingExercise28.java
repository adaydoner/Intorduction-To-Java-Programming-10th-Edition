package chapter10;
import Classes.MyStringBuilder2;
/**
 * (Implement the StringBuilder class) The StringBuilder class is provided in the Java library. 
 * Provide your own implementation for the following methods (name the new class MyStringBuilder2):
 * 		public MyStringBuilder2();
 * 		public MyStringBuilder2(char[] chars);
 * 		public MyStringBuilder2(String s);
 * 		public MyStringBuilder2 insert(int offset, MyStringBuilder2 s);
 * 		public MyStringBuilder2 reverse();
 * 		public MyStringBuilder2 substring(int begin);
 * 		public MyStringBuilder2 toUpperCase();
 * 
 * @author Ali Dogan Aydoner 
 *
 */
public class ProgrammingExercise28 {

	public static void main(String[] args) {
		MyStringBuilder2 sb = new MyStringBuilder2("(instert)");
		MyStringBuilder2 sb2 = new MyStringBuilder2("0123456789");
		System.out.println(sb2.insert(4, sb).getVal());
		System.out.println(sb2.reverse().getVal());
		System.out.println(sb2.substring(3).getVal());
		System.out.println(new MyStringBuilder2("karenina").toUpperCase().getVal());
		
	}
}

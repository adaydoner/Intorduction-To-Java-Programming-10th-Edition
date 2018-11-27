package chapter10;
import Classes.MyString2;
/**
 * (Implement the String class) The String class is provided in the Java library. Provide your own implementation for the following methods (name the new class MyString2):
 * 		public MyString2(String s);	
 * 		public int compare(String s);	
 * 		public MyString2 substring(int begin);	
 * 		public MyString2 toUpperCase();	
 * 		public char[] toChars();	
 * 		public static MyString2 valueOf(boolean b);
 * 
 * 
 * @author Ali Dogan Aydoner
 *
 */
public class ProgrammingExercise23 {
	public static void main(String[] args) {
		
		MyString2 ms = new MyString2("ali");
		System.out.println(ms.getVal());
		
		System.out.println("\nTrying compare method");
		System.out.println("ali compare to bali " + ms.compare("bali"));
		System.out.println("ali compare to ali " + ms.compare("ali"));
		System.out.println("ali compare to ahir " + ms.compare("ahir"));
		
		System.out.println("\nTrying substring method...");
		MyString2 ms2 = new MyString2("alidoganaydoner");
		System.out.println(ms2.substring(3).getVal());
		
		System.out.println("\nTrying uppercase method...");
		System.out.println(ms2.toUpperCase().getVal());
		
		System.out.println("\nTrying valueOf method...");
		System.out.println(MyString2.valueOf(true).getVal());
		System.out.println(MyString2.valueOf(false).getVal());
		
	}
}
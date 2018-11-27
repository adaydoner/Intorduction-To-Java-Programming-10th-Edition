package chapter10;
import Classes.MyString1;
/**
 * (Implement the String class) The String class is provided in the Java library. Provide your own implementation for the following methods (name the new class MyString1):
 * 		public MyString1(char[] chars); 
 * 		public char charAt(int index); 
 * 		public int length();
 * 		public MyString1 substring(int begin, int end);
 * 		public MyString1 toLowerCase();	
 * 		public boolean equals(MyString1 s);	
 * 		public static MyString1 valueOf(int i);
 * 
 * 
 * @author Ali Dogan Aydoner
 *
 */
public class ProgrammingExercise22 {
	public static void main(String[] args) {
		char[] ch = new char[]{'a','l','i'};
		
		MyString1 ms = new MyString1(ch);
		System.out.println("Trying Constructor..");
		System.out.println("MyString1 object from char[] constructor. : " + ms.getVal());
		
		System.out.println("\nTrying charAt method..");
		System.out.println("char at 0. index : " + ms.charAt(0));
		System.out.println("char at 1. index : " + ms.charAt(1));
		System.out.println("char at 2. index : " + ms.charAt(2));
		
		System.out.println("\nTrying length method...");
		System.out.println("length of object is : " + ms.length());
		
		System.out.println("\nTrying substring method...");
		MyString1 ms2 = new MyString1(new char[]{'a','l','i','d','o','g','a','n'});
		System.out.println(ms2.substring(3, 8).getVal());
		
		System.out.println("Trying toLowerCase method...");
		MyString1 ms3 = new MyString1(new char[]{'A','L','I','D','O','G','A','N'});
		System.out.println(ms3.toLowerCase().getVal());
		
		
		System.out.println("\nTrying equals method...");
		System.out.println("'A','L','I','D','O','G','A','N' same with 'a','l','i','d','o','g','a','n' ? : " + ms3.equals(ms2));
		System.out.println("'a','l','i','d','o','g','a','n' same with 'a','l','i','d','o','g','a','n' ? : " + ms3.toLowerCase().equals(ms2));
		
		System.out.println("\nTrying valueOf method...");
		System.out.println("valueOf(1234) ? : " + MyString1.valueOf(1234111123).getVal());
		
	}
}

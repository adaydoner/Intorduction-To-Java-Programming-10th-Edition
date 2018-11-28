package Classes;

public class MyCharacter {
	private char val;

	public MyCharacter(char val){
		this.val = val;
	}
	public static boolean isDigit(char val){
		if('0' <= val && val <= '9'){
			return  true;
		}
		return false;
	}
	public static boolean isLetter(char val){
		if(('a' <= val || 'A' <= val) && (val <= 'z' || val <= 'Z')){
			return true;
		}
		return false;
	}

	public static boolean isLowerCase(char val){
		if('a' <= val && val <= 'z'){
			return true;
		}
		return false;
	}
	
	public static boolean isUpperCase(char val){
		if('A' <= val && val <= 'Z'){
			return true;
		}
		return false;
	}
	
	public static char toLowerCase(char val){
		if('A' <= val && val <= 'Z'){
			return (char)((val - 'A') + 'a');
		}
		return val;
	}
	
	public static char toUpperCase(char val){
		if('a' <= val && val <= 'z'){
			return (char)((val - 'a') + 'A');
		}
		return val;
	}
	
	
	
	/*
	 * getters and setters
	 */
	public char getVal() {
		return val;
	}
	
}

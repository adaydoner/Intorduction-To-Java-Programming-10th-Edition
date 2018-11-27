package Classes;
/**
 * This class initialized with conditions that giving at chapter 10. exercise 22.
 * @author Ali Dogan Aydoner
 *
 */
public class MyString1 {
	private char[] val;
	
	public MyString1 (char[] chars){
		val = new char[chars.length];
		for (int i = 0; i < chars.length; i++) {
			val[i] = chars[i];
		}
	}
	/**
	 * return the character that located at specified index
	 * @param index
	 * @return
	 */
	public char charAt(int index){
		return val[index];
	}
	
	/**
	 * return the length of object
	 * @return
	 */
	public int length(){
		int counter = 0;
		for (char c : val) {
			counter++;
		}
		return counter;
	}
	
	/**
	 * return the substring at specified begin and end index, [begin](end)
	 * this method would return object reference.
	 * @param begin
	 * @param end
	 * @return
	 */
	public MyString1 substring(int begin, int end){
		char[] subChar = new char[end - begin];
		int writer = 0;
		for (int i = begin; i < end; i++, writer++) {
			subChar[writer] = val[i];
		}
		MyString1 substring = new MyString1(subChar); 
		return substring;
	}
	
	/**
	 * turn the uppercase characters into lower case characters
	 * this method would return object reference.
	 * @return
	 */
	public MyString1 toLowerCase(){
		char[] lowerCase = new char[val.length];
		for (int i = 0; i < val.length; i++) {
			if('A' <= val[i] && val[i] <= 'Z'){
				lowerCase[i] = (char)('a' + (val[i] - 'A'));
			} else {
				lowerCase[i] = val[i];
			}
		}
		MyString1 lowerCaseObject = new MyString1(lowerCase); 
		return lowerCaseObject;
	}
	
	
	/**
	 * return true if object's and specified s object are same.
	 * @param s
	 * @return
	 */
	public boolean equals(MyString1 s){
		for (int i = 0; i < s.length(); i++) {
			if(val[i] != s.charAt(i)){
				return false;
			}
		}
		return true;
	}
	
	/**
	 * this method would create a new MyString1 object with the value of specified integer.
	 * @param i
	 * @return
	 */
	public static MyString1 valueOf(int i){
		int c = i;
		int writer = 0;
		//find the number of decimal points specified i's.
		while(c > 0){
			c /= 10;
			writer++;
		}
		char[] valueOf = new char[writer];
		
		while(i > 0){
			valueOf[writer - 1] = (char)('0' + (i % 10));
			i /= 10;
			writer--;
		}
		
		MyString1 rs = new MyString1(valueOf);
		return rs;
	}
	
	/*
	 * getters setters
	 */
	public String getVal() {
		String val = "";
		for (int i = 0; i < this.val.length; i++) {
			val += this.val[i];
		}
		return val;
	}
}

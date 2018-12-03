package Classes;
/**
 * This class initialized with conditions that giving at chapter 10. exercise 28.
 * @author Ali Dogan Aydoner
 *
 */
public class MyStringBuilder2 {
	private char[] val;
	
	public MyStringBuilder2(){
		this("");
	}

	public MyStringBuilder2(char[] chars){
		this(String.valueOf(chars));
	}
	
	public MyStringBuilder2(String s){
		val = new char[s.length()];
		for (int i = 0; i < s.length(); i++) {
			val[i] = s.charAt(i);
		}
	}
	
	/**
	 * Inserts the string representation of the Object argument into this character sequence. 
	 * The overall effect is exactly as if the second argument were converted to a string by the method String.
	 * valueOf(Object),and the characters of that string were then inserted into this character sequence at the indicated offset.
	 * 
	 * @param offset
	 * @param s
	 * @return
	 */
	public MyStringBuilder2 insert(int offset, MyStringBuilder2 s){
		String newObjVal = "";
		for (int i = 0; i < offset; i++) {
			newObjVal += val[i];
		}
		newObjVal += String.valueOf(s.getVal());
		
		for (int i = offset ; i < val.length; i++) {
			newObjVal += val[i];
		}
		
		return new MyStringBuilder2(newObjVal);
	}
	
	/**
	 * Causes this character sequence to be replaced by the reverse of the sequence. 
	 * @return
	 */
	public MyStringBuilder2 reverse(){
		String newObjVal = "";
		for (int i = val.length - 1; i >= 0 ; i--) {
			newObjVal += val[i];
		}
		return new MyStringBuilder2(newObjVal);
	}
	
	
	/**
	 * Returns a new String that contains a subsequence of characters currently contained in this character sequence. 
	 * The substring begins at the specified index and extends to the end of this sequence.
	 * @param begin
	 * @return
	 */
	public MyStringBuilder2 substring(int begin){
		String newObjVal = "";
		for (int i = begin; i < val.length; i++) {
			newObjVal += val[i];
		}
		return new MyStringBuilder2(newObjVal);
	}
	
	/**
	 * Converts all of the characters in this String to upper case using the rules of the default locale.
	 * @return
	 */
	public MyStringBuilder2 toUpperCase(){
		String returnVal = "";
		for (int i = 0; i < val.length; i++) {
			if('a' <= val[i] && val[i] <= 'z'){
				returnVal += (char)(val[i] - 'a' + 'A');
			} else {
				returnVal += val[i];
			}
		}
		return new MyStringBuilder2(returnVal);
	}
	
	/**
	 * getters and setters
	 */
	public String getVal(){
		String returnVal = "";
		for (int i = 0; i < val.length; i++) {
			returnVal += val[i];
		}
		return returnVal;
	}
}

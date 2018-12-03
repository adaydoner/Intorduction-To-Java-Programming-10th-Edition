package Classes;
/**
 * This class initialized with conditions that giving at chapter 10. exercise 27.
 * @author Ali Dogan Aydoner
 *
 */
public class MyStringBuilder1 {
	private char[] val;
	
	/**
	 * Create a new object from specified String s value.
	 * @param s
	 */
	public MyStringBuilder1 (String s){
		val = new char[s.length()];
		for (int i = 0; i < s.length(); i++) {
			val[i] = s.charAt(i);
		}
	}
	
	/**
	 * this method return a new MyStringBuilder1 object with the value of (instance value + specified objects value).
	 * instance value : value of the object that called this method.
	 * @param s
	 * @return
	 */
	public MyStringBuilder1 append(MyStringBuilder1 s){
		return new MyStringBuilder1(this.toString() + s.toString());
	}

	/**
	 * this method return a new MyStringBuilder1 object with the value of (instance value + specified integer value).
	 * instance value : value of the object that called this method.
	 * @param i
	 * @return
	 */
	public MyStringBuilder1 append(int i) {
		return append(new MyStringBuilder1(String.valueOf(i)));
	}
	
	/**
	 * this method return length of this object's value
	 * @return
	 */
	public int length() {
		return val.length;
	}
	
	/**
	 * this method return a char of this object's specified index
	 * @param index
	 * @return
	 */
	public char charAt(int index){
		return val[index];
	}
	
	/**
	 * Converts all of the characters in this String to lower case using the rules of the default locale.
	 * @return
	 */
	public MyStringBuilder1 toLowerCase(){
		char[] returnVal = new char[val.length];
		for (int i = 0; i < returnVal.length; i++) {
			if('A' <= val[i] && val[i] <= 'Z'){
				returnVal[i] = (char)(val[i] - 'A' + 'a');
			} else {
				returnVal[i] = val[i];
			}
		}
		return new MyStringBuilder1(String.valueOf(returnVal));
	}
	
	/**
	 * this method return a new MyStringBuilder1 object from this objects specified indexes
	 * begin : this index value would be the start of new objects
	 * end   : this index value would be the end of new objects
	 * @param begin
	 * @param end
	 * @return
	 */
	public MyStringBuilder1 substring(int begin, int end){
		char[] returnVal = new char[val.length];
		for (int i = begin,writer = 0; i < end; i++,writer++) {
			returnVal[writer] = val[i];
		}
		
		return new MyStringBuilder1(String.valueOf(returnVal));
	}
	
	/**
	 * return a String of this objects value. 
	 */
	public String toString(){
		return String.valueOf(val);
	}
}

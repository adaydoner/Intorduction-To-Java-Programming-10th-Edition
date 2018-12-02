package Classes;
/**
 * This class initialized with conditions that giving at chapter 10. exercise 27.
 * @author Ali Dogan Aydoner
 *
 */
public class MyStringBuilder1 {
	private char[] val;
	
	public MyStringBuilder1 (String s){
		val = new char[s.length()];
		for (int i = 0; i < s.length(); i++) {
			val[i] = s.charAt(i);
		}
	}
	
	
	public MyStringBuilder1 append(MyStringBuilder1 s){
		char[] val2 = new char[val.length + s.val.length];
		copyArrays(val,val2,0,0,val.length);
		copyArrays(s.val,val2,0,val.length,s.val.length);
		
		return new MyStringBuilder1(String.valueOf(val2));
	}

	private void copyArrays(char[] source, char[] dest, int sourcePos,int destPos, int length) {
		for (int i = sourcePos,j = destPos; i < length; i++,j++) {
			dest[j] = source[i];
		}
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

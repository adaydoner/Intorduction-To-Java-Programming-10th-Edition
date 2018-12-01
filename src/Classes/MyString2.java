package Classes;

import java.util.Arrays;

/**
 * This class initialized with conditions that giving at chapter 10. exercise 23.
 * 
 * @author Ali Dogan Aydoner
 *
 */
public class MyString2 {
	char[] val;
	
	public MyString2(String s){
		val = new char[s.length()];
		for (int i = 0; i < s.length(); i++) {
			val[i] = s.charAt(i);
		}
	}
	
	/**
	 * this method would return 1,0,-1 depend on which string is alphabetical bigger,
	 * if object > specified string , return 1
	 * if object = specified string , return 0
	 * if object < specified string , return -1
	 * @param s
	 * @return
	 */
	public int compare(String s){
		for (int i = 0; i < s.length(); i++) {
			if(val[i] > s.charAt(i)){
				return 1;
			} else if(val[i] == s.charAt(i)){
				continue;
			} else {
				return -1;
			}
		}
		return 0;
	}
	
	/**
	 * this method would return a MyString2 object that has a new value. 
	 * value would be a substring of this object , specifically from specified index to last character of object.
	 * @param begin
	 * @return
	 */
	public MyString2 substring(int begin){
		String subString = "";
		for (int i = begin; i < val.length; i++) {
			subString += val[i];
		}
		return new MyString2(subString);
	}
	
	/**
	 * this method would return a MyString2 object with the upper case letters.
	 * @return
	 */
	public MyString2 toUpperCase(){
		String upperCase = "";
		for (int i = 0; i < val.length; i++) {
			if('a' <= val[i] && val[i] <= 'z'){
				upperCase += (char) ('A' + (val[i] - 'a'));
			} else {
				upperCase += val[i];
			}
		}
		return new MyString2(upperCase);
	}

	public char[] toChars(){
		return val;
	}
	
	public static MyString2 valueOf(boolean b){
		if(b){
			return new MyString2("true");
		}
		return new MyString2("false");
	}
	
	/**
	 * returns an array of strings consisting of the substrings split by the delimiters. However, the delimiters are not returned.
	 * @param s
	 * @param regex
	 * @return
	 */
	public static String[] split(String s, String regex){
		int locationWriter = 0; // to write regex indexes.
		int[][] regexLocations = new int[s.length()][2]; // to hold regex locations in specified string
		int numberOfRegex = 0;
		
		for (int i = 0; i < s.length(); i++) {
			for (int j = i,regCounter = 0; regCounter < regex.length(); j++,regCounter++) {
				if(s.charAt(j) == regex.charAt(regCounter)){
					if(regCounter + 1 == regex.length()){
						regexLocations[locationWriter][0] = i;
						regexLocations[locationWriter][1] = i + regex.length() - 1;
						locationWriter++;
					}
					continue;
				} else {
					break;
				}
			}
		}
		
		for (int i = 0; i < regexLocations.length; i++) {
			if(regexLocations[i][1] != 0){ // to avoid empty indexes in array.
				numberOfRegex++;
			}
		}
		
		
		String[] returnVal = new String[numberOfRegex + 1];
		for (int i = 0; i < returnVal.length; i++) {
			returnVal[i] = "";
		}
		
		
		writeStringsExceptRegex(s,returnVal,regexLocations,numberOfRegex);
		return returnVal;
	}
	
	private static void writeStringsExceptRegex(String s, String[] returnVal, int[][] regexLocations,int numberOfRegex) {
		for (int i = 0; i <= numberOfRegex; i++) {
			if (i == 0) {
				for (int j = 0; j < regexLocations[0][0]; j++) {
					returnVal[i] += s.charAt(j);
				}
			} else if (i == numberOfRegex) {
				for (int j = regexLocations[i- 1][1] + 1; j < s.length(); j++) {
					returnVal[i] += s.charAt(j);
				}
			} else {
				for (int j = regexLocations[i - 1][1] + 1; j < regexLocations[i][0]; j++) {
					returnVal[i] += s.charAt(j);
				}
			}
		}
	}

	private static int count(int[][] regexLocations) {
		int counter = 0;
		for (int i = 0; i < regexLocations.length; i++) {
			if(regexLocations[i][1] != 0){ // to avoid empty indexes in array.
				counter++;
			}
		}
		return counter;
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

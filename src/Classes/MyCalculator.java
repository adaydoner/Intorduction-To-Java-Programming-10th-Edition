package Classes;
/**
 * This class initialized with conditions that giving at chapter 10. exercise 26.
 * @author Ali Dogan Aydoner
 *
 */
public class MyCalculator {

	public static int calculate(String s){
		String operand1 = "";
		String operand2 = "";
		char operator;
		int index = 0;
		s = trimAll(s);
		
		
		//getOperand1
		while(s.charAt(index) != '+' && s.charAt(index) != '-' && s.charAt(index) != '.' && s.charAt(index) != '/'){
			operand1 += s.charAt(index);
			index++;
		}
		
		//getOperator
		operator = s.charAt(index);
		index++;
		
		//getOperand2
		while(index < s.length()){
			operand2 += s.charAt(index);
			index++;
		}
		
		//Calculate
		int result = 0;
		switch (operator) {
		case '+': result = Integer.parseInt(operand1) + Integer.parseInt(operand2); break;
		case '-': result = Integer.parseInt(operand1) - Integer.parseInt(operand2); break;
		case '.': result = Integer.parseInt(operand1) * Integer.parseInt(operand2); break;
		case '/': result = Integer.parseInt(operand1) / Integer.parseInt(operand2);}
		
		
		//return
		return result;
		
	}

	/**
	 * this method would clear all space characters ' '. 
	 * @param s
	 * @return
	 */
	private static String trimAll(String s) {
		String returnVal = "";
		for (int i = 0; i < s.length(); i++) {
			if(s.charAt(i) != ' '){
				returnVal += s.charAt(i);
			} else {
				continue;
			}
		}
		return returnVal;
	}
}

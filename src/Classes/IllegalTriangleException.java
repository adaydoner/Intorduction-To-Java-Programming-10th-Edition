package Classes;
/**
 * This class initialized with conditions that giving at chapter 12. exercise 05.
 * @author Ali Dogan Aydoner
 *
 */
public class IllegalTriangleException extends Throwable{
	private String msg;
	
	public IllegalTriangleException() {
		msg = "In a triangle, the sum of any two sides is have to be greater than the other side.";
	}

	/*
	 * getters and setters
	 */
	
	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	
}

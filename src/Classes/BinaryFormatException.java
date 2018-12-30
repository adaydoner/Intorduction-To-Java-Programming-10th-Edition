package Classes;
/**
 * initialized with conditions that giving at Chapter12.PE.09
 * @author Ali Dogan Aydoner
 *
 */
public class BinaryFormatException extends Throwable{
	private String msg = "";
	
	public BinaryFormatException(){
		super();
	}
	
	public BinaryFormatException(String msg){
		super(msg);
	}

	/*
	 * getters and setters.
	 */
	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
}

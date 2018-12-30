package Classes;
/**
 * initialized with conditions that giving at Chapter12.PE.07
 * @author Ali Dogan Aydoner
 *
 */
public class HexFormatException extends Throwable{
	private String msg = "";

	public HexFormatException (){
		super();
	}
	
	public HexFormatException (String msg){
		super(msg);
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

package Classes;
/**
 * initialized with conditions that giving at Chapter11.PE.02
 * @author Ali Dogan Aydoner
 *
 */
public class Person {
	private String name;
	private String address;
	private String phoneNumber;
	private String eMail;

	public Person() {
		this("ali","Istanbul","555-999-22-11","alidoganaydoner@gmail.com");
	}
	
	public Person(String name, String address, String phoneNumber, String eMail){
		this.name = name;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.eMail = eMail;
	}
	
	@Override
	public String toString () {
		return "Person " + name;
	}
	
	/*
	 * getters and setters
	 */
	public String getName(){
		return name;
	}
}

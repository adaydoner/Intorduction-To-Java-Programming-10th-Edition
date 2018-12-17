package Classes;
/**
 * initialized with conditions that giving at Chapter11.PE.02
 * @author Ali Dogan Aydoner
 *
 */
public class Student extends Person{
	private static final String[] status = {"Freshman", "Sophomore","Junior","Senior"};
	private String classStatus;
	
	public Student() {
		this("ali","Edirne","222-222-22-22","ali@student.com",2);
	}
	
	/**
	 * 
	 * @param name
	 * @param address
	 * @param phoneNumber
	 * @param eMail
	 * @param Status 1 : Freshman , 2 : Sophomore , 3 : Junior , 4 : Senior;
	 */
	public Student (String name,String address, String phoneNumber, String eMail , int Status) {
		super(name,address,phoneNumber,eMail);
		classStatus = status[Status];
	}
	
	@Override
	public String toString() {
		return "Student " + this.getName(); 
	}
}

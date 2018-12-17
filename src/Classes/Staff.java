package Classes;
/**
 * initialized with conditions that giving at Chapter11.PE.02
 * @author Ali Dogan Aydoner
 *
 */
public class Staff extends Employee{
	private String title;
	
	public Staff(){
		this("Dr.");
	}
	
	public Staff (String title) {
		this.title = title;
	}
	
	public Staff(String name, String address, String phoneNumber, String eMail, String office, double salary,String title) {
		super(name, address, phoneNumber, eMail, office, salary);
		this.title = title;
	}

	@Override
	public String toString() {
		return "Staff " + this.getName(); 
	}
}

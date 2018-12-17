package Classes;
/**
 * initialized with conditions that giving at Chapter11.PE.02
 * @author Ali Dogan Aydoner
 *
 */
public class Faculty extends Employee {
	private String officeHours;
	private String rank;
	
	public Faculty (){
		this("09:00 - 17:00","5");
	}
	
	public Faculty (String officeHours, String rank) {
		this.officeHours = officeHours;
		this.rank = rank;
	}
	
	public Faculty(String name, String address, String phoneNumber, String eMail, String office, double salary,String officeHours, String rank) {
		super(name, address, phoneNumber, eMail, office, salary);
		this.officeHours = officeHours;
		this.rank = rank;
	}

	@Override
	public String toString() {
		return "Faculty " + this.getName(); 
	}
}

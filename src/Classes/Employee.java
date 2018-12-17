package Classes;
/**
 * initialized with conditions that giving at Chapter11.PE.02
 * @author Ali Dogan Aydoner
 *
 */
public class Employee extends Person {
	private String office;
	private double salary;
	private MyDate dateHired;
	
	public Employee(){
		this("Engineering", 4500);
		dateHired = new MyDate();
	}
	
	public Employee (String office, double salary) {
		this.office = office;
		this.salary = salary;
		dateHired = new MyDate();
	}
	public Employee(String name, String address, String phoneNumber, String eMail,String office, double salary) {
		super(name, address, phoneNumber, eMail);
		this.office = office;
		this.salary = salary;
		dateHired = new MyDate();
	}

	@Override
	public String toString() {
		return "Employee " + this.getName(); 
	}
}

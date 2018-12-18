package Classes;
/**
 * initialized with conditions that giving at Chapter11.PE.03
 * @author Ali Dogan Aydoner
 *
 */
public class CheckingAccount extends Account {
	private double overdraftLimit = -1000;

	public CheckingAccount() {
		
	}
	
	public CheckingAccount(int specifiedId, double specifiedBalance) {
		super(specifiedId, specifiedBalance);
	}
	
	@Override
	public void withdraw (double amount) {
		if(getBalance() - amount >= overdraftLimit){
			super.withdraw(amount);
		} else {
			System.out.println("you dont have this much limit you have " + getBalance() + " money left and " + (getBalance() + overdraftLimit) + " limit left" );
		}
	}
	
	@Override
	public String toString () {
		return super.toString() + " from Checking Account";
	}
	
	
}

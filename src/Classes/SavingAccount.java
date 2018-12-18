package Classes;
/**
 * initialized with conditions that giving at Chapter11.PE.03
 * @author Ali Dogan Aydoner
 *
 */
public class SavingAccount extends Account {

	
	public SavingAccount () {
		
	}
	
	public SavingAccount(int specifiedId, double specifiedBalance) {
		super(specifiedId, specifiedBalance);
	}


	@Override
	public void withdraw (double amount) {
		if(getBalance() - amount >= 0){
			super.withdraw(amount);
		} else {
			System.out.println("You dont have this much money , you have " + getBalance() + " left.");
		}
	}
	
	@Override
	public String toString () {
		return super.toString() + " from SavingAccount";
	}
}

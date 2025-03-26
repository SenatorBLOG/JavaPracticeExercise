package ErrorHandling;

public class CustomerAccount {
	private int cAcc;
	private double balance;
	
	public CustomerAccount(int acc,double b) throws LowBalanceException {
		cAcc=acc;
		balance = b;
		if(balance<5000) {
			throw new LowBalanceException();
		}
			
	}
}

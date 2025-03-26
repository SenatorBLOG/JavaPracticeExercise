package ErrorHandling;

public class AccountApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int acc = 45445;
		double balance = 3000;
		CustomerAccount cAcc = null;
		try {
			 cAcc = new CustomerAccount(acc,balance);
		} catch (LowBalanceException e) {
			System.out.println(e.getMessage());
			//e.printStackTrace();
		}
		if(cAcc!=null)
		System.out.println("balance is " + balance);
		
	}

}

package ErrorHandling;

public class LowBalanceException extends Exception{
	
	public LowBalanceException() {
		super("The balance is low");
		
	}
}

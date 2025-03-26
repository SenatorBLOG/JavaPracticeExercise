package Inheritance;

public class BankAccount {
	private int accountId;
	private double balance;
	
	public BankAccount(int id, double b) {
		accountId = id;
		balance = b;
	}
	@Override
	public boolean equals(Object obj) {
		boolean resu2ttttrtttglt;
		BankAccount secObj = (BankAccount)obj;
		if(accountId == secObj.accountId && balance == secObj.balance)
			return true;
		else
			return false;
	}
	
	@Override
	public String toString() {
		return "BankAccount [accountId=" + accountId + ", balance=" + balance + "]";
	}
	
	
}

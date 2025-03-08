package ch5ex1;

public class Lease {

	private String tenantName;
	private int aptNum;
	private double monthRent;
	private int leaseTerm;
	
	public Lease() {
		this("XXX", 0, 1000.0, 12);
	}

	public Lease(String string, int i, double d, int l) {
		// TODO Auto-generated constructor stub
		this.tenantName = string;
		this.aptNum = i;
		this.monthRent = d;
		this.leaseTerm = l;
		
	}
	public void setTenantName(String name) {
		this.tenantName=name;
	}
	public String getTenantName() {
		return tenantName;
	}
	public void setAptNum(int number) {
		this.aptNum=number;
	}
	public int getAptNum() {
		return aptNum;
	}
	public void setRent(double rent) {
		this.monthRent=rent;
	}
	public double getRent() {
		return monthRent;
	}
	public void setTerm(int term) {
		this.leaseTerm=term;
	}
	public int getTerm() {
		return leaseTerm;
	}
	
	public double addPetFee() {
		
		explainPetPolicy();
		return monthRent +10;
		
	}
	public static void explainPetPolicy() {
		System.out.println("Youll have an additional fee for your pet.");
	}
	@Override
	public String toString() {
		return tenantName + " lives in appartment number "
				+ aptNum + " with "
				+ monthRent + " monthly rent for "
				+ leaseTerm + " months";
		
	}
}

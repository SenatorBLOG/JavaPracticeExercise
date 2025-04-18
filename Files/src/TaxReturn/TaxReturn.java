package TaxReturn;

public class TaxReturn {
	private String ssn;
	private String lastName;
	private String firstName;
	private String street;
	private String city;
	private String state;
	private String zipCode;
	private double income;
	private boolean married;
	private double tax;
	
	public TaxReturn(String ssn, String lastName, String firstName,
			String street, String city, String state,
			String zipCode, double income, boolean married) {
		this.ssn = ssn;
		this.lastName = lastName;
		this.firstName = firstName;
		this.street = street;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
		this.income = income;
		this.married = married;
		if(income >= 0 && income <=20000) {
			if(!married) {
				this.tax = income*0.15;
			}else {
				this.tax = income*0.14;
			}
		}
		else if(income >20001 && income <=50000) {
			if(!married) {
				this.tax = income*0.22;
			}else {
				this.tax = income*0.20;
			}
		}
		else {
			if(!married) {
				this.tax = income*0.3;
			}else {
				this.tax = income*0.28;
			}
		}
		
	}

	@Override
	public String toString() {
		return "TaxReturn [ssn=" + ssn + ", lastName=" + lastName + ", firstName=" + firstName + ", street=" + street
				+ ", city=" + city + ", state=" + state + ", zipCode=" + zipCode + ", income=" + income + ", married="
				+ married + ", tax=" + tax + "]";
	}
	
}

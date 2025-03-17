package StudentDatabase;

public class Person {
	private String fName;
	private String lName;
	private String Address;
	public Person(String fName, String lName, String address) {
		super();
		this.fName = fName;
		this.lName = lName;
		Address = address;
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	
	
}

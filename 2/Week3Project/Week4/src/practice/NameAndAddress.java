package practice;

public class NameAndAddress {
	private String name;
	private String address;
	private String postalCode;
	
	public NameAndAddress(String name, String address, String postalCode) {
		this.name = name;
		this.address = address;
		this.postalCode = postalCode;
	}
	public String getName() {
		return name;
	}
	public NameAndAddress() {
		
		// TODO Auto-generated constructor stub
	}
	public void setName(String name) {
		this.name = name;
	}
	public void display() {
		System.out.println("Name" + name + " Address " 
				+ address + " Postal Code " + postalCode);
	}
	
}

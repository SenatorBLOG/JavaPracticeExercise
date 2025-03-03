package practice;

public class Employee {
	 private int empID;
	 private NameAndAddress nAdd;
	 
	public Employee(int empID, NameAndAddress nAdd) {
		this.empID = empID;
		this.nAdd = nAdd;
	}
	public Employee(int empID, String name, String address, String postalCode) {
		this.empID = empID;
		nAdd = new NameAndAddress(name,address,postalCode);
	}
	public Employee() {
		empID =111;
		nAdd = new NameAndAddress("Unknown","Unknown","Unknown");
	}
	 
	public void display() {
		System.out.println("EmpId" + empID);
		nAdd.display();
		System.out.println(nAdd.getName());
	}
}

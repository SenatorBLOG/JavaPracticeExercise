package Inheritance;

public class Employee {
	private int empId;
	protected String empName;
	
	
	
//	public Employee() {
//		System.out.println("Parent class constructor");
//		empId = 111;
//		empName = "defaault";
//	}
	
	
	public Employee(int empId, String empName) {
		this.empId = empId;
		this.empName = empName;
	}


	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public final void aFinalMethod() {
		System.out.println("a final method");//child cant modified 
	}
	public static void aStaticMethod() {
		System.out.println("parent method");
		System.out.println("Org name is aBC  trades");
	}
	public void display() {
		System.out.println(empId + " " + empName);
	}
	
}

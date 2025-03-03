package practice;

public class Employee {
	private int empId;
	private String  name;
	private double salary;
	private static int empCount = 0;
	private final static String ORG_ID = "DR1488";
	
	public Employee(int id, String name, double s) {
		empId = id;
		this.name = name;
		salary = s;
		empCount++;
	}
	
	public Employee() //default constructor
	{
		this(111,"sasha",12.1); //calling a parameterized constructor
		/*empId = 111;
		name = "sasha";
		salary = 123441.1;*/
		
	}
	
	
	public Employee(int id, String name) {
		empId = id;
		this.name = name;
		salary = 12;
		empCount++;
	}
	
	public void setEmpId(int id) {
		empId = id;
		
	}
	public int  getEmpId() {
		return empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public double calcGross() {
		double com = 5000;
		return com/2;
	}
	//static method
	public static void aStaticMethod()
	{
		System.out.println("THis is from static method.");
	}
	
	
	@Override
	public String toString()
	{
		String str = "ID:  " + empId + "  Name: " + name + " Salary: " + salary + calcGross()+ " number off employees is " + empCount;
		return str;
	}
	
}

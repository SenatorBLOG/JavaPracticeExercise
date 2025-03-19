package Inheritance;

public class SalariedEmployee extends Employee{
	private double salary;
	
	public SalariedEmployee() {
		super(132,"asd");
		System.out.println(" a child claass constructor");
		salary = 111.11;
	}
	

	public SalariedEmployee(int id, String n, double salary) {
		super(id,n);
		this.salary = salary;
	}


	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	//cannot override static methods
	public static void aStaticMethodd() {
		Employee.aStaticMethod();
		System.out.println("Child class staatic method");
	}
	@Override
	public void display() {
		super.display();
		System.out.println("salary " + salary);
	}
}

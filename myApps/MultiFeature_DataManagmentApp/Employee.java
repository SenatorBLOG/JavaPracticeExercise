package MultiFeature_DataManagmentApp;

public class Employee {
	private int idNumber=0;
	private String name;
	private double annualSale;
	public Employee() {
		
	}
	private CompletedCourses  courses[];
	
	public Employee(int empId, double salesAmount) {
		// TODO Auto-generated constructor stub
	}
	public int getIdNumber() {
		return idNumber;
	}
	public void setIdNumber(int idNumber) {
		this.idNumber = idNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getAnnualSale() {
		return annualSale;
	}
	public void setAnnualSale(double annualSale) {
		this.annualSale = annualSale;
	}
	public CompletedCourses[] getCourses() {
		return courses;
	}
	public void setCourses(CompletedCourses[] courses) {
		this.courses = courses;
	}
	public void display(){
		System.out.printf("The employee Name %s ID: %d, aanual sale: %d.",idNumber,name,annualSale);
	}
}

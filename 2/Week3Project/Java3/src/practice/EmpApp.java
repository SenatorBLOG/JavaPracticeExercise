package practice;

public class EmpApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double dVal = 6.1231231;
		String str = String.format("The dval is %.2f", dVal);
		System.out.println(dVal);
		String st = "DC";
		int iVal = 777;
		System.out.println(String.format("My school is %s " + " and ID is %d", st,iVal));
		
		Employee.aStaticMethod();
		Employee emp1 = new Employee();
		System.out.println(emp1.getEmpId());
		emp1.setEmpId(0);
		emp1.setName("David");
		System.out.println(emp1.getName());
		System.out.println(emp1);//to string method called 
		//emp1.aStaticMethod();
		
		Employee emp2 = new Employee(666,"hui");
		displayEmpInfo(emp2);
		
		Employee emp3 = new Employee(777,"hueta", 9123.12);
		displayEmpInfo(emp3);
		
		Employee emp4 = createEmpObject();
		displayEmpInfo(emp4);
		

	}
	public static Employee createEmpObject() {
		int id = 1223;
		String name = "Yun";
		double sal = 10800;
		Employee emp = new Employee(id,name,sal);
		return emp;
	}
	
	public static void displayEmpInfo(Employee emp) {
		System.out.println(emp);
	}

}

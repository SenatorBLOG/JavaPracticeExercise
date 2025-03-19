package Inheritance;

public class EmployeeApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp = new Employee(4545,"asad");
		//emp.setEmpId(4545);
		//emp.setEmpName("asad");
		//System.out.println(emp.getEmpId() + " " + emp.getEmpName());
		emp.display();
		
		SalariedEmployee sEmp = new SalariedEmployee();
		sEmp.setEmpId(1232);
		sEmp.setEmpName("Davf");
		sEmp.setSalary(123123.223);
		
		//System.out.println(sEmp.getEmpId() + " " + sEmp.getEmpName() + " " 
		//		+ sEmp.getSalary());
		sEmp.display();
		if( sEmp instanceof SalariedEmployee) {
			System.out.println("sEmp is of SalarriedEmployee type");
			
		}
		
		SalariedEmployee sEmp1 = new SalariedEmployee(2222,"Ron",44.44);
		sEmp1.empName = "John";
		sEmp1.display();
	}
	

}  

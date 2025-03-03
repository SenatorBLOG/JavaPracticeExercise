package practice;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String day ="1";
		
		switch(day) {
		case "1":
		case "i":
			System.out.println("mon");
			break;
		case "2":
			System.out.println("tue");
			break;

		default:
			System.out.println("Not a week day");	
		}
		
		String deptCode = "C";
		String deptName = "";
		
		switch(deptCode) {
		case "C","c" -> deptName = "CSIS";
		case "B","b" -> deptName = "BUSN";
		default -> deptName = "Unknown";
		}
		System.out.println("dept Name " + deptName);
		
		deptName = switch(deptCode) {
		case "C","c" -> "CSIS";
		case "B","b" -> "BUSN";
		default ->  "Unknown";
		};
		System.out.println(deptName);
		
		System.out.println(switch(deptCode) {
		case "C","c" -> "CSIS";
		case "B","b" -> "BUSN";
		default ->  "Unknown";
		});
		
		int scores = 67;
		if(scores > 50 && scores < 1) {
			System.out.println("good");
		}
		else {
			System.out.println("bad");
		}
		
		
		
		RealEstateListing listing1 = new RealEstateListing("ER41", 1244124.123,123,"Vancouver");
		RealEstateListing listing2 = new RealEstateListing("ER41", 1244124.123,123,"Burnaby");
		
		//if(listing1.getAddress() == listing2.getAddress())
		
		
		listing1.display();
		listing1.getAddress();
		
		Employee emp1 = new Employee();
		emp1.display();
		
		Employee emp2 = new Employee(4545,"Sam", "Burnaby", "V2E3BT");
		emp2.display();
		
		Employee emp = new Employee();
		emp.display();
		
		NameAndAddress nad = new NameAndAddress();
		nad.display();
		
	}

}

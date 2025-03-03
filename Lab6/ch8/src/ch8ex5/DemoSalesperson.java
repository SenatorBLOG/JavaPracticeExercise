package ch8ex5;

public class DemoSalesperson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Salesperson[] salesPeople = new Salesperson[10];
		
		for( int i =0; i<salesPeople.length;i++) {
			salesPeople[i] = new Salesperson(9999,0.0);
		}
		
		for(Salesperson s : salesPeople) {
			s.display();
		}
	}

}

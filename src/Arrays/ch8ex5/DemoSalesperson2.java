package ch8ex5;

public class DemoSalesperson2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Salesperson[] salesPeople = new Salesperson[10];
		int startId = 111;
		double salesStart = 25000.0;
		
		for( int i =0; i<salesPeople.length;i++) {
			
			int id = startId + i;
			double sales = salesStart + (i * 5000);
			salesPeople[i] = new Salesperson(id,sales);
		}
		
		for(Salesperson s : salesPeople) {
			s.display();
		}
	}

}

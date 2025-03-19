package Inheritance;

public class WorkingDog extends Dog implements Worker{
	private int trainingHours;
	
	
	public int getTraningHours() {
		return trainingHours;
	}

	public void setTraningHours(int traningHours) {
		this.trainingHours = traningHours;
	}

	@Override
	public void work() {
		// TODO Auto-generated method stub
		System.out.println("The org id is " + ORG_ID + 
				"The training hours are " + trainingHours);
	}

	@Override
	public void interfaceAbstractMethods() {
		// TODO Auto-generated method stub
	System.out.println(" this is another abstract method ");
	}

}

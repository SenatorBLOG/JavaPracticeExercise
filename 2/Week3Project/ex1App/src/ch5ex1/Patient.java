package ch5ex1;

public class Patient {
	private int idNum;
	private int age;
	private BloodData bloodData;
	
	public Patient() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Patient(int idNum, int age, BloodData bloodData) {
		super();
		this.idNum = idNum;
		this.age = age;
		this.bloodData = bloodData;
	}

	public int getIdNum() {
		return idNum;
	}

	public void setIdNum(int idNum) {
		this.idNum = idNum;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public BloodData getBloodData() {
		return bloodData;
	}

	public void setBloodData(BloodData bloodData) {
		this.bloodData = bloodData;
	}

	@Override
	public String toString() {
		return "Patient [idNum=" + idNum + ", age=" + age + ", bloodData=" + bloodData + "]";
	}
	
	
}

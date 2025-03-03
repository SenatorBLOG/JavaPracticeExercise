package ch5ex1;

public class BloodData {
	private String bloodType;

	private String Rh;

	public BloodData() {
		this("O","+");
		// TODO Auto-generated constructor stub
	}

	public BloodData(String bloodType, String rh) {
		super();
		this.bloodType = bloodType;
		Rh = rh;
	}

	public String getBloodType() {
		return bloodType;
	}

	public void setBloodType(String bloodType) {
		this.bloodType = bloodType;
	}

	public String getRh() {
		return Rh;
	}

	public void setRh(String rh) {
		Rh = rh;
	}

	@Override
	public String toString() {
		return "BloodData [bloodType=" + bloodType + ", Rh=" + Rh + "]";
	}
	
}

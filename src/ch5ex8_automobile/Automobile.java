package ch5ex8_automobile;

public class Automobile {
	private int id;
	private String make;
	private String model;
	private String color;
	private int year;
	private int milesGallon;
	public Automobile(int id, String make, String model, String color, int year, int milesGallon) {
		super();
		this.id = id;
		this.make = make;
		this.model = model;
		this.color = color;
		this.year = year;
		this.milesGallon = milesGallon;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		if(id <= 0 && id > 9999) {
			System.out.println("ID must be between 0 to 9999.");
			this.id = 0;
			}
		this.id=id;
	}
	
	
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getYear() {
		
		return year;
	}
	public void setYear(int year) {
		if (year <=2005 && year >=2024 ) {
			System.out.println("Year must be between 2005 and 2024.");
			this.year=0;
		}
		this.year = year;
	}
	public int getMilesGallon() {
		return milesGallon;
	}

	public void setMilesGallon(int milesGallon) {
		if(milesGallon < 10 && milesGallon>60 ){
			System.out.println("MIles must be from 10 to 60.");
			this.milesGallon=0;
		}
		this.milesGallon = milesGallon;
		
	}
	
	
	
}

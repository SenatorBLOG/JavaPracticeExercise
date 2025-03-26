package ErrorHandling;

public class UsedCar {
	public int vin;
	public String make;
	public int year;
	public Double milage;
	public Double price;
	
	public UsedCar(int vin, String make, int year, Double milage, Double price) throws UsedCarException {
		super();
		this.vin = vin;
		this.make = make;
		this.year = year;
		this.milage = milage;
		this.price = price;
		if(vin>=1000 && vin<=9999) {
			throw new UsedCarException("");
		}
		if(make.equals("Ford")|| make.equals("Honda")|| 
				make.equals("Toyota") || make.equals("Chrysler") 
				||make.equals("Other")) {
			throw new UsedCarException(make);
		}
		if(year<=1997 && year>= 2024) {
			throw new UsedCarException("");
		}
		if(milage<0) {
			throw new UsedCarException("");
		}
		if(price<0) {
			throw new UsedCarException("");
		}
	}
	
}

package LambertsVacationRentals;

public class VacationRentals {
	private String location;
	private String parkside;
	private String meal;
	private String numberOfBedrooms;
	
	
	public VacationRentals(String location, String parkside, String meal, String numberOfBedrooms) {
		super();
		this.location = location;
		this.parkside = parkside;
		this.meal = meal;
		this.numberOfBedrooms = numberOfBedrooms;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getParkside() {
		return parkside;
	}
	public void setParkside(String parkside) {
		this.parkside = parkside;
	}
	public String getMeal() {
		return meal;
	}
	public void setMeal(String meal) {
		this.meal = meal;
	}
	public String getNumberOfBedrooms() {
		return numberOfBedrooms;
	}
	public void setNumberOfBedrooms(String numberOfBedrooms) {
		this.numberOfBedrooms = numberOfBedrooms;
	}
	@Override
	public String toString() {
		return "VacationRentals [location=" + location + ", parkside=" + parkside + ", meal=" + meal
				+ ", numberOfBedrooms=" + numberOfBedrooms + "]";
	}
	
	
}

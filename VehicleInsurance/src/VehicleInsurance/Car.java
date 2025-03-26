package VehicleInsurance;

class Car extends Vehicle implements Insurance {
    private int numberOfDoors;
    private String insuranceProvider;

    public Car(String make, String model, int year, double price, int numberOfDoors) {
        super(make, model, year, price);
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public void setInsuranceProvider(String provider) {
        this.insuranceProvider = provider;
    }

    @Override
    public String getInsuranceProvider() {
        return insuranceProvider;
    }

    @Override
    public double calculatePremium() {
        return getPrice() * 0.05; 
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Number of Doors: " + numberOfDoors);
        System.out.println("Insurance Provider: " + insuranceProvider);
        System.out.println("Insurance Premium: $" + String.format("%.2f", calculatePremium()));
    }
}

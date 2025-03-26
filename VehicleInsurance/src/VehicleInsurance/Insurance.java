package VehicleInsurance;

public interface Insurance {
	void setInsuranceProvider(String provider);
    String getInsuranceProvider();
    double calculatePremium();

}

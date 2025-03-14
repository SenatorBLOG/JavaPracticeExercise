package Quiz1Practice;

import java.time.LocalDate;

public class Sub {
	private String name;
	private String subscriptionType;
	private LocalDate startDate;
	private double monthlyFee;
	public Sub() {
		this("Unknown","Basic",LocalDate.now(),9.99);
		
	}
	public Sub(String name, String subscriptionType, LocalDate startDate, double monthlyFee) {
		this.name = name;
		this.subscriptionType = subscriptionType;
		this.startDate = startDate;
		this.monthlyFee = monthlyFee;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSubscriptionType() {
		return subscriptionType;
	}
	public void setSubscriptionType(String subscriptionType) {
		this.subscriptionType = subscriptionType;
	}
	public LocalDate getStartDate() {
		return startDate;
	}
	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}
	public double getMonthlyFee() {
		return monthlyFee;
	}
	public void setMonthlyFee(double monthlyFee) {
		this.monthlyFee = monthlyFee;
	}
	public double updateSubscriptionFee(double percentage) {
		return (monthlyFee/percentage);
	}
}

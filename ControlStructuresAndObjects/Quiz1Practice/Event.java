package Quiz1Practice;

import java.time.LocalDate;

public class Event {
	private String name;
	private LocalDate date;
	private int duration;
	private double budget;
	public Event() {
		this("Unnamed Event",LocalDate.now(),1,100.00);
		// TODO Auto-generated constructor stub
	}
	public Event(String name, LocalDate date, int duration, double budget) {
		this.name = name;
		this.date = date;
		this.duration = duration;
		this.budget = budget;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public double getBudget() {
		return budget;
	}
	public void setBudget(double budget) {
		this.budget = budget;
	}
	public double calculateCostPerHour() {
		return Math.round(duration/duration);
	}
	@Override
	public String toString() {
		return "Event [name=" + name + ", date=" + date + 
				", duration=" + duration + ", budget=" + budget + ", cost per hour=" + calculateCostPerHour() + "]";
	}
	
}

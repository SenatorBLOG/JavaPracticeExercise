package ch5ex1;

import java.time.LocalDate;

public class FitnessTracker {
	private String actName;
	private int minNum;
	private LocalDate date; 
	
	public FitnessTracker() {
		this("running",0, LocalDate.of(2025,1,1));
	}

	public FitnessTracker(String string, int i, LocalDate localDate) {
		// TODO Auto-generated constructor stub
		this.actName = string;
		this.minNum = i;
		this.date = localDate;
	}
	public String getActName() {
		return actName;
	}
	public void setActName(String name) {
		this.actName = name;
	}
	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public void setMinNum(int minNum) {
		this.minNum = minNum;
	}

	public int getMinNum() {
		return minNum;
	}
	public LocalDate getLocalDate() {
		return date;
	}
	
	@Override
	public String toString() {
		return "You have spent " + minNum +
				" for the " + actName +
				" on " + date;
	}
}

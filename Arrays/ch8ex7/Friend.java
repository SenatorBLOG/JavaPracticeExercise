package ch8ex7;

public class Friend {
	private String name;
	private int bday;
	public Friend(String name, int bday) {
		this.name = name;
		this.bday = bday;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBday() {
		return bday;
	}
	public void setBday(int bday) {
		this.bday = bday;
	}
	public void display() {
		System.out.println("Name is " + name + ", Birthday " + bday);
	}
	
}

package ch8ex5;

public class Salesperson {
	private int id = 0;
	private double sales = 0.0;
	public Salesperson(int id, double sales) {
		super();
		this.id = id;
		this.sales = sales;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getSales() {
		return sales;
	}
	public void setSales(double sales) {
		this.sales = sales;
	}
	
	public void display() {
		System.out.println("ID:" + id + ", Sales Amount " + sales);
	}
	@Override
	public String toString() {
		return "Salesperson [id=" + id + ", sales=" + sales + "]";
	}
	
	
}

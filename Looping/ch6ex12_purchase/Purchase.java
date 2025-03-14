package ch6ex12_purchase;

public class Purchase {
	private int Id;
	private double sale;
	private double amountTax;
	private static final double TAX = 1.05;
	
	public Purchase(int id, double sale) {

		Id = id;
		this.sale = sale  * TAX;
	}

	public Purchase(double saleTax) {
		setSale(sale);
	}
	
	public void setNumber(int id) {
		this.Id = id;
	}
	public void setSale(double sale) {
		this.sale = sale * TAX;
		
	}
	public void display() {
		System.out.println(""+ sale);
		System.out.println("" + amountTax);
		System.out.println("" + Id);
	}
	
}

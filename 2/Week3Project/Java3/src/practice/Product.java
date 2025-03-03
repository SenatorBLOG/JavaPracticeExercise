package practice;

public class Product {
	
	private int productId;
	private String productName;
	private double price;
	private int quantity;
	private int productCount = 0;
	
	
	
	public Product(int id, String Default, double Price, int q) {
		productId = id;
		productName = "Default";
		price = Price;
		quantity = q;
		productCount++;
		
	}
	public Product() {
		this(0, "Default", 0.0, 0);
		}
	
	public void setId(int id) {
		productId=id;
	}
	public int getId() {
		return productId;
	}
	public void setName(String Name) {
		productName=Name;
	}
	public String getName() {
		return productName;
	}
	public void setPrice(double Price) {
		price=Price;
	}
	public double getPrice() {
		return price;
	}public void setQ(int Q) {
		quantity=Q;
	}
	public int getQ() {
		return quantity;
	}
	public double calcTotalPrice() {
		double total = quantity * price;
		return total;
	}
	public static void diplayCount(int productCount) {
		System.out.println(productCount+" - products has been added.");
	}
	
	@Override
	public String toString()
	{
		String str = "ID:  " + productId + "  Name: " + productName + " Price: " + price + " " + calcTotalPrice()+ " Total products: " + productCount;
		return str;
	}
}

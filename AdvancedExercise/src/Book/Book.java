package Book;

public abstract class Book {
	private String title;
	protected double price;
	public Book(String title) {
		this.title = title;
	}
	public double getPrice() {
		return price;
	}
	public abstract void setPrice();
	public String getTitle() {
		return title;
	}
	
}

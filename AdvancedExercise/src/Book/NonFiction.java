package Book;

public class NonFiction extends Book{

	public NonFiction(String title) {
		super(title);
	}
	@Override
	public void setPrice() {
		this.price=35.99;
	}
}

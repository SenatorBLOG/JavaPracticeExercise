package ch5ex1;

public class Sandwich {

	private String ingredient = "tuna";
	private String breadType = "Wheat";
	private double price = 4.99;

	public Sandwich(String pat, String bread, double pr ) {
		ingredient = pat;
		breadType = bread;
		price = pr;
		
	}
	public Sandwich() {
		this("ham","wheat",4.99);
	}
	
	public void setIng(String in) {
		ingredient = in;
	}
	public String getInt(){
		return ingredient;
	}
	
	
	@Override
	public String toString() {
		String prnt = "The " + ingredient + " sandwich, with a " + breadType
				+ " bread for " + price + "$";
		return prnt;
	}
	

}
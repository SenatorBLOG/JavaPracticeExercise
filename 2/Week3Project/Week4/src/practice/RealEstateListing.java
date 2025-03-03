package practice;

public class RealEstateListing {
	private String listingId;
	private double price;
	private HouseData hd;
	
	public RealEstateListing(String listingId, double price, int sqft, String address) {
		this.listingId = listingId;
		this.price = price;
		hd = new HouseData(sqft,address);
	}
	public String getAddress() {
		return hd.address;
	}
	public void display() {
		System.out.println(listingId + " " + price + 
				"  " + hd.sqft + "  " + hd.address);
	}
	private class HouseData {
		private  int sqft;
		private String address;

		public HouseData(int sqft, String address) {
			this.sqft = sqft;
			this.address = address;
		}
		
		
	}
}

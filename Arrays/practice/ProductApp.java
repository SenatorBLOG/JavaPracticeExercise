package practice;
import java.util.Scanner;



public class ProductApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product prod1 = new Product(1,"Tomato", 12.44, 5);
		Product prod2 = new Product(2, "Banana", 18.17, 20);
		Product prod3 = new Product(3, "Cebolla", 4.77, 3);
		
		displayProductList(prod1);
		displayProductList(prod2);
		displayProductList(prod3);
		
		createProductObject();
	}
		
		public static Product createProductObject() {
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.println("Enter a product ID.");
	        int id = scanner.nextInt();
	        scanner.nextLine(); // Очистка буфера
	        
	        System.out.println("Enter a product name.");
	        String str = scanner.nextLine();
	        
	        System.out.println("Enter a product price.");
	        double pr = scanner.nextDouble();
	        
	        System.out.println("Enter a product quantity.");
	        int qa = scanner.nextInt();
	        
	        return new Product (id, str, pr, qa);
	        
	}
		
		public static void displayProductList(Product prod) {
			System.out.println(prod);
	}
		
	

}

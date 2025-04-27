package Book;
import java.util.Scanner;


public class BookArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Book[] books = new Book[10];  // Array to hold 10 books
        
        System.out.println("Enter details for 10 books:");
        System.out.println("--------------------------");
        
        // Create 10 books (prompt for each)
        for (int i = 0; i < books.length; i++) {
            System.out.println("\nBook #" + (i + 1));
            
            // Get title
            System.out.print("Enter title: ");
            String title = input.nextLine();
            
            // Get book type (F/N) with validation
            String type;
            do {
                System.out.print("Is this (F)iction or (N)on-fiction? ");
                type = input.nextLine().toUpperCase();
            } while (!type.equals("F") && !type.equals("N"));
            
            // Create appropriate book type
            if (type.equals("F")) {
                books[i] = new Fiction(title);
            } else {
                books[i] = new NonFiction(title);
            }
            books[i].setPrice();  // Set the price
        }
        
        // Display all books
        System.out.println("\nBook Catalog:");
        System.out.println("------------");
        for (int i = 0; i < books.length; i++) {
            System.out.println("\nBook #" + (i + 1));
            System.out.println("Title: " + books[i].getTitle());
            System.out.println("Type: " + 
                (books[i] instanceof Fiction ? "Fiction" : "Non-Fiction"));
            System.out.println("Price: $" + books[i].getPrice());
        }
        
        input.close();
    }
}
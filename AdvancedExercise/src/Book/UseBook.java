package Book;

import java.util.Scanner;

public class UseBook {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Book Creation System");
        System.out.println("--------------------");
        
        // Create Fiction Book
        System.out.println("\nCreating a Fiction Book:");
        System.out.print("Enter title: ");
        String fictionTitle = input.nextLine();
        Fiction fictionBook = new Fiction(fictionTitle);
        fictionBook.setPrice();  // Sets the fiction book price
        
        // Create NonFiction Book
        System.out.println("\nCreating a Non-Fiction Book:");
        System.out.print("Enter title: ");
        String nonFictionTitle = input.nextLine();
        NonFiction nonFictionBook = new NonFiction(nonFictionTitle);
        nonFictionBook.setPrice();  // Sets the non-fiction book price
        
        // Display both books
        System.out.println("\nBook Details:");
        System.out.println("------------");
        displayBookInfo(fictionBook);
        displayBookInfo(nonFictionBook);
        
        input.close();
    }
    
    public static void displayBookInfo(Book book) {
        System.out.println("\nTitle: " + book.getTitle());
        System.out.println("Type: " + book.getClass().getSimpleName());
        System.out.println("Price: $" + book.getPrice());
    }
}

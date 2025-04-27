package Poem;

import java.util.Scanner;

public class DemoPoems {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice;
        String title;
        Poem poem = null;

        // Display menu and get valid choice
        do {
            System.out.println("Select poem type:");
            System.out.println("1 - Couplet (2 lines)");
            System.out.println("2 - Limerick (5 lines)");
            System.out.println("3 - Haiku (3 lines)");
            System.out.println("4 - Custom Poem");
            System.out.print("Enter your choice (1-4): ");
            choice = input.nextInt();
            input.nextLine(); // Consume newline
            
            if (choice < 1 || choice > 4) {
                System.out.println("Invalid choice. Please try again.\n");
            }
        } while (choice < 1 || choice > 4);

        // Get poem title
        System.out.print("Enter poem title: ");
        title = input.nextLine();

        // Create appropriate poem type
        switch (choice) {
            case 1:
                poem = new Couplet(title);
                break;
            case 2:
                poem = new Limerick(title);
                break;
            case 3:
                poem = new Haiku(title);
                break;
            case 4:
                System.out.print("Enter number of lines: ");
                int lines = input.nextInt();
                poem = new Poem(title, lines);
                break;
        }

        // Display poem details
        System.out.println("\nPoem created:");
        System.out.println("Title: " + poem.getName());
        System.out.println("Lines: " + poem.getNumberOfLines());
        
        input.close();
    }
}

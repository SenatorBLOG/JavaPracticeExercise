package LibraryManagementSystem;

import java.time.LocalDate;
import java.util.Scanner;

/**
 * The main class that manages the library system.
 * Allows users to register, borrow books, return books, and view account details.
 */
public class LibrarySystem {
    private static Scanner scanner = new Scanner(System.in);

    /**
     * The main entry point of the library system.
     * It registers three library members and provides a menu for user interactions.
     *
     * @param args Command-line arguments (not used).
     */
    public static void main(String[] args) {
        // Register three members in the system
        System.out.println("Register first member.");
        LibraryAccount account1 = registerMember(null, null);

        System.out.println("\nRegister second member.");
        LibraryAccount account2 = registerMember(account1, null);

        System.out.println("\nRegister third member.");
        LibraryAccount account3 = registerMember(account1, account2);

        // Main loop for accessing the system
        while (true) {
            System.out.print("\nPlease enter your Membership ID to access your account: ");
            int id = scanner.nextInt();
            scanner.nextLine();

            // Find the corresponding account based on Membership ID
            LibraryAccount account = findAccount(id, account1, account2, account3);
            if (account == null) {
                System.out.println("Invalid ID. Please try again.");
                continue;
            }

            // Menu for user actions
            boolean exit = false;
            while (!exit) {
                System.out.println("\nMenu:");
                System.out.println("1. View Borrowed Books");
                System.out.println("2. Borrow a Book");
                System.out.println("3. Return a Book");
                System.out.println("4. View Membership Details");
                System.out.println("5. Exit");
                System.out.print("Choose an option: ");
                int choice = scanner.nextInt();
                scanner.nextLine();

                // Handle user selection
                switch (choice) {
                    case 1 -> account.display();
                    case 2 -> {
                        System.out.print("Enter book name to borrow: ");
                        String borrowBook = scanner.nextLine();
                        account.borrowBook(borrowBook);
                    }
                    case 3 -> {
                        System.out.print("Enter book name to return: ");
                        String returnBook = scanner.nextLine();
                        account.returnBook(returnBook);
                    }
                    case 4 -> account.getLibraryMember().display();
                    case 5 -> {
                        System.out.println("Thank you for using the library system. Happy reading!");
                        exit = true;
                    }
                    default -> System.out.println("Invalid choice. Try again.");
                }
            }
        }
    }

    /**
     * Registers a new library member by collecting user input.
     * Ensures that the Membership ID is unique and within the valid range.
     *
     * @param acc1 The first registered account (used for ID validation).
     * @param acc2 The second registered account (used for ID validation).
     * @return A new {@link LibraryAccount} instance with user-provided details.
     */
    private static LibraryAccount registerMember(LibraryAccount acc1, LibraryAccount acc2) {
        System.out.print("Enter Full Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Home Address: ");
        String address = scanner.nextLine();

        int id;
        while (true) {
            System.out.print("Enter Membership ID (1000-9999): ");
            id = scanner.nextInt();
            scanner.nextLine();

            if (id < 1000 || id > 9999) {
                System.out.println("Invalid ID. Must be between 1000 and 9999.");
                continue;
            }
            // Check if the entered ID is already taken
            if ((acc1 != null && acc1.getLibraryMember().getValue() == id) || 
                (acc2 != null && acc2.getLibraryMember().getValue() == id)) {
                System.out.println("This ID is already taken. Please enter a different ID.");
                continue;
            }
            break;
        }

        // Create a new member and associated library account
        MemberInfo memberInfo = new MemberInfo(name, address);
        LibraryMember member = new LibraryMember(id, memberInfo, LocalDate.now());
        return new LibraryAccount(id, member);
    }

    /**
     * Finds a library account based on the given Membership ID.
     *
     * @param id The Membership ID entered by the user.
     * @param acc1 The first registered account.
     * @param acc2 The second registered account.
     * @param acc3 The third registered account.
     * @return The {@link LibraryAccount} corresponding to the given ID, or {@code null} if not found.
     */
    private static LibraryAccount findAccount(int id, LibraryAccount acc1, LibraryAccount acc2, LibraryAccount acc3) {
        if (acc1.getLibraryMember().getValue() == id) {  
            return acc1;  
        } 
        if (acc2.getLibraryMember().getValue() == id) {  
            return acc2;  
        }
        if (acc3.getLibraryMember().getValue() == id) {  
            return acc3; 
        }
        return null; 
    }
}

package LibraryManagementSystem;

/**
 * Represents a library account associated with a library member.
 */
public class LibraryAccount {
    private int accountId; // Unique account ID
    private LibraryMember libraryMember; // Library member associated with the account
    private String currentBook; // The book currently borrowed (if any)

    /**
     * Constructs a LibraryAccount with a given member.
     * @param accountId The unique ID of the account.
     * @param libraryMember The library member associated with this account.
     */
    public LibraryAccount(int accountId, LibraryMember libraryMember) {
        this.accountId = accountId;
        this.libraryMember = libraryMember;
    }

    public int getAccountId() {
        return accountId;
    }
    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }
    public LibraryMember getLibraryMember() {
        return libraryMember;
    }
    public void setLibraryMember(LibraryMember libraryMember) {
        this.libraryMember = libraryMember;
    }

    /**
     * Allows the user to borrow a book if they have not already borrowed one.
     * @param bookName The name of the book to borrow.
     */
    public void borrowBook(String bookName) {
        if (currentBook == null) {
            currentBook = bookName;
            System.out.println("You borrowed " + bookName + " successfully.");
        } else {
            System.out.println("You have to return your previous book first.");
        }
    }

    /**
     * Allows the user to return a borrowed book.
     * @param bookName The name of the book to return.
     */
    public void returnBook(String bookName) {
        if (currentBook == null) {  
            System.out.println("You have to borrow a book first.");  
        } else if (!currentBook.equals(bookName)) {  
            System.out.println("You have borrowed a different book: " + currentBook + ". Please return it first.");  
        } else {  
            currentBook = null;  
            System.out.println("You returned " + bookName + " successfully.");  
        }  
    }

    /**
     * Displays account details, including the borrowed book.
     */
    public void display() {
        if (currentBook != null) {
            System.out.println("Borrowed Book: " + currentBook);
        } else {
            System.out.println("\nNo book currently borrowed.");
        }
    }
}

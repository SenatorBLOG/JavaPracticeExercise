package ch8ex9;

import java.util.Scanner;

public class PurchaseArray {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Purchase[] purchases = new Purchase[2];

        for (int i = 0; i < 2; i++) {
            int invoice;
            do {
                System.out.print("Enter an invoice number for purchase " + (i + 1) + " (1000 to 8000): ");
                invoice = scanner.nextInt();
                scanner.nextLine(); // Consume newline

                if (invoice < 1000 || invoice > 8000) {
                    System.out.println("Error. The number must be between 1000 and 8000.");
                }
            } while (invoice < 1000 || invoice > 8000);

            double amount;
            do {
                System.out.print("Enter a sale amount for purchase " + (i + 1) + ": ");
                amount = scanner.nextDouble();

                if (amount < 0) {
                    System.out.println("Error. The sale amount cannot be negative.");
                }
            } while (amount < 0);

            purchases[i] = new Purchase();
            purchases[i].setInvoice(invoice);
            purchases[i].setAmount(amount);
        }

        System.out.println("\n--- Purchase Details ---");
        for (Purchase p : purchases) {
            p.display();
        }

        scanner.close();
    }
}

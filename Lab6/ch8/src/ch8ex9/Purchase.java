package ch8ex9;

public class Purchase {
    private int invoice;
    private double amount;
    private double salesTax;  // Store tax separately
    private static final double TAX_RATE = 0.05; // 5% tax rate

    public void setInvoice(int invoice) {
        this.invoice = invoice;
    }

    public void setAmount(double amount) {
        if (amount < 0) {
            System.out.println("Error: Sale amount cannot be negative.");
            return;
        }
        this.amount = amount;
        this.salesTax = amount * TAX_RATE; // Calculate 5% tax separately
    }

    public void display() {
        System.out.printf("The invoice number is %d. Sale amount: $%.2f, Sales tax: $%.2f, Total: $%.2f%n", 
                          invoice, amount, salesTax, amount + salesTax);
    }
}

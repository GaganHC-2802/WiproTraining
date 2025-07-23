package day_3;

public abstract class Payment {
    protected double amount;

    public Payment(double amount) {
        this.amount = amount;
    }

    public void printReceipt() {
        System.out.println("Payment of ₹" + amount + " processed.");
    }

    public abstract void makePayment();  // abstract method
}

public class CreditCardPayment extends Payment {
    public CreditCardPayment(double amount) {
        super(amount);
    }

    @Override
    public void makePayment() {
        System.out.println("Processing Credit Card Payment...");
        printReceipt();
    }
}

public class UpiPayment extends Payment {
    public UpiPayment(double amount) {
        super(amount);
    }

    @Override
    public void makePayment() {
        System.out.println("Processing UPI Payment...");
        printReceipt();
    }
}

public interface BillGenerator {
    void generate(double amount);

    // Default method
    default void showBillFormat() {
        System.out.println("***** BILL RECEIPT *****");
    }

    // Static method
    static void displayHeader() {
        System.out.println("Welcome to Online Billing System");
    }
}

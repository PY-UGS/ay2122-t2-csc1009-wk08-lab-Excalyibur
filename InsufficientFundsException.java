import java.io.*;

public class InsufficientFundsException extends Exception {
    private double amount;
    public InsufficientFundsException(double amount) {
        this.amount = amount;
        System.out.println("Sorry but your account is short by "+amount);
    }
    public double getAmount() { return amount; }
}
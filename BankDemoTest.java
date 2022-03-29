import java.util.Scanner;

public class BankDemoTest {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        CheckingAccount check = new CheckingAccount();
        System.out.println("Enter a deposit amount:");
        double depositamt = S.nextDouble();
        check.deposit(depositamt);
        System.out.println("Your balance after deposit is $"+check.getBalance());

        System.out.println("Enter a withdrawal amount:");
        try{
            double withdrawamt=S.nextDouble();
            check.withdraw(withdrawamt);
            System.out.println("Amount after withdrawal is: $"+check.getBalance());
        }
        catch (InsufficientFundsException e){
        }

    }
}

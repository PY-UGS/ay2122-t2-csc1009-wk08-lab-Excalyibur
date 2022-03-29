public class CheckingAccount {
    private double Balance;
    private int AccNumber;
//    private double transferamt;

    public CheckingAccount() {
        Balance=1000;
        AccNumber=12345;
    }
    public double deposit(double depositamt){
        Balance=Balance+depositamt;
        return Balance;
    }

    public double withdraw(double withdrawamt) throws InsufficientFundsException{
        if(withdrawamt>Balance) throw new InsufficientFundsException(withdrawamt-Balance);
        Balance=Balance-withdrawamt;
        return Balance;
    }

    public double getBalance() {
        return Balance;
    }

    public int getAccNumber() {
        return AccNumber;
    }
}

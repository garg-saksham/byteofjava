package module.exception;

public class BankAccount {
    private double balance;

    BankAccount(double amount){
        this.balance = amount;
    }
    public void withdraw(double amount) throws InsufficientFundsException{
        if(amount>balance){
            throw new InsufficientFundsException(amount);
        }
        balance -= amount;
    }
}

package module.exception;

public class InsufficientFundsException extends Exception {
    private double amount ;
    InsufficientFundsException(double amount){
        super("what do you want! you don;t have money");
        this.amount = amount;
    }
    public double getAmount(){
        return amount ;
    }
}

package module.exception;

public class Customer {
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount(100);
        try{
            acc1.withdraw(110);
        }catch(InsufficientFundsException e){
           System.out.println(e);
           e.getAmount();
        }
    }
}

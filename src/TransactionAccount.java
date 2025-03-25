public class TransactionAccount extends BankAccount{
    private final double overDraftLimit = 500;

    public TransactionAccount(String accountNumber, String accountHolderName, double balance) {
        super(accountNumber, accountHolderName, balance);
    }

    @Override
    public void calculateInterest() {
        System.out.println("No interest for this account!");
    }

    @Override
    public void withdraw(double amount) {
        if(amount < 0){
            System.out.println("the amount should be positive!");
        }
        else if(amount > balance + overDraftLimit){
            System.out.println("this amount is not available in your balance!");
        }
        else{
            balance -= amount;
            System.out.println(amount + " has been withdrew of " + getAccountNumber());
        }
    }
}

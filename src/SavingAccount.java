public class SavingAccount extends BankAccount{
    private final double interestRate = 3;

    public SavingAccount(String accountNumber, String accountHolderName, double balance) {
        super(accountNumber, accountHolderName, balance);
    }

    @Override
    public void calculateInterest() {
        deposit(balance * interestRate);
    }
}



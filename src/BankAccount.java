abstract class BankAccount {
    final private String accountNumber;
    private String accountHolderName;
    protected double balance;

    public BankAccount(String accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    public abstract void calculateInterest();

    public void deposit(double amount) {
        if(amount < 0){
            System.out.println("the amount should be positive!");
        }
        else{
            balance += amount;
            System.out.println(amount + " has been added to " + accountNumber);
        }
    }

    public void withdraw(double amount) {
        if(amount < 0){
            System.out.println("the amount should be positive!");
        }
        else if(amount > balance){
            System.out.println("this amount is not available in your balance!");
        }
        else{
            balance -= amount;
            System.out.println(amount + " has been withdrew of " + accountNumber);
        }
    }

    public double getBalance() {
        return this.balance;
    }

    public String getAccountNumber() {
        return this.accountNumber;
    }

    public String getAccountHolderName() {
        return this.accountHolderName;
    }
}

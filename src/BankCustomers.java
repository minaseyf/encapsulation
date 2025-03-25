import java.util.ArrayList;

public class BankCustomers {
    private ArrayList<BankAccount> accountsList = new ArrayList<>();

    public void addAccount(BankAccount account) {
        accountsList.add(account);
    }

    public void showAllBalances() {
        for(BankAccount bankAccount : accountsList){
            System.out.println("accountHolderName: " + bankAccount.getAccountHolderName() + " ,accountNumber: " + bankAccount.getAccountNumber() + " ,balance: " + bankAccount.getBalance());
        }
    }

    public BankAccount findAccount(String accountNumber) {
        for(BankAccount bankAccount : accountsList){
            if(bankAccount.getAccountNumber() == accountNumber){
                System.out.println("accountHolderName: " + bankAccount.getAccountHolderName() + " ,accountNumber: " + bankAccount.getAccountNumber() + " ,balance: " + bankAccount.getBalance());
                return bankAccount;
            }
        }
        System.out.println("there is no such account!");
        return null;
    }
}

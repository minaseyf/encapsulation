public class Main {
    public static void main(String[] args) {
        BankCustomers bankCustomer = new BankCustomers();

        TransactionAccount Taccount1 = new TransactionAccount("123", "mina", 100);
        TransactionAccount Taccount2 = new TransactionAccount("456", "neda", 200);
        TransactionAccount Taccount3 = new TransactionAccount("789", "maryam", 300);

        SavingAccount Saccount1 = new SavingAccount("111", "kiana", 150);
        SavingAccount Saccount2 = new SavingAccount("222", "mahdi", 250);
        SavingAccount Saccount3 = new SavingAccount("333", "hossein", 350);

        bankCustomer.addAccount(Taccount1);
        bankCustomer.addAccount(Taccount2);
        bankCustomer.addAccount(Taccount3);
        bankCustomer.addAccount(Saccount1);
        bankCustomer.addAccount(Saccount2);
        bankCustomer.addAccount(Saccount3);

        bankCustomer.findAccount("456");
        bankCustomer.findAccount("000");

        System.out.println(Saccount1.getAccountHolderName() + "'s balance: " + Saccount1.getBalance());
        Saccount1.deposit(300);
        System.out.println(Saccount1.getAccountHolderName() + "'s balance: " + Saccount1.getBalance());

        Taccount2.deposit(-200);

        Taccount1.calculateInterest();
        Saccount2.calculateInterest();
        System.out.println(Taccount1.getAccountHolderName() + "'s balance: " + Taccount1.getBalance());
        System.out.println(Saccount2.getAccountHolderName() + "'s balance: " + Saccount2.getBalance());

        Taccount1.withdraw(20);
        Taccount2.withdraw(800);
        Taccount3.withdraw(-20);
        Saccount1.withdraw(500);
        Saccount2.withdraw(-10);
        Saccount3.withdraw(50);

        bankCustomer.showAllBalances();
        }
    }
package Module3.t3_1;

public class BankAccount {
    int accountnumber= 1;
    int balance;
    private static int totalAccounts = 0;

    public BankAccount(int balance) {
        this.balance = balance;
        totalAccounts++;
        this.accountnumber = totalAccounts;
    }

    int getAccountNumber() {
        return this.accountnumber;
    }
    static int getTotalAccounts() {
        return totalAccounts;
    }
    int getBalance() {
        return this.balance;
    }
    void deposit(int amount) {
        this.balance += amount;
    }
    void withdraw(int amount) {
        this.balance -= amount;
    }

    public static void main(String[] args) {
        BankAccount account1 = new BankAccount(1000);
        BankAccount account2 = new BankAccount(2000);

        account1.deposit(500);
        account2.withdraw(800);

        System.out.println("Account " + account1.getAccountNumber() + " balance: " + account1.getBalance());
        System.out.println("Account " + account2.getAccountNumber() + " balance: " + account2.getBalance());

        System.out.println("Total number of accounts: " + BankAccount.getTotalAccounts());
    }
}


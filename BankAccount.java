//Create a BankAccount class with fields accountNumber, accountHolderName, and balance. Implement
//methods for deposit, withdrawal, and displaying account details. Ensure balance does not go negative.
public class BankAccount {
    int accountNumber;
    String accountHolderName;
    double balance;
    public BankAccount(int accountNumber, String accountHolderName, double initialBalance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = Math.max(initialBalance, 0);
    }
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else if (amount > balance) {
            System.out.println("Insufficient balance. Withdrawal failed.");
        } else {
            System.out.println("Withdrawal amount must be positive.");
        }
    }
    public void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Balance: " + balance);
        System.out.println("------------------------");
    }
    public static void main(String[] args) {
        BankAccount account = new BankAccount(101, "Alice", 1000.0);
        account.displayAccountDetails();
        account.deposit(500.0);
        account.displayAccountDetails();
        account.withdraw(300.0);
        account.displayAccountDetails();
        account.withdraw(1500.0);
        account.deposit(-200.0);
        account.withdraw(-100.0);
        account.displayAccountDetails();
    }
}

public class BankAccount {

    private double balance;
    private String accountNumber;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        System.out.println("Account Number: " + accountNumber + " Balance: " + balance + " has been created.");
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit: " + amount + " Balance: " + balance);
        } else {
            System.out.println("Deposit failed. Amount must be greater than 0.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            System.out.println("Withdraw: " + amount + " Balance: " + balance);
        } else {
            System.out.println("Withdraw failed. Amount must be greater than 0 and balance must be greater than or equal to amount.");
        }
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }
}

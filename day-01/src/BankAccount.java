public class BankAccount {
    private double balance;
    private String accountNum;

            public void withdraw(double amount) {
                if (amount > balance) {
                    throw new IllegalArgumentException("Insufficient funds");
                } else if (amount < 0) {
                    throw new IllegalArgumentException("Cannot withdraw a negative amount");
                } else {
                    balance -= amount;
                }
            }

            public void deposit(double amount) {
                if (amount < 0) {
                    throw new IllegalArgumentException("Cannot deposit a negative amount");
                } else {
                    balance += amount;
                }
            }

            public double getBalance() {
                return balance;
            }

            public void close() {
                balance = 0;
                System.out.println("Account closed");
            }
}

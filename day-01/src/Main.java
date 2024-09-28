public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.deposit(100);
        account.withdraw(50);
        System.out.println(account.getBalance());
    }
}

public class CMWife extends Thread {
    public BankAccount bankAccount;
    public String name;

    public CMWife(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
        this.name = super.currentThread().getName();
    }

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            bankAccount.deposit(100);
            bankAccount.withdraw(50);
            System.out.println("Balance: " + bankAccount.getBalance());
        }

        System.out.println( super.currentThread().getName());
        System.out.println(this.name);
    }
}

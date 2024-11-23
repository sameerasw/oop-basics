public class Main {
    public static void main(String[] args) {

        CMWife wife = new CMWife(new BankAccount("12345", 1000));

        wife.start(); // the execution of the run90 is handled by the JVM

    }
}
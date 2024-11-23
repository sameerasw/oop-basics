public class RunnableThread {
    public static void main(String[] args) {
        // Create the object PrintNameRunnable
        PrintNameRunnable printA = new PrintNameRunnable("A");
        PrintNameRunnable printB = new PrintNameRunnable("B");
        PrintNameRunnable printC = new PrintNameRunnable("C");

        // Create the Thread object
        Thread threadA = new Thread(printA);
        Thread threadB = new Thread(printB);
        Thread threadC = new Thread(printC);

        // start the thread
        threadA.start();
        threadB.start();
        threadC.start();
    }
}
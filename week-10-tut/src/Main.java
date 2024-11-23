public class Main {
    public static void main(String[] args) {
        // creating the objects
        PrintNameThread threadA = new PrintNameThread("Thread 1");
        PrintNameThread threadB = new PrintNameThread("Thread 2");
        PrintNameThread threadC = new PrintNameThread("Thread 3");

        // starting the threads
        threadA.start();
        threadB.start();
        threadC.start();

    }
}
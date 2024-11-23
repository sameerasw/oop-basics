public class PrintNameRunnable implements Runnable{
    //intsnace variable
    String nameThread;

    //constructor
    public PrintNameRunnable(String nameThread){
        this.nameThread = nameThread;
    }

    //run method
    public void run(){
    //print 10 times the name
        for(int i = 0; i < 10; i++){
            System.out.println("Thread name: " + nameThread);
        }
    }
}
public class PrintNameThread extends Thread{
    // constructor
    PrintNameThread(String threadName){
        super (threadName);
    }
    // run method
    public void run(){
//print 10 times the name
        for(int i = 0; i < 10; i++){
            System.out.println("Thread name: " + this.getName());
        }
    }
}
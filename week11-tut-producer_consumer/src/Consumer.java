public class Consumer extends Thread {
    private MessageQueue messageQueue = null;
    private String name;

    public Consumer(MessageQueue messageQueue, String name) {
        this.messageQueue = messageQueue;
        this.name = name;
    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            String message = messageQueue.pull();
            System.out.println(name + " consumed: " + message);
        }
    }


}

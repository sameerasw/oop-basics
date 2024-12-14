public class Producer extends Thread {
    private MessageQueue messageQueue = null;
    private int messageCount;

    public Producer(MessageQueue messageQueue, int messageCount) {
        this.messageQueue = messageQueue;
        this.messageCount = messageCount;
    }

    public void run() {
        for (int i = 0; i < messageCount; i++) {
            String message = "message" + i;
            messageQueue.push(message);
            System.out.println("Produced: " + message);
        }
    }

}


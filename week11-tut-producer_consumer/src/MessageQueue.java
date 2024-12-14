import java.util.ArrayList;
import java.util.List;

public class MessageQueue {
    private int bufferSize;
    private List<String> messages = new ArrayList<String>();

    public MessageQueue(int bufferSize) {
        this.bufferSize = bufferSize;
    }

    public synchronized  boolean isFull() {
        return messages.size() == bufferSize;
    }

    public synchronized boolean isEmpty() {
        return messages.size() == 0;
    }

    public synchronized void push(String message) {
        while (isFull()) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Buffer is not full");
        messages.add(message);
        notifyAll();
    }

    public synchronized String pull() {
        while (isEmpty()) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Buffer is full");
        String message = messages.remove(0);
        notifyAll();
        return message;
    }
}

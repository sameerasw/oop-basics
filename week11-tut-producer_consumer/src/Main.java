public class Main {
    public static void main(String[] args) {
        MessageQueue messageQueue = new MessageQueue(5);
        Producer producer = new Producer(messageQueue, 10);
        Consumer consumer1 = new Consumer(messageQueue, "Consumer1");
        Consumer consumer2 = new Consumer(messageQueue, "Consumer2");
        producer.start();
        consumer1.start();
        consumer2.start();
    }
}
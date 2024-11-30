public class Person implements Runnable {
    private String name;
    private MailBox mailBox;

    public Person(String name, MailBox mailBox) {
        this.name = name;
        this.mailBox = mailBox;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return name;
    }

    public void getMail() {
        System.out.println(name + " is checking mail");
        synchronized (mailBox) {
            if (mailBox.isUnread()) {
                System.out.println(name + " found mail: " + mailBox.getMailMessage());
            } else {
                System.out.println(name + " did not find any mail");
            }
        }
    }

    @Override
    public void run() {
        System.out.println(name + " is running");
        while (true) {
            getMail();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void start() {
        Thread thread = new Thread(this);
        thread.start();
    }
}
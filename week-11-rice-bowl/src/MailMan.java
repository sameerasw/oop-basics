public class MailMan implements Runnable {
    private MailBox mailBox;
    private String name;

    public MailMan(String name, MailBox mailBox) {
        this.name = name;
        this.mailBox = mailBox;
    }

    @Override
    public void run() {
        System.out.println(name + " is running");
        while (true) {
            deliverMail();
            try {
                Thread.sleep(5000); // MailMan delivers mail every 2 seconds
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void deliverMail() {
        System.out.println(name + " is delivering mail");
        mailBox.addMailMessage(1); // Add a mail message to the mailbox
    }

    public void start() {
        Thread thread = new Thread(this);
        thread.start();
    }
}

public class MailBox {
    private int mail;
    private boolean isUnread;

    public MailBox() {
        this.isUnread = false;
        this.mail = 0;
    }

    public synchronized void addMailMessage(int mail) {
        while (isUnread) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            this.mail = mail;
            isUnread = true;
            notifyAll();
        }
    }

    public synchronized int getMailMessage() {
        while (!isUnread) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.isUnread = false;
        notifyAll();
        return mail;
    }

    public boolean isUnread() {
        return isUnread;
    }

    public void markAsRead() {
        isUnread = false;
    }
}

public class Main {
    public static void main(String[] args) {
        MailBox sharedMailBox = new MailBox();

        // create a mailman thread and start it
        MailMan mailMan = new MailMan("Mailman", sharedMailBox);
        mailMan.start();

        // create a person thread and start it
        Person person1 = new Person("Person 1", sharedMailBox);
        person1.start();
    }
}
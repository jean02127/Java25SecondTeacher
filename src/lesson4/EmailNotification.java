package lesson4;

public class EmailNotification extends Notification {

    public EmailNotification(String recipient) {
        super(recipient);
    }

    @Override
    public void send() {
        System.out.println("寄送Email給" + this.getRecipient());
    }
}
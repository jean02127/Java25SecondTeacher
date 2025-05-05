package lesson4;

public class SmsNotification extends Notification {
    
    public SmsNotification(String recipient) {
        super(recipient);
    }

    @Override
    public void send() {
        System.out.println("寄送簡訊給" + this.getRecipient());
    }
}
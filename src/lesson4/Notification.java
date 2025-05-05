package lesson4;

public abstract class Notification {
    private String recipient;

    public Notification(String recipient) {
        this.recipient = recipient;
    }

    // 抽象方法，子類別必須實作
    // 這裡的send()方法是抽象的，這意味著它沒有實作，子類別必須提供具體的實作
    public abstract void send();

    // 不抽象方法
    // 這裡的log()方法是具體的，這意味著它有實作，子類別可以選擇是否覆寫
    public void log() {
        System.out.println("已送出通知給:" + this.recipient);
    }

    public String getRecipient() {
        return this.recipient;
    }
}
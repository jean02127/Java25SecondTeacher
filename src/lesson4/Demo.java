package lesson4;

public class Demo {
    public static void main(String[] args) {
        /*
         * 介面(interface)的範例
         */
        Bird bird = new Bird();
        bird.fly();
        bird.circle();
        bird.eat();

        Dragon dragon = new Dragon();
        dragon.fly();
        dragon.circle();
        dragon.eat();

        System.out.println("=========================================");

        /*
         * 抽象(abstract)的範例
         */

        Notification email = new EmailNotification("aa@gmail.com");
        email.send();
        email.log();

        SmsNotification sms = new SmsNotification("cc@gmail.com");
        sms.send();
        sms.log();
    }
}
package ch03_04;

public class SmsNotification implements Notification{
    @Override
    public void send(String message) {
        System.out.println("[SLACK]" + message);
    }
}

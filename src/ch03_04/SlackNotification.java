package ch03_04;

public class SlackNotification implements Notification {
    @Override
    public void send(String message) {
        System.out.println("[SMS]" + message);
    }
}

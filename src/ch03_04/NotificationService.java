package ch03_04;

public class NotificationService {
    private final Notification notification;

    public NotificationService(Notification notification) {
        this.notification = notification;
    }

    public void notifyUser(String message) {
        System.out.println("알림 서비스 시작");
        notification.send(message);
        System.out.println("알림 서비스 종료");
    }

}

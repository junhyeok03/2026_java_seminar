package ch03_04;

public class Main {
    public static void main(String[] args) {
        NotificationService service1 = new NotificationService(
                new Notification() {
                    @Override
                    public void send(String message) {
                        System.out.println("[이메일]");
                    }
                }
        );
        service1.notifyUser("안녕");
        service1.notifyUser("안녕");
    }
}

// 생성자 -> 전략패턴
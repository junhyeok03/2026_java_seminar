package ch03_04;

public class Main {
    public static void main(String[] args) {

        Notification no = new EmailNotification();
        no.send("gjwnsgur20@gmail.com");

        Notification no1 = new SmsNotification();
        no.send("meassge");

        Notification no2 = new SlackNotification();
        no.send("slcal");
    }
}

// 생성자 -> 전략패턴
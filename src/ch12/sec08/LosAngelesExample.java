package ch12.sec08;

import java.util.Calendar;
import java.util.TimeZone;

public class LosAngelesExample {
    public static void main(String[] args) {
        // 로스앤젤레스 시간대 설정
        TimeZone timeZone = TimeZone.getTimeZone("America/Los_Angeles");
        Calendar now = Calendar.getInstance(timeZone);

        // 오전/오후 정보 추출
        int amPm = now.get(Calendar.AM_PM);
        String strAmPm = null;
        if(amPm == Calendar.AM) {
            strAmPm = "오전";
        } else {
            strAmPm = "오후";
        }

        // 시, 분, 초 추출
        int hour   = now.get(Calendar.HOUR);
        int minute = now.get(Calendar.MINUTE);
        int second = now.get(Calendar.SECOND);

        // 결과 출력
        System.out.print(strAmPm + " ");
        System.out.print(hour + "시 ");
        System.out.print(minute + "분 ");
        System.out.println(second + "초 ");
    }
}
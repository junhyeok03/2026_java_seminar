package ch12.sec08;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class DateTimeCompareExample {
    public static void main(String[] args) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy.MM.dd a HH:mm:ss");

        // 1. 시작일 설정 (2021년 1월 1일 0시 0분 0초)
        LocalDateTime startDateTime = LocalDateTime.of(2021, 1, 1, 0, 0, 0);
        System.out.println("시작일: " + startDateTime.format(dtf));

        // 2. 종료일 설정 (2021년 12월 31일 0시 0분 0초)
        LocalDateTime endDateTime = LocalDateTime.of(2021, 12, 31, 0, 0, 0);
        System.out.println("종료일: " + endDateTime.format(dtf));

        // 3. 날짜 비교
        if(startDateTime.isBefore(endDateTime)) {
            System.out.println("진행 중입니다.");
        } else if(startDateTime.isEqual(endDateTime)) {
            System.out.println("종료합니다.");
        } else if(startDateTime.isAfter(endDateTime)) {
            System.out.println("종료했습니다.");
        }

        // 4. 차이 계산 (남은 시간/일수 등)
        long remainYear  = startDateTime.until(endDateTime, ChronoUnit.YEARS);
        long remainMonth = startDateTime.until(endDateTime, ChronoUnit.MONTHS);
        long remainDay   = startDateTime.until(endDateTime, ChronoUnit.DAYS);

        System.out.println("남은 해: " + remainYear);
        System.out.println("남은 달: " + remainMonth);
        System.out.println("남은 일: " + remainDay);
    }
}
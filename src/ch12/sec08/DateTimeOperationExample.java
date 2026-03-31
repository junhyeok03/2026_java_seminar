package ch12.sec08;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeOperationExample {
    public static void main(String[] args) {
        // 1. 현재 날짜와 시간 구하기
        LocalDateTime now = LocalDateTime.now();

        // 2. 원하는 형식으로 포맷 설정 (오전/오후 포함)
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy.MM.dd a HH:mm:ss");
        System.out.println("현재 시간: " + now.format(dtf));

        // 3. 날짜 연산: 1년 더하기
        LocalDateTime result1 = now.plusYears(1);
        System.out.println("1년 덧셈: " + result1.format(dtf));

        // 4. 날짜 연산: 2개월 빼기
        LocalDateTime result2 = now.minusMonths(2);
        System.out.println("2월 뺄셈: " + result2.format(dtf));

        // 5. 날짜 연산: 7일 더하기
        LocalDateTime result3 = now.plusDays(7);
        System.out.println("7일 덧셈: " + result3.format(dtf));
    }
}
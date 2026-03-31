package ch12.sec08;

import java.util.TimeZone;

public class PrintTimeZoneID {
    public static void main(String[] args) {
        // 사용 가능한 모든 TimeZone ID를 문자열 배열로 가져옴
        String[] availableIDs = TimeZone.getAvailableIDs();

        // 향상된 for문을 사용해 모든 ID를 하나씩 출력
        for(String id : availableIDs) {
            System.out.println(id);
        }
    }
}
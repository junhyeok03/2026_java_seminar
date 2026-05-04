package ch17.sec08;

import java.util.Arrays;

public class LoopingExample {
    public static void main(String[] args) {
        int[] intArr = {1, 2, 3, 4, 5};

        // 1. peek만 작성한 경우 → 동작 안 함!
        Arrays.stream(intArr)
                .filter(a -> a % 2 == 0)
                .peek(n -> System.out.println(n));   // 최종 처리 없음 → 동작 안 함

        // 2. forEach로 최종 처리
        Arrays.stream(intArr)
                .filter(a -> a % 2 == 0)
                .forEach(n -> System.out.println(n));   // 최종 처리이므로 동작

        // 3. 중간 처리 메소드 peek()을 이용한 반복 처리
        int total = Arrays.stream(intArr)
                .filter(a -> a % 2 == 0)
                .peek(n -> System.out.println(n))   // 동작함 (뒤에 sum 있음)
                .sum();   // 최종 처리
        System.out.println("총합: " + total + "\n");
    }
}
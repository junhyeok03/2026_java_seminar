package ch17.sec10;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

public class OptionalExample {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();   // 빈 리스트

        // 예외 발생 케이스 (주석 처리)
        /*
        double avg = list.stream()
            .mapToInt(Integer::intValue)
            .average()
            .getAsDouble();   // NoSuchElementException!
        */

        // 방법 1: isPresent() 체크
        OptionalDouble optional = list.stream()
                .mapToInt(Integer::intValue)
                .average();
        if (optional.isPresent()) {
            System.out.println("방법1: " + optional.getAsDouble());
        } else {
            System.out.println("방법1: 0.0");
        }

        // 방법 2: orElse()로 기본값
        double avg = list.stream()
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0.0);
        System.out.println("방법2: " + avg);

        // 방법 3: ifPresent()로 있을 때만
        list.stream()
                .mapToInt(Integer::intValue)
                .average()
                .ifPresent(a -> System.out.println("방법3: " + a));
        // → 빈 리스트라 출력 안 됨
    }
}
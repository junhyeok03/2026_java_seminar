package ch12.sec09;

import java.text.DecimalFormat;

public class DecimalFormatExample {
    public static void main(String[] args) {
        double num = 1234567.89;

        DecimalFormat df;

        // 1. 정수 자리까지 표기 (세 자리마다 콤마 추가)
        df = new DecimalFormat("#,###");
        System.out.println(df.format(num)); // 출력: 1,234,568 (반올림됨)

        // 2. 무조건 소수 첫째 자리까지 표기
        df = new DecimalFormat("#,###.0");
        System.out.println(df.format(num)); // 출력: 1,234,567.9
    }
}
package ch12.sec09;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatExample {
    public static void main(String[] args) {
        Date now = new Date();

        // 1. 기본 연-월-일
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println(sdf.format(now));

        // 2. 한글 형식 연-월-일
        sdf = new SimpleDateFormat("yyyy년 MM월 dd일");
        System.out.println(sdf.format(now));

        // 3. 연.월.일 오전/오후 시:분:초 (가장 많이 쓰임)
        sdf = new SimpleDateFormat("yyyy.MM.dd a HH:mm:ss");
        System.out.println(sdf.format(now));

        // 4. 요일 표시 (E)
        sdf = new SimpleDateFormat("오늘은 E요일");
        System.out.println(sdf.format(now));

        // 5. 올해의 몇 번째 날인지 (D)
        sdf = new SimpleDateFormat("올해의 D번째 날");
        System.out.println(sdf.format(now));

        // 6. 이달의 몇 번째 날인지 (d)
        sdf = new SimpleDateFormat("이달의 d번째 날");
        System.out.println(sdf.format(now));
    }
}
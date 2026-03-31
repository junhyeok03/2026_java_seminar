package ch12.sec12;

public class Service {
    @PrintAnnotation // 기본값 적용 (value="-", number=15)
    public void method1() {
        System.out.println("실행 내용1");
    }

    @PrintAnnotation("*") // value="*" 적용 (number는 기본값 15)
    public void method2() {
        System.out.println("실행 내용2");
    }

    @PrintAnnotation(value="#", number=20) // value="#", number=20 적용
    public void method3() {
        System.out.println("실행 내용3");
    }
}
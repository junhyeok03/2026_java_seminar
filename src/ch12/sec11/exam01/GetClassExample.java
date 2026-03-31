package ch12.sec11.exam01;

public class GetClassExample {
    public static void main(String[] args) throws Exception {
        // how1: 클래스로부터 얻는 방법
        Class clazz = Car.class;

        /* // how2: 클래스 전체 이름(패키지 포함)으로 얻는 방법
        Class clazz = Class.forName("ch12.sec11.exam01.Car");

        // how3: 객체 인스턴스로부터 얻는 방법
        Car car = new Car();
        Class clazz = car.getClass();
        */

        // 결과 출력
        System.out.println("패키지: " + clazz.getPackage().getName());
        System.out.println("클래스 간단 이름: " + clazz.getSimpleName());
        System.out.println("클래스 전체 이름: " + clazz.getName());
    }
}
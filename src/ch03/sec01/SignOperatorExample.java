package ch03.sec01;

public class SignOperatorExample {
    public static void main(String[] args) {
        int x = 1;
        int y = 1;
        int result1 = ++x + 10; // x를 1 증가 int result1 = 2 + 10;
        int result2 = y++ + 10; // int result2 = 1 + 10; y를 1 증가

        System.out.println(result1);
        System.out.println(result2);
    }
}

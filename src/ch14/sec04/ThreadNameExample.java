package ch14.sec04;

public class ThreadNameExample {
    public static void main(String[] args) {
        Thread mainThread = Thread.currentThread(); // 이 코드를 실행하는 스레드 객체 참조 얻기.
        System.out.println(mainThread.getName() + "실행");

        for(int i=0; i<3; i++) {
            Thread threadA = new Thread() {
              @Override
              public void run() {
                  System.out.println(getName() + "실행");
              }
            };
            threadA.start();
        }

        Thread charThread = new Thread() {
            @Override
            public void run() {
                System.out.println(getName() + "실행");
            }
        };
        charThread.setName("chat-thread");
        charThread.start(); // 작업 스레드 이름 변경
    }
}

package ch08.sec12;

import ch08.sec11.exam02.Vehicle;

public class Taxi implements Vehicle {
    @Override
    public void run() {
        System.out.println("택시가 달립니다.");
    }
}

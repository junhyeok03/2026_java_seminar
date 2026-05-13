package atomic;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

public class Peterson {

    static int count = 0;

    static AtomicInteger turn = new AtomicInteger(0);

    static AtomicBoolean[] flag;

    static {
        flag = new AtomicBoolean[2];
        flag[0] = new AtomicBoolean(false);
        flag[1] = new AtomicBoolean(false);
    }

    public static void main(String[] args) throws Exception {

        Thread t1 = new Thread(new Producer());
        Thread t2 = new Thread(new Consumer());

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("count = " + Peterson.count);
    }

    static class Producer implements Runnable {

        public void run() {

            for (int k = 0; k < 100000; k++) {

                /* entry section */
                flag[0].set(true);
                turn.set(1);

                while (flag[1].get() && turn.get() == 1) {
                    // busy waiting
                }

                /* critical section */
                count++;

                /* exit section */
                flag[0].set(false);

                /* remainder section */
            }
        }
    }

    static class Consumer implements Runnable {

        public void run() {

            for (int k = 0; k < 100000; k++) {

                /* entry section */
                flag[1].set(true);
                turn.set(0);

                while (flag[0].get() && turn.get() == 0) {
                    // busy waiting
                }

                /* critical section */
                count--;

                /* exit section */
                flag[1].set(false);

                /* remainder section */
            }
        }
    }
}
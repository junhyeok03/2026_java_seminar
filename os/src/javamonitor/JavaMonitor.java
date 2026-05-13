package javamonitor;

class Counter {
	private static Object object = new Object();
	
    public static int count = 0;
    public void increment() {
    	synchronized (this) {
    		count++;			
		}
    	//...
    }
}

class MyRunnable implements Runnable {
	private String name;
	private Counter counter;
	public MyRunnable(final String name, Counter counter) {
		this.name = name;
		this.counter = counter;
	}
    public void run() {
        for (int i = 0; i < 10000; i++) {
        	// System.out.println("run " + name);
            counter.increment();
        }
    }
}

public class JavaMonitor {
    public static void main(String[] args) throws Exception {
        Thread[] threads = new Thread[5];
        Counter counter = new Counter();
        for (int i = 0; i < threads.length; i++) {
            threads[i] = new Thread(new MyRunnable("thread-"+i, counter)); 
            threads[i].start();
        }
        for (int i = 0; i < threads.length; i++)
            threads[i].join();
        System.out.println("counter = " + Counter.count);
    }
}



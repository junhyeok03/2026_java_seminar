package count;

class CountOne implements Runnable {
	static int count = 0;

	@Override
	public void run() {
		for (int i = 0; i < 30000; i++)
			count++;
		// r = count
		// r ++
		// count = r
	}
}

public class RaceCondition_One {
	public static void main(String[] args) {
		try {
			CountOne run1 = new CountOne();
			CountOne run2 = new CountOne();
			Thread t1 = new Thread(run1);
			Thread t2 = new Thread(run2);
			t1.start();
			t2.start();
			t1.join();
			t2.join();
			System.out.println("Result: " + run1.count + ", " + run2.count);
		} catch (InterruptedException e) {

		}
	}
}

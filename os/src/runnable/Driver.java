package runnable;

public class Driver {
	public static void main(String[] args) {
		SumObject sumObject = new SumObject();
		int upper = 100;

		Thread worker = new Thread(new Summation(upper, sumObject));
		worker.start();
		try {
			worker.join();
		} catch (InterruptedException ignored) {
		}
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("The sum of " + upper + " is " + sumObject.get());
	}
}

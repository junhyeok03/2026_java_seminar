package runnable;

class Summation implements Runnable {
	private final int upper;
	private final SumObject sumValue;

	public Summation(final int upper, final SumObject sumValue) {
		if (upper < 0)
			throw new IllegalArgumentException();

		this.upper = upper;
		this.sumValue = sumValue;
	}

	public void run() {
		int sum = 0;

		for (int i = 0; i <= upper; i++) {
			try {
				Thread.sleep(0, 1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			sum += i;
		}
		sumValue.set(sum);
	}
}

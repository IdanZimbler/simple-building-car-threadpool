package assignment;

public class Chair extends CarPart implements Runnable {

	Car car;

	public Chair(Car car) {
		super("Chair");
		this.car = car;
	}

	@Override
	public void run() {
		System.out.println("Building: " + this.toString());
		try {
			Thread.sleep(7000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		car.setPart(this);
	}

}

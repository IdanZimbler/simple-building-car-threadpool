package assignment;

public class Wheel extends CarPart implements Runnable {

	Car car;

	public Wheel(Car car) {
		super("Wheel");
		this.car = car;
	}

	@Override
	public void run() {
		System.out.println("Building: " + this.toString());
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		car.setPart(this);
	}

}

package assignment;

import java.util.Stack;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {
	static Stack<CarPart> carParts = new Stack<CarPart>();
	final static int NUM_OF_WHEELS = 4;
	final static int NUM_OF_CHAIRS = 5;

	public static void main(String[] args) throws InterruptedException {
		ExecutorService executorService = Executors.newFixedThreadPool(10);
		CarFactory carFactory = new CarFactory(executorService);
		Car car = new Car(carFactory, NUM_OF_WHEELS, NUM_OF_CHAIRS);
		executorService.shutdown();
		executorService.awaitTermination(10, TimeUnit.SECONDS);
		System.out.println(car);
	}
}

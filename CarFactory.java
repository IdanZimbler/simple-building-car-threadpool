package assignment;

import java.util.concurrent.ExecutorService;

public class CarFactory {
	ExecutorService executorService;

	public CarFactory(ExecutorService executorService) {
		this.executorService = executorService;
	}

	public void buildPart(String partName, Car car) {

		switch (partName) {
		case "Wheel":
			executorService.execute(new Wheel(car));
			break;
		case "Chair":
			executorService.execute(new Chair(car));
			break;
		}

	}

}

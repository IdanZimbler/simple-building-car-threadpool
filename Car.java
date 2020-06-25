package assignment;

import java.util.ArrayList;

public class Car {

	private ArrayList<Wheel> wheels;
	private ArrayList<Chair> chairs;
	CarFactory carFactory;

	public Car(CarFactory carFactory, int numOfWheels, int numOfChairs) throws InterruptedException {
		wheels = new ArrayList<Wheel>();
		chairs = new ArrayList<Chair>();
		this.carFactory = carFactory;
		buildCar(numOfWheels, numOfChairs);

	}

	public void buildCar(int numOfWheels, int numOfChairs) throws InterruptedException {
		createPart("Wheel", numOfWheels);
		createPart("Chair", numOfChairs);
	}

	public void createPart(String name, int numOfTimes) {
		for (int i = 0; i < numOfTimes; i++) {
			carFactory.buildPart(name, this);
		}
	}

	public void setPart(CarPart carPart) {
		System.out.println("Finished to build: " + carPart.toString() + " into Car");
		if (carPart instanceof Wheel) {
			this.wheels.add((Wheel) carPart);
		} else if (carPart instanceof Chair) {
			this.chairs.add((Chair) carPart);
		}

	}

	@Override
	public String toString() {
		return "My car has: \n" + wheels.toString() + "\n" + chairs.toString();
	}

}

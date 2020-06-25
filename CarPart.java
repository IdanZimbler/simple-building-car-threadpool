package assignment;

import java.text.SimpleDateFormat;
import java.util.Date;

public class CarPart {

	protected static int id = 0;

	protected Date dateCreated;
	protected String name;
	SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy-HH:mm:ss");

	public CarPart(String name) {
		incrementID();
		this.name = name + " #" + id;
		this.dateCreated = new Date();
	}
	
	private synchronized void incrementID() {
		id++;
	}

	@Override
	public String toString() {
		return this.name + " Created at: " + format.format(this.dateCreated);
	}

}

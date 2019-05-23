package models;

public class Car extends Wheeled {

	// attributes
	private int noDoors;

	// constructor
	public Car(String vehType, String vehName, boolean working, int peopleLift, int value, int noWheels, int noDoors) {
		super(vehType, vehName, working, peopleLift, value, noWheels);

		this.noDoors = noDoors;
	}

	// behaviours
	@Override
	public String toString() {
		return super.toString() + "/nNumber Doors = " + noDoors;
	}

	// getters and setters
	public int getNoDoors() {
		return noDoors;
	}

	public void setNoDoors(int noDoors) {
		this.noDoors = noDoors;
	}

}

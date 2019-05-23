package models;

public abstract class Wheeled extends Vehicle {

	// attributes
	private int noWheels;

	// constructor
	public Wheeled(String vehType, String vehName, boolean working, int peopleLift, int value, int noWheels) {
		super(vehType, vehName, working, peopleLift, value);

		this.noWheels = noWheels;
	}

	// behaviours (methods)
	public void revs() {
		System.out.println("The wheels spin.");
	}

	@Override
	public String toString() {
		return super.toString();
	}

	// getters and setters
	public int getNoWheels() {
		return noWheels;
	}

	public void setNoWheels(int noWheels) {
		this.noWheels = noWheels;
	}
}

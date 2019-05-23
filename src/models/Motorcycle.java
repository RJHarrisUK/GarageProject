package models;

public class Motorcycle extends Wheeled {

	// attributes
	private boolean sidecar;

	// constructor
	public Motorcycle(String vehType, String vehName, boolean working, int peopleLift, int value, int noWheels,
			boolean sidecar) {
		super(vehType, vehName, working, peopleLift, value, noWheels);

		this.sidecar = sidecar;
	}

	// behaviours
	@Override
	public String toString() {
		return super.toString() + "/nSide Car? = " + sidecar;
	}

	// getters and setters
	public boolean isSidecar() {
		return sidecar;
	}

	public void setSidecar(boolean sidecar) {
		this.sidecar = sidecar;
	}

}

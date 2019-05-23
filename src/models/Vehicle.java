package models;

public abstract class Vehicle {

	// attributes
	private String vehType;
	private String vehName;
	private boolean working;
	private int peopleLift;
	private int value;

	// constructor
	public Vehicle(String vehType, String vehName, boolean working, int peopleLift, int value) {
		this.vehType = vehType;
		this.vehName = vehName;
		this.working = working;
		this.peopleLift = peopleLift;
		this.value = value;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	// behaviours
	public void starts() {
		System.out.println("The engine starts.");
	}

	public String getName() {
		return vehName;
	}

	@Override
	public String toString() {
		return "Type = " + vehType + "/nName = " + vehName + "/Working? = " + working + "/nPassengers = " + peopleLift
				+ "/Value = " + value;
	}

	// getters and setters
	public void stops() {
		System.out.println("The engine stops.");
	}

	public String getVehType() {
		return vehType;
	}

	public void setVehType(String vehType) {
		this.vehType = vehType;
	}

	public String getVehName() {
		return vehName;
	}

	public void setVehName(String vehName) {
		this.vehName = vehName;
	}

	public boolean isWorking() {
		return working;
	}

	public void setWorking(boolean working) {
		this.working = working;
	}

	public int getPeopleLift() {
		return peopleLift;
	}

	public void setPeopleLift(int peopleLift) {
		this.peopleLift = peopleLift;
	}
}

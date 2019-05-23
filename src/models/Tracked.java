package models;

public class Tracked extends Vehicle {

	// attributes
	private int trackLinks;
	private boolean turret;

	// constructor
	public Tracked(String vehType, String vehName, boolean working, int peopleLift, int value, int trackLinks,
			boolean turret) {
		super(vehType, vehName, working, peopleLift, value);

		this.trackLinks = trackLinks;
		this.turret = turret;
	}

	// behaviours
	public void revs() {
		System.out.println("The tracks spin.");
	}

	@Override
	public String toString() {
		return super.toString() + "/nNumber Track Links = " + trackLinks + "/nTurret? = " + turret;
	}

	// getters and setters
	public int getTrackLinks() {
		return trackLinks;
	}

	public void setTrackLinks(int trackLinks) {
		this.trackLinks = trackLinks;
	}

	public boolean isTurret() {
		return turret;
	}

	public void setTurret(boolean turret) {
		this.turret = turret;
	}
}

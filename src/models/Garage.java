package models;

import java.util.ArrayList;

public class Garage {

	// constructor
	private ArrayList<Vehicle> garage = new ArrayList<Vehicle>();

	public void setGarage(ArrayList<Vehicle> garage) {
		this.garage = garage;
	}

	// behaviours
	public void searchVehNames(String vehName) {
		garage.stream().filter(Vehicle -> vehName.equals(Vehicle.getName())).forEach(System.out::println);
	}

	public ArrayList<Vehicle> getVehicles() {
		return garage;
	}

	public int getValues() {
		return garage.stream().mapToInt(x -> x.getValue()).sum();
	}

	public void getFeeByVehicle() {
		for (Vehicle v : garage) {
			if (v instanceof Car) {
				System.out.println("Fee for " + v.getVehName() + " is " + (v.getValue() / 90) + "\n" + v.getVehName()
						+ " Ready for collection? " + v.isWorking() + "\n");
			}
			if (v instanceof Motorcycle) {
				System.out.println("Fee for " + v.getVehName() + " is " + (v.getValue() / 95) + " \n" + v.getVehName()
						+ " Ready for collection? " + v.isWorking() + "\n");
			}
			if (v instanceof Tracked) {
				System.out.println("Fee for " + v.getVehName() + " is " + (v.getValue() / 50) + " \n" + v.getVehName()
						+ " Ready for collection? " + v.isWorking() + "\n");
			}
		}
	}

	public void getGarageState() {
		int numberVehicles = 0;
		int numberCars = 0;
		int numberMotorcycles = 0;
		int numberTracked = 0;

		for (Vehicle v : garage) {
			if (v instanceof Car) {
				numberVehicles++;
				numberCars++;
			}
			if (v instanceof Motorcycle) {
				numberVehicles++;
				numberMotorcycles++;
			}
			if (v instanceof Tracked) {
				numberVehicles++;
				numberTracked++;
			}
		}
		System.out.println("The garage currently holds " + numberVehicles + " vehicles");
		System.out.println(numberCars + " Cars");
		System.out.println(numberMotorcycles + " Motorcycles");
		System.out.println(numberTracked + " Tracked");
		System.out.println("The total value of vehicles in the garage is £" + getValues());
	}

	// getters and setters
	public ArrayList<Vehicle> getGarage() {
		return garage;
	}
}

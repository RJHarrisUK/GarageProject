package logic;

import models.Car;
import models.Garage;
import models.Motorcycle;
import models.Tracked;

public class Runner {

	public static void main(String[] args) {

		Car fiesta = new Car("Car", "Fiesta", true, 5, 5000, 4, 3);
		Car bentley = new Car("Car", "Bentley", false, 4, 80000, 4, 5);
		Car ferrari = new Car("Car", "Ferrari", true, 2, 200000, 4, 3);

		Motorcycle suzuki = new Motorcycle("Motorcycle", "Suzuki", true, 1, 10000, 2, false);
		Motorcycle mitsubishi = new Motorcycle("Motorcycle", "Mitsubishi", false, 1, 20000, 2, true);
		Motorcycle triumph = new Motorcycle("Motorcycle", "Triumph", true, 1, 30000, 2, true);

		Tracked scimitar = new Tracked("Tracked", "CVR(T) Scimitar", true, 4, 12000, 20, true);
		Tracked challenger = new Tracked("Tracked", "MBT Challenger-2", true, 4, 10000, 40, true);
		Tracked bulldog = new Tracked("Tracked", "AFV Bulldog", false, 3, 800000, 30, false);

		Garage garagemanager = new Garage();
		garagemanager.getGarage().add(fiesta);
		garagemanager.getGarage().add(bentley);
		garagemanager.getGarage().add(ferrari);

		garagemanager.getGarage().add(suzuki);
		garagemanager.getGarage().add(mitsubishi);
		garagemanager.getGarage().add(triumph);

		garagemanager.getGarage().add(scimitar);
		garagemanager.getGarage().add(challenger);
		garagemanager.getGarage().add(bulldog);

		fiesta.revs();
		scimitar.revs();
		System.out.println(garagemanager.getVehicles());
		System.out.println(garagemanager.getValues());
		garagemanager.getFeeByVehicle();
		garagemanager.getGarageState();

	}
}

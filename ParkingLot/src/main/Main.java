package main;

import domain.ParkingLot;
import domain.RandomGenerator;
import domain.Vehicle;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		ParkingLot parkingLot = new ParkingLot();
		int i = 0;
		while(true) {
			Vehicle vehicle = new Vehicle(RandomGenerator.randomBrand(),RandomGenerator.newPlate(),parkingLot);
			if(parkingLot.vehicleIn(vehicle)) {
				vehicle.start();
			}
			Thread.currentThread().sleep(1000);
			parkingLot.printParkingLot();
			System.out.println();
			i++;
			if(i==10) {
				System.out.println("Deleting");
				parkingLot.makeParkingLotEmpty();
				parkingLot.printParkingLot();
				i=0;
			}
		}
	
		

	}

}

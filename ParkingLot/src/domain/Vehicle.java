package domain;

import java.util.Random;

public class Vehicle extends Thread {
	private ParkingLot parkingLot;
	private String brand;
	private String licensePlate;
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getLicensePlate() {
		return licensePlate;
	}
	public void setLicensePlate(String licensePlate) {
		this.licensePlate = licensePlate;
	}
	public Vehicle(String brand, String licensePlate,ParkingLot parkingLot) {
		super();
		this.brand = brand;
		this.licensePlate = licensePlate;
		this.parkingLot = parkingLot;
	}
	
	@Override
	public void run() {
		Random ran = new Random();
		int randomSleep = ran.nextInt(6) *1000;
		System.out.println(getLicensePlate()+getBrand()+randomSleep);
		try {
			this.sleep(randomSleep);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		parkingLot.vehicleOut(this);
		
	}
	
	

}

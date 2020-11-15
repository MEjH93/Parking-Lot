package domain;

public class ParkingLot {
	private static final int parkingSpace = 10;
	private Vehicle[] vehicles = new Vehicle[parkingSpace];
	public Vehicle[] getVehicles() {
		return vehicles;
	}
	public void setVehicles(Vehicle[] vehicles) {
		this.vehicles = vehicles;
	}
	public static int getParkingspace() {
		return parkingSpace;
	}
	public ParkingLot() {
		// TODO Auto-generated constructor stub
	}
	public synchronized boolean vehicleIn(Vehicle vehicle) {
		for(int i = 0;i < vehicles.length;i++) {
			if(vehicles[i]==null) {
				vehicles[i]=vehicle;
				return true;  // can do break as well in this case
			}
		}
		return false;
	}
	public synchronized void vehicleOut(Vehicle vehicle) {
		for(int i = 0;i < vehicles.length;i++) {
			if(vehicles[i]==vehicle) {
				vehicles[i]=null;
					
			}
		}
		
		
	}
	public synchronized void printParkingLot() {
		for(int j = 0;j < 4;j++) {
			for(int i =0;i < vehicles.length/3;i++) {
				if(j*3+i>=vehicles.length) return;
				if(vehicles[j*3+i]!=null) {
					System.out.print(vehicles[j*3+i].getLicensePlate()+"/"+vehicles[j*3+i].getBrand()+" ");
				}else {
					System.out.print("ParkingSpaceFree ");
					
				}
			}
			System.out.println();
		}
		System.out.println();
	}
	public synchronized void makeParkingLotEmpty() {
		vehicles = new Vehicle[parkingSpace];
	}

	
	
}

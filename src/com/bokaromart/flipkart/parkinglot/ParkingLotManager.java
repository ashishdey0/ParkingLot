package com.bokaromart.flipkart.parkinglot;

import java.util.HashMap;

public class ParkingLotManager {
	HashMap<String, ParkingLot> parkingLots;

	public ParkingLotManager() {
		parkingLots = new HashMap<String, ParkingLot>();
	}

	public void addParkingLot(String type, ParkingLot parkingLot) {
		parkingLots.put(type, parkingLot);
	}

	public ParkingLot getParkingLot(String type) {
		return parkingLots.get(type);
	}

}

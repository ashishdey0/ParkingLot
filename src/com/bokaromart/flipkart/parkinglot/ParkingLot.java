package com.bokaromart.flipkart.parkinglot;

import java.util.HashMap;

import com.bokaromart.flipkart.parkingslots.ParkingSlot;

public abstract class ParkingLot {
	public HashMap<String, ParkingSlot> parkingSlots = new HashMap<String, ParkingSlot>();
	public String name;

	public void addParkingSlot(String slotType, ParkingSlot parkingSlot) {
		parkingSlots.put(slotType, parkingSlot);
	}

	public ParkingSlot getParkingSlot(String type) {
		return parkingSlots.get(type);
	}

	public void printParkingLot() {
		for (String key : parkingSlots.keySet()) {
			parkingSlots.get(key).printSlot();
		}
	}
}

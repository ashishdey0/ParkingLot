package com.bokaromart.flipkart.parkingslots;

import com.bokaromart.flipkart.slotselector.ParkingLotSelector;

public class BikeSlot extends ParkingSlot {
	public static final String TYPE = "BIKE";

	public BikeSlot(ParkingLotSelector parkingLotSelector) {
		this.parkingLotSelector = parkingLotSelector;
		this.type = TYPE;
	}

	public void printSlot() {
		System.out.println("SlotType : Bike, Count : " + maxSlot);
	}
}

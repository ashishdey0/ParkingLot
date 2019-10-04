package com.bokaromart.flipkart.parkingslots;

import com.bokaromart.flipkart.slotselector.ParkingLotSelector;

public class CarSlot extends ParkingSlot {
	public static final String TYPE = "CAR";

	public CarSlot(ParkingLotSelector parkingLotSelector) {
		this.parkingLotSelector = parkingLotSelector;
		this.type = TYPE;
	}

	public void printSlot() {
		System.out.println("SlotType : Car, Count : " + maxSlot);
	}
}

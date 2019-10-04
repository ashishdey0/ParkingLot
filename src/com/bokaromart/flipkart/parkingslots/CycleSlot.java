package com.bokaromart.flipkart.parkingslots;

import com.bokaromart.flipkart.slotselector.ParkingLotSelector;

public class CycleSlot extends ParkingSlot {
	public static final String TYPE = "CYCLE";

	public CycleSlot(ParkingLotSelector parkingLotSelector) {
		this.parkingLotSelector = parkingLotSelector;
		this.type = TYPE;
	}

	public void printSlot() {
		System.out.println("SlotType : Cycle, Count : " + maxSlot);
	}
}

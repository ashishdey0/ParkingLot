package com.bokaromart.flipkart.parkingslots;

import com.bokaromart.flipkart.slotselector.ParkingLotSelector;

public abstract class ParkingSlot {
	ParkingLotSelector parkingLotSelector = null;
	public String type = null;

	// Configure using the setter method given. Default is 1.
	public int maxSlot = 1;

	public abstract void printSlot();

	public synchronized boolean getParking() {
		if (parkingLotSelector.canParkVehicle(this.maxSlot)) {
			System.out.println("Parked " + this.type + " Success");
			maxSlot--;
			return true;
		}

		System.out.println("Parked " + this.type + " Failed");
		return false;
	}

	public void leaveParking() {
		maxSlot++;
	}

	public void setMaxSlots(int maxSlots) {
		this.maxSlot = maxSlots;
	}

	public boolean isAvailable() {
		if (parkingLotSelector.canParkVehicle(this.maxSlot)) {
			return true;
		}

		return false;
	}
}

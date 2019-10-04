package com.bokaromart.flipkart.slotselector;

import java.util.ArrayList;

public abstract class ParkingLotSelector {
	ArrayList<String> selectedSlots = null;

	public synchronized boolean canParkVehicle(int maxSlots) {
		if (checkAvailable(maxSlots)) {
			return true;
		}

		return false;
	}

	public abstract boolean checkAvailable(int maxSlots);
}

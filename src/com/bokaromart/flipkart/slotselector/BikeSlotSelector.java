package com.bokaromart.flipkart.slotselector;

import java.util.ArrayList;

public class BikeSlotSelector extends ParkingLotSelector {
	ArrayList<String> selectedSlots;

	public BikeSlotSelector() {
		selectedSlots = new ArrayList<String>();
	}

	@Override
	public boolean checkAvailable(int maxSlots) {
		if (maxSlots > 0) {
			return true;
		}

		return false;
	}
}

package com.bokaromart.flipkart.slotselector;

import java.util.ArrayList;

public class CarSlotSelector extends ParkingLotSelector {

	public CarSlotSelector() {
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

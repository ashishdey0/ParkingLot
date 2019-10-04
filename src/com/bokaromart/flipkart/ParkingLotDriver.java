package com.bokaromart.flipkart;

import com.bokaromart.flipkart.parkinglot.ParkingLot;
import com.bokaromart.flipkart.parkinglot.ParkingLotManager;
import com.bokaromart.flipkart.parkinglot.VechicleParkingLot;
import com.bokaromart.flipkart.parkingslots.BikeSlot;
import com.bokaromart.flipkart.parkingslots.CarSlot;
import com.bokaromart.flipkart.parkingslots.CycleSlot;
import com.bokaromart.flipkart.parkingslots.ParkingSlot;
import com.bokaromart.flipkart.slotselector.CarSlotSelector;
import com.bokaromart.flipkart.slotselector.ParkingLotSelector;

public class ParkingLotDriver {

	public static void main(String[] args) {	
		ParkingLotManager parkingLotManager = new ParkingLotManager();
		ParkingLot parkingLot = createVechileParkingLot("PVR Koramangala");
		parkingLotManager.addParkingLot("VEHICLE", parkingLot);

		ParkingLotSelector carParkingSelector = new CarSlotSelector();
		ParkingSlot carSlot = createCarParkingSlot(carParkingSelector);
		parkingLot.addParkingSlot("CAR", carSlot);

		ParkingSlot bikeSlot = createBikeParkingSlot(carParkingSelector);
		parkingLot.addParkingSlot("BIKE", bikeSlot);

		ParkingSlot cycleSlot = createCycleParkingSlot(carParkingSelector);
		parkingLot.addParkingSlot("CYCLE", cycleSlot);

		parkingLot.printParkingLot();

		
		ParkingThread parking = new ParkingThread(parkingLotManager);
		Thread th1 = new Thread(parking);
		th1.start();
				
		Thread th2 = new Thread(parking);
		th2.start();		
	}

	private static ParkingLot createVechileParkingLot(String name) {
		ParkingLot parkingLot = new VechicleParkingLot();
		parkingLot.name = name;
		return parkingLot;
	}

	private static ParkingSlot createCarParkingSlot(ParkingLotSelector parkingSelector) {
		ParkingSlot carSlot = new CarSlot(parkingSelector);
		return carSlot;
	}

	private static ParkingSlot createBikeParkingSlot(ParkingLotSelector parkingSelector) {
		ParkingSlot bikeSlot = new BikeSlot(parkingSelector);
		return bikeSlot;
	}

	private static ParkingSlot createCycleParkingSlot(ParkingLotSelector parkingSelector) {
		ParkingSlot cycleSlot = new CycleSlot(parkingSelector);
		return cycleSlot;
	}
}

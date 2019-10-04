package com.bokaromart.flipkart;

import com.bokaromart.flipkart.parkinglot.ParkingLotManager;

public class ParkingThread implements Runnable{
	ParkingLotManager parkingLotManager = null;
	
	public ParkingThread(ParkingLotManager parkingLotManager)
	{
		this.parkingLotManager = parkingLotManager;
	}
	
	@Override
	public void run() {
		// Getting Parking
		System.out.println("=============== CAR PARKING ================================================");
		System.out.println("============================================================================");		
		System.out.println(parkingLotManager.getParkingLot("VEHICLE").getParkingSlot("CAR").getParking());

		System.out.println("=============== BIKE PARKING ================================================");
		System.out.println("=============================================================================");
		System.out.println(parkingLotManager.getParkingLot("VEHICLE").getParkingSlot("BIKE").getParking());

		System.out.println("=============== CYCLE PARKING ================================================");
		System.out.println("==============================================================================");
		System.out.println(parkingLotManager.getParkingLot("VEHICLE").getParkingSlot("CYCLE").getParking());	
	}

}

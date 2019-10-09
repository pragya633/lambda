package com.cg.bus.model;

public class Bus {
	private int seatCount;
	private int lastReservedSeat;
	
	public Bus(int seatCount) {
		super();
		this.seatCount = seatCount;
	}

	public int getSeatCount() {
		return seatCount;
	}

	public void setSeatCount(int seatCount) {
		this.seatCount = seatCount;
	}

	public int getLastReservedSeat() {
		return lastReservedSeat;
	}

	public void setLastReservedSeat(int lastReservedSeat) {
		this.lastReservedSeat = lastReservedSeat;
	}
	

}

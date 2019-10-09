package com.cg.bus.service;

import java.util.ArrayList;
import java.util.List;

import com.cg.bus.model.Bus;

public class ReservationService implements Runnable {
	private Bus bus;
	private List<Integer> seatsAlotted;
	private int requiredSeats;
	

	public ReservationService(Bus bus, int requiredSeats) {
		super();
		this.bus = bus;
		this.requiredSeats = requiredSeats;
	}

    private synchronized void reserve(){
    	seatsAlotted=new ArrayList<>();
    	for(int i=1;i<=requiredSeats;i++){
    		if (bus.getLastReservedSeat()==bus.getSeatCount()){
    			break;
    		}
    		else{
    			int seat=bus.getLastReservedSeat()+1;
    			bus.setLastReservedSeat(seat);
    			seatsAlotted.add(seat);
    		}
    	}
    	
    }
    
    
	@Override
	public void run() {
		if(bus.getSeatCount()-bus.getLastReservedSeat()>=requiredSeats){
			reserve();
			Thread t=Thread.currentThread();
			System.out.println(t.getName()+":"+seatsAlotted);
		}
		else
		{
			System.out.println("Not enough seats");
			
		}
		
			//Thread.sleep(1000);
		
	}
	

}

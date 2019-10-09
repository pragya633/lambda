package com.cg.bus.ui;

import com.cg.bus.model.Bus;
import com.cg.bus.service.ReservationService;

public class BusUi {
	public static void main(String[] args) {
		Bus bus=new Bus(25);
		ReservationService rs1=new ReservationService(bus,10);
		ReservationService rs2=new ReservationService(bus,20);
		ReservationService rs3=new ReservationService(bus,30);
		Thread t1=new Thread(rs1);
		Thread t2=new Thread(rs2);
		Thread t3=new Thread(rs3);
         t1.setName("Komal");
         t2.setName("Mohit");
         t3.setName("Priyanka");
         t1.start();
         t2.start();
         t3.start();

         


		
	}

}

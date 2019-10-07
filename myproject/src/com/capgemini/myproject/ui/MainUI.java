package com.capgemini.myproject.ui;

import java.util.Scanner;

import com.capgemini.myproject.service.ServiceClass;

public class MainUI {
	public static void main(String args[])
	{
		
		Scanner scan =new Scanner(System.in);
		double ser[];
		int n=0;
		System.out.println("enter the number");
		n=scan.nextInt();
		ServiceClass obj=new ServiceClass();
		boolean result=obj.checkInput(n);
		while(result)
		{
			System.out.println("INVALID");
	    	System.out.println("Re-enter the number");
	    	n=scan.nextInt();
	    	result=obj.checkInput(n);
	    	continue;
		}
	    ser=obj.generateFibonacci(n);
	    obj.checkArmstrong(ser);
	    obj.printResult();
	    scan.close();
	}

}



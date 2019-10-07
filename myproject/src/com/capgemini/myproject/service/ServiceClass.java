package com.capgemini.myproject.service;
import java.util.Scanner;

public class ServiceClass {
	Scanner scan=new Scanner(System.in);
	int[] arr1=new int[5];
	public boolean checkInput(int n){
			boolean result=false;
			if(n>30 || n<0)
				result=true;
			return(result);
		}
	
	
		public double[] generateFibonacci(int n){
			
			double[] arr=new double[n];
			arr[0]=0;
			arr[1]=1;
			for(int i=2;i<n;i++)
			{
				arr[i]=arr[i-1]+arr[i-2];
			}
			return(arr);
		}
		
	
		 public void checkArmstrong(double arr[])
		 {
			
			int c=0,a;
			int len=10,digits=0;
			double m;
			if(arr.length<10)
				len=arr.length;
			
			for(int i=5;i<len;i++)
			{
				arr[i]=arr[i]*arr[i]*arr[i];
				m=arr[i];
				while(m!=0)
				{
					digits++;
					m=m/10;
				}
				m=arr[i];
				while(m!=0)
				{
					a=(int)m%10;
					
					c=c+ (int)Math.pow(a,digits);
					m=m/10;
				}
				if(m==c)
					arr1[i-5]=1;
				else
					arr1[i-5]=0;
					
			}
			for(int i=len;i<10;i++)
				arr1[i-5]=-1;
	 }
		 
		 public void printResult()
		 {
			 for(int i=0;i<5;i++)
			 System.out.println(arr1[i]);
		 }
		 
		 

}


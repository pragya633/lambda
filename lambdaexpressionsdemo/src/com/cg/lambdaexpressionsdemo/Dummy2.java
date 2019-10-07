package com.cg.lambdaexpressionsdemo;

public class Dummy2 {
	public static void main(String[] args) {
		Dummy d=new Dummy() {
			
			@Override
			public int doProcess(int num) {
					return num*5;
			}
		};

		
		System.out.println(d.doProcess(10));
		
		Dummy d1=(num)->num*num; //lambda expression(only for interface with one method)
		System.out.println(d1.doProcess(10));
		
		Dummy d2=(num)->{
			  int fact=1;
			  for(int i=2;i<=num;i++)
				  fact*=i;
			  return fact;
			};
			
			System.out.println(d2.doProcess(5));

		}
	}



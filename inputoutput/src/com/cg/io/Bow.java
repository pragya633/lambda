package com.cg.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Bow {
	public static void main(String[] args) throws IOException {
		String str="hjdfhjcvnmnv\n"
				+ "jhjnnm,m.,.m\n"
				+ "jklmjkkjklj";
		FileWriter file=new FileWriter("C://Users//PRAGOYAL//Desktop//pragya.txt");
		file.write(str);
		file.close();
		FileReader reader=new FileReader("C://Users//PRAGOYAL//Desktop//pragya.txt");
		int ch;
		while((ch=reader.read())!=-1)
				{
			     System.out.print((char)ch);
				}
				
	
		
		
		
		
	}

}

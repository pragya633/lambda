package com.cg.io;


import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Bow3 {
	public static void main(String[] args) throws IOException {
		FileInputStream file=new FileInputStream("C://Users//PRAGOYAL//Desktop//pragya.txt");
		BufferedInputStream inputStream=new BufferedInputStream(file);
		int ch;
		while((ch=inputStream.read())!=-1){
		System.out.print((char)ch);
		}
	}

}

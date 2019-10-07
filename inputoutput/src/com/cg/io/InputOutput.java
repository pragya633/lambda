package com.cg.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class InputOutput {
	public static void main(String[] args) throws IOException {
		File file=new File("C://Users//PRAGOYAL//Desktop//abc.txt");
		FileInputStream inputStream=new FileInputStream(file);
		
		/*while((ch=inputStream.read())!=-1){
		System.out.print((char)ch);
		}*/
		StringBuffer sb=new StringBuffer();
	      int ch ;
	      while((ch=inputStream.read())!=-1){
			System.out.println(sb.append((char)ch));
	      }
		inputStream.close();
		sb.reverse();
		File file1=new File("C://Users//PRAGOYAL//Desktop//abc1.txt");
		FileOutputStream outputStream=new FileOutputStream(file1);
		outputStream.write(sb.toString().getBytes());
		outputStream.close();
		
		
		
		   
		
	}

}

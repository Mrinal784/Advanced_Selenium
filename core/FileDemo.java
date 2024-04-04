package com.core;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileDemo {
	
	public static void main(String[] args) throws IOException {
		FileOutputStream fos=new FileOutputStream("tops1.txt");
		String s="This is file output/input demo using java";
		byte b[]=s.getBytes();
		fos.write(b);
		fos.flush();
		fos.close();
		System.out.println("File written Successfully");
		FileInputStream fis= new FileInputStream("tops1.txt");
		int i;
		while((i=fis.read())!=-1)
		{
			System.out.print((char)i);
		}
		fis.close();
	}

}

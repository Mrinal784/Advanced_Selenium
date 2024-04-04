package com.core;

import java.util.Scanner;

public class ThrowDemo {
	static void demo() throws ArithmeticException,ArrayIndexOutOfBoundsException
	{
		int x;
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter x : ");
		x=sc.nextInt();
		if(x>0)
		{
			System.out.println("Square of "+x+" is "+(x*x));
		}
		else
		{
			throw new ArithmeticException("Please Enter Positive Value Only");
		}

	}


	public static void main(String[] args) {
		try {
			
			demo();

		}catch(Exception e)
		{
			System.out.println(e);
			demo();
		}
		finally {
			System.out.println("Finally Called");
		}
	}

}



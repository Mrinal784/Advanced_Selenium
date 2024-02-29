package com.core;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDemo {
public static void main(String[] args) {
	{
		System.out.println("Start Code");
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		try {
			System.out.println("Enter A : ");
			a=sc.nextInt();
			System.out.println("Enter B : ");
			b=sc.nextInt();
			c=a/b;
			System.out.println("Division : "+c);
			int arr[]= {1,2,3,4,5};
			System.out.println("Enter Index Number :");
			int index =sc.nextInt();
			System.out.println("Data Fetched : "+arr[index]);
		}catch(ArithmeticException e)
		{
			System.out.println("Exception Caught : " +e);
		}catch(InputMismatchException e)
		{
			System.out.println("Exception Caught : " +e);
		}catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Exception Caught : " +e);
		}
		System.out.println("End Code");
	}
}
}

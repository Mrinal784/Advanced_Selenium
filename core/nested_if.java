package com.core;

import java.util.Scanner;

public class nested_if {
	
	public static void main(String[] args) {
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Value of A = ");
		a=sc.nextInt();
		System.out.println("Enter Value of B = ");
		b=sc.nextInt();
		System.out.println("Enter Value of C = ");
		c=sc.nextInt();
		if(a>b)
		{
			if(a>c)
			{
				System.out.println("A is Greater");
			}
			else
			{
				System.out.println("C is Greater");
			}
		}
		else
		{
			if(b>c)
			{
				System.out.println("B is Greater");
			}
			else
			{
				System.out.println("C is greater");
			}
		}
		
	}

}

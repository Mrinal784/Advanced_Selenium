package com.core;

import java.util.Scanner;

public class if_else_condition {
	
	public static void main(String[] args) {
		int a,b;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter A : ");
		a=sc.nextInt();
		System.out.println("Enter B : ");
		b=sc.nextInt();
		if(a>b)
		{
			System.out.println("A is greater than B");
		}
		else
			
		{
			System.out.println("B is greater than A");
		}
	}

}

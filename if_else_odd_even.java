package com.core;

import java.util.Scanner;

public class if_else_odd_even {
	public static void main(String[] args) {
		int a,b;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter A : ");
		a=sc.nextInt();
		if(a%2==0)
		{
			System.out.println("A is Even Number");
		}
		else
		{
			System.out.println("A is Odd Number");
		}
	}

}

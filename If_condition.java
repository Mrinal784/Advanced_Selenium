package com.core;

import java.util.Scanner;

public class If_condition {
	
	public static void main(String[] args) {
		int a;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter A: ");
		a=sc.nextInt();
		if(a>0)
		{
			System.out.println("A is positive Number");
		}
		else
		{
			System.out.println("A is Negative Number");
		}
		
		}
	}



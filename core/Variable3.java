package com.core;

import java.util.Scanner;

public class Variable3 {
	public static void main(String[] args) {
		
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter value A = ");
		a=sc.nextInt();
		System.out.print("Enter value B = ");
		b=sc.nextInt();
		c=a+b;
		System.out.print("A + B = "+ c);
	}

}

package com.core;

import java.util.Scanner;

public class Variable5 {
	public static void main(String[] args) {
		
		double a,b,c;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter of A = ");
		a=sc.nextDouble();
		System.out.print("Enter of B = ");
		b=sc.nextDouble();
		c= a+b;
		
		System.out.println("Addition = "+c);
		c=a-b;
		System.out.println("subtraction = " + c);
		c=a*b;
		System.out.println("Multiplication = "+ c);
		c=a/b;
		System.out.println("Division = "+ c);
		
		
		
		
	}

}

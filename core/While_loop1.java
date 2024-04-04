package com.core;

import java.util.Scanner;

public class While_loop1 {
	public static void main(String[] args) {
		int n, sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter N : ");
		n=sc.nextInt();
		while(n>0)
		{
			sum=sum+n;
			n--;
		}
		System.out.println("Total = " + sum);
	}

}

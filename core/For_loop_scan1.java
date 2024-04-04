package com.core;

import java.util.Scanner;

public class For_loop_scan1 {
	public static void main(String[] args) {
		int i,n,sum=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter N = ");
		n=sc.nextInt();
		for(i=1;i<=n;i++)
		{
			sum=sum*i;
		}
		System.out.println("Sum : "+sum);
	}

}

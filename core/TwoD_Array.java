package com.core;

import java.util.Scanner;

public class TwoD_Array {
	
	public static void main(String[] args) {
		int a[][]=new int[3][3];
		int i,j;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 2 D array");
		for(i=0;i<a.length;i++)
		{
			for(j=0;j<a.length;j++)
			{
				System.out.print("enter "+i+" Row & " +j+" column : ");
				a[i][j]=sc.nextInt();
			}
		}
			for(i=0;i<a.length;i++)
			{
				for(j=0;j<a.length;j++)
				{
					System.out.println("A["+i+"]["+j+"] = "+ a[i][j] );
					
					
				}
			}
		
	}

}

package com.core;

import java.util.Scanner;

public class Ladder_If {
	public static void main(String[] args) {
		int rno,s1,s2,s3,total;
		double per;
		String sname;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Student Name : ");
		sname=sc.next();
		System.out.println("Enter Roll No : ");
		rno=sc.nextInt();
		System.out.println("Enter Mark of Subject 1 : ");
		s1=sc.nextInt();
		System.out.println("Enter Mark of Subject 2 : ");
		s2=sc.nextInt();
		System.out.println("Enter Mark of Subject 3 : ");
		s3=sc.nextInt();
		
		total=s1+s2+s3;
		per=total/3;
		
		System.out.println("Student Name : "+sname);
		System.out.println("Roll No : "+rno);
		System.out.println("Total : "+total);
		System.out.println("per : "+per);
		
		if(per>=70)
		{
			
			System.out.println("Destiction");
		}
		else if(per>=60)
		{
		    System.out.println("First class");	
		}
		else if(per>=50)
		{
			System.out.println("Second Class");
			
		}
		else if(per>=40)
		{
			System.out.println("Third Class");
		}
		else
		{
			System.out.println("fail");
		}
	}

}

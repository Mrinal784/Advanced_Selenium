package com.core;

class square
{
	double width, height;
	square()
	{
		width=4;
		height=5;
		System.out.println("square One");
	}
	square(double h,double w)
	{
		height=h;
		width=w;
		System.out.println("square Two");
	}
	square(square s)
	{
		width=s.width;
		height=s.height;
		
		System.out.println("square Three");
	}

	void Angle()
	{
		System.out.println("All Square Area = "+(2*width*height));
	}

}

public class Constructor_square {
	public static void main(String[] args) {
		
		
		square s1=new square();
		s1.Angle();
		square s2=new square(2,4);
		s2.Angle();
		square s3=new square(s1);
		s3.Angle();
	}

}

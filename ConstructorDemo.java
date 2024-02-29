package com.core;


class Box
{
	double width, height, depth;
	Box()
	{
		System.out.println("Default Constuctor");
		width=4;
		height=5;
		depth=6;
		
	}
	Box(double w, double h, double d)
	{
		System.out.println("Parameterised constructor");
		width=w;
		height=h;
		depth=d;
	}
	Box(Box b1)
	{
		System.out.println("Copy Constructor");
		width=b1.width;
		height=b1.height;
		depth=b1.depth;
		
	}
	void volume()
	{
		System.out.println("Volume : "+ (width*height*depth));
	}
	
}
public class ConstructorDemo {

	public static void main(String[] args) {
		Box b1=new Box();
		b1.volume();
		Box b2=new Box(8,5,8);
		b2.volume();
		Box b3=new Box(b1);
		b3.volume();
	}
}

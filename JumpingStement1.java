package com.core;

public class JumpingStement1 {
	public static void main(String[] args) {
		int i;
		for(i=0;i<10;i++)
		{
			if(i==5 || i==7)
			{
				continue;
				
			}
			else {
				System.out.println("I : "+i);
			}
		}
		
	}

}

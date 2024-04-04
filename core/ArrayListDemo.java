package com.core;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		ArrayList a1=new ArrayList();
		a1.add(10);
		a1.add(10.10);
		a1.add("tops");
		a1.add('t');
		a1.add(true);
		a1.add(null);
		a1.add(10);
		System.out.println(a1);
		System.out.println(a1.size());
		System.out.println(a1.get(3));
		System.out.println(a1.isEmpty());
		a1.remove(4);
		System.out.println(a1);
		a1.set(2, 100);
		System.out.println(a1);
		Iterator itr=a1.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		
	}
}

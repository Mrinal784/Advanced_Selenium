package com.core;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		HashMap map=new HashMap();

		map.put(901,"Shreyansh");
		map.put(881,"Mrinal");
		map.put(501,"Megha");
		map.put(581,"Jigar");
		map.put(581,"Jay");
		System.out.println(map);
		Set set = map.entrySet();
		Iterator itr=set.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
	}
}

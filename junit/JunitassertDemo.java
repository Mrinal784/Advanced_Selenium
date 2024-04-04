package com.junit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class JunitassertDemo {

	@Test
	public void test()
	{
		String s1="Junit";
		String s2="Junit";
		assertEquals(s1, s2);
	}
	
	
	}


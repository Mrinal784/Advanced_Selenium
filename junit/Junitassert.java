package com.junit;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class Junitassert {
	
	
	
	
	@Test
		
		public void testAssert()
		
		
		{
		String string1="Junit";
		String string2="Junit";
		String string3="test";
		String string4="test";
		String string5="Null";
		
		int variable1=1;

		int variable2=2;
		
		int[] arithmeticArray1={1,2,3};
		int[] arithmeticArray2={1,2,3};
		
		
		
		assertEquals(string1, string2);
		assertSame(string3, string4);
		assertNotSame(string1,string3);
		assertNotNull(string1);
		assertNotNull(string5);
		assertNull(string5);
		assertTrue(variable1 < variable2);
		assertArrayEquals(arithmeticArray1,arithmeticArray2);
		
		}
		
	}



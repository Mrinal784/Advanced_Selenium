package com.junit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class JunitAnotation {

	
@BeforeClass
 public static void beforeClass()
 {
  System.out.println("Before Class");
  
 }
@Before
public void before()
{
 System.out.println("Before");
 
}
@Test
public void test()
{
 System.out.println("test");
 
}
@Test
@Ignore
public void test1()
{
 System.out.println("test1");
 
}
@After
public void after()
{
 System.out.println("After");
 
}
@AfterClass
public static void Afterclass()
{
 System.out.println("Afterclass");
}


}
package com.TestNgdemo;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SecondNgDemo {
	
	@BeforeTest
	public void BeforeTest()
	{
		System.out.println("BeforeTest");
	}
	@BeforeClass
	public void BeforeClass()
	{
		System.out.println("BeforeClass");
	}
	@BeforeMethod
	public void BeforeMethod()
	{
		System.out.println("BeforeMethod");
	}
	
	
	
	@Test(priority = 2)
	public void test1()
	{
		System.out.println("Test1");
	}
	@Test(priority = 1)
	public void test2()
	{
		System.out.println("Test2");
	}
	@Test(priority = 0 )
	public void test3()
	{
		System.out.println("Test3");
	}
	
	@AfterMethod
	public void AfterMethod()
	{
		System.out.println("AfterMethod");
	}
	
	@AfterTest
	public void AfterTest()
	{
		System.out.println("AfterTest");
	}

	@AfterClass
	public void AfterClass()
	{
		System.out.println("AfterClass");
	}
}

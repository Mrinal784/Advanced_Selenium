package com.junit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class jUnitTest2 {
	
	static ChromeDriver driver=null;
	
	@BeforeClass
	public static void beforeclass() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","D:\\Documents\\Desktop\\Automation tool\\chrome\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(2000);
		
	}
	@Before
	public void beforetest() 
	{
		System.out.println(driver.getCurrentUrl());
	}
	
	@Test
	public void login() throws InterruptedException
	{
	driver.findElement(By.id("user-name")).sendKeys("standard_user");
	Thread.sleep(2000);
	driver.findElement(By.id("password")).sendKeys("secret_sauce");
	Thread.sleep(2000);
	driver.findElement(By.id("login-button")).click();
	Thread.sleep(2000);
	}
	
	@Test
	public void logout() throws InterruptedException
	{
	driver.findElement(By.id("react-burger-menu-btn")).click();
	Thread.sleep(2000);
	driver.findElement(By.id("logout_sidebar_link")).click();
	Thread.sleep(2000);
	}
	@After
	
	public void Aftertest()
	{
		System.out.println(driver.getCurrentUrl());
	}
	
	@AfterClass
	public static void Afterclasstest()
	{
		driver.close();
	}
	
	
}

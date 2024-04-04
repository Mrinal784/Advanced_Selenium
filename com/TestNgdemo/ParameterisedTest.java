package com.TestNgdemo;

import java.util.concurrent.ForkJoinPool.ManagedBlocker;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class ParameterisedTest {
 
	WebDriver driver;
	@BeforeClass
	public void init() throws InterruptedException
	{
		
	System.setProperty("webdriver.chrome.driver","D:\\Documents\\Music\\chrome driver\\chromedriver.exe");
	driver=new ChromeDriver();
	Thread.sleep(3000);
	driver.manage().window().maximize();
	Thread.sleep(3000);
	driver.navigate().to("https://www.google.com/");
	Thread.sleep(3000);
	}
	@Test
	@Parameters({"author","searchkey"})
	public void test(String author, String searchkey) throws InterruptedException
	
	{
		Thread.sleep(3000);
		WebElement searchbox=driver.findElement(By.name("q"));
		Thread.sleep(3000);
		searchbox.sendKeys(searchkey);
		Thread.sleep(3000);
		driver.findElement(By.name("btnk")).click();
		Thread.sleep(3000);
		System.out.println("Welcome " +author+",your search key is "+ searchkey);
		}
	@AfterClass
	public void destroy()
	{
		driver.close();
	}


}
	
